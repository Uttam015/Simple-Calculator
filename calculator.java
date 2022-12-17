import java.util.Scanner;

public class calculator {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int ans=0;
        while(true){
            System.out.println("enter the operator");
            char op=in.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){

                System.out.println("enter 2 numbers");

                int a=in.nextInt();
                int b=in.nextInt();
                System.out.println();
                if(op=='+'){
                    ans=a+b;
                }
                if(op=='-'){
                    ans=a-b;
                }
                if(op=='*'){
                    ans=a*b;
                }
                if(op=='/'){
                    if(b!=0){
                        System.out.println("enter correct value");
                    }
                    ans=a/b;
                }
                if(op=='%'){
                    ans=a%b;
                }
            }else if(op=='x'||op=='X'){
                break;
            } else{
                System.out.println("invalid operator");

            }
            System.out.println(ans);
        }


    }
}
