import java.util.Scanner;
public class Latihan1{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianMhs data = new PencarianMhs();
        int jumMhs = 5;

        System.out.println("--------------------------------");
        System.out.println("Masukan data Mahasiswa");
        for(int i=0; i<jumMhs;i++){
            System.out.println("-----------------------");
            System.out.print("Nim\t= " );
            int nim = s.nextInt();
            System.out.print("Nama\t= ");
            String nama = s1.nextLine();
            System.out.print("Umur\t= ");
            int umur = s.nextInt();
            System.out.print("IPK\t= ");
            double ipk = s.nextDouble();
        
            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }
        System.out.println("---------------------------------------");
        System.out.println("Data Keseluruhan Mahasiswa");
        data.tampil();

        System.out.println("_____________________________________________");
        System.out.println("Data DiSorting dari nim terendah");
        
        data.bubbleSort();
        data.tampil();
        System.out.println("_____________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nim Mahasiswa yang dicari : ");
        System.out.print("Nim : ");
        int cari = s.nextInt();
        
        System.out.println();
        System.out.println("===================================");
        System.out.println("Menggunakan Binary Search");
        int posisi = data.FindBinarySearch(cari, 0, jumMhs-1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

    }
}
