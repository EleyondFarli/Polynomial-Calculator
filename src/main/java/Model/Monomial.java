package Model;

public class Monomial{
    private int powerDegree;
    private double coefficient;

    public Monomial(int powerDegree) {
        this.powerDegree = powerDegree;
        this.coefficient = 1;
    }

    public Monomial(int powerDegree, double coefficient) {
        this.powerDegree = powerDegree;
        this.coefficient = coefficient;
    }

    public int getPowerDegree() {
        return powerDegree;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public String toString(boolean isFirst) {
        String result = "";
        if (coefficient == 0) {
            return null;
        }
        if (coefficient < 0 || isFirst) {
            if (coefficient == -1) {
                result += "-";
            } else {
                if (coefficient != 1) {
                    if (coefficient == (int) coefficient) {
                        result += (int) coefficient;
                    } else {
                        result += Math.round(coefficient * 100.0) / 100.0;
                    }
                }
            }
        } else {
            if (coefficient == 1 && powerDegree != 0) {
                result += "+";
            } else {
                if (coefficient == (int) coefficient) {
                    result += "+" + (int) coefficient;
                } else {
                    result += "+" + Math.round(coefficient * 100.0) / 100.0;
                }
            }
        }

        if (powerDegree != 0) {
            result += "x^" + powerDegree;
        }
        return result;
    }
}
