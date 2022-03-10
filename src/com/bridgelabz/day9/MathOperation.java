package com.bridgelabz.day9;

@FunctionalInterface
interface MathFunction{
    int Calculate (int a ,int b);
    static void printResult(int a,int b,String function ,MathFunction obj1){
        System.out.println("New Result :: " + function+ " IS " + obj1.Calculate(a,b));
    } //static method
}
public class MathOperation
{
    public static void main(String[] args) {
     MathFunction addition = Integer :: sum;
     MathFunction multiply = (x,y) ->x * y;
        MathFunction divide = (x,y) ->x / y;
        MathFunction subtract = (x,y) ->x - y;
        System.out.println(addition.Calculate(4,5));
        System.out.println(multiply.Calculate(6,9));
        System.out.println(divide.Calculate(12,2));
        System.out.println(subtract.Calculate(8,7));

        //passing lambda expression as a functional parameter to print using static function
        MathFunction.printResult(4,5,"Addition",addition);
        MathFunction.printResult(6,9,"multiplication",multiply);
        MathFunction.printResult(12,2,"divide",divide);

    }
}
