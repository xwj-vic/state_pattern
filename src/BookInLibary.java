/**
 * Created by User on 2016/12/6.
 */
public class BookInLibary implements BookState {

    private Libary libary;

    public BookInLibary(Libary libary) {
        this.libary = libary;
    }

    @Override
    public void Return() {
        System.out.println("图书在馆，无需使用归还操作！");
    }

    @Override
    public void Loan() {
        System.out.println("借书成功！");
        libary.bookloan();
        libary.setBookState(libary.getBookOutLibary());
    }
}
