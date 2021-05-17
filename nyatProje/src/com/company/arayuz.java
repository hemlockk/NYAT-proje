package com.company;
import java.util.Scanner;
public class arayuz implements Iarayuz{
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public String LOGIN1(){
        Scanner name = new Scanner(System.in);
        System.out.print("Enter username : ");
        String userName = name.nextLine();
        return  userName;
    }
    public String LOGIN2(){
        Scanner pass = new Scanner(System.in);
        System.out.print("Enter password : ");
        String userPass = pass.nextLine();
        return userPass;
    }
    public String mainMenu(boolean sogutucuDurumu){
        String islemNo = "";
        while(!islemNo.equals("1") && !islemNo.equals("2") && !islemNo.equals("3")){
            clearScreen();
            System.out.println("soğutucu durumu : " + (sogutucuDurumu ? "açık" : "kapalı"));
            System.out.println("1 - sıcaklık göster");
            System.out.println("2 - soğutucuyu " + (sogutucuDurumu ? "kapa" : "aç"));
            Scanner name = new Scanner(System.in);
            System.out.println("3 - çıkış");
            islemNo = name.nextLine();
            if(!islemNo.equals("1") && !islemNo.equals("2") && !islemNo.equals("3")){
            System.out.println("lütfen geçerli bir işlem giriniz");
            }
        }
        return islemNo;
    }

}
