/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sac.CarvInsight.view;

import com.fazecast.jSerialComm.SerialPort;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import sac.CarvInsight.model.DAO.Asig_MaquinariaDAO;
import sac.CarvInsight.model.DAO.Asig_MaquinariaDAOImpl;
import sac.CarvInsight.model.DAO.Reg_UsoMaqDAO;
import sac.CarvInsight.model.DAO.Reg_UsoMaqDAOImpl;
import sac.CarvInsight.model.Reg_UsoMaq;
import sac.CarvInsight.util.Arduino;
import sac.CarvInsight.util.Imgs;


public class Principal extends javax.swing.JFrame {

    private Arduino  ardi;
    Imgs Llenar = new Imgs();
     Asig_MaquinariaDAO dao = new Asig_MaquinariaDAOImpl();
    public Principal() {
        initComponents();
        ardi = new Arduino();
        LoadPuertos();
        this.setLocationRelativeTo(null);
        cargarIcons();
        setDate();
    }
    
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
        lbl_logo = new javax.swing.JLabel();
        btn_Logout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        cboPuertos = new javax.swing.JComboBox<>();
        btnConectar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtRecibir = new javax.swing.JLabel();
        btnRecibir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        img_machine = new javax.swing.JLabel();
        lblDataEntry = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1171, 627));

        lbl_logo.setBackground(new java.awt.Color(0, 51, 204));
        desktopPane.add(lbl_logo);
        lbl_logo.setBounds(0, 0, 1170, 80);

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
        btn_Logout.setBounds(950, 10, 200, 50);

        jPanel1.setBackground(new java.awt.Color(21, 100, 192));

        jPanel2.setBackground(new java.awt.Color(33, 36, 41));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Port:");

        txtNumero.setBackground(new java.awt.Color(217, 217, 217));
        txtNumero.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(139, 139, 139));
        txtNumero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNumeroMouseClicked(evt);
            }
        });

        cboPuertos.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        cboPuertos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnConectar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnConectar.setText("Conect");
        btnConectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConectarMouseClicked(evt);
            }
        });
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("TEXTO RECIBIDO");

        txtRecibir.setBackground(new java.awt.Color(102, 153, 255));
        txtRecibir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRecibir.setForeground(new java.awt.Color(51, 102, 255));

        btnRecibir.setText("Recibir");
        btnRecibir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRecibirMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CODE ASSIGNMENT");

        btnEnviar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnEnviar.setText("Send");
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarMouseClicked(evt);
            }
        });
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(58, 58, 58)
                                .addComponent(cboPuertos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRecibir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRecibir)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRecibir)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cboPuertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConectar))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnviar))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(txtRecibir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        lblDate.setBackground(new java.awt.Color(255, 255, 255));
        lblDate.setFont(new java.awt.Font("MS Gothic", 1, 48)); // NOI18N
        lblDate.setText("DATE:");

        date.setEditable(false);
        date.setBackground(new java.awt.Color(217, 217, 217));
        date.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        date.setForeground(new java.awt.Color(139, 139, 139));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(img_machine, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDate)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(img_machine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        desktopPane.add(jPanel1);
        jPanel1.setBounds(30, 160, 1100, 420);

        lblDataEntry.setBackground(new java.awt.Color(21, 100, 192));
        lblDataEntry.setFont(new java.awt.Font("Lucida Console", 1, 48)); // NOI18N
        lblDataEntry.setText("Conexion");
        desktopPane.add(lblDataEntry);
        lblDataEntry.setBounds(30, 100, 280, 50);

        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConectarMouseClicked
        /*int i= this.cboPuertos.getSelectedIndex();
        if (ardi.conectar(i)) {
            JOptionPane.showMessageDialog(this, "CONNECTED");
            this.btnConectar.setBackground(Color.green);
        }else {
            JOptionPane.showMessageDialog(this, "ERROR");
            this.btnConectar.setBackground(Color.red);
        
        }*/
    }//GEN-LAST:event_btnConectarMouseClicked

    private void btnEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseClicked
    int id_as = Integer.parseInt(this.txtNumero.getText());
    String texto = dao.findTimeEstimate(id_as);
    
    if (ardi.estaConectado()) {
        ardi.enviarTexto(texto);
        System.out.println("Se envio " + texto);
        
        // Esperar hasta recibir un texto no nulo
        String textoInput = null;
        while (textoInput == null || textoInput.isEmpty()) {
            textoInput = ardi.recibirTexto();
            // Puedes agregar un breve retardo para evitar un bucle apretado
            try {
                Thread.sleep(100); // 100 milisegundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //txtRecibir.setText(textoInput);
        System.out.println("Se recibio " + textoInput);
        
        String[] partes = textoInput.split("/");
        
        float getTime = Float.parseFloat(partes[0]);
        int getQuantities = Integer.parseInt(partes[1]);
        int getRejects = Integer.parseInt(partes[2]);
        
        Reg_UsoMaq reg = new Reg_UsoMaq();
        Reg_UsoMaqDAO r = new Reg_UsoMaqDAOImpl();
        reg.setId_asig(id_as);
        reg.setTimeWork(getTime);
        reg.setQuantity(getQuantities);
        reg.setError(getRejects);
        reg.setDate(getDate());
        
        //Insertando los datos a la base de datos y actualizando a estado hecho en la tabla de asignamiento
        r.insert(reg);
        dao.updateState(id_as);
        
        //Limpiar el id_asignamiento para seleccionar nuevamente
        this.txtNumero.setText("");
        
    } else {
        JOptionPane.showMessageDialog(this, "ERROR");
    }            
    }//GEN-LAST:event_btnEnviarMouseClicked

    private void btnRecibirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecibirMouseClicked
           /*String textoInput;
            if(ardi.estaConectado()){
            textoInput = ardi.recibirTexto();
           txtRecibir.setText(textoInput);
            }else {
            JOptionPane.showMessageDialog(this, "ERROR");
            }*/
    }//GEN-LAST:event_btnRecibirMouseClicked

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        // TODO add your handling code here:
        //CONECTAR PUERTO
        int i= this.cboPuertos.getSelectedIndex();
        if (ardi.conectar(i)) {
            UIManager.put("Button.background", Color.white);
            UIManager.put("control", new Color(	49, 107, 28));
            JOptionPane.showMessageDialog(null, "<html><div><p style='color:white; font-size: 20px;'>CONFIRMATION</p></div>"
                    + "<div><p style='color:white; font-size: 14px;'>Connected</p></div></html>","",JOptionPane.PLAIN_MESSAGE, Llenar.getIcon("success", 50, 50));
            UIManager.put("control", new Color(		214, 217, 223));
            btnConectar.setText("Desconectar");
        }else {
            UIManager.put("Button.background", Color.white);
            UIManager.put("control", new Color(	254, 74, 74));
            UIManager.put("nimbusBase", new Color(	207, 198, 198));
            JOptionPane.showMessageDialog(null, "<html><div><p style='color:white; font-size: 20px;'>ALERT !</p></div>"
                    + "<div><p style='color:white; font-size: 14px;'>Error</p></div></html>","",JOptionPane.PLAIN_MESSAGE, Llenar.getIcon("alert", 50, 50));
            UIManager.put("control", new Color(		214, 217, 223));
            btnConectar.setText("Conectar");
        
        }
    }//GEN-LAST:event_btnConectarActionPerformed

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

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtNumeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroMouseClicked
        // TODO add your handling code here:
        Assignment ventana = new Assignment();
        
        // Obtener el tamaño de la pantalla
         desktopPane.add(ventana);
        
        int x = (desktopPane.getWidth()/2) - (ventana.getWidth()/2)-50;
        int y = (desktopPane.getHeight()/2) - ventana.getHeight()/2;
        ventana.setLocation(x, y);
        ventana.show();
    }//GEN-LAST:event_txtNumeroMouseClicked
    
    private void cargarIcons(){
        Llenar.Img2Label(lbl_logo, "NewHead");
        Llenar.Img2Btn(btn_Logout, "btnLogOut");
        lblDate.setForeground(Color.white);
        lblDataEntry.setForeground(Color.white);
    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnRecibir;
    private javax.swing.JButton btn_Logout;
    private javax.swing.JComboBox<String> cboPuertos;
    private javax.swing.JTextField date;
    private javax.swing.JDesktopPane desktopPane;
    public static javax.swing.JLabel img_machine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lblDataEntry;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lbl_logo;
    public static javax.swing.JTextField txtNumero;
    private javax.swing.JLabel txtRecibir;
    // End of variables declaration//GEN-END:variables
    
    private void LoadPuertos(){
        SerialPort[] puertos = Arduino.getPuertosSerie();
        this.cboPuertos.removeAllItems();
        for (int i = 0; i <puertos.length; i++) {            
            cboPuertos.addItem(puertos[i].getSystemPortName());
        }
    }
    
    
}
