public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static int checkYear(int year) {
        if (year < 1584) {
            System.out.println(year + " год не определен");
        } else if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        return year;
    }

    public static void task1() {
        int year = 1600;
        checkYear(year);
    }

    public static int checkYearForUpdate(boolean clientOS2015, int year) {
        if (clientOS2015) {
            if (year < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (!clientOS2015) {
            if (year < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        return year;
    }

    public static void task2() {
        boolean clientOS2015 = false;
        int year = 2000;
        checkYearForUpdate(clientOS2015, year);
    }

    public static int countDays(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance <= 60 && deliveryDistance > 20) {
            day++;
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance <= 100 && deliveryDistance > 60) {
            day = day + 2;
            System.out.println("Потребуется дней: " + day);
        } else {
            System.out.println("Доставки нет");
        }
        return day;
    }

    public static void task3() {
        int deliveryDistance = 95;
        countDays(deliveryDistance);
    }
}
