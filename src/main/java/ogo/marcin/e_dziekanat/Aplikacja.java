package ogo.marcin.e_dziekanat;

import ogo.marcin.e_dziekanat.model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Aplikacja {
    public static void main(String[] args) {
        Session sessionPostgreSql = PostgreSqlConnector.getSessionFactory().getCurrentSession();
        Session sessionMySql = MySqlConnector.getSessionFactory().getCurrentSession();

        Student student = new Student(11111L, "Test", "User", 1);

        Transaction transactionMySql = sessionMySql.beginTransaction();
        Transaction transactionPostgreSql = sessionPostgreSql.beginTransaction();



        sessionMySql.save(student);
        sessionPostgreSql.save(student);



        transactionMySql.commit();
        transactionPostgreSql.commit();
    }
}
