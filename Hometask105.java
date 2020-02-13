package unit1;
public class Hometask105 {
		   public static void main(String args[]){
		      int i,total;
		      int a[] = {98, 5055};
		      int n = 2;
		      total = 0;

		      for(i=0; i<n; i++) {
		         total += a[i];
		      }
		      System.out.println("Average: "+ total/(float)n);
		   }
		}