package ru.netology.poster;

public class Film {
    private int id;
    private String filmName;
    private int priceTicket;

    public Film() {
    }

    public Film(int id, String filmName, int priceTicket) {
        this.id = id;
        this.filmName = filmName;
        this.priceTicket = priceTicket;
    }

    public int getId() {
        return id;
    }

    public String getFilmName() {
        return filmName;
    }

    public int getPriceTicket() {
        return priceTicket;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public void setPriceTicket(int priceTicket) {
        this.priceTicket = priceTicket;
    }
}
