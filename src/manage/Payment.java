package manage;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Payment extends javax.swing.JInternalFrame {
    
    Database_Class db;
    Vector<String> colhead;
    String sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id=customer.id and invoice_pos=1 ";
            
            
    
    public Payment() {
        initComponents();
        db=new Database_Class();
        set_Colhead();
        set_Table();
    }

     public void set_Colhead()
    {
        colhead=new Vector<String>();
        colhead.add("Invoice No.");
        colhead.add("Customer ID");
        colhead.add("Customer Name");
        colhead.add("Tin No.");
        colhead.add("Total Amount");
        colhead.add("Last Paid Amt");
        colhead.add("Last Due Amt");
        colhead.add("Payment status");
                 
     }   
    public void set_Table()
    {
        Vector<Vector<String>> data=new Vector<Vector<String>>();
        
        try
        {
                  if(b1.isSelected())
                    {
                      
                      db.pst1=db.con.prepareStatement(sql);
                      //db.pst1.setString(1, "due");
                      db.rs1=db.pst1.executeQuery();
                    }
                    else if(b2.isSelected())
                    {
                      //sql="select * from sale where pay_status=?"  ;  
                      db.pst1=db.con.prepareStatement(sql);
                  //  db.pst1.setString(1, "clear");
                    db.rs1=db.pst1.executeQuery();
                    }
                    else
                    {
                        db.pst1=db.con.prepareStatement(sql);
                        db.rs1=db.pst1.executeQuery();
                    }
                
                  //String sql1="select * from customer where id=?";
                  //String sql2="select * from sale_detail where invoice_id=?";
                  int id=0;
                  int total=0;
                   while(db.rs1.next())
                {
                Vector<String> row=new Vector<String>();
                row.add(String.valueOf(db.rs1.getInt("invoice_no")));                
                row.add(String.valueOf(id=db.rs1.getInt("cus_id")));
                 //db.pst2=db.con.prepareStatement(sql1);
                // db.pst2.setInt(1, id);
                // db.rs2=db.pst2.executeQuery();
                // db.rs2.next();
                 row.add(db.rs1.getString("name"));
                row.add(String.valueOf(db.rs1.getInt("tin_no")));
                 row.add(String.valueOf(db.rs1.getInt("total")));
                 
                row.add(String.valueOf(db.rs1.getInt("paid_amt")));
                total+=db.rs1.getInt("due");
                row.add(String.valueOf(db.rs1.getInt("due")));
                row.add(db.rs1.getString("pay_status"));
                data.add(row);
            }
            jTable1.setModel(new DefaultTableModel(data,colhead)
            {
                public boolean isCellEditable(int row,int col)
                {
                    return false;
                }
            });
            jTextField2.setText(String.valueOf(total))      ;
                  
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        b1 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JRadioButton();
        b3 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Update Payment");

        jPanel1.setBackground(new java.awt.Color(137, 191, 191));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(240, 168, 60));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        buttonGroup1.add(b1);
        b1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 0, 204));
        b1.setText("Due");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(b2);
        b2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b2.setForeground(new java.awt.Color(0, 0, 204));
        b2.setText("Clear");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(b3);
        b3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b3.setForeground(new java.awt.Color(0, 0, 204));
        b3.setText("All");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(b3))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(b1)
                .addGap(18, 18, 18)
                .addComponent(b2)
                .addGap(18, 18, 18)
                .addComponent(b3)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(240, 168, 60));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Search Using Customer ID");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 0, 51));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Total Due Amount");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\purchase_icon3.jpg")); // NOI18N
        jButton1.setText("Update Payment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        String s1=jTextField1.getText();
        
        if(s1.equals(""))
        {
            /*sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status,pre_date from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id= customer.id and pre_date in(select max(pre_date) from payment "
            + "group by payment.invoice_no) and payment.rowid in(select max(payment.rowid) from payment group by payment.invoice_no)";*/
            sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id=customer.id and invoice_pos=1 ";
        }
        else
        {
            try
            {
        /*sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status,pre_date from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id= customer.id and pre_date in(select max(pre_date) from payment "
            + "group by payment.invoice_no) and payment.rowid in(select max(payment.rowid) from payment group by payment.invoice_no) "
                + "and cus_id like '"+Integer.parseInt(jTextField1.getText())+"%'";*/
                sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id=customer.id and invoice_pos=1 and cus_id like '"+Integer.parseInt(jTextField1.getText())+"%'";
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"Plz Input Valid Customer Id");
                jTextField1.setText("");
            }
        }
        set_Table();
    }//GEN-LAST:event_b3ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
                    
        
    }//GEN-LAST:event_jTextField1FocusLost

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
                    
        String s1=jTextField1.getText();
        if(s1.equals(""))
        {
            /*sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status,pre_date from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id= customer.id and pre_date in(select max(pre_date) from payment "
            + "group by payment.invoice_no) and payment.rowid in(select max(payment.rowid) from payment group by payment.invoice_no) and pay_status='due'";*/
           sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id=customer.id and invoice_pos=1 and pay_status='due' ";
        }
        else
        {
            try
            {
          /*  sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status,pre_date from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id= customer.id and pre_date in(select max(pre_date) from payment "
            + "group by payment.invoice_no) and payment.rowid in(select max(payment.rowid) from payment group by payment.invoice_no) and "
                    + "pay_status='due' and cus_id like '"+Integer.parseInt(jTextField1.getText())+"%'";*/
                sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id=customer.id and invoice_pos=1 and pay_status='due' and cus_id like '"+Integer.parseInt(jTextField1.getText())+"%'";
            }
             catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"Plz Input Valid Customer Id");
                jTextField1.setText("");
            }
        }
          set_Table();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
                
        String s1=jTextField1.getText();
        if(s1.equals(""))
        {
           /* sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status,pre_date from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id= customer.id and pre_date in(select max(pre_date) from payment "
            + "group by payment.invoice_no) and payment.rowid in(select max(payment.rowid) from payment group by payment.invoice_no) and pay_status='clear'";*/
         sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id=customer.id and invoice_pos=1 and pay_status='clear'";
        }
        else
        {
            try
            {
        /*sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status,pre_date from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id= customer.id and pre_date in(select max(pre_date) from payment "
            + "group by payment.invoice_no) and payment.rowid in(select max(payment.rowid) from payment group by payment.invoice_no) and ("
                + "pay_status='clear' and cus_id like '"+Integer.parseInt(jTextField1.getText())+"')";*/
       sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id=customer.id and invoice_pos=1 and pay_status='clear' and cus_id like '"+Integer.parseInt(jTextField1.getText())+"%'";
            }
             catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"Plz Input Valid Customer Id");
                jTextField1.setText("");
            }
        }
                set_Table();
    }//GEN-LAST:event_b2ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
                
        String s1=jTextField1.getText()  ;
        if(s1.equals(""))
        {
            if(b1.isSelected()){
               /* sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status,pre_date from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id= customer.id and pre_date in(select max(pre_date) from payment "
            + "group by payment.invoice_no) and payment.rowid in(select max(payment.rowid) from payment group by payment.invoice_no) and pay_status='due'";*/
                sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id=customer.id and invoice_pos=1 and pay_status='due'";
                
            }
            else if(b2.isSelected())
            {
             /*   sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status,pre_date from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id= customer.id and pre_date in(select max(pre_date) from payment "
            + "group by payment.invoice_no) and payment.rowid in(select max(payment.rowid) from payment group by payment.invoice_no) and pay_status='clear'";*/
                sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id=customer.id and invoice_pos=1 and pay_status='clear'";
            }
            else{
            /*sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status,pre_date from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id= customer.id and pre_date in(select max(pre_date) from payment "
            + "group by payment.invoice_no) and payment.rowid in(select max(payment.rowid) from payment group by payment.invoice_no)";*/
                  sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id=customer.id and invoice_pos=1 ";
            }
            set_Table();
        }
        else
        {
            if(b1.isSelected())
            {
                try
                {
               /* sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status,pre_date from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id= customer.id and pre_date in(select max(pre_date) from payment "
            + "group by payment.invoice_no) and payment.rowid in(select max(payment.rowid) from payment group by payment.invoice_no) and ("
                        + "pay_status='due' and cus_id like '"+Integer.parseInt(jTextField1.getText())+"%')";*/
                sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id=customer.id and invoice_pos=1 and pay_status='due' and payment.cus_id like '"+Integer.parseInt(jTextField1.getText())+"%'";
                }
                 catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"Plz Input Valid Customer Id");
                jTextField1.setText("");
            }
          }
            else if(b2.isSelected())
            {
                try{
                /*sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status,pre_date from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id= customer.id and pre_date in(select max(pre_date) from payment "
            + "group by payment.invoice_no) and payment.rowid in(select max(payment.rowid) from payment group by payment.invoice_no) and ("
                        + "pay_status='clear' and cus_id  like '"+Integer.parseInt(jTextField1.getText())+"%')";*/
    sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id=customer.id and invoice_pos=1 and pay_status='clear' and payment.cus_id like '"+Integer.parseInt(jTextField1.getText())+"%'";
                }
                 catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"Plz Input Valid Customer Id");
                jTextField1.setText("");
            }
            }
            else
            {
                try{
              /*  sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status,pre_date from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id= customer.id and pre_date in(select max(pre_date) from payment "
            + "group by payment.invoice_no) and payment.rowid in(select max(payment.rowid) from payment group by payment.invoice_no) and cus_id like '"+Integer.parseInt(jTextField1.getText())+"%'";*/
            sql="select payment.invoice_no ,payment.cus_id ,name,tin_no,total,paid_amt,due,pay_status from payment,sale,customer "
            + "where payment.invoice_no=sale.invoice_no and sale.cus_id=customer.id and invoice_pos=1 and payment.cus_id like '"+Integer.parseInt(jTextField1.getText())+"%'";
                }     
                catch(Exception e)
                {JOptionPane.showMessageDialog(this, "plz Inputr Valid Customer Id");jTextField1.setText("");}
                
            }
            set_Table();
        }                                    
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        try
        {
        if(jTable1.isFocusable())
        {
            int r=jTable1.getSelectedRow();
            int s1=Integer.parseInt(jTable1.getValueAt(r,0).toString());
            int s2=Integer.parseInt(jTable1.getValueAt(r,1).toString());
        
            Update_Payment up=new Update_Payment(s1,s2);
            getParent().add(up);
            up.show();
            
            this.dispose();
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"First Select any table Row ");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b2;
    private javax.swing.JRadioButton b3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
