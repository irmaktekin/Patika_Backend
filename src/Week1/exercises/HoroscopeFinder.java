package Week1.exercises;

import java.util.Scanner;

public class HoroscopeFinder {
    public static void main(String[] args) {
        /*Day and month input will be integer.*/

        int day,month;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the day:");
        day = input.nextInt();

        System.out.println("Enter the month:");
        month = input.nextInt();

        /*According to day and month the right code block will be executed.*/
        //21 March-20 April
        if((month==3&&day>=21) || month==4&& day<=20 ){
            System.out.println("Aries");
        }
        //21 April-21 May
        else if((month==4&&day>=21) || (month==5 && day<=21)){
            System.out.println("Taurus");
        }
        //22 May-22 June
        else if((month==5&&day>=22) || (month==6 && day<=22)){
            System.out.println("Gemini");
        }
        //23 June- 22 July
        else if((month==6&&day>=23) || (month==7 && day<=22)){
            System.out.println("Cancer");
        }
        //23 July-22 August
        else if((month==7&&day>=23) || (month==8 && day<=22)){
            System.out.println("Leo");
        }
        //23 August-22 September
        else if((month==8&&day>=23) || (month==9 && day<=22)){
            System.out.println("Virgo");
        }
        //23 September- 22 October
        else if((month==9&&day>=23) || (month==10 && day<=22)){
            System.out.println("Libra");
        }
        //23 October-21 November
        else if((month==10&&day>=23) || (month==11 && day<=21)){
            System.out.println("Scorpio");
        }
        //11 November-21 December
        else if((month==11&&day>=22) || (month==12 && day<=21)){
            System.out.println("Sagittarius");
        }
        //22 December-21 January
        else if((month==12&&day>=22) || (month==1 && day<=21)){
            System.out.println("Capricorn");
        }
        //22 January-19 February
        else if((month==1&&day>=22) || (month==2 && day<=19)){
            System.out.println("Aquarius");
        }
        //The last condition is left which is "Fish"
        else{
            System.out.println("Pisces");
        }
    }

}
