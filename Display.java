/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author jwatt
 */
public class Display {
        Label label;
        Control ctrl;
    public Scene model(){
        ctrl= new Control();
        GridPane gp= new GridPane();
        //Color color=Color.WHITESMOKE;
        BorderPane bp= new BorderPane();
        label= new Label("");
        label.setPrefSize(180,30);
        label.setAlignment(Pos.CENTER);
        Button clear= new Button("clear");
        clear.setPrefSize(46, 30);
        clear.setStyle("-fx-background-color: WHITESMOKE");        
        HBox hb0= new HBox();
        hb0.getChildren().addAll(label);
        //label.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));;
        label.setStyle("-fx-background-color:IVORY");
        Button nine= new Button ("9");
        nine.setPrefSize(30, 30);
        Button eight= new Button ("8");
        eight.setPrefSize(30, 30);
        Button seven= new Button("7");
        seven.setPrefSize(30, 30);
        Button divide= new Button("/");
        divide.setPrefSize(30, 30);
        HBox hb1= new HBox (20);
        hb1.getChildren().addAll(seven,eight,nine,divide);
        Button four= new Button ("4");
        four.setPrefSize(30, 30);
        Button five= new Button ("5");
        five.setPrefSize(30, 30);
        Button six= new Button ("6");
        six.setPrefSize(30, 30);
        Button mult= new Button ("*");
        mult.setPrefSize(30, 30);
        HBox hb2= new HBox(20);
        hb2.getChildren().addAll(four,five,six,mult);
        Button one= new Button("1");
        one.setPrefSize(30, 30);
        Button two= new Button("2");
        two.setPrefSize(30, 30);
        Button three= new Button("3");
        three.setPrefSize(30, 30);
        Button minus= new Button("-");
        minus.setPrefSize(30, 30);
        HBox hb3= new HBox(20);
        hb3.getChildren().addAll(one,two,three,minus);
        Button zero= new Button("0");
        zero.setPrefSize(30, 30);
        Button decimal= new Button(".");
        decimal.setPrefSize(30, 30);
        Button equal= new Button("=");
        equal.setPrefSize(30, 30);
        Button plus= new Button("+");
        plus.setPrefSize(30, 30);
        HBox hb4= new HBox(20);
        hb4.getChildren().addAll(zero,decimal,equal,plus);
        Button exponent= new Button("^");
        exponent.setPrefSize(47, 30);
        Button percent= new Button("%");
        percent.setPrefSize(47, 30);
        HBox hb5= new HBox(20);
        hb5.getChildren().addAll(exponent,percent,clear);
        gp.add(hb1, 0, 0);
        gp.add(hb2,0,1);
        gp.add(hb3,0,2);
        gp.add(hb4, 0, 3);
        gp.add(hb5,0,4);
        gp.setStyle("-fx-background-color:TRANSPARENT");
        gp.setVgap(10);
        bp.setCenter(gp);
        bp.setTop(hb0);
        bp.setStyle("-fx-background-color: AZURE");
        StackPane root= new StackPane();
        root.getChildren().add(bp);
        Scene scene= new Scene(root,200,200);
        EventHandler<ActionEvent> event= new EventHandler<ActionEvent>(){
           public void handle(ActionEvent e){               
               
               String number= ((Button)e.getSource()).getText();
               label.setText(label.getText()+number);
               
            }
        };
        zero.setOnAction(event);
        one.setOnAction(event);
        two.setOnAction(event);
        three.setOnAction(event);
        four.setOnAction(event);
        five.setOnAction(event);
        six.setOnAction(event);
        seven.setOnAction(event);
        eight.setOnAction(event);
        nine.setOnAction(event);
        decimal.setOnAction(event);
        clear.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle (ActionEvent e){
                label.setText("");
            }
        });
        plus.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle (ActionEvent e){
                //ctrl= new Control();
                String val= label.getText();
                double number1= Double.parseDouble(val);
                ctrl.setNum1(number1);
                label.setText("");
                ctrl.setOp("+");
            }
        });
         minus.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle (ActionEvent e){
                //ctrl= new Control();
                String val= label.getText();
                double number1= Double.parseDouble(val);
                ctrl.setNum1(number1);
                label.setText("");
                ctrl.setOp("-");
            }
        });
          divide.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle (ActionEvent e){
                //ctrl= new Control();
                String val= label.getText();
                double number1= Double.parseDouble(val);
                ctrl.setNum1(number1);
                label.setText("");
                ctrl.setOp("/");
            }
        });
           mult.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle (ActionEvent e){
                //ctrl= new Control();
                String val= label.getText();
                double number1= Double.parseDouble(val);
                ctrl.setNum1(number1);
                label.setText("");
                ctrl.setOp("*");
            }
        });
               exponent.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle (ActionEvent e){
                //ctrl= new Control();
                String val= label.getText();
                double number1= Double.parseDouble(val);
                ctrl.setNum1(number1);
                label.setText("");
                ctrl.setOp("^");
            }
        }); 
                percent.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle (ActionEvent e){
                //ctrl= new Control();
                String val= label.getText();
                double number1= Double.parseDouble(val);
                ctrl.setNum1(number1);
                label.setText("");
                ctrl.setOp("%");
            }
        });
        equal.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){              
                String val=label.getText();
                double number2= Double.parseDouble(val);
                ctrl.setNum2(number2);                                
                ctrl.operation();                
                label.setText(Double.toString(ctrl.getAns()));
            }
        });
        return scene;
    }
    
}
