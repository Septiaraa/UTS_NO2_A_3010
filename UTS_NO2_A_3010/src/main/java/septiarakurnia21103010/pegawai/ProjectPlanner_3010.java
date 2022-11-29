/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package septiarakurnia21103010.pegawai;

/**
 *
 * @author admin
 */
public class ProjectPlanner_3010 extends Employee_3010 {
    int gajiPokok_3010, komisi_3010, totalHasilProyek_3010;
    float pajak_3010;
    int gaji_3010;
    
    public ProjectPlanner_3010(String nama_3010, String nip_3010, int gajiPokok_3010, int komisi_3010, int totalHasilProyek_3010){
        super(nama_3010,nip_3010);
        this.gajiPokok_3010 = gajiPokok_3010;
        this.komisi_3010 = komisi_3010;
        this.totalHasilProyek_3010 = totalHasilProyek_3010;
    }
    public void menghitungGaji_3010(){
        pajak_3010 = (float) (0.05*gajiPokok_3010);
        gaji_3010 = (int) (gajiPokok_3010 + (komisi_3010*totalHasilProyek_3010)-pajak_3010);
        System.out.println("GAJI                : Rp "+gaji_3010);
    }
    public void cetakInformasi_3010(){
        System.out.println("NAMA                : "+nama_3010);
        System.out.println("NIP                 : "+nip_3010);
        System.out.println("GAJI POKOK          : Rp "+gajiPokok_3010);
        System.out.println("KOMISI              : Rp "+komisi_3010);
        System.out.println("TOTAL HASIL PROYEK  : "+totalHasilProyek_3010);
        menghitungGaji_3010();    
    }
}
