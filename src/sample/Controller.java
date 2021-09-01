package sample;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class Controller<Exeption> {

    private long num1;
    private String F;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton km;

    @FXML
    private JFXButton vol;

    @FXML
    private JFXButton inr;

    @FXML
    private JFXButton f;

    @FXML
    private JFXButton cen;

    @FXML
    private JFXButton clr;

    @FXML
    private JFXTextArea txt1;

    @FXML
    private JFXButton meter;

    @FXML
    private Label lbl1;

    @FXML
    void cenclick (ActionEvent event) {
        String text1 = txt1.getText();
        this.num1= Integer.parseInt(text1);

        float cen = (num1-32)*5/9;
        java.awt.Label output;
        lbl1.setText(String.valueOf(cen)+"C");

    }

    @FXML
    void clrclick(ActionEvent event) {

        txt1.setText("");
        lbl1.setText("");
    }

    @FXML
    void fclick(ActionEvent event) {
        String text1 = txt1.getText();
        this.num1= Integer.parseInt(text1);

        double f = (num1*9/5)+32;
        java.awt.Label output;
        lbl1.setText(String.valueOf(f+"F"));
    }

    @FXML
    void inrclick(ActionEvent event) {
        String text1 = txt1.getText();
        this.num1= Integer.parseInt(text1);

        float inr = (float) (num1*2.71);
        java.awt.Label output;
        lbl1.setText(String.valueOf(inr+"INR"));
    }

    @FXML
    void kmclick(ActionEvent event) {
        try {
            String text1 = txt1.getText();
            this.num1 = Integer.parseInt(text1);
            //input in metere
            double km = (num1 / 1000);
            java.awt.Label output;
            lbl1.setText(String.valueOf(km+"Km"));
        }
        catch (NumberFormatException e){
            lbl1.setText("Invalid Input");
        }
    }

    @FXML
    void mclick(ActionEvent event) {
        try {
            String text1 = txt1.getText();
            this.num1 = Integer.parseInt(text1);
            //input in cm
            float m = (num1/100);
            java.awt.Label output;
            lbl1.setText(String.valueOf(m+"m"));
        }
        catch (NumberFormatException e){
            lbl1.setText("Invalid Input");
        }
    }

    @FXML
    void volclick(ActionEvent event) {
        try {
            String text1 = txt1.getText();
            this.num1 = Integer.parseInt(text1);

            float vol = (num1*num1*num1);
            java.awt.Label output;
            lbl1.setText(String.valueOf(vol+"m3"));
        }
        catch (NumberFormatException e){
            lbl1.setText("Invalid Input");
        }
    }

    @FXML
    void initialize() {
        assert km != null : "fx:id=\"km\" was not injected: check your FXML file 'Converter.fxml'.";
        assert vol != null : "fx:id=\"vol\" was not injected: check your FXML file 'Converter.fxml'.";
        assert inr != null : "fx:id=\"inr\" was not injected: check your FXML file 'Converter.fxml'.";
        assert f != null : "fx:id=\"f\" was not injected: check your FXML file 'Converter.fxml'.";
        assert cen != null : "fx:id=\"cen\" was not injected: check your FXML file 'Converter.fxml'.";
        assert clr != null : "fx:id=\"clr\" was not injected: check your FXML file 'Converter.fxml'.";
        assert meter != null : "fx:id=\"meter\" was not injected: check your FXML file 'Converter.fxml'.";
        assert lbl1 != null : "fx:id=\"lbl1\" was not injected: check your FXML file 'Converter.fxml'.";
        assert txt1 != null : "fx:id=\"txt1\" was not injected: check your FXML file 'Converter.fxml'.";

    }
}


