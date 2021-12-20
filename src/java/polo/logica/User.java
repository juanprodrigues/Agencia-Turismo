/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polo.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author JuanPC
 */
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer isUsuario;
    String usuario;
    String pasword;

    public User() {
    }
    

    public User(String usuario, String pasword) {
        this.usuario = usuario;
        this.pasword = pasword;
    }

    public Integer getIsUsuario() {
        return isUsuario;
    }

    public void setIsUsuario(Integer isUsuario) {
        this.isUsuario = isUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    @Override
    public String toString() {
        return "user{" + "isUsuario=" + isUsuario + ", usuario=" + usuario + ", pasword=" + pasword + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
