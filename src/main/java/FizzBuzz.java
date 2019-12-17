import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    private final String fizz = "Fizz";
    private final String buzz = "Buzz";
    List<String> result = new ArrayList<>();
    String output;

    public void play(int number) {
        for (int num = 1; num <= number; num++) {
            output = "";
            output += num % 3 == 0 ? fizz : "";
            output += num % 5 == 0 ? buzz : "";
            if(output==""){
                result.add(Integer.toString(num));
            }
            result.add(output);
        }
    }

    List<String> result() {
        return result;
    }
}
