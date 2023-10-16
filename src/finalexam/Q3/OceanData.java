package finalexam.Q3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OceanData {
    public static void main(String[] args) {
        String inputFile = "src/finalexam/ocean_data.csv";
        DataBuoy[] data = new DataBuoy[25];
        float avg_water_temp;

        loadData(inputFile, data);
        showData(data);

        avg_water_temp = calculateAvgWaterTemp(data);
        System.out.println("\nAverage water temperature is " + avg_water_temp);

        printMap(data, avg_water_temp);
    }

    public static void loadData(String inputFile, DataBuoy[] data) {
        try {
            Scanner sc = new Scanner(new FileInputStream(inputFile));
            for (int i = 0; sc.hasNextLine(); i++) {
                String[] args = sc.nextLine().split(",");
                DataBuoy dataBuoy = new DataBuoy(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Float.parseFloat(args[3]), Float.parseFloat(args[4]));
                data[i] = dataBuoy;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found.");
        }
    }

    public static void showData(DataBuoy[] data) {
        System.out.println("Data read from buoy:");
        System.out.printf("%-18s%-9s%-9s%-9s%-9s\n", "buoy_id", "lat", "long", "air_t", "water_t");
        for (DataBuoy dataBuoy : data)
            System.out.println(dataBuoy);
    }

    public static float calculateAvgWaterTemp(DataBuoy[] data) {
        float sum = 0;
        for (DataBuoy dataBuoy : data)
            sum += dataBuoy.getWaterTemperature();
        return sum / data.length;
    }

    public static void printMap(DataBuoy[] data, float avg_water_temp) {
        char[][] map = new char[21][21];
        map[10][10] = 'N';
        for (DataBuoy dataBuoy : data) {
            char c;
            if (dataBuoy.getWaterTemperature() > avg_water_temp)
                c = 'H';
            else if (dataBuoy.getWaterTemperature() < avg_water_temp)
                c = 'C';
            else
                c = 'A';
            map[10 - dataBuoy.getLatitude()][10 + dataBuoy.getLongitude()] = c;
        }
        for (char[] row : map) {
            for (char v : row)
                System.out.print(v == 0 ? '~' : v);
            System.out.println();
        }
    }
}

