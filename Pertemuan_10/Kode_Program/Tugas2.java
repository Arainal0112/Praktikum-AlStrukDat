import java.util.Scanner;
public class Tugas2 {
    public static void menu() {
        System.out.println("");
        System.out.println("Silahkan Pilih Menu:");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian Mahasiswa");
        System.out.println("5. Cek Antrian Paling Belakang");
        System.out.println("6. Cari Posisi Mahasiswa Berdasarkan NIM");
        System.out.println("7. Cari data Mahasiswa Berdasarkan Posisi");
        System.out.println("-----------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jmlh = sc.nextInt();
        Queue2 antri = new Queue2(jmlh);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("NIM\t: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama\t: ");
                    String nama = sc.nextLine();
                    System.out.print("Absen\t: ");
                    int absen = sc.nextInt();
                    System.out.print("IPK\t: ");
                    double ipk = sc.nextDouble();

                    Mahasiswa nb = new Mahasiswa(nim, nama, absen, ipk);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Mahasiswa data = antri.Dequeue();
                    if (!"".equals(data.nim) && !"".equals(data.nama) && data.absen != 0 && data.ipk != 0) {
                        System.out.println("Data yang dikeluarkan : " + data.nim + " " + data.nama + " " + data.absen + " " + data.ipk);
                        break;
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan NIM yang ingin dicari : ");
                    String cari = sc.nextLine();
                    antri.peekPosition(cari);
                    break;
                case 7:
                    System.out.print("Masukkan posisi Mahasiswa yang ingin dicari : ");
                    int pos = sc.nextInt();
                    antri.printMahasiswa(pos);
                    break;
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
class Mahasiswa {
    String nim, nama;
    int absen;
    double ipk;

    Mahasiswa(String nim, String nama, int absen, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk = ipk;
    }
    Mahasiswa(){  
    }
}

class Queue2 {
    Mahasiswa[] data;
    int front, rear, size, max;

    public Queue2(int n) {
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].nim + " " + data[front].nama + " " + " " + data[front].absen + " " + data[front].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].nim + " " + data[i].nama + " " + " " + data[i].absen + " " + data[i].ipk);
                i = (i + 1) % max;
            }
            System.out.println(data[i].nim + " " + data[i].nama + " " + " " + data[i].absen + " " + data[i].ipk);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Mahasiswa dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public Mahasiswa Dequeue() {
        Mahasiswa dt = new Mahasiswa();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terbelakang: " + data[rear].nim + " " + data[rear].nama + " " + " " + data[rear].absen + " " + data[rear].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String cari) {
        int i = front;
        int posisi = 1;
        System.out.print("data " + cari + " ada pada posisi : ");
        while(i != rear) {
            if (data[i].nim.equals(cari)){
                System.out.print(posisi + " ");
            }
            i = (i+1) % max;
            posisi++;
        }
        if (data[i].nim.equals(cari)){
            System.out.print(posisi + " ");
        }
        System.out.println();
    }

    public void printMahasiswa(int pos) {
        int idxcari = front;
        System.out.print("Data pada posisi " + pos + " adalah : ");
        for (int i = 0 ; i < pos - 1 ; i++){
            idxcari = (idxcari + 1) % max;
        }

        System.out.println(data[idxcari].nim + " " + data[idxcari].nama + " " + " " + data[idxcari].absen + " " + data[idxcari].ipk);
    }
}