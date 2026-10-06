package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int currentNumber;
    int capacity;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        capacity=size;
        currentNumber=0;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public void increaseSize(){
        int[] arr=new int[capacity*2];
        for (int i=0;i<currentNumber;i++){
            arr[i]=list[i];
        }
        list=arr;
        capacity=capacity*2;
    }
    public void addElement(int newVal){
        if (capacity==currentNumber){
            increaseSize();
        }
        list[currentNumber]=newVal;
        currentNumber++;
    }
    public void removeFirst(int newVal){
        int index=-1;
        for (int i=0;i<currentNumber;i++){
            if (list[i]==newVal){
                index=i;
                break;
            }
        }
        if (index==-1){
            return;
        }

        for (int i=index;i<currentNumber-1;i++){
            list[i]=list[i+1];
        }
        list[currentNumber-1]=0;
        currentNumber--;
    }
    public void removeAll(int newVal){
        for (int i=0;i<currentNumber;i++){
            if (list[i]==newVal){
                removeFirst(newVal);
                i--;
            }
        }
    }



}