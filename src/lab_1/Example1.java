package lab_1;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

    public class Example1 {

        //Лаболаторная №1
        public static void main(String[] args) {
            class InsNum {
                public int insNumb;
                public int insNumb1;
                public int insNumb2;
                public int insNumb3;
            }
            // inputNumber();
            //System.out.println("You`are typing number = " + insNumb1);


            InsNum num_int = new InsNum();
            for (int i = 1; i <= 3; i++) {
                Scanner scanner = new Scanner(System.in);

                switch (i) {
                    case 1 -> {
                        System.out.println(i + "=    Введите первое число =");
                        num_int.insNumb1 = scanner.nextInt();
                    }
                    case 2 -> {
                        System.out.println(i + "=     Write second number");
                        num_int.insNumb2 = scanner.nextInt();
                    }
                    case 3 -> {
                        System.out.println(i + "=     Write third number");
                        num_int.insNumb3 = scanner.nextInt();
                    }
                    default -> {
                    }
                }

                //return (InsNum.insNumb1 + InsNum.insNumb2 + InsNum.insNumb3);
            }

            //public void summTotal(int num1,int num2,int num3){
            num_int.insNumb = num_int.insNumb1 + num_int.insNumb2 + num_int.insNumb3;
            System.out.println("Total  = " + num_int.insNumb );
            //}


        }
    }
        //InputStream inputStream = System.in;
            //Reader inputStreamReader = new InputStreamReader(inputStream);
            //BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


    /*    public static int scan() {
            System.out.println("Insert number1");
            Scanner = new Scanner(System.in);
            insNumb1 = scnner.nextInt();
            return insNumb1;


    }
*/


