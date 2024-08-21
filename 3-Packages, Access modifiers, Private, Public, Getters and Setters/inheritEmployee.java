class employee{
    int basic_salary = 30000; 
}

class programmer extends employee{
    int bonus = 15000;
}

public class inheritEmployee {
    public static void main(String[] args) {
        programmer p = new programmer();
        System.out.println("Salary of programmer after bounus is "+(p.basic_salary+p.bonus));
    }
}
