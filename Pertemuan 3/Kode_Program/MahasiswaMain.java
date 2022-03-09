import java.util.Scanner;
public class MahasiswaMain{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukan Jumlah Mahasiswa : ");
        int jmlh = sc.nextInt();
        Mahasiswa[] mArray = new Mahasiswa[jmlh];

        for(int i=0; i<jmlh; i++){
            mArray[i] = new Mahasiswa();
            System.out.println("Masukkan data mahasiswa Ke- "+(i+1));
            System.out.print("Masukkan Nama\t\t: ");
            mArray[i].nama=sc.next();
            System.out.print("Masukkan NIM\t\t: ");
            mArray[i].nim=sc.next();
            System.out.print("Masukkan Jenis Kelamin\t: ");
            mArray[i].j_kelamin=sc.next();
            System.out.print("Masukkan IPK\t\t: ");
            mArray[i].ipk=sc.next();
            System.out.println();
        }
        System.out.println("-------------------------------------");
        for(int i=0; i<jmlh; i++){
            System.out.println("Data Mahasiswa Ke-"+(i+1));
            System.out.println("Nama\t\t: "+mArray[i].nama);
            System.out.println("NIM\t\t: "+mArray[i].nim);
            System.out.println("Jenis Kelamin\t: "+mArray[i].j_kelamin);
            System.out.println("IPK\t\t: "+mArray[i].ipk);
        }
    }
}