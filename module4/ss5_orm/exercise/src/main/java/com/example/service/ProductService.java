package com.example.service;

import com.example.model.Product;
import com.example.util.ConnectionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import java.util.List;

public class ProductService implements IProductService {
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;

    static {
        try {
            SessionFactory sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            sessionFactory.close();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> list() {
        Session session = null;
        List<Product> productList = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            productList = session.createQuery("FROM Product ").getResultList();

        } finally {
            if (session != null) {
                session.close();
            }

        }
        return productList;
    }

    @Override
    public void save(Product product) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.persist(product);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void editById( Product product) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.merge(product);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Product findById(int id) {
      Session session = null;
      Product product = null;
      try {
          session = ConnectionUtil.sessionFactory.openSession();
          product = (Product) session.createQuery("FROM Product  where id =: nyc").setParameter("nyc",id).getSingleResult();
      }finally {
          if (session != null) {
              session.close();
          }
      }
      return product;
    }

    @Override
    public Product deleteById(int id) {
        Product product = findById(id);
        Session session = null;
        Transaction transaction = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.remove(product);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return product;
    }

    @Override
    public List<Product> searchByPrice(String name) {
        Session session = null;
        List<Product> product = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            product = (List<Product>) session.createQuery("FROM Product  where name like concat('%',:name2,'%') ")
                    .setParameter("name2",name)
                    .getResultList();
        }finally {
            if (session != null) {
                session.close();
            }
        }
        return product;
    }
}
