/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.aed.view;

import com.aed.aedlab2.AedLab2;
import static com.aed.aedlab2.AedLab2.communityMap;
import static com.aed.aedlab2.AedLab2.personMap;
import com.aed.model.Community;
import com.aed.model.Person;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mg
 */
public class CreatePersonJFrame extends javax.swing.JFrame {
    int id =1, personId=0;
    String genderValue = "";

    /**
     * Creates new form CreatePersonJFrame
     */
    public CreatePersonJFrame() {
        initComponents();
        setTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        uNameField = new javax.swing.JTextField();
        houseField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        otherRadioButton = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        resetButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        personTable = new javax.swing.JTable();
        passField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Age");

        jLabel3.setText("UserName");

        jLabel4.setText("Password");

        genderLabel.setText("Gender");

        jLabel7.setText("HouseID");

        maleRadioButton.setSelected(true);
        maleRadioButton.setText("MALE");
        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });

        femaleRadioButton.setText("FEMALE");
        femaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioButtonActionPerformed(evt);
            }
        });

        otherRadioButton.setText("OTHER");
        otherRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherRadioButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(179, 216, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        jPanel1.add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 130, 50));

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 130, 50));

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 130, 50));

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        jPanel1.add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 130, 50));

        personTable.setModel(new javax.swing.table.DefaultTableModel(
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
        personTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(personTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(48, 48, 48))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(houseField, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(genderLabel)
                                .addGap(61, 61, 61)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(maleRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(femaleRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(otherRadioButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(passField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                .addComponent(ageField, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(houseField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(genderLabel)
                            .addComponent(maleRadioButton)
                            .addComponent(femaleRadioButton)
                            .addComponent(otherRadioButton)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        nameField.setText("");
        uNameField.setText("");
        ageField.setText("");
        maleRadioButton.setSelected(true);
        femaleRadioButton.setSelected(false);
        otherRadioButton.setSelected(false);
        houseField.setText("");
        passField.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:

        if (personId != 0) {
            // add validation, one of the field must be changed, only then update
            Person c = personMap.get(personId);

            c.setPersonID(personId);
            c.setName(nameField.getText());
            c.setUserName(uNameField.getText());
            c.setPassword(passField.getText());
            c.setRole("PATIENT");
            c.setPhoto("");
            c.setAge(Integer.parseInt(ageField.getText()));
            c.setHouseID(Integer.parseInt(houseField.getText()));
            if(maleRadioButton.isSelected()){
                c.setGender("MALE");
            }
            if(femaleRadioButton.isSelected()){
                c.setGender("FEMALE");
            }
            if(otherRadioButton.isSelected()){
                c.setGender("OTHER");
            }
        }//if
        JOptionPane.showMessageDialog(this, "Record Updated");
        setTable();
        resetAction();
        personId = 0;
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        if (personId != 0) {
            for (Integer id : personMap.keySet()) {
                Person c = AedLab2.personMap.get(id);
                if (c.getPersonID()== personId) {
                    personMap.remove(id);
                    break;
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Deleted");
        resetAction();
        setTable();
        personId = 0;
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        // if(validationAction()){

            String name = nameField.getText();
            String uName = uNameField.getText();
            String pass = passField.getText();
            String role = "PATIENT";
            int age = Integer.parseInt(ageField.getText());
            String gender = genderValue;
            int houseId = Integer.parseInt(houseField.getText());

            personMap.put(AedLab2.personId, new Person(AedLab2.personId++, name, uName, pass, role, age, gender, "", houseId));
            //}
        JOptionPane.showMessageDialog(null, "Record submitted");
        setTable();
        resetAction();
    }//GEN-LAST:event_createButtonActionPerformed

    private void personTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personTableMouseClicked
        // TODO add your handling code here:
        String genderValue = "";
        personId = Integer.parseInt(personTable.getValueAt
            (personTable.getSelectedRow(), NORMAL).toString());
        Person obj = AedLab2.personMap.get(personId);

        nameField.setText(obj.getName());
        uNameField.setText(obj.getUserName());
        ageField.setText(obj.getAge() + "");
        houseField.setText(obj.getHouseID() + "");
        passField.setText(obj.getPassword());
        String gValue = obj.getGender();
        if(gValue == "MALE"){
            genderValue="MALE";
            maleRadioButton.setSelected(true);
            femaleRadioButton.setSelected(false);
            otherRadioButton.setSelected(false);
        }
        else if(gValue == "FEMALE"){
            genderValue="FEMALE";
            femaleRadioButton.setSelected(true);
            otherRadioButton.setSelected(false);
            maleRadioButton.setSelected(false);
        }
        else{
            genderValue="OTHER";
            otherRadioButton.setSelected(true);
            maleRadioButton.setSelected(false);
            femaleRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_personTableMouseClicked

    private void femaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioButtonActionPerformed
        // TODO add your handling code here:
        genderValue = "FEMALE";
        femaleRadioButton.setSelected(true);
        maleRadioButton.setSelected(false);
        otherRadioButton.setSelected(false);
        //}
    }//GEN-LAST:event_femaleRadioButtonActionPerformed

    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButtonActionPerformed
        // TODO add your handling code here:
            genderValue = "MALE";
            maleRadioButton.setSelected(true);
            femaleRadioButton.setSelected(false);
            otherRadioButton.setSelected(false);
        //}
    }//GEN-LAST:event_maleRadioButtonActionPerformed

    private void otherRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherRadioButtonActionPerformed
        // TODO add your handling code here:
            genderValue = "OTHER";
            maleRadioButton.setSelected(false);
            femaleRadioButton.setSelected(false);
            otherRadioButton.setSelected(true);
        //}    
    }//GEN-LAST:event_otherRadioButtonActionPerformed

    private void setTable(){
    int rIndex = 0;
        //DateTimeFormatter dateFormatter3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String[][] data = new String[personMap.size()][6];
        //Community.sort(communityMap, new SortById());
        for(Integer id: personMap.keySet()){
            Person c = AedLab2.personMap.get(id);
           
            //data[rIndex][0]=String.valueOf(e.getEmployeeID());
            data[rIndex][0] = c.getPersonID()+ "";
            data[rIndex][1] = c.getName();
            data[rIndex][2] = c.getUserName(); //String.valueOf(e.getAge());
            data[rIndex][3] = String.valueOf(c.getAge());
            data[rIndex][4] = c.getGender();
            data[rIndex][5] = String.valueOf(c.getHouseID());
            
            rIndex++;
        }

        String[] col = {"ID", "Name", "UserName", "Age", "Gender", "HouseID"};

        DefaultTableModel model = new DefaultTableModel(data, col);
        personTable.setModel(model);
    }
    
    private void resetAction(){
        nameField.setText("");
        uNameField.setText("");
        ageField.setText("");
        maleRadioButton.setSelected(true);
        femaleRadioButton.setSelected(false);
        otherRadioButton.setSelected(false);
        houseField.setText("");
        passField.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(CreatePersonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatePersonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatePersonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatePersonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatePersonJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField houseField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JRadioButton otherRadioButton;
    private javax.swing.JPasswordField passField;
    private javax.swing.JTable personTable;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField uNameField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
