import java.util.*;
class cyber{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String correctpassword="Code@1234";
        int attempts=0;
an
        while(attempts<3){
            System.out.println("enter your password :");
            String input=sc.nextLine();
            if (input.equals(correctpassword)){
                System.out.println("access granted !!");
            }
            else{
                attempts++;
                System.out.println(("wrong password entered..chances left-->>")+(3-attempts));
            
            }
        }
        System.out.println("access denied..");
    }
}
    
    
       

        
       
        
    

        

    
        
          



    
