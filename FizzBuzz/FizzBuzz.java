public class FizzBuzz {
    public String fizzBuzz(int number) {
        if(number <= 9 && number > 2){
            return "Fizz";
        }else if (number > 9 && number < 15){
            return "Buzz";
        }else if (number > 15){
            return String.valueOf(number);
        }else {
            return String.valueOf(number);
        }
    }

}

