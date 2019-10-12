/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan35programtunjangan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program tunjangan karyawan
 */
public class IF110118015Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        karyawan kar = new karyawan();
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        kar.gajipokok = input.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        kar.status = input.next();

        kar.hasilhitung(kar.status, kar.gajipokok);
    }
    
}
