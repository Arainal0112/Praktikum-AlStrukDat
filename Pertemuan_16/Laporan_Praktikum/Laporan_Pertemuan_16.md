# Laporan Pertemuan 16 - COLLECTION
- Nama  : Arainal Aldiansyah
- Nim   : 2141720042
- Kelas : TI-1G

## Jawaban Pertanyaan
### 16.2.3. Pertanyaan Percobaan 1
1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah Arraylist?
   - Karena tidak diberikan tipe data yang spesifik
2. Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe tertentu!
```java
        List<Integer> l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add("Cireng");
        System.out.printf("Elemen 0 : %d total elemen : %d elemen terakhir : %s\n", l.get(0), l.size(), l.get(l.size()-1));

```
3. Ubah kode pada baris kode 38 menjadi seperti ini
```java 
    LinkedList <String> names = new LinkedList<>();
```
4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya

5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!
   - Hasil yang diberikan sama dimana akan menambah satu data, tetapi ada perbedaan dalam kodenya dimana Linkedlist bisa menambahkan data dengan menggunakan push sedangkan List menggunakan add, dan untuk output pada linkedlist menggunakan getFirst tidak seperti list yang menggunakan get dengan index.

### 16.3.3. Pertanyaan Percobaan 2
1. Apakah perbedaan fungsi push() dan add() pada objek fruits?
   - 
2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian?
   - Output Melon dan durian akan hilang karena sebelumnya terdapat fungsi pop yang menghapus seluruh data sehingga data kosong
3. Jelaskan fungsi dari baris 46-49?
   - Berfungsi untuk melakukan perulangan dengan foreach untuk menampilkan data dengan pengecekan hasNext() untuk mengecek apakah masih ada elemen di selanjutnya
4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi? Mengapa bisa demikian?
   - Program akan terjadi error karena beberapa fungsi seperti push dan pop tidak termasuk dalam interface list
5. Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”!
```java
    fruits.set(4, "Strawberry");
```
6. Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting!
--
### 16.4.3. Pertanyaan Percobaan 3
1. Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa? 
Dan kelebihannya apa?
2. Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection!
3. Tambahkan fungsi sorting baik secara ascending ataupun descending pada class tersebut!

### Tugas 
