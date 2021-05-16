package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class veritabani implements  Iveritabani{
    public Connection baglan() {
        String jdbcURL = "jdbc:postgresql://localhost:5432/NyatProje";
        String username = "postgres";
        String password = "2246";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
        }
        catch(SQLException e) {
            System.out.println("error");
            e.printStackTrace();
        }
        return connection;
    }
    public boolean GirisYap(String KullaniciAdi, String Sifre) {
        Connection con = baglan();
        String sql = "SELECT * FROM \"public\".\"userData\" WHERE \"userName\" = " + KullaniciAdi + " AND \"userPassword\" = " + Sifre;
        if(con != null) {
            try {
                Statement statement = con.createStatement();
                ResultSet RS = statement.executeQuery(sql);
                con.close();
                if(RS.next()) {
                    return true;
                }
                else {return false;}
            }
            catch(SQLException e){
            }
        }
        else {return false;}
        return  true;
    }
}
