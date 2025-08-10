package section10;

//This class will have the row, col, numberOfElements
public class SparseMatrix {
    private int row;
    private int col;
    private int numberOfElements;

    private Element[] element;
    void Sparse(int row, int col, int numberOfElements) {
        this.row = row;
        this.col = col;
        this.numberOfElements = numberOfElements;
        element = new Element[this.numberOfElements];
    }
}
