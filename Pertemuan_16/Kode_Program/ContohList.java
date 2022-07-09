import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Stack;
public class ContohList{
    public static void main(String[]args){

        List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add("Cireng");
        System.out.printf("Elemen 0 : %d total elemen : %d elemen terakhir : %s\n", l.get(0), l.size(), l.get(l.size()-1));

        /* Pertanyaan nomor 2
        List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add("Cireng");
        System.out.printf("Elemen 0 : %d total elemen : %d elemen terakhir : %s\n", l.get(0), l.size(), l.get(l.size()-1));
        */
        l.add(4);
        //l.remove(0);
        //System.out.printf("Elemen pertama : %d total elemen : %d elemen terakhir : %s\n", l.get(0), l.size(), l.get(l.size()-1));
        ////List <String> names = new LinkedList<>();
        LinkedList <String> names = new LinkedList<>();
        names.add("Nouren");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");
        System.out.printf("Elemen 0 : %s total elemen : %s elemen terakhir : %s\n", names.get(0), names.size(), names.get(names.size()-1));

        names.set(0, "My Kid"); //spesifik diletakkan diindex ke berapa (index, data) --> set mengganti data
        System.out.printf("Elemen 0 : %s total elemen : %s elemen terakhir : %s\n", names.get(0), names.size(), names.get(names.size()-1));
        System.out.println("Names\t: "+ names.toString()); //toString --> 
        
        System.out.println("");
        System.out.println("Percobaan 3 & 4 :");
        names.push("Mei-mei");
        System.out.printf("Elemen 0 : %s total elemen : %s elemen terakhir : %s\n", names.getFirst(), names.size(), names.getLast());
        System.out.println("Names\t: "+ names.toString());



        System.out.println("TAMBAHAN FRUIT :");
        Stack<Integer> fruits = new Stack<>();
        fruits.push(10);
        fruits.add(20);
        fruits.add(30);
        fruits.add(50);
        fruits.push(90);

         for(int fruit : fruits){
            System.out.printf("%s ", fruit);
        }
        System.out.println("\n"+ fruits.toString());

        while (!fruits.empty()){
            System.out.printf("%s ", fruits.pop()); //tampil dari belakang/top of stack
        }
    }
}