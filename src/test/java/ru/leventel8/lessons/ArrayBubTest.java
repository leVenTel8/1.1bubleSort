/* Junit тест.
    Тест методов insert и bubleSort
 */
package ru.leventel8.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ArrayBubTest {
    @Test
    public void testInsert() {
        ArrayBub arrayBub = new ArrayBub(10);
        arrayBub.insert(5);
        assertEquals(5, arrayBub.getFirst());
    }

    @Test
    public void testbubbleSort() {
        ArrayBub arrayBub = new ArrayBub(10);
        arrayBub.insert(5);
        arrayBub.insert(4);
        arrayBub.insert(3);
        arrayBub.insert(7);
        arrayBub.insert(8);
        arrayBub.insert(9);
        arrayBub.insert(15);
        arrayBub.insert(1);

        arrayBub.bubbleSort();
        arrayBub.display();
        assertEquals(1, arrayBub.getFirst());
    }
}