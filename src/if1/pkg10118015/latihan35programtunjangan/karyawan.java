/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan35programtunjangan;

/**
 *
 * @author ACER
 */
public class karyawan {
    public String status;
    public double gajipokok;
    public double tunjangan;
    public double total;
    
    public double hitungTunjangan(String parstatus, double pargajipokok){
        if ("Menikah".equals(status)) {
            tunjangan = (gajipokok * 0.35);
        }
        return tunjangan;
    }
    
    public double hitungtotal(double pargajipokok, double partunjangan){
        return total = pargajipokok + partunjangan;
    }
    
    public void hasilhitung(String parstatus, double pargajipokok){
        System.out.println("\n=========Hasil Perhitungan Gaji Anda=========");
        System.out.println("Gaji Pokok \t : Rp. "+ gajipokok);
        System.out.println("Tunjangan  \t : Rp. "+ hitungTunjangan(parstatus, pargajipokok));
        System.out.println("Total Gaji \t : Rp. "+ hitungtotal(pargajipokok, tunjangan));
        System.out.println("(Developed by : Adi Chandra Nugraha)");
    }
}
