package Praktikum.Pertemuan10;

public class Film {
    int id;
    String judul;
    double rating;
    Film next,prev;

    public Film(int id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
    public String toString() {
        return "IDENTITAS:\n  ID Film: "+id+"\n  Judul: "+judul+"\n  IMDB Rating: "+rating;
    }
}
