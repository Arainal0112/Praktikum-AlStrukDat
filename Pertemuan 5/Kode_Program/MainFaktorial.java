import java.util.Scanner;
public class MainFaktorial{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===============================================");
        System.out.print("Masukan Jumlah Elemen yang ingin di hitung : ");
        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for(int i =0; i< elemen; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukan nilai data Ke-"+(i+1)+" : ");
            fk[i].nilai =sc.nextInt();
        }

        long start= System.currentTimeMillis();
        System.out.println("===============================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for(int i=0; i<elemen; i++){
            System.out.println("Faktorial dari "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));
        }
        long end=System.currentTimeMillis();
        long elapsedtime= end - start;
        System.out.println("Waktu Eksekusi dengan Brute Force : "+ String.valueOf(elapsedtime)+" milidetik");

        long start1= System.currentTimeMillis();
        System.out.println("===============================================");
        System.out.println("Hasil Faktorial dengan Devide and Conquer");
        for(int i=0; i <elemen ; i++){
            System.out.println("Faktorial dari "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
        }
        long end1=System.currentTimeMillis();
        long elapsedTime1= end1 - start1;
        System.out.println("Waktu Eksekusi dengan Devide and conquer : "+ String.valueOf(elapsedtime)+" milidetik");
    }
}