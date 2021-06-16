package src.models;

public class Movie {
    private static int counter;
    private int serialId;
    private final String name;
    private final int length;
    private boolean isShowing;

    static {
        Movie.counter = 0;
    }

    public Movie(String name, int length, boolean isShowing) {
        Movie.counter += 1;

        this.serialId = Movie.counter;
        this.name = name;
        this.length = length;
        this.isShowing = isShowing;
    }

    public int getId() {
        return this.serialId;
    }

    public String getName() {
        return this.name;
    }

    public int getLength() {
        return this.length;
    }

    public boolean isShowing() {
        return this.isShowing;
    }

    public void setIsShowing(boolean showingStatus) {
        this.isShowing = showingStatus;
    }
}