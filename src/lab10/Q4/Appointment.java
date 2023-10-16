package lab10.Q4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

class Appointment implements Searchable {
    private int day, month, year, startTime, endTime;

    public Appointment(int day, int month, int year, int startTime, int endTime) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void saveAppointment() {
        try {
            String dateStartTime = String.format("%d,%d,%d,%d", day, month, year, startTime);
            String dateEndTime = String.format("%d,%d,%d,%d", day, month, year, endTime);
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("src/lab10/Q4/appointment.txt", true));
            if (search(dateStartTime, dateEndTime)) {
                outputStream.printf("%d,%d,%d,%d,%d\n", day, month, year, startTime, endTime);
                System.out.println(this + " is saved.");
            } else {
                System.out.println(this + " is not available.");
            }
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Precondition: The dates in dateStartTime and dateEndTime are the same.
    @Override
    public boolean search(String dateStartTime, String dateEndTime) {
        // Extract values
        String[] dateStartTimeValues = dateStartTime.split(",");
        String[] dateEndTimeValues = dateEndTime.split(",");
        int day = Integer.parseInt(dateStartTimeValues[0]);
        int month = Integer.parseInt(dateStartTimeValues[1]);
        int year = Integer.parseInt(dateStartTimeValues[2]);
        int startTime = Integer.parseInt(dateStartTimeValues[3]);
        int endTime = Integer.parseInt(dateEndTimeValues[3]);

        try {
            Scanner inputStream = new Scanner(new FileInputStream("src/lab10/Q4/appointment.txt"));
            while (inputStream.hasNextLine()) {
                String[] appointmentInfo = inputStream.nextLine().split(",");
                int d = Integer.parseInt(appointmentInfo[0]);
                int m = Integer.parseInt(appointmentInfo[1]);
                int y = Integer.parseInt(appointmentInfo[2]);
                int st = Integer.parseInt(appointmentInfo[3]);
                int et = Integer.parseInt(appointmentInfo[4]);
                if (day == d && month == m && year == y &&
                        ((startTime <= st && et <= endTime)
                                || (st < startTime && startTime < et)
                                || (st < endTime && endTime < et)))
                    return false;
            }
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Appointment on %d-%d-%d from %d to %d",
                day, month, year, startTime, endTime);
    }
}
