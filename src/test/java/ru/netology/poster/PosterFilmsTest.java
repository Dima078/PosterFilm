package ru.netology.poster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterFilmsTest {

    @Test
    public void shouldSaveTest() {

        Film film1 = new Film(1,  "film1", 100);
        Film film2 = new Film(2, "film2", 200);
        Film film3 = new Film(3, "film3", 150);

        PosterFilms repo = new PosterFilms();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);

        Film[] expected = {film1, film2, film3};
        Film[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllFilmTest() {

        Film film1 = new Film(1,  "film1", 100);
        Film film2 = new Film(2, "film2", 200);
        Film film3 = new Film(3, "film3", 150);
        Film film4 = new Film(4,  "film4", 100);
        Film film5 = new Film(5, "film5", 200);
        Film film6 = new Film(6, "film6", 150);
        Film film7 = new Film(7,  "film7", 100);
        Film film8 = new Film(8, "film8", 200);
        Film film9 = new Film(9, "film9", 150);
        Film film10 = new Film(10,  "film10", 100);
        Film film11 = new Film(11, "film11", 200);
        Film film12 = new Film(12, "film12", 150);

        PosterFilms repo = new PosterFilms();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);
        repo.save(film12);

        Film[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11, film12};
        Film[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldDefaultLimitFilmTest() {

        Film film1 = new Film(1,  "film1", 100);
        Film film2 = new Film(2, "film2", 200);
        Film film3 = new Film(3, "film3", 150);
        Film film4 = new Film(4,  "film4", 100);
        Film film5 = new Film(5, "film5", 200);
        Film film6 = new Film(6, "film6", 150);
        Film film7 = new Film(7,  "film7", 100);
        Film film8 = new Film(8, "film8", 200);
        Film film9 = new Film(9, "film9", 150);
        Film film10 = new Film(10,  "film10", 100);
        Film film11 = new Film(11, "film11", 200);
        Film film12 = new Film(12, "film12", 150);

        PosterFilms repo = new PosterFilms();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);
        repo.save(film12);

        Film[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3};
        Film[] actual = repo.showFilm();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetOverLimitFilmTest() {

        Film film1 = new Film(1,  "film1", 100);
        Film film2 = new Film(2, "film2", 200);
        Film film3 = new Film(3, "film3", 150);
        Film film4 = new Film(4,  "film4", 100);
        Film film5 = new Film(5, "film5", 200);
        Film film6 = new Film(6, "film6", 150);
        Film film7 = new Film(7,  "film7", 100);
        Film film8 = new Film(8, "film8", 200);
        Film film9 = new Film(9, "film9", 150);
        Film film10 = new Film(10,  "film10", 100);
        Film film11 = new Film(11, "film11", 200);
        Film film12 = new Film(12, "film12", 150);

        PosterFilms repo = new PosterFilms(11);
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);
        repo.save(film12);

        Film[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        Film[] actual = repo.showFilm();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetFiveLimitFilmTest() {

        Film film1 = new Film(1,  "film1", 100);
        Film film2 = new Film(2, "film2", 200);
        Film film3 = new Film(3, "film3", 150);
        Film film4 = new Film(4,  "film4", 100);
        Film film5 = new Film(5, "film5", 200);
        Film film6 = new Film(6, "film6", 150);
        Film film7 = new Film(7,  "film7", 100);
        Film film8 = new Film(8, "film8", 200);
        Film film9 = new Film(9, "film9", 150);
        Film film10 = new Film(10,  "film10", 100);
        Film film11 = new Film(11, "film11", 200);
        Film film12 = new Film(12, "film12", 150);

        PosterFilms repo = new PosterFilms(5);
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);
        repo.save(film12);

        Film[] expected = {film12, film11, film10, film9, film8};
        Film[] actual = repo.showFilm();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroLimitFilmTest() {

        Film film1 = new Film(1,  "film1", 100);
        Film film2 = new Film(2, "film2", 200);
        Film film3 = new Film(3, "film3", 150);
        Film film4 = new Film(4,  "film4", 100);
        Film film5 = new Film(5, "film5", 200);
        Film film6 = new Film(6, "film6", 150);
        Film film7 = new Film(7,  "film7", 100);
        Film film8 = new Film(8, "film8", 200);
        Film film9 = new Film(9, "film9", 150);
        Film film10 = new Film(10,  "film10", 100);
        Film film11 = new Film(11, "film11", 200);
        Film film12 = new Film(12, "film12", 150);

        PosterFilms repo = new PosterFilms(0);
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);
        repo.save(film12);

        Film[] expected = {};
        Film[] actual = repo.showFilm();
        assertArrayEquals(expected, actual);
    }
}