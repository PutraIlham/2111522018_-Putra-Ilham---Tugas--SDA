package Tugas1SDA;

import java.util.ArrayList;

public class Soalno5 {

    public static void main(String[] args) {
        
    ArrayList<String> nama = new ArrayList<String>();
    nama.add("l");
    nama.add("h");
    nama.add("a");
    nama.add("m");

    System.out.println("sebelum remove:");
       for(String x: nama){
         System.out.println(x);
         }
    
    nama.remove(0);
    //nama.remove(3);
    nama.remove(2);
       
    System.out.println("setelah remove :");
       for(String y: nama){
         System.out.println(y);
         }
    }
}