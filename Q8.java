import java.util.Scanner;
class Q8{
public static void main(String[] args){
System.out.println(" ");
System.out.print("--> Enter the Number : ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(" ");
for(int i=0;i<n;i++){
System.out.print("  ");
for(int j=0;j<=i;j++){
System.out.print("*");
}System.out.println();
}


}
}