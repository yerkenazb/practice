package mindtek.functionalinterfaces2;

public class Conversion {
    public static void main(String[] args) {

        CurrencyConverter dollarToEuro = x-> (int) (x/0.92);

        CurrencyConverter euroToDollar = x-> (int) (x*1.09);

        System.out.println(dollarToEuro.convert(10));
        System.out.println(euroToDollar.convert(25));

            }
        };




