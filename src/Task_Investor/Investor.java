package Task_Investor;

import java.util.Scanner;

public class Investor {
    Scanner tkn = new Scanner(System.in);
    String amnttkn;
    Scanner put = new Scanner(System.in);
    String amntput;
    Scanner opdep = new Scanner(System.in);
    String amntopendep;
    Scanner cldep = new Scanner(System.in);
    String amntclosedep;
    public void takecash(){
        System.out.println("access your amount  ");
        amnttkn = tkn.nextLine();
        System.out.println("Taken your cash " + amnttkn);
    }

    public void putcash(){
            System.out.println("access your amount  ");
            amntput = put.nextLine();
            System.out.println("Put your cash " + amntput);
    }

    public void opendeposit() {
        System.out.println("access your amount  ");
        amntopendep = opdep.nextLine();
        System.out.println("You are opened the deposit " + amntopendep);

    }

    public void closedeposit() {
        System.out.println("access your amount  ");
        amntclosedep = cldep.nextLine();
        System.out.println("You are opened the deposit " + amntclosedep);

    }
}

