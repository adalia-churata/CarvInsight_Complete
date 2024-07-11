/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sac.CarvInsight.model.DAO;

import java.util.List;
import sac.CarvInsight.model.User;

/**
 *
 * @author adali
 */
public interface UserDAO {
    public List<User> findAll();
    public int Validar(String user, String password);
}
