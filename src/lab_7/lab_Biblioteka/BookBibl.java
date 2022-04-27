package lab_7.lab_Biblioteka;

public class BookBibl implements Biblioteka{
    String namebook;
    boolean takemove;
    boolean returnmove;

    public BookBibl(String namebook){
        this.namebook = namebook;
       }


    public void AccountBook() {

        System.out.println("name = " + namebook + " взяли или заказали книгу " + "5 шт");
        System.out.println("name = " + namebook + " возвратили или просрочка времени возврата " + " 10 шт");

    }


    String OrderBook(String namebook) {
        System.out.println("Библиотекарь заказал книгу = " + namebook);
        return namebook;
    }
}
