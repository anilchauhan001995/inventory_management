
package manage;

import javax.swing.JOptionPane;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Vendor extends javax.swing.JInternalFrame {

    Database_Class db;
    
    public Vendor() {
        initComponents();
        db=new Database_Class();
        load_vendor_id();
        setTable();
        Enabled_Feature();
    
    }

    
    
    public void setTable()
    {
        String sql="select * from vendor";
        
        Vector<String> colhead=new Vector<String>();
        colhead.add("Ven_Id");
        colhead.add("Ven_Name");
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
                        row.add(db.rs1.getString("address"));
                        row.add(db.rs1.getString("state"));
                        row.add(db.rs1.getString("city"));
                        row.add(db.rs1.getString("mobile_no"));
                        row.add(db.rs1.getString("email_id"));
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

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        refresh = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        add_new = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        save = new javax.swing.JButton();

        setClosable(true);
        setTitle("Vendor");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel2.setBackground(new java.awt.Color(185, 209, 209));

        jPanel4.setBackground(new java.awt.Color(240, 168, 60));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setText("Vendor ID");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        jLabel2.setText("Vendor Name");

        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField2MousePressed(evt);
            }
        });

        jLabel3.setText("Address");

        jLabel4.setText("State");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---select--", "Andhra Pradessh", "Arunachal Pradesh", "Assam", "Bihar", "Chattishgarh", "delhi", "goa", "gujrat", "haryana", "himachal pradesh", "Jammu kashmir", "jharkhand", "karnatka", "kerala", "madhya pradesh", "maharashtra", "manipur", "meghalay", "mizoram", "nagaland", "Orrissa", "punjab", "rajasthan", "Sikkim", "Tamil nadu", "Tripura", "Uttar Pradesh", "Uttranchal", "West Bengal" }));

        jLabel5.setText("City");

        jLabel6.setText("Mobile No.");

        jLabel7.setText("Email ID");

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jComboBox1, 0, 195, Short.MAX_VALUE)
                    .addComponent(jTextField4)
                    .addComponent(jTextField5)
                    .addComponent(jTextField6)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refresh, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        add_new.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add_new.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\edit.jpg")); // NOI18N
        add_new.setText("Add New");
        add_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_newActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\edit2.jpg")); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\delete.PNG")); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        save.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\save.PNG")); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(add_new, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(add_new, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MousePressed
        
        
    }//GEN-LAST:event_jTextField2MousePressed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
                
        set_Initial();
         
    }//GEN-LAST:event_refreshActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
            
        String sql="delete from vendor where id=?";
        try
        {
            db.pst1=db.con.prepareStatement(sql);
            db.pst1.setInt(1,Integer.parseInt(jComboBox2.getSelectedItem().toString()));
            db.pst1.executeQuery();
            set_Initial();
            setTable();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_deleteActionPerformed

    public void set_Initial()
    {
                jComboBox2.setSelectedIndex(0);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jComboBox1.setSelectedIndex(0);
         jTextField4.setText(null);
         jTextField5.setText(null);
         jTextField6.setText(null);
         jComboBox2.setEnabled(true);
         jTextField1.setEnabled(false);
         add_new.setEnabled(true);
         
         update.setEnabled(true); 
         delete.setEnabled(true);
    }
    
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
            
        String sql="update vendor set id=?,name=?,address=?,state=?,city=?,mobile_no=?,email_id=? where id=?";
        try
        { 
        db.pst1=db.con.prepareStatement(sql);
        db.pst1.setInt(1,Integer.parseInt( jComboBox2.getSelectedItem().toString()));
        db.pst1.setString(2, jTextField2.getText());
        db.pst1.setString(3, jTextField3.getText());
        db.pst1.setString(4,jComboBox1.getSelectedItem().toString());
        db.pst1.setString(5, jTextField4.getText());
        db.pst1.setString(6, jTextField5.getText());
        db.pst1.setString(7, jTextField6.getText());
        db.pst1.setInt(8, Integer.parseInt(jComboBox2.getSelectedItem().toString()));
        db.pst1.executeQuery();
        setTable();
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_updateActionPerformed

    private void add_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_newActionPerformed
                    
        String sql="select max(id) as max_id from vendor";
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
        
                
    }//GEN-LAST:event_add_newActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
            
         int row=jTable1.getSelectedRow();
         jComboBox2.setEnabled(true);
         jTextField1.setEnabled(false);
        jComboBox2.setSelectedItem(jTable1.getValueAt(row, 0).toString());
        jTextField2.setText(jTable1.getValueAt(row, 1).toString());
        jTextField3.setText(jTable1.getValueAt(row, 2).toString());
         
        jComboBox1.setSelectedItem(jTable1.getValueAt(row, 3));
       
        jTextField4.setText(jTable1.getValueAt(row, 4).toString());
        jTextField5.setText(jTable1.getValueAt(row, 5).toString());
        jTextField6.setText(jTable1.getValueAt(row, 6).toString());
       
        add_new.setEnabled(false);
        update.setEnabled(true);
        delete.setEnabled(true);
       
    }//GEN-LAST:event_jTable1MousePressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        
        
    }//GEN-LAST:event_jTextField1FocusLost

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
                
        String sql="insert into vendor(id,name,address,state,city,mobile_no,email_id) values(?,?,?,?,?,?,?)";
        try
        {
            db.pst1=db.con.prepareStatement(sql);
            db.pst1.setInt(1, Integer.parseInt(jTextField1.getText()));
            db.pst1.setString(2, jTextField2.getText());
            db.pst1.setString(3, jTextField3.getText());
            db.pst1.setString(4, jComboBox1.getSelectedItem().toString());
            db.pst1.setString(5, jTextField4.getText());
            db.pst1.setString(6, jTextField5.getText());
            db.pst1.setString(7, jTextField6.getText());
            db.pst1.executeQuery();
            setTable();
            load_vendor_id();
            
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
                jComboBox1.setSelectedIndex(0);
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                
            }
            else
            fill_Fields();
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

  public void load_vendor_id()
  {
      String sql="select * from vendor ";
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
                        jComboBox2.setSelectedItem(jTable1.getValueAt(i, 0).toString());
                        jTextField2.setText(jTable1.getValueAt(i, 1).toString());
                        jTextField3.setText(jTable1.getValueAt(i, 2).toString());
                     
                        jComboBox1.setSelectedItem(jTable1.getValueAt(i, 3).toString());
                        jTextField4.setText(jTable1.getValueAt(i, 4).toString());
                        jTextField5.setText(jTable1.getValueAt(i, 5).toString());
                     try{
                        jTextField6.setText(jTable1.getValueAt(i, 6).toString());
                     }
                     catch(Exception e)
                     {
                         JOptionPane.showMessageDialog(this, e.getMessage());
                     }
                     jTextField1.setEnabled(false);
                        add_new.setEnabled(false);
                        update.setEnabled(true);
                        delete.setEnabled(true);
                        break;
                    }
                }
  }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_new;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton refresh;
    private javax.swing.JButton save;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
