package src.models;

import java.util.List;

public class Ticket {
    private static int counter;
    private int ticketNumber;
    private String issuedForMovie;
    private List<Seat> seatList;
    private double costPerTicket;
    private double totalCost;

    static {
        counter = 0;
    }

    public Ticket(String issuedForMovie, List<Seat> seatList, double costPerTicket) {
        counter += 1;

        this.ticketNumber = counter;
        this.issuedForMovie = issuedForMovie;
        this.seatList = seatList;
        this.costPerTicket = costPerTicket;
        this.totalCost = this.costPerTicket * this.seatList.size();
    }

    public String getMovieName() {
        return this.getMovieName();
    }

    public List<Seat> getSeats() {
        return this.seatList;
    }
}
