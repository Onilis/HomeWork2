public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        System.out.println();

        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 10;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        System.out.println();

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;;
        var massDifference = boxer2 - boxer1;
        System.out.println("Общая масса боксеров: "+ totalWeight);
        System.out.println("Разница между массами бойцов: "+ massDifference);
        System.out.println();

        var remainder = boxer2 % boxer1;
        System.out.println("Остаток от деления: "+ remainder);

        var totalHours = 640;
        var oneEmployee = 8;
        var totalEmployees = totalHours/oneEmployee;
        System.out.println("Всего работников в компании: "+totalEmployees);
        System.out.println();

        var allEmployee = totalEmployees + 94;
        var allHours = allEmployee * oneEmployee;
        System.out.println("Если в компании работает: "+ allEmployee + "человек, то всего: "+ allHours + "часов работы может быть поделено между сотрудниками");

    }
}