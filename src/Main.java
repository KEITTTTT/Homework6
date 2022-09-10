public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();task2();
    }
    public static void task1(){
        // Задача 1
        int salary = 29000;
        int total = 0;
        int i = 0;
        for ( ; total < 2_459_000; i ++ ) {
            total = total + total / 100;
            total = total + salary;
            System.out.println(" Месяц " + i + " Сумма накоплений равна " + total + " рублей");
        }
        // Задача 2
        int a = 0;
        while(a < 10) {
            a = a + 1;
            System.out.println(a);
        }
        for(int b = 10; b >= 1; b = b-1 ) {
            System.out.println(b);
        }
        // Задача 3
        int birth = 17;
        int death = 8;
        int people = 12_000_000;
        for(int year = 1; year <=10; year++){
            int birthRate = birth*people/1000;
            int mortality = death*people/1000;
            people = people + birthRate - mortality;
           System.out.println( " Год " + year + " Численность населения составляет " + people);
        }

        }
        public static void task2(){
            // Задача 1


    }

}