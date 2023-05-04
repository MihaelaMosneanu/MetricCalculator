
import java.util.Objects;

public class MetricCalculator {
    public String addition(double firstNumber, String firstMetric, double secondNumber, String secondMetric) {
        String result = "";
        String metricToConvert = " ";
        try {
            metricToConvert = calculateResultingMetric(firstMetric, secondMetric);
            if (Objects.equals(metricToConvert, firstMetric)) {
                secondNumber = convertNumberToMetric(secondNumber, secondMetric, metricToConvert);
            } else {
                firstNumber = convertNumberToMetric(firstNumber, firstMetric, metricToConvert);
            }

            double addition = firstNumber + secondNumber;
            result = addition + " " + metricToConvert;

        } catch (Exception e) {
            System.out.println(e);
        }

        return result;
    }

    public String subtraction(double firstNumber, String firstMetric, double secondNumber, String secondMetric) {
        String result = "";
        try {
            String metricToConvert = calculateResultingMetric(firstMetric, secondMetric);
            if (Objects.equals(metricToConvert, firstMetric)) {
                secondNumber = convertNumberToMetric(secondNumber, secondMetric, metricToConvert);
            } else {
                firstNumber = convertNumberToMetric(firstNumber, firstMetric, metricToConvert);
            }

            double subtraction = firstNumber - secondNumber;
            result = subtraction + " " + metricToConvert;
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }

    private String calculateResultingMetric(String firstMetric, String secondMetric) throws Exception {
        int firstMetricValue = calculateMetricValue(firstMetric);
        int secondMetricValue = calculateMetricValue(secondMetric);

        if (firstMetricValue == 0 || secondMetricValue == 0) {
            throw new Exception("Metric not supported");
        }
        return firstMetricValue < secondMetricValue ? firstMetric : secondMetric;
    }

    private int calculateMetricValue(String metric) {
        switch (metric) {
            case "mm":
                return 1;
            case "cm":
                return 2;
            case "dm":
                return 3;
            case "m":
                return 4;
            case "km":
                return 5;
            default:
                return 0;
        }
    }

    private double convertNumberToMetric(double number, String metricOfNumber, String metricToConvert) {
        switch (metricOfNumber) {
            case "mm":
                return convertFromMM(number, metricToConvert);
            case "cm":
                return convertFromCM(number, metricToConvert);
            case "dm":
                return convertFromDM(number, metricToConvert);
            case "m":
                return convertFromM(number, metricToConvert);
            case "km":
                return convertFromKM(number, metricToConvert);
            default:
                return number;
        }

    }

    private double convertFromKM(double number, String metricToConvert) {
        switch (metricToConvert) {
            case "mm":
                return number * 1000000;
            case "cm":
                return number * 100000;
            case "dm":
                return number * 10000;
            case "m":
                return number * 1000;
            default:
                return number;
        }
    }

    private double convertFromM(double number, String metricToConvert) {
        switch (metricToConvert) {
            case "mm":
                return number * 1000;
            case "cm":
                return number * 100;
            case "dm":
                return number * 10;
            case "km":
                return number * 0.01;
            default:
                return number;
        }
    }

    private double convertFromDM(double number, String metricToConvert) {
        switch (metricToConvert) {
            case "mm":
                return number * 100;
            case "cm":
                return number * 10;
            case "m":
                return number * 0.1;
            case "km":
                return number * 0.0001;
            default:
                return number;
        }
    }

    private double convertFromCM(double number, String metricToConvert) {
        switch (metricToConvert) {
            case "mm":
                return number * 10;
            case "dm":
                return number * 0.1;
            case "m":
                return number * 0.01;
            case "km":
                return number * 0.00001;
            default:
                return number;
        }
    }

    private double convertFromMM(double number, String metricToConvert) {
        switch (metricToConvert) {
            case "cm":
                return number * 0.1;
            case "dm":
                return number * 0.01;
            case "m":
                return number * 0.001;
            case "km":
                return number * 0.000001;
            default:
                return number;
        }
    }
}
