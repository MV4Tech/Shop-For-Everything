/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login_register_design;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Lenovo
 */
public class Menu_Form extends javax.swing.JFrame {

   
    /**
     * Creates new form Menu_Form
     */
    public Menu_Form() {
        initComponents();
        this.setLocationRelativeTo(null); 
       jLabel_welcomeName.setText("Welcome, " + Login_Form.usernameForWelcome );
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton_addProduct1 = new javax.swing.JButton();
        jButton_favProducts = new javax.swing.JButton();
        jButton_Exit = new javax.swing.JButton();
        allProducts = new javax.swing.JButton();
        Wallet = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel_welcomeName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jButton_addProduct1.setBackground(new java.awt.Color(0, 0, 0));
        jButton_addProduct1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jButton_addProduct1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_addProduct1.setText("Add Product");
        jButton_addProduct1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton_addProduct1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton_addProduct1FocusLost(evt);
            }
        });
        jButton_addProduct1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_addProduct1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_addProduct1MouseExited(evt);
            }
        });
        jButton_addProduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addProduct1ActionPerformed(evt);
            }
        });

        jButton_favProducts.setBackground(new java.awt.Color(0, 0, 0));
        jButton_favProducts.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jButton_favProducts.setForeground(new java.awt.Color(255, 255, 255));
        jButton_favProducts.setText("My Products");
        jButton_favProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_favProductsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_favProductsMouseExited(evt);
            }
        });
        jButton_favProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_favProductsActionPerformed(evt);
            }
        });

        jButton_Exit.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Exit.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jButton_Exit.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Exit.setText("Log Out");
        jButton_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_ExitMouseExited(evt);
            }
        });
        jButton_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExitActionPerformed(evt);
            }
        });

        allProducts.setBackground(new java.awt.Color(0, 0, 0));
        allProducts.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        allProducts.setForeground(new java.awt.Color(255, 255, 255));
        allProducts.setText("PRODUCTS");
        allProducts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                allProductsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                allProductsFocusLost(evt);
            }
        });
        allProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allProductsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                allProductsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                allProductsMouseExited(evt);
            }
        });
        allProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allProductsActionPerformed(evt);
            }
        });

        Wallet.setBackground(new java.awt.Color(0, 0, 0));
        Wallet.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        Wallet.setForeground(new java.awt.Color(255, 255, 255));
        Wallet.setText("My Wallet");
        Wallet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WalletMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WalletMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WalletMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_favProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_addProduct1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Exit)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Wallet, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(allProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton_addProduct1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(Wallet)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton_Exit))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton_favProducts)))
                .addGap(11, 11, 11))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));

        jLabel_welcomeName.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_welcomeName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel_welcomeName.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MENU");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_welcomeName, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel_welcomeName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel_close.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_close.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_close.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_close.setText(" X");
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseExited(evt);
            }
        });

        jLabel_minimize.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_minimize.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_minimize.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_minimize.setText(" -");
        jLabel_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MLOGO23.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setBackground(new java.awt.Color(204, 0, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MLOGO23.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(376, 376, 376)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_close))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton_addProduct1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton_addProduct1FocusGained
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jButton_addProduct1FocusGained

    private void jButton_addProduct1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton_addProduct1FocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton_addProduct1FocusLost

    private void jButton_addProduct1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_addProduct1MouseEntered
        // TODO add your handling code here:
        
        jButton_addProduct1.setBackground(new Color(0,51,204));
    }//GEN-LAST:event_jButton_addProduct1MouseEntered

    private void jButton_addProduct1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_addProduct1MouseExited
        // TODO add your handling code here:
        
        jButton_addProduct1.setBackground(Color.black);
        
    }//GEN-LAST:event_jButton_addProduct1MouseExited

    private void jButton_favProductsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_favProductsMouseEntered
        // TODO add your handling code here:
        
        jButton_favProducts.setBackground(new Color(0,51,204));
        
    }//GEN-LAST:event_jButton_favProductsMouseEntered

    private void jButton_favProductsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_favProductsMouseExited
        // TODO add your handling code here:
        
        jButton_favProducts.setBackground(Color.black);
        
    }//GEN-LAST:event_jButton_favProductsMouseExited

    private void jButton_ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ExitMouseEntered
        // TODO add your handling code here:
        
        jButton_Exit.setBackground(Color.red);
        jButton_Exit.setForeground(Color.black);
        
    }//GEN-LAST:event_jButton_ExitMouseEntered

    private void jButton_ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ExitMouseExited
        // TODO add your handling code here:
        
        jButton_Exit.setBackground(Color.black);
        jButton_Exit.setForeground(Color.white);
        
    }//GEN-LAST:event_jButton_ExitMouseExited

    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked

        // minimize
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minimizeMouseClicked

    private void jLabel_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseEntered
       // Border label_border = BorderFactory.createMatteBorder(1,1,1,1,new Color(0,204,255));
      //  jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.red);
    }//GEN-LAST:event_jLabel_minimizeMouseEntered

    private void jLabel_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseExited
        //Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.white);
       // jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_minimizeMouseExited

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked

        // exit
        System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseEntered

       // Border label_border = BorderFactory.createMatteBorder(1,1,1,1,new Color(0,204,255));
       //jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.red);
    }//GEN-LAST:event_jLabel_closeMouseEntered

    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseExited
        //Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.white);
       // jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_closeMouseExited

    private void jButton_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ExitMouseClicked
        // TODO add your handling code here:
        Object[] asd = {"Yes","Cancel"};
        // JOptionPane.showMessageDialog(null, "Are you sure you want to exit?", "Exit", 2);
         int answer = JOptionPane.showOptionDialog(null, "Are you sure you want to Log Out?", "Exit!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,asd , asd[1]);
         if(answer == JOptionPane.YES_OPTION){    
                 Login_Form form = new Login_Form();
                        form.setVisible(true);
                        form.pack();
                        form.setLocationRelativeTo(null);
                        this.dispose();
             
         }else if(answer == JOptionPane.CANCEL_OPTION){
             return;
         }
                    
        
    }//GEN-LAST:event_jButton_ExitMouseClicked

    private void jButton_addProduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addProduct1ActionPerformed
        // TODO add your handling code here:
        
       addProduct_Form form = new addProduct_Form();
       form.setVisible(true);
       form.pack();
       form.setLocationRelativeTo(null);
       // close current menu form
       this.dispose();
        
    }//GEN-LAST:event_jButton_addProduct1ActionPerformed

    private void jButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_ExitActionPerformed

    private void allProductsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_allProductsFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_allProductsFocusGained

    private void allProductsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_allProductsFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_allProductsFocusLost

    private void allProductsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allProductsMouseEntered
        // TODO add your handling code here:
        
        allProducts.setBackground(new Color(0,51,204));
        
    }//GEN-LAST:event_allProductsMouseEntered

    private void allProductsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allProductsMouseExited
        // TODO add your handling code here:
        allProducts.setBackground(Color.black);
    }//GEN-LAST:event_allProductsMouseExited

    private void allProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allProductsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allProductsActionPerformed

    private void allProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allProductsMouseClicked
        // TODO add your handling code here:
                        All_Products ap = new All_Products();
                        ap.setVisible(true);
                        ap.pack();
                        ap.setLocationRelativeTo(null);
                        this.dispose();
             
    }//GEN-LAST:event_allProductsMouseClicked

    private void WalletMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WalletMouseEntered
        // TODO add your handling code here:
        
        Wallet.setBackground(Color.blue);
        
    }//GEN-LAST:event_WalletMouseEntered

    private void WalletMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WalletMouseExited
        // TODO add your handling code here:
        Wallet.setBackground(Color.black);
        
    }//GEN-LAST:event_WalletMouseExited

    private void WalletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WalletMouseClicked
        // TODO add your handling code here:
        
                        Wallet_Form wf = new Wallet_Form();
                        wf.setVisible(true);
                        wf.pack();
                        wf.setLocationRelativeTo(null);
                        this.dispose();
        
    }//GEN-LAST:event_WalletMouseClicked

    private void jButton_favProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_favProductsActionPerformed
        // TODO add your handling code here:
        
                        My_Products form = new My_Products();
                        form.setVisible(true);
                        form.pack();
                        form.setLocationRelativeTo(null);
                        this.dispose();
                        
    }//GEN-LAST:event_jButton_favProductsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Wallet;
    private javax.swing.JButton allProducts;
    private javax.swing.JButton jButton_Exit;
    private javax.swing.JButton jButton_addProduct1;
    private javax.swing.JButton jButton_favProducts;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_minimize;
    public static javax.swing.JLabel jLabel_welcomeName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    // End of variables declaration//GEN-END:variables
}