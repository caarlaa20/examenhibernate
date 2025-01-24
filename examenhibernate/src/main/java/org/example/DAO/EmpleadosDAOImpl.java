package org.example.DAO;

import org.example.Entities.Empleados;
import org.example.Util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class EmpleadosDAOImpl implements EmpleadosDAO {
    @Override
    public List<Empleados> findAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Empleados> Empleados = session.createQuery("from empleados", Empleados.class).list();
        session.close();
        return Empleados;
    }

    @Override
    public Empleados findById(Integer id) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Empleados Empleados = session.find(Empleados.class, id);
        session.close();
        return Empleados;
    }

    @Override
    public List<Empleados> findByNombre(String nombre) {
        return null;
    }

    @Override
    public Empleados create(Empleados Empleados) {
        return null;
    }

    @Override
    public Empleados update(Empleados Empleados) {
        return null;
    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }


}
