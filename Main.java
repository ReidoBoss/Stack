public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(12);
        stack.push(1);
                stack.push(2);
        stack.push(3);
        stack.pop();
        stack.display();
    }
}
