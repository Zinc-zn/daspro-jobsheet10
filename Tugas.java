import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] survey = new int[6][10];
        double[] rataPer = new double[6];
        double[] rataRes = new double[10];

        int total = 0, totalPer = 0, totalRes = 0;
        double rata = 0;

        for (int i = 0; i < survey.length; i++) {
            System.out.println("Pertanyaan ke-" + (i+1));
            for (int j = 0; j < survey[i].length; j++) {
                System.out.print("Responden ke-" + (j+1) + ": ");
                int nilai;
                nilai = input.nextInt();
                if(nilai < 1 && nilai > 5) {
                    continue;
                }
                survey[i][j] = nilai;
            }
        }

        for(int i=0;i<survey.length;i++) {
            totalPer = 0;
            for(int j=0;j<survey[0].length;j++) {
                totalPer += survey[i][j];
            }
            rata = totalPer / survey[0].length;
            rataPer[i] = rata;
        }

        for(int i=0;i<survey[0].length;i++) {
            totalRes = 0;
            for(int j=0;j<survey.length;j++) {
                totalRes += survey[j][i];
            }
            rata = totalRes / survey.length;
            rataRes[i] = rata;
        }
        total = 0;
        for(int i=0;i<survey.length;i++) {
            for(int j=0;j<survey[0].length;j++) {
                total += survey[i][j];
            }
        }
        double rataTotal = total / (survey.length * survey[0].length);


        for(int i=0;i<survey.length;i++) {
            System.out.println("Rata-rata pertanyaan ke-" + (i+1) + ": " + rataPer[i]);
        }
        for(int i=0;i<survey[0].length;i++) {
            System.out.println("Rata-rata responden ke-" + (i+1) + ": " + rataRes[i]);
        }
        System.out.println("Rata-rata keseluruhan: " + rataTotal);
    }
}