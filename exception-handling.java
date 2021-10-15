/*
Write a Java program to handle each of the following exception during execution. Write
a suitable finally block for the selected exceptions wherever found appropriate.
a) InterruptedException
b) ArrayIndexOutOfBoundsException
c) IllegalArgumentException
d) IndexOutOfBoundsException
e) NegativeArraySizeException
f) NullPointerException
g) IllegalAccessException
*/



public class Main {
    public static void IEtest(){                       //Interrupted exception
        try{
            Thread.sleep(1000);
            System.out.println("task to interrupt");
        }catch (InterruptedException e) {
            System.out.println("Exception Handled :: " + e);
        }
    }
    public static void AIOB(){                         // Array index out of bound
        try{
            int ar[]=new int[5];
            ar[10]=50;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Handled :: "+e);
        }

    }


    public static void IAE(int a){                     // Illegal argument exception
        try{
           if(a<0)
               throw new IllegalArgumentException("Number less than 0");
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception Handled :: "+e);
        }
        finally{
            System.out.println("Finally will still execute. and lets continue");
        }
    }
    public static void IOB(){                          // Index out of bound
        try{
            int arr[]=new int[5];
            arr[10]=0;
        }catch (IndexOutOfBoundsException e){
            System.out.println("No such element exist.");
        }
    }
    public static void NAS(){                          // Negative array size
        try{
            int arr[]=new int [-1];
        }catch (NegativeArraySizeException e){
            System.out.println("Exception handled :: "+e);
        }
    }
    public static void NPE(){                          //Null pointer exception
        try{
            String str=null;
            if(str.equals("Java")){
                System.out.println("OHH");
            }
        }catch (NullPointerException e){
            System.out.println("Null pointer Exception handled :: "+e);
        }

    }
    public static void IAE(){               //IllegalAccessException
        try{
            int a=-1;
            if(a<0){
                throw new IllegalAccessException("a cannot be less than 0");
            }
        }
        catch(IllegalAccessException e){
            System.out.println("Exception handled :: "+e);
        }
        
    }


    public static void main(String[] args) {
        IEtest();
        AIOB();
        IAE(-10);
        IOB();
        NAS();
        NPE();
        IAE();
    }
}
