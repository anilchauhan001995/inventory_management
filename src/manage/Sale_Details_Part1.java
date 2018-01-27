package manage;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Sale_Details_Part1 extends javax.swing.JInternalFrame {

    Vector<String> colhead;
    Database_Class db;
    int invoice;
    public Sale_Details_Part1(int invoice) {
        initComponents();
        colhead=new Vector<String>();
        this.invoice=invoice;
        db=new Database_Class();
        set_Colhead();
        set_Table();
    }

    
    public void set_Colhead()
    {
        colhead.add("Invoice no");
        colhead.add("Sku no");
        colhead.add("Product name");
        colhead.add("Product Brand");
        colhead.add("mrp");
        colhead.add("Sale rate");
        colhead.add("quantity");
        colhead.add("Value");
        colhead.add("Vat");
        colhead.add("Vat Amount");
        colhead.add("Nett. Amount");
    }
    
    
    public void set_Table()
    {
        Vector<Vector<String>> data=new Vector<Vector<String>>();
        String sql="select sale.invoice_no,sale_detail.sku_id,product.pro_name,pro_brand,product.mrp,sale_detail.sale_rate,"
                                                     + "sale_detail.qty,product.vat,sale_detail.vat_rs,sale_detail.total from sale,sale_detail,product "
                                                    + "where sale_detail.invoice_no=?  and sale_detail.invoice_no=sale.invoice_no and product.sku_id=sale_detail.sku_id";
        try
        {
            db.pst1=db.con.prepareStatement(sql);
            db.pst1.setInt(1, invoice);
            db.rs1=db.pst1.executeQuery();
            int actual,sale=0,q=0;
            while(db.rs1.next())
            {
                Vector<String> row=new Vector<String>();
                row.add(String.valueOf(db.rs1.getInt("invoice_no")));
                row.add(String.valueOf(db.rs1.getInt("sku_id")));
                row.add(db.rs1.getString("pro_name"));
                row.add(db.rs1.getString("pro_brand"));
                row.add(String.valueOf(actual=db.rs1.getInt("mrp")));
                row.add(String.valueOf(sale=db.rs1.getInt("sale_rate")));
                row.add(String.valueOf(q=db.rs1.getInt("qty")));
                row.add(String.valueOf(sale*q));
                row.add(String.valueOf(db.rs1.getInt("vat")));
                row.add(String.valueOf(db.rs1.getInt("vat_rs")));
                row.add(String.valueOf(db.rs1.getInt("total")));
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1164, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
