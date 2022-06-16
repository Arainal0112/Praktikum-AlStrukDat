public class Graph{
    int vertex, type;
    DoubleLinkedList list[];
    Node right;

    Graph(int vertex, int type){
        this.vertex = vertex;
        this.type =type; //Tugas 2
        list = new DoubleLinkedList[vertex]; //isi/kapasitas dari list[] akan mengikuti vertex.
        
        for(int i=0; i< vertex; i++){
            list[i] = new DoubleLinkedList(); // array of object
        }
    }

    void addEdge(int source, int destination){ // untuk menambahkan garis, harus tau tujuannya
        //contoh : 0,1,2,3,4 --> s=0, d=4
        //dari
        /*list[source].addFirst(destination); //menyambungkan 0-4
        // didalam vertex 0 berisi data yaitu vertex 4

        //Ke
        list[destination].addFirst(source);//menyambungkan 4-0
        // didalam vertex 4 berisi data yaitu vertex 0
        */
        //Tugas 2
        if(graphType()){
            list[source].addFirst(destination);
        }
        else{
            list[destination].addFirst(source);
        }
    }

    void degree(int source) throws Exception{
        //undirected
        /*System.out.println("degree vertex "+ source+" : "+ list[source].size());
        //directed
        //indegree
        int k, totalIn = 0, totalOut =0;
        for(int i =0; i<vertex; i++){ //untuk melihat semua vertex dalam graph
            for(int j=0; j<list[i].size(); j++){ //untuk setiap degree dalam vertex
                if(list[i].get(j)==source){ // untuk size yang ada dalam vertex ke i == source
                    ++totalIn;
                }
            }
        }
        //outdegree
        for(k=0; k<list[source].size(); k++){
            list[source].get(k); 
        }
        totalOut = k;
        System.out.println("Indegree dari vertex"+ source + " = " +totalIn);
        System.out.println("Outdegree dari vertex"+ source + " = " +totalOut);
        System.out.println("Degree vertex"+ source + " = " +(totalIn+totalOut));
        */
        //Tugas 2
        if(graphType()){
            //directed
            //indegree
            int k, totalIn = 0, totalOut =0;
            for(int i =0; i<vertex; i++){ //untuk melihat semua vertex dalam graph
                for(int j=0; j<list[i].size(); j++){ //untuk setiap degree dalam vertex
                    if(list[i].get(j)==source){ // untuk size yang ada dalam vertex ke i == source
                        ++totalIn;
                    }
                }
            }
            //outdegree
            for(k=0; k<list[source].size(); k++){
                list[source].get(k); 
            }
            totalOut = k;
            System.out.println("Indegree dari vertex "+ source + " = " +totalIn);
            System.out.println("Outdegree dari vertex "+ source + " = " +totalOut);
            System.out.println("Degree vertex "+ source + " = " +(totalIn+totalOut));
        }else{
            //undirected
            System.out.println("degree vertex "+ source+" : "+ list[source].size());
        }  
    }

    void removeEdge(int source, int destination) throws Exception{
        /*for(int i =0; i< vertex; i++){
            if(i==destination){
                list[source].remove(destination);
            }
        }*/

        //Tugas 2
        /*if(graphType()){
            for(int i =0; i< vertex; i++){
                if(i==destination){
                    list[source].remove(destination);
                }
            }
        }else{
            for(int i =0; i< vertex; i++){
                if(i==destination){
                    list[source].remove(destination);
                    list[destination].remove(source);
                }
            }
        }*/

        //Tugas 3
        if(graphType()){
            for(int i =0; i< list[source].size(); i++){
                if(destination == list[source].get(i)){
                    list[source].remove(i);
                }
            }
        }else{
            for(int i =0; i< list[source].size(); i++){
                if(destination == list[source].get(i)){
                    list[source].remove(i);
                }
            }
            for(int i =0; i< list[destination].size(); i++){
                if(source == list[destination].get(i)){
                    list[destination].remove(i);
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
        for(int i=0; i<vertex; i++){
            if(list[i].size()>0){
                System.out.print("Vertex "+i+" Terhubung ke ");
                for(int j=0; j<list[i].size(); j++){
                    System.out.print(list[i].get(j) +" ");
                }
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }

    //Tugas Praktikum NO 2
    public boolean graphType(){
        return type ==1;
    }

}