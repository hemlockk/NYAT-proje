package com.company;

public class Main {

    public static void main(String[] args) {
            veritabani dataBase = new veritabani();
            arayuz UI = new arayuz();
            eyleyici maker = new eyleyici();
            sicaklikAlgilayici SicaklikAlgilayici = new sicaklikAlgilayici();
            kullanici Kullanici = new kullanici();
            do {
                Kullanici.setName(UI.LOGIN1());
                Kullanici.setPass(UI.LOGIN2());
                if(dataBase.GirisYap(Kullanici.getName(), Kullanici.getPass()) == false) {
                    System.out.println("kullanıcı adı veya şifre yanlış");
                }
                else{
                    maker.kullaniciEkle(Kullanici);
                    break;}
            }while(true);
            String abe = "a";
            while(!abe.equals("3")){
                    abe = UI.mainMenu(maker.getSogutucuDurumu());
                    if (abe.equals("1")){
                       System.out.println(SicaklikAlgilayici.GetSicaklik());
                    }
                    if(abe.equals("2")){
                        if(!maker.getSogutucuDurumu()){
                            maker.soğutucuyuac();
                        }
                        else{
                            maker.soğutucuyukapat();
                        }
                        maker.bildir();
                    }
            }
            Kullanici.setSogutucuSonDurumu(maker.getSogutucuDurumu());
            maker.kullaniciSil(Kullanici);
    }
}
