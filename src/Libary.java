/**
 * Created by User on 2016/12/6.
 */
public class Libary {

    private BookState bookState;
    private BookState bookInLibary;
    private BookState bookOutLibary;
    int BookCount=0;

    public Libary(int BookCount) {
       bookInLibary=new BookInLibary(this);
       bookOutLibary=new BookOutLibary(this);
        this.BookCount=BookCount;
        if(BookCount>0){
            bookState=bookInLibary;
        }
    }

    public void setBookState(BookState bookState) {
        this.bookState = bookState;
    }

    public void BookReturn(){
        bookState.Return();
    }

    public void BookLoan(){
        bookState.Loan();
    }

    public BookState getBookInLibary() {
        return bookInLibary;
    }

    public BookState getBookOutLibary() {
        return bookOutLibary;
    }


    public void bookloan(){
        if(BookCount>0){
            BookCount-=1;
        }
    }

    public void bookreturn(){
        BookCount+=1;
    }

}
