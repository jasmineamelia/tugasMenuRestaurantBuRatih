
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zalfa jasmine amelia
 */
public class BuratihMenurastaurant {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String MenuMakanan;
        int harga;
        int total = 0;
        int Pembayaran;
        int Menumakanan;
        Boolean status = true;
        do {
            System.out.println("List Harga\n 1.Soto ayam 17.000\n 2. Bakso 12000\n 3. Ayam geprek 15000\n 4. Nasi goreng 13000\n.5. Mie goreng 10.000");
            System.out.println("Mau beli apa?");
            Menumakanan = s.nextInt();
            
            if (Menumakanan == 1) {
                MenuMakanan = "Soto ayam";
            } else if(Menumakanan == 2){
                MenuMakanan = "Bakso";
            } else if(Menumakanan == 3){
                MenuMakanan = "Ayam geprek";
            } else if (Menumakanan == 4){
                MenuMakanan = "Nasi goreng";
            } else {
               MenuMakanan = "undefined";
            }
            
            switch(Menumakanan   ){
                case 1:
                    harga = 17000;
                    total += harga;
                    break;
                case 2:
                    harga = 12000;
                    total += harga;
                    break;
                case 3:
                    harga = 15000;
                    total += harga;
                    break;
                case 4:
                    harga = 13000;
                    total += harga;
                    break;
                case 5:
                    harga = 10000;
                    total += harga;
                    break;

                default:
                    harga = 0;
                    break;
            }  
            System.out.println("Apakah ada yang mau dipesan lagi? (ya/tidak");
            String lagi = s.next();
            if (lagi.equalsIgnoreCase("tidak")) {
                status = false ;
            } else {
                status = true;
            } 
        }while ( status ); 
            System.out.println("Total: " + total);
        
        }
        }

    

