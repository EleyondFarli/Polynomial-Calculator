package Model;

import java.util.ArrayList;
import java.util.Comparator;

public class Polynomial {
    private ArrayList< Monomial > monomialList;
    private int degree;

    public Polynomial(ArrayList< Monomial > monomialList) {
        this.monomialList = monomialList;

        int big = 0;
        for (Monomial myMonomial : monomialList) {
            if (myMonomial.getPowerDegree() > big) {
                big = myMonomial.getPowerDegree();
            }
        }
        this.degree = big;
    }

    Polynomial(Monomial monomial) {
        this.monomialList = new ArrayList< Monomial >();
        monomialList.add(monomial);
        this.degree = monomial.getPowerDegree();
    }

    public ArrayList< Monomial > getMonomialList() {
        return monomialList;
    }

    public int getDegree() {
        return degree;
    }

    public static Polynomial simplify(Polynomial polynomial) {
        ArrayList< Monomial > monomialList = polynomial.getMonomialList();
        ArrayList< Monomial > result = new ArrayList< Monomial >();
        ArrayList< Integer > powerTaken = new ArrayList< Integer >();
        for (int i = 0; i < monomialList.size(); ++i) {
            double coeffSum = monomialList.get(i).getCoefficient();
            int currentDeg = monomialList.get(i).getPowerDegree();
            if (!powerTaken.contains(currentDeg)) {
                for (int j = i + 1; j < monomialList.size(); ++j) {
                    if (currentDeg == monomialList.get(j).getPowerDegree()) {
                        coeffSum += monomialList.get(j).getCoefficient();
                    }
                }
                powerTaken.add(currentDeg);
                result.add(new Monomial(currentDeg, coeffSum));
            }
        }
        result.sort(Comparator.comparing(Monomial::getPowerDegree).reversed());
        return new Polynomial(result);
    }

    public String toString() {
        if (monomialList.isEmpty()) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        boolean isFirst;
        for (Monomial monomial : monomialList) {
            isFirst = monomial.equals(monomialList.get(0));
            result.append(monomial.toString(isFirst));
        }
        return result.toString();
    }

}
