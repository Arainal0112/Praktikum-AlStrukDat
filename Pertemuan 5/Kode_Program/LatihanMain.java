import java.util.Scanner;
public class LatihanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.println("---------------Pemilihan Ketua BEM 2022---------------");
        System.out.println("======================================================");
        
        System.out.print("Masukkan Banyak Suara yang diterima: ");
        int suara = sc.nextInt();
        
        Latihan sr = new Latihan(suara);
        
        sc.nextLine();
        
        for(int i = 0; i < suara; i++){
            System.out.print("Masukkan Nama Kandidat Suara ke-"+ (i+1) + " = ");
            sr.kandidat[i] = sc.nextLine();
        }
        int hasil = sr.Mayoritas(sr.kandidat, 0, suara, 0);
        System.out.println("Mayoritas Jumlah Suara adalah : " + sr.kandidat[hasil]);
    }
}