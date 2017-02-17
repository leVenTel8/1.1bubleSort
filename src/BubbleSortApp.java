class BubbleSortApp
{
    public static void main(String[] args)
    {
        int maxSize = 10000;      // array size
        ArrayBub arr;         // reference to array
        arr = new ArrayBub(maxSize); // create the array

       for(int j=0; j<maxSize; j++){                //Д/3 вставка на 10000
           long n = (long)(java.lang.Math.random()*(maxSize-1));
           arr.insert(n);
       }

        arr.display();        // display items

        arr.bubbleSort();       // bubble sort them

        arr.display();        // display them again
    } // end main()
} // end class BubbleSortApp