/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package sac.CarvInsight.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import sac.CarvInsight.model.Asig_Maquinaria;
import sac.CarvInsight.model.DAO.Asig_MaquinariaDAO;
import sac.CarvInsight.model.DAO.Asig_MaquinariaDAOImpl;
import sac.CarvInsight.util.Imgs;

/**
 *
 * @author adali
 */
public class Assignment extends javax.swing.JInternalFrame {
        int id_asignment=0 ;
        Imgs llenar = new Imgs();
    
    public Assignment() {
        initComponents();
        llenarTabla();
        cargarIcons();
        table.getTableHeader().setBackground(new Color(6, 42, 64));
    }

    void llenarTabla(){
        List<Asig_Maquinaria> lista;
        Asig_MaquinariaDAO dao = new Asig_MaquinariaDAOImpl();
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        lista = dao.findAllIncompleted();
        for(Asig_Maquinaria asig : lista){
            modelo.addRow(asig.getDatosForTable());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/img/fondo_C8CFD8.png"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        header = new javax.swing.JLabel();
        btn_Assignment = new javax.swing.JButton();

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(833, 632));

        jScrollPane1.setBackground(new java.awt.Color(6, 42, 64));
        jScrollPane1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table.setForeground(new java.awt.Color(0, 0, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Assignment", "Id_Machine", "Id_Prod", "Description"
            }
        ));
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setRowHeight(30);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(80);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(80);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(2).setPreferredWidth(80);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(3).setPreferredWidth(400);
        }

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(64, 225, 688, 341);

        header.setMaximumSize(new java.awt.Dimension(821, 80));
        jDesktopPane1.add(header);
        header.setBounds(0, 0, 821, 100);

        btn_Assignment.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btn_Assignment.setText("Select Assignment");
        btn_Assignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AssignmentActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btn_Assignment);
        btn_Assignment.setBounds(64, 155, 300, 52);

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AssignmentActionPerformed
        // TODO add your handling code here:
        String new_id= id_asignment+"";
        RegistroUso.txtcode_asig.setText(new_id);
        
        //SEND IMAGE TO JLABEL
         Imgs Llenar = new Imgs();
         
         Asig_MaquinariaDAO dao = new Asig_MaquinariaDAOImpl();
            String tipo_mac = dao.findTipoMac(id_asignment);
         switch (tipo_mac) {
                    case "Sliter" -> Llenar.Img2Label(RegistroUso.img_machine, "slitter");
                    case "Maquina tubera" -> Llenar.Img2Label(RegistroUso.img_machine, "roll");
                    case "Horno" -> Llenar.Img2Label(RegistroUso.img_machine, "furance");
                    default -> RegistroUso.img_machine.setIcon(null);
                }
        this.dispose();
        
    }//GEN-LAST:event_btn_AssignmentActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        id_asignment = (int) table.getValueAt(table.getSelectedRow(), 0);
        
    }//GEN-LAST:event_tableMouseClicked
    
    private void cargarIcons(){
        llenar.Img2Label(header, "NewHead");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Assignment;
    private javax.swing.JLabel header;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
