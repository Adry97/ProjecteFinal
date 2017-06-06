package practica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Skylake-Adry
 */
public class BinaryTree {

    public Genoma a;
    private BinaryTree leftChild;
    private BinaryTree rightChild;
    private Genoma value;


    public BinaryTree(Genoma a, BinaryTree leftChild, BinaryTree rightChild) {
        this.value = a;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }


    public BinaryTree(Genoma value) {
        this(value, null, null);
    }


    public Object getValue() {
        return value;
    }

    public BinaryTree getLeftChild() {
        return leftChild;
    }
  
    public BinaryTree getRightChild() {
        return rightChild;
    }

    public void setLeftChild(BinaryTree subtree) throws IllegalArgumentException {
        if (contains(subtree, this)) {
            throw new IllegalArgumentException(
                "Subtree " + this +" already contains " + subtree);
        }
        leftChild = subtree;
    }

    public void setRightChild(BinaryTree subtree) throws IllegalArgumentException {
        if (contains(subtree, this)) {
            throw new IllegalArgumentException(
                    "Subtree " + this +" already contains " + subtree);
        }
        rightChild = subtree;
    }

    /**
     *
     * @param value
     */
    public void setValue(Genoma value) {
        this.value = value;
    }
    

    public boolean isLeaf() {
        return leftChild == null && rightChild == null;
    }

    public boolean equals(Object o) {
        if (o == null || !(o instanceof BinaryTree)) {
            return false;
        }
        BinaryTree otherTree = (BinaryTree) o;
        return equals(value, otherTree.value)
            && equals(leftChild, otherTree.getLeftChild())
            && equals(rightChild, otherTree.getRightChild());
    }
    
  
    private boolean equals(Object x, Object y) {
        if (x == null) return y == null;
        return x.equals(y);
    }

    protected boolean contains(BinaryTree tree, BinaryTree targetNode) {
        if (tree == null)
            return false;
        if (tree == targetNode)
            return true;
        return contains(targetNode, tree.getLeftChild())
            || contains(targetNode, tree.getRightChild());
    }
    
 
    public String toString() {
        if (isLeaf()) {
            return value.toString();
        }
        else {
            String root, left = "null", right = "null";
            root = value.toString();
            if (getLeftChild() != null) {
                left = getLeftChild().toString();
            }
            if (getRightChild() != null) {
                right = getRightChild().toString();
            }
            return root + " (" + left + ", " + right + ")";
        }
    }
    
    public int hashCode() {
        int result = value.hashCode();
        if (leftChild != null) {
            result += 3 * leftChild.hashCode();
        }
        if (rightChild != null) {
            result += 7 * leftChild.hashCode();
        }
        return result;
    }

    public void print() {
        print(this, 0);
    }
    
    private void print(BinaryTree root, int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("   ");
        }
        if (root == null) {
            System.out.println("null");
            return;
        }
        System.out.println(root.value);
        if (root.isLeaf()) return;
        print(root.leftChild, indent + 1);
        print(root.rightChild, indent + 1);
    }

    void value(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

