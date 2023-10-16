/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

/**
 *
 * @author ACER
 */
import java.util.Date;

public class Message {
    private int id;
    private String objet;
    private String sujet;
    private Date date;
    private int idE;
    private int idR;

    public Message() {
    }

    public Message(int id, String objet, String sujet,int idE, int idR) {
        this.id = id;
        this.objet = objet;
        this.sujet = sujet;
       this.idE = idE;
        this.idR = idR;
    }

    public Message(String objet, String sujet, int idE, int idR) {
        this.objet = objet;
        this.sujet = sujet;
        this.idE = idE;
        this.idR = idR;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdE() {
        return idE;
    }

    public void setIdE(int idE) {
        this.idE = idE;
    }

    public int getIdR() {
        return idR;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }
}

   

    
    

