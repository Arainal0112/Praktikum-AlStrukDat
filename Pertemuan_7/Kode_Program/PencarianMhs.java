public class PencarianMhs{
    Mahasiswa listmhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
        if (idx < listmhs.length){
            listmhs[idx] =m;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh !!");
        }
    }
    void tampil(){
        for(Mahasiswa m : listmhs){
            m.tampil();
            System.out.println("-----------------------");
        }
    }
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for(int j=0; j<listmhs.length; j++){
            if(listmhs[j].nim == cari){
                posisi =j;
                break;
            }
        }
        return posisi;
    }
    //Latihan 1
    void bubbleSort(){
        for(int i=0; i<listmhs.length-1; i++){
            for(int j=0; j<listmhs.length-i-1; j++){
                if(listmhs[j].nim > listmhs[j+1].nim){
                    Mahasiswa mhs =listmhs[j];
                    listmhs[j] = listmhs[j+1];
                    listmhs[j+1] = mhs;
                }
            }
        }
    }

    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left +right)/2;
            if (cari == listmhs[mid].nim){
                return(mid);
            } else if (listmhs[mid].nim > cari){
                return FindBinarySearch(cari, left, mid-1);
            } else{
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
    //Latihan 2
    public int FindLatihan2(String cari){
        int posisi = -1;
        for(int j=0; j<listmhs.length; j++){
            if(listmhs[j].nama.equalsIgnoreCase(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    public void Tampilposisi(int x, int pos){
        if (pos!=-1){
            System.out.println("Data : "+ x + " ditemukan pada indeks ke- "+pos);
        }else {
            System.out.println("Data : "+ x + " tidak ditemukan");
        }
    }
    public void TampilData(int x, int pos){
        if(pos!=-1){
            System.out.println("Nim\t= " + x);
            System.out.println("Nama\t= " + listmhs[pos].nama);
            System.out.println("Umur\t= " + listmhs[pos].umur);
            System.out.println("IPK\t= " + listmhs[pos].ipk);
        }else{
            System.out.println("Data "+x+" Tidak ditemukan");
        }
    }
    
    //Latihan 2 
    public void Tampilposisi(String x, int pos){
        if (pos!=-1){
            System.out.println("Data : "+ x + " ditemukan pada indeks ke- "+pos);
        }else {
            System.out.println("Data : "+ x + " tidak ditemukan");
        }
    }
    public void TampilData(String x, int pos){
        if(pos!=-1){
            System.out.println("Nim\t= " + listmhs[pos].nim);
            System.out.println("Nama\t= " + x);
            System.out.println("Umur\t= " + listmhs[pos].umur);
            System.out.println("IPK\t= " + listmhs[pos].ipk);
        }else{
            System.out.println("Data "+x+" Tidak ditemukan");
        }
    }
}