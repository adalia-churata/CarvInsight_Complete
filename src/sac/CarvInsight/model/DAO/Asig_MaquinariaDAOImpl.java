package sac.CarvInsight.model.DAO;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import sac.CarvInsight.util.Conexion;
import sac.CarvInsight.model.Asig_Maquinaria;


public class Asig_MaquinariaDAOImpl implements Asig_MaquinariaDAO{

    
    //Para llenado de cbo
    @Override
    public List<Asig_Maquinaria> findAllIncompleted() {
    List<Asig_Maquinaria> listAsig = new ArrayList<>();
    String query = "Select a.id_asig, m.model_maq, m.tipo_maq, a.description from asig_machines a INNER JOIN machines m WHERE a.id_maq=m.id_maq AND a.state_asig=1";
    try {
        Connection conn = Conexion.getConnection();
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Asig_Maquinaria asigMaq= new Asig_Maquinaria();
            asigMaq.setId_asig(rs.getInt("id_asig"));
            asigMaq.setId_maq(rs.getString("model_maq"));
            asigMaq.setId_prod(rs.getString("tipo_maq"));
            asigMaq.setDescription(rs.getString("description"));
            listAsig.add(asigMaq);
        }
     
    } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        } 
    return listAsig;
    }
    

    //para actualizar estado luego de registrar uso
    @Override
    public int updateState(int asig) {
        int result = 0;
        String Query = "UPDATE Asig_Machines SET state_asig=2 where id_asig=?";
        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(Query);
            stmt.setInt(1, asig);
            result = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
        return result;
    }
    
    
    /*
    @Override
    public int insert(Asig_Maquinaria AsMaq) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    */

    @Override
    public String findTipoMac(int id_Asig) {
        String name_mac="";
        String Query = "SELECT m.tipo_maq FROM asig_machines am "
                + "INNER JOIN machines m ON am.id_maq = m.id_maq WHERE am.id_asig = ?";
        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(Query);
            stmt.setInt(1, id_Asig);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                name_mac = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
        return name_mac;
    }
    
    @Override
    public String findTimeEstimate(int id_Asig) {
        String time_estimate="";
        String Query = "SELECT time_estimate FROM asig_machines "
                + "WHERE id_asig = ?";
        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(Query);
            stmt.setInt(1, id_Asig);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                float recibirFloat = rs.getFloat(1);
                time_estimate = String.valueOf(recibirFloat);
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
        return time_estimate;
    }
}
