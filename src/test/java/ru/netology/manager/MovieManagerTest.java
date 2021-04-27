package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;


import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {
    private ru.netology.manager.MovieManager movieManager = new ru.netology.manager.MovieManager();
    private Movie first = new Movie(1,"name1", "genre1");
    private Movie second = new Movie(2,"name2", "genre2");
    private Movie third = new Movie(3,"name3", "genre3");
    private Movie fourth = new Movie(4,"name4", "genre4");
    private Movie fifth = new Movie(5,"name5", "genre5");
    private Movie sixth = new Movie(6,"name6", "genre6");
    private Movie seventh = new Movie(7,"name7", "genre7");
    private Movie eighth = new Movie(8,"name8", "genre8");
    private Movie ninth = new Movie(9,"name9", "genre9");
    private Movie tenth = new Movie(10,"name10", "genre10");
    private Movie eleventh = new Movie(11,"name11", "genre11");


    @BeforeEach
    public void setUp() {
        movieManager.add(first);
        movieManager.add(second);
        movieManager.add(third);
    }

    @Test
    public void shouldAddMovie() {
        Movie[] actual = movieManager.getAll();
        Movie[] expected = new Movie[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMoreMovie(){
        movieManager.add(fourth);

        Movie[] actual = movieManager.getAll();
        Movie[] expected = new Movie[]{fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMoreThenTenMovies(){
        movieManager.add(fourth);
        movieManager.add(fifth);
        movieManager.add(sixth);
        movieManager.add(seventh);
        movieManager.add(eighth);
        movieManager.add(ninth);
        movieManager.add(tenth);
        movieManager.add(eleventh);

        Movie[] actual = movieManager.getAll();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }

}