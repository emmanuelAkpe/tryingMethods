public class TryingMethods {
    /*
     * The trying methods has a number of methods 
     * that we use to perform specific tasks
     */
  String dayOfWeek(int day){
        switch(day){
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid Day";
        }
    }

     void PrintExamsScore(int mark) {
        
        if(mark>=80){
            System.out.println("You had A");
        }
        else if(mark >=75){
            System.out.println("You had  B");
        }
        else{
            System.out.println("You had C");
        }
    }

        //  Static Methods

     public static void sumWithWhile( ) {
         int  i = 1 ;
        int sum = 0;    
        while(i < 1000)
        {
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of numbers with while loop is :" +sum);
     }
 

         public static void sumOfEven() {
        int i,  sum=0;  
         for(i=13; i<=103; i++) 
         
            {  
                if(i%2 == 0){

                    sum += i;   
                }
            }  
            System.out.println("sum of even numbers between 12 and 103 is  "+sum);
     }

     public static void main(String[] args) {
        
               // Creating an Instance of the class
        TryingMethods dynamTryingMethods = new TryingMethods();
      
            System.out.println("Dynamic Methods");
        String day = dynamTryingMethods.dayOfWeek(4);
         System.out.println("The day is "+ day);

         // Print Exams Score
        dynamTryingMethods.PrintExamsScore(50);

        System.out.println("");
        System.out.println("Static Methods");
        sumWithWhile( );
        sumOfEven();
        
     }


}
