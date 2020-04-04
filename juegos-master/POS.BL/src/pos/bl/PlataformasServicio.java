/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.bl;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author User
 */
public class PlataformasServicio {

    public ArrayList<Plataforma> obtenerPlataformas() {
        Session session =HibernateUtil.getSessionFactory().openSession();
        
        Transaction tx = session.beginTransaction();
        
        Criteria query = session.createCriteria(Plataforma.class);
        List<Plataforma> resultado = query.list();
        
        tx.commit();
        session.close();
        
        return new ArrayList<>(resultado);
       
    }
 
}
