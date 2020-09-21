/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2.lession6;

/**
 *
 * @author ACER
 */
public class Student {
    private String fullName;
    private String address;
    private String email;
    
    public Student(){
        this.fullName = new String("");
        this.address = new String("");
        this.email = new String("");
    }
    
    public Student(String fullName, String address, String email){
        this.fullName = fullName;
        this.address = address;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
