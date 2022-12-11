/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package septiarakurnia21103010.uts_no2_a_3010;

/**
 *
 * @author admin
 */
public class SalariedEmployee_3010 extends Employees_3010{
    private int upahMingguan_3010;
    int gaji_3010;
    
    public SalariedEmployee_3010(String nama_3010, String nip_3010, int upahMingguan_3010){
        super(nama_3010,nip_3010);
        this.upahMingguan_3010 = upahMingguan_3010;
    }
    public void setUpahMingguan_3010(int upahMingguan_3010){
        this.upahMingguan_3010 = upahMingguan_3010;
    }
    public int getUpahMingguan_3010(){
        return upahMingguan_3010;
    }
    public void menghitungGaji_3010(){
        gaji_3010 = upahMingguan_3010;
        System.out.println("GAJI                : Rp "+gaji_3010);
    }
    public void cetakInformasi_3010(){
        System.out.println("NAMA                : "+nama_3010);
        System.out.println("NIP                 : "+nip_3010);
        System.out.println("UPAH MINGGUAN       : Rp "+upahMingguan_3010);
        menghitungGaji_3010();
    }  
}
