
package manage;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

import javax.swing.JOptionPane;

public class Sales extends javax.swing.JFrame {

    Database_Class db;
        Vector<Vector<String>> data;
    Vector<String> colhead;
        int t_q=0;
        int t_value=0;
        int t_vat=0;
        int g_total=0;
        boolean is_paid=false;
        boolean is_table=false;
    
    public Sales() {
        initComponents();
        colhead=new Vector<String>();
        set_Table();
        start_method();
        fill_sku();
        fill_customer();
        
        
    }
    
    
    public void start_method()
    {
        db=new Database_Class();
        set_invoice();
        
        data=new Vector<Vector<String>>();
    //    set_Interface();
    }
    
    
    public void set_invoice()
    {
        String sql="select * from invoice";
        try{
            db.pst1=db.con.prepareStatement(sql);
            db.rs1=db.pst1.executeQuery();
            db.rs1.next();
            invoice_fld.setText(String.valueOf(db.rs1.getInt("invoice_no")));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }        
    }
    
    public void fill_sku()
    {
        
        String sql="select * from product";
        try{
            db.pst1=db.con.prepareStatement(sql);
            db.rs1=db.pst1.executeQuery();
            while(db.rs1.next())
            {
                sku_cmb.addItem(String.valueOf(db.rs1.getInt("sku_id")));           
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }        
    }

    
    public void fill_customer()
    {
        String sql="select * from customer";
      
          try{
            db.pst1=db.con.prepareStatement(sql);
            db.rs1=db.pst1.executeQuery();
            while(db.rs1.next())
            {
                cust_cmb.addItem(String.valueOf(db.rs1.getInt("id")));           
            }
            
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
        jLabel43 = new javax.swing.JLabel();
        invoice_fld = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pro_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pro_brand = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        actual_rate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sale_rate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ava_qty = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sale_qty = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        value = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        gross_profit = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        percent = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        vat = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        vat_rs = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        net_amount = new javax.swing.JTextField();
        sku_cmb = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        cust_cmb = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        cust_name = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cust_add = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        state_cmb = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        tin = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        mob = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        sale = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        b1 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        cash_button = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        bank_name = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        cheque_no = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        party_name = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        ch_date = new com.toedter.calendar.JDateChooser();
        paid_amount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cheque_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sale");

        jPanel1.setBackground(new java.awt.Color(151, 200, 200));

        jPanel2.setBackground(new java.awt.Color(240, 168, 60));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 0, 51));
        jLabel43.setText("Invoice No");

        invoice_fld.setEditable(false);
        invoice_fld.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        invoice_fld.setForeground(new java.awt.Color(204, 0, 0));
        invoice_fld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jDateChooser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jDateChooser1.setForeground(new java.awt.Color(255, 0, 0));
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jDateChooser1.setMinSelectableDate(new java.util.Date(1420102888000L));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addGap(29, 29, 29)
                .addComponent(invoice_fld, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel43)
                        .addComponent(invoice_fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(240, 168, 60));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Product", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Sku No.");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Product Name");

        pro_name.setEditable(false);
        pro_name.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Prodtuct Brand");

        pro_brand.setEditable(false);
        pro_brand.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Actual Product Rate");

