/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import lapr.project.controller.SubmitApplicationController;
import lapr.project.model.Application;
import lapr.project.model.Enterprise;
import lapr.project.model.Event;
import lapr.project.model.EventCenter;
import lapr.project.model.EventRegistry;
import lapr.project.model.Keyword;
import lapr.project.model.Product;
import lapr.project.model.ProductList;
import lapr.project.model.Stand;
import lapr.project.model.StandRegistry;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class SubmitApplication extends javax.swing.JFrame {

    private static final long serialVersionUID = 1;
    private DefaultListModel<Keyword> modelKeyword = new DefaultListModel<>();
    private StandRegistry standRegistry;
    private ProductList productList;
    private EventRegistry eventRegistry;
    private Event event;

    /**
     * Creates new form SubmitApplication
     *
     * @param eventCenter
     * @throws java.text.ParseException
     */
    public SubmitApplication(EventCenter eventCenter) throws ParseException {
        SubmitApplicationController controller = new SubmitApplicationController(eventCenter);
        this.standRegistry = controller.getStandRegistry();
        this.productList = controller.getProductList();
        this.eventRegistry = controller.getEventRegistry();
        initComponents();
        keywordJList.setModel(modelKeyword);
        initCombobox();
        this.pack();
        setVisible(true);
    }

    private void initCombobox() {
        for (int i = 0; i < this.eventRegistry.size(); i++) {
            eventsComboBox.addItem(eventRegistry.getEvent(i));
        }
        for (int i = 0; i < this.productList.size(); i++) {
            productsComboBox.addItem(productList.getProduct(i));
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFrame1 = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        eventsComboBox = new javax.swing.JComboBox<Event>();
        enterpriseNameTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        taxpayerNumberTextField = new javax.swing.JTextField();
        contactTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        standlistLabel = new javax.swing.JLabel();
        invitesLabel = new javax.swing.JLabel();
        invitesTextField = new javax.swing.JTextField();
        productsComboBox = new javax.swing.JComboBox<Product>();
        productsLabel = new javax.swing.JLabel();
        keywordTextField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        keywordJList = new javax.swing.JList<Keyword>();
        addKeywordBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dateBeginLabel = new javax.swing.JLabel();
        dateEndLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        pretendedAreaTextField = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Submit Application");
        setResizable(false);

        jLabel3.setText("Enteprise name:");

        jLabel8.setText("Keywords:");

        jLabel4.setText("Taxpayer Number:");

        jLabel1.setText("Description:");

        jLabel5.setText("Contact number:");

        jLabel2.setText("Event:");

        jLabel6.setText("Email:");

        eventsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventsComboBoxActionPerformed(evt);
            }
        });

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionTextArea);

        jLabel7.setText("Address:");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        standlistLabel.setText("Stand List:");

        invitesLabel.setText("Invites:");

        productsLabel.setText("Products:");

        jScrollPane3.setViewportView(keywordJList);

        addKeywordBtn.setText("Add Keyword");
        addKeywordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addKeywordBtnActionPerformed(evt);
            }
        });

        jLabel9.setText("Begins:");

        jLabel10.setText("Ends:");

        pretendedAreaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pretendedAreaTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productsLabel)
                            .addComponent(standlistLabel)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateBeginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateEndLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(addressTextField)
                    .addComponent(emailTextField)
                    .addComponent(contactTextField)
                    .addComponent(taxpayerNumberTextField)
                    .addComponent(enterpriseNameTextField)
                    .addComponent(locationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eventsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(keywordTextField)
                            .addComponent(addKeywordBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(pretendedAreaTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(invitesLabel)
                                .addGap(18, 18, 18)
                                .addComponent(invitesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))
                    .addComponent(productsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelButton)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateBeginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(dateEndLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(locationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(enterpriseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(taxpayerNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(keywordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addKeywordBtn))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(standlistLabel)
                    .addComponent(pretendedAreaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invitesLabel)
                    .addComponent(invitesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productsLabel))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitButton)
                    .addComponent(cancelButton)))
        );

        setSize(new java.awt.Dimension(498, 612));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        if (validateTaxpayerNumber() && validateContact() && validateInvites()) {
            String enterpriseName = enterpriseNameTextField.getText();
            String email = emailTextField.getText();
            String address = addressTextField.getText();
            String description = descriptionTextArea.getText();
            float area = Float.parseFloat(pretendedAreaTextField.getText());
            int invites = Integer.parseInt(invitesTextField.getText());
            int taxpayerNumber = Integer.parseInt(taxpayerNumberTextField.getText());
            int contactNumber = Integer.parseInt(contactTextField.getText());
            Product product = (Product) productsComboBox.getSelectedItem();
            Enterprise enterprise = new Enterprise(enterpriseName, email, address, taxpayerNumber, contactNumber);
            Application a = new Application(enterprise, invites, description, area);
            eventRegistry.getEvent(eventsComboBox.getSelectedIndex()).getApplicationsList().addApplication(a);
            for (int i = 0; i < modelKeyword.size(); i++) {
                a.getKeywordList().addKeyword(modelKeyword.elementAt(i));
            }
            eventRegistry.getEvent(eventsComboBox.getSelectedIndex()).getEventEmployeeList().getEmployee(0).getApplicationList().addApplication(a);
            dispose();
        }

    }//GEN-LAST:event_submitButtonActionPerformed
    private boolean validateInvites() {
        String stringInvites = invitesTextField.getText();
        try {
            int invites = Integer.parseInt(stringInvites);
            if (invites <= 0) {
                JOptionPane.showMessageDialog(null, "Insert a number above zero");
                invitesTextField.setText("");
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid format number for invites (only numbers)");
            invitesTextField.setText("");
            return false;
        }
        return true;
    }

    private boolean validateContact() {
        String stringContact = contactTextField.getText();
        try {
            int contactNumber = Integer.parseInt(contactTextField.getText());
            if (stringContact.length() == 9) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Insert 9 digits on contact text field");
                contactTextField.setText("");
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid format in contact Number(only numbers))");
            contactTextField.setText("");
            return false;
        }
    }

    private boolean validateTaxpayerNumber() {
        String stringTaxpayer = taxpayerNumberTextField.getText();
        try {
            int taxpayerNumber = Integer.parseInt(taxpayerNumberTextField.getText());
            if (stringTaxpayer.length() == 9) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Insert 9 digits on taxpayer number text field");
                taxpayerNumberTextField.setText("");
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid format in Taxpayer Number(only numbers))");
            taxpayerNumberTextField.setText("");
            return false;
        }
    }
    private void eventsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventsComboBoxActionPerformed
        Event e = (Event) eventsComboBox.getSelectedItem();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        dateBeginLabel.setText(sdf.format(e.getEventBegin()));
        dateEndLabel.setText(sdf.format(e.getEventEnd()));
        locationLabel.setText(e.getLocal().toString());
        revalidate();
    }//GEN-LAST:event_eventsComboBoxActionPerformed

    private void addKeywordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addKeywordBtnActionPerformed
        String stringKeyword = keywordTextField.getText();
        if (!stringKeyword.isEmpty()) {
            Keyword keyword = new Keyword(stringKeyword);
            modelKeyword.addElement(keyword);
            keywordTextField.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please insert a keyword");
        }
    }//GEN-LAST:event_addKeywordBtnActionPerformed

    private void pretendedAreaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pretendedAreaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pretendedAreaTextFieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addKeywordBtn;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField contactTextField;
    private javax.swing.JLabel dateBeginLabel;
    private javax.swing.JLabel dateEndLabel;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField enterpriseNameTextField;
    private javax.swing.JComboBox<Event> eventsComboBox;
    private javax.swing.JLabel invitesLabel;
    private javax.swing.JTextField invitesTextField;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<Keyword> keywordJList;
    private javax.swing.JTextField keywordTextField;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JTextField pretendedAreaTextField;
    private javax.swing.JComboBox<Product> productsComboBox;
    private javax.swing.JLabel productsLabel;
    private javax.swing.JLabel standlistLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField taxpayerNumberTextField;
    // End of variables declaration//GEN-END:variables
}
