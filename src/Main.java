public class Main {
// Проверьте ДЗ
    public static void main(String[] args) {
           task1();
           task2();
           task3();
           task4();
           task5();
           task6();
           task7();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человек равен " + age + " он совершенно летний. ");
        } else
        {System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия," +
                    " нужно немного подождать. ");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");

        int degree = 5;
        if (degree <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");

        int speed = 60;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить шраф ");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно ");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");

        int ageMan = 30;

        if (ageMan < 2 ) {
            System.out.println("Если возраст человека равен " + ageMan + " то ему пора спать ");
        } else
            if (ageMan >= 2 && ageMan <= 6) {
            System.out.println("Если возраст человека равен " + ageMan + " ему нужно ходить в детский сад ");
        } else
            if (ageMan >= 7 && ageMan <= 18) {
            System.out.println("Если возраст человека равен " + ageMan + " ему нужно ходить в школу ");
        } else
            if (ageMan >= 18 && ageMan <= 24) {
            System.out.println("Если возраст человека равен " + ageMan + " то его место в университете ");
        } else
            if (ageMan > 24) {
            System.out.println("Если возраст человека равен " + ageMan + " то ему пора ходить на рабоут ");
        } else {
            System.out.println("Если возраст человека равен " + ageMan + " то он может отдохнуть");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");

        int age = 4;
        boolean canRideRides = age <= 5;
        if (canRideRides) {
            System.out.println("Если возраст ребенка равен " + age + " то но не может кататься на актракционе ");
        }
        boolean toRideAnAdult = age >= 5 && age <= 14;
        if (toRideAnAdult) {
            System.out.println("Если возраст ребенка равен " + age + " то он может кататсья в сопоровождении" +
                    "взрослого. Если взрослого нет, то кататься нельзя." );
        }
        boolean canRideAlone = age >= 14;
        if (canRideAlone) {
            System.out.println("Если возраст ребенка равен " + age + " то он может кататься без сопровождения ребенкау");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");

        int capacityOfOneWagon = 90;
        if (capacityOfOneWagon > 102) {
            System.out.println("Вагон забит");
        } else {
            System.out.println("В вагоне есть место");
        }
        if (capacityOfOneWagon <= 102 && capacityOfOneWagon <= 60){
            System.out.println("Вы поедете стоя");
        }
        if (capacityOfOneWagon >= 102 && capacityOfOneWagon >60){
            System.out.println("Вы поедете сидя");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");

        int one = 111;
        int two = 222;
        int three = 333;

        if(one >= two && one >= three) {
            System.out.println(one);
        } else if (two >= one && two >= three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}


