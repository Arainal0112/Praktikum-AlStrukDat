public class GraphArray{
    int vertices;
    int[][] array2d;

    GraphArray(int v){
        vertices = v;
        array2d = new int [vertices+1][vertices+1]; //+1 karena array dimulai dari indeks 0
    }

    public void makeEdge(int to, int from, int edge){ // melabeli nilai
        try{
            array2d[to][from] = edge;
        }catch(ArrayIndexOutOfBoundsException index){
            System.out.println("Vertex Tidak Ada");
        }
    }

    public int getEdge(int to, int from){ // cek nilai pada garis
        try{
            return array2d[to][from];
        }catch(ArrayIndexOutOfBoundsException index){
            System.out.println("Vertex Tidak Ada");
        }
        return -1;
    }
}