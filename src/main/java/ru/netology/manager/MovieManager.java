package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {
  private int movieLength = 10;
  private Movie[] items = new Movie[0];

  public MovieManager(int movieLength) {
    this.movieLength = movieLength;
  }

  public MovieManager() {

  }

  public void add (Movie item) {
    int length = items.length + 1;
    Movie[] tmp = new Movie[length];
    System.arraycopy(items, 0, tmp, 0, items.length);
    int lastIndex = tmp.length - 1;
    tmp[lastIndex] = item;
    items = tmp;
  }


  public Movie[] getAll() {
    int resultLength = Math.min(movieLength, items.length);
    Movie[] result = new Movie[resultLength];
    for (int i = 0; i < result.length; i++) {
      int index = items.length - i - 1;
      result[i] = items[index];
    }
    return result;
  }
}