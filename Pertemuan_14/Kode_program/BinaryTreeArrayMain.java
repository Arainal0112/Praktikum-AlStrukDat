public class BinaryTreeArrayMain{
    public static void main(String[]args){
        BinaryTreeArray bta = new BinaryTreeArray();

        int[] data ={6,4,8,3,5,7,9,0,0,0};
        int idxLast= 6;
        bta.populateData(data, idxLast);
        System.out.print("Traverse In Order\t: ");
        bta.traverseInOrder(0);
        System.out.println("");

        // TUGAS 5
        bta.add(2);
        System.out.print("Traverse PreOrder\t: ");
        bta.traversePreOrder(0);
        System.out.println("");
        System.out.print("Traverse PostOrder\t: ");
        bta.traversePostOrder(0);
    }
}