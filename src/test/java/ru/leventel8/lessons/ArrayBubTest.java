/* Junit тест.
    Тест методов insert и bubleSort
 */
package ru.leventel8.lessons;

/*импорт Junit библиотек
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ArrayBubTest {

  /*Junit тест вставки в массив
   */
    @Test
    public void testInsert() {
        ArrayBub arrayBub = new ArrayBub(10);       //создание нового объекта ArrayBub и передача аргумента 10
        arrayBub.insert(5);                        // в конуструктор класса
        assertEquals(5, arrayBub.getFirst());   // сравниваем ожидаемое значение с выходным
    }//end testInsert()

    /*тест пузырьковой сортировки
     */
    @Test
    public void testbubbleSort() {
        ArrayBub arrayBub = new ArrayBub(10);   //создание нового объекта ArrayBub и передача аргумента 10
        arrayBub.insert(5);                    // вставка значений в массив
        arrayBub.insert(4);
        arrayBub.insert(3);
        arrayBub.insert(7);
        arrayBub.insert(8);
        arrayBub.insert(9);
        arrayBub.insert(15);
        arrayBub.insert(1);

        arrayBub.bubbleSort();                          // вызов метода пузырьковой сортировки
        assertEquals(1, arrayBub.getFirst());   // сравниваем ожидаемое значение с выходным
    }//end testbubbleSort()
}//end ArrayBubTest