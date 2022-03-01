# Laporan Pertemuan 2
- Nama  : Arainal Aldiansyah
- Nim   : 2141720042
- Kelas : TI-1G

## Jawaban Pertanyaan
### 2.2.3 Pertanyaan
1. Sebutkan 2 karakteristik class/objek!
    - class : berupa rancangan, dan bersifat umum
    - objek : bentuk nyata dari sebuah konsep, dan bersifat lebih spesifik
2.	Kata kunci apakah yang digunakan untuk mendeklarasikan class?
	- class NamaClass{}
3.	Perhatikan class Barang yang ada di Praktikum di atas, ada berapa atribut yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja deklarasi atribut dilakukan? 
    - Ada 4 atribut dan dideklarasikan dibaris 13 dan 14
4.	Ada berapa method yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja deklarasi method dilakukan?
    - Ada 4 method di baris 16, 23, 27, 31
5.	Perhatikan method kurangiStok() yang ada di class Barang, modifikasi isi method tersebut sehingga proses pengurangan hanya dilakukan jika stok masih ada (masih lebih besar dari 0) 
<hr>


    void kurangiStok(int n){
        if(n>0){
            stok=stok-n;
        }
    }

6.	Menurut Anda, mengapa method tambahStok() dibuat dengan memiliki 1 parameter berupa bilangan int? 
    - Diperlukan untuk mengisi nilai n untuk ditambah pada nilai stok sebelumnya
7.	Menurut Anda, mengapa method hitungHargaTotal() memiliki tipe data int?
    - Karena method mengembalikan/return hasil oprasi didalamnya untuk digunakan lagi
8.	Menurut Anda, mengapa method tambahStok() memiliki tipe data void?
    - Karena operasi didalamnya hanya untuk merubah stok dan tidak ada yang dikembalikan

### 2.3.3 Pertanyaan 
1. Pada class BarangMain, pada baris berapakah proses instansiasi dilakukan? Dan apa nama objek yang dihasilkan? 
	- Baris 15 dan menghasilkan nama objek b1
2. Bagaimana cara mengakses atribut dan method dari suatu objek?
* Atribut :
    - namaObjek.namaAtribut = nilai;
* Method :
    - namaObjek.namaMethod();

### 2.4.3 Pertanyaan 
1. Perhatikan class Barang yang ada di Praktikum 2.4.1, pada baris berapakah deklarasi konstruktor berparameter dilakukan? 
	- Baris 18
2. Perhatikan class BarangMain di Praktikum 2.4.1, apa sebenarnya yang dilakukan pada baris program dibawah ini? 
    - pada baris ini digunakan untuk mengisi/ menginisialisasi objek dengan atribut dari paramter untuk dimasukkan pada class Barang di baris 18
3. Coba buat objek dengan nama b3 dengan menggunakan konstruktor berparameter dari class Barang

    Barang b3 =new Barang("NYK", "Keyboard", 2, 200000);





