package com.hashtable;

public class MyLinkedList<K> {
    private INode tail;
    private INode head;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /*
       @purpose: Ability to add node
       @param: Takes a newNode as a input
       @function : Adds new node before first node
       @return: No return value.
      */
    public void add(INode newNode) {
        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else {
            INode tempNode = this.head;
            this.head = newNode;
            newNode.setNext(tempNode);
        }
    }

    /*
    @purpose: Ability to append node.
    @param: Takes a newNode as a input.
    @function : Adds new node to last of existing node.
    @return: No return value.
     */
    public void append(INode<K> newNode) {
        if (this.head == null)
            this.head = newNode;
        if (this.tail == null)
            this.tail = newNode;
        else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }

    }

    /*
        @purpose: Ability print nodes.
        @param: No parameters.
        @function : Prints data inside the nodes
        sequentially.
        @return: No return value.
    */
    public void printNodes() {
        if (this.head == null)
            System.out.println("No elements to print");
        else {
            INode tempNode = this.head;
            while (tempNode.getNext() != null) {
                System.out.print(tempNode.getKey() + "->");
                tempNode = tempNode.getNext();
            }
            System.out.println(tempNode.getKey());
        }
    }

    /*
        @purpose: Ability insert a newNode after a node.
        @param: takes mynode and new node.
        @function : Inserts new node after mynode.
        @return: No return value.
    */
    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    /*
        @purpose: Ability to delete first node.
        @param: No parameters.
        @function : Deletes first node which is reference with head node.
        @return: Returns Null if no nodes else returns the deleted node.
    */
    public INode pop() {
        if (this.head == null) {
            System.out.println("No elements to delete");
            return null;
        } else {
            INode tempNode = this.head;
            this.head = this.head.getNext();
            return tempNode;
        }
    }
    /*
        @purpose: Ability to delete last node.
        @param: No parameters.
        @function : Deletes tailNode.
        @return: Returns Null if no nodes else returns the deleted node.
    */

    public INode popLast() {
        if (this.head == null) {
            System.out.println("No elements to delete");
            return null;
        } else {
            INode tempNode = this.head;
            while (tempNode.getNext().getNext() != null) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(null);
            INode ret = this.tail;
            this.tail = tempNode;
            return ret;
        }
    }

   /*
        @purpose: Ability to find desired node.
        @param: node to find.
        @function : finds the node which is having data asked ny the user.
        @return: No returns.
    */

//    public void search(K key){
//        if(this.head==null)
//            System.out.println("No elements to search");
//        else{
//            boolean flag=false;
//            INode tempNode=this.head;
//            while(tempNode!=null){
//                if(tempNode.getKey()==key) {
//                    flag = true;
//                    break;
//                }
//                tempNode=tempNode.getNext();
//            }
//            if(flag==true){
//                System.out.println("Node found with data "+tempNode.getKey());
//            }
//            else{
//                System.out.println("Node not found");
//            }
//        }
//    }

    public INode search(K key){
        INode tempNode=this.head;
        while(tempNode!=null){
            if(tempNode.getKey()==key) {
                return tempNode;
            }
            tempNode=tempNode.getNext();
        }
        return tempNode;
    }

    /*
        @purpose: Ability to delete given node.
        @param: node to delete.
        @function : deletes the node which is having data asked by the user.
        @return: No returns.
    */
    public void deleteNode(INode myNode){
        if(this.head==null)
            System.out.println("No elements to delete");
        else{
            INode tempNode=this.head;
            while(tempNode!=null){
                if(tempNode.getNext()==myNode){
                    tempNode.setNext(tempNode.getNext().getNext());
                }
                tempNode=tempNode.getNext();
            }
        }
    }

    /*
        @purpose: Ability to create ordered linked list in asending order.
        @param: node to delete.
        @function : deletes the node which is having data asked by the user.
        @return: No returns.
    */

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}