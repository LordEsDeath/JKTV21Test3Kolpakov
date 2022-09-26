/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21test3kolpakov;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV21Test3Kolpakov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой личный код");
        String[] mouth = {"Январь","Февраль","Март","Апрель","Мая","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};
        String code = scanner.next();
        
        System.out.println("Введите своё имя (латиницей)");
        String name = scanner.next();
        System.out.println("теперь фамилие(латиницей)");
        String Sname = scanner.next();
        
        String year = (code.substring(1, 3));
        String dateM = (code.substring(3, 5));
        String day = (code.substring(5, 7));
        String first = (code.substring(0,1));

        String mou = (mouth[Integer.parseInt(dateM)-1]);
        String years = " ";
        if(first.contains("3")){
            years = "19";
        }if(first.contains("4")){
            years = "19";
        }if(first.contains("5")){
            years = "20";
        }if(first.contains("6")){
            years = "20";
        }
        
            
        
        System.out.print(name+" " + Sname +" родился ");
        System.out.printf("%s %s %s%s", day,mou,years,year);
        
        
       
        }
    
}
