public class Node{
    int data;
    Node left, right;

    Node(){ //Konstruktor Default
    }
    Node(int data){ 
        this.left = null;
        this.data = data;
        this.right = null;
    }
}