module hu.petrik.calculatorproject.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens hu.petrik.calculatorproject.calculator to javafx.fxml;
    exports hu.petrik.calculatorproject.calculator;
}