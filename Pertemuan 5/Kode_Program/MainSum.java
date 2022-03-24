import java.util.Scanner;
public class MainSum{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan total (Satuan juta, misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan : ");
        int prsh = sc.nextInt();
        int jml = 0;
        for(int i=0; i<prsh; i++){
            System.out.print("Masukkan jumlah bulan Perusahaan ke-"+(i+1)+" : ");
            int elm =sc.nextInt();
            jml = elm;
        }
        Sum sm = new Sum(jml, prsh);
        System.out.println("============================================================");
        for(int i=0; i<prsh; i++){
            System.out.println("Masukkan untung Perusahaan ke-"+(i+1));
            for(int j=0; j<jml; j++){
                System.out.print("Masukkan untung bulan ke-"+(j+1)+" = ");
                sm.keuntungan[j] = sc.nextDouble();
            }
        }
        for(int i=0; i<prsh; i++){
            System.out.println("Untung Perusahaan ke-"+(i+1));
            System.out.println("=============================================================");
            System.out.println("Algoritma Bruce Force");
            System.out.println("Total Keuntungan Perusahaan Selama "+sm.elemen[i]+" bulan adalah "+sm.totalBF(sm.keuntungan));
            System.out.println("=============================================================");
            System.out.println("Algoritma Divide and Conquer");
            System.out.println("Total Keuntungan Perusahaan Selama "+sm.elemen[i]+" bulan adalah "+sm.totalDC(sm.keuntungan, 0, sm.elemen[i]-1));
        }
    }
}