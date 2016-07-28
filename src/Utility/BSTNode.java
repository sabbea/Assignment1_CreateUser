package Utility;

/**
 * Created by Abhishek on 7/24/2016.
 */
public class BSTNode<T extends Comparable<T>> {
    // Used to hold references to BST nodes for the linked implementation
    protected T info;                // The info in a BST node
    protected BSTNode<T> left;       // A link to the left child node
    protected BSTNode<T> right;      // A link to the right child node

    public BSTNode(T info) {
        this.info = info;
        left = null;
        right = null;
    }

    public T getInfo()
    // Returns info of this BSTNode.
    {
        return info;
    }

    public void setInfo(T info)
    // Sets info of this BSTNode.
    {
        this.info = info;
    }

    public BSTNode<T> getLeft()
    // Returns left link of this BSTNode.
    {
        return left;
    }

    public void setLeft(BSTNode<T> link)
    // Sets left link of this BSTNode.
    {
        left = link;
    }

    public BSTNode<T> getRight()
    // Returns right link of this BSTNode.
    {
        return right;
    }

    public void setRight(BSTNode<T> link)
    // Sets right link of this BSTNode.
    {
        right = link;
    }
}