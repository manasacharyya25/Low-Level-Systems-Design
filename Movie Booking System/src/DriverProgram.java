package src;

import java.util.List;

import src.models.Movie;
import src.models.MovieBookingSystem;
import src.models.Seat;
import src.models.Ticket;

public class DriverProgram {
    public static void main(String[] args) {
        MovieBookingSystem mbs = new MovieBookingSystem();

        List<Movie> movies = mbs.getMovies();

        System.out.printf("Movie Name            Length\n");
        System.out.println("================================");
        for (Movie m : movies) {
            System.out.printf("%-20s %5d\n", m.getName(), m.getLength());
        }

        Ticket t1 = mbs.bookTicket(movies.get(1).getName(), 4);

        for (Seat s : t1.getSeats()) {
            System.out.println(s.getSeatNumber());
        }

        Ticket t2 = mbs.bookTicket(movies.get(2).getName(), 1);

        for (Seat s : t2.getSeats()) {
            System.out.println(s.getSeatNumber());
        }
    }
}