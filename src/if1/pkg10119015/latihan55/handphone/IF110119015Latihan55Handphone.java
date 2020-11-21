/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan55.handphone;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class IF110119015Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Android hp1 = new Android("Samsung","Android","Grand",3000000);
        hp1.displayProduct();
        hp1.setKeyStore("234ibfd3840fo");
        System.out.println("Android Key Store : " + hp1.getKeyStore());
        System.out.println();
        
        BlackBerry hp2 = new BlackBerry("BlackB","RIM","Curve",2000000);
        hp2.displayProduct();
        hp2.setPinBB("BHS249");
        System.out.println("PIN : " + hp2.getPinBB());
        System.out.println();
        
        WindowsPhone hp3 = new WindowsPhone("Nokia","Win8","Lumia",1000000);
        hp3.displayProduct();
        hp3.setWpKeyStore("UUUQIJWORJ");
        System.out.println("Wp Key Store : " + hp3.getWpKeyStore());
    }
    
}
