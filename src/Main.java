public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Потер", 100, 100, 73, 48, 44),
                new Gryffindor("Гермиона Грейнджер", 60, 50, 74, 90, 100),
                new Gryffindor("Рон Уизли", 29, 48, 70, 10, 46)
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 20, 34, 67, 23, 67, 87, 100),
                new Slytherin("Грэхэм Монтегю", 49, 45, 67, 89, 98, 22, 78),
                new Slytherin("Грегори Гойл", 37, 45, 18, 59, 89, 44, 55)
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 45, 23, 90, 56, 400),
                new Hufflepuff("Седрик Диггори", 38, 59, 222, -90, 56),
                new Hufflepuff("Джастин Финч-Флетчли", 37, 70, 45, 87, 44)
        };
        Kogtervan[] kogtervans = {
                new Kogtervan("Чжоу Чанг", 49, 34, 56, 7),
                new Kogtervan("Падма Патил", 48, 29, 60, 70),
                new Kogtervan("Маркус Белби", 39, 80, 99, 50)
        };

        System.out.println(hufflepuffs[0].toString());
        System.out.println(gryffindors[1].equalsPersonPower(slytherins[0]));
        System.out.println(kogtervans[0].equalsPowerFaculty(kogtervans[2]));

    }
}