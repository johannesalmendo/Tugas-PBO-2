public class AplikasiPendataan {
    private String isbn, judulBuku, pengarang;
    private int tahunTerbit, harga;
    private  float rating;

    public AplikasiPendataan(String isbn, String judulBuku, String pengarang, int tahunTerbit, int harga, float rating) {
        this.isbn = isbn;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.rating = rating;
    }


    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getJudulBuku() {
        return judulBuku;
    }
    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }
    public String getPengarang() {
        return pengarang;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public int getTahunTerbit() {
        return tahunTerbit;
    }
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "AplikasiPendataan{" +
                "isbn='" + isbn + '\'' +
                ", judulBuku='" + judulBuku + '\'' +
                ", pengarang='" + pengarang + '\'' +
                ", tahunTerbit=" + tahunTerbit +
                ", harga=" + harga +
                ", rating=" + rating +
                '}';
    }
}
