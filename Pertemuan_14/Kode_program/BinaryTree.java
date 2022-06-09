public class BinaryTree{
    Node root;

    BinaryTree(){
        root = null; // pertama dibuat tree masih kosong
    }
    boolean isEmpty(){
        return root==null;
    }

    public void add (int data){
        if(isEmpty()){
            root = new Node(data); 
        }else{
            Node current = root;
            while(true){
                if(data<current.data){ //jika data kurang dari current/root, di calonkan jadi anak kiri
                    if(current.left!=null){  // apakah current punya anak kiri lagi?
                        current = current.left; // jika punya lanjut ke anak kiri baru 
                    }else{
                        current.left =new Node(data); // jika tidak membuat anak kiri baru
                        break;
                    }
                }else if(data>current.data){
                    if(current.right!=null){
                        current = current.right;
                    }else{
                        current.right = new Node(data);
                        break;
                    }
                }else{ //jika data sudah ada tidak ditambahkan
                    break;
                }
            }
        }

    }
    public boolean find(int data){
        boolean hasil = false;
        Node current = root;
        while(current != null){
            if(current.data == data){
                hasil = true;
                break;
            }else if(data< current.data){
                current = current.left;
            } else if(data > current.data){
                current = current.right;
            }
        }
        return hasil;
    }

    public void traversePreOrder(Node node){
        if(node != null){
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }

    }
    public void traversePostOrder(Node node) {
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }

    }

    public void traverseInOrder(Node node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node getSuccessor(Node del){ //untuk mengetahui mana yang menjadi sossesor
        Node sc = del.right;    //Diright karena sub tree ada disebelah kanan// mencari nilai terkecil dikanan
        Node scP = del;         
        while(sc.left != null){
            scP = sc;
            sc = sc.left;
        }
        if(sc != del.right){ 
            scP.left = sc.right;
            sc.right = del.right; // bagian node pengganti di ganti
        }
        return sc;
    }
    public void delete(int data){
        if(isEmpty()){
            System.out.print("Tree is Empty!");
            return;
        }
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while(current != null){
            if(current.data == data){
                break;
            }else if(data < current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if(data > current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        //Penghapusan
        if(current == null){
            System.out.println("Couldn't find data!");
            return;
        }else{
            //jika tidak memiliki anak cabang/anak
            if(current.left == null & current.right == null){
                if(current == root){
                    root = null;
                }else{
                    parent.right = null;
                }
            }else if(current.left == null){ // jika punya anak kiri
                if(current == root){
                    root = current.right;
                }else{
                    if(isLeftChild){
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            }else if(current.right == null){ //anak kanan 
                if(current == root){
                    root = current.left;
                }else{
                    if(isLeftChild){
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{ // jika ada 2 anak
                Node successor = getSuccessor(current);
                if(current == root){
                    root = successor;
                }else{
                    if(isLeftChild){
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }  
        }
    }
    
    // TUGAS 1
    public void addRekursif(int data){
        root = insert(root, data);
    }
    
    Node insert (Node root, int data){
        if(root==null){
            root = new Node(data);
            return root;
        }
        if(data<root.data) {
            root.left = insert(root.left, data);
        } else if(data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }
    
    //TUGAS 2
    public int findMin(Node node){
        Node current = root;
        while (current.left != null){
            current =current.left;
        }
        return current.data;
    }

    public int findMax(Node node) {
        Node current = root;
        while(current.right != null){
            current = current.right;
        }
        return current.data;
    }

    //TUGAS 3 dan 4
    int jumlah;
    public void printLeaf(Node node) {
         if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
            jumlah++;
        }
        if (node.left != null) {
            printLeaf(node.left);
        }
        if (node.right != null) {
            printLeaf(node.right);
        }
        
    }
}