import java.util.*;

public class  Main {

    static HashMap<String,Integer> users = new HashMap<>();
    static HashMap<String,Integer> attempts = new HashMap<>();

    public static void main(String[] args){

        users.put("manish",1);
        users.put("admin",2);
        users.put("alice",3);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        attempts.put(username, attempts.getOrDefault(username,0)+1);

        if(users.containsKey(username)){
            System.out.println("Username already taken");
            suggest(username);
        }
        else{
            System.out.println("Username available");
        }

        sc.close();
    }

    static void suggest(String username){

        System.out.println("Suggestions:");

        for(int i=1;i<=3;i++){
            System.out.println(username+i);
        }

        System.out.println(username.replace("_","."));
    }
}