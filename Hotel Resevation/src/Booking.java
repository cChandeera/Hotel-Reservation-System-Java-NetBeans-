
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author CHANDEERA
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


 
public class Booking extends javax.swing.JFrame {

    /**
     * Creates new form Booking
     */
    public Booking() {
        initComponents();
        lblBill.setVisible(false);
        lblDate.setVisible(false);
    }

    double total = 0;
    double convert ;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAdult = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDays = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtChild = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rdoSingle = new javax.swing.JRadioButton();
        rdoTwin = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        balcony = new javax.swing.JCheckBox();
        checkDinner = new javax.swing.JCheckBox();
        sea = new javax.swing.JCheckBox();
        pool = new javax.swing.JCheckBox();
        checkLunch = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtName2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        rdoKing = new javax.swing.JRadioButton();
        rdoCash = new javax.swing.JRadioButton();
        rdoVisa = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtDisplay = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtLkr = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        comRoom = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lblBill = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        calender1 = new com.toedter.calendar.JCalendar();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(880, 560));
        setName("booking"); // NOI18N
        setPreferredSize(new java.awt.Dimension(860, 670));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 26)); // NOI18N
        jLabel1.setText("Booking Your Stay");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 260, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel2.setText("Adults (max 6)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 120, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel3.setText("How Long (Dates) :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 160, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel4.setText("Check in date :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 120, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel5.setText("Number of guest :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 150, -1));

        txtAdult.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(txtAdult);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 110, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel6.setText("Childrens (max 8)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 140, -1));

        txtDays.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(txtDays);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 100, 30));

        txtChild.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane3.setViewportView(txtChild);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 100, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel7.setText("( Breakfast Included)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 170, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel8.setText("Payment :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 90, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel9.setText("How many Rooms :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 160, -1));

        buttonGroup1.add(rdoSingle);
        rdoSingle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        rdoSingle.setText("Single");
        getContentPane().add(rdoSingle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 70, 30));

        buttonGroup1.add(rdoTwin);
        rdoTwin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        rdoTwin.setText("Twin");
        getContentPane().add(rdoTwin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 70, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel10.setText("Beds :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 50, -1));

        balcony.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        balcony.setText("Balcony");
        getContentPane().add(balcony, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        checkDinner.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        checkDinner.setText("Dinner");
        getContentPane().add(checkDinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 80, 20));

        sea.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        sea.setText("Sea view");
        getContentPane().add(sea, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        pool.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        pool.setText("Privet Pool");
        getContentPane().add(pool, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        checkLunch.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        checkLunch.setText("Lunch");
        getContentPane().add(checkLunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 70, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel11.setText("(Max 8)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 70, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Email :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 270, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("First name :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        txtName1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        getContentPane().add(txtName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 140, -1));

        jButton1.setBackground(new java.awt.Color(23, 34, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 19)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("I'll Reserve");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 160, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("Last name :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, -1));

        txtName2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        getContentPane().add(txtName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 140, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setText("Phone number :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        txtPhone.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        getContentPane().add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 190, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setText("Country :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        txtCountry.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        getContentPane().add(txtCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 150, -1));

        buttonGroup1.add(rdoKing);
        rdoKing.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        rdoKing.setText("King");
        getContentPane().add(rdoKing, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 60, 30));

        buttonGroup2.add(rdoCash);
        rdoCash.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        rdoCash.setText("Cash");
        getContentPane().add(rdoCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, 20));

        buttonGroup2.add(rdoVisa);
        rdoVisa.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        rdoVisa.setText("Visa/Master Card (5% off)");
        getContentPane().add(rdoVisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, 20));

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel17.setText("Meals :");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 70, -1));

        jPanel1.setBackground(new java.awt.Color(177, 201, 255));

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel18.setText("~ LKR.");

        txtDisplay.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisplayActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 0, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 255, 255));
        jButton2.setText("Calculate");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtLkr.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel20.setText("Total : $.");

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel19.setText("( All Discount added )");

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel21.setText("( 1 USD = 290 LKR )");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel19)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtLkr, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(jLabel21)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(txtLkr, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(9, 9, 9))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 380, 140));

        comRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 01", " 02", " 03", " 04", " 05", " 06", " 07", " 08" }));
        getContentPane().add(comRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, 30));

        jButton3.setBackground(new java.awt.Color(245, 83, 30));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 100, 30));

        jButton4.setBackground(new java.awt.Color(0, 192, 18));
        jButton4.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jButton4.setText("Go back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 100, 30));

        jButton5.setBackground(new java.awt.Color(255, 0, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Invoice >>");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 110, 30));
        getContentPane().add(lblBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, -1, -1));
        getContentPane().add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        calender1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        getContentPane().add(calender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 390, 200));

        jLabel22.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 0));
        jLabel22.setText("Your Details");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 358, 140, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("© 2025 Villa Saltasia ");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 600, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisplayActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
       
        double bill = 0;
        String checking;
        
        String days = txtDays.getText();
        int numDay = Integer.parseInt(days);
        
        String adult = txtAdult.getText();
        int numAdult = Integer.parseInt(adult);
        
        String child = txtChild.getText();
        int numChild = Integer.parseInt(child);
        
        int room = comRoom.getSelectedIndex();
        
        
        
       // String room = (String)comRoom.getSelectedItem();
       // int numRoom = Integer.parseInt(room);
        
       /* if(room == 0){
          total = 1 * numDay * 100;
        }
        else if(room == 1){
          total = 1 * numDay * 100;  
        }
        else if(room == 1){
          total = 1 * numDay * 100;  
        }
        else if(room == 1){
          total = 1 * numDay * 100;  
        }
        else if(room == 1){
          total = 1 * numDay * 100;  
        }
        */
       if( numAdult > 6 || numChild > 8){
          JOptionPane.showMessageDialog(this,"Invalid number of Adults or Childrens"); 
       }
       else{
       
            switch(room){

                case 0:
                    total = 1 * numDay * 100;
                  //Pool,Sea view,Balcony
                    if(pool.isSelected()){
                        total = total + (20*1);
                    }
                    if(sea.isSelected()){
                        total = total + (10*1);
                    }
                    if(balcony.isSelected()){
                        total = total + (5*1);
                    }
                    
                  //Beds
                    if(rdoSingle.isSelected()){
                        total = total + (5*1);
                    }
                    if(rdoTwin.isSelected()){
                        total = total + (10*1);
                    }
                    if(rdoKing.isSelected()){
                        total = total + (15*1);
                    }
                     
                    break;
                case 1:
                    total = 2 * numDay * 100;
                    
                    if(pool.isSelected()){
                        total = total + (20*2);
                    }
                    if(sea.isSelected()){
                        total = total + (10*2);
                    }
                    if(balcony.isSelected()){
                        total = total + (5*2);
                    }
                    
                    if(rdoSingle.isSelected()){
                        total = total + (5*2);
                    }
                    if(rdoTwin.isSelected()){
                        total = total + (10*2);
                    }
                    if(rdoKing.isSelected()){
                        total = total + (15*2);
                    }
                    break;
                case 2:
                    total = 3 * numDay * 100;
                    
                    if(pool.isSelected()){
                        total = total + (20*3);
                    }
                    if(sea.isSelected()){
                        total = total + (10*3);
                    }
                    if(balcony.isSelected()){
                        total = total + (5*3);
                    }
                    
                    if(rdoSingle.isSelected()){
                        total = total + (5*3);
                    }
                    if(rdoTwin.isSelected()){
                        total = total + (10*3);
                    }
                    if(rdoKing.isSelected()){
                        total = total + (15*3);
                    }
                    break;
                case 3:
                    total = 4 * numDay * 100;
                    
                    if(pool.isSelected()){
                        total = total + (20*4);
                    }
                    if(sea.isSelected()){
                        total = total + (10*4);
                    }
                    if(balcony.isSelected()){
                        total = total + (5*4);
                    }
                    
                    if(rdoSingle.isSelected()){
                        total = total + (5*4);
                    }
                    if(rdoTwin.isSelected()){
                        total = total + (10*4);
                    }
                    if(rdoKing.isSelected()){
                        total = total + (15*4);
                    }
                    break;
                case 4:
                    total = 5 * numDay * 100;
                    
                    if(pool.isSelected()){
                        total = total + (20*5);
                    }
                    if(sea.isSelected()){
                        total = total + (10*5);
                    }
                    if(balcony.isSelected()){
                        total = total + (5*5);
                    }
                    
                    if(rdoSingle.isSelected()){
                        total = total + (5*5);
                    }
                    if(rdoTwin.isSelected()){
                        total = total + (10*5);
                    }
                    if(rdoKing.isSelected()){
                        total = total + (15*5);
                    }
                    break;
                case 5:
                    total = 6 * numDay * 100;
                    
                    if(pool.isSelected()){
                        total = total + (20*6);
                    }
                    if(sea.isSelected()){
                        total = total + (10*6);
                    }
                    if(balcony.isSelected()){
                        total = total + (5*6);
                    }
                    
                    if(rdoSingle.isSelected()){
                        total = total + (5*6);
                    }
                    if(rdoTwin.isSelected()){
                        total = total + (10*6);
                    }
                    if(rdoKing.isSelected()){
                        total = total + (15*7);
                    }
                    break;
                case 6:
                    total = 7 * numDay * 100;
                    
                    if(pool.isSelected()){
                        total = total + (20*7);
                    }
                    if(sea.isSelected()){
                        total = total + (10*7);
                    }
                    if(balcony.isSelected()){
                        total = total + (5*7);
                    }
                    
                    if(rdoSingle.isSelected()){
                        total = total + (5*7);
                    }
                    if(rdoTwin.isSelected()){
                        total = total + (10*7);
                    }
                    if(rdoKing.isSelected()){
                        total = total + (15*7);
                    }
                    break;
                case 7:
                    total = 8 * numDay * 100;
                    
                    if(pool.isSelected()){
                        total = total + (20*8);
                    }
                    if(sea.isSelected()){
                        total = total + (10*8);
                    }
                    if(balcony.isSelected()){
                        total = total + (5*8);
                    }
                    
                    if(rdoSingle.isSelected()){
                        total = total + (5*8);
                    }
                    if(rdoTwin.isSelected()){
                        total = total + (10*8);
                    }
                    if(rdoKing.isSelected()){
                        total = total + (15*8);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(this,"Invalid Room Input");
                    break;
            }
        
       //Meals
            if(checkLunch.isSelected()){
                total = total + (10*(numAdult+numChild)*numDay);
            }
            if(checkDinner.isSelected()){
                total = total + (20*(numAdult+numChild)*numDay);
            }
        //Dicount
            if(rdoVisa.isSelected()){
                total = total - (total * 5/100);
            }
            else if(rdoCash.isSelected()){
                total = total;
            }
        
       } 
        txtDisplay.setText(Double.toString(total));
       // double convert ;
        convert = total * 290;
        txtLkr.setText(Double.toString(convert));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String firstName = txtName1.getText();
        String lastName = txtName2.getText();
        String email = txtEmail.getText();
        String phone  = txtPhone.getText();
        String country = txtCountry.getText();
      // int phoneNumber = Integer.parseInt(phone);
        
        if(total == 0){
            JOptionPane.showMessageDialog(this,"Your are not Selected anything !!","Invalid Total",JOptionPane.ERROR_MESSAGE);
        }
        else if(!firstName.matches("[a-zA-Z]+")){
            JOptionPane.showMessageDialog(this,"First Name only include (a-z , A-Z)","Invalid First Name",JOptionPane.ERROR_MESSAGE);
        }
        else if(!lastName.matches("[a-zA-Z]+")){
            JOptionPane.showMessageDialog(this,"Last Name only include (a-z , A-Z)","Invalid Last Name",JOptionPane.ERROR_MESSAGE);
        }
        else if(!email.contains("@gmail") || !email.endsWith(".com")){
            JOptionPane.showMessageDialog(this,"Invalid Email, email must contain with '@gmail' and End with '.com'","Invalid Email",JOptionPane.ERROR_MESSAGE);
        }
        else if(!phone.matches("[0-9]+")){
            JOptionPane.showMessageDialog(this,"Invalid Phone Number,phone number must contains with (0-9) numbers","phone number Errror",JOptionPane.ERROR_MESSAGE);
        }
        else if(!country.matches("[a-zA-Z]+")){
            JOptionPane.showMessageDialog(this,"Invalid Country name , country name only contain with a-z and A-Z","Invalid Country",JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this,"* Resevation Completed *"+"\n"+"Please Check your Invoice","Resevation Completed",JOptionPane.PLAIN_MESSAGE);
        }
     //Date picker   
        
        Date date = calender1.getDate();
        DateFormat format = new SimpleDateFormat("dd/mm/yy");
        lblDate.setText(format.format(date));
        String checking = lblDate.getText();
        
      //  txtArea.setVisible(false);
        
        lblBill.setText(        "--------------------------------------------------"+"\n"
                        +"PAYMENT SUCCESSFUL"+"\n"
                                +"--------------------------------------------------"+"\n"
                        +"Your name : "+firstName+" "+lastName+"\n"
                        +"Email : "+email+"\n"
                        +"Phone number : "+phone+"\n"
                        +"Country : "+country+"\n"
                                +"--------------------------------------------------"+"\n"
                        +"Total Bill Value : $ "+total+ "  " + "("+"LKR "+ convert + ")"+
                                                        "\n"+ " (* All Discounts Added *)" +"\n"
                        +"Checking Date : "+ checking +"\n"
                                +"--------------------------------------------------"+"\n"
                        +"THANK YOU FOR CHOOSING US !!"+"\n"
                        +"we are exite to see you !!"+"\n"
                                +"--------------------------------------------------"+"\n"
                        +"__________Villa SALTASIYA__________"
                                                                );
        
      
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       HotelResevation home = new HotelResevation();
       home.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        String data = lblBill.getText();
        new Invoice(data).setVisible(true);
        setVisible(false);
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       txtDays.setText(null);
       txtAdult.setText(null);
       txtChild.setText(null);
       txtName1.setText(null);
       txtName2.setText(null);
       txtEmail.setText(null);
       txtPhone.setText(null);
       txtCountry.setText(null);
       
       buttonGroup1.clearSelection();
       buttonGroup2.clearSelection();
       
       pool.setSelected(false);
       sea.setSelected(false);
       balcony.setSelected(false);
       checkLunch.setSelected(false);
       checkDinner.setSelected(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox balcony;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private com.toedter.calendar.JCalendar calender1;
    private javax.swing.JCheckBox checkDinner;
    private javax.swing.JCheckBox checkLunch;
    private javax.swing.JComboBox<String> comRoom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBill;
    private javax.swing.JLabel lblDate;
    private javax.swing.JCheckBox pool;
    private javax.swing.JRadioButton rdoCash;
    private javax.swing.JRadioButton rdoKing;
    private javax.swing.JRadioButton rdoSingle;
    private javax.swing.JRadioButton rdoTwin;
    private javax.swing.JRadioButton rdoVisa;
    private javax.swing.JCheckBox sea;
    private javax.swing.JTextPane txtAdult;
    private javax.swing.JTextPane txtChild;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextPane txtDays;
    private javax.swing.JTextField txtDisplay;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLkr;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtName2;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables

    void visible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Object setText() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class JoptionPane {

        private static void showMessageDialog(String sdcfdwfdwf) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public JoptionPane() {
        }
    }
}
