import java.util.Scanner;
public class Array{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String[] cabang= {"RoyalGarden1","RoyalGarden2","RoyalGarden3","RoyalGarden4"};
        int [][] stock={
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
            };
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

        System.out.println("A. Jumlah Stock berdasarkan jenis bunganya di seluruh Cabang");
        System.out.println("Stock Algonema\t: " +aglonema);
        System.out.println("Stock keladi\t: " +keladi);
        System.out.println("Stock Alocasia\t: " +alocasia);
        System.out.println("Stock Mawar\t: " +mawar);

        int pendapatan = ((stock[0][0] - 1) * 75000) + ((stock[0][1] - 2) * 50000) + (stock[0][2] * 60000)+ ((stock[0][3] - 5) * 10000);
        System.out.println("B. Pendapatan Royal Garden 1 = "+pendapatan);

        
    }
}