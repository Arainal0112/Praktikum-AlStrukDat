import java.util.Scanner;
public class StackMain{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        Stack stk = new Stack(5);

        char pilih;
        do{
            System.out.print("Jenis\t: ");
            String jenis = sc.nextLine();
            System.out.print("Warna\t: ");
            String warna = sc.nextLine();
            System.out.print("Merk\t: ");
            String merk = sc.nextLine();
            System.out.print("Ukuran\t: ");
            String ukuran = sc.nextLine();
            System.out.print("Harga\t: ");
            double harga = sc.nextDouble();

            Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
            System.out.print("Apakah Anda akan Menambahkan data baru ke stack (y/n)?");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            stk.push(p);

        }while (pilih == 'y');

        /*Pertanyaan 5
        System.out.println("PILIH OPERASI : ");
        System.out.println("\n1. Push\n2. pop\n3. Peek\n4. Print");
        int pilih_menu = sc.nextInt();
        switch(pilih_menu) {
            case 1:
                do{
                    System.out.print("Jenis\t: ");
                    String jenis = sc.nextLine();
                    System.out.print("Warna\t: ");
                    String warna = sc.nextLine();
                    System.out.print("Merk\t: ");
                    String merk = sc.nextLine();
                    System.out.print("Ukuran\t: ");
                    String ukuran = sc.nextLine();
                    System.out.print("Harga\t: ");
                    double harga = sc.nextDouble();

                    Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
                    System.out.print("Apakah Anda akan Menambahkan data baru ke stack (y/n)?");
                    pilih = sc.next().charAt(0);
                    sc.nextLine();
                    stk.push(p);

                }while (pilih == 'y');
            break;
            case 2:
            // code block
            break;
            default:
            // code block
        }*/
        stk.print();
        stk.pop();
        stk.peek();
        stk.print();

    }    
}

class Pakaian{
    String jenis, warna, merk, ukuran;
    double harga;

    Pakaian(String jenis, String warna, String merk, String ukuran, double harga){
        this.jenis = jenis;
        this.warna = warna;
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
    }

}

class Stack{
    int size, top;
    Pakaian data[];

    public Stack(int size){
        this.size = size;
        data = new Pakaian[size];
        top =-1;
    }

    public boolean IsEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean IsFull(){ 
        if(top == size-1){
            return true;
        }else{
            return false;
        }
    }

    public void push(Pakaian pkn){  //Menambah isi elemn Stack
        if(!IsFull()){
            top++;
            data[top] = pkn;
        }else{
            System.out.println("Isi Stack Penuh !");
        }
    }
    public void pop(){  //Mengeluarkan isi eleman stack
        if(!IsEmpty()){
            Pakaian x =data[top];
            top--;
            System.out.println("Data yang keluar : "+ x.jenis+" "+x.warna+" "+x.merk+" "+x.ukuran+" "+x.harga);
        } else{
            System.out.println("Stack Masih Kosong!");
        }
    }

    public void peek(){ //Memeriksa elemen teratas stack
        System.out.println("Elemen Teratas : "+data[top].jenis+" "+data[top].warna+" "+data[top].merk+" "+data[top].ukuran+" "+data[top].harga);
    }
    
    public void print(){    //Menampilkan seluruh elemen stack
        System.out.println("Isi Stack : ");
        for(int i=top; i >= 0; i--){
            System.out.println(data[i].jenis+" "+data[i].warna+" "+data[i].merk+" "+data[i].ukuran+" "+data[i].harga+" ");
        }
        System.out.println("");
    }
    
    public void clear(){    //Menghapus seluruh elemen stack
        if(!IsEmpty()){
            for(int i =top; i>=0; i--){
                top--;
            }
            System.out.println("Stack Sudah diKosongkan");
        }else{
            System.out.println("Stack Masih Kosong");
        }
    }
}