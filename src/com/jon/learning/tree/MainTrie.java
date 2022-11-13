package com.jon.learning.tree;

public class MainTrie {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.add("win");
        trie.add("winner");
        System.out.println("losser exists: "+trie.exists("losser"));
        System.out.println("winn exists: "+trie.exists("winn"));
    }
}
