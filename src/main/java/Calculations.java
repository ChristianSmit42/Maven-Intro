public class Calculations {

    public static int add(int a,int b){
        return a+b;
    }

    public static String coronaCount(int a){
        if(a<=30){
            return "OK";
        }
        return "LIMIT ÜBERSCHRITTEN!";
    }
}
