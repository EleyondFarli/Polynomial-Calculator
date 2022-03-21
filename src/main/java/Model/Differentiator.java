package Model;

import java.util.ArrayList;

public class Differentiator {

    public Polynomial differentiate(Polynomial pol) {
        pol = Polynomial.simplify(pol);

        ArrayList<Monomial> monomialList = pol.getMonomialList();
        ArrayList<Monomial> resultMonomialList = new ArrayList<>();

        for(Monomial monomial : monomialList) {
            double resultCoeff = monomial.getCoefficient() * monomial.getPowerDegree();
            int resultDeg = monomial.getPowerDegree() - 1;
            if (resultCoeff == 0) {
                continue;
            }
            resultMonomialList.add(new Monomial(resultDeg, resultCoeff));
        }

        return new Polynomial(resultMonomialList);
    }
}
