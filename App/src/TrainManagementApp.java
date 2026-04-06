import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;

public class TrainManagementApp {

    public static void main(String[] args) {

        // =============================
        // UC1: Initialize Train
        // =============================

        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // =============================
        // UC2: Passenger Bogies
        // =============================

        System.out.println("\nAdding Passenger Bogies...");

        ArrayList<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies:");
        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing AC Chair:");
        System.out.println(passengerBogies);

        if (passengerBogies.contains("Sleeper")) {

            System.out.println("\nSleeper bogie exists.");

        }

        System.out.println("\nFinal Passenger List:");
        System.out.println(passengerBogies);

        // =============================
        // UC3: Unique Bogie IDs
        // =============================

        System.out.println("\nTracking Unique Bogie IDs...");

        Set<String> bogieIDs = new HashSet<>();

        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIDs);

        // =============================
        // UC4: Ordered Train (LinkedList)
        // =============================

        System.out.println("\nMaintaining Ordered Train Consist...");

        LinkedList<String> orderedTrain = new LinkedList<>();

        // Add bogies
        orderedTrain.add("Engine");
        orderedTrain.add("Sleeper");
        orderedTrain.add("AC");
        orderedTrain.add("Cargo");
        orderedTrain.add("Guard");

        System.out.println("Initial Train Order:");
        System.out.println(orderedTrain);

        // Insert Pantry Car at position 2
        orderedTrain.add(2, "Pantry Car");

        System.out.println("\nAfter Adding Pantry Car:");
        System.out.println(orderedTrain);

        // Remove first and last
        orderedTrain.removeFirst();
        orderedTrain.removeLast();

        System.out.println("\nFinal Train Order:");
        System.out.println(orderedTrain);

        System.out.println("\nProgram continues...");

    }

}