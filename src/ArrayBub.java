
class ArrayBub
{
    private long[] a;
    private int nElems;
    static int gde = 0;
    //--------------------------------------------------------------
    public ArrayBub(int max)
    {
        a = new long[max];
        nElems = 0;
    }
    //--------------------------------------------------------------
    public void insert(long value)
    {
        a[nElems] = value;
        nElems++;
    }
    //--------------------------------------------------------------
    public void display()
    {
        for(int j=0; j<nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }
    //--------------------------------------------------------------
    public void bubbleSort()
    {

        int out, in, out1;

        for(out=nElems-1; out>1; out--)
            for(in=0; in<out; in++)

                if( a[in] > a[in+1] )
                    swap(in, in+1);
        gde=gde+1;

        System.out.println("иду вправо"+gde);
                for(out1=out-1;out1>1; out1--)
                    for(in=out-1;in<out; in--)
                        if( a[in] > a[in-1] )
                            swap(in, in-1);
                        gde=gde-1;
                    System.out.println("иду влево"+gde);
    }
    //--------------------------------------------------------------
    private void swap(int one, int two)
    {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
//--------------------------------------------------------------
}