import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
        // UC3: Unique Bogie IDs (HashSet)
        // =============================

        System.out.println("\nTracking Unique Bogie IDs...");

        // Create HashSet
        Set<String> bogieIDs = new HashSet<>();

        // Add IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display Unique IDs
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIDs);

        System.out.println("\nProgram continues...");

    }

}