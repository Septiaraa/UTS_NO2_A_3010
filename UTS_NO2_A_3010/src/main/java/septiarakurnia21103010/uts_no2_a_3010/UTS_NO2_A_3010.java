/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package septiarakurnia21103010.uts_no2_a_3010;

/**
 *
 * @author admin
 */
public class UTS_NO2_A_3010 {

    public static void main(String[] args) {
        CommissionEmployee_3010 C = new CommissionEmployee_3010("Indira", 
             "C1001", 2000000, 100000, 10);
        ProjectPlanner_3010 P = new ProjectPlanner_3010("Kurniawan", "P5001", 
             3000000, 500000, 7);
        SalariedEmployee_3010 S = new SalariedEmployee_3010("Adiguna", "S1511", 
             50000);

        System.out.println("\t== DATA COMMISION EMPLOYEE ==");
        C.cetakInformasi_3010();
        System.out.println("");
        System.out.println("\t== DATA PROJECT PLANNER ==");
        P.cetakInformasi_3010();
        System.out.println("");
        System.out.println("\t== DATA SALARIED EMPLOYEE ==");
        S.cetakInformasi_3010();
    }
}
