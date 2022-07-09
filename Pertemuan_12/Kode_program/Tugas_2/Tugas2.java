import java.util.Scanner;
public class Tugas2{
    public static void main(String[]args)throws Exception{
        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();
        Film flm = new Film();
        int pilih;
        do {
            System.out.println("===============================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("===============================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Index Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-Desc");
            System.out.println("10. Keluar");
            System.out.println("===============================");
            System.out.print("Pilih Menu : ");
            pilih = sc.nextInt();
            System.out.println("");
            if (pilih == 1){
                
                System.out.println("-----------------------------");
                System.out.println("Masukkan Data Film di Awal");
                System.out.println("-----------------------------");
                System.out.print("ID Film : ");
                int id = sc.nextInt();
                System.out.print("Judul Film : ");
                String judul = ss.nextLine();
                System.out.print("Rating Film : ");
                double rating = sc.nextDouble();
                System.out.println("");
                flm = new Film(id, judul, rating);
                dll.addFirst(flm);
            }
            if (pilih == 2){
                
                System.out.println("-----------------------------");
                System.out.println("Masukkan Data Film di Akhir");
                System.out.println("-----------------------------");
                System.out.print("ID Film : ");
                int id = sc.nextInt();
                System.out.print("Judul Film : ");
                String judul = ss.nextLine();
                System.out.print("Rating Film : ");
                double rating = sc.nextDouble();
                System.out.println("");
                flm = new Film(id, judul, rating);
                dll.addLast(flm);
            }
            if (pilih == 3){
                
                System.out.println("-----------------------------");
                System.out.println("Masukkan Data Film di index Tertentu");
                System.out.println("-----------------------------");
                System.out.print("ID Film : ");
                int id = sc.nextInt();
                System.out.print("Judul Film : ");
                String judul = sc.nextLine();
                System.out.print("Rating Film : ");
                double rating = sc.nextDouble();
                System.out.println("Index : ");
                int idx = sc.nextInt();
                System.out.println("");
                flm = new Film(id, judul, rating);
                dll.add(flm, idx);
            }
            if (pilih == 4){
                dll.removeFirst();
            }
            if (pilih == 5){
                dll.removeLast();
            }
            if (pilih == 6){
                System.out.print("Input Index : ");
                int idx=sc.nextInt();
                dll.remove(idx);
            }if (pilih == 7){
                dll.print();
            }if (pilih == 8){
                System.out.print("Masukkan ID Film : ");
                int cari = sc.nextInt();
                dll.search(cari);
            }
            if (pilih == 9){
                dll.sort();
                dll.print();
            }

            if (pilih == 10){
                pilih = 10;
            }
        } while (pilih < 10);
    }
}

class Node{
    Node prev, next;
    Film film;

    Node (Node prev, Film film,  Node next){
        this.prev =prev;
        this.film=film;
        this.next = next;
    }
}
class Film{
    int id;
    String judul;
    double rating;
    Film(){

    }

    Film(int id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
    }  

}

class DoubleLinkedList{
    Node head;
    int size;
    Film [] arrayFilm;

    DoubleLinkedList(){
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Film film){
        if(isEmpty()){
            head = new Node(null, film, null);
        } else {
            Node newNode = new Node(null, film, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(Film film){
        if(isEmpty()){
            addFirst(film);
        }else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, film, null);
            current.next = newNode;
            size++;
        }
    }
    public void add(Film film, int index) throws Exception{
        if(isEmpty()){
            addFirst(film);
        }else if(index < 0 || index > size){
            throw new Exception("Nilai indeks diluar batas");
        }else{
            Node current = head;
            int i=0;
            while (i<index){
                current = current.next;
                i++;
            }
            if (current.prev == null){
                Node newNode = new Node(null, film, current);
                current.prev = newNode;
                head=newNode;
            }else{
                Node newNode = new Node(current.prev, film, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev =newNode;

            }
        }
        size++;
    }
    public int size(){
        return size;
    }
    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("+++++++++++++++++++++++");
            System.out.println("DATA FILM");
            System.out.println("+++++++++++++++++++++++");
            while (tmp != null) {
                System.out.println("ID : " + tmp.film.id+"\n Judul : "+tmp.film.judul+"\n Rating : "+tmp.film.rating);
                tmp = tmp.next;
        }
        
        System.out.println("\nJumlah Film Terdata : " + size);
        } else {
            System.out.println("Linked List Queue Masih Kosong");
        }
    }
    public void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List Kosong!");
        }else if (size == 1){
            removeLast();
        }else{
            System.out.println("Data Film "+head.film.judul+" Telah Dihapus");
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast()throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List Masih Kosong!");
        }else if (head.next == null){
            System.out.println("Data Film "+head.film.judul+" Telah Dihapus");
            head=null;
            size--;
            return;
        }
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        System.out.println("Data Film "+current.next.film.judul+" Telah Dihapus");
        current.next = null;
        size--;
    }
    public void remove(int index) throws Exception{
        if(isEmpty() || index >=size){
            throw new Exception("Index diluar Batas!");
        }else if ( index ==0){
            removeFirst();
        } else{
            Node current = head;
            int i = 0;
            while(i< index){
                current = current.next;
                i++;
            }
            if(current.next == null){
                System.out.println("Data Film "+current.film.judul+" Telah Dihapus");
                current.prev.next = null;
            }else if(current.prev == null){
                System.out.println("Data Film "+current.film.judul+" Telah Dihapus");
                current = current.next;
                head=current;
            }else{
                System.out.println("Data Film "+current.film.judul+" Telah Dihapus");
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    public void search(int cari){
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.film.id != cari) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            System.out.println("\ndata tidak ditemukan");
        } else {
            System.out.println("\nFilm dengan ID- " + cari + " ditemukan pada posisi node ke-" + (index + 1));
            System.out.println("\nIDENTITAS FILM: ");
            System.out.println(" ID film : " + tmp.film.id + "\n Judul film : " + tmp.film.judul+ "\n Rating : " + tmp.film.rating);
        }

    }
    public void sort() {
        Node current = head;
        int idx = -1;
        arrayFilm = new Film[size];
        while (current != null) {
            idx++;
            arrayFilm[idx] = current.film;
            current = current.next;
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 1; j < size - i; j++) {
                if (arrayFilm[j].rating > arrayFilm[j - 1].rating) {
                    Film tmp = arrayFilm[j];
                    arrayFilm[j] = arrayFilm[j - 1];
                    arrayFilm[j - 1] = tmp;
                }
            }
        }

        System.out.println("Pengurutan film berdasarkan rating :\n");
        for (int i = 0; i < size; i++) {
            System.out.println(arrayFilm[i].id + " " + arrayFilm[i].judul + " " + arrayFilm[i].rating);
        }
    }

}