package Tugas1SDA;

import java.util.ArrayList;

public class Soalno6 {
 
public static void main(String[] args) {
 ArrayList<String> nama = new ArrayList<String>();  
    nama.add("L");
    nama.add("H");
    nama.add("A");
    nama.add("M");

  nama.add(0,"u");
  System.out.println("Element u added = " + nama);

  nama.add(2,"v");
  System.out.println("Element v added = " + nama);

  nama.add(3,"w");
  System.out.println("Element w added = " + nama);

  nama.add(4,"x");
  System.out.println("Element x added = " + nama);

  nama.add(6,"y");
  System.out.println("Element y added = " + nama);

  nama.add(-3,"z");
  System.out.println("Element z added = " + nama);
  }    
}