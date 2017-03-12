/*
Реализация методов вставки, пузырьковой сортировки,
и вывода содержимого массива
 */

package ru.leventel8.lessons;

class ArrayBub
{
    /*поля необходимые для создания массива

     */
    private long[] a;
    private int nElems;
    static int gde = 0;
    long first;


    /*конструктор класса, принимающий аргумент
    размера массива
     */

    public ArrayBub(int max)
    {
        a = new long[max];
        nElems = 0;
    }

    /*метод вставлят значения принятых аргументов
    в массив
     */

    public void insert(long value)
    {
        a[nElems] = value;
        nElems++;
    }

    /*метод выводит
    содержимое массива
     */

    public void display()
    {
        for(int j=0; j<nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }

    /*метод реализует
    пузырьковую сортировку
     */

    public void bubbleSort()
    {

        int out, in, out1;

        for(out=nElems-1; out>0; out--)
            for(in=0; in<out; in++)

                if( a[in] > a[in+1] )
                    swap(in, in+1);

        /*дополнительный функционал, пузырьковая сортировка
        в обе стороны
         */
        //gde=gde+1;

       // System.out.println("иду вправо"+gde);
         //       for(out1=out-1;out1>1; out1--)
             //       for(in=out-1;in<out; in--)
                 //       if( a[in] > a[in-1] )
                  //          swap(in, in-1);
                    //    gde=gde-1;
                   // System.out.println("иду влево"+gde);
    }
    /*метод служит для перестановки
    двух значения массива(большее с меньшим)
     */
    private void swap(int one, int two)
    {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
    /*метод берет первое значение
    массива, необходим для Junit теста
     */
    public long getFirst(){

        first = a[0];

        return first;
    }

}