/**
 * Created by User on 2016/12/6.
 */
public class BookOutLibary implements BookState {

    private Libary libary;

    public BookOutLibary(Libary libary) {
        this.libary = libary;
    }

    @Override
    public void Return() {
        System.out.println("归还图书成功！");
        libary.bookreturn();
        libary.setBookState(libary.getBookInLibary());
    }

    @Override
    public void Loan() {
        System.out.println("该图书已被借出，不得使用借书操作！");
    }
}
