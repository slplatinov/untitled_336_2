package lab_7.lab_Biblioteka;

public class ReaderBook implements Biblioteka {
    private String fio;
    String name;
    String namebook;
    //String nfio;
    private Boolean takemove;
    private Boolean returnmove;

    public ReaderBook(String fio,Boolean takemove, boolean returnmove) {
        this.fio = fio;
        this.takemove=takemove;
        this.returnmove = returnmove;
    }


    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Boolean getTakemove() {
        return takemove;
    }

    public Boolean getReturnmove() {
        return returnmove;
    }

    public void setTakemove(Boolean takemove) {
        this.takemove = takemove;
    }

    public void setReturnmove(Boolean returnmove) {
        this.returnmove = returnmove;
    }
    //public String namebook;
    //private int number;

    //private String fio;

   // String Readers (){
   //     return nfio;
    //}

    public void TakeBook(String namebook){
        System.out. println(this.fio +" взял книгу " + namebook);
       // for (String book : books){
       //     System.out.println(book);
       // }
        System.out.println();
    }
    public void ReturnBook(String namebook){
        System.out. println(this.fio +" вернул книгу " + namebook);
        // for (String book : books){
        //     System.out.println(book);
        // }
        System.out.println();
    }

    public void AccountBook() {
        System.out.println("необходимо провести учет по книге:  " +  ";\n взял = " + takemove +  ";\n вернул = " + returnmove );
    }


}



