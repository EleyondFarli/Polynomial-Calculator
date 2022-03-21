package Model;

import java.util.ArrayList;

public class Divider {

    Multiplier multiplier;
    Subtractor subtractor;

    Divider() {
        this.multiplier = new Multiplier();
        this.subtractor = new Subtractor();
    }
    public DivisionResult divide(Polynomial pol1, Polynomial pol2) {
        pol1 = Polynomial.simplify(pol1);
        pol2 = Polynomial.simplify(pol2);

        return dividePolynomials(pol1, pol2);
    }

    private DivisionResult dividePolynomials(Polynomial pol1, Polynomial pol2) {
        ArrayList<Monomial> quotientMonomialList = new ArrayList<>();
        Polynomial quotientPolynomial;
        Polynomial remainderPolynomial;
        while (pol1.getDegree() >= pol2.getDegree()) {
            Monomial monomialOfPol1 = pol1.getMonomialList().get(0);
            Monomial monomialOfPol2 = pol2.getMonomialList().get(0);

            double coeff = monomialOfPol1.getCoefficient() / monomialOfPol2.getCoefficient();
            int deg = monomialOfPol1.getPowerDegree() - monomialOfPol2.getPowerDegree();
            Monomial resultMonomial = new Monomial(deg, coeff);
            quotientMonomialList.add(resultMonomial);

            Polynomial monomialPoly = new Polynomial(resultMonomial);
            Polynomial resultPolynomial = multiplier.multiply(monomialPoly, pol2);
            resultPolynomial = subtractor.subtract(pol1, resultPolynomial);

            pol1 = resultPolynomial;
        }
        quotientPolynomial = new Polynomial(quotientMonomialList);
        quotientPolynomial = Polynomial.simplify(quotientPolynomial);

        remainderPolynomial = pol1;
        remainderPolynomial = Polynomial.simplify(remainderPolynomial);

        return new DivisionResult(quotientPolynomial, remainderPolynomial);
    }
}
