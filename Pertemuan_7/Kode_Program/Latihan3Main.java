import java.util.Scanner;
public class Latihan3Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] array = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        Pencarian lt = new Pencarian();
        
        for(int i=0; i<array.length; i++){
            Latihan3 n = new Latihan3(array[i]);
            lt.tambah(n);
        }
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("Nilai Keseluruhan : ");
        lt.tampil();
        System.out.println();
        System.out.println("===================================");
        System.out.println("Nilai Setelah DiSorting");
        lt.selectionSort();
        lt.tampil();

        System.out.println();
        System.out.println("_____________________________________________");
        System.out.println("_____________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nilai Yang dicari : ");
        System.out.print("Nilai : ");
        int cari = sc.nextInt();  

        System.out.println("=============================================");
        System.out.println("Menggunakan Binary Search");
        int posisi = lt.FindBinarySearch(cari, 0, array.length-1);
        lt.Tampilposisi(cari, posisi);
        lt.TampilData(cari, posisi);
        
        lt.Terbesar();


    }
}

class Latihan3{
    int nilai;

    Latihan3(int n){
        nilai = n;
    }
    void tampil(){
        System.out.print(nilai +"  ");
    }
}

class Pencarian{
    Latihan3 list[] = new Latihan3[10];
    int idx;

    void tambah(Latihan3 n){
        if(idx < list.length){
            list[idx] = n;
            idx++;
        }else{
            System.out.println("Nilai Penuh");
        }
    }
    void tampil(){
        for(Latihan3 n : list){
            n.tampil();
        }
    }
    void selectionSort(){
        for(int i=0; i<list.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<list.length; j++){
                if(list[j].nilai < list[idxMin].nilai){
                    idxMin = j;
                }
            }
            //Swap
            Latihan3 nl = list[idxMin];
            list[idxMin] = list[i];
            list[i] = nl;
        }
    }
    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left +right)/2;
            if (cari == list[mid].nilai){
                return(mid);
            } else if (list[mid].nilai > cari){
                return FindBinarySearch(cari, left, mid-1);
            } else{
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
    public void Tampilposisi(int x, int pos){
        if (pos!=-1){
            System.out.println("Nilai : "+ x + " ditemukan pada indeks ke- "+pos);
        }else {
            System.out.println("Nilai : "+ x + " tidak ditemukan");
        }
    }
    public void TampilData(int x, int pos){
        if(pos!=-1){
            System.out.println("Nilai\t= " + x);

        }else{
            System.out.println("Data "+x+" Tidak ditemukan");
        }
    }
    public void Terbesar(){
        int max=0, n=0, x=0, sama=0;
        for (int i=0; i<list.length; i++){
            if(list[i].nilai > max){
                max = list[i].nilai;
                n=i;
            }    
        }
        for (int j=0; j<list.length; j++){
            if(max == list[j].nilai){
                sama++;
                x=j;
            }
        } 
        System.out.println("======================================");
        System.out.println("Nilai Terbesar = "+max);
        System.out.println("Nilai Terbesar berada di index ke -"+n);
        System.out.println("Nilai Terbesar memiliki nilai sama sebanyak "+sama+" angka di index ke "+n+" dan "+x);
    }
    

}

