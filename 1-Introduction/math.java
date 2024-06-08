package Introduction;
public class math {
    public static void main(String[] args) {
        
        double squreroot = Math.sqrt(25.45);
        double cuberoot = Math.cbrt(36);
        double power = Math.pow(2,3);

        int maxNum = Math.max(2, 10);
        int minNum = Math.min(Math.min(1,2),3);

        int randomValue = (int) Math.round(Math.random()*10);
        System.out.println(randomValue);
    }
}
