package praktikum4;

import java.util.Scanner;

public class Bukualamat {

    Scanner in = new Scanner(System.in);
    private String nama;
    private String alamat;
    private String nope;
    private String email;

    public Bukualamat() {
        this.nama = "";
        this.alamat = "";
        this.nope = "";
        this.email = "";
    }

    public Bukualamat(String nama, String alamat, String nope, String email) {
        this.alamat = alamat;
        this.email = email;
        this.nama = nama;
        this.nope = nope;
    }

    public static void display(Bukualamat[] buku) {
        int i;
        for (i = 0; i < buku.length; i++) {
            
            if (buku[i].getNama().equals("")) {
                System.out.println("DATA KE-"+(i + 1)+" DATA TERHAPUS");
            } else {
                System.out.println("DATA KE-"+(i + 1));
                System.out.println("NAMA          : " + buku[i].getNama());
                System.out.println("ALAMAT        : " + buku[i].getAlamat());
                System.out.println("NOMER TELEPON : " + buku[i].getNope());
                System.out.println("EMAIL         : " + buku[i].getEmail());
            }

        }

    }

    public static void input(Bukualamat[] buku, int i) {
        buku[i] = new Bukualamat();
        System.out.print("NAMA          : ");
        buku[i].setNama();
        System.out.print("ALAMAT        : ");
        buku[i].setAlamat();
        System.out.print("NOMER TELEPON : ");
        buku[i].setNope();
        System.out.print("EMAIL         : ");
        buku[i].setEmail();
    }

    public static void edit(Bukualamat[] buku, int a) {
        --a;
        buku[a] = new Bukualamat();
        System.out.print("NAMA          : ");
        buku[a].setNama();
        System.out.print("ALAMAT        : ");
        buku[a].setAlamat();
        System.out.print("NOMER TELEPON : ");
        buku[a].setNope();
        System.out.print("EMAIL         : ");
        buku[a].setEmail();

    }

    public static void delete(Bukualamat[] buku, int a) {
        --a;
        buku[a] = new Bukualamat();

    }

    public String getNama() {
        return nama;
    }

    public void setNama() {
        this.nama = in.nextLine();
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat() {
        this.alamat = in.nextLine();
    }

    public String getNope() {
        return nope;
    }

    public void setNope() {
        this.nope = in.nextLine();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = in.nextLine();
    }

}
