package Model;

public interface CalculatorInterface {
    Polynomial add(Polynomial pol1, Polynomial pol2);
    Polynomial subtract(Polynomial pol1, Polynomial pol2);
    Polynomial multiply(Polynomial pol1, Polynomial pol2);
    DivisionResult divide(Polynomial pol1, Polynomial pol2);
    Polynomial differentiate(Polynomial pol);
    Polynomial integrate(Polynomial pol);
}
