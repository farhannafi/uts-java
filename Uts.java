/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

/**
 *
 * @author LENOVO
 */
import java.io.PrintWriter;
import java.io.FileReader;
public class Uts {  
        public static void main(String[] args) throws Exception {
            try (PrintWriter read = new PrintWriter("data.txt")) {
                eksistensi data = new eksistensi();
                int[] Nilaiangka = {8,6,6,9,2,4,6,3,5,11};
                String[] nama = {"wildan", "zaroh", "debora", "ardhito", "BOOLI"};
                
                for(int n : Nilaiangka){
                    read.print(n + ", ");
                }
                read.println();
                for(String n : nama){
                    read.print(n + ", ");
                }
                read.println();
                read.println("Nama         : " + data.nama);
                read.println("NIM          : " + data.NIM);
                read.println("Usia         : " + data.usia);
                read.println("Tinggi badan : " + data.tinggi);
                read.println(" alamat      : " + data.alamat);
            }

        try (
            FileReader file = new FileReader("data.txt")) {
            int character;
            while ((character = file.read()) != -1) {
                System.out.print((char) character);
            }
        }
    }
}

class eksistensi{
    String nama = "Farhan nafi";
    int NIM = 22201022;
    int usia = 20;
    Double tinggi = 160.3;
    String alamat = "jl janti barat";
}
    
    

