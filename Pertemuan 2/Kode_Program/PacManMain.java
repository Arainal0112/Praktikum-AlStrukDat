import java.util.Scanner;
public class PacManMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PacMan p1 = new PacMan();
        int input=0;
        p1.x = 0;
        p1.y = 0;

        System.out.print("Masukkan Lebar x = ");
        p1.width = sc.nextInt();

        System.out.print("Masukkan Panjang y = ");
        p1.height = sc.nextInt();

        for (;;) {
            System.out.println("==================");
            System.out.println("Pilih arah: ");
            System.out.println("1.Kiri");
            System.out.println("2.Kanan");
            System.out.println("3.Atas");
            System.out.println("4.Bawah");
            
            System.out.print("INPUT PILIHAN ANDA : ");
            input= sc.nextInt();
            System.out.println("==================");
            if (p1.x == 0 && input == 1) {
                System.out.println("Diluar Batas");
                p1.printPosition(p1.x, p1.y);
                continue;
            } else if (p1.y == 0 && input == 4) {
                System.out.println("Diluar Batas");
                p1.printPosition(p1.x, p1.y);
                continue;
            } else if (p1.x == p1.width && input == 2) {
                System.out.println("Diluar Batas");
                p1.printPosition(p1.x, p1.y);
                continue;
            } else if (p1.y == p1.height && input == 3) {
                System.out.println("Diluar Batas");
                p1.printPosition(p1.x, p1.y);
                continue;
            }

            if (input == 1) {
                p1.moveLeft(p1.x);
                p1.printPosition(p1.x, p1.y);
            } else if (input == 2) {
                p1.moveRight(p1.x);
                p1.printPosition(p1.x, p1.y);
            } else if (input == 3) {
                p1.moveUp(p1.y);
                p1.printPosition(p1.x, p1.y);
            } else if (input == 4) {
                p1.moveDown(p1.y);
                p1.printPosition(p1.x, p1.y);
            } else {
                System.out.println("Input Anda Salah");
                break;
            }

        }

    }
}
