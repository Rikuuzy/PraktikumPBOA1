## Lembar Laporan Praktikum
Nama : Hadrian Shandhy Yudha

NIM : 24060124140207

Lab : PBO-A1

## Pertanyaan Asersi2.java
- PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
- JAWABAN : Kesalahan dimana asersi dirancang untuk verifikasi kondisi yang secara logika pasti benar jika kode ditulis benar, Bukan sebagai mekanisme input.

  Asersi secara default mati, jadi saat program `Asersi2.java` tanpa `-enableassertions` baris `assert` dilewati/skip, alhasil program tetap berjalan tanpa peringatan apapun. Kemudian validasi input seharusnya menggunakan eksepsi.

  Asersi digunakan untuk kondisi mustahil salah jika logika benar, dan gunakan eksepsi sebagai kondisi yang mungkin terjadi di luar kendali.
  
## Pertanyaan AngkaSial.java
- PERTANYAAN : Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
- JAWABAN :  Tidak akan dieksekusi jika eksepsi terjadi.

> Baris 12 System.out.println(angka + " bukan angka sial");

Baris 12 di dalam method cobaAngka, ketika method dipannggil kemudian kondisi if bernilai true. Throw new AngkaSialException() di baris 10 langsung dieksekusi, baris 12 dilewati dan tidak pernah dieksekusi

- PERTANYAAN : Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
- JAWABAN : Ya dieksekusi.

> Baris 21 } catch (AngkaSialException ase) {

Baris 21 adalah deklarasi blok catch (menangkap) tipe AngkaSialException, karena sesuai dengan eksepsi yang dilempar. Oleh karena itu, blok catch dimasuki dan isi baris 23 dan 24 dieksekusi, mencetak pesan error.
