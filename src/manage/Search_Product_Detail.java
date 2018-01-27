
package manage;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Search_Product_Detail extends javax.swing.JFrame {

    Database_Class db;
  
int invoice_no;    
    public Search_Product_Detail(int invoice_no) {
        initComponents();
        this.invoice_no=invoice_no;
        db=new Database_Class();
        set_Table();
        
    }

  
    public void set_Table()
    {
        Vector<Vector<String>> data=new Vector<Vector<String>>();
        Vector<String> colhead=new Vector<String>();
        colhead.add("Invoice No");
        colhead.add("Sku_no");
        colhead.add("Product Name");
        colhead.add("Product Brand");
        colhead.add("Rate");
        colhead.add("Purchase Quantity");
        colhead.add("Value");
        colhead.add("Vat");
        colhead.add("Vat Amount");
        colhead.add("Nett. Amount");
        String sql="select * from purchase_product_detail where invoice_no=?";
        try
        {
            db.pst1=db.con.prepareStatement(sql);
            db.pst1.setInt(1, invoice_no);
            db.rs1=db.pst1.executeQuery();
            while(db.rs1.next())
            {
                Vector<String> row=new Vector<String>();
                row.add(String.valueOf(db.rs1.getInt("invoice_no")));
                row.add(String.valueOf(db.rs1.getInt("sku_id")));
                row.add(db.rs1.getString("pro_name"));
                row.add(db.rs1.getString("pro_brand"));
                row.add(String.valueOf(db.rs1.getString("rate")));
                row.add(String.valueOf(db.rs1.getString("pro_quantity")));
                row.add(String.valueOf(db.rs1.getString("value")));
                row.add(String.valueOf(db.rs1.getString("vat")));
                row.add(String.valueOf(db.rs1.getInt("vat_amount")));
                row.add(String.valueOf(db.rs1.getInt("net_amount")));
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search Product Detail");
        setBounds(new java.awt.Rectangle(100, 200, 0, 0));

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setGridColor(new java.awt.Color(204, 255, 255));
        jTable1.setIntercellSpacing(new java.awt.Dimension(1, 2));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 104, Short.MAX_VALUE))
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

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
