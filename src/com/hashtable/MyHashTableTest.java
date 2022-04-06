package com.hashtable;

public class MyHashTableTest {

    public static void main(String[] args) {
        //givenASentence_WhenWordsAreAddedToList_ShouldReturnWordFrequency
        String sentence = "To be or not to be";
        MyHashTable<String, Integer> myHashTable = new MyHashTable<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myHashTable.get(word);
            if (value == null)
                value = 1;
            else
                value = value + 1;
            myHashTable.add(word, value);
        }
        Integer frequency= myHashTable.get("be");
        System.out.println(myHashTable);
        System.out.println("frequency = "+frequency);
    }
}