import java.util.Scanner;
import java.util.Stack;

import java.util.Iterator;

import java.util.Queue;
import java.util.LinkedList;
class SLLTester {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    


    System.out.println("Input a whole number:");
    int num1 = input.nextInt();
    input.nextLine();

    System.out.println("Input a whole number:");
    int num2 = input.nextInt();
    input.nextLine();

    System.out.println("Input a whole number:");
    int num3 = input.nextInt();
    input.nextLine();

    System.out.println("Input a whole number:");
    int num4 = input.nextInt();
    input.nextLine();

    System.out.println("Input a whole number:");
    int num5 = input.nextInt();
    input.nextLine();

    Stack stack = new Stack();
    stack.push(num1);
    stack.push(num2);
    stack.push(num3);
    stack.push(num4);
    stack.push(num5);

    Stack temp = new Stack();
    while(!stack.isEmpty()){
      temp.push(stack.pop());
    }

    while(!temp.isEmpty()){
      int val = (int)temp.pop();
      stack.push(val);
      stack.push(val);
    }

    System.out.println("duplicate value stack:");
    Iterator it = stack.iterator();
    while (it.hasNext()){
      System.out.print(it.next()+", ");
    }
    System.out.println();
    
    Queue <Integer> myQ = new LinkedList <Integer> ();
    
    System.out.println("Enter an integer: ");
    int numb1 = input.nextInt();
    input.nextLine();

    System.out.println("Enter an integer: ");
    int numb2 = input.nextInt();
    input.nextLine();

    System.out.println("Enter an integer: ");
    int numb3 = input.nextInt();
    input.nextLine();

    System.out.println("Enter an integer: ");
    int numb4 = input.nextInt();
    input.nextLine();

    System.out.println("Enter an integer: ");
    int numb5 = input.nextInt();
    input.nextLine();

    System.out.println("Enter an integer: ");
    int numb6 = input.nextInt();
    input.nextLine();

    System.out.println("Enter an integer: ");
    int numb7 = input.nextInt();
    input.nextLine();

    System.out.println("Enter an integer: ");
    int numb8 = input.nextInt();
    input.nextLine();

    System.out.println("Enter an integer: ");
    int numb9 = input.nextInt();
    input.nextLine();

    System.out.println("Enter an integer: ");
    int numb10 = input.nextInt();
    input.nextLine();

    myQ.add(numb1);
    myQ.add(numb2);
    myQ.add(numb3);
    myQ.add(numb4);
    myQ.add(numb5);
    myQ.add(numb6);
    myQ.add(numb7);
    myQ.add(numb8);
    myQ.add(numb9);
    myQ.add(numb10);

    Queue <Integer> oddQ = new LinkedList<Integer>();
    Queue <Integer> evenQ = new LinkedList<Integer>();

    while(!myQ.isEmpty()){
      int temporary = myQ.remove();
      if (temporary%2==0){
        evenQ.add(temporary);
      }
      else{
        oddQ.add(temporary);
      }
    }
    while (!evenQ.isEmpty()){
      myQ.add(evenQ.remove());
    }
    
    while (!oddQ.isEmpty()){
      myQ.add(oddQ.remove());
    }

    System.out.println("Odd and Even List:");
    while (!myQ.isEmpty()){
      System.out.print(myQ.remove()+", ");
    }

  } // end main
} // end class