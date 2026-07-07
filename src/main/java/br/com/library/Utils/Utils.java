package br.com.library.Utils;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utils {
    static Dotenv dotenv = Dotenv.load();
    private static final String BDDRIVER = dotenv.get("BD.DRIVER");
    private static final String URL = dotenv.get("BD.URL");
    private static final String BDPASSWORD = dotenv.get("BD.PASSWORD");
    private static final String BDUSER = dotenv.get("BD.USER");
    private static final String URLTEST = dotenv.get("BD.URL.TEST");
    private static final String BDTESTPASSWORD = dotenv.get("BD.PASSWORD.TEST");
    private static final String BDTESTUSER = dotenv.get("BD.USER.TEST");

    public static Connection getTestConnection() throws Exception{
        Connection connection = null;
        try{
            Class.forName(BDDRIVER);
            connection = DriverManager.getConnection(URLTEST, BDTESTUSER, BDTESTPASSWORD);
            System.out.println("Conexão realizada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return connection;
    }

    public Connection getConnection() throws Exception{
        Connection connection = null;
        try{
            Class.forName(BDDRIVER);
            connection = DriverManager.getConnection(URL, BDUSER, BDPASSWORD);
            System.out.println("Conexão realizada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return connection;
    }
}
