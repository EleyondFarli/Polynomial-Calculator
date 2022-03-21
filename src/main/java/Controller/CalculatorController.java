package Controller;

import Model.CalculatorModel;
import Model.DivisionResult;
import Model.Monomial;
import Model.Polynomial;
import View.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorController {
    private CalculatorModel calculatorModel;
    private CalculatorView calculatorView;
    private final String POLYNOMIAL_REGEX = "([-+]?)(\\d*)?([xX](\\^-?(\\d)*)?)?";

    public CalculatorController(CalculatorModel model, CalculatorView view)  {
        calculatorModel = model;
        calculatorView = view;

        view.addAddButtonListener(new AddButtonListener());
        view.addSubtractButtonListener(new SubtractButtonListener());
        view.addMultiplyButtonListener(new MultiplyButtonListener());
        view.addDivideButtonListener(new DivideButtonListener());
        view.addDifferentiateButtonListener(new DifferentiateButtonListener());
        view.addIntegrateButtonListener(new IntegrateButtonListener());
        view.addEqualsButtonListener(new EqualsButtonListener());
    }

    class AddButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = "";
            try {
                String polynomialText1 = calculatorView.getPolynomial1();
                String polynomialText2 = calculatorView.getPolynomial2();

                polynomialText1 = polynomialText1.replace(" ", "");
                polynomialText2 = polynomialText2.replace(" ", "");

                Polynomial polynomial1 = toPolynomial(polynomialText1);
                Polynomial polynomial2 = toPolynomial(polynomialText2);

                Polynomial result = calculatorModel.add(polynomial1, polynomial2);
                calculatorView.setResultText(result.toString());
            } catch (Exception ex) {
                calculatorView.setResultText("Input is incorrect");
            }
        }
    }

    class SubtractButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = "";
            try {
                String polynomialText1 = calculatorView.getPolynomial1();
                String polynomialText2 = calculatorView.getPolynomial2();

                polynomialText1 = polynomialText1.replace(" ", "");
                polynomialText2 = polynomialText2.replace(" ", "");

                Polynomial polynomial1 = toPolynomial(polynomialText1);
                Polynomial polynomial2 = toPolynomial(polynomialText2);

                Polynomial result = calculatorModel.subtract(polynomial1, polynomial2);
                calculatorView.setResultText(result.toString());
            } catch (Exception ex) {
                calculatorView.setResultText("Input is incorrect");
            }
        }
    }

    class MultiplyButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = "";
            try {
                String polynomialText1 = calculatorView.getPolynomial1();
                String polynomialText2 = calculatorView.getPolynomial2();

                polynomialText1 = polynomialText1.replace(" ", "");
                polynomialText2 = polynomialText2.replace(" ", "");

                Polynomial polynomial1 = toPolynomial(polynomialText1);
                Polynomial polynomial2 = toPolynomial(polynomialText2);

                Polynomial result = calculatorModel.multiply(polynomial1, polynomial2);
                calculatorView.setResultText(result.toString());
            } catch (Exception ex) {
                calculatorView.setResultText("Input is incorrect");
            }
        }
    }

    class DivideButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = "";
            try {
                String polynomialText1 = calculatorView.getPolynomial1();
                String polynomialText2 = calculatorView.getPolynomial2();

                polynomialText1 = polynomialText1.replace(" ", "");
                polynomialText2 = polynomialText2.replace(" ", "");

                Polynomial polynomial1 = toPolynomial(polynomialText1);
                Polynomial polynomial2 = toPolynomial(polynomialText2);

                DivisionResult result = calculatorModel.divide(polynomial1, polynomial2);
                calculatorView.setResultText(result.toString());
            } catch (Exception ex) {
                calculatorView.setResultText("Input is incorrect");
            }
        }
    }

    class DifferentiateButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = "";
            try {
                String polynomialText = calculatorView.getPolynomial1();

                polynomialText = polynomialText.replace(" ", "");

                Polynomial polynomial = toPolynomial(polynomialText);

                Polynomial result = calculatorModel.differentiate(polynomial);
                calculatorView.setResultText(result.toString());
            } catch (Exception ex) {
                calculatorView.setResultText("Input is incorrect");
            }
        }
    }

    class IntegrateButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = "";
            try {
                String polynomialText = calculatorView.getPolynomial1();

                polynomialText = polynomialText.replace(" ", "");

                Polynomial polynomial = toPolynomial(polynomialText);

                Polynomial result = calculatorModel.integrate(polynomial);
                calculatorView.setResultText(result.toString());
            } catch (Exception ex) {
                calculatorView.setResultText("Input is incorrect");
            }
        }
    }

    class EqualsButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            calculatorView.setResultTextField();
        }
    }

    private Polynomial toPolynomial(String str) throws NullPointerException {
        while (!Character.isDigit(str.charAt(0)) && str.charAt(0) != '+' && str.charAt(0) != '-' && str.charAt(0) != 'x' && str.charAt(0) != 'X') {
            str = str.substring(1);
        }

        Pattern pattern = Pattern.compile(POLYNOMIAL_REGEX);
        Matcher matcher = pattern.matcher(str);

        ArrayList<Monomial> monomials = new ArrayList<>();
        while (matcher.find()) {
            int coeff = 1;
            int deg = 0;

            if (matcher.group(5) != null) {
                deg = Integer.parseInt(matcher.group(5));
            } else if (matcher.group(3) != null) {
                deg = 1;
            }

            if (matcher.group(1) != null && matcher.group(1).equals("-")) {
                coeff = -1;
            }
            if (matcher.group(2) != null && !matcher.group(2).equals("")) {
                coeff *= Integer.parseInt(matcher.group(2));
            }

            if (coeff != 0) {
                Monomial myMonomial = new Monomial(deg, coeff);
                monomials.add(myMonomial);
            }
        }
        monomials.remove(monomials.get(monomials.size() - 1));
        return new Polynomial(monomials);
    }

}
