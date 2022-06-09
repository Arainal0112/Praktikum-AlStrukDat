public class BinaryTreeMain{
    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        System.out.print("Traverse PreOrder\t: ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("Traverse InOrder\t: ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("Traverse PostOrder\t: ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find "+ bt.find(5));
        bt.delete(8);
        System.out.print("Traverse PreOrder\t: ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        //Tugas1
        //bt.addRekursif(12);//

        //Tugas2
        System.out.println("Nilai Terkecil : " + bt.findMin(bt.root));
        System.out.println("Nilai Terbesar : " + bt.findMax(bt.root));

        //Tugas3 dan 4
        System.out.print("Data yang berada di Leaf : ");
        bt.printLeaf(bt.root);
        System.out.println();
        System.out.println("Jumlah Leaf : "+ bt.jumlah);
        
    }
}