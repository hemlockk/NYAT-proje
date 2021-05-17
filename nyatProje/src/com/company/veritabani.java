package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class veritabani implements Iveritabani{
    public boolean GirisYap(String kullaniciAdi, String sifre)
    {
        boolean baglantiDurumu=false;
        try
        {   /** Bağlantı kurulumu **/
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/NyatProje",
                    "postgres", "2246");
            String sql= "SELECT*  FROM \"userData\" WHERE \"userName\"='"+kullaniciAdi+"' AND  \"userPassword\"='"+sifre+"'";

            /** Sorgu çalıştırma **/
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if(rs.next()) {
                baglantiDurumu=true;
            }
            /** Kaynakları serbest bırak **/
            rs.close();
            stmt.close();
            /** Bağlantı sonlandırma **/
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return baglantiDurumu;
    }
}
