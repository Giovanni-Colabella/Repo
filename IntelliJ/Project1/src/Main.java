import java.util.*;

class NavinException extends Exception {
    public NavinException(String string) {
        super(string);
    }
}

public class Main {
    public static void main(String[] args) {
        /*int i = 20;
        int j = 0;

        int nums[] = new int[5];

        try {
            System.out.println(nums[1]);
            System.out.println(nums[4]);
            j = 18/i;
            if(j == 0){
                throw new NavinException("i dont want to print zero");
            }
        }
        catch (NavinException e){
            j = 18;
            System.out.println("that's the default output " +e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.print("Array index out of bounds... stay in your limits!");
        }
        catch(Exception e){
            System.out.println("Something went wrong!");
        }

        System.out.println(j);*/
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(3);
        nums.add(7);
        nums.add(2);
        nums.add(8);

        for(int n : nums) {
            System.out.println(n);
        }
    }
}