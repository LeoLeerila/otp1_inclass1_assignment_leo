package ic1;

public class TemperatureConverter {
    public double fahrenheitToCelsius(double fahrenheit){
        return ((fahrenheit - 32) * 5 / 9);
    }

    public double kelvinToCelsius(double kelvin) {
        return (kelvin - 273.15);
    }

    public double celsiusToFahrenheit(double celsius) {
        return ((celsius * 9 / 5) + 32);
    }

    public boolean isExtremeTemperature(double celsius) {
        boolean extreme = false;
        if (celsius < -40) {
            extreme = true;
        } else if (celsius > 50) {
            extreme = true;
        }

        return extreme;
    }
}