/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author Victoria
 */
public class AQueue<T> {
    T[] arr;
    int front;
    int end;
    int count;
    
    public static class MyException extends RuntimeException
    {
        public MyException()
        {
            super();
        }
        
        public MyException(String s)
        {
            super(s);
        }
    }

    public AQueue(int size)
    {
        arr = (T []) new Object[size];
        front = 0;
        end = 0;
        count = 0;
    }
    
    public boolean isEmpty()
    {
        return count == 0;
    }
    
    public void enqueue(T elem)
    {
        if(count == arr.length)
        {
            increaseSize();
        }
        
        arr[end] = elem;
        
        end = (end + 1) % arr.length;
        
        count++;
    }
    
    public void increaseSize()
    {
        T[] newArr = (T[])(new Object[arr.length*2]);
        for(int i = 0; i < count; i++)
        {
            newArr[i] = arr[front];
            front = (front + 1) % arr.length;
        }
        front = 0;
        end = count;
        arr = newArr;
    }
    
    public T dequeue()
    {
        if(isEmpty())
        {
            throw new MyException();
        }
        
        T res = arr[front];
        arr[front] = null;
        
        front = (front + 1) % arr.length;
        
        count--;
        return res;
    }
    
    public void printArray()
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
