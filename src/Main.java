public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        /*
        В программе IDEA в новом созданном вами проекте присвойте:
        переменной dog значение 8.0;
        переменной cat значение 3.6;
        переменной paper значение 763789.
        Выведите значения каждой переменной в консоль.
        /*/
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2() {
        System.out.println("Задача 2");
        /*
         Увеличьте значение каждой перечисленной в прошлой задаче переменной на 4. Для решения этой задачи используйте тип переменной var.
         Выведите в консоль новые значения переменных.
         */
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3() {
        /*
        Теперь нужно уменьшить значение каждой переменной:
        dog уменьшить на 3.5;
        cat уменьшить на 1.6;
        paper уменьшить на 7639.
        Выведите в консоль новые значения переменных. Для решения этой задачи используйте тип переменной var.
         */
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 4;
        cat = cat - 4;
        paper = paper - 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
}