package com.jon.learning.tree;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    private Map<Character, TrieNode> letters;
    private boolean endOfWord;

    public TrieNode() {
        this.letters = new HashMap<>();
        this.endOfWord = false;
    }

    public TrieNode(String characters) {
        this();
        this.insert(characters);
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
        //win, in, n
        //winner, inner, nner, ner, er, r
        if (chars.length() < 1) return;
        char c = chars.substring(0, 1).toCharArray()[0];
        TrieNode child;
        if (chars.length() == 1) { //last character
            child = new TrieNode(); //end of node
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
}
