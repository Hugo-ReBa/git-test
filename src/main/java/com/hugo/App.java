package com.hugo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int day=3;
        String dayName=switch(day){
            case 1 ->"星期一";
            case 2 ->"星期二";
            case 3 ->"星期三";
            case 4 ->"星期四";
            case 5 ->"星期五";
            default -> "周末";
        };

        System.out.println("这是我在feature1分支写的新功能！");

    }
}
