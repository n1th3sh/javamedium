import java.util.*;
class dynamArr{
    private static final int intialcapacity=16;
    private int size;
    private int capacity;
    private int arr[];

    dynamArr(){
        size=0;
        arr=new int[intialcapacity];
        capacity=intialcapacity;
    }
    private void expandarr(){
        capacity*=2;
        arr=java.util.Arrays.copyOf(arr,capacity);
    }
    private void decreamentarr(){
        capacity/=2;
        arr=java.util.Arrays.copyOf(arr,capacity);
    }
    public void add(int num){
        arr[size++]=num;
        if(capacity==size){
            expandarr();
        }
    }
    public void display(){
        System.out.println("List elements are:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void insert(int pos,int num){
        if(capacity==size){
            expandarr();
        }
        for(int i=size;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=num;
        size++;
    }
    public void delete(int pos){
        if(capacity < intialcapacity && capacity > 3*size){
            decreamentarr();
        }
        for(int i=pos;i<size;i++){
            arr[i]=arr[i+1];
        }
        size--;
    }
}
public class dynamicarrayfunctions {
    public static void main(String[] args) {
        int num;
        int pos;
        dynamArr func=new dynamArr();
        Scanner sc=new Scanner(System.in);
        System.out.println("---------------------------------------------");
        while(true){
            System.out.println("1.Add at End");
            System.out.println("2.Insert at specified position");
            System.out.println("3.Delete at specified position");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.println("--------------------------------");
            System.out.println("Enter Your Choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the value:");
                    num=sc.nextInt();
                    func.add(num);
                    break;
                case 2:
                    System.out.print("Enter the postion(start from 0)");
                    pos=sc.nextInt();
                    if(pos<0){
                        System.out.println("Invalid choice");
                        break;
                    }
                    System.out.print("Enter the value:");
                    num=sc.nextInt();
                    func.insert(pos,num);
                    break;
                case 3:
                    System.out.print("Enter the postion(start from 0)");
                    pos=sc.nextInt();
                    if(pos<0){
                        System.out.println("Invalid choice");
                        break;
                    }
                    func.delete(pos);
                    break;
                case 4:
                    func.display();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Enter the correct Choice");
            }
            System.out.println("----------------------------------------------");
        }


    }
}
