public class Graph {
    int vertex, type;
    DoubleLinkedList list[];
    Node right;

    int i=0;
    Graph(int vertex, int type){
        this.vertex = vertex;
        this.type =type; //Tugas 2
        list = new DoubleLinkedList[vertex]; //isi/kapasitas dari list[] akan mengikuti vertex.
        
        for(int i=0; i< vertex; i++){
            list[i] = new DoubleLinkedList(); // array of object
        }
    }

    void addEdge(String source, String destination){ // untuk menambahkan garis, harus tau tujuannya
        if(graphType()){
            list[i].data(source);
            list[i].addFirst(destination);
            i++;
        }
        else{
            //tambah edge
            list[i].data(source);
            list[i].addFirst(destination);
            // tambah kebalikan edge
            list[i].data(destination);
            list[i].addFirst(source);
            i++;
        }
    }

    void degree(String source) throws Exception{
        int a;
        for(a=0; a<10; a++){
            if(list[i].data==source){
                break;
            }
        }
        if(graphType()){
            //directed
            //indegree
            int k, totalIn = 0, totalOut =0;
            for(int l =0; l<vertex; l++){
                for(int j=0; j<list[l].size(); j++){
                    if(list[l].get(j)==source){
                        ++totalIn;
                    }
                }
            }
            //outdegree
            for(k=0; k<list[a].size(); k++){
                list[a].get(k); 
            }
            totalOut = k;
            System.out.println("Indegree dari vertex "+ source + " = " +totalIn);
            System.out.println("Outdegree dari vertex "+ source + " = " +totalOut);
            System.out.println("Degree vertex "+ source + " = " +(totalIn+totalOut));
        }else{
            //undirected
            System.out.println("degree vertex "+ source+" : "+ list[a].size());
        }  
    }

    void removeEdge(String source, String destination) throws Exception{
        int a;
        for(a=0; a<10;a++){
            if(list[i].data == source){
                break;
            }
        }
        int b;
        for(b=0;b<10;b++){
            if(list[i].data == source){
                break;
            }
        }

        if(graphType()){
            for(int i =0; i< list[a].size(); i++){
                if(destination == list[a].get(i)){
                    list[a].remove(i);
                }
            }
        }else{
            for(int i =0; i< list[a].size(); i++){
                if(destination == list[a].get(i)){
                    list[a].remove(i);
                }
            }
            for(int i =0; i< list[b].size(); i++){
                if(source == list[b].get(i)){
                    list[b].remove(i);
                }
            }
        }

    }


    void removeAllEdge(){
        for(int i=0; i<vertex; i++){
            list[i].clear();
        }
        System.out.println("Graph Sudah Kosong");
    }

    void printGraph()throws Exception{
        for(i=0; i<vertex; i++){
            if(list[i].size()>0){
                System.out.print(list[i].data +" Terhubung dengan : ");
                for(int j=0; j<list[i].size(); j++){
                    System.out.print(list[i].get(j) +" ");
                }
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }
    public boolean graphType(){
        return type ==1;
    }

}