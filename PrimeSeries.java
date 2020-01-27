import java.util.*;
class PrimeSeries{
public static void main(String[] arg)
{
Scanner o=new Scanner(System.in);
int n=o.nextInt();
int i=2,j=1,c,k=0;
int a[]=new int[n/2];
for(i=2;i<=n;i++){c=0;
for(j=2;j<=i;j++){
if(i%j==0)
c++;
}
if(c==1)
{
a[k]=i;
k++;

System.out.print("prime"+i);
}
}
for(i=0;i<a.length;i++)
System.out.print("  "+a[i]);
}
}
