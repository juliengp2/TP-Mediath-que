package mediatheque;

public class printOnlyCDs implements ItemVisitor{
    @Override
    public void visit(Book book) {

    }

    @Override
    public void visit(CD cd) {
        cd.print();
    }
}
