package Task_Investor;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Security {
    Boolean accessInvestor = false;
    String newind;
    String oldind;

    Scanner newname = new Scanner(System.in);
    Scanner tryscanind = new Scanner(System.in);

    String line;
    private String ident; //New Investor has to have identification.
    private String pincode; //Pin code for access to operation.

    public String getIdent() {
        return ident;
    }

    public String getPincode(String pin) {
        pincode = pin;
        return pincode;
    }

    public void setIdent(String id) {
        this.ident = id;
    }

    public void setPincode(String pin) {
        this.pincode = pin;
    }

    public String newClient(int par) {
        par = par;

        System.out.println("Tape your name for Registration: ");
        newind = newname.nextLine();
        recordId(newind);
        return newind;


    }

    public String oldClient(int par) {
        //String se = getIdent();
        //se = se.trim();

        //System.out.println("se = " + se.length());
        par = par;
        int i = 0;
        System.out.println("ident = " + ident);
        do {
            if (i == 4) {
                System.out.println("Your account has blocked." + '\n' + "you made a mistake more than 3 times.");
                break;
            }
            if (i == 0)
                System.out.println("Tape your Identification: ");
            else System.out.println("You are wrong. Tape your Identification: ");
            oldind = tryscanind.nextLine();
            //System.out.println("oldind  =  " + oldind.length());
            //System.out.println("ident   = " + se.length());
            i++;
        }
        while (oldind.intern() == ident);  // while (trystrind.intern() != ident);
        System.out.println("getIdent() = " + getIdent());
        return oldind;
    }

    public void recordId(String recind) {
        String rind = recind;
        try (FileOutputStream fos = new FileOutputStream("D:/Frontend/frontend_wk/JavaAndroid/gr_336/in_out/security_id.txt")) {
            // перевод строки в байты
            byte[] buffer1 = rind.getBytes();

            fos.write(buffer1, 0, buffer1.length);

            System.out.println("The Registration was successful");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    /*public String readId(int newstrind) throws IOException {
        int par = newstrind;
        String reind;
        //String line = null;
        BufferedReader reader = null;
        try {
            File file = new File("D:/Frontend/frontend_wk/JavaAndroid/gr_336/in_out/security_id.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            reader = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            String line = reader.readLine();
            // считаем сначала первую строку
            //line = reader.readLine();
            //System.out.println(line);
            while (line != null) {
                // считываем остальные строки в цикле
                sb.append(line);
                sb.append(System.lineSeparator());
                line = reader.readLine();
            }
            String everything = sb.toString();
            everything = everything.trim();
            return everything;
        } finally {
            reader.close();
        }


    }
*/
    public String readId() throws IOException {
        String fileName = "D:/Frontend/frontend_wk/JavaAndroid/gr_336/in_out/security_id.txt";
        String content = Files.lines(Paths.get(fileName)).reduce("", String::concat);
        System.out.println("content = " + content);
        return content;
    }






}