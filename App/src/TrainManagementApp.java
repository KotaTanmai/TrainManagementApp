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

class GoodsBogie {

    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

}

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 54));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Sleeper", 72));

        // =========================
        // UC10 Reduce
        // =========================

        int totalSeats = bogieList
                .stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("Total Seating Capacity: " + totalSeats);

        // =========================
        // UC11 Regex Validation
        // =========================

        String trainID = "TRN-1234";
        String cargoCode = "PET-AB";

        Pattern trainPattern =
                Pattern.compile("TRN-\\d{4}");

        Pattern cargoPattern =
                Pattern.compile("PET-[A-Z]{2}");

        Matcher trainMatcher =
                trainPattern.matcher(trainID);

        Matcher cargoMatcher =
                cargoPattern.matcher(cargoCode);

        if (trainMatcher.matches()) {

            System.out.println("Valid Train ID");

        } else {

            System.out.println("Invalid Train ID");

        }

        if (cargoMatcher.matches()) {

            System.out.println("Valid Cargo Code");

        } else {

            System.out.println("Invalid Cargo Code");

        }

        // =========================
        // UC12 Safety Check
        // =========================

        List<GoodsBogie> goodsList = new ArrayList<>();

        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsList.add(new GoodsBogie("Open", "Coal"));
        goodsList.add(new GoodsBogie("Box", "Grain"));

        boolean isSafe =
                goodsList.stream()
                        .allMatch(g ->
                                !g.type.equals("Cylindrical")
                                        || g.cargo.equals("Petroleum")
                        );

        if (isSafe) {

            System.out.println("Train Safety Status: SAFE");

        } else {

            System.out.println("Train Safety Status: UNSAFE");

        }

        // =========================
        // UC13 Performance Comparison
        // =========================

        List<Bogie> largeList = new ArrayList<>();

        // Create large dataset
        for (int i = 0; i < 10000; i++) {

            largeList.add(new Bogie("Sleeper", 72));
            largeList.add(new Bogie("AC Chair", 54));
            largeList.add(new Bogie("First Class", 24));

        }

        // Loop Performance

        long loopStart = System.nanoTime();

        List<Bogie> loopFiltered = new ArrayList<>();

        for (Bogie b : largeList) {

            if (b.capacity > 60) {

                loopFiltered.add(b);

            }

        }

        long loopEnd = System.nanoTime();

        long loopTime = loopEnd - loopStart;

        System.out.println("Loop Filtering Time: "
                + loopTime + " ns");

        // Stream Performance

        long streamStart = System.nanoTime();

        List<Bogie> streamFiltered =
                largeList.stream()
                        .filter(b -> b.capacity > 60)
                        .collect(Collectors.toList());

        long streamEnd = System.nanoTime();

        long streamTime = streamEnd - streamStart;

        System.out.println("Stream Filtering Time: "
                + streamTime + " ns");

    }

}