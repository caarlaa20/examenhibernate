package org.example.App;

import org.example.DAO.EmpleadosDAOImpl;
import org.example.Entities.Empleados;
import org.example.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

    public  static void main (String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Empleados Empleados = new Empleados(1, "martin", "martin@gmail", "Recepcion");
        Empleados Empleados2 = new Empleados(1, "marina", "marina@gmail", "Manicurista");
        Empleados Empleados3 = new Empleados(1, "andrea", "andrea@gmail", "Limpiadora");

        session.beginTransaction();

        session.persist(Empleados);
        session.persist(Empleados2);
        session.persist(Empleados3);

        session.getTransaction().commit();

        session.close();
        sessionFactory.close();

        System.out.println(Empleados);
        System.out.println(Empleados2);
        System.out.println(Empleados3);
    }
}
