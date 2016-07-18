/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class Lab5cpe103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AQueue<Integer> list = new AQueue<Integer>(5);
        
        System.out.println("Choose one of the following operations:\n" +
                " Enqueue/Add (enter the letter a)\n" +
                " Dequeue/Delete (enter the letter d)\n" +
                " Check if the list is empty (enter the letter e)\n" +
                "  Print the Circular Array (enter the letter p)\n" +
                " Quit (enter the letter q)");
        Scanner scan = new Scanner(System.in);

        
        boolean cont = true;
        while(cont)
        {
            System.out.println("\nEnter a menu choice!");
            String c = scan.next();            
            
            char choice = 'i';
            if(c.length() ==  1)
            {
                choice = c.charAt(0);
            }
            
            switch(choice)
            {
                case 'a':
                    System.out.println("Please enter a number: ");
                    if(scan.hasNextInt())
                    {
                        int num = scan.nextInt();
                        list.enqueue(num);
                        System.out.println(num + " Enqueued ");
                    }
                    else
                    {
                        scan.next();
                        System.out.println("Invalid Choice");
                    }
                    break;

                case 'd':
                    try{
                        int pop = list.dequeue();
                        System.out.println(pop + " Dequeued ");                    
                    }
                    catch(Exception MyException){
                        System.out.println("Invalid operation: The Queue is Empty!");
                    }
                    break;

                case 'e':
                    String s = "Not Empty";
                    if(list.isEmpty())
                    {
                        s = "Empty!";
                    }
                    System.out.println(s);
                    break;

                case 'p':
                    list.printArray();
                    break;
                    
                case 'q':
                    System.out.println("Quitting...");
                    cont = false;
                    while(!list.isEmpty())
                    {
                        System.out.print(list.dequeue() + " ");
                    }
                    break;
                    
                default:
                    System.out.println("Invalid menu choice!");
            }
        }
    }
    
}
