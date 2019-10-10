/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan17.tunjangan;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskripsi Program    : Program ini berisi tentang menghitung total gaji
 *                          dan tunjangan
 */
public class IF110118030Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan : Rp. ");
        Scanner scanner = new Scanner(System.in);
        double gaji = scanner.nextInt();
        double tunjangan = 0;
        System.out.print("Status Anda? (Menikah/Belum)  : ");
        String status = scanner.next();
        if (status.equals("Menikah")){
            tunjangan = gaji*0.35;
            System.out.println(status);
        }
        double totalGaji = tunjangan+gaji;
        
        System.out.println("=======Hasil Perhitungan Gaji Anda=====");
        System.out.println("Gaji Pokok : "+gaji);
        System.out.println("Tunjangan : "+tunjangan);
        System.out.println("Total Gaji : "+totalGaji);
    }
    
}
