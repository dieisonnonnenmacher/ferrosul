package br.com.ferrosul.api.banco.jdbc;

import lombok.Getter;
import lombok.Setter;

import java.sql.*;
@Getter
@Setter
public class SQLiteJDBCDriverConnection {
    static String dbFile="";

    public SQLiteJDBCDriverConnection(String dbFile) {
        dbFile = this.dbFile;
    }

    protected static Connection connect() {
        try {
            System.out.println("Conexão realizada !!!!");

            return  DriverManager.getConnection("jdbc:sqlite:" + dbFile);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        connect();
    }
}