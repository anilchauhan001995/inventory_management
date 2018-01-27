
package manage;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Search_Customer extends javax.swing.JInternalFrame {

    Database_Class db;
    Vector<String> colhead;
    public Search_Customer() {
        initComponents();
                db=new Database_Class();
        colhead=new Vector<String>();
        colhead.add("ID");
        colhead.add("Name");
        colhead.add("Tin No.");
        colhead.add("Address");
        colhead.add("state");
        colhead.add("city");
        colhead.add("Mobile No.");
        colhead.add("Email ID");
        set_Table();
        set_Mode();

    }

    
        public void set_Table()
    {
        String sql="select * from customer";
        Vector<Vector<String>> data=new Vector<Vector<String>>();
        try
        {
            db.pst1=db.con.prepareStatement(sql);
            db.rs1=db.pst1.executeQuery();
            while(db.rs1.next())
            {
                Vector<String> row=new Vector<String>();
                row.add(String.valueOf(db.rs1.getInt("id")));
                  row.add(db.rs1.getString("name"));
                row.add(String.valueOf(db.rs1.getInt("tin_no")));
                row.add(db.rs1.getString("address"));
                row.add(db.rs1.getString("state"));
                row.add(db.rs1.getString("city"));
                row.add(String.valueOf(db.rs1.getString("mobile_no")));
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
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    
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


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        b1 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Search Customer");

        jPanel2.setBackground(new java.awt.Color(242, 176, 208));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup1.add(b1);
        b1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 51, 204));
        b1.setText("Search By Customer ID");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(b2);
        b2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b2.setForeground(new java.awt.Color(0, 0, 204));
        b2.setText("Search By Customer Name");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Search");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(b1)
                .addGap(152, 152, 152)
                .addComponent(b2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(204, 255, 255));
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setForeground(new java.awt.Color(153, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
             sql="select * from customer where id like '"+i+"%'";
               }
            else if(b2.isSelected())
            {
                String n=jTextField1.getText();
                sql="select * from customer where name like '"+n+"%'";
            }
            
            try{
            db.pst1=db.con.prepareStatement(sql);
            db.rs1=db.pst1.executeQuery();
            while(db.rs1.next())
            {
                    Vector<String> row=new Vector<String>();
                 row.add(String.valueOf(db.rs1.getInt("id")));
                  row.add(db.rs1.getString("name"));
                row.add(String.valueOf(db.rs1.getInt("tin_no")));
                row.add(db.rs1.getString("address"));
                row.add(db.rs1.getString("state"));
                row.add(db.rs1.getString("city"));
                row.add(String.valueOf(db.rs1.getString("mobile_no")));
                row.add(db.rs1.getString("email_id"));
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
