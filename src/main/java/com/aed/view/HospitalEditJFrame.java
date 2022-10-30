/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.aed.view;

import com.aed.aedlab2.AedLab2;
import static com.aed.aedlab2.AedLab2.communityMap;
import static com.aed.aedlab2.AedLab2.hospitalMap;
import com.aed.model.Community;
import com.aed.model.Docter;
import com.aed.model.Hospital;
import com.aed.model.Person;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mg
 */
public class HospitalEditJFrame extends javax.swing.JFrame {
    int personId = 0;
    String communityName = "";

    /**
     * Creates new form HospitalEditJFrame
     */
    public HospitalEditJFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        resetButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hospitalTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hNameField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        cNameField = new javax.swing.JTextField();
        zipcodField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(203, 227, 250));
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

        jPanel2.setBackground(new java.awt.Color(203, 227, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hospitalTable.setModel(new javax.swing.table.DefaultTableModel(
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
        hospitalTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hospitalTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(hospitalTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 209));

        jPanel3.setBackground(new java.awt.Color(203, 227, 250));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Hospital Name");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("City");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Community Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("ZipCode");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hNameField)
                    .addComponent(cityField)
                    .addComponent(cNameField)
                    .addComponent(zipcodField, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(hNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipcodField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        hNameField.setText("");
        cNameField.setText("");
        cityField.setText("");
        zipcodField.setText("");
        
    }//GEN-LAST:event_resetButtonActionPerformed

    private void resetAction(){
        hNameField.setText("");
        cNameField.setText("");
        cityField.setText("");
        zipcodField.setText("");
    }
    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        

        if (personId != 0) {
            // add validation, one of the field must be changed, only then update
            Hospital h = hospitalMap.get(personId);
            Community c = AedLab2.communityMap.get(h.getCommunityId());
            
            if(cNameField.getText().equals(c.getName()) && zipcodField.getText().equals(c.getZipcode())){
                h.setHospitalId(personId);
                h.setName(hNameField.getText());
                h.setCity(cityField.getText());
            }
            else{
                JOptionPane.showMessageDialog(this, "Community Name and ZipCode cannot be updated");
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
            for (Integer id : hospitalMap.keySet()) {
                Hospital h = hospitalMap.get(id);
                if (h.getHospitalId() == personId) {
                    hospitalMap.remove(id);
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
            ArrayList<Integer> arr = new ArrayList<Integer>();
            String name = hNameField.getText();
            String city = cityField.getText();
            
            String comm = cNameField.getText();
            String zip = zipcodField.getText(); 
            Community c = null;
            for(Integer id: communityMap.keySet()){
                if(communityMap.get(id).getName().equalsIgnoreCase(comm)){
                    c = communityMap.get(id);
                    break;
                }
            }
            
            int newHospitalId = AedLab2.hospitalId++;
            if(c==null){
                c = new Community(AedLab2.communityId++, comm, city, zip, new ArrayList<Integer>(), new ArrayList<Integer>());
                c.getHospitalId().add(newHospitalId);
                communityMap.put(c.getCommunityId(), c);
            }
            
            
            Hospital h = new Hospital(newHospitalId, name, city, new ArrayList<Integer>(), new ArrayList<Integer>());
            h.getCommunityId().add(c.getCommunityId());
            hospitalMap.put(h.getHospitalId(), h);
            
            //}
        JOptionPane.showMessageDialog(null, "Record submitted");
        setTable();
        resetAction();
    }//GEN-LAST:event_createButtonActionPerformed

    private void hospitalTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hospitalTableMouseClicked
        // TODO add your handling code here:
        
        personId = Integer.parseInt(hospitalTable.getValueAt
            (hospitalTable.getSelectedRow(), NORMAL).toString());
        
        String communityName = hospitalTable.getValueAt(hospitalTable.getSelectedRow(), 3).toString();
        String zipcode = hospitalTable.getValueAt(hospitalTable.getSelectedRow(), 4).toString();
        Hospital obj = AedLab2.hospitalMap.get(personId);
        hNameField.setText(obj.getName());
        cityField.setText(obj.getCity() + "");
        
       // Community c = AedLab2.communityMap.get(obj.getCommunityId());
        cNameField.setText(communityName);
        zipcodField.setText(zipcode);
        
    }//GEN-LAST:event_hospitalTableMouseClicked
    
    private void setTable(){
    int rIndex = 0;
       List<List<String>> dataDynamic = new ArrayList<>();
        for(Integer id: hospitalMap.keySet()){
            //System.out.println("HOSPITAL ID: " + id);
            Hospital c = AedLab2.hospitalMap.get(id);
           
            for(int i = 0; i< c.getCommunityId().size() ; i++){
                List<String> row = new ArrayList();
                Community d = AedLab2.communityMap.get(c.getCommunityId().get(i)); //200
                //Person p = AedLab2.personMap.get(d.getPersonId());
                row.add(String.valueOf(c.getHospitalId()));
                //row.add(d.getName());
                row.add(c.getName());
                row.add(c.getCity());
                row.add(d.getName());
                //row.add(String.valueOf(c.getHospitalId()));
                row.add(d.getZipcode());
                dataDynamic.add(row);
                
            }
            
        }
        
        String data[][] = new String[dataDynamic.size()][dataDynamic.get(0).size()];
        for(int i = 0; i < dataDynamic.size(); i++){
            for(int j = 0; j < dataDynamic.get(i).size(); j++){
                data[i][j] = dataDynamic.get(i).get(j);
            }
        }
        
        String[] col = {"Hospital ID", "Name", "City", "Community Name", "ZipCode"};

        DefaultTableModel model = new DefaultTableModel(data, col);
        hospitalTable.setModel(model);
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
            java.util.logging.Logger.getLogger(HospitalEditJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalEditJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalEditJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalEditJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalEditJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cNameField;
    private javax.swing.JTextField cityField;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField hNameField;
    private javax.swing.JTable hospitalTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField zipcodField;
    // End of variables declaration//GEN-END:variables
}