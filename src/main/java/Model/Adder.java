package Model;

import java.util.ArrayList;

public class Adder {
    public Polynomial add(Polynomial pol1, Polynomial pol2) {
        Polynomial result;

        if (pol1.getDegree() > pol2.getDegree()) {
            result = addPolynomials(pol1, pol2);
        } else {
            result = addPolynomials(pol2, pol1);
        }

        return Polynomial.simplify(result);
    }

    private Polynomial addPolynomials(Polynomial pol1, Polynomial pol2) {
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
                    resultingMonomial.setCoefficient(resultingMonomial.getCoefficient() + coeff2);
                }
            }
            if (resultingMonomial.getCoefficient() != 0) {
                resultList.add(resultingMonomial);
            }
        }

        for (Monomial secondMonomial : secondMonomialList) {
            int deg1 = secondMonomial.getPowerDegree();

            boolean isInFirstList = false;

            for (Monomial firstMonomial : firstMonomialList) {
                int deg2 = firstMonomial.getPowerDegree();

                if (deg1 == deg2) {
                    isInFirstList = true;
                }
            }
            if (!isInFirstList) {
                resultList.add(secondMonomial);
            }
        }

        return new Polynomial(resultList);
    }
}
