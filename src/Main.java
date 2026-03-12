import java.util.*;

public class Main {

    static HashMap<String,Integer> pageViews = new HashMap<>();

    public static void main(String[] args){

        processEvent("/news");
        processEvent("/sports");
        processEvent("/news");
        processEvent("/tech");

        showDashboard();
    }

    static void processEvent(String page){

        pageViews.put(page,pageViews.getOrDefault(page,0)+1);
    }

    static void showDashboard(){

        System.out.println("Page Views:");

        for(String page:pageViews.keySet()){

            System.out.println(page+" → "+pageViews.get(page));
        }
    }
}