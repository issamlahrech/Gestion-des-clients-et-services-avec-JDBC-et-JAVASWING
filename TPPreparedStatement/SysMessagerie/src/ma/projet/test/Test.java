/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import ma.projet.beans.Employe;
import ma.projet.beans.Message;
import ma.projet.service.EmployeService;
import ma.projet.service.MessageService;

/**
 *
 * @author ACER
 */
public class Test {
    public static void main (String [] args){
        //Teste Employe
EmployeService es = new EmployeService();
MessageService ms = new MessageService();
//Création des employes
//es.create(new Employe("LACHGAR", "Mohamed"));
//es.create(new Employe("RAMI", "ALI"));
//es.create(new Employe("SAFI", "Fatima"));
//Modification d’un employe
/*Employe e = es.getById(6);
if (e != null) {
e.setNom("ALAOUI");
e.setPrenom("Manale");
es.update(e);*/

//Suppression d’un employe
//es.delete(es.getById(5));
//Liste des employes
for(Employe emp : es.getAll())
System.out.println(""+emp.getNom());
    

ms.create(new Message("Réunion", "Réunion de fin d’année",6,8));
ms.create(new Message("Réunion", "Réunion de fin d’année",6,7));
ms.create(new Message("Stage", "Stage à Marrakech",7,6));

//Les message reçus par l’employé 5
for (Message m : ms.getAll()) {
if(m.getIdE()== 5)
System.out.println(""+m.getSujet());
}
    }
}
    


    

