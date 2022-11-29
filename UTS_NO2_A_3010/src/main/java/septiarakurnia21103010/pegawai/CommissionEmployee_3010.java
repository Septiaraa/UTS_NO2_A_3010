/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package septiarakurnia21103010.pegawai;

/**
 *
 * @author admin
 */
public class CommissionEmployee_3010 extends Employee_3010{
    int gajiPokok_3010,komisi_3010,totalPenjualan_3010;
    int gaji_3010;
    
    public CommissionEmployee_3010(String nama_3010, String nip_3010, int gajiPokok_3010,int komisi_3010,int totalPenjualan_3010){
        super(nama_3010,nip_3010);
        this.gajiPokok_3010 = gajiPokok_3010;
        this.komisi_3010 = komisi_3010;
        this.totalPenjualan_3010 = totalPenjualan_3010;
    }
    public void menghitungGaji_3010(){
        gaji_3010 = gajiPokok_3010 + (komisi_3010*totalPenjualan_3010);
        System.out.println("GAJI                : Rp "+gaji_3010);
    }
    public void cetakInformasi_3010(){
        System.out.println("NAMA                : "+nama_3010);
        System.out.println("NIP                 : "+nip_3010);
        System.out.println("GAJI POKOK          : Rp "+gajiPokok_3010);
        System.out.println("KOMISI              : Rp "+komisi_3010);
        System.out.println("TOTAL PENJUALAN     : "+totalPenjualan_3010);
        menghitungGaji_3010();
    }
}
