class BubbleSortApp
{
    public static void main(String[] args)
    {
        int maxSize = 10000;
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