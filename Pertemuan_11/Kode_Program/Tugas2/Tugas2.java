public class Tugas2{
    public static void main(String[]args){
        SLL sll = new SLL();
        sll.print();
        sll.addFirst("A");
        sll.print();
        sll.addLast("E");
        sll.print();
        sll.insertAfter("A", "C");
        sll.print();
        sll.insertAt(1, "B");
        sll.print();
        sll.insertBefore("E", "D");
        sll.print();

        sll.cekHead();

    }
}

