package ds.stack;

//This forms part of the Stack exercise for this course.
//Here we are accepting a string as an input and reversing the order of the string using the Stack class. The result is then outputted
//to the screen

public class App {
    public static void main(String args[]){
        String reversed = reverseString("Hello");
        System.out.println(reversed);
    }

    public static String reverseString(String str){
        int stackSize = str.length();
        Stack stack = new Stack(stackSize);

        for(int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i));
        }

        String output = "";

        while(!stack.isEmpty()){
            char value = stack.pop();
            output = output + value;
        }

        return output;
    }
}
