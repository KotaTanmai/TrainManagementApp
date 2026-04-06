import java.util.ArrayList;
import java.util.List;

public class TrainManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // UC1: Initialize Train Consist
        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // =============================
        // UC2: Add Passenger Bogies
        // =============================

        System.out.println("\nAdding Passenger Bogies...");

        // Create Passenger Bogie List
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Add Bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display List After Adding
        System.out.println("Passenger Bogies After Adding:");
        System.out.println(passengerBogies);

        // Remove One Bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing AC Chair:");
        System.out.println(passengerBogies);

        // Check Existence
        if (passengerBogies.contains("Sleeper")) {

            System.out.println("\nSleeper bogie exists in the list.");

        } else {

            System.out.println("\nSleeper bogie does NOT exist.");

        }

        // Final List
        System.out.println("\nFinal Passenger Bogie List:");
        System.out.println(passengerBogies);

        System.out.println("\nProgram continues...");

    }

}