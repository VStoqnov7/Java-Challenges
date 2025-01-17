package PaymentCalculator;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class PaymentCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = Double.parseDouble(scanner.nextLine());

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = formatIndianCurrency(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.US).format(payment);

        System.out.printf("US: %s%n",us);
        System.out.printf("India: Rs.%s%n",india);
        System.out.printf("China: ￥%s%n",china);
        System.out.printf("France: %s €",france);
    }

    private static String formatIndianCurrency(double payment) {
        DecimalFormat df = new DecimalFormat("##,##,##0.00");
        return df.format(payment);
    }
}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//BG
//Получавате число с плаваща запетая (double), което представлява сума пари. Трябва да форматирате това число според валутните формати на САЩ, Индия, Китай и Франция. За целта ще използвате класа NumberFormat за конвертиране на числото в съответния формат за всяка от валутите. След това трябва да отпечатате стойностите, форматирани по подходящ начин за всяка страна.
//
//Стъпки за изпълнение на задачата:
//Четене на вход:
//Програмата започва с прочитане на стойността на сумата пари (число с плаваща запетая).
//
//Форматиране на сумата:
//Използвайте метода NumberFormat.getCurrencyInstance() за форматиране на числото за САЩ, Китай и Франция. За Индия, тъй като не съществува предварително дефиниран локал за форматиране на валута, ще създадете персонализиран локал с език "en" и държава "IN" (Индия).
//
//Отпечатване на форматираните стойности:
//Отпечатайте форматираната сума за всяка валута:
//
//САЩ: Валутата трябва да бъде форматирана със символа на долара и със запетая като разделител на хилядите.
//Индия: Валутата трябва да бъде с префикс "Rs.".
//Китай: Валутата трябва да бъде форматирана със символа за китайския юан (￥).
//Франция: Валутата трябва да бъде с евро символ (със съответните десетични разделители).


//Вход:
//25
//
//Изход:
//US: $25.00
//India: Rs.25,00
//China: ￥$25.00
//France: $25.00 €

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//EN
//You are given a floating-point number (double) representing an amount of money. You need to format this number according to the currency formats of the USA, India, China, and France. For this, you will use the NumberFormat class to convert the number into the appropriate format for each currency. Afterward, you need to print the values formatted in the proper way for each country.
//
//Steps to complete the task:
//Reading Input: The program starts by reading the value of the money (a floating-point number).
//
//Formatting the Amount: Use the NumberFormat.getCurrencyInstance() method to format the number for the USA, China, and France. For India, since there is no predefined locale for formatting currency, you will create a custom locale with language "en" and country "IN" (India).
//
//Printing the Formatted Values: Print the formatted amount for each currency:
//
//USA: The currency should be formatted with the dollar symbol and commas as thousands separators.
//India: The currency should have the "Rs." prefix.
//China: The currency should be formatted with the Chinese Yuan symbol (￥).
//France: The currency should be formatted with the Euro symbol (€) and the appropriate decimal separators.