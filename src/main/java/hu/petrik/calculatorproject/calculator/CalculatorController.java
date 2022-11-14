package hu.petrik.calculatorproject.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.regex.Pattern;

public class CalculatorController {
    @FXML
    private TextField Num1;
    @FXML
    private TextField Num2;
    @FXML
    private Text Eredmeny;

    @FXML
    private void Osszead() {
        if (ell(Num1.getText(), Num2.getText())) {

            double osszeg = 0;
            Eredmeny.setText("");
            osszeg = Double.sum(Double.parseDouble(Num1.getText()), Double.parseDouble((Num2.getText())));
            Eredmeny.setText(String.valueOf(osszeg));
        } else {
            alert();
        }
    }

    @FXML
    private void Kivon() {
        if (ell(Num1.getText(), Num2.getText())) {
            double kulonbseg = 0;
            Eredmeny.setText("");
            kulonbseg = Double.sum(Double.parseDouble(Num1.getText()), (Double.parseDouble((Num2.getText())) * -1));
            Eredmeny.setText(String.valueOf(kulonbseg));
        } else {
            alert();
        }
    }

    @FXML
    private void Szoroz() {
        if (ell(Num1.getText(), Num2.getText())) {

            double szorzat = 0;
            Eredmeny.setText("");
            szorzat = Double.parseDouble(Num1.getText()) * Double.parseDouble(Num1.getText());
            Eredmeny.setText(String.valueOf(szorzat));
        } else {
            alert();
        }
    }

    @FXML
    private void Oszt() {
        if (ell(Num1.getText(), Num2.getText())) {
            double osztas = 0;
            Eredmeny.setText("");
            osztas = Math.round((Double.parseDouble(Num1.getText()) / Double.parseDouble(Num2.getText())));
            Eredmeny.setText(String.valueOf(osztas));
        } else {
            alert();
        }
    }

    @FXML
    private void MaradekosOszt() {
        if (ell(Num1.getText(), Num2.getText())) {
            double osztas = 0;
            Eredmeny.setText("");
            osztas = Double.parseDouble(Num1.getText()) % Double.parseDouble(Num2.getText());
            Eredmeny.setText(String.valueOf(osztas));
        } else {
            alert();
        }
    }

    @FXML
    private void alert() {
        Alert felugroAblak = new Alert(Alert.AlertType.WARNING);
        felugroAblak.setHeaderText("Figyelmeztetés");
        felugroAblak.setContentText("Hibás adatok");
        felugroAblak.show();
    }

    @FXML
    private boolean ell(String number1, String number2) {
        boolean yes = false;
        String doubleregex = "([0-9]*)\\.([0-9]*)";
        boolean match = Pattern.matches(doubleregex, number1);
        boolean match2 = Pattern.matches(doubleregex, number2);
        System.out.println(match);
        if (match2 && match) {
            yes = true;
        }
        return yes;
    }
}