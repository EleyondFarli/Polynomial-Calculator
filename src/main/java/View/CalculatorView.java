package View;

import Model.Polynomial;

import java.awt.event.ActionListener;

public class CalculatorView extends javax.swing.JFrame {

    public CalculatorView() {
        initComponents();
    }

    private String resultText;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        insertLabel = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        textFieldPolynomial1 = new javax.swing.JTextField();
        textFieldPolynomial2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTextField = new javax.swing.JTextArea();
        addButton = new javax.swing.JButton();
        subtractButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        differentiateButton = new javax.swing.JButton();
        integrateButton = new javax.swing.JButton();
        equalsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        insertLabel.setText("Insert your polynomials here:");

        resultLabel.setText("Result:");

        textFieldPolynomial1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldPolynomial1.setText("Polynomial 1");

        textFieldPolynomial2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldPolynomial2.setText("Polynomial 2");

        resultTextField.setColumns(20);
        resultTextField.setRows(5);
        jScrollPane1.setViewportView(resultTextField);

        addButton.setBackground(new java.awt.Color(153, 153, 153));
        addButton.setText("+");

        subtractButton.setBackground(new java.awt.Color(153, 153, 153));
        subtractButton.setText("-");

        multiplyButton.setBackground(new java.awt.Color(153, 153, 153));
        multiplyButton.setText("x");

        divideButton.setBackground(new java.awt.Color(153, 153, 153));
        divideButton.setText("/");

        differentiateButton.setBackground(new java.awt.Color(153, 153, 153));
        differentiateButton.setText("d/dx");

        integrateButton.setBackground(new java.awt.Color(153, 153, 153));
        integrateButton.setText("∫");

        equalsButton.setBackground(new java.awt.Color(255, 153, 0));
        equalsButton.setText("=");
        equalsButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        equalsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(33, 33, 33)
                                                                .addComponent(subtractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(29, 29, 29)
                                                                .addComponent(differentiateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(28, 28, 28)
                                                                .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(32, 32, 32)
                                                                .addComponent(multiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                                                .addComponent(integrateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(59, 59, 59)
                                                                .addComponent(equalsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(textFieldPolynomial1)
                                                .addComponent(textFieldPolynomial2)
                                                .addComponent(insertLabel)
                                                .addComponent(resultLabel)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)))
                                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(insertLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldPolynomial1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldPolynomial2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(resultLabel)
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(subtractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(multiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(differentiateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                                        .addComponent(integrateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(equalsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 677, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 508, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(31, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(32, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>

    public void addAddButtonListener(ActionListener addButtonActionListener) {
        addButton.addActionListener(addButtonActionListener);
    }

    public void addSubtractButtonListener(ActionListener subtractButtonActionListener) {
        subtractButton.addActionListener(subtractButtonActionListener);
    }

    public void addMultiplyButtonListener(ActionListener multiplyButtonActionListener) {
        multiplyButton.addActionListener(multiplyButtonActionListener);
    }

    public void addDivideButtonListener(ActionListener divideButtonActionListener) {
        divideButton.addActionListener(divideButtonActionListener);
    }

    public void addEqualsButtonListener(ActionListener equalsButtonActionListener) {
        equalsButton.addActionListener(equalsButtonActionListener);
    }

    public void addDifferentiateButtonListener(ActionListener differentiateButtonActionListener) {
        differentiateButton.addActionListener(differentiateButtonActionListener);
    }

    public void addIntegrateButtonListener(ActionListener integrateButtonActionListener) {
        integrateButton.addActionListener(integrateButtonActionListener);
    }

    public String getPolynomial1() {
        return textFieldPolynomial1.getText();
    }

    public String getPolynomial2() {
        return textFieldPolynomial2.getText();
    }

    public void setResultTextField() {
        resultTextField.setText(resultText);
    }

    public void setResultText(String resultText) {
        this.resultText = resultText;
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify
    private javax.swing.JButton addButton;
    private javax.swing.JButton differentiateButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton equalsButton;
    private javax.swing.JLabel insertLabel;
    private javax.swing.JButton integrateButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JTextArea resultTextField;
    private javax.swing.JButton subtractButton;
    private javax.swing.JTextField textFieldPolynomial1;
    private javax.swing.JTextField textFieldPolynomial2;
    // End of variables declaration
}

