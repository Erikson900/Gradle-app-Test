/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demogradle;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public String getTestHello(){
        return "Extra Text here";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting() + " " + new App().getTestHello());
    }
}
