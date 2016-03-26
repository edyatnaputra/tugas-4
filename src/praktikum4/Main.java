package praktikum4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        int a =0;
        Bukualamat m = new Bukualamat (); 
        
        Scanner input = new Scanner (System.in);
        do{
        System.out.println("1. Masukkan Data");
        System.out.println("2. Lihat Data");
        System.out.println("3. Keluar");
        System.out.print("> ");
        int pil = input.nextInt();
        
        switch (pil){
            case 1:  
                System.out.print("Masukkan Nama          :");
                input.nextLine();
                String nama = input.nextLine();
                System.out.print("Masukkan Alamat        :");
                String alamat = input.nextLine();
                System.out.print("Masukkan Email         :");
                String email= input.nextLine();
                System.out.print("Masukkan Nomor Telepon :");
                String nope = input.nextLine();
                m.setNope(nope);
                m.setNama(nama);
                m.setAlamat(alamat);
                m.setEmail(email);
                break;
            case 2:
                m.display();
                break;
            case 3:
                System.out.println("Program Berhenti");
                a=3;
                break;
            default : System.out.println("Inputan Salah");
                break;
                
        }
                
                
        }while (a==0);
        
    }
    
}
