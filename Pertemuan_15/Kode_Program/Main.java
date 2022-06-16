import java.util.Scanner;
public class Main{
    public static void main(String[]args) throws Exception{
        Scanner sc = new Scanner(System.in);
        /*Praktikum
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 0);
        graph.printGraph();
        graph.degree(2);
        
        graph.removeEdge(1, 2);
        graph.printGraph();
        */

        System.out.println("Pilihan Type");
        System.out.println("1. Directed \n2. Undirected");
        System.out.print("Pilihan : ");
        int p = sc.nextInt();
        System.out.println("------------------------------");
        System.out.print("Masukan Jumlah Vertex : ");
        int v = sc.nextInt();
        System.out.print("Masukan Jumlah Edge : ");
        int e = sc.nextInt();
        Graph graph = new Graph(v, p);
        System.out.println("------------------------------");
        int i = 0;
        do{
            System.out.println("Edge Ke - "+ (i+1));
            System.out.print("Source\t\t: ");
            int src = sc.nextInt();
            System.out.print("Destination\t: ");
            int des = sc.nextInt();

            graph.addEdge(src, des);
            i++;
        }while(i<e);
        System.out.println("");
        graph.printGraph();
        graph.degree(2);
        


        

    }
}