import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pelanggan, pendapatan=0, berat;
        double bayar=0, diskon;
        System.out.print("Masukan Jumlah Pelanggan\t: ");
        pelanggan=sc.nextInt();
        String nama;

        for(int i=0; i<pelanggan; i++){
            System.out.print("Masukan nama Pelanggan\t: ");
            nama = sc.next();
            System.out.print("Masukan berat baju\t: ");
            berat= sc.nextInt();
            if (berat>10){
                 
                bayar = berat*4500;
                diskon = bayar*0.05;
                bayar = bayar-diskon;
                System.out.println("Selamat anda mendapat diskon 5%");
            } else {
                bayar = berat*4500;
            }
            System.out.println("Jumlah Bayar "+nama+"\t= " +bayar);
            System.out.println("===================================");
            pendapatan+=bayar;
        }
        System.out.println("Hasil Pendapatan Dari Keseluruhan Laundry adalah Rp: "+ pendapatan);
    }
}