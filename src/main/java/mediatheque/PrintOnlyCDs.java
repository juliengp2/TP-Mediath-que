package mediatheque;

public class PrintOnlyCDs implements ItemVisitor{
    @Override
    public void visit(Book book) {

    }

    @Override
    public void visit(CD cd) {
        cd.print();
    }
}
