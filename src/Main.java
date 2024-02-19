public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        short bananas = 200;
        System.out.println("Бананов " + bananas + " кг");

        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println("Одна порция сахара весит " + onePortion + " кг");

        byte a = 1;
        short b = 1;
        int c = 1;
        int d = a + b + c;
        System.out.println(d);

        float g = a + 1f;
        System.out.println(g);

        int h = 10000;
        System.out.println(h);
        byte i = 10;
        System.out.println(i);
        short k = 10000;
        System.out.println(k);
        long f = 10000;
        System.out.println(f);
        float e = 10.8f;
        System.out.println(e);
        double j = 1.1d;
        System.out.println(j);

        float l = 27.12f;
        System.out.println(l);
        long o = 987678965549L;
        System.out.println(o);
        double r = 2.786d;
        System.out.println(r);
        int m = 569;
        System.out.println(m);
        short w = -159;
        System.out.println(w);
        int t = 27897;
        System.out.println(t);
        byte s = 67;
        System.out.println(s);

        short lp = 23;
        System.out.println("Учеников у Людмилы Павловны " + lp + " человека");
        byte as = 27;
        System.out.println("Учеников у Анны Сергеевны " + as + " человек");
        int ea = 30;
        System.out.println("Учеников у Екатерины Андреевны " + ea + " человек");

        short totalSheets = 480;
        System.out.println("Всего бумаги на три класса " + totalSheets + " листов");

        int sheets = totalSheets / (lp + as + ea);
        System.out.println("На каждого ученика рассчитано " + sheets + " листов бумаги");

        int bottles = 16;
        System.out.println("Всего " + bottles + " бутылок");
        short time = 2;
        System.out.println("Время изготовления " + time + " минуты");

        int performance = bottles / time;
        System.out.println("Количество произведенных бутылок за одну минуту " + performance + " штук");

        short tiem1 = 20;
        System.out.println("Время изготовления " + tiem1 + " минут");

        int performance1 = tiem1 / time * bottles;
        System.out.println("За " + tiem1 + " минут машина произвела " + performance1 + " штук бутылок");

        short time2 = 24;
        System.out.println("Время изготволения " + time2 + " часа");

        int performance2 = performance1 * 3 * time2;
        System.out.println("За " + time2 + " часа машина произвела " + performance2 + " штук бутылок ");

        short time3 = 3;
        System.out.println("Время изготовления " + time3 + " дня");

        int performance3 = performance2 * 3;
        System.out.println("За " + time3 + " дня машина произвела " + performance3 + " штук бутылок ");

        short time4 = 1;
        System.out.println("Время изготовления " + time4 + " месяц");

        int performance4 = performance3 * 10;
        System.out.println("За " + time4 + " месяц машина произвела " + performance4 + " штук бутылок");

        byte paint = 120;
        System.out.println("Необходимо " + paint + " банок краски двух цветов");

        byte white = 2;
        byte brown = 4;
        System.out.println("На один класс уходит " + white + " банки белой и " + brown + " банки коричневой краски");

        int oneClassroom = white + brown;
        System.out.println("На один учебный класс необходимо " + oneClassroom + " банок краски");

        int numberOfClasses = paint / oneClassroom;
        System.out.println("Всего учебных классов " + numberOfClasses + " штук");

        int amountOfWhite = numberOfClasses * white;
        int amountOfBrown = numberOfClasses * brown;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + amountOfWhite + " банок белой краски и " + amountOfBrown + " банок коричневой краски");

        int banana = 5;
        int milk = 2;
        int iceCreamPlombir = 2;
        int eggs = 4;
        System.out.println("Для завтрака необходимо " + banana + " штук бананов, " + milk + " мл молока, " + iceCreamPlombir + " брикета мороженого-пломбир и " + eggs + " яйца");

        int bananaGm = 80;
        int milkMl = 105;
        int iceCreamPlombirGm = 100;
        int eggsGm = 70;
        System.out.println(bananaGm + " грамм бананов, " + milkMl + " мл молока " + iceCreamPlombirGm + " грамм пломбира" + eggsGm + " грамм яиц");

        int numberOfBananas = bananaGm *banana;
        int numberOfMilk = milkMl * milk;
        int numberOfIceCreamPlombir = iceCreamPlombirGm * iceCreamPlombir;
        int numberOfEggs = eggsGm * eggs;
        System.out.println("Всего для завтрака необходимо " + numberOfBananas + " грамм бананов " + numberOfMilk + " грамм молока " + numberOfIceCreamPlombir + " грамм пломбира " + numberOfEggs + " грамм яиц");

        int totalwWeightGm = numberOfBananas + numberOfMilk + numberOfIceCreamPlombir + numberOfEggs;
        float totalwWeightKg= totalwWeightGm/1000f;
        System.out.println("Общее количество в граммах - " + totalwWeightGm + "грамм" + " и в килограммах - " + totalwWeightKg + " кг");

        int overweight = 7000;
        int loss1 = 250;
        int loss2 = 500;
        int inDay250= overweight/loss1;
        int inDay500= overweight/loss2;
        System.out.println("При похудении на 250 грамм в день потребуется " + inDay250 + " дней, а при похудении на 500 грамм в день потребуется " + inDay500 + " дней");

        int Masha1 = 67760;
        int Denis1 = 83690;
        int Kristina1 = 76230;
        double Masha2 = Masha1*1.1d;
        double Denis2 = Denis1*1.1d;
        double Kristina2 = Kristina1*1.1d;
        double differenceMasha = (Masha2-Masha1)*12;
        double differenceDenis = (Denis2-Denis1)*12;
        double differenceKristina = (Kristina2-Kristina1)*12;
        System.out.println("Маша теперь получает " + Masha2 + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + Denis2 + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + Kristina2 + " рублей. Годовой доход вырос на " + differenceKristina + " рублей");


    }
}
