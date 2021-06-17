import java.util.Scanner;
class Harshad
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter a number");
int n = s.nextInt();
int sum =0;
int temp = n;

while(n!=0)
{
int rem = n%10;
sum = sum + rem;
n = n/10;
}
if(temp%sum == 0)
System.out.println(temp + " is a harshad number ");
else
System.out.println(temp + " is not a harshad number ");
}
}
