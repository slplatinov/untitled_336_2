package lab_8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.*;
import java.nio.file.StandardOpenOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class File_out_in {



        public static void main(String[] args) {
            String text1 = "Hello world!"; // строка для записи
            String text2 = "Windsurfing forever!"; // строка для записи
            try (FileOutputStream fos = new FileOutputStream("D:/Frontend/frontend_wk/JavaAndroid/gr_336/in_out/notes1.txt")) {
                // перевод строки в байты
                byte[] buffer1 = text1.getBytes();

                fos.write(buffer1, 0, buffer1.length);

                System.out.println("The file1 has been written");
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }

            try (FileOutputStream fos = new FileOutputStream("D:/Frontend/frontend_wk/JavaAndroid/gr_336/in_out/notes2.txt")) {
                // перевод строки в байты
                byte[] buffer2 = text2.getBytes();

                fos.write(buffer2, 0, buffer2.length);

                System.out.println("The file2 has been written");
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }


            //______________________________________________________
            //_____ copy___paste

       /*     try(FileInputStream fin=new FileInputStream("D:/Frontend/frontend_wk/JavaAndroid/gr_336/in_out/notes1.txt");
                FileOutputStream fos=new FileOutputStream("D:/Frontend/frontend_wk/JavaAndroid/gr_336/in_out/notes2.txt"))
            {
                byte[] buffer = new byte[fin.available()];
                // считываем буфер
                fin.read(buffer, 0, buffer.length);
                // записываем из буфера в файл
                //FileWriter("notes1.txt",boolean append) throws IOException;
                fos.write(buffer, 0, buffer.length);
                String u = Integer.toString(buffer.length);
                System.out.println(buffer.length);
                System.out.println("The file2 has been rewrite");
            }

            catch(IOException ex){

                System.out.println(ex.getMessage());
            }

        */
//________________________________________________
      /*  String filePath = "D:/Frontend/frontend_wk/JavaAndroid/gr_336/in_out/notes2.txt";
          String uv = "khkhkgsh";

        try {
            Files.write(Paths.get(filePath), uv.getBytes(), StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            System.out.println(e);
        }

*/
//_____________________________________________





        }


}
