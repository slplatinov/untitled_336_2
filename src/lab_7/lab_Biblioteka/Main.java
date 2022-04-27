package lab_7.lab_Biblioteka;


public class Main {
    public static void main(String[] args) {
        BookBibl bookBibl = new BookBibl("Don't cry the wolf");
        BookBibl bookBibl1 = new BookBibl("James Clavel");
        BookBibl bookBibl2 = new BookBibl("Java for The Users");
        BookBibl[] bookbibls = {bookBibl,bookBibl1,bookBibl2};
        //ReaderBook tkbook = new ReaderBook();
        //ReaderBook retbook = new ReaderBook();

        ReaderBook reader = new ReaderBook("Petrov",false,true);//"Petrov"
        ReaderBook reader1 = new ReaderBook("Ivanov",true,false);//"Ivanov"
        ReaderBook reader2 = new ReaderBook("Kate", false,true);//"Kate"
        ReaderBook[] readers = {reader,reader1,reader2};

        AdminBibl adminbibl = new AdminBibl();
        adminbibl.adm = "Speedy Ganzales";
        //reader.nfio = "Petrov";
        //reader.setFio("Petrov");
        //String vol;
        //vol = reader.Readers();
       // System.out.println("vol=" + reader.Readers());
        System.out.println("_______________________________ ");
        bookBibl.AccountBook();
        bookBibl.OrderBook("Java for The Users");
        System.out.println("_______________________________ ");
        reader1.TakeBook("Don't cry the wolf");
        reader1.AccountBook();
        System.out.println("_______________________________ ");
        reader2.ReturnBook("James Clavel");
        reader2.AccountBook();
        System.out.println("_______________________________ ");
        adminbibl.AccountBook();
    }
}
