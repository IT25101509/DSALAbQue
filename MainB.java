package Labtest01;

import java.util.Scanner;
public class MainB {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.print("Enter the Queue Size : ");
        int Qsize = io.nextInt();
        Queue q1 = new Queue(Qsize);

        System.out.print("Enter the elements : ");
        while(!q1.isFull()){
           int elements = io.nextInt();
           q1.enqueue(elements);
        }

        System.out.print("OUTPUT : ");
        while (!q1.isEmpty()){
            int temp = q1.dequeue();
            int power= temp * temp * temp;
            System.out.print(power + " ");
        }

    }
}
