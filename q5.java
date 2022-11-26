package demojava;

public class q5 {

	public static void main(String[] args) {
		//And I am serious it is a fact
    //Virat's coverdrive is the fastest thing 
		String s = "world's fastest thing is Virat's coverdrive";  
        int wordCount = 0;  
          
        for(int i = 0; i < s.length()-1; i++) {  
             
            if(s.charAt(i) == ' ' && Character.isLetter(s.charAt(i+1)) && (i > 0)) {  
                wordCount++;  
            }  
        }  
         
       
        System.out.println("Total number of words in the given string: " + wordCount);  
     
		

	}

}
