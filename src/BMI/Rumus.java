/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author Surya Kusuma P A
 */
public class Rumus {
    void hitunganBMI(double beratbadan, double tinggibadan1, double tinggibadan2){
          double hasil = beratbadan/(tinggibadan1*tinggibadan2);
          String formattedResult = String.format("%.3f", hasil);
          
          System.out.println("Hasil perhitungan berat badan (BMI) anda adalah = " + formattedResult );
          
          System.out.println("CATATAN Harap dibaca");
          System.out.println("Jika hasil dari penghitungan berat badan anda adalah ");
          System.out.println("<17 = kurus [kategori kekurangan berat badan tingkat berat] ");
          System.out.println("17-18.5 = kurus [kategori kekurangan berat badan tingkat rendah] ");
          System.out.println("18.5-25 = normal ");   
          System.out.println("25-27 = gemuk [kategori kelebihan berat badan tingkat rendah] ");
          System.out.println(">27 = gemuk  [kategori kelebihan berat badan tingkat berat] ");
          System.out.println("Perhatikan pola hidup dan berat badan anda");
          
}
}



