package basic.ex7;

public class Temperature {
    double CelsiusToFahrenheit(double temp) {
        return (1.8*temp + 32);
    }

    double FahrenheitToCelsius(double temp) {
        return ((temp-32)*5/9);
    }
}