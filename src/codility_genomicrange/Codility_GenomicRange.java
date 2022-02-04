/*
 * Solution to Codility Genomic Range exercise question
 */
package codility_genomicrange;

/**
 *
 * @author kubrabas
 */
public class Codility_GenomicRange {

 public static void main(String[] args) {
    
        String s= " CAGCCTA";
        String substr ="";
        int min=0;
        
        int[] P = {2,5,0};
        int[] Q = {4,5,6};
        
        int[] arr = new int[P.length];
        
        for (int i = 0; i < P.length; i++) {
            
            substr= s.substring(P[i]+1, Q[i]+2);
            
            System.out.println(substr);
                       
            if(substr.contains("A"))
                  min = 1;
            else if(substr.contains("C"))
                  min = 2;
            else if(substr.contains("G"))
                  min = 3;
            else if(substr.contains("T"))
                  min = 4;  
            
            arr[i]=min;
        }
        
        for(int a : arr)
        System.out.print(a + " " );        
    }
    
}
