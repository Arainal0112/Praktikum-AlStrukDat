import java.util.Scanner;
public class MainPangkat{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.print("Masukan Jumlah Elemen yang ingin di hitung : ");
        int elemen = sc.nextInt();


        Pangkat[] png = new Pangkat[elemen];

        for(int i=0; i<elemen; i++){
            png[i] = new Pangkat();
            System.out.print("Masukan nilai yang akan dipangkatkan ke- "+(i+1)+" : ");
            png[i].nilai= sc.nextInt();
            System.out.print("Masukan nilai pangkat ke- "+(i+1)+" : ");
            png[i].pangkat= sc.nextInt();
        }
        /*
        for(int i=0; i<elemen; i++){
            System.out.print("Masukan nilai yang akan dipangkatkan ke- "+(i+1)+" : ");
            int a = sc.nextInt();
            System.out.print("Masukan nilai pangkat ke- "+(i+1)+" : ");
            int n = sc.nextInt();
            png[i] = new Pangkat(a, n);
        }*/
        System.out.println("===============================================");
        System.out.println("Menu Penyelesaian");
        System.out.println("1. Brute Force\n2. Divide and Conquer");
        System.out.print("Silahkan Pilih menu : ");
        int menu = sc.nextInt();
        if(menu ==1){
            System.out.println("===============================================");
            System.out.println("Hasil Pangkat dengan Brute Force");
            for(int i=0; i<elemen; i++){
                System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }
        }else if(menu==2){
            System.out.println("===============================================");
            System.out.println("Hasil Pangkat dengan Devide and Conquer");
            for(int i=0; i <elemen ; i++){
                System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            }
        }else {
            System.out.println("Pilihan Tidak tersedia");
        }
        
    }
}