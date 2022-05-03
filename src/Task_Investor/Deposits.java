package Task_Investor;

import java.io.IOException;
import java.util.Scanner;

public class Deposits {
    public static void main(String[] args) throws IOException {
        Boolean accessInvestor = false;
        String strind;//  - идентификация клиента
        Security ide = new Security();
        Investor inv = new Investor();
        Scanner newind = new Scanner(System.in); //menu for new/old clients
        Scanner oldind = new Scanner(System.in);
        Scanner scanind = new Scanner(System.in);
        Scanner casescan = new Scanner(System.in);

        System.out.println("Are You a new Client? insert 1 or 0 " + '\n' + "yes - 1  no - 0;  ");
        int newintind = newind.nextInt();
        if (newintind == 1) {
            strind = ide.newClient(newintind);
//            System.out.println("newClient(newstrind) " + ide.newClient(newstrind));//newClient(newstrind);
            //ide.setIdent(strind);
            System.out.println("Присвоение имени нового клиента strind = " + strind);
        } else if (newintind == 0) {
            String s = ide.readId();
            //System.out.println("s = " + s);
            ide.setIdent(s);
            //System.out.println("record users" + ide.readId(newstrind));
            //System.out.println("oldClient(newstrind) " + ide.oldClient(newintind));
            System.out.println("Выбирите вид операции: " + '\n' +'\n' + "внести деньги на счет  - 1");
            System.out.println("снять деньги со счета  - 2");
            System.out.println("открыть вклад          - 3" );
            System.out.println("закрыть вклад          - 4");
                int insoperat = casescan.nextInt();
                switch (insoperat){
                    case 1:
                        inv.putcash();    //put money
                        break;
                    case 2:
                        inv.takecash();  //taken money
                        break;
                    case 3:
                        inv.opendeposit();
                        break;
                    case 4:
                        inv.closedeposit();
                        break;
                    default:
                        break;
                }
          }
    }
}