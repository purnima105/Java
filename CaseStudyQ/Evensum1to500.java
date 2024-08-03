//wap in java to display all the evensum from 1 to 500.
package CaseStudyQ;

public class Evensum1to500 {
    public static void main(String[] args) {
        int i;
        int sum=0;
        for(i=1;i<=500;i++)
        {
            if (i%2==0)
            {
                
                sum= sum+i;
                
            }
            
        }
        System.out.print(" The sum of even numbers from 1 to 500 is= "+sum);
    }
    
}
