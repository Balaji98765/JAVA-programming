import java.util.*;
public class Main
{
    public static int fact(int q )
    {int p=1;
        for(int i=1;i<=q;i++)
        p*=i;
        return p;
    }
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    String s=sc.next();
	    s=s.toLowerCase();
	    char a[]=s.toCharArray();
	    int n=s.length();
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            
            {
                if(i!=j)
                {
                    if (a[i]==a[j])
            {
                for(int k=j;k<n-1;k++)
                {
                    a[k]=a[k+1];
                }
                n--;
            }
         
            }
            }
                
        }
        for(int i=0;i<n;i++)
        System.out.print(a[i]);
           System.out.println();
        int x[]=new int[n];
         
          for(int i=0;i<n;i++)
          { for(int j=0;j<n;j++)
             {
                 if(a[i]>a[j])
                 {
                     x[i]++;
                 }
             }
          
             System.out.print(x[i]+1);
          }
          int y=n;
          System.out.println();
          
          for(int i=0;i<n;i++)
          {
              System.out.print((x[i]+1)*fact(y)+" ");
              y--;
          }
          
       

	}
}
