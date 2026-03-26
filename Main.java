package Labtest01;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner io= new Scanner(System.in);

        System.out.println("Enter Queue size : ");
        int size = io.nextInt();
        Queue Q1 = new Queue(size);

        System.out.print("In put the elements : ");
        while(!Q1.isFull()){
            int element = io.nextInt();
            Q1.enqueue(element);
        }

        System.out.print("Enter the value you want remove : ");
        int remove = io.nextInt();

        while(!Q1.isEmpty()){
            int temp = Q1.dequeue();
            if(temp != remove){
                System.out.print(temp + " ");
            }
        }

    }

}
