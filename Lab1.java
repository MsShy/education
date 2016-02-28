import static java.lang.Math.*;

public class Lab1
{
public static void main(String[] args)
{
int i;
double s;
s=0;
int[] a=new int[args.length];
   for(i=0;i<args.length;i++ )
a[i]=Integer.parseInt(args[i]);
for (i=0;i<a.length;i++)
{s+=(1.0+cos(a[i])+cos(a[i]/2.0));}

System.out.print("S="+s);
}
}