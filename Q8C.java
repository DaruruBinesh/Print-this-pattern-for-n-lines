import java.util.Scanner;
class Q8C{
public static void main(String[] args){
System.out.println();
Scanner sc=new Scanner(System.in);
System.out.print("--> Enter the Number : ");
int n=sc.nextInt();
System.out.println("");

for(int i=1;i<=n;i++){
System.out.print("  ");
for(int j=1;j<=i;j++){
System.out.print(j);
}System.out.println();}
for(int i=n;i>0;i--){
System.out.print("  ");
for(int j=1;j<=i;j++){
System.out.print(j);
}
System.out.println();
}

}
}