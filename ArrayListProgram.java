package Task12;

import java.util.*;

public class ArrayListProgram {
    public static void main(String[] args) {
    
        ArrayList<String> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("enter a name to add  or type (quit) to stop");
            String input=sc.nextLine();
            if(input.equalsIgnoreCase("quit")){
                break;

            }
            else{
                arr.add(input);
        }
}
            
        for(String name:arr){
        
        System.out.println(name);

        }

        
        
        System.out.println("enter the name to search");
        Scanner sc1=new Scanner(System.in);
        String input1=sc1.nextLine();
        if(arr.contains(input1)){
            System.out.println("name found: "+input1);
        }else{
            System.out.println("name not found");
        }
       




        System.out.println("enter the name to remove");
        Scanner sc2=new Scanner(System.in);
        String input2=sc2.nextLine();
        if(arr.contains(input2)){
            arr.remove(input2);
            System.out.println("the name removed sucessfully");
        }else{
            System.out.println("the name is not in the lsit");
        }
        System.out.println(arr);

        


        Collections.sort(arr);
        System.out.println(arr);
               

       System.out.println("no of names in the list is : "+arr.size());


        arr.clear();
       System.out.println("after clearing the list :");
       System.out.println(arr);

       sc.close();
       sc1.close();
       sc2.close();
    }
}