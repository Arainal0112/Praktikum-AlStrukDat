import java.util.Scanner;
public class MainArray{
    public static void main(String[]args) throws Exception{
        int v, e, count = 1, to = 0, from = 0;
        Scanner sc = new Scanner(System.in);
        GraphArray graph;
        try{
            System.out.print("Masukkan Jumlah Vertices : ");
            v= sc.nextInt();
            System.out.print("Masukkan jumlah Edge : ");
            e = sc.nextInt();

            graph = new GraphArray(v);

            System.out.println("Masukkan edge : \n<to> <from>");
            while(count <=e){
                to = sc.nextInt();
                from = sc.nextInt();

                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Arryay 2D sebagai Representasi graph SBB : ");
            System.out.print("  ");
            for(int i = 1; i<= v; i++){
                System.out.print(i+" ");
            }
            System.out.println();

            for(int i=1; i<=v; i++){
                System.out.print(i+ " ");
                for(int j =1; j<= v; j++){
                    System.out.print(graph.getEdge(i, j)+ " ");
                }
                System.out.println();
            }
        }catch (Exception E){
            System.out.println("Error. silahkan Cek Kembali \n "+E.getMessage());
        }
        sc.close();


        
    }
}