package com.hashtable;
public class MyNode<K extends Comparable<K>> implements INode<K> {
    private  INode next;
    private  K key;

    public MyNode(K key) {
        this.key=key;
        this.next=null;
    }

    public K getKey() {
        return this.key;
    }
    public  void setKey(K key){
        this.key=key;
    }

    public void setNext(INode next) {
        this.next=next;
    }

    public INode getNext() {
        return this.next;
    }
}