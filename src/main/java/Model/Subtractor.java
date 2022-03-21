package Model;

import java.util.ArrayList;

public class Subtractor {
    private final Adder adder;

    Subtractor() {
        this.adder = new Adder();
    }

    public Polynomial subtract(Polynomial pol1, Polynomial pol2) {
        Polynomial result;

        if (pol1.getDegree() > pol2.getDegree()) {
            result = subtractPolynomials(pol1, pol2);
        } else {
            ArrayList<Monomial> secondMonomialList = pol2.getMonomialList();
            for (Monomial monomial : secondMonomialList) {
                monomial.setCoefficient((-1)*monomial.getCoefficient());
            }
            result = adder.add(pol1, pol2);
        }
        return Polynomial.simplify(result);
    }

    private Polynomial subtractPolynomials(Polynomial pol1, Polynomial pol2) {
        ArrayList<Monomial> firstMonomialList = pol1.getMonomialList();
        ArrayList<Monomial> secondMonomialList = pol2.getMonomialList();

        ArrayList<Monomial> resultList = new ArrayList<Monomial>();
        for (Monomial firstMonomial : firstMonomialList) {
            int deg1 = firstMonomial.getPowerDegree();
            double coeff1 = firstMonomial.getCoefficient();

            Monomial resultingMonomial = new Monomial(deg1, coeff1);

            for (Monomial secondMonomial : secondMonomialList) {
                int deg2 = secondMonomial.getPowerDegree();
                double coeff2 = secondMonomial.getCoefficient();

                if (deg1 == deg2) {
                    resultingMonomial.setCoefficient(resultingMonomial.getCoefficient() - coeff2);
                }
            }
            if (resultingMonomial.getCoefficient() != 0) {
                resultList.add(resultingMonomial);
            }
        }
        return new Polynomial(resultList);
    }
}
