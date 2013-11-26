/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package addtodictionary;

/**
 *
 * @author csc
 */
public class Entry  implements Comparable<Entry> {
    private String word;
    private String definition;
    
    public Entry(String word, String definition){
        this.word=word;
        this.definition=definition;
    }

    /**
     * @return the word
     */
    public String getWord() {
        return word;
    }

    /**
     * @param word the word to set
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * @return the definition
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * @param definition the definition to set
     */
    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public int compareTo(Entry o) {
        int last = this.word.compareTo(o.word);
        return last == 0 ? this.word.compareTo(o.word) : last;
    }
}
