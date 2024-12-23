package DateToDay;

import java.io.*;


public class DateToDay {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        System.out.print(res);

    }
}

//-------------------------------------------------------------------------------------------------------------------------------------------------------------

//BG
//Описание на задачата:
//Получавате конкретна дата във формат MM DD YYYY. Трябва да напишете метод, който връща деня от седмицата за дадената дата.
//
//Функция:
//Методът трябва да използва Java класове, за да конвертира датата в ден от седмицата и да върне името на деня в главни букви (например "MONDAY", "TUESDAY").

//Вход:
//08 05 2015

//Изход:
//WEDNESDAY

//-------------------------------------------------------------------------------------------------------------------------------------------------------------


//--EN
//Problem Description:
//You are given a specific date in the format MM DD YYYY. You need to write a method that returns the day of the week for the given date.
//
//Function:
//The method should use Java classes to convert the date into a day of the week and return the name of the day in uppercase letters (e.g., "MONDAY", "TUESDAY").

//Input:
//08 05 2015

//Output:
//WEDNESDAY
//-------------------------------------------------------------------------------------------------------------------------------------------------------------
