import java.util.Scanner;
public class MainTiket{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        TiketService list = new TiketService();

        Tiket t1 = new Tiket("Lion Air", 600000, "Surabaya", "BalikPapan");
        Tiket t2 = new Tiket("Citilink", 550000, "Surabaya", "BalikPapan");
        Tiket t3 = new Tiket("Batik Air", 675000, "Surabaya", "BalikPapan");
        Tiket t4 = new Tiket("Air Asia", 545000, "Surabaya", "BalikPapan");
        Tiket t5 = new Tiket("Wings Airlines", 560000, "Surabaya", "BalikPapan");

        list.tambah(t1);
        list.tambah(t2);
        list.tambah(t3);
        list.tambah(t4);
        list.tambah(t5);

        System.out.println("------------------Sistem Pemesanan Tiket-----------------");
        System.out.println("---------------Daftar Maskapai Penerbangan---------------");
        System.out.println("------------------Surabaya - Balik Papan-----------------");
        list.tampilAll();

        System.out.println("Pilih Filter Menurut : ");
        System.out.println("1. Harga Terendah \n2. Harga Tertingi");
        System.out.print("Masukan Pilihan : ");
        int pil = sc.nextInt();
            
        if(pil == 1){
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println("Data Maskapai dari Harga Terendah");
            System.out.println("----------------------------------");
            list.selectionSort();
            list.tampilAll();               
        }else if(pil == 2){
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println("Data Maskapai dari Harga Tertinggi");
            System.out.println("----------------------------------");
            list.bubbleSort();
            list.tampilAll(); 
        }else{
            System.out.println("Input Salah");
        }
    
    }
}

class Tiket{
    public String maskapai, asal, tujuan;
    public int harga;
    
    Tiket(String m, int h, String a, String t){
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;
    }
    void tampilAll(){
        System.out.println("Nama Maskapai\t= " + maskapai);
        System.out.println("Harga\t\t= " + harga);
        System.out.println("Asal\t\t= " + asal);
        System.out.println("Tujuan\t\t= " + tujuan);
    }
}

class TiketService{
    Tiket tikets[] = new Tiket[5];
    int idx;

    void tambah(Tiket t){
        if(idx < tikets.length){
            tikets[idx] = t;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh!!");
        }
    }
    void tampilAll(){
        for(Tiket t : tikets){
            t.tampilAll();
            System.out.println("----------------------------------");
        }
    }

    void bubbleSort(){
        for(int i=0; i<tikets.length-1; i++){
            for(int j=1; j<tikets.length-i; j++){
                if(tikets[j].harga > tikets[j-1].harga){
                    Tiket tkt =tikets[j];
                    tikets[j] = tikets[j-1];
                    tikets[j-1] = tkt;
                }
            }
        }
    }

    void selectionSort(){
        for(int i=0; i<tikets.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<tikets.length; j++){
                if(tikets[j].harga < tikets[idxMin].harga){
                    idxMin = j;
                }
            }
            Tiket tkt = tikets[idxMin];
            tikets[idxMin] = tikets[i];
            tikets[i] = tkt;
        }
    }
}