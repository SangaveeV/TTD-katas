import java.util.stream.Stream;

public class StringCalculator {
    public int add(String numbers) throws NegativeNumberException {
        int sum=0;
        if(numbers=="")
            return 0;
        int[] inputNumbers= Stream.of(numbers.split("[,|\n|;]"))
                .mapToInt(Integer::parseInt).toArray();
        for (int number:inputNumbers) {
            if(number<0)
                throw new NegativeNumberException() ;
            if(number>1000){
                continue;
            }
            sum+=number;
        }
        return sum;
    }
}
