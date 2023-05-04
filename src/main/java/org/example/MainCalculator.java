package org.example;

public class MainCalculator {
    public static void main(String[] args) {

        MetricCalculator metricCalculator = new MetricCalculator();

        String result1 = metricCalculator.addition(100, "mm", 40, "m");
        String result2 = metricCalculator.subtraction(60, "cm", 300, "mm");

        System.out.println(100 +  " dm + " + 40 + " m = " + result1);
        System.out.println(result2);

    }
}
