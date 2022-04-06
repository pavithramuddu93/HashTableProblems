package com.hashtable;
public class MyMapNode<K, V> implements INode<K> {
    K key;
    V value;
    INode next;

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key=key;
    }
    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public void setNext(INode next) {
        this.next= next;
    }

    @Override
    public INode getNext() {
        return next;
    }

    @Override
    public String toString() {
        StringBuilder myMapNodeString = new StringBuilder();
        myMapNodeString.append("myMapNode{"+"K=").append(key)
                .append("V=").append(value).append('}');
        if(next!=null)
            myMapNodeString.append("->").append(next);
        return myMapNodeString.toString();
    }
}