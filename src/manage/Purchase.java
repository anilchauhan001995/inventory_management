
package manage;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Purchase extends javax.swing.JInternalFrame {
    Database_Class db;
    int invoice_no;
    int vat;
    int selected_row;
    Vector<Vector<String>> data;
    Vector<String> colhead;
    
    public Purchase() {
        initComponents();
        db=new Database_Class();
        
        data=new Vector<Vector<String>>();
        colhead=new Vector<String>();
        set_Table();
        update.setEnabled(false);
        
        invoice_no=get_invoice();
        jTextField1.setText(String.valueOf(invoice_no));
        jTextField1.setEditable(false);
        
//     jDateChooser1.setDate(new Date("29/05/2015"));
        Calendar d=Calendar.getInstance();
        jDateChooser1.setDate(d.getTime());
        
        load_sku_id();
    }

    
    public int get_invoice()
    {
        String sql="select invoice_no from invoice";
        try{
            db.pst2=db.con.prepareStatement(sql);
            db.rs2=db.pst2.executeQuery();
            db.rs2.next();
            
            return(invoice_no=db.rs2.getInt("invoice_no"));
        }
        catch(Exception e){
            return invoice_no;
        }
        
    }
    
    
    public void put_invoice()
    {
        String sql="update invoice set incoice_id=?";
        try
        {
            db.pst2=db.con.prepareStatement(sql);
            db.pst2.setInt(1, invoice_no+1);
            db.rs2=db.pst2.executeQuery();   
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invoice no is not updated");
        }
    }
    
    
    
    public void load_sku_id()
    {
        String sql="select * from product";
        try
        {
            db.pst1=db.con.prepareStatement(sql);
            db.rs1=db.pst1.executeQuery();
            while(db.rs1.next())
            {
                jComboBox3.addItem(String.valueOf(db.rs1.getInt("sku_id")));
            }
           
           sql="select * from vendor";
           db.pst1=db.con.prepareStatement(sql);
           db.rs1=db.pst1.executeQuery();
           while(db.rs1.next())
           {
               jComboBox1.addItem(String.valueOf(db.rs1.getInt("id")));
           }
                   
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        ven_name = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cmb_state = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        mob = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        purchase = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Purchase");
        setNormalBounds(new java.awt.Rectangle(50, 50, 106, 0));

        jPanel1.setBackground(new java.awt.Color(163, 206, 206));

        jPanel2.setBackground(new java.awt.Color(240, 168, 60));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Product (P)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 204))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Product Sku_no");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Product Name");

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Product Brand");

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Rate");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jCheckBox1.setText("New Rate");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Available Quantity");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Quantity");

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Value");

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("VAT (%)");

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("VAT (Rs.)");

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Nett. Amount");

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add.setText("Add More");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox1))
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField5)
                    .addComponent(jTextField6)
                    .addComponent(jTextField7)
                    .addComponent(jTextField8)
                    .addComponent(jTextField9)
                    .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCheckBox1)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(update)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(240, 168, 60));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Invoice no.");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 0, 0));

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(240, 168, 60));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Vendor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 255))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Vendor ID");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Vendor Name");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        ven_name.setEditable(false);
        ven_name.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Address");

        address.setEditable(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("State");

        cmb_state.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmb_state.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "Andhra Pradessh", "Arunachal Pradesh", "Assam", "Bihar", "Chattishgarh", "delhi", "goa", "gujrat", "haryana", "himachal pradesh", "Jammu kashmir", "jharkhand", "karnatka", "kerala", "madhya pradesh", "maharashtra", "manipur", "meghalay", "mizoram", "nagaland", "Orrissa", "punjab", "rajasthan", "Sikkim", "Tamil nadu", "Tripura", "Uttar Pradesh", "Uttranchal", "West Bengal" }));
        cmb_state.setToolTipText("");
        cmb_state.setEnabled(false);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("City");

        city.setEditable(false);
        city.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Mobile No.");

        mob.setEditable(false);
        mob.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Email ID");

        email.setEditable(false);
        email.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(email)
                    .addComponent(mob)
                    .addComponent(city)
                    .addComponent(cmb_state, 0, 174, Short.MAX_VALUE)
                    .addComponent(address)
                    .addComponent(jComboBox1, 0, 174, Short.MAX_VALUE)
                    .addComponent(ven_name))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(ven_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cmb_state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(mob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 89, Short.MAX_VALUE))
        );

        jTable2.setBackground(new java.awt.Color(240, 168, 60));
        jTable2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTable2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable2.setForeground(new java.awt.Color(0, 0, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable2MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        purchase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purchase.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\purchase_button2.jpg")); // NOI18N
        purchase.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseActionPerformed(evt);
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
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153))))
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

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
                
        if(jComboBox3.getSelectedItem().toString().equals("select")!=true)
        {
            String sql="select * from product where sku_id=?";
            try
            {
                db.pst1=db.con.prepareStatement(sql);
                db.pst1.setInt(1, Integer.parseInt(jComboBox3.getSelectedItem().toString()));
                db.rs1=db.pst1.executeQuery();
                db.rs1.next();
                jTextField3.setText(db.rs1.getString("pro_name"));
                jTextField4.setText(db.rs1.getString("pro_brand"));
                jTextField5.setText(String.valueOf(db.rs1.getInt("mrp")));
                int mrp=db.rs1.getInt("mrp");
                if(mrp!=0)
                    jTextField5.setEditable(false);
                    jTextField6.setText("0");
                    jLabel7.setText(String.valueOf(db.rs1.getInt("quantity")));
                    jTextField7.setText("0");
                    jTextField8.setText(String.valueOf(vat=db.rs1.getInt("vat")));
                    jTextField9.setText("0");
                    jTextField10.setText("0");
                    ven_name.setText("0");
                            
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged

        if(jCheckBox1.isSelected())
            jTextField5.setEditable(true);
        else
            jTextField5.setEditable(false);
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
            
        if(jComboBox1.getSelectedItem().toString().equals("select"))
        {
            JOptionPane.showMessageDialog(this, "Plz Add Vendor");
        }
        else
        {

            
           Vector<String> row=new Vector<String>();
           row.add(jTextField1.getText());
           row.add(jComboBox3.getSelectedItem().toString());
           row.add(jTextField3.getText());
           row.add(jTextField4.getText());
           row.add(jTextField5.getText());
           if(jCheckBox1.isSelected())
           row.add("0");
           else
               row.add(jLabel7.getText());
           row.add(jTextField6.getText());
           row.add(jTextField7.getText());
           row.add(jTextField8.getText());
           row.add(jTextField9.getText());
           row.add(jTextField10.getText());
           data.addElement(row);
           jTable2.setModel(new DefaultTableModel(data,colhead)
           {
               public boolean isCellEditable(int row,int col)
               {
                   return false;
               }
           });
           
           
           
             jComboBox1.setEnabled(false);
        ven_name.setEditable(false);
        address.setEditable(false);
        cmb_state.setEnabled(false);
        mob.setEditable(false);
        email.setEditable(false);
        }
      
        
    }//GEN-LAST:event_addActionPerformed

    
    public void set_Table()
    {
      
        colhead.add("invoice no");
        colhead.add("Sku no");
        colhead.add("Product Name");
        colhead.add("Product Brand");
        colhead.add("Product Rate");
        colhead.add("Now Available Qty");
        colhead.add("Purchase Qty");
        colhead.add("Value");
        colhead.add("Product Vat");
        colhead.add("Amount Vat");
        colhead.add("Nett Amount");
           }
        
    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
                
        int v=Integer.parseInt(jTextField5.getText())*Integer.parseInt(jTextField6.getText());
        jTextField7.setText(String.valueOf(v));
        int var_rs=v*vat/100;
        jTextField9.setText(String.valueOf(var_rs));
        jTextField10.setText(String.valueOf(v+var_rs));
        
    }//GEN-LAST:event_jTextField6FocusLost

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
                
        String sql="select * from vendor where id=?";
        try
        {
            db.pst1=db.con.prepareStatement(sql);
            db.pst1.setInt(1,Integer.parseInt( jComboBox1.getSelectedItem().toString()));
            db.rs1=db.pst1.executeQuery();
            db.rs1.next();
            ven_name.setText(db.rs1.getString("name"));
            address.setText(db.rs1.getString("address"));
            cmb_state.setSelectedItem(db.rs1.getString("state"));
            city.setText(db.rs1.getString("city"));
            mob.setText(db.rs1.getString("mobile_no"));
            email.setText(db.rs1.getString("email_id"));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseActionPerformed
         String sql1="select * from product where sku_id=?";
           try
           {
               
               int row=jTable2.getRowCount();
               for(int i=0;i<row;i++)
               {
                   int table_mrp=Integer.parseInt(jTable2.getValueAt(i, 4).toString());
                   db.pst1=db.con.prepareStatement(sql1);
                   db.pst1.setInt(1, Integer.parseInt(jTable2.getValueAt(i, 1).toString()));
                    db.rs1=db.pst1.executeQuery();
                    db.rs1.next();
                    int data_mrp=db.rs1.getInt("mrp");
                    if(table_mrp!=data_mrp&&data_mrp!=0 )
                    {
                        String sql2="select max(sku_id) as max_sku_id from product";
                         String sql3="insert into product(sku_id,pro_name,pro_brand,mrp,vat,quantity) values(?,?,?,?,?,?)";
                        db.pst2=db.con.prepareStatement(sql2);
                        db.rs2=db.pst2.executeQuery();
                        db.rs2.next();
                        int max_sku=db.rs2.getInt("max_sku_id");
                        
                        db.pst3=db.con.prepareStatement(sql3);
                        db.pst3.setInt(1,max_sku+1);
                        db.pst3.setString(2, jTable2.getValueAt(i, 2).toString());
                        db.pst3.setString(3,jTable2.getValueAt(i, 3).toString());
                        db.pst3.setInt(4, table_mrp);
                        db.pst3.setInt(5, Integer.parseInt(jTable2.getValueAt(i, 8).toString()));
                        db.pst3.setInt(6, Integer.parseInt(jTable2.getValueAt(i, 6).toString()));
                        db.pst3.execute();
                 }
                    else
                    {
                        String sql2="update product set quantity=?,mrp=? where sku_id=?";
                         db.pst3=db.con.prepareStatement(sql2);
                        db.pst3.setInt(1, db.rs1.getInt("quantity")+Integer.parseInt(jTable2.getValueAt(i, 6).toString()));
                        db.pst3.setInt(2, table_mrp);
                        db.pst3.setInt(3, Integer.parseInt(jTable2.getValueAt(i, 1).toString()));
                        db.pst3.execute();
                        
                    }
                    
               }
               
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(this, e.getMessage());
           }
        
        
        
        
        
        int total_qty=0;

           sql1="insert into purchase_product_detail(invoice_no,sku_id,pro_name,pro_brand,rate,pro_quantity,value,vat,vat_amount,net_amount) values(?,?,?,?,?,?,?,?,?,?)";
        //String sql2="update product set quantity=?,mrp=? where sku_id=?";
        try
        {  
            int row=jTable2.getRowCount();
            for(int i=0;i<row;i++)
            {
                     
            db.pst2=db.con.prepareStatement(sql1);
            db.pst2.setInt(1, Integer.parseInt(jTable2.getValueAt(i, 0).toString()));
            db.pst2.setInt(2, Integer.parseInt(jTable2.getValueAt(i, 1).toString()));
            db.pst2.setString(3,jTable2.getValueAt(i, 2).toString());
            db.pst2.setString(4, jTable2.getValueAt(i, 3).toString());
            db.pst2.setInt(5, Integer.parseInt(jTable2.getValueAt(i,4).toString()));
            db.pst2.setInt(6, Integer.parseInt(jTable2.getValueAt(i, 5).toString()));
            db.pst2.setInt(7, Integer.parseInt(jTable2.getValueAt(i, 6).toString()));
            db.pst2.setInt(8, Integer.parseInt(jTable2.getValueAt(i, 7).toString()));
            db.pst2.setInt(9, Integer.parseInt(jTable2.getValueAt(i, 9).toString()));
            db.pst2.setInt(10,Integer.parseInt(jTable2.getValueAt(i, 10).toString()));
            db.pst2.execute();
            
            }
            
            
            
            sql1="insert into purchase_detail(invoice_no,dated,ven_id,ven_name,address,mobile_no,email_id) values(?,?,?,?,?,?,?)";
                db.pst1=db.con.prepareStatement(sql1);
            db.pst1.setInt(1, Integer.parseInt(jTextField1.getText()));
            Date d=jDateChooser1.getDate();
            SimpleDateFormat smp=new SimpleDateFormat("dd-MM-yyyy");
            String str=smp.format(d);
            d=smp.parse(str);
            java.sql.Date dt=new java.sql.Date(d.getTime());
            db.pst1.setDate(2,dt);
            
            db.pst1.setInt(3, Integer.parseInt(jComboBox1.getSelectedItem().toString()));
            db.pst1.setString(4,ven_name.getText() );
            db.pst1.setString(5, address.getText());
            db.pst1.setString(6, mob.getText());
            db.pst1.setString(7, email.getText());
            db.pst1.execute();
            
            
            
            sql1="update invoice set invoice_no=?";
            db.pst1=db.con.prepareStatement(sql1);
            db.pst1.setInt(1, Integer.parseInt(jTextField1.getText())+1);
            db.pst1.execute();
            
            JOptionPane.showMessageDialog(this, "succesfully Purchased Items");
            db.pst1.close();
            db.rs1.close();
            db.pst2.close();
            db.rs2.close();
            this.dispose();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_purchaseActionPerformed

    private void jTable2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MousePressed
                
        selected_row=jTable2.getSelectedRow();
        update.setEnabled(true);
        jComboBox3.setSelectedItem(jTable2.getValueAt(selected_row,1).toString());
        jComboBox3.setEnabled(false);
        
        jTextField3.setText(jTable2.getValueAt(selected_row, 2).toString());
        jTextField4.setText(jTable2.getValueAt(selected_row, 3).toString());
        jTextField5.setText(jTable2.getValueAt(selected_row,4).toString());
     jTextField6.setText(jTable2.getValueAt(selected_row, 6).toString());
     jTextField7.setText(jTable2.getValueAt(selected_row, 7).toString());
     jTextField8.setText(jTable2.getValueAt(selected_row, 8).toString());
     jTextField9.setText(jTable2.getValueAt(selected_row, 9).toString());
     jTextField10.setText(jTable2.getValueAt(selected_row, 10).toString());
     jTextField9.setEditable(false);
     jTextField10.setEditable(false); 
     
    }//GEN-LAST:event_jTable2MousePressed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
                    
         String sql="update product set pro_name=?,pro_brand=?,mrp=?,vat=?,quantity=? where sku_id=?";
     
     try
     {
         db.pst1=db.con.prepareStatement(sql);
         db.pst1.setString(1, jTextField3.getText());
         db.pst1.setString(2, jTextField4.getText());
         db.pst1.setInt(3,Integer.parseInt(jTextField5.getText()));
         db.pst1.setInt(4, Integer.parseInt(jTextField8.getText()));
         db.pst1.setInt(5, Integer.parseInt(jTextField6.getText()));
         db.pst1.setInt(6, Integer.parseInt(jComboBox3.getSelectedItem().toString()));
         db.pst1.executeQuery();
        
         
         jTable2.setValueAt(jTextField3.getText(),selected_row, 2);
         jTable2.setValueAt(jTextField4.getText(),selected_row, 3);
         jTable2.setValueAt(jTextField5.getText(),selected_row, 4);
         jTable2.setValueAt(jTextField8.getText(),selected_row, 8);
         jTable2.setValueAt(jTextField6.getText(),selected_row, 6);
         jTable2.setValueAt(jTextField7.getText(),selected_row,7);
         jTable2.setValueAt(jTextField9.getText(),selected_row,9);
         jTable2.setValueAt(jTextField10.getText(), selected_row, 10);
         update.setEnabled(false);
     }
     catch(Exception e){
         
     }
    
    }//GEN-LAST:event_updateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JTextField city;
    private javax.swing.JComboBox cmb_state;
    private javax.swing.JTextField email;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField mob;
    private javax.swing.JButton purchase;
    private javax.swing.JButton update;
    private javax.swing.JTextField ven_name;
    // End of variables declaration//GEN-END:variables
}
