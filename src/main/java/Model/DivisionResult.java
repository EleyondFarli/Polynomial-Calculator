package Model;

public class DivisionResult {
    Polynomial quotient;
    Polynomial remainder;

    public DivisionResult(Polynomial quotient, Polynomial remainder) {
        this.quotient = quotient;
        this.remainder = remainder;
    }
    
    public String toString() {
        return "Quotient: " + quotient + "\n" + "Remainder: " + remainder;
    }
}
