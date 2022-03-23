package application;
import data.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        String Nama, Prosesor, Os, Storage;
        int Stok, Core, Ram;
        
        Scanner masukan = new Scanner(System.in);
        
        Asus zenbook14 = new Asus();
        Lenovo thinkpad = new Lenovo();
        
        /* Untuk test Asus zenbook14 */
        zenbook14.AsusSlogan();
        System.out.print("Nama : "); Nama = masukan.nextLine();
        System.out.print("Prosesor : "); Prosesor = masukan.nextLine();
        System.out.print("Jumlah Core : "); Core = masukan.nextInt();masukan.nextLine();
        System.out.print("Operating System : "); Os = masukan.nextLine();
        System.out.print("Ukuran RAM(GB): "); Ram = masukan.nextInt();masukan.nextLine();
        System.out.print("Jenis Storage : "); Storage = masukan.nextLine();
        System.out.print("Stok : "); Stok = masukan.nextInt();masukan.nextLine();
        System.out.println("");
        zenbook14.setNama(Nama);
        zenbook14.setProsesor(Prosesor);
        zenbook14.setCore(Core);
        zenbook14.setOs(Os);
        zenbook14.setRam(Ram);
        zenbook14.setStorage(Storage);
        zenbook14.setStok(Stok);
        zenbook14.getAllLaptopData();
        System.out.println("Store Position " + zenbook14.getNama() + 
                " adalah " + zenbook14.getStorePositionLaptop());
        System.out.println("==========================================");
                
        // ============================================================== //
        
        /* Untuk test Lenovo thinkpad */
        thinkpad .LenovoSlogan();
        System.out.print("Nama : "); Nama = masukan.nextLine();
        System.out.print("Prosesor : "); Prosesor = masukan.nextLine();
        System.out.print("Jumlah Core : "); Core = masukan.nextInt();masukan.nextLine();
        System.out.print("Operating System : "); Os = masukan.nextLine();
        System.out.print("Ukuran RAM(GB): "); Ram = masukan.nextInt();masukan.nextLine();
        System.out.print("Jenis Storage : "); Storage = masukan.nextLine();
        System.out.print("Stok : "); Stok = masukan.nextInt();masukan.nextLine();
        System.out.println("");
        thinkpad.setNama(Nama);
        thinkpad.setProsesor(Prosesor);
        thinkpad.setCore(Core);
        thinkpad.setOs(Os);
        thinkpad.setRam(Ram);
        thinkpad.setStorage(Storage);
        thinkpad.setStok(Stok);
        thinkpad.getAllLaptopData();
        System.out.println("Store Position " + thinkpad.getNama() + 
                " adalah " + thinkpad.getStorePositionLaptop());
        System.out.println("==========================================");       
    }
}