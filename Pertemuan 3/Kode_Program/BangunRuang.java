import java.util.Scanner;
public class BangunRuang{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        //KUBUS
        System.out.println("============================================");
        System.out.println("Menghitung Luas dan volume bangun Kubus");
        System.out.println("============================================");
        Kubus[] kArray = new Kubus[3];
        for(int i=0; i<3; i++){
            kArray[i] = new Kubus();
            System.out.print("Masukan panjang sisi ke- "+i+" : ");
            kArray[i].sisi = sc.nextInt();
        }
        System.out.println("============================================");
        for(int i=0; i<3; i++){
            System.out.println("Luas Permukaan Kubus Ke- "+i+"\t: " + kArray[i].luasPermukaan());
            System.out.println("Volume Kubus ke-"+i+"\t\t: "+kArray[i].volume());
            System.out.println("--------------------------------------------");
        }

        //PRISMA
        System.out.println("============================================");
        System.out.println("Menghitung Luas dan volume bangun Prisma");
        System.out.println("============================================");
        Prisma[] pArray = new Prisma[3];

        for(int i=0; i<3; i++){
            pArray[i] = new Prisma();
            System.out.print("Masukan Tinggi Prisma ke- "+i+"\t\t: ");
            pArray[i].tinggiPrisma = sc.nextInt();
            System.out.print("Masukan Tinggi Segitiga ke- "+i+"\t\t: ");
            pArray[i].tinggiSegitiga = sc.nextInt();
            System.out.print("Masukan panjang sisi Segitiga ke- "+i+"\t: ");
            pArray[i].sisiSegitiga = sc.nextInt();
        }
        System.out.println("============================================");
        for(int i=0; i<3; i++){
            System.out.println("Luas Permukaan Prisma Ke- "+i+"\t: " + pArray[i].luasPermukaan());
            System.out.println("Volume Prisma ke-"+i+"\t\t: "+pArray[i].volume());
            System.out.println("--------------------------------------------");
        }

        //TABUNG
        System.out.println("============================================");
        System.out.println("Menghitung Luas dan volume bangun Prisma");
        System.out.println("============================================");
        Tabung[] tArray = new Tabung[3];

        for(int i=0; i<3; i++){
            tArray[i] = new Tabung();
            System.out.print("Masukan Tinggi Tabung ke- "+i+"\t: ");
            tArray[i].tinggi = sc.nextInt();
            System.out.print("Masukan Jari-jari Tabung  ke- "+i+"\t: ");
            tArray[i].jariJari = sc.nextInt();
        }
        System.out.println("============================================");
        for(int i=0; i<3; i++){
            System.out.println("Luas Permukaan Tabung Ke- "+i+"\t:" + tArray[i].luasPermukaan());
            System.out.println("Volume Tabung ke-"+i+"\t\t:"+tArray[i].volume());
            System.out.println("--------------------------------------------");
        }
        System.out.println("============================================");

    }
}
class Kubus{
    public int sisi;

    public int luasPermukaan(){
        return (sisi*sisi)*6;
    }
    public int volume(){
        return sisi*sisi*sisi;
    }
}

class Prisma{
    public int sisiSegitiga, tinggiPrisma, tinggiSegitiga;
    
    public int luasPermukaan(){
        return (2*((tinggiSegitiga*sisiSegitiga)/2))+(3*(sisiSegitiga*tinggiPrisma));
    }
    public int volume(){
        return ((sisiSegitiga*tinggiSegitiga)/2)*tinggiPrisma;
    }
}

class Tabung{
    public double phi=3.14;
    public int jariJari, tinggi;
    
    public double luasPermukaan(){
        return 2*phi*(jariJari*tinggi);
    }
    public double volume(){
        return phi*jariJari*jariJari*tinggi;
    }
}