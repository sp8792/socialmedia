import java.util.*;

public class Main {

    static String[] parking = new String[10];

    public static void main(String[] args){

        park("ABC123");
        park("XYZ999");
        park("CAR456");

        showParking();
    }

    static void park(String plate){

        int index = Math.abs(plate.hashCode()%parking.length);

        while(parking[index]!=null){

            index = (index+1)%parking.length;
        }

        parking[index] = plate;

        System.out.println("Parked "+plate+" at spot "+index);
    }

    static void showParking(){

        System.out.println("Parking Status:");

        for(int i=0;i<parking.length;i++){

            System.out.println(i+" → "+parking[i]);
        }
    }
}