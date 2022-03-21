package Model;

import java.util.ArrayList;
import java.util.List;

public class CalculatorModel implements CalculatorInterface {

    private final Adder adder;
    private final Subtractor subtractor;
    private final Multiplier multiplier;
    private final Divider divider;
    private final Differentiator differentiator;
    private final Integrator integrator;

    public CalculatorModel() {
        this.adder = new Adder();
        this.subtractor = new Subtractor();
        this.multiplier = new Multiplier();
        this.divider = new Divider();
        this.differentiator = new Differentiator();
        this.integrator = new Integrator();
    }

    public Polynomial add(Polynomial pol1, Polynomial pol2) {
        return adder.add(pol1, pol2);
    }

    public Polynomial subtract(Polynomial pol1, Polynomial pol2) {
        return subtractor.subtract(pol1, pol2);
    }

    public Polynomial multiply(Polynomial pol1, Polynomial pol2) {
        return multiplier.multiply(pol1, pol2);
    }
    public DivisionResult divide(Polynomial pol1, Polynomial pol2) {
        return divider.divide(pol1, pol2);
    }
    public Polynomial differentiate(Polynomial pol) {
        return differentiator.differentiate(pol);
    }
    public Polynomial integrate(Polynomial pol) {
        return integrator.integrate(pol);
    }
}
