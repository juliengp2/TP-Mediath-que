package mediatheque;

public class printCatalog implements ItemVisitor{
    @Override
    public void visit(Book book) {
        book.print();
    }

    @Override
    public void visit(CD cd) {
        cd.print();
    }
}
