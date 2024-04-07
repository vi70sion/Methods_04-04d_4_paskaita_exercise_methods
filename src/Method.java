import java.time.LocalDateTime;

public class Method {
    public void yearConversion(int year) {
        System.out.println(year + " metu yra: " + (int)(year*365/30.4) + " menesiu, " + year*365 + " dienu, " + year*365*24 + " valandu.");
    }
    public int hour(){
        return LocalDateTime.now().getHour();
    }
    public int minute(){
        return LocalDateTime.now().getMinute();
    }
    public int averageOfBooks(int v, int n){
        int k = v * 12 / n;
    return k;
    }
    public int travelersToVilnius(int n, int m, int v){
        int k = (n - m)/v;
    return k;
    }

}
