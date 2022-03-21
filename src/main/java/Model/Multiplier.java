package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Multiplier {
    public Polynomial multiply(Polynomial pol1, Polynomial pol2) {
        Polynomial result;
        ArrayList<Monomial> firstMonomialList = pol1.getMonomialList();
        ArrayList<Monomial> secondMonomialList = pol2.getMonomialList();
        ArrayList<Monomial> resultMonomialList = new ArrayList<>();


        for(Monomial firstMonomial : firstMonomialList) {
            for (Monomial secondMonomial: secondMonomialList) {
                int degree = firstMonomial.getPowerDegree() + secondMonomial.getPowerDegree();
                double coeff = firstMonomial.getCoefficient() * secondMonomial.getCoefficient();
                Monomial multiplicationMonomial = new Monomial(degree,  coeff);
                resultMonomialList.add(multiplicationMonomial);
            }
        }

        Polynomial resultPolynomial = new Polynomial(resultMonomialList);
        return Polynomial.simplify(resultPolynomial);
    }
}
