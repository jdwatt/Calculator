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
public class Control {
   private double num1;
   private double num2;
   private String op;   
   Logic maths= new Logic();
   private double ans;
   
   public void operation(){
       Double finalAns=maths.operation(getNum1(), getNum2(),getOp());
       setAns(finalAns);
   }
   public void setNum1(double number){
       num1=number;
   }
   public void setNum2(double number){
       num2= number;
   }
   public void setOp(String op){
       this.op=op;
   }
   public double getNum1(){
       return num1;
   }
   public double getNum2(){
       return num2;
   }
   public String getOp(){
       return op;
   }
   public void setAns(double ans){
       this.ans=ans;
   }
   public double getAns(){
       return ans;
   }
    
}   