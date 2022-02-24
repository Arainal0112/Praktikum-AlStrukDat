import java.util.Scanner;
public class Fungsi{

    static int[][] stock = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };
    static String[] cabang= {"RoyalGarden1","RoyalGarden2","RoyalGarden3","RoyalGarden4"};
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //1. 
        menampilkanStockBunga();
        //2.
        menampilkanSeluruhStock();
    }
    static void menampilkanStockBunga() {
        System.out.println("1. Menampilkan stock sesuai tabel");
        System.out.println("Cabang\t\t|  Algonema\t|Keladi\t\t|Alocasia\t|Mawar");
        System.out.println(cabang[0] + "\t|   " + stock[0][0] + "\t\t|  " + stock[0][1] + "\t\t|  " + stock[0][2] + "\t\t|  " +stock[0][3]);
        System.out.println(cabang[1] + "\t|   " + stock[1][0] + "\t\t|  " + stock[1][1] + "\t\t|  " + stock[1][2] + "\t\t|  " +stock[1][3]);
        System.out.println(cabang[2] + "\t|   " + stock[2][0] + "\t\t|  " + stock[2][1] + "\t\t|  " + stock[2][2] + "\t\t|  " +stock[2][3]);
        System.out.println(cabang[3] + "\t|   " + stock[3][0] + "\t\t|  " + stock[3][1] + "\t\t|  " + stock[3][2] + "\t\t|  " +stock[3][3]);
        
    }

    static void menampilkanSeluruhStock() {
        int aglonema=0, keladi=0, alocasia=0, mawar=0;
        
        for (int i=0; i<cabang.length;i++){
            aglonema += stock[i][0];
        }
        for (int i=0; i<cabang.length;i++){
            keladi += stock[i][1];
        }
        for (int i=0; i<cabang.length;i++){
            alocasia += stock[i][2];
        }
        for (int i=0; i<cabang.length;i++){
            mawar += stock[i][3];
        }

        System.out.println("\n2. Berdasarkan jenis bunganya di seluruh Cabang");
        System.out.println("Stock Algonema\t: " +aglonema);
        System.out.println("Stock keladi\t: " +keladi);
        System.out.println("Stock Alocasia\t: " +alocasia);
        System.out.println("Stock Mawar\t: " +mawar);

    }   
}