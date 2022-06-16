import java.util.Scanner;
public class Main{
    public static void main(String[]args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("Pilihan Type");
        System.out.println("1. Directed \n2. Undirected");
        System.out.print("Pilihan : ");
        int p = sc.nextInt();
        System.out.println("------------------------------");
        System.out.print("Masukan Jumlah Vertex : ");
        int v = sc.nextInt();
        Graph graph = new Graph(v, p);
        System.out.print("Masukan Jumlah Edge : ");
        int e = sc.nextInt();
        
        System.out.println("------------------------------");
        int i = 0;
        do{ 
            System.out.println("Edge Ke - "+ (i+1));
            System.out.print("Source\t\t: ");
            String src = sc.next();
            sc.nextLine();
            System.out.print("Destination\t: ");
            String des = sc.next();
            sc.nextLine();

            graph.addEdge(src, des);
            i++;
        }while(i<e);
        System.out.println("");
        graph.printGraph();  
    
    }
}