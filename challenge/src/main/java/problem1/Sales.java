package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of sales people : ");
        final int SALESPEOPLE=scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int maximum=sales[0];
        int minimum=sales[0];
        int id1=0;
        int id2=0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if(sales[i]>maximum){
                maximum=sales[i];
                id1=i+1;
            }
            if(sales[i]<minimum){
                minimum=sales[i];
                id2=i+1;
            }

        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("The average sale: " + (double) sum/SALESPEOPLE);
        System.out.println("Salesperson " + id1 + " has the highest sale with $" + maximum + ".");
        System.out.println("Salesperson " + id2 + " has the least sale with $" + minimum + ".");

        int val=0;
        int count=0;
        System.out.print("Enter a value: ");
        val=scan.nextInt();

        System.out.println("the ids of salesperson who exceeded " + val + ": ");
        for (int i=0; i<sales.length;i++){
            if (sales[i]>val){
                System.out.println(i+1);
                count++;
            }
        }
        System.out.println("Total number of salespeople who exceeded $" + val + ": " + count);


    }
}