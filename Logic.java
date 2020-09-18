/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author jwatt
 */
public class Logic {
    private double answer;
    public double operation(double num1, double num2, String operator){        
        switch(operator){
            case "+":
                answer=num1+num2;
                return answer;
                
                
            case "-":
                answer= num1-num2;
                return answer;
               
            case "*":
                answer= num1*num2;
                return answer;
                
            case "/":                
                answer= num1/num2;
                return answer;
                
            case "^":
                answer= Math.pow(num1,num2);
                return answer;
            case "%":
                answer= (num2/100)*num1;
                return answer;
            
            }return answer;
        
        }
    
    
    
}
