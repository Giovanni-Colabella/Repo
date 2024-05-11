import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


class NavinException extends Exception {
    public NavinException(String string) {
        super(string);
    }
}
class GiovanniException extends Exception {
    public GiovanniException(String string) { System.out.println(string); }
}

class A{
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int i){
        super();
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }
    public B(int i){
        super(i);
        System.out.println("in B int");
    }
}

public class Main {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        int nums[] = new int[5];

        try {
            System.out.println(nums[1]);
            System.out.println(nums[4]);
            if(j == 0){
                throw new GiovanniException("Attenzione, riscontrato errore... riprovare piu' tardi");
            }
        }
        /*catch (NavinException e){
            j = 18;
            System.out.println("that's the default output " +e);
        }*/
        catch(GiovanniException e){
            System.out.println("GiovanniException ");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.print("Array index out of bounds... stay in your limits!");
        }
        catch(Exception e){
            System.out.println("Something went wrong!");
        }

        System.out.println(j);
        /*Set<Integer> nums = new HashSet<Integer>();
        nums.add(3);
        nums.add(7);
        nums.add(2);
        nums.add(8);

        for(int n : nums) {
            System.out.println(n);
        }

        Map<String, Integer> students = new HashMap<>();
        students.put("Navin",25);
        students.put("Giovanni",19);

        System.out.println(students.keySet());

        for(String key : students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }*/

        System.out.println();
        System.out.println();
        B b = new B(5);
    }
}