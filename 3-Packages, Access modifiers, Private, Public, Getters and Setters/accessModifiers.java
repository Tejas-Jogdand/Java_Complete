class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age<=0 || age<120)
            this.age = 0;
        else
        this.age = age;
    }
    

    public int getAge() {
        return age;
    }
}

public class accessModifiers {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setAge(28);
        obj.setName("Tejas");

       System.out.println(obj.getAge());
       System.out.println(obj.getName());
    }
}
