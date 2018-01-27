
package manage;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Customer extends javax.swing.JInternalFrame {

    Database_Class db;
    public Customer() {
        initComponents();
        db=new Database_Class();
        load_customer_id();
        setTable();
      Enabled_Feature();
    }
    
    
    public void setTable()
    {
                String sql="select * from customer";
        
        Vector<String> colhead=new Vector<String>();
        colhead.add("Cust_Id");
        colhead.add("Cust_Name");
        colhead.add("Cust_tin");
        colhead.add("Addres");
        colhead.add("State");
        colhead.add("City");
        colhead.add("Mobile no");
        colhead.add("Email id"); 
        try{
                        db.pst1=db.con.prepareStatement(sql);
                        db.rs1=db.pst1.executeQuery();
                        Vector<Vector<String>> data=new Vector<Vector<String>>();
                        
                    while(db.rs1.next())
                    {
                        Vector<String> row=new Vector<String>();
                        row.add(String.valueOf(db.rs1.getInt("id")));
                        row.add(db.rs1.getString("name"));
                        row.add(db.rs1.getString("tin_no"));
                        row.add(db.rs1.getString("address"));
                        row.add(db.rs1.getString("state"));
                        row.add(db.rs1.getString("city"));
                        row.add(db.rs1.getString("mobile_no"));
                        row.add(db.rs1.getString("email_id"));
                        data.add(row);
                    }
                    jTable1.setModel(new DefaultTableModel(data,colhead)
                    {
                        public boolean isCellEdiatable(int row,int col)
                        {
                            return false;
                        }
                    });
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    
    
    
       public void Enabled_Feature()
    {
             jTextField1.setEnabled(false);
             save.setEnabled(false);
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        refresh = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        save = new javax.swing.JButton();

        setClosable(true);
        setTitle("Customer");

        jPanel1.setBackground(new java.awt.Color(163, 206, 206));

        jPanel2.setBackground(new java.awt.Color(240, 168, 60));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setText("Customer ID");

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        jLabel2.setText("Custmer Name");

        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField2MousePressed(evt);
            }
        });

        jLabel3.setText("Customer Tin No");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Adrress");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel5.setText("State");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---select--", "Andhra Pradessh", "Arunachal Pradesh", "Assam", "Bihar", "Chattishgarh", "delhi", "goa", "gujrat", "haryana", "himachal pradesh", "Jammu kashmir", "jharkhand", "karnatka", "kerala", "madhya pradesh", "maharashtra", "manipur", "meghalay", "mizoram", "nagaland", "Orrissa", "punjab", "rajasthan", "Sikkim", "Tamil nadu", "Tripura", "Uttar Pradesh", "Uttranchal", "West Bengal" }));

        jLabel6.setText("City");

        jLabel7.setText("Mobile No.");

        jLabel8.setText("Email ID");

        refresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        refresh.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\refresh.png")); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField6)
                                        .addComponent(jTextField5)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(29, 29, 29))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refresh, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        add.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        add.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\edit2.jpg")); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\edit.jpg")); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\delete.PNG")); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        save.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\save.PNG")); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(save, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 106, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
                    
                String sql="select max(id) as max_id from customer";
        try
        {
            db.pst1=db.con.prepareStatement(sql);
            db.rs1=db.pst1.executeQuery();
            db.rs1.next();
            int max=db.rs1.getInt("max_id");
            jTextField1.setText(String.valueOf(max+1));
            jTextField1.setEditable(false);
        }
        catch(Exception e)
        {
            
        }
        
        
        jComboBox2.setEnabled(false);
        jTextField1.setEnabled(true);
        save.setEnabled(true);
        update.setEnabled(false);
        delete.setEnabled(false);

       
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
                String sql="delete from customer where id=?";
        try
        {
            db.pst1=db.con.prepareStatement(sql);
            db.pst1.setInt(1,Integer.parseInt(jComboBox2.getSelectedItem().toString()));
            db.pst1.executeQuery();
            JOptionPane.showMessageDialog(this, "Delete succesfully Record");
            set_Initial();
            setTable();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
            
        String sql="update customer set id=?,name=?,tin_no=?,address=?,state=?,city=?,mobile_no=?,email_id=? where id=?";
        try
        { 
        db.pst1=db.con.prepareStatement(sql);
        db.pst1.setInt(1,Integer.parseInt( jComboBox2.getSelectedItem().toString()));
        db.pst1.setString(2, jTextField2.getText());
        db.pst1.setString(3, jTextField3.getText());
        db.pst1.setString(4, jTextField4.getText());
        db.pst1.setString(5,jComboBox1.getSelectedItem().toString());
        db.pst1.setString(6, jTextField5.getText());
        db.pst1.setString(7, jTextField6.getText());
        db.pst1.setString(8, jTextField7.getText());
        db.pst1.setInt(9, Integer.parseInt(jComboBox2.getSelectedItem().toString()));
        db.pst1.executeQuery();
        setTable();
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
          
    }//GEN-LAST:event_updateActionPerformed

    private void jTextField2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MousePressed

    }//GEN-LAST:event_jTextField2MousePressed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
            
          set_Initial();
    }//GEN-LAST:event_refreshActionPerformed

    public void set_Initial()
    {
        jComboBox2.setSelectedIndex(0);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jComboBox1.setSelectedIndex(0);
         jTextField4.setText(null);
         jTextField5.setText(null);
         jTextField6.setText(null);
         jTextField7.setText(null);
           jComboBox2.setEnabled(true);
         jTextField1.setEnabled(false);
         add.setEnabled(true);
         
         update.setEnabled(true); 
         delete.setEnabled(true);
    }
    
    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
                    
        int row=jTable1.getSelectedRow();
         jComboBox2.setEnabled(true);
         jTextField1.setEnabled(false);
        jComboBox2.setSelectedItem(jTable1.getValueAt(row, 0).toString());
        jTextField2.setText(jTable1.getValueAt(row, 1).toString());
        jTextField3.setText(jTable1.getValueAt(row, 2).toString());
         jTextField4.setText(jTable1.getValueAt(row, 3).toString());
        jComboBox1.setSelectedItem(jTable1.getValueAt(row, 4));
       
        jTextField5.setText(jTable1.getValueAt(row, 5).toString());
        jTextField6.setText(jTable1.getValueAt(row, 6).toString());
        jTextField7.setText(jTable1.getValueAt(row, 7).toString());
        add.setEnabled(false);
        update.setEnabled(true);
        delete.setEnabled(true);
        
    }//GEN-LAST:event_jTable1MousePressed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
                
        
         
    }//GEN-LAST:event_jTextField1FocusLost

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
                  String sql="insert into customer(id,name,tin_no,address,state,city,mobile_no,email_id) values(?,?,?,?,?,?,?,?)";
        try
        {
            db.pst1=db.con.prepareStatement(sql);
            db.pst1.setInt(1, Integer.parseInt(jTextField1.getText()));
            db.pst1.setString(2, jTextField2.getText());
            db.pst1.setInt(3, Integer.parseInt(jTextField3.getText()));
            db.pst1.setString(4, jTextField4.getText());
            db.pst1.setString(5, jComboBox1.getSelectedItem().toString());
            db.pst1.setString(6, jTextField5.getText());
            db.pst1.setString(7, jTextField6.getText());
            db.pst1.setString(8, jTextField7.getText());
            db.pst1.executeQuery();
            setTable();
       }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_saveActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
                
               if(jComboBox2.getSelectedItem().toString().equals("select"))
            {
                jTextField2.setText("");
                jTextField3.setText("");
                 jTextField4.setText("");
                jComboBox1.setSelectedIndex(0);
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                
            }
            else
            fill_Fields();
     
      
    }//GEN-LAST:event_jComboBox2ActionPerformed

    
    public void load_customer_id()
    {
         String sql="select * from customer ";
      try
      {
          db.pst1=db.con.prepareStatement(sql);
          db.rs1=db.pst1.executeQuery();
          while(db.rs1.next())
          {
              jComboBox2.addItem(String.valueOf(db.rs1.getInt("id")));
            
          }
    }
    catch(Exception e)
    {
              JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }
    

    public void fill_Fields()
    {
                          String id=jComboBox2.getSelectedItem().toString();
                        int row=jTable1.getRowCount();
        
                for(int i=0;i<row;i++)
                {
                    String st=jTable1.getValueAt(i, 0).toString();
                    if(st.equals(id))
                    {
                        jTextField2.setText(jTable1.getValueAt(i, 1).toString());
                        jTextField3.setText(jTable1.getValueAt(i, 2).toString());
                        jTextField4.setText(jTable1.getValueAt(i, 3).toString());
                       jComboBox1.setSelectedItem(jTable1.getValueAt(i, 4).toString());
                       jTextField5.setText(jTable1.getValueAt(i, 5).toString());
                       jTextField6.setText(jTable1.getValueAt(i, 6).toString());
                       jTextField7.setText(jTable1.getValueAt(i, 7).toString());
                 
                        add.setEnabled(false);
                        update.setEnabled(true);
                        delete.setEnabled(true);
                        break;
                    }
                }
     
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton refresh;
    private javax.swing.JButton save;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
