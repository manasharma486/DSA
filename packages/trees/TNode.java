package trees;

public class TNode {
    public int data;
    public TNode lefTNode;
    public TNode righTNode;

    public TNode(int data) {
        this.data = data;
    }
    @Override
    public String toString() {
        
        return "[" + data + "]";
    }
}