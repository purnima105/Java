package CaseStudyQ;
/*WAP to display all number display -300 to -1 which when divided by 17 gives -7 as a
remainder and display sum of those number */
public class LoopInNegative {
    public static void main(String[] args) {
        int sum=0;
        for(int i=-300;i<=-1;i++)
        {
            if(i%17==-7)
            {
                System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println("the sum is "+sum);
    }
    
}
