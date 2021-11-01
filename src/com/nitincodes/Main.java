package com.nitincodes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* Write a program to print the area of a rectangle by creating a class named 'Area'
	   taking the values of its length and breadth as parameters of its constructor and
	   having a method named 'returnArea' which returns the area of the rectangle.
	   Length and breadth of rectangle are entered through keyboard.
	 */
    Scanner sc = new Scanner(System.in);
    Area a1 = new Area(sc.nextInt(), sc.nextInt());
        System.out.println(a1.returnArea());
    }
}
class Area{
    int length;
    int breadth;
    float area;
    public Area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    float returnArea(){
        return length*breadth;
    }

}