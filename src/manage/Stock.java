
package manage;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Stock extends javax.swing.JInternalFrame {

Database_Class db;
Vector<String> colhead;
    public Stock() {
        initComponents();
        db=new Database_Class();
        set_Colhead();
        set_Table();
     
    }

    public void set_Colhead()
    {
        colhead=new Vector<String>();
        colhead.add("sku_no");
        colhead.add("Product Name");
        colhead.add("Product Brand");
        colhead.add("Mrp rate");
        colhead.add("Vat ");
        colhead.add("Available Quantity");    
    }
    
        public void set_Table()
            {
                Vector<Vector<String>> data=new Vector<Vector<String>>();
                String sql="select * from product";
                try
                {
                    db.pst1=db.con.prepareStatement(sql);
                    db.rs1=db.pst1.executeQuery();
                    while(db.rs1.next())
                    {
                        Vector<String> row=new Vector<String>();
                        row.add(String.valueOf(db.rs1.getInt("sku_id")));
                        row.add(db.rs1.getString("pro_name"));
                        row.add(db.rs1.getString("pro_brand"));
                        row.add(String.valueOf(db.rs1.getInt("mrp")));
                        row.add(String.valueOf(db.rs1.getInt("vat")));
                        row.add(String.valueOf(db.rs1.getInt("quantity")));
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
                    
                }
            }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Product Stock");
        setNormalBounds(new java.awt.Rectangle(150, 150, 57, 0));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
