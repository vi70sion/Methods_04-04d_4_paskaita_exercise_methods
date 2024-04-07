
public class Main {
    public static void main(String[] args) {

        //1.
        Method method = new Method();
        method.yearConversion(16);
        System.out.println("Siuo metu yra " + method.hour() + " val. ir " + method.minute() + " min.");
        System.out.printf("Tai yra " + (method.hour()*60 + method.minute()) + " minuciu arba ");

        //2.
        System.out.println(((method.hour()*60 + method.minute())*60) + " sekundziu.");
        System.out.println();

        //3.
        int averageMonthBooks = (int)(Math.random()*50);
        int averageYearVisitors = (int)(Math.random()*50);
        System.out.println("Vidutiniskai per menesi perskaitoma " + averageMonthBooks + " knygu.");
        System.out.println("Vidutiniskai per metus apsilanko " + averageYearVisitors + " lankytoju.");
        System.out.println("Vienas lankytojas per menesi vidutiniskai perskaito :" + method.averageOfBooks(averageMonthBooks, averageYearVisitors) + " knygu.");
        System.out.println();

        //4.
        int travelers = (int)(Math.random()*100);
        int notToVilnius = (int)(Math.random()*50);
        int carriages = (int)(Math.random()*10); //no protection division from zero
        System.out.println("Traukinio keleiviu skaicius: " + travelers);
        System.out.println("Vyksta ne i Vilniu " + notToVilnius + " keleiviu");
        System.out.println("Traukinys turi " + carriages + " vagonu");
        System.out.println("Vidutiniskai viename vagone vyksta " + method.travelersToVilnius(travelers, notToVilnius, carriages));
        System.out.println();

    }
}