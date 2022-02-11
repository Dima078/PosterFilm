package ru.netology.poster;

public class PosterFilms {
    private Film[] items = new Film[0];
    private int limitFilm = 10;

    public PosterFilms() {
    }

    public PosterFilms(int limitFilm) {
        this.limitFilm = limitFilm;
    }

    public void save(Film item) {
        int length = items.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Film[] findAll() {
        return items;
    }

    public Film[] showFilm() {
        int resultLength = items.length;
        if (resultLength > limitFilm) {
            resultLength = limitFilm;
        } else {
            resultLength = items.length;
        }
        Film[] items = findAll();
        Film[] result = new Film[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
