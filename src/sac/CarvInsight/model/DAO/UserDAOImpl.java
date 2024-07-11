/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sac.CarvInsight.model.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import sac.CarvInsight.model.User;
import sac.CarvInsight.util.Conexion;

/**
 *
 * @author adali
 */
public class UserDAOImpl implements UserDAO{

    @Override
    public List<User> findAll() {
        List<User> listUs = new ArrayList<>();
        String sql = "SELECT * FROM user";
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                User usu = new User();
                usu.setName_user(rs.getString("user"));
                usu.setPassword(rs.getString("password"));
                listUs.add(usu);
            }
        }catch(Exception e){
            System.out.println("Ha ocurrido un error: " +e.getMessage());
        }
        return listUs;
    }

    @Override
    public int Validar(String user, String password) {
        String sql = "SELECT * FROM user WHERE user=? AND password=?";
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, user);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()){
                return 1;
            }else{
                return 0;
            }
        }catch(Exception e){
            System.out.println("Ha ocurrido un error: " +e.getMessage());
        }
        return 0;
    }
}
