public class Main {
    public static void main(String[] args) {
        type1();
        type2();
        type3();
        type4();
        type5();
        type6();
        type7();
    }

    public static void type1() {
        System.out.println("Задание 1");
        /*
        С помощью условного оператора напишите программу, которая выводит в консоль:

сообщение о том, что человеку 18 или больше лет;
сообщение, что возраст совершеннолетия еще не наступил и нужно немного подождать.
При выполнении каждого условия программа должна выводить в консоль сообщение в формате: «Если возраст человека равен …, то (вывести в зависимости от результата) он совершеннолетний / он не достиг совершеннолетия, нужно немного подождать».
         */
        int age = 7;
            if (age >= 18) {
            System.out.println("Человеку 18 или больше лет");
        }
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " , он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void type2() {
        System.out.println("Задание 2");
        int C = 3;
        if (C >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
    }
    public static void type3() {
        System.out.println("Задание 3");
        int speed = 63;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }
    }

    public static void type4() {
        System.out.println("Задание 4");
        int age = 13;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age +" , то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age +" , то ему нужно ходить в школу.");
        }else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age +" , то его место в университете.");
        }else if (age > 24) {
            System.out.println("Если возраст человека равен " + age +" , то ему пора ходить на работу.");
        }
    }
    public static void type5() {
        System.out.println("Задание 4");
        int age = 7;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age +" , то он не может кататься на аттракционе.");
        } else if (age >= 7 && age <= 14) {
            System.out.println("Если возраст человека равен " + age +" , то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }else if (age > 14) {
            System.out.println("Если возраст человека равен " + age +" , то он может кататься без сопровождения взрослого.");
        }
    }
    public static void type6() {
        System.out.println("Задание 6");
        int people = 102;
        int sidichie = 60;
        int ludei = 55;
        if (ludei >= people) {
            System.out.println("Свободных мест нету");
        } else if (ludei >= sidichie) {
            System.out.println("Сидячих мест нету");
        }else {
            System.out.println("Есть сидячие места");
        }
    }
    public static void type7() {
        System.out.println("Задание 7");
        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two) {
            if (one > three) {
                System.out.println(one);
            }else {
                System.out.println(three);
            }
        }
        if (two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}