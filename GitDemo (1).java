/*****
 Sathvik Yerragolla
 ******/
public class GitDemo {
    
    private double previousNumber;
    
    public GitDemo() {
        previousNumber = 1;
    }
    
    /*****
     * This function adds the given number to the private "previousNumber"
     * stored in the GitDemo class. 
     * 
     * @param num - A number that should be added to GitDemo:previousNumber
     * @return the updated value of 'previousNumber'
    *****/
    public double addNumber(double num) {
        System.out.print("Add num to previousNumber");
        previousNumber= num +previousNumber;
        return previousNumber;
    }
    
    /*****
     * Description of function goes here
     *
     * @param - description of passed in arguments go here
     * @return - description of return value goes here
     *****/
   
  
  
  
  
  
  
  public double function1(int num) {
        
 double factorialNumber=0;

        double newNumber=1;
        for int (i=1; i<= num;++i)
        {
            newNumber=newNumber*i;
            
            }
        return newNumber;
    
  }
  
  
  public double function2(int num){
        
        while (num!=0)
        {
            double temp = num % 10;
            
            factorialNumber= factorialNumber*10 +temp;
            
            num /= 10;
            
        }
        
   
    return factorialNumber;
    
    }
}
