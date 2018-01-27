
package manage;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Front_Interface extends javax.swing.JFrame {
    public Front_Interface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desk = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hidustan Unilever");
        setBackground(new java.awt.Color(226, 203, 203));
        setExtendedState(6);

        desk.setBackground(new java.awt.Color(230, 202, 202));
        desk.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 51), 1, true));
        desk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desk.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/newunli2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout deskLayout = new javax.swing.GroupLayout(desk);
        desk.setLayout(deskLayout);
        deskLayout.setHorizontalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deskLayout.setVerticalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deskLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        desk.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\schd.png")); // NOI18N
        jMenu1.setText("File");

        jMenuItem1.setText("New Invoice");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("New Product");
        jMenu1.add(jMenuItem2);

        jMenu9.setText("Shortcuts");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem3.setText("Product");
        jMenu9.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem4.setText("Vendor");
        jMenu9.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setText("Purchase");
        jMenu9.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, 0));
        jMenuItem6.setText("Customer");
        jMenu9.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, 0));
        jMenuItem7.setText("Sale");
        jMenu9.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem8.setText("Sale detail");
        jMenu9.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem9.setText("Purchase detail");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem10.setText("Vat detail");
        jMenu9.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem11.setText("Payment detail");
        jMenu9.add(jMenuItem11);

        jMenu1.add(jMenu9);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\purchase_icon3.jpg")); // NOI18N
        jMenu2.setText("Product");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu2MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\emp.jpg")); // NOI18N
        jMenu3.setText("Vendor");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu3MousePressed(evt);
            }
        });
        jMenu3.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu3MenuSelected(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenu3.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jMenu3MenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\mpney.jpg")); // NOI18N
        jMenu4.setText("Purchase");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu4MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\emps.png")); // NOI18N
        jMenu5.setText("Customer");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu5MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/sale3 - Copy.jpg"))); // NOI18N
        jMenu6.setText("Sale");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu6MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\search3.jpg")); // NOI18N
        jMenu7.setText("Search");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });

        jMenuItem12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/search_product.jpg"))); // NOI18N
        jMenuItem12.setText("Product (Complete) Stock");
        jMenuItem12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem12MousePressed(evt);
            }
        });
        jMenu7.add(jMenuItem12);

        jMenuItem13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/search_3.jpg"))); // NOI18N
        jMenuItem13.setText("Vendor");
        jMenuItem13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem13MousePressed(evt);
            }
        });
        jMenu7.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem14.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\search.png")); // NOI18N
        jMenuItem14.setText("Customer");
        jMenuItem14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem14MousePressed(evt);
            }
        });
        jMenu7.add(jMenuItem14);

        jMenuItem15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem15.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\salary.jpg")); // NOI18N
        jMenuItem15.setText("Sale Detail");
        jMenuItem15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem15MousePressed(evt);
            }
        });
        jMenu7.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem16.setForeground(new java.awt.Color(51, 0, 51));
        jMenuItem16.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\search4.jpg")); // NOI18N
        jMenuItem16.setText("Purchase Detail");
        jMenuItem16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem16MousePressed(evt);
            }
        });
        jMenu7.add(jMenuItem16);

        jMenuItem17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem17.setForeground(new java.awt.Color(51, 0, 51));
        jMenuItem17.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\search3.jpg")); // NOI18N
        jMenuItem17.setText("payment Detail & Payment update");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem17);

        jMenuItem18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem18.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\search2.jpg")); // NOI18N
        jMenuItem18.setText("Product Stock");
        jMenuItem18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem18MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem18MousePressed(evt);
            }
        });
        jMenu7.add(jMenuItem18);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon("E:\\vipin\\z\\pd\\java_pro\\inventory\\icon\\help.png")); // NOI18N
        jMenu8.setText("Security");
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });

        jMenuItem19.setText("Change Password");
        jMenuItem19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem19MouseClicked(evt);
            }
        });
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem19);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desk)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desk)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MousePressed
            
        
    }//GEN-LAST:event_jMenu3MousePressed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        
       // Vendor ven=new Vendor();
       // desk.add(ven);
       // ven.show(true);
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu3MenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMenu3MenuKeyPressed

   //     Vendor ven=new Vendor();
       // desk.add(ven);
       // ven.show();
    }//GEN-LAST:event_jMenu3MenuKeyPressed

    private void jMenu3MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu3MenuSelected
         
    }//GEN-LAST:event_jMenu3MenuSelected

    private void jMenu5MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu5MenuSelected
        
    }//GEN-LAST:event_jMenu5MenuSelected

    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
                
        
                
    }//GEN-LAST:event_jMenu2MenuSelected

    private void jMenu4MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu4MenuSelected
                    
        
    }//GEN-LAST:event_jMenu4MenuSelected

    private void jMenuItem12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem12MousePressed
            Search_Product sp=new Search_Product();
            desk.add(sp);
            sp.show();
                   
    }//GEN-LAST:event_jMenuItem12MousePressed

    private void jMenuItem13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem13MousePressed
        Search_Vendor sv=new Search_Vendor();
        desk.add(sv);
        sv.show();
    }//GEN-LAST:event_jMenuItem13MousePressed

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
                 
        
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenuItem16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem16MousePressed
        Purchase_Detail pd=new Purchase_Detail();
        desk.add(pd);
        pd.show();
    }//GEN-LAST:event_jMenuItem16MousePressed

    private void jMenuItem14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem14MousePressed
                Search_Customer sc=new Search_Customer();
                desk.add(sc);
                sc.show();
                        
    }//GEN-LAST:event_jMenuItem14MousePressed

    private void jMenu6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MousePressed
            

       
        
        
    }//GEN-LAST:event_jMenu6MousePressed

    private void jMenuItem15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem15MousePressed
            Sale_Details s=new Sale_Details();
                    desk.add(s);
                    s.show();
    }//GEN-LAST:event_jMenuItem15MousePressed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
            Payment py=new Payment();
            desk.add(py);
            py.show();
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
               Sales s=new Sales(); 
        s.setVisible(true);
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
            Customer cust=new Customer();
        desk.add(cust);
        cust.show();
        
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
          Purchase p=new Purchase();
        desk.add(p);
        p.show();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
             Vendor ven=new Vendor();
        desk.add(ven);
        ven.show();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
            Product pd=new Product();
        desk.add(pd);
        pd.show();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem18MouseClicked

    }//GEN-LAST:event_jMenuItem18MouseClicked

    private void jMenuItem18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem18MousePressed
                    Stock s=new Stock();
                    desk.add(s);
                    s.show();
    }//GEN-LAST:event_jMenuItem18MousePressed

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked

    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenuItem19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem19MouseClicked
    }//GEN-LAST:event_jMenuItem19MouseClicked

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
                    Password pass=new Password();
            desk.add(pass);
            pass.setVisible(true);
            
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Front_Interface().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
