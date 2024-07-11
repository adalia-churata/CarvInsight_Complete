package sac.CarvInsight.model.DAO;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import sac.CarvInsight.util.Conexion;
import sac.CarvInsight.model.OEEGraphic;

import sac.CarvInsight.model.Reg_UsoMaq; 

public class Reg_UsoMaqDAOImpl implements Reg_UsoMaqDAO{

    @Override
    public int insert(Reg_UsoMaq RgUso) {
    int result=0;
    String sql= """
                INSERT INTO Reg_using (id_asig, date_use, time_work, quantity, error)
                VALUES (?,?,?,?,?)""";
    try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, RgUso.getId_asig());
            stmt.setString(2, RgUso.getDate());
            stmt.setFloat(3, RgUso.getTimeWork());
            stmt.setInt(4, RgUso.getQuantity());
            stmt.setFloat(5, RgUso.getError());
            stmt.setQueryTimeout(result);
            result = stmt.executeUpdate();
        } 
    catch (Exception e) {
           
            System.out.println("Ha ocurrido un error" + e.getMessage());
        }
        return result;

    }

    @Override
    public List<OEEGraphic> findToDay(int id_maq) {
        List<OEEGraphic> LisOEE = new ArrayList<>();
    String query = "SELECT " +
               "ru.id_asig, ru.date_use, ru.time_work, ru.quantity, ru.error, " +
               "m.perfor_maq, am.time_estimate " +
               "FROM " +
               "reg_using ru " +
               "INNER JOIN " +
               "asig_machines am ON ru.id_asig = am.id_asig " +
               "INNER JOIN " +
               "machines m ON am.id_maq = m.id_maq " +
               "WHERE " +
               "m.id_maq = ? LIMIT 1;";
    
        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setInt(1, id_maq);
            ResultSet rs = stmt.executeQuery();
            System.out.println("Conexion");
            if (rs.next()) {  
                OEEGraphic OeeG = new OEEGraphic();
                OeeG.setId_asig(rs.getInt("id_asig"));
                OeeG.setDate(rs.getString("date_use"));
                OeeG.setTimeWork(rs.getFloat("time_work"));
                OeeG.setQuantity(rs.getInt("quantity"));
                OeeG.setError(rs.getInt("error"));
                OeeG.setPerfr_maq(rs.getInt("perfor_maq"));
                OeeG.setPlanned_time(rs.getFloat("time_estimate"));
                System.out.println("time: "+OeeG.getTimeWork());
                LisOEE.add(OeeG);
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
      return LisOEE;   
    }

    @Override
    public List<OEEGraphic> findToWeek(int id_maq, String Date) {
    String DateLimit = "";
    List<OEEGraphic> LisOEE = new ArrayList<>();
    String query ="SELECT " +
                            "    ru.id_asig, ru.date_use, ru.time_work, ru.quantity, ru.error, " +
                            "    m.perfor_maq, am.time_estimate " +
                            "FROM " +
                            "    reg_using ru" +
                            "INNER JOIN " +
                            "    asig_machines am ON ru.id_asig = am.id_asig" +
                            "INNER JOIN " +
                            "    machines m ON am.id_maq = m.id_maq " +
                            "WHERE " +
                            "    ru.date_use BETWEEN ? AND ? AND m.id_maq = ?;";
        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id_maq);
            stmt.setString(2, Date);
            stmt.setString(3, DateLimit);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {  
                OEEGraphic OeeG = new OEEGraphic();
                OeeG.setId_asig(rs.getInt("id_asig"));
                OeeG.setDate(rs.getString("date_use"));
                OeeG.setTimeWork(rs.getFloat("time_work"));
                OeeG.setQuantity(rs.getInt("quantity"));
                OeeG.setError(rs.getInt("error"));
                OeeG.setPerfr_maq(rs.getInt("perfor_maq"));
                OeeG.setPlanned_time(rs.getFloat("time_estimate"));
                LisOEE.add(OeeG);
            }
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
      return LisOEE;  
    }

    @Override
    public List<OEEGraphic> findToProduction(int id_maq, int prod) {
    List<OEEGraphic> LisOEE = new ArrayList<>();
    String query = """
                   SELECT 
                       ru.id_asig, ru.date_use, ru.time_work, ru.quantity, ru.error, 
                       m.perfor_maq, am.time_estimate
                   FROM 
                       reg_using ru
                   INNER JOIN 
                       asig_machines am ON ru.id_asig = am.id_asig
                   INNER JOIN 
                       machines m ON am.id_maq = m.id_maq
                   INNER JOIN 
                       production p ON am.id_prod = p.id_prod
                   WHERE 
                   \t  m.id_maq=? AND am.id_prod=? ;""";
        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id_maq);
            stmt.setInt(2, prod);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {  
                OEEGraphic OeeG = new OEEGraphic();
                OeeG.setId_asig(rs.getInt("id_asig"));
                OeeG.setDate(rs.getString("date_use"));
                OeeG.setTimeWork(rs.getFloat("time_work"));
                OeeG.setQuantity(rs.getInt("quantity"));
                OeeG.setError(rs.getInt("error"));
                OeeG.setPerfr_maq(rs.getInt("perfor_maq"));
                OeeG.setPlanned_time(rs.getFloat("time_estimate"));
                LisOEE.add(OeeG);
            }
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
      return LisOEE;  
    }
  
}
