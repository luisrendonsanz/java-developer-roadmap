package POO_esencial.UtilidadStatic;

public class ConversorTemperatura {
    public static double celciusToFahrenheit(double celcius){
        return (celcius*9/5)+32;
    }
    public static double fahrenheitToCelcius(double fahrenheit){
        return (fahrenheit-32)*5/9;
    }
}
