/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javafx.application.Application;

import javafx.stage.Stage;

/**
 *
 * @author jwatt
 */
public class Calculator extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       Display display= new Display();
       primaryStage.setScene(display.model());
       primaryStage.setTitle("Calc");
       primaryStage.show();
       }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
