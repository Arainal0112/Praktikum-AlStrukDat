import java.util.Scanner;
public class Tugas1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();
        int pilihan;
        do {

            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima");
            System.out.println("2. Hapus Data Pengantri");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.print("Pilih Menu : ");
            pilihan = sc.nextInt();
            System.out.println("");
            if (pilihan == 1){
                sc.nextLine();
                System.out.println("-----------------------------");
                System.out.println("Masukkan Data Penerima Vaksin");
                System.out.println("-----------------------------");
                System.out.print("Nomor Antrian : ");
                String nomor = sc.nextLine();
                System.out.print("Nama Penerima : ");
                String nama = sc.nextLine();
                System.out.println("");
                dll.Enqueue(nomor, nama);
            }
            if (pilihan == 2){
                dll.Dequeue();
                dll.Print();
            }
            if (pilihan == 3){
                dll.Print();
            }
            if (pilihan == 4){
                pilihan = 4;
            }
        } while (pilihan != 4);
    }
}

class Node{
    String nama, no;
    Node prev, next;

    Node (Node prev, String no, String nama,  Node next){
        this.prev =prev;
        this.no=no;
        this.nama = nama;
        this.next = next;
    }
}

class DoubleLinkedList{
    Node head;
    int size;

    DoubleLinkedList(){
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public void Print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("+++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("+++++++++++++++++++++++");
            System.out.println("|No.\t|Nama\t|");
            while (tmp != null) {
                System.out.println("|" + tmp.no + "\t|" + tmp.nama+"\t|");
                tmp = tmp.next;
        }
        
        System.out.println("Sisa Antrian : " + size);
        } else {
            System.out.println("Linked List Queue Masih Kosong");
        }
    }

    public void Enqueue(String no, String nama) {
        Node newNode = new Node(null, no, nama, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked List Queue Masih Kosong");
        }else if (head.next == null){
            head=null;
            size--;
            return;
        }
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void Dequeue() {
        if (isEmpty()) {
            System.out.println("Linked List Masih Kosong, tidak dapat di hapus");
        } else if (size == 1) {
           System.out.println(head.nama + " Telah Selesai Di Vaksinasi");
           removeLast();
        } else {
            System.out.println(head.nama + " Telah Selesai Di Vaksinasi");
            head = head.next;
            head.prev = null;
            size--;
        }
    }

}