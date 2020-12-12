/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author jahid
 */
public class Teacher {
    private int id;
    private String name;
    private String password;

    public Teacher(String name,int id, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean check(String un,String pass)
    {
        if(un.equals(String.valueOf(id) ) && pass.equals(password))
            return true;
        return false;
    }
    public void login(){
        
    }
    public void registration(){
        
}
}