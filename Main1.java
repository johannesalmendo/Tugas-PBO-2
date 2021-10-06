import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    private ArrayList<AplikasiPendataan> aplikasi = new ArrayList<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void tambahData()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Masukan ISBN : ");
        String isbn = br.readLine();
        System.out.println("Masukan Judul Buku : ");
        String judulBuku = br.readLine();
        System.out.println("Masukan Pengarang : ");
        String pengarang = br.readLine();
        System.out.println("Masukan Tahun Terbit : ");
        int tahunTerbit = Integer.parseInt(br.readLine());
        System.out.println("Masukan Harga : ");
        int harga = Integer.parseInt(br.readLine());
        System.out.println("Masukan Rating : ");
        float rating = Float.parseFloat(br.readLine());
        AplikasiPendataan aplikasiPendataan = new AplikasiPendataan(isbn, judulBuku, pengarang, tahunTerbit, harga, rating);
        aplikasi.add(aplikasiPendataan);

        if (byIsbn(isbn) != null) {
            System.out.println("ISBN buku sudah ada");
        } else {
            AplikasiPendataan bukuu = new AplikasiPendataan(isbn, judulBuku, pengarang, tahunTerbit, harga, rating);
            aplikasi.add(bukuu);
            System.out.println("TERSIMPAN");
        }
    }


    private void ubahData(AplikasiPendataan books) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukan Judul Baru : ");
        String jBaru = br.readLine();
        books.setJudulBuku(jBaru);
        System.out.println("Masukan Pengarang Baru : ");
        String pBbaru = br.readLine();
        books.setPengarang(pBbaru);
        System.out.println("Masukan Tahun Terbit : ");
        int tbaru = Integer.parseInt(br.readLine());
        books.setTahunTerbit(tbaru);
        System.out.println("Masukan Harga : ");
        int hbaru = Integer.parseInt(br.readLine());
        books.setHarga(hbaru);
        System.out.println("Masukan Rating : ");
        float fbaru = Float.parseFloat(br.readLine());
        books.setRating(fbaru);

    }

    void ubah() throws IOException{
        System.out.println("Masukan ISBN");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String isbn = br.readLine();
        AplikasiPendataan buks =byIsbn(isbn);
        if(buks != null ){
            System.out.println("Ubah data?");
            int pilih;
            System.out.println(" 1.Ya \n 2.Tidak ");
            pilih = sc.nextInt();
            switch (pilih){
                case 1 : ubahData(buks);break;
                case 2 : break;
            }
        }
    }

    void hapus()throws IOException{
        System.out.println("Masukan ISBN");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String isbn = br.readLine();
        AplikasiPendataan buks = byIsbn(isbn);
        if (buks != null){
            System.out.println("Hapus data?");
            int pilih;
            System.out.println(" 1.Ya \n 2.Tidak ");
            pilih = sc.nextInt();
            switch (pilih){
                case 1 : aplikasi.remove(buks);
                break;
                case 2 : System.out.println("Kembali ke halaman utama");
                break;
            }
        }

    }

    private void satuData() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukan ISBN");
        String isbn = br.readLine();
        AplikasiPendataan buks2 = byIsbn(isbn);

        if (buks2 != null){
            System.out.println("ISBN: " +buks2.getIsbn());
            System.out.println("Judul: " +buks2.getJudulBuku());
            System.out.println("Pengarang: " +buks2.getPengarang());
            System.out.println("Pengarang: " +buks2.getTahunTerbit());
            System.out.println("Harga: " +buks2.getHarga());
            System.out.println("Rating: " +buks2.getRating());
            System.out.println("");
        }else{
            System.out.println("TIDAK ADA BUKU DENGAN ISBN " + isbn);
        }

    }

    private void tampilData(){
        for (AplikasiPendataan tampil : aplikasi){
            System.out.println(tampil.getJudulBuku());
        }
        System.out.println();
    }

//run
    public static void main(String[] args)throws IOException {
        Main1 program = new Main1();
        program.run();
    }

    private void run() throws IOException{
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println(" 1. Tambah data \n 2. Ubah data \n 3. Tampilkan semua buku \n 4. Cari buku berdasarkan ISBN \n" +
                    " 5. Menghapus data");

            pilih = sc.nextInt();
            switch (pilih){
                case 1 : tambahData();
                break;
                case 2 : ubah();
                break;
                case 3 : if(aplikasi.isEmpty()){
                    System.out.println("Daftar buku kosong");
                }else{
                    tampilData();
                }
                break;
                case 4 : satuData();
                break;
                case 5 : hapus();
                break;
            }
        }while (pilih != 6);
    }


    AplikasiPendataan byIsbn(String isbn) {
        AplikasiPendataan ada = null;
        for (AplikasiPendataan books : aplikasi) {
            if (isbn.equals(books.getIsbn())) {
                ada = books;
            }
        }
        return ada;

    }


}
