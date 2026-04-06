import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

class Bogie {

    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " - " + capacity;
    }

}

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        ArrayList<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println(passengerBogies);

        if (passengerBogies.contains("Sleeper")) {

            System.out.println("Sleeper bogie exists.");

        }

        System.out.println(passengerBogies);

        Set<String> bogieIDs = new HashSet<>();

        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");

        System.out.println(bogieIDs);

        LinkedList<String> orderedTrain = new LinkedList<>();

        orderedTrain.add("Engine");
        orderedTrain.add("Sleeper");
        orderedTrain.add("AC");
        orderedTrain.add("Cargo");
        orderedTrain.add("Guard");

        System.out.println(orderedTrain);

        orderedTrain.add(2, "Pantry Car");

        System.out.println(orderedTrain);

        orderedTrain.removeFirst();
        orderedTrain.removeLast();

        System.out.println(orderedTrain);

        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper");

        System.out.println(trainFormation);

        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 54);
        bogieCapacity.put("First Class", 24);

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {

            System.out.println(entry.getKey() + " Capacity: " + entry.getValue());

        }

        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 54));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Sleeper", 72));

        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println(bogieList);

        List<Bogie> filteredBogies = bogieList
                .stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println(filteredBogies);

        Map<String, List<Bogie>> groupedBogies =
                bogieList.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        System.out.println(groupedBogies);

        int totalSeats = bogieList
                .stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("Total Seating Capacity: " + totalSeats);

        System.out.println("Program continues...");

        // =========================
        // UC11 REGEX VALIDATION
        // =========================

        String trainID = "TRN-1234";
        String cargoCode = "PET-AB";

        String trainPatternString = "TRN-\\d{4}";
        String cargoPatternString = "PET-[A-Z]{2}";

        Pattern trainPattern = Pattern.compile(trainPatternString);
        Pattern cargoPattern = Pattern.compile(cargoPatternString);

        Matcher trainMatcher = trainPattern.matcher(trainID);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        if (trainMatcher.matches()) {

            System.out.println("Valid Train ID: " + trainID);

        } else {

            System.out.println("Invalid Train ID: " + trainID);

        }

        if (cargoMatcher.matches()) {

            System.out.println("Valid Cargo Code: " + cargoCode);

        } else {

            System.out.println("Invalid Cargo Code: " + cargoCode);

        }

    }

}