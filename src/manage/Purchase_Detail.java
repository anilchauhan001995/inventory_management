
package manage;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Purchase_Detail extends javax.swing.JInternalFrame {

    Database_Class db;
    Vector<String> colhead;
    public Purchase_Detail() {
        initComponents();
        db=new Database_Class();
        colhead=new Vector<String>();
        colhead.add("Invoice No");
        colhead.add("Dated");
        colhead.add("Vendor Id");
        colhead.add("Vendor Name");
        colhead.add("Address");
        colhead.add("Mobile No.");
        colhead.add("Email ID");
        set_Table();
        set_Mode();
    }

    
    public void set_Table()
    {
        String sql="select * from purchase_detail";
        Vector<Vector<String>> data=new Vector<Vector<String>>();
        try
        {
            db.pst1=db.con.prepareStatement(sql);
            db.rs1=db.pst1.executeQuery();
            while(db.rs1.next())
            {
                Vector<String> row=new Vector<String>();
                row.add(String.valueOf(db.rs1.getInt("invoice_no")));
                row.add(String.valueOf(db.rs1.getDate("dated")));
                row.add(String.valueOf(db.rs1.getInt("ven_id")));
                row.add(String.valueOf(db.rs1.getString("ven_name")));
                row.add(String.valueOf(db.rs1.getString("address")));
                row.add(String.valueOf(db.rs1.getString("mobile_no")));
                row.add(String.valueOf(db.rs1.getString("email_id")));
                data.add(row);
            }
            jTable1.setModel(new DefaultTableModel(data,colhead)
            {
                public boolean isCellEditable(int row,int col)
                {
                    return false;
                }
            });
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
        jPanel2 = new javax.swing.JPanel();
        b1 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Purchase Detail");

        jPanel1.setBackground(new java.awt.Color(139, 180, 180));

        jPanel2.setBackground(new java.awt.Color(215, 68, 35));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup1.add(b1);
        b1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b1.setText("Search By Invoice No.");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(b2);
        b2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b2.setText("Search By Vendor ID");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Search ");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153)
                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(255, 255, 204));
        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
        public void set_Mode()
    {
        
        if(b1.isSelected()||b2.isSelected())
        {
            jTextField1.setText("");
            jTextField1.setEnabled(true);
        }
        else
        {
            jTextField1.setText("");
            jTextField1.setEnabled(false);
        }
    }

    
    
    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
            
            if(jTextField1.getText().equals(""))
        {
            set_Table();
        }
        else
        {
            Vector<Vector<String>> data=new Vector<Vector<String>>();
            String sql="";
            if(b1.isSelected())
            {
                int i=Integer.parseInt(jTextField1.getText());
             sql="select * from purchase_detail where invoice_no like '"+i+"%'";
               }
            else if(b2.isSelected())
            {
                int n=Integer.parseInt(jTextField1.getText());
                sql="select * from purchase_detail where ven_id like '"+n+"%'";
            }
            
            try{
            db.pst1=db.con.prepareStatement(sql);
            db.rs1=db.pst1.executeQuery();
            while(db.rs1.next())
            {
                    Vector<String> row=new Vector<String>();
                row.add(String.valueOf(db.rs1.getInt("invoice_no")));
                row.add(String.valueOf(db.rs1.getDate("dated")));
                row.add(String.valueOf(db.rs1.getInt("ven_id")));
                row.add(String.valueOf(db.rs1.getString("ven_name")));
                row.add(String.valueOf(db.rs1.getString("address")));
                row.add(String.valueOf(db.rs1.getString("mobile_no")));
                row.add(String.valueOf(db.rs1.getString("email_id")));
                data.add(row);
            }
            jTable1.setModel(new DefaultTableModel(data, colhead));
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            
        }
        
    
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        jTextField1.setEnabled(true);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
            jTextField1.setEnabled(true);
    }//GEN-LAST:event_b2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            
        if(evt.getClickCount()==2)
        {
        int row=jTable1.getSelectedRow();
        new Search_Product_Detail(Integer.parseInt(jTable1.getValueAt(row, 0).toString())).setVisible(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
