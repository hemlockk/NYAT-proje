package com.company;
import java.util.ArrayList;
import java.util.List;
public class eyleyici implements Ieyleyici{
    private List<Ikullanici> baglanankullanicilar = new ArrayList<>();
    private boolean sogutucuDurumu;
    public void soğutucuyuac(){
        this.sogutucuDurumu = true;
    };
    public void soğutucuyukapat(){
        this.sogutucuDurumu = false;
    };
    public boolean getSogutucuDurumu(){return  sogutucuDurumu;}
    public void kullaniciEkle(Ikullanici a){
        baglanankullanicilar.add(a);
    }
    public void kullaniciSil(Ikullanici a){
        baglanankullanicilar.remove(a);
    }
    public void bildir(){
        for(Ikullanici a : baglanankullanicilar){
            kullanici.Update(sogutucuDurumu);
        }
    }

}
