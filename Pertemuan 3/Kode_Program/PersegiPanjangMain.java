import java.util.Scanner;
public class PersegiPanjangMain{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        /*Percobaan 3.2
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        ppArray[0] = new PersegiPanjang();
        ppArray[0].panjang =110;
        ppArray[0].lebar = 30;

        ppArray[1] = new PersegiPanjang();
        ppArray[1].panjang =80;
        ppArray[1].lebar = 40;

        ppArray[2] = new PersegiPanjang();
        ppArray[2].panjang =100;
        ppArray[2].lebar = 20;

        System.out.println("Persegi Panjang Ke-0, Panjang : " + ppArray[0].panjang + ", lebar : "+ppArray[0].lebar);
        System.out.println("Persegi Panjang Ke-0, Panjang : " + ppArray[1].panjang + ", lebar : "+ppArray[1].lebar);
        System.out.println("Persegi Panjang Ke-0, Panjang : " + ppArray[2].panjang + ", lebar : "+ppArray[2].lebar);
        */
        
        //Percobaan 3.3
        System.out.println("Masukan banyaknya objek : ");
        int length = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[length];
        for (int i=0; i<length; i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke- "+i);
            System.out.print("Masukan Panjang : ");
            ppArray[0].panjang =sc.nextInt();
            System.out.print("Masukan Lebar : ");
            ppArray[0].lebar = sc.nextInt();
        }
        for(int i=0; i<length; i++){
            System.out.println("Persegi Panjang ke-"+ i);
            System.out.println("Panjang "+ ppArray[i].panjang + ", lebar "+ ppArray[i].lebar);
        }
    }
}