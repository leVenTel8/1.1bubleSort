package ru.leventel8.lessons;
/*main класс
в нем идет создание объекта типа ArrayBub
вставка 10 рандомных значений в массив,
вывод содержимого, сортировка и затем снова вывод содержимого
 */
class BubbleSortApp
{
    public static void main(String[] args)
    {
        int maxSize = 10;
        ArrayBub arr;
        arr = new ArrayBub(maxSize);

       for(int j=0; j<maxSize; j++){
           long n = (long)(java.lang.Math.random()*(maxSize-1));
           arr.insert(n);
       }

        arr.display();
        arr.bubbleSort();

        arr.display();
    }
}