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

    public static int countByAlert(String a){
        switch (a){
            case "gruen":
                return 60;
            case "gelb":
                return 30;
            case "rot":
                return 0;
            default:
                return 0;
        }
    }

    public static int faculty(int n){
        assert n >=0;
        int faculty = 1;
        for(int i=2;i<=n;i++){
            faculty *= i;
        }
        return faculty;
    }
}
