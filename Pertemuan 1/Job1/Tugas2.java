import java.util.Scanner;
public class Tugas2{
    static double v, s, t;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int menu;
        System.out.println("------------Daftar Menu------------");
        System.out.println("1. Rumus Perhitungan Kecepatan");
        System.out.println("2. Rumus Perhitungan Jarak");
        System.out.println("3. Rumus Perhitungan Waktu");
            
        System.out.print("Pilihan Menu : ");
        menu = sc.nextInt();
        if(menu==1){
            kecepatan();
        }else if(menu==2){
            jarak();
        }else if(menu==3){
            waktu();
        }else{
            System.out.println("INPUT ANDA SALAH");
        }
    }
    //Menghitung hasil perhitungan Kecepatan
    static void kecepatan() {
        System.out.println("-------------------------------------");
        System.out.println("Manghitung Kecepatan");
        System.out.print("Masukkan jarak (km)\t: ");
        s = sc.nextDouble();
        System.out.print("Masukkan waktu (jam)\t: ");
        t = sc.nextDouble();
        v = s/t;
        System.out.println("Kecepatan\t\t= " + v + " Km/Jam" );
        System.out.println("-------------------------------------");
    }
    //Menghitung hasil perhitungan Jarak
    static void jarak() {
        System.out.println("-------------------------------------");
        System.out.println("Menghitung Jarak");
        System.out.print("Masukkan Kecepatan (Km/jam)\t: ");
        v = sc.nextDouble();
        System.out.print("Masukkan waktu (jam)\t\t: ");
        t = sc.nextDouble();
        s = v*t;
        System.out.println("Jarak\t\t\t\t= " + s +" Km");
        System.out.println("-------------------------------------");
        
    }
    //Menghitung hasil perhitungan Waktu
    static void waktu() {
        System.out.println("-------------------------------------");
        System.out.println("Menghitung Waktu");
        System.out.print("Masukkan jarak (Km)\t\t: ");
        s = sc.nextDouble();
        System.out.print("Masukkan kecepatan (Km/jam)\t: ");
        v = sc.nextDouble();
        t = s/v;
        System.out.println("Waktu yang ditempuh\t\t= " + t + " jam");
        System.out.println("-------------------------------------");
    }
}