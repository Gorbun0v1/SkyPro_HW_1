public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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
        System.out.println("Задача 3");
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

    public static void task4() {
        System.out.println("Задача 4");
        /*Инициализируйте (присвойте значение) переменную friend значением 19.
          Увеличьте значение переменной на 2, после чего поделите значение на 7.
          После каждой операции выводите значение переменной в консоль. В итоге у вас должно быть выведено 3 значения одной переменной.
          Для решения этой задачи используйте тип переменной var.
         */
        var friend = 19;
        friend = friend + 2;
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Задача 5");
        /*  Инициализируйте переменную frog значением 3.5.

Увеличьте переменную в 10 раз и поделите на 3.5. Добавьте к последнему значению переменной 4.

После каждой операции выводите значение переменной в консоль. В итоге у вас должно быть выведено 4 значения одной переменной.

Для решения этой задачи используйте тип переменной var.

    */
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);


    }
    public static void task6() { System.out.println("Задача 6");
        /*
       В боксе перед каждым боем спортсменов взвешивают. Это делают для того, чтобы убедиться, что боксеры соответствуют своей весовой категории и бой будет честным.

Вес одного боксера — 78.2 кг.

Вес второго боксера — 82.7 кг.

Подсчитайте и выведите в консоль общий вес двух бойцов.

Подсчитайте и выведите в консоль разницу между весами бойцов. Для решения этой задачи используйте тип переменной var.
*/
        var sportman1 = 78.2;
        var sportman2 = 82.7;
        var allsportman = sportman1 + sportman2;
        System.out.println("Вес двух спортсменов равен " + allsportman + " кг");
        var allsportman2 = sportman2 - sportman1;
        System.out.println("Разница между весами спортсменов " + allsportman2 + " кг");


    }
    public static void task7() {
        System.out.println("Задача 7");
        /*Вычислите разницу весов спортсменов, используйте 2 способа:

 Вычитание из большего веса меньшего.
 С помощь функции остаток от деления.

         */

        var sportman1 = 78.2;
        var sportman2 = 82.7;
        var allsportman = sportman2 - sportman1;
        var allsportmna2 = sportman2 % sportman1;
        System.out.println("Вычитание из большего веса меньшего = " + allsportman);
        System.out.println("С помощью функции остаток от деления = " + allsportmna2);

    }
    public static void task8() {
        System.out.println("Задача 8");
        /*
        Решите задачу с помощью функций сложения, вычитания, умножения и деления.

 640 часов работы поделено между сотрудниками. Если каждый сотрудник посвящает работе 8 часов, то сколько всего работников в компании? Выведите результат задачи в консоль в формате: «Всего работников в компании — … человек».
 Посчитайте, сколько часов работы должно быть поделено между сотрудниками, если в компании работает на 94 человека больше. Выведите результат задачи в консоль в формате: «Если в компании работает … человек, то всего … часов работы может быть поделено между сотрудниками».
         */
        var alltime = 640;
        var peopletime = 8;
        var people = alltime / peopletime;
        System.out.println("Всего работников в компании - " + people + " человек");
        var peopleV2 = people + 94;
        var peopleTimev2 = peopletime * peopleV2;
        System.out.println("Если в компании работает "+ peopleV2 +" человек, то всего " + peopleTimev2 + " часов работы может быть поделено между сотрудниками ");



    }
}