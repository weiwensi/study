package javaconcurrencyinPractice.introduction;

import javaconcurrencyinPractice.annotations.GuardedBy;
import javaconcurrencyinPractice.annotations.ThreadSafe;

/**
 * Sequence
 *
 * @author Brian Goetz and Tim Peierls
 */

@ThreadSafe
public class Sequence {

    /**
     * 表示使用的锁对象是该对象自身
     */
    @GuardedBy("this")
    private int nextValue;

    public synchronized int getNext() {
        return nextValue++;
    }
}
