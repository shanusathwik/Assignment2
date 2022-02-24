package Practice;

import java.util.Scanner;

public class CaseSwitchCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What Operation want to Perform ");
        System.out.println("1 = Addition"+" 2 = Subtraction"+ " 3 = multiplication"+" 4 = division"+" 5 = Modulus"+" 6 = Trignometric Fuctions");
        int Function= sc.nextInt();
        if(Function<=5)
        {
            Scanner sc2 =new Scanner(System.in);
            System.out.println("enter the value of first integer");
            int a= sc2.nextInt();
            Scanner Sc3=new Scanner(System.in);
            System.out.println("enter the value of second integer");
            int b= Sc3.nextInt();

            switch (Function) {

                case 1:
                {
                    //Addition
                    int c;
                    c = a + b;
                    System.out.println("the Addition of 2 numbers is " + c);
                    break;
                }
                case 2:
                {
                    //subtraction
                    int c;
                    c = a - b;
                    System.out.println("the subtraction of 2 numbers is " + c);
                    break;
                }
                case 3:
                {
                    //multiplication
                    int c;
                    c = a * b;
                    System.out.println("the multiplication of 2 numbers is " + c);
                    break;
                }
                case 4:
                {
                    //division
                    int c;
                    c = a / b;
                    System.out.println("the division of 2 numbers is " + c);
                    break;
                }
                case 5:
                {
                    //modules
                    int c;
                    c = a % b;
                    System.out.println("the modulues of 2 numbers is " + c);
                    break;
                }
                default:
                    break;
            }
        } else {
            {
                Scanner sc1=new Scanner(System.in);
                System.out.println("enter the Trignometric function");
                System.out.println(" 1 = sin"+"  2 = cos"+"  3 = tan"+" 4 = cot");

                int aa= sc1.nextInt();
                Scanner sc2=new Scanner(System.in);
                System.out.println("enter the degrees");
                double n= sc1.nextDouble();


                switch (aa) {
                    case 1:
                        Double vv = (Math.toRadians(Math.sin(n)));
                        System.out.println("the sin of " + n+ " is " + vv);
                        break;
                    case 2:
                        Double vvv = (Math.toRadians(Math.cos(n)));
                        System.out.println("the cos of " + n + " is " + vvv);
                        break;
                    case 3:
                        Double xx = (Math.toRadians(Math.tan(n)));
                        System.out.println("the tan of " + n + " is " + xx);
                        break;
                    case 4:
                        Double vvx = (Math.toRadians(Math.cos(n) / Math.sin(n)));
                        System.out.println("the cot of " + n + " is " + vvx);
                        break;
                    default:
                        break;



                }

            }


        }

    }

