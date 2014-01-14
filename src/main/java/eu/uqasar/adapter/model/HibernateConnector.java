package eu.uqasar.adapter.model;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * User: eleni
 * Date: 1/13/14
 * Time: 6:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class HibernateConnector {

    private static HibernateConnector instance = null;
    SessionFactory sessionFactory;

    public HibernateConnector() {
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);

    }

    public static HibernateConnector getInstance() {
        if(instance == null) {
            instance = new HibernateConnector();
        }
        return instance;
    }

    public Serializable saveSystemUser(Object o){


        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Serializable saved_object = session.save(o);
        session.getTransaction().commit();
        session.close();
        return saved_object;
    }

    public List<BindedSystem> getBindedSystems(){
        LinkedList<BindedSystem> bindedSystems = new LinkedList<BindedSystem>();

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        String hql = "from User u Left Join u.bindedSystem";

        Query query = session.createQuery(hql);
        Iterator results = query.list().iterator();


       while ( results.hasNext() ) {
           Object[] tuple = (Object[]) results.next();
           User user = (User) tuple[0];
           BindedSystem bindedSystem = (BindedSystem) tuple[1];

           bindedSystem.setUser(user);
           bindedSystems.add(bindedSystem);

       }
       session.getTransaction().commit();
       session.close();
       return bindedSystems;




    }

}
