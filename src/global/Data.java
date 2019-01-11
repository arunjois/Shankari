package global;

public class Data {
    public static double dd,mm,yyyy;
    public static double hours, min;
    public static String country, place;
    public static double longitude,latitude;
    Data(double day,double mon,double year,
         double hrs,double mins, String cou, String loc,
         double lon, double lati) {
        this.dd = day;
        this.mm = mon;
        this.yyyy = year;
        this.hours = hrs;
        this.min = mins;
        this.country = cou;
        this.place = loc;
        this.longitude = lon;
        this.latitude = lati;

    }
}
