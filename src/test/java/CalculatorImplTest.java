import Model.CalculatorModel;
import Model.DivisionResult;
import Model.Monomial;
import Model.Polynomial;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorImplTest {

    private CalculatorModel model = new CalculatorModel();
    private Polynomial pol1;
    private Polynomial pol2;

    @Test
    public void testAdder_whenInputFormatIsCorrect_shouldReturnAdditionResult() {
        Monomial mon1 = new Monomial(3, 5);
        Monomial mon2 = new Monomial(2, -2);
        Monomial mon3 = new Monomial(0, 5);

        Monomial mon4 = new Monomial(4, -2);
        Monomial mon5 = new Monomial(2, -2);
        Monomial mon6 = new Monomial(1, -15);
        Monomial mon7 = new Monomial(0, 20);

        ArrayList<Monomial> monomials1 = new ArrayList<>();
        ArrayList<Monomial> monomials2 = new ArrayList<>();

        monomials1.add(mon1);
        monomials1.add(mon2);
        monomials1.add(mon3);

        monomials2.add(mon4);
        monomials2.add(mon5);
        monomials2.add(mon6);
        monomials2.add(mon7);

        pol1 = new Polynomial(monomials1);
        pol2 = new Polynomial(monomials2);

        Polynomial result = model.add(pol1, pol2);
        assertEquals("-2x^4+5x^3-4x^2-15x^1+25", result.toString());
    }

    @Test
    public void testSubtractor_whenInputFormatIsCorrect_shouldReturnSubtractionResult() {
        Monomial mon1 = new Monomial(3, 5);
        Monomial mon2 = new Monomial(2, -2);
        Monomial mon3 = new Monomial(0, 5);

        Monomial mon4 = new Monomial(4, -2);
        Monomial mon5 = new Monomial(2, -2);
        Monomial mon6 = new Monomial(1, -15);
        Monomial mon7 = new Monomial(0, 20);

        ArrayList<Monomial> monomials1 = new ArrayList<>();
        ArrayList<Monomial> monomials2 = new ArrayList<>();

        monomials1.add(mon1);
        monomials1.add(mon2);
        monomials1.add(mon3);

        monomials2.add(mon4);
        monomials2.add(mon5);
        monomials2.add(mon6);
        monomials2.add(mon7);

        pol1 = new Polynomial(monomials1);
        pol2 = new Polynomial(monomials2);

        Polynomial result = model.subtract(pol1, pol2);
        assertEquals("2x^4+5x^3+15x^1-15", result.toString());
    }

    @Test
    public void testMultiplier_whenInputFormatIsCorrect_shouldReturnMultiplicationResult() {
        Monomial mon1 = new Monomial(3, 5);
        Monomial mon2 = new Monomial(2, -2);
        Monomial mon3 = new Monomial(0, 5);

        Monomial mon4 = new Monomial(4, -2);
        Monomial mon5 = new Monomial(2, -2);
        Monomial mon6 = new Monomial(1, -15);
        Monomial mon7 = new Monomial(0, 20);

        ArrayList<Monomial> monomials1 = new ArrayList<>();
        ArrayList<Monomial> monomials2 = new ArrayList<>();

        monomials1.add(mon1);
        monomials1.add(mon2);
        monomials1.add(mon3);

        monomials2.add(mon4);
        monomials2.add(mon5);
        monomials2.add(mon6);
        monomials2.add(mon7);

        pol1 = new Polynomial(monomials1);
        pol2 = new Polynomial(monomials2);

        Polynomial result = model.multiply(pol1, pol2);
        assertEquals("-10x^7+4x^6-10x^5-81x^4+130x^3-50x^2-75x^1+100", result.toString());
    }

    @Test
    public void testDivider_whenInputFormatIsCorrect_shouldReturnDivisionResult() {
        Monomial mon1 = new Monomial(3, 5);
        Monomial mon2 = new Monomial(2, -2);
        Monomial mon3 = new Monomial(0, 5);

        Monomial mon4 = new Monomial(4, -2);
        Monomial mon5 = new Monomial(2, -2);
        Monomial mon6 = new Monomial(1, -15);
        Monomial mon7 = new Monomial(0, 20);

        ArrayList<Monomial> monomials1 = new ArrayList<>();
        ArrayList<Monomial> monomials2 = new ArrayList<>();

        monomials1.add(mon1);
        monomials1.add(mon2);
        monomials1.add(mon3);

        monomials2.add(mon4);
        monomials2.add(mon5);
        monomials2.add(mon6);
        monomials2.add(mon7);

        pol1 = new Polynomial(monomials1);
        pol2 = new Polynomial(monomials2);

        DivisionResult result = model.divide(pol2, pol1);
        assertEquals("Quotient: -0.4x^1-0.16\n" +
                "Remainder: -2.32x^2-13x^1+20.8", result.toString());
    }

    @Test
    public void testDifferentiator_whenInputFormatIsCorrect_shouldReturnDifferentiationResult() {
        Monomial mon1 = new Monomial(3, 5);
        Monomial mon2 = new Monomial(2, -2);
        Monomial mon3 = new Monomial(0, 5);

        ArrayList<Monomial> monomials1 = new ArrayList<>();

        monomials1.add(mon1);
        monomials1.add(mon2);
        monomials1.add(mon3);

        pol1 = new Polynomial(monomials1);

        Polynomial result = model.differentiate(pol1);
        assertEquals("15x^2-4x^1", result.toString());
    }

    @Test
    public void testIntegrator_whenInputFormatIsCorrect_shouldReturnIntegrationResult() {
        Monomial mon1 = new Monomial(3, 5);
        Monomial mon2 = new Monomial(2, -2);
        Monomial mon3 = new Monomial(0, 5);

        ArrayList<Monomial> monomials1 = new ArrayList<>();

        monomials1.add(mon1);
        monomials1.add(mon2);
        monomials1.add(mon3);

        pol1 = new Polynomial(monomials1);

        Polynomial result = model.integrate(pol1);
        assertEquals("1.25x^4-0.67x^3+5x^1", result.toString());
    }
}
