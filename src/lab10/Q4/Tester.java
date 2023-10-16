package lab10.Q4;

public class Tester {
    public static void main(String[] args) {
        Appointment appointment1 = new Appointment(18, 1, 2023, 10, 20);
        appointment1.saveAppointment();
        Appointment appointment2 = new Appointment(18, 1, 2023, 0, 12);
        appointment2.saveAppointment();
        Appointment appointment3 = new Appointment(18, 1, 2023, 12, 15);
        appointment3.saveAppointment();
        Appointment appointment4 = new Appointment(18, 1, 2023, 20, 22);
        appointment4.saveAppointment();
    }
}
