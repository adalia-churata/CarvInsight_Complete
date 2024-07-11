/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sac.CarvInsight.model;

/**
 *
 * @author adali
 */
public class User {
    String name_user;
    String password;

    public User() {
    }

    public User(String name_user, String password) {
        this.name_user = name_user;
        this.password = password;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
