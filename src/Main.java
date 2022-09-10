public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();task2();task3();task4();task5();
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
            // Задача 2.1
            int investment = 15000;
            for(int i = 1; investment <= 12_000_000; i++){
                investment = investment + investment*7/100;
                System.out.println(" Месяц " + i + " Сумма накоплений " + investment);
            }
            }

            public static void task3(){

                // Задача 2.2
                int investment = 15000;
                for(int i = 1; investment <= 12_000_000; i++) {
                    investment = investment + investment * 7 / 100;
                    if (i % 6 == 0) {
                        System.out.println(" Месяц " + i + " Сумма накоплений " + investment);
                    }
                }
    }
    public static void task4(){
        // Задача 2.3
        int investment = 15000;
        int month = 9*12;
        for(int i = 1;i <= 108 ; i++) {
            investment = investment + investment * 7 / 100;
            if (i % 6 == 0) {
                System.out.println(" Месяц " + i + " Сумма накоплений " + investment);
            }
        }
        // Задача 2.4

        for(int i = 2; i < 31 ; i = i +7) {
                System.out.println(" Сегодя пятница " + i + " число, необходимо подготовить отчет " );}
    }
    public static void task5() {
        // Задача 3.1

        for (int i = 0; i < 2100; i = i +79) {
                if (i > 1822 && i < 2122) {
                System.out.println(i);
            }
            }
            // Задача 3.2
        int a = 2;
        for (int b = 1; b < 10; b++){


            System.out.println(a);
        }





    }
}