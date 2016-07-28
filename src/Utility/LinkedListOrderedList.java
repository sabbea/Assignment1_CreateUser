//package Utility;
//
///**
// * Created by Abhishek on 7/18/2016.
// */
//public class LinkedListOrderedList<T> implements IList<T> {
//    private LinkedListNode head;
//    private LinkedListNode iterator;
//
//    public LinkedListOrderedList(){
//        head =
//
//
//
// null;
//        iterator = null;
//    }
//
//    @Override
//    public void add(T element) {
//        LinkedListNode newNode = new LinkedListNode(element);
//        if(head == null){
//            head = newNode;
//        }
//        else if (((Comparable) element).compareTo(head.element) < 0) {
//            newNode.getPointer() = head;
//            head = newNode;
//        }
//    }
//
//    @Override
//    public boolean remove() {
//        return false;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return (head == null);
//    }
//
//    @Override
//    public boolean contains(T element) {
//        return false;
//    }
//
//    @Override
//    public int size() {
//        return 0;
//    }
//
//    @Override
//    public T getNext() {
//        return null;
//    }
//
//    @Override
//    public T get(T element) {
//        return null;
//    }
//}
