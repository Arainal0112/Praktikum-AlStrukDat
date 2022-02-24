import java.util.Scanner;
public class Perulangan{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int nim, n;
        String hari[]={"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
        
        System.out.print("Masukan NIM : ");
        nim = sc.nextInt();
        n = (nim - 2141720000);
        if(n<10){
            n+=10;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(hari[i % 7]+" ");
        }
        System.out.println("");

    }
}