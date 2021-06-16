package src.models;

import java.util.ArrayList;
import java.util.List;

public class MovieBookingSystem {
    private List<Movie> movies;

    public MovieBookingSystem() {
        // Initialise a List of Movies
        this.movies = populateMovieList();
        // Initialise a List of Available Seats

    }

    public List<Movie> getMovies() {
        return this.movies;
    }

    public Ticket bookTicket(String movie, int seatQty) {
        List<Seat> seatList = getSeats(seatQty);
        Ticket t = new Ticket(movie, seatList, 100);

        return t;
    }

    private List<Movie> populateMovieList() {
        Movie m1 = new Movie("Alien Invasion", 120, true);
        Movie m2 = new Movie("Shaun of The Dead", 90, true);
        Movie m3 = new Movie("Get Out", 150, true);
        Movie m4 = new Movie("Life is Beautiful", 180, false);

        List<Movie> movieList = new ArrayList<Movie>();
        movieList.add(m1);
        movieList.add(m2);
        movieList.add(m3);
        movieList.add(m4);

        return movieList;
    }

    private List<Seat> getSeats(int seatQty) {
        List<Seat> seatList = new ArrayList<Seat>();

        for (int i = 0; i < seatQty; i++) {
            seatList.add(new Seat(true));
        }

        return seatList;
    }
}