        actual_rate.setEditable(false);
        actual_rate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        actual_rate.setForeground(new java.awt.Color(255, 0, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Sale Rate");

        sale_rate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Available Quantity");

        ava_qty.setBackground(new java.awt.Color(153, 255, 255));
        ava_qty.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ava_qty.setForeground(new java.awt.Color(0, 0, 204));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Sale Quantity");

        sale_qty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sale_qtyFocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Value");

        value.setEditable(false);
        value.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Gross Profit");

        gross_profit.setEditable(false);
        gross_profit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Percent (%)");

        percent.setEditable(false);
        percent.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Vat (%)");

        vat.setEditable(false);
        vat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        vat.setForeground(new java.awt.Color(255, 0, 51));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("VAT (Rs)");

        vat_rs.setEditable(false);
        vat_rs.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Nett. Amount");

        net_amount.setEditable(false);
        net_amount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        sku_cmb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sku_cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select" }));
        sku_cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sku_cmbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pro_name, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(pro_brand)
                            .addComponent(sku_cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(ava_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(actual_rate)
                            .addComponent(sale_rate)
                            .addComponent(sale_qty)
                            .addComponent(value)
                            .addComponent(gross_profit)
                            .addComponent(percent)
                            .addComponent(vat)
                            .addComponent(vat_rs)
                            .addComponent(net_amount))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sku_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(pro_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(pro_brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(actual_rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sale_rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ava_qty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(sale_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(gross_profit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(percent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(vat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(vat_rs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(net_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(240, 168, 60));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Add Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Customer ID");

        cust_cmb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cust_cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select" }));
        cust_cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cust_cmbActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Customer Name");

        cust_name.setEditable(false);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Customer Address");

        cust_add.setEditable(false);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("State");

        state_cmb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        state_cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---select--", "Andhra Pradessh", "Arunachal Pradesh", "Assam", "Bihar", "Chattishgarh", "delhi", "goa", "gujrat", "haryana", "himachal pradesh", "Jammu kashmir", "jharkhand", "karnatka", "kerala", "madhya pradesh", "maharashtra", "manipur", "meghalay", "mizoram", "nagaland", "Orrissa", "punjab", "rajasthan", "Sikkim", "Tamil nadu", "Tripura", "Uttar Pradesh", "Uttranchal", "West Bengal" }));
        state_cmb.setEnabled(false);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("City");

        city.setEditable(false);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Customer Tin No.");

        tin.setEditable(false);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Mobile No");

        mob.setEditable(false);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("Email Id");

        email.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cust_add)
                    .addComponent(cust_cmb, 0, 168, Short.MAX_VALUE)
                    .addComponent(cust_name)
                    .addComponent(state_cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(city)
                    .addComponent(tin)
                    .addComponent(mob)
                    .addComponent(email))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cust_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(cust_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cust_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(state_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(mob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(240, 168, 60));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("Total Quantity");

        jTextField21.setEditable(false);
        jTextField21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(255, 0, 51));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("Total Value");

        jTextField22.setEditable(false);
        jTextField22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField22.setForeground(new java.awt.Color(255, 0, 0));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("Total Vat (Rs)");

        jTextField23.setEditable(false);
        jTextField23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField23.setForeground(new java.awt.Color(255, 0, 0));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("Grand Totol");

        jTextField24.setEditable(false);
        jTextField24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField24.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField21)
                    .addComponent(jTextField22)
                    .addComponent(jTextField23)
                    .addComponent(jTextField24, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\edit.jpg")); // NOI18N
        add.setText("Add More");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\edit2.jpg")); // NOI18N
        update.setText("Update");

        sale.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sale.setText("Sale");
        sale.setEnabled(false);
        sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel6.setBackground(new java.awt.Color(240, 168, 60));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Payment Mode", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        buttonGroup1.add(b1);
        b1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b1.setText("By Cash");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(b2);
        b2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b2.setText("By Cheque");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(240, 168, 60));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "by Cash", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("Amount");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setText("Paid Amount");

        jTextField25.setEditable(false);
        jTextField25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setText("Due Amount");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Amount");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setText("Payment Status");

        cash_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cash_button.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\addnew.png")); // NOI18N
        cash_button.setText("Add");
        cash_button.setEnabled(false);
        cash_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cash_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField25)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cash_button)
                        .addGap(18, 18, 18))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(cash_button))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(240, 168, 60));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "By Cheque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setText("Amount");

        amount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setText("Date");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setText("Bank Name");

        bank_name.setEditable(false);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setText("Cheque No.");

        cheque_no.setEditable(false);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setText("Party Name");

        party_name.setEditable(false);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setText("Paid Amount");
        jLabel42.setToolTipText("");

        ch_date.setEnabled(false);

        paid_amount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        paid_amount.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Due");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        cheque_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cheque_button.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\addnew.png")); // NOI18N
        cheque_button.setText("Add");
        cheque_button.setEnabled(false);
        cheque_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheque_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cheque_button))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bank_name)
                                    .addComponent(cheque_no)
                                    .addComponent(party_name, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(ch_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(paid_amount))))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel37)
                    .addComponent(ch_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(bank_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(cheque_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(party_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(paid_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel40)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cheque_button)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b2)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(b1)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(b1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(b2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(add)
                                .addGap(31, 31, 31)
                                .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(sale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sale, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addGap(31, 31, 31))
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

    private void sku_cmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sku_cmbActionPerformed
                
        if(sku_cmb.getSelectedItem().toString().equals("select")!=true)
        {
              String sql="select * from product where sku_id=?";
        try{
            db.pst1=db.con.prepareStatement(sql);
            db.pst1.setInt(1,Integer.parseInt(sku_cmb.getSelectedItem().toString()));
            db.rs1=db.pst1.executeQuery();
            
           db.rs1.next();
           pro_name.setText(db.rs1.getString("pro_name"));
           pro_brand.setText(db.rs1.getString("pro_brand"));
           String m="0";
           actual_rate.setText(m=String.valueOf(db.rs1.getString("mrp")));
           sale_rate.setText(m);
           ava_qty.setText(String.valueOf(db.rs1.getInt("quantity")));
           vat.setText(String.valueOf(db.rs1.getInt("vat")));
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }        
        }
       
    }//GEN-LAST:event_sku_cmbActionPerformed

    private void sale_qtyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sale_qtyFocusLost
            
        int avl=Integer.parseInt(ava_qty.getText());
        int sa_val=0;
        try{
        sa_val=Integer.parseInt(sale_qty.getText());
        
        if(sa_val<=avl)
        {
            int val=Integer.parseInt(sale_rate.getText())*Integer.parseInt(sale_qty.getText());
            int vt=Integer.parseInt(actual_rate.getText())*Integer.parseInt(vat.getText())/100;
            int total=val+vt;
            value.setText(String.valueOf(val));
            gross_profit.setText("0");
            percent.setText("0");
            vat_rs.setText(String.valueOf(vt));
            net_amount.setText(String.valueOf(total));
        }
        else
        {
            JOptionPane.showMessageDialog(this,"product not available in Stock");
        }
        }
        catch(Exception e)
        {
            
        }
        
        
        
        
        
    }//GEN-LAST:event_sale_qtyFocusLost

    private void cust_cmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cust_cmbActionPerformed

        String sql="select * from customer where id="+Integer.parseInt(cust_cmb.getSelectedItem().toString());
        try
        {
            db.pst1=db.con.prepareStatement(sql);
            db.rs1=db.pst1.executeQuery();
            db.rs1.next();
            cust_name.setText(db.rs1.getString("name"));
            tin.setText(String.valueOf(db.rs1.getInt("tin_no")));
            cust_add.setText(db.rs1.getString("address"));
            state_cmb.setSelectedItem(db.rs1.getString("state"));
            city.setText(db.rs1.getString("city"));
            
            mob.setText(db.rs1.getString("mobile_no"));
            email.setText(db.rs1.getString("email_id"));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_cust_cmbActionPerformed

    
        public void set_Table()
    {
      
        colhead.add("invoice no");
        colhead.add("Sku no");
        colhead.add("Product Name");
        colhead.add("Product Brand");
        colhead.add("Actual Rate");
        colhead.add("Sale Rate");
        colhead.add("Available Qty");
        colhead.add("Sale Qty");
        colhead.add("Value");
        colhead.add("Gross Profit");
        colhead.add("Product Vat");
        colhead.add("Amount Vat");
        colhead.add("Nett Amount");
   
    }

    
    
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
      
        int r=jTable1.getRowCount();
                int i=0;
                boolean cond=true;
        
        if((sale_qty.getText().equals("")!=true)&&(cust_cmb.getSelectedItem().toString().equals("select")!=true))
        {
                      
                  for( i=0;i<r;i++)
                    {
                        
                    if(sku_cmb.getSelectedItem().toString().equals(jTable1.getValueAt(i, 1).toString()))
                    {
                        cond=false;
                       // System.out.println("hello");
                        break;
                    }
                }
            
                    if(cond||(sale_rate.getText().equals(jTable1.getValueAt(i, 5).toString())!=true))
                    {
                        Vector<String> row=new Vector<String>();
                        row.add(invoice_fld.getText());
                        row.add(sku_cmb.getSelectedItem().toString());
                        row.add(pro_name.getText());
                        row.add(pro_brand.getText());
                        row.add(actual_rate.getText());
                        row.add(sale_rate.getText());
                        row.add(ava_qty.getText());
                        row.add(sale_qty.getText());
                        row.add(value.getText());
                        row.add(gross_profit.getText());
                        row.add(vat.getText());
                        row.add(vat_rs.getText());
                        row.add(net_amount.getText());
                         data.add(row);
                        jTable1.setModel(new DefaultTableModel(data,colhead)
                        {
                            public boolean isCellEditable(int row,int col)
                            {
                                return false;
                            }
                        });
                    }
                    else
                    {
                        String str=jTable1.getValueAt(i, 7).toString();
                        int calc=Integer.parseInt(str)+Integer.parseInt(sale_qty.getText());
                        jTable1.setValueAt(String.valueOf(calc), i, 7);
                        
                         str=jTable1.getValueAt(i, 8).toString();
                         calc=Integer.parseInt(str)+Integer.parseInt(value.getText());
                        jTable1.setValueAt(String.valueOf(calc), i, 8);
                        
                        str=jTable1.getValueAt(i, 11).toString();
                         calc=Integer.parseInt(str)+Integer.parseInt(vat_rs.getText());
                         jTable1.setValueAt(String.valueOf(calc), i,11);
                         
                         str=jTable1.getValueAt(i, 12).toString();
                         calc=Integer.parseInt(str)+Integer.parseInt(net_amount.getText());
                         jTable1.setValueAt(String.valueOf(calc), i,12);
                    }
                    
                    t_q=t_q+Integer.parseInt(sale_qty.getText());
                    t_value=t_value+Integer.parseInt(value.getText());
                    t_vat=t_vat+Integer.parseInt(vat_rs.getText());
                    g_total+=Integer.parseInt(net_amount.getText());

                  int avail_qty=Integer.parseInt(jTable1.getValueAt(i, 6).toString())-Integer.parseInt(jTable1.getValueAt(i, 7).toString());
                  ava_qty.setText(String.valueOf(avail_qty));
                    
                    jTextField21.setText(String.valueOf(t_q));
                    jTextField22.setText(String.valueOf(t_value));
                    jTextField23.setText(String.valueOf(t_vat));
                    jTextField24.setText(String.valueOf(g_total));

                        //sale.setEnabled(true);
                    is_table=true;
           
            //System.out.println(jTable1.getRowCount());
           // System.out.println(jTable1.getValueAt(0, 1));
            
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Plz Add Customer And Sale Some Item in Quantity");
        }
        
    }//GEN-LAST:event_addActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
            
        if(is_table)
        {
            jLabel30.setText(jTextField24.getText());
            jTextField25.setEditable(true);
            cash_button.setEnabled(true);
            ch_date.setEnabled(false);
            bank_name.setEditable(false);
            cheque_no.setEditable(false);
            party_name.setEditable(false);
            paid_amount.setEditable(false);
            cheque_button.setEnabled(false);
                    
            //add_Paid();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "First Add Data in table");
            b1.setSelected(false);
        }
        
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        
        if(is_table)
        {
            amount.setText(jTextField24.getText());
            jTextField25.setEnabled(false);
            
            cash_button.setEnabled(false);
            ch_date.setEnabled(true);
            bank_name.setEditable(true);
            cheque_no.setEditable(true);
            party_name.setEditable(true);
            paid_amount.setEditable(true);
            cheque_button.setEnabled(true);
            //add_Paid();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "First Add Data in table");
            b2.setSelected(false);
        }
        
    }//GEN-LAST:event_b2ActionPerformed

    private void cash_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cash_buttonActionPerformed
                
        if(jTextField25.getText().equals("")!=true)
        {
            int amt=Integer.parseInt(jLabel30.getText());
            int pd_amt=Integer.parseInt(jTextField25.getText());
            int du=amt-pd_amt;
            if(du==0||du>=0)
            {
                jLabel33.setText(String.valueOf(du));
                JOptionPane.showMessageDialog(this, "Amount Succesfully added , Now You can Sale");
                is_paid=true;
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Plz fill Carefully amount");
                is_paid=false;
            }
        }    
        else
        {
            JOptionPane.showMessageDialog(this, "Plz Input amount");
            is_paid=false;
        }
        
            sale.setEnabled(true);
    }//GEN-LAST:event_cash_buttonActionPerformed

    private void cheque_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheque_buttonActionPerformed
            
                if(paid_amount.getText().equals("")!=true)
        {
            int amt=Integer.parseInt(amount.getText());
            int pd_amt=Integer.parseInt(paid_amount.getText());
            int du=amt-pd_amt;
            if(du==0||du>=0)
            {
                jLabel10.setText(String.valueOf(du));
                JOptionPane.showMessageDialog(this, "Amount Succesfully added , Now You can Sale");
                is_paid=true;
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Plz fill Carefully amount");
                is_paid=false;
            }
        }    
        else
        {
            JOptionPane.showMessageDialog(this, "Plz Input amount");
            is_paid=false;
        }

        sale.setEnabled(true);
    }//GEN-LAST:event_cheque_buttonActionPerformed

    private void saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleActionPerformed
                
        String sql="insert into sale(invoice_no,dated,cus_id,total,qty) values(?,?,?,?,?)";
        Date d=jDateChooser1.getDate();
            SimpleDateFormat smp=new SimpleDateFormat("dd-MM-yyyy");
            String str=smp.format(d);
            java.sql.Date dt=null;
        try
        {
            
            d=smp.parse(str);
             dt=new java.sql.Date(d.getTime());
            
            db.pst1=db.con.prepareStatement(sql);
            db.pst1.setInt(1, Integer.parseInt(invoice_fld.getText()));
            db.pst1.setDate(2, dt);
            db.pst1.setInt(3, Integer.parseInt(cust_cmb.getSelectedItem().toString()));
            db.pst1.setInt(4, Integer.parseInt(jTextField24.getText()));
            db.pst1.setInt(5,Integer.parseInt(jTextField21.getText()));
            
            
            /*if(b1.isSelected())
            {
                db.pst1.setInt(5, Integer.parseInt(jTextField25.getText()));
                db.pst1.setInt(6, Integer.parseInt(jLabel33.getText()));
                int du= Integer.parseInt(jLabel30.getText())-Integer.parseInt(jTextField25.getText());
                        if(du==0)
                        {
                            db.pst1.setString(7, "clear");
                        }
                        else
                        {
                                db.pst1.setString(7, "due");
                        }
            }
            else
            {
                db.pst1.setInt(5, Integer.parseInt(paid_amount.getText()));
                db.pst1.setInt(6, Integer.parseInt(jLabel10.getText()));
                int du= Integer.parseInt(amount.getText())-Integer.parseInt(paid_amount.getText());
                if(du==0)
                        {
                            db.pst1.setString(7, "clear");
                        }
                        else
                        {
                                db.pst1.setString(7, "due");
                        }
            }*/
            //db.pst1.setInt(8, Integer.parseInt(jTextField22.getText()));
           // db.pst1.setInt(9,Integer.parseInt(jTextField23.getText()));
           // db.pst1.setInt(10,Integer.parseInt(jTextField21.getText()));
            db.pst1.execute();
            
            // Now working on sale_detail table 
            
            sql="insert into sale_detail(invoice_no,sku_id,qty,sale_rate,vat_rs,total) values(?,?,?,?,?,?)";
            String sql1="update product set quantity=? where sku_id=?";
            int row=jTable1.getRowCount();
            d=smp.parse(str);
             dt=new java.sql.Date(d.getTime());
            for(int i=0;i<row;i++)
            {
            db.pst2=db.con.prepareStatement(sql);
            
            db.pst2.setInt(1,Integer.parseInt(jTable1.getValueAt(i, 0).toString()));
         //   db.pst2.setDate(2,dt);
            db.pst2.setInt(2,Integer.parseInt(jTable1.getValueAt(i,1).toString()));
            db.pst2.setInt(3, Integer.parseInt(jTable1.getValueAt(i, 7).toString()));
            db.pst2.setInt(4, Integer.parseInt(jTable1.getValueAt(i, 5).toString()));
          //  db.pst2.setInt(5, Integer.parseInt(jTable1.getValueAt(i, 8).toString()));
            db.pst2.setInt(5, Integer.parseInt(jTable1.getValueAt(i, 11).toString()));
            db.pst2.setInt(6, Integer.parseInt(jTable1.getValueAt(i, 12).toString()));
            db.pst2.execute();
            
            db.pst3=db.con.prepareStatement(sql1);
            db.pst3.setInt(1, Integer.parseInt(jTable1.getValueAt(i, 6).toString())-Integer.parseInt(jTable1.getValueAt(i, 7).toString()));
            db.pst3.setInt(2, Integer.parseInt(jTable1.getValueAt(i, 1).toString()));
            db.pst3.execute();
            }
            
            // Now working start on table payment
            
            sql="insert into payment(invoice_no,cus_id,pre_date,pay_mode,bank_name,cheque_no,party_name,paid_amt,due,che_date,pay_status,invoice_pos) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            db.pst1=db.con.prepareStatement(sql);
            db.pst1.setInt(1,Integer.parseInt(invoice_fld.getText()));
                db.pst1.setInt(2, Integer.parseInt(cust_cmb.getSelectedItem().toString()));
                db.pst1.setDate(3,dt);
            if(b1.isSelected())
            {
                db.pst1.setString(4, "cash");
                db.pst1.setString(5, "");
                db.pst1.setString(6, "");
                db.pst1.setString(7, "");
                db.pst1.setInt(8,Integer.parseInt(jTextField25.getText()));
                db.pst1.setInt(9, Integer.parseInt(jLabel33.getText()));
                db.pst1.setDate(10, null);
                  int du= Integer.parseInt(jLabel30.getText())-Integer.parseInt(jTextField25.getText());
                        if(du==0)
                        {
                            db.pst1.setString(11, "clear");
                        }
                        else
                        {
                                db.pst1.setString(11, "due");
                        }
                        db.pst1.setInt(12,1);
                }
            else
            {
                db.pst1.setString(4, "cheque");
                db.pst1.setString(5, bank_name.getText());
                db.pst1.setString(6, cheque_no.getText());
                db.pst1.setString(7, party_name.getText());
                db.pst1.setInt(8,Integer.parseInt(paid_amount.getText()));
                db.pst1.setInt(9, Integer.parseInt(jLabel10.getText()));
                
                d=ch_date.getDate();
                str=smp.format(d);
                
                dt=new java.sql.Date(d.getTime());
                db.pst1.setDate(10, dt);
                int du= Integer.parseInt(amount.getText())-Integer.parseInt(paid_amount.getText());
                if(du==0)
                        {
                            db.pst1.setString(11, "clear");
                        }
                        else
                        {
                                db.pst1.setString(11, "due");
                        }
                db.pst1.setInt(12,1);
            }
            
            db.pst1.execute();
            
            sql="update invoice set invoice_no=? where invoice_no=?";
            db.pst1=db.con.prepareStatement(sql);
            db.pst1.setInt(1, Integer.parseInt(invoice_fld.getText())+1);
            db.pst1.setInt(2, Integer.parseInt(invoice_fld.getText()));
            db.pst1.execute();
      
            JOptionPane.showMessageDialog(this," Sale SuccesFully");
            
            set_Interface();
            start_method();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_saleActionPerformed

    
    public void set_Interface()
    {
        sku_cmb.setSelectedIndex(0);
        pro_name.setText("");
        pro_brand.setText(null);
        actual_rate.setText("");
        sale_rate.setText("");
        ava_qty.setText("");
        sale_qty.setText("");
        value.setText("");
        vat.setText("");
        vat_rs.setText("");
        net_amount.setText("");
//        cust_cmb.setSelectedIndex(0);
        cust_name.setText("");
        cust_add.setText("");
        state_cmb.setSelectedIndex(0);
        city.setText("");
        tin.setText("");
        mob.setText("");
        email.setText("");
        jTextField21.setText("");
        jTextField22.setText("");
        jTextField23.setText("");
        jTextField24.setText("");
        b1.setSelected(false);
        jTextField25.setText("");
        jLabel33.setText("Amount");
        bank_name.setText("");
        cheque_no.setText("");
        party_name.setText("");
        paid_amount.setText("");
        sale.setEnabled(false);
        cash_button.setEnabled(false);
        cheque_button.setEnabled(false);
        jLabel30.setText("");
         t_q=0;
        t_value=0;
        t_vat=0;
        g_total=0;
        is_paid=false;
        is_table=false;
    }
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actual_rate;
    private javax.swing.JButton add;
    private javax.swing.JLabel amount;
    private javax.swing.JLabel ava_qty;
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b2;
    private javax.swing.JTextField bank_name;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cash_button;
    private com.toedter.calendar.JDateChooser ch_date;
    private javax.swing.JButton cheque_button;
    private javax.swing.JTextField cheque_no;
    private javax.swing.JTextField city;
    private javax.swing.JTextField cust_add;
    private javax.swing.JComboBox cust_cmb;
    private javax.swing.JTextField cust_name;
    private javax.swing.JTextField email;
    private javax.swing.JTextField gross_profit;
    private javax.swing.JTextField invoice_fld;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField mob;
    private javax.swing.JTextField net_amount;
    private javax.swing.JTextField paid_amount;
    private javax.swing.JTextField party_name;
    private javax.swing.JTextField percent;
    private javax.swing.JTextField pro_brand;
    private javax.swing.JTextField pro_name;
    private javax.swing.JButton sale;
    private javax.swing.JTextField sale_qty;
    private javax.swing.JTextField sale_rate;
    private javax.swing.JComboBox sku_cmb;
    private javax.swing.JComboBox state_cmb;
    private javax.swing.JTextField tin;
    private javax.swing.JButton update;
    private javax.swing.JTextField value;
    private javax.swing.JTextField vat;
    private javax.swing.JTextField vat_rs;
    // End of variables declaration//GEN-END:variables
}
