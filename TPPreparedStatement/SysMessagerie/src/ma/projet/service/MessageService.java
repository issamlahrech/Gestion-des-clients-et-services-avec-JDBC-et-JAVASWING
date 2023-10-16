/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.projet.beans.Employe;
import ma.projet.beans.Message;
import ma.projet.connexion.Connexion;
import ma.projet.dao.IDao;

/**
 *
 * @author ACER
 */
public class MessageService implements IDao<Message> {
    private EmployeService es;
public MessageService() {
es = new EmployeService();
}
@Override
public boolean create(Message o) {
try {
String req = "insert into message (objet, sujet, idE, idR) values(?,?,?,?)";

PreparedStatement ps =
Connexion.getConnection().prepareStatement(req);
ps.setString(1, o.getObjet());
ps.setString(2, o.getSujet());

ps.setInt(3, o.getIdE());
ps.setInt(4, o.getIdR());
if (ps.executeUpdate() == 1) {
return true;
}
} catch (SQLException ex) {
Logger.getLogger(MessageService.class.getName()).log(Level.SEVERE,
null, ex);
}
return false;
}
@Override
public boolean update(Message o) {
return false;
}
@Override
public boolean delete(Message o) {
return false;
}
@Override
public Message getById(int id) {
Message employe = null;
try {String req = "select * from message where id = ?";
PreparedStatement ps =
Connexion.getConnection().prepareStatement(req);
ps.setInt(1, id);
ResultSet rs = ps.executeQuery();
if(rs.next())
employe = new Message(rs.getInt("id"), rs.getString("objet"),
rs.getString("sujet"),rs.getInt("IdE"),rs.getInt("IdR"));
} catch (SQLException ex) {
Logger.getLogger(MessageService.class.getName()).log(Level.SEVERE,
null, ex);
}
return employe;
}
@Override
public List<Message> getAll() {
List<Message> employes = new ArrayList<>();
try {
String req = "select * from message ";
PreparedStatement ps =
Connexion.getConnection().prepareStatement(req);
ResultSet rs = ps.executeQuery();
while (rs.next()) {
// à compléter
}
} catch (SQLException ex) {
Logger.getLogger(MessageService.class.getName()).log(Level.SEVERE,
null, ex);
}
return employes;
}


    
    
}
