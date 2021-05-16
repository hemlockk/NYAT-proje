package com.company;

public class kullanici implements Ikullanici{
    private String kullaniciAdi;
    private  String KullaniciSifre;
    private boolean sogutucuSonDurumu;
    public kullanici setName(String isim){
        this.kullaniciAdi = isim;
        return this;
    }
    public kullanici setPass(String Pass){
        this.KullaniciSifre = Pass;
        return this;
    }
    public kullanici setSogutucuSonDurumu(boolean durum){
        this.sogutucuSonDurumu = sogutucuSonDurumu;
        return this;
    }

    public String getPass(){
        return KullaniciSifre;
    }

    public String getName(){
        return kullaniciAdi;
    }
    public static void Update(boolean a){
        if(a){
            System.out.println("soğutucu açıldı");
            return;
        }
        System.out.println("soğutucu kapatıldı");
        return;
    }
}
