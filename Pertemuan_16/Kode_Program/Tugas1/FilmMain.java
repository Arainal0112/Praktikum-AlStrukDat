import java.util.Stack;
import java.util.Scanner;
public class FilmMain{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);
        Stack <Film> flm = new Stack<Film>();
        int pil;
        do{
            System.out.println("===============================");
            System.out.println("Data Film Layar Sepanjang Masa");
            System.out.println("===============================");
            System.out.println("Pilihan Menu : ");
            System.out.println("1. Input Judul Film\n2. Hapus Data Film Teratas\n3. Cek Judul Film Teratas\n4. Info Semua Judul Film\n5. Keluar");
            System.out.println("===============================");
            System.out.print("Pilih : ");
            pil = sc.nextInt();
            switch(pil){
                case 1 :
                    System.out.print("ID Film : ");
                    String idFilm = ss.nextLine();
                    System.out.print("Judul Film : ");
                    String judul = ss.nextLine();
                    System.out.print("Tahun Tayang : ");
                    String tahun = ss.nextLine();
                    System.out.print("Director : ");
                    String director = ss.nextLine();
                    Film film = new Film(idFilm, judul, tahun, director);
                    flm.push(film);
                    break;
                case 2:
                    System.out.println(flm.pop());
                    break;
                case 3:
                    System.out.println(flm.peek());
                    break;
                case 4 :
                    for(int i=0; i<flm.size(); i++){
                        System.out.println(flm.get(i));
                    }
                    break;
            }
        }while(pil <5);


    }
}

class Film{
    String idFilm;
    String judul;
    String tahun;
    String director;

    Film(){
    }
    Film(String idFilm,String judul, String tahun, String director){
        this.idFilm=idFilm;
        this.judul=judul;
        this.tahun=tahun;
        this.director=director;
    }
    
    @Override
    public String toString(){
        return "Film{ " + "ID Film = " + idFilm + ", Judul Film = " +judul+", Tahun Tayang = "+tahun+", Director = " +director+" }";
    }
}
