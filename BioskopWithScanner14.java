import java.util.Scanner;

public class BioskopWithScanner14 {
    public static void main(String[] args) {
        String [][] penonton = new String[4][2];
        int baris, kolom, pilihan;
        String nama, next;
        Scanner input = new Scanner(System.in);

        
        while (true) {
            System.out.println("\nPilih menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan (1-3): ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                System.out.print("Masukkan Nama : ");
                nama = input.nextLine();
                
                do {
                    System.out.print("Masukkan Baris : ");
                    baris = input.nextInt();
                    System.out.print("Masukkan Kolom : ");
                    kolom = input.nextInt();
    
                    if (baris > 4 || baris < 1 || kolom > 2 || kolom < 1) {
                        System.out.println("Baris atau kolom tidak tersedia!");
                        break;
                    }
    
                    if (penonton[baris-1][kolom-1] != null) {
                        System.out.println("Baris atau kolom sudah terisi! Silahkan input ulang!");
                    }
                    
                } while (penonton[baris-1][kolom-1] != null);
                penonton[baris-1][kolom-1] = nama;
                break;
                case 2:
                System.out.println("\nDaftar Penonton:");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (penonton[i][j] == null) {
                            System.out.println("Baris " + (i+1) + ", Kolom " + (j+1) + ": ***");
                        } else { 
                            System.out.println("Baris " + (i+1) + ", Kolom " + (j+1) + ": " + penonton[i][j]);
                        }
                    }
                }
                break;
                case 3 :
                System.out.println("Program Selesai!");
                return;
            }
        }
    }
}