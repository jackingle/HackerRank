//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Day8ASpace{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       
       
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();
        
        
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            myMap.put(name, phone);
            
            if(in.hasNext()) {
                in.nextLine();
            
            }
            
            
            
            
        }
        while(in.hasNext()){
            String name = in.nextLine();
            // Write code here
            
            Integer phone = myMap.get(name);
            
            if(phone==null) {
                System.out.println("Not found");
            }else
            {
            
            
            System.out.println(name + "=" + phone);
            }
            
            
            
        }
        in.close();
        
        
        
        
        
        
    }
}

