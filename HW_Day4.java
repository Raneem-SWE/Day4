import java.util.Scanner;
public class HW_Day4 {
    public static void main(String[]arg){
    //Ex1
    int []  num={50,60,40,10,38,65,87,56,90,100,66,80,88,40,98};
        for (int n:num) {
            if(n>=90 && n<=100){
                System.out.println(n+ "  A");
            } else if (n>=80 && n<=89) {
                System.out.println(n+"  B");
            } else if (n>=70 && n<=79) {
                System.out.println(n+" C");
            } else if (n>=60 && n<=69) {
                System.out.println(n+"  D");
            }else{
                System.out.println(n+" fail");
            }
        }
    //Ex2
        String [] Name ={"Shaza","Mohamed","Asmaa","Anfal","Yousra","Amin","Radwa","Yasmeen"};
        for (String N:Name) {
            if(N.startsWith("A")){
                System.out.println(N);
            }

        }
    //Ex3
        int []  number={50,60,40,10,38,65,87,56,90,100,66,80,88,40,98};
        for (int n2:number) {
            if(n2>=50){
                System.out.println(n2);
            }
        }
    //Ex4
       int [] number2={5,7,8,1,4,6,9};

        Scanner s=new Scanner(System.in);
        System.out.println("inter your num");
        int check=s.nextInt();
        for (int n2:number2 ) {
            if(n2==check){
                System.out.println("  you have this number in Array");
            }else {
                System.out.println("you do not have this number in Array");
                break;
            }

        }

    }
}
