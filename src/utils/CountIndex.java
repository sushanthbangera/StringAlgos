package utils;

/**
 *
 * @author Sushanth Bangera
 */
public class CountIndex {

    public int count, index;

    public CountIndex(int index) {
        this.count = 1;
        this.index = index;
    }

    public void incCount() {
        this.count++;
    }
}
