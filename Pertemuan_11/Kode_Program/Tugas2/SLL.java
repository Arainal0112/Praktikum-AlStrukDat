public class SLL{
    Node head;
    Node tail;
    public boolean isEmpty(){
        return head == null;
    }
    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.print("Isi Linked List : \t");
            while (tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linkedd list Kosong!");
        }
    }
    public void cekHead(){
        Node tmp =head;
        System.out.println("Head saat ini adalah : "+tmp.data);
    }
    public void addFirst(String input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){ // jika linked kosong
            head = ndInput; // head dan tail sama dengan input
            tail = ndInput;
        }else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    public void addLast(String input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail= ndInput;
        } else {
            tail.next =ndInput;
            tail=ndInput;
        }
    }
    public void insertAfter(String key, String input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        do{
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null){
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        }while (temp != null);
    }
    public void insertBefore(String key, String input){
        int index = indexOf(key);
        insertAt(index, input);
    }
    public void insertAt(int index, String input){
        if(index<0){
            System.out.println("Indeks salah");
        } else if(index==0) {
            addFirst(input);
        } else{
            Node temp = head;
            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if(temp.next.next==null){
                tail=temp.next;
            }
        }
    }
    public int indexOf(String key){
        Node tmp= head;
        int index = 0;
        while(tmp != null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }
        if(tmp == null){
            return -1;
        }else{
            return index;
        }
    }

}