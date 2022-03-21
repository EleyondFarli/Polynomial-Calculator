package Model;

import java.util.ArrayList;

public class Integrator {

    public Polynomial integrate(Polynomial pol) {
        pol = Polynomial.simplify(pol);

        ArrayList<Monomial> monomialList = pol.getMonomialList();
        ArrayList<Monomial> resultMonomialList = new ArrayList<>();

        for(Monomial monomial : monomialList) {
            double resultCoeff = monomial.getCoefficient() / (monomial.getPowerDegree() + 1);
            int resultDeg = monomial.getPowerDegree() + 1;
            if (resultCoeff == 0) {
                continue;
            }
            resultMonomialList.add(new Monomial(resultDeg, resultCoeff));
        }

        return new Polynomial(resultMonomialList);
    }
}
