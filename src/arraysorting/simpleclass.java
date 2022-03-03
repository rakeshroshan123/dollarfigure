package arraysorting;
import java.util.Scanner; 
public class simpleclass {
	
	    public static void main(String[] args) {
	    
	        Scanner s = new Scanner (System.in);
	       
	        System.out.println("number");
	        
	        int p = s.nextInt();

	        int[] a = new int[p];
	        int[] b = new int[p+1];
	        
	        for(int i = 0; i < p; i++)
	        {
	            a[i] = s.nextInt();
	              System.out.println(a[i]);
	        }
	        int highest=a[0],j=1,lowest=a[0],nexthighest=a[0],y=0;
	        for(int i = 0; i < p; i++)
	        {
	        
	          if(a[i]>highest)
	          {
	              highest = a[i];
	                    
	          }

	          if(a[i]<lowest)
	          {
	              lowest = a[i];             
	          } 
	        }
	        
	        for(int i = 0; i < p; i++)
	        {
	           if(a[i]<highest&&a[i]>nexthighest)
	              {
	                  nexthighest  = a[i];
	              }}
	        
	        for(int i = 0; i < p+1; i++)
	        {   
	                if(a[i] == highest)
	            {
	             b[y]=nexthighest;
	             for(int k = 0; k < 3; k++)
	                {   
	                 int z = nexthighest+k;
	                  if(z==highest)
	                  {
	                b[y+1]=z;
	                 y=y+2; }
	                     
	                }
	            }
	            else  b[y]=a[i];
	            y++;
	             System.out.println(b[y]);
	        }
	             
	    }        
	}
