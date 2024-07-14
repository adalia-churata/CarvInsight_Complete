/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sac.CarvInsight.view;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import sac.CarvInsight.model.DAO.Asig_MaquinariaDAO;
import sac.CarvInsight.model.DAO.Asig_MaquinariaDAOImpl;
import sac.CarvInsight.model.DAO.Reg_UsoMaqDAO;
import sac.CarvInsight.model.DAO.Reg_UsoMaqDAOImpl;
import sac.CarvInsight.model.Reg_UsoMaq;
import sac.CarvInsight.util.Imgs;


/**
 *
 * @author adali
 */
public class RegistroUso extends javax.swing.JFrame {

    /**
     * Creates new form RegistroUso
     */
    Imgs Llenar = new Imgs();
    public RegistroUso() {
        initComponents();
       this.setLocationRelativeTo(null);
       cargarIcons();
       setDate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @return 
     */
    public void setDate(){
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yy");
        String fechaFormateada = formatoFecha.format(fechaActual);
        date.setText(fechaFormateada);
    }
    
    public String getDate(){
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yy/MM/dd");
        String nueva_fecha = formatoFecha.format(fechaActual);
        return nueva_fecha;
    }
    
    public int getId(){
        int id=Integer.parseInt(txtcode_asig.getText());
        return id;
    }
    public float getTime(){
        int hora=Integer.parseInt(txtHours.getText().trim());
        int minutes = Integer.parseInt(txtMinutes.getText().trim());
        float timeWork = ((hora*60) + (minutes));
        return timeWork;
    }
    public int getQuantities(){
        int quantities = Integer.parseInt(txtQuantities.getText().trim());
        return quantities;
    }
    
    public int getRejects(){
        int rejects = Integer.parseInt(txtRejects.getText().trim());
        return rejects;
    }
   
    private boolean fieldFilled() {
        return !txtcode_asig.getText().trim().isEmpty() &&
               !txtHours.getText().trim().isEmpty() &&
                !txtMinutes.getText().trim().isEmpty() &&
                !txtQuantities.getText().trim().isEmpty() &&
               !txtRejects.getText().trim().isEmpty();
    }
    
    private void clean(){
        txtcode_asig.setText("");
        txtHours.setText("");
        txtMinutes.setText("");
        txtQuantities.setText("");
        txtRejects.setText("");
        img_machine.setIcon(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon("src/img/fondo_C8CFD8.png");
        Image image = icon.getImage();
        desktopPane = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image, 0, 0, getWidth(), getHeight(),this);
            }
        };
        btn_Logout = new javax.swing.JButton();
        container1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtQuantities = new javax.swing.JTextField();
        txtRejects = new javax.swing.JTextField();
        txtHours = new javax.swing.JTextField();
        cboReason = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtMinutes = new javax.swing.JTextField();
        btn_Assignment = new javax.swing.JButton();
        txtcode_asig = new javax.swing.JTextField();
        img_machine = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        lbl_logo = new javax.swing.JLabel();
        lblDataEntry = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1400, 800));

        desktopPane.setForeground(new java.awt.Color(255, 255, 255));
        desktopPane.setMaximumSize(new java.awt.Dimension(1400, 800));

        btn_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LogoutMouseExited(evt);
            }
        });
        btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogoutActionPerformed(evt);
            }
        });
        desktopPane.setLayer(btn_Logout, javax.swing.JLayeredPane.POPUP_LAYER);
        desktopPane.add(btn_Logout);
        btn_Logout.setBounds(1080, 20, 260, 60);

        container1.setBackground(new java.awt.Color(21, 100, 192));
        container1.setMinimumSize(new java.awt.Dimension(0, 0));
        container1.setPreferredSize(new java.awt.Dimension(1400, 560));

        jPanel3.setBackground(new java.awt.Color(33, 36, 41));
        jPanel3.setPreferredSize(new java.awt.Dimension(910, 500));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("MS Gothic", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CODE ASSIGNMENT");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Operating Time");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Select reason of downtime:");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Quantities Produced");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Production Rejects");

        txtQuantities.setBackground(new java.awt.Color(217, 217, 217));
        txtQuantities.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        txtQuantities.setDisabledTextColor(new java.awt.Color(217, 217, 217));

        txtRejects.setBackground(new java.awt.Color(217, 217, 217));
        txtRejects.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        txtRejects.setDisabledTextColor(new java.awt.Color(217, 217, 217));

        txtHours.setBackground(new java.awt.Color(217, 217, 217));
        txtHours.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        txtHours.setDisabledTextColor(new java.awt.Color(217, 217, 217));

        cboReason.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        cboReason.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Falta de materia prima", "Máquina malograda", "Mantenimiento de máquina", "Limpieza de máquina", "Otro" }));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(":");

        txtMinutes.setBackground(new java.awt.Color(217, 217, 217));
        txtMinutes.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        txtMinutes.setDisabledTextColor(new java.awt.Color(217, 217, 217));

        btn_Assignment.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btn_Assignment.setText("Select Assignment");
        btn_Assignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AssignmentActionPerformed(evt);
            }
        });

        txtcode_asig.setBackground(new java.awt.Color(217, 217, 217));
        txtcode_asig.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        txtcode_asig.setForeground(new java.awt.Color(139, 139, 139));
        txtcode_asig.setDisabledTextColor(new java.awt.Color(217, 217, 217));
        txtcode_asig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcode_asigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtQuantities)
                                .addComponent(txtRejects))
                            .addComponent(cboReason, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txtHours, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(211, 211, 211))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtcode_asig)
                        .addGap(33, 33, 33)
                        .addComponent(btn_Assignment)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel8)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel9)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel10)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcode_asig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Assignment))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(txtQuantities, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txtRejects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cboReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("MS Gothic", 1, 48)); // NOI18N
        jButton1.setText("DONE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblDate.setBackground(new java.awt.Color(255, 255, 255));
        lblDate.setFont(new java.awt.Font("MS Gothic", 0, 48)); // NOI18N
        lblDate.setText("DATE:");

        date.setEditable(false);
        date.setBackground(new java.awt.Color(217, 217, 217));
        date.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        date.setForeground(new java.awt.Color(139, 139, 139));

        javax.swing.GroupLayout container1Layout = new javax.swing.GroupLayout(container1);
        container1.setLayout(container1Layout);
        container1Layout.setHorizontalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(80, 80, 80))
                    .addGroup(container1Layout.createSequentialGroup()
                        .addGroup(container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(img_machine, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(container1Layout.createSequentialGroup()
                                .addComponent(lblDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        container1Layout.setVerticalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container1Layout.createSequentialGroup()
                .addGroup(container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(container1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(container1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(img_machine, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        desktopPane.add(container1);
        container1.setBounds(60, 180, 1280, 560);

        lbl_logo.setBackground(new java.awt.Color(0, 51, 204));
        desktopPane.add(lbl_logo);
        lbl_logo.setBounds(0, 0, 1400, 100);

        lblDataEntry.setBackground(new java.awt.Color(21, 100, 192));
        lblDataEntry.setFont(new java.awt.Font("Lucida Console", 1, 48)); // NOI18N
        lblDataEntry.setText("Data Entry");
        desktopPane.add(lblDataEntry);
        lblDataEntry.setBounds(60, 110, 340, 50);

        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AssignmentActionPerformed
        // TODO add your handling code here:
        Assignment ventana = new Assignment();
        
        // Obtener el tamaño de la pantalla
         desktopPane.add(ventana);
        
        int x = (desktopPane.getWidth()/2) - ventana.getWidth()/2;
        int y = (desktopPane.getHeight()/2) - ventana.getHeight()/2;
        ventana.setLocation(x, y);
        ventana.show();
    }//GEN-LAST:event_btn_AssignmentActionPerformed

    private void btn_LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogoutMouseEntered
        Llenar.Img2Btn(btn_Logout, "btnLogOutHover");
    }//GEN-LAST:event_btn_LogoutMouseEntered

    private void btn_LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogoutMouseExited
         Llenar.Img2Btn(btn_Logout, "btnLogOut");
    }//GEN-LAST:event_btn_LogoutMouseExited

    private void btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogoutActionPerformed
        // TODO add your handling code here:
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_LogoutActionPerformed

    private void txtcode_asigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcode_asigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcode_asigActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //BTN DONE
        Asig_MaquinariaDAO as = new Asig_MaquinariaDAOImpl();
        if(fieldFilled()){
            Reg_UsoMaq reg = new Reg_UsoMaq();
            Reg_UsoMaqDAO r = new Reg_UsoMaqDAOImpl();
            
            reg.setId_asig(getId());
            reg.setTimeWork(getTime());
            reg.setQuantity(getQuantities());
            reg.setError(getRejects());
            reg.setDate(getDate());
            
            r.insert(reg);
            as.updateState(getId());
            UIManager.put("Button.background", Color.white);
            UIManager.put("control", new Color(	49, 107, 28));
            JOptionPane.showMessageDialog(null, "<html><div><p style='color:white; font-size: 20px;'>CONFIRMATION</p></div>"
                    + "<div><p style='color:white; font-size: 14px;'>Successful registration</p></div></html>","",JOptionPane.PLAIN_MESSAGE, Llenar.getIcon("success", 50, 50));
            clean();
        }else{
            //UIManager.put("OptionPane.background", Color.blue);
            //UIManager.put("Panel.background", Color.blue);
            UIManager.put("Button.background", Color.white);
            UIManager.put("control", new Color(	254, 74, 74));
            UIManager.put("nimbusBase", new Color(	207, 198, 198));
            JOptionPane.showMessageDialog(null, "<html><div><p style='color:white; font-size: 20px;'>ALERT !</p></div>"
                    + "<div><p style='color:white; font-size: 14px;'>Field not completed</p></div></html>","",JOptionPane.PLAIN_MESSAGE, Llenar.getIcon("alert", 50, 50));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cargarIcons(){
        Llenar.Img2Label(lbl_logo, "NewHead");
        Llenar.Img2Btn(btn_Logout, "btnLogOut");
        lblDate.setForeground(Color.white);
        lblDataEntry.setForeground(Color.white);
    }
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
            java.util.logging.Logger.getLogger(RegistroUso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new RegistroUso().setVisible(true);
                    }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Assignment;
    private javax.swing.JButton btn_Logout;
    private javax.swing.JComboBox<String> cboReason;
    private javax.swing.JPanel container1;
    private javax.swing.JTextField date;
    private javax.swing.JDesktopPane desktopPane;
    public static javax.swing.JLabel img_machine;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lblDataEntry;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JTextField txtHours;
    private javax.swing.JTextField txtMinutes;
    private javax.swing.JTextField txtQuantities;
    private javax.swing.JTextField txtRejects;
    public static javax.swing.JTextField txtcode_asig;
    // End of variables declaration//GEN-END:variables
}
