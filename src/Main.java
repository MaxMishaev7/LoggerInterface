import ru.mishaev.max.*;

public class Main {
    public static void main(String[] args) {
        Logger simpleLog = new SimpleLogger();
        simpleLog.log("Hello to you!");

        System.out.println();

        Logger smartLog = new SmartLogger();
        smartLog.log("Hello friends!!!");
        smartLog.log("Bye-Bye friends!");
        smartLog.log("Something Error in method");
        smartLog.log("ThisisError");
    }
}