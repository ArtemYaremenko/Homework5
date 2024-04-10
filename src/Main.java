public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("\nTask 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Task 2
        System.out.println("\nTask 2");
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Task 3
        System.out.println("\nTask 3");
        int year = 2024;
        if (year > 1584 && year % 4 == 0) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }

        //Task 4
        System.out.println("\nTask 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка в пределах " + deliveryDistance + " км занимает сутки");
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка в пределах " + deliveryDistance + " км занимает 2 суток");
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка в пределах " + deliveryDistance + " км занимает 3 суток");
        }
        else if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет");
        }

        //Task 5
        System.out.println("\nTask 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}