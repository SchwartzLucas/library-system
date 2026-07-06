package br.com.library.Utils;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utils {
    static Dotenv dotenv = Dotenv.load();

    private static final String URL = dotenv.get("BD.DRIVER");
    private static final String BDPASSWORD = dotenv.get("BD.PASSWORD");
    private static final String BDUSER = dotenv.get("BD.USER");
    private static final String URLTEST = dotenv.get("BD.DRIVER.TEST");
    private static final String BDTESTPASSWORD = dotenv.get("BD.PASSWORD.TEST");
    private static final String BDTESTUSER = dotenv.get("BD.PASSWORD.TEST");

    public static Connection getTestConnection() throws Exception{
        Connection connection = null;
        try{

            connection = DriverManager.getConnection(URLTEST, BDTESTUSER, BDTESTPASSWORD);
            System.out.println("Conexão realizada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return connection;
    }

    public static Connection getConnection() throws Exception{
        Connection connection = null;
        try{

            connection = DriverManager.getConnection(URL, BDUSER, BDPASSWORD);
            System.out.println("Conexão realizada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return connection;
    }
}
