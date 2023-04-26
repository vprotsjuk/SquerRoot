package org.example;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        double goal = 5;
        int tolerance = 1;
        System.out.println("My code: square root from " + goal + " = " + squareRoot(goal, tolerance));
        System.out.println("Java code: square root from " + goal + " = " + Math.sqrt(goal));
        String sss = "12345";

    }
    public static double squareRoot(double goal, int tolerance) {
        double totalLine = goal * tolerance;
        double particle = goal / totalLine;
        double side = 1 * particle;
        int x = 1;
        double square = 1;
        double perimeter = 1 * particle;
        int p = 0;
        totalLine = totalLine - perimeter ;
        while (totalLine > 0) {
            side = side + 1 * particle;
            x += 1;
            perimeter = perimeter + 2 * particle;
            p += 2;
            square = side * side;
            totalLine = totalLine - perimeter;
        }
        // Hear we calculate the delta
        double delta = (square - goal);
        double thickness = delta / (perimeter);
        double z = particle - thickness;
        perimeter = perimeter + z;
        thickness = delta / (perimeter);
        side = side - thickness;

//        String dec = "#.####";

        DecimalFormat df = new DecimalFormat("#.#####");
//        while (tolerance > 0){
//            dec += "#";
//            tolerance /= 10;
//        }
        df.setRoundingMode(RoundingMode.HALF_UP);
        String formattedNumber = df.format(side);
        double roundedNumber = Double.parseDouble(formattedNumber);
        return roundedNumber;
    }



}