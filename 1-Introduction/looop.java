package Introduction;

public class looop {
    public static void main(String[] args) {
        for(int i = 1; i<=10;i++){
            System.out.print(i+" ");
            if(i==5)
                break;
        }

        System.out.println();

        int i = 0;
        while(i<10){
            i++;
            if(i==5)
                continue;
            System.out.print(i+" ");
        }

        System.out.println();
        i = 1;
        do{
            System.out.print(i+" ");
            i++;
        }while(i<=10);
    }
}
