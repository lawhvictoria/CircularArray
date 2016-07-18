/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class AQueueClient {
    
    public static void main(String[] args)
    {
        AQueue<Double> a = new AQueue<Double>(5);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some values");
        while(scan.hasNext())
        {
            if(scan.hasNextDouble())
            {
                a.enqueue(scan.nextDouble());
            }
            
            else
            {
                scan.next();
            }
        }
        
        while(!a.isEmpty())
        {
            System.out.println(a.dequeue());
        }
        
    }
}
