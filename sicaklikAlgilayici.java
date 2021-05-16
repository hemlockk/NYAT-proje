package com.company;
import java.util.Random;

public class sicaklikAlgilayici implements IsicaklikAlgilayici{
    private int sicaklik;
    public sicaklikAlgilayici(){
            Random rand = new Random();
            sicaklik = rand.nextInt(40);
    }
    public int GetSicaklik(){
        return sicaklik;
    }
}
