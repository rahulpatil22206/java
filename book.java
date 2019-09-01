import java.util.*;
class book 
{
String name;
String author;
int price;
int num_pages;

book (String NAME,String AUTHOR,int PRICE,int NUM_PAGES)
{
name=NAME;
author=AUTHOR;
price=PRICE;
num_pages=NUM_PAGES;
}
void display()
{
System.out.println("the name of the book is"+name);
System.out.println("the author of the book is"+author);
System.out.println("the price of the book is "+price);
System.out.println("the no of pages"+num_pages);
}
public static void main(String args[])
{
book b1=new book("java","pradeepsir",300,300);
book b2=new book("quantumcomputers","rahul",400,400);
b1.display();
b2.display();
}
}