import java.util.Scanner;

public class Siakad14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMahas = input.nextInt();
        System.out.print("Masukkan jumlah matakuliah : ");
        int jmlMatkul = input.nextInt();

        int [][] nilai = new int[jmlMahas][jmlMatkul];
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-"+(i+1));
            double totalPersiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah "+ (j+1) + ": ");
                nilai[i][j] = input.nextInt();
                totalPersiswa += nilai[i][j];
            }
            double rataPersiswa = totalPersiswa/jmlMatkul;
            System.out.println("Nilai rata-rata: "+rataPersiswa);
        }
        System.out.println("\n===============================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah");

        for (int j = 0; j < jmlMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jmlMahas; i++) {
                totalPerMatkul += nilai[i][j];
            }
            double rataPerMatkul = totalPerMatkul/jmlMahas;
            System.out.println("Mata Kuliah "+(j+1)+ ": "+rataPerMatkul);
        }
    }
}