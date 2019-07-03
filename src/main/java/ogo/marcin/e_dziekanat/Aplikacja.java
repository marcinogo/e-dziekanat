package ogo.marcin.e_dziekanat;

import ogo.marcin.e_dziekanat.model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Aplikacja {
    public static void main(String[] args) {
        Student student = new Student(11111L, "Test", "User", 1);
        Session sessionPostgreSql = PostgreSqlConnector.getSessionFactory().getCurrentSession();
        Transaction transactionPostgreSql = sessionPostgreSql.beginTransaction();
        sessionPostgreSql.save(student);
        transactionPostgreSql.commit();

        Session sessionMySql = MySqlConnector.getSessionFactory().getCurrentSession();
        Transaction transactionMySql = sessionMySql.beginTransaction();
        sessionMySql.save(student);
        transactionMySql.commit();
    }
}
