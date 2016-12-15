/**
 * Created by User on 2016/12/6.
 */
public class LibaryMain {
    public static void main(String[] args){
        Libary libary=new Libary(1);
        libary.BookLoan();
        libary.BookReturn();
        libary.BookReturn();
        libary.BookLoan();
        libary.BookLoan();
    }
}
