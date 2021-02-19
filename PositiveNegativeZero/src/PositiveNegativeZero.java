public class PositiveNegativeZero {

    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("positive");
        } else if(number < 0){
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){ return -1;} else{ return (long) (kilometersPerHour * 0.62137);}
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("invalid value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
