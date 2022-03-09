import java.util.Scanner;
public class TanahMain{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        //Input Jumlah Tanah
        System.out.print("Masukan Jumlah Tanah\t: ");
        int jmlh = sc.nextInt();

        Tanah [] tArray = new Tanah[jmlh];

        System.out.println("");
        //Input Panjang dan lebar
        for(int i=0; i<jmlh; i++){
            tArray[i]= new Tanah();
            System.out.println("Tanah Ke- "+(i+1));
            System.out.print("Masukan Panjang Tanah\t: ");
            tArray[i].panjang = sc.nextInt();
            System.out.print("Masukan Lebar Tanah\t: ");
            tArray[i].lebar = sc.nextInt();
            System.out.println("");
        }
        System.out.println("");

        //Tampil Luas Tanah
        for(int i=0; i<jmlh; i++){
            System.out.println("Luas Tanah Ke - "+(i+1)+" = "+ tArray[i].luas());
        }
        //Mencari tanah terluas
        int max=0, n=0;
        for (int i=0; i<jmlh; i++){
            if(tArray[i].luas() > max){
                max = tArray[i].luas();
                n=i+1;
            }     
        }
        System.out.println("");
        System.out.println("Tanah Terluas adalah tanah ke-"+n);

    }
}