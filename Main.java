package com.company;
import java.io.IOException;
import java.until.scanner;
public class Main{
public static void main(String[] args) throws IOException {
int x ;
int y ;
Scanner reader = new Scanner(System.in);
System.out.println("Enter x: ");
x = reader.nextInt();
System.out.println("Enter y: ");
y = reader.nextInt();
System.out.println("Answer");
System.out.println(x + y);
reader.close();
}
}
