import java.util.Random;

public class HW2 {
    public static String permission(int age, int temperature) {
        String s = "Можно идти гулять ";
        if ((age > 20 && age < 45) && (temperature > -20 && temperature < 30)) {
            return s;
        } else if ((age > 20) && (temperature >= 0 && temperature < 28)) {
            return s;
        } else if (age > 45 && (temperature >= -10 && temperature < 28)) {
            return s;
        } else {
           return "Оставайтесь дома ";
        }
    }
    public static int generatorRandomAge () {
        Random random = new Random();
        int number = random.nextInt(70)+1;
        return number;
    }
    public static int generatorRandomTemperature () {
        Random random = new Random();
        int number = random.nextInt(45);
        return number;
    }
    public static void main(String[] args) {
        System.out.println(permission(generatorRandomAge(), generatorRandomTemperature()));
        System.out.println(permission(generatorRandomAge(), generatorRandomTemperature()));
        System.out.println(permission(generatorRandomAge(), generatorRandomTemperature()));
        System.out.println(permission(generatorRandomAge(), generatorRandomTemperature()));
        System.out.println(permission(generatorRandomAge(), generatorRandomTemperature()));
    }
}
