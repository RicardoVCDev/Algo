package com.jon.learning.tree;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    private Map<Character, TrieNode> letters;
    private boolean endOfWord;

    public TrieNode(boolean endOfWord) {
        this.letters = new HashMap<>();
        this.endOfWord = endOfWord;
    }

    public TrieNode(String characters) {
        this(false);
        this.insert(characters);
        this.endOfWord = false;
    }

    public Map<Character, TrieNode> getLetters() {
        return letters;
    }

    public void setLetters(Map<Character, TrieNode> letters) {
        this.letters = letters;
    }

    public boolean isEndOfWord() {
        return endOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        this.endOfWord = endOfWord;
    }

    /**
     * Take the 1st character then check if it's already in the map of characters
     * if yes, except for the first character of chars, pass the remaining
     *  characters to the TrieNode that corresponds to the 1st character of input
     * Else, add the 1st character of input to the letters map,
     *  create a new TrieNode and pass the rest of the characters to it.
     * @param chars
     */
    public void insert(String chars) {
        if (chars.length() < 1) return;
        char c = chars.substring(0, 1).toCharArray()[0];
        TrieNode child;
        if (chars.length() == 1) { //last character
            child = new TrieNode(true); //end of node
            this.letters.put(c, child);
        } else {
            child = this.letters.get(c);
            if (child == null) {//does not exists yet
                this.letters.put(c, new TrieNode(chars.substring(1)));
            } else { //exists
                child.insert(chars.substring(1));
            }
        }
    }

    /**
     * If input is empty, return false
     * Set c as the 1st character of the input
     * Retrieve the node from letters map that corresponds to character c
     *  If null or endOfWord is true, return false
     *  Else pass the remaining characters except the 1st one to the "exists()"
     *          function of the node retrieved from letters map, and return the result.
     * @param chars array of char to be searched.
     * @return
     */
    public boolean exists(String chars) {
        if (chars.length() < 1) return true;
        char c = chars.substring(0, 1).toCharArray()[0];
        TrieNode trie = letters.get(c);
        if (trie == null || this.endOfWord == true) return false;

        return trie.exists(chars.substring(1));
    }
}
