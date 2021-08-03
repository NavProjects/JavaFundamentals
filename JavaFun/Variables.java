public class Variables {
    public static void main(String[] args){
        int ourInt; // we can declare a variable without setting its value
        ourInt = 400; // we can assign a value to the variable later in our code
        int oneLineInt = 400; // we can assign a value to the variable later in our code
        double pi = 3.14159265; // we can also declare and assign on the same line
        boolean bool = true;
        char singleCharacter = 'A';
        String multipleCharacters = "ABC";
        String string1 = "My name is ";
        String string2 = "Michael";
        String string3 = string1.concat(string2);
        System.out.println(string3);
        // will output My name is Michael
        String ninja1 = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
        System.out.println(ninja1);
        // Will print out Hi Jack, you owe me $25.00 !
        // Where %s is expecting a string
        // And %.2f is expecting a float data type. The value 2 will just place two values to right of the decimal point.
        String ninja = "Welcome to Coding Dojo!";
        int a = ninja.indexOf("Coding"); // a is 11
        int b = ninja.indexOf("co"); // b is 3
        int c = ninja.indexOf("pizza"); // c is -1, "pizza" is not found
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        String sentence = "   spaces everywhere!   ";
        System.out.println(sentence.trim());
        String a1 = "HELLO";
        String b1 = "world";
        System.out.println(a1.toLowerCase()); // hello
        System.out.println(b1.toUpperCase()); // WORLD
        String a2 = new String("word");
        String b2 = new String("word");
        System.out.println(a2 == b2); // false. not the same exact object.
        System.out.println(a2.equals(b2)); // true. same exact characters.
        boolean defenderGuarding = true;
        boolean closeToBasket = true;
        if(defenderGuarding == true) {
            System.out.println("Pass The Ball");
        } else if(closeToBasket == true) {
            System.out.println("Shoot The Ball");
        } else {
            System.out.println("Dribble The Ball");
        }
    }
}

/*DATA TYPES
int: An int holds integers, like 4 or -51. It is limited to numbers between -2147483648 and 2147483647, or around 2 billion.+

long: These are for larger integers up to 2^63, or around 2 quintillion.

boolean: A boolean represents one of two values: true or false.

double:  Doubles are for floating point numbers like 3.14159265. We will use double rather than float almost exclusively, because they are far more precise.

char: The char data type is used to store a single character, like '$' or 'A'.
//OBJECT TYPES
Integer: The Integer class wraps a value of the primitive type int into an object.

Long: The Long class wraps a value of the primitive type long in an object.

Boolean: The Boolean class wraps a value of the primitive type boolean in an object.

Double: The Double class wraps a value of the primitive type double in an object.

Character: The Character class wraps a value of the primitive type char in an object.

String: Represents a sequence of characters, like a Python string.

BigInteger: Represents an integer that can be any size at all.
*/