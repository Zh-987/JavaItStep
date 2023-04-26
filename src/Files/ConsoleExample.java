package Files;

import java.io.Console;

public class ConsoleExample {
    public static void main(String args[]){
        Console console = System.console();
        if(console!=null){
            String login = console.readLine("Enter Login: ");
            char[] password = console.readPassword("Enter Password: ");

            console.printf("Entered login: %s\n",login);
            console.printf("Entered password: %s\n",password);
        }
    }
}
