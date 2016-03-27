package praktikum4;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Bukualamat[] buku = new Bukualamat[0];
        int i = 0, u = 0, w = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("1. Masukkan Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Ubah Data");
            System.out.println("0. Keluar");
            System.out.print("> ");
            int pil = input.nextInt();

            switch (pil) {
                case 1:
                    buku = Arrays.copyOf(buku, buku.length + 1);
                    Bukualamat.input(buku, i);
                    i++;
                    break;
                case 2:
                    Bukualamat.display(buku);
                    break;
                case 3:
                    Bukualamat.display(buku);
                    System.out.print("Hapus Data Ke- ? ");
                    w = input.nextInt();
                    System.out.print("y/n untuk menghapus");
                    if (input.next().equals("y") && (w - 1) < buku.length) {
                        Bukualamat.delete(buku, w);
                    } 
                    break;
                case 4:
                    Bukualamat.display(buku);
                    System.out.print("Edit Data Ke- ? ");
                    w = input.nextInt();
                    if ((w - 1) < buku.length) {
                        Bukualamat.edit(buku, w);
                    }
                    break;
                case 0:
                    u++;
                    break;

            }

        } while (u == 0);

    }

}
