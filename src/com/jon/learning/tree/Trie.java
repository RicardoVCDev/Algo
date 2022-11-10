package com.jon.learning.tree;

public class Trie {
    private TrieNode rootNode = new TrieNode();

    public Trie() {}

    /**
     * loop through the characters of the word
     *
     * @param word
     */
    public void add(String word) {
        rootNode.insert(word);
    }
}
