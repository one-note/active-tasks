package org.example;

public class EnumExample {
    public static void main(String[] args) {


        EnumExample enumExample = new EnumExample();
        String dayy = "day1";
        DayTask dayNum = DayTask.day1;

        switch (dayNum) {
            case day1 -> System.out.println("Learn it now");
            case day2 -> System.out.println("ok");
            case day3 -> System.out.println("week is finished");
        }


    }
}