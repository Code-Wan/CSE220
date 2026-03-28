package LAB03;

public class WRM {
    Patient dh;

    // The constructor is already created for you
    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        // To Do
        Patient P = new Patient(id, name, age, bloodgroup, null, null);
        Patient tail = dh.prev;
        tail.next = P;
        dh.prev = P;
        P.next = dh;
        P.prev = tail;
        System.out.println(" Registered " + name);
    }

    public void servePatient() {
        // To do
        if (dh.next == dh) {
            System.out.println(" No patients left to serve");
            return;
        }

        System.out.println(" Served " + dh.next.name);
        dh.next = dh.next.next;
        dh.next.prev = dh;
    }

    public void showAllPatient() {
        // To Do
        if (dh.next == dh) {
            return;
        }
        Patient curr = dh.next;
        while (curr.next != dh) {

            System.out.println(" ID: " + curr.id);
            curr = curr.next;
        }
    }

    public Boolean canDoctorGoHome() {
        if (dh.next == dh && dh.prev == dh) {
            return true;
        } else {
            return false;
        }
        // To Do

    }

    public void cancelAll() {
        // To Do
        dh.next = dh;
        dh.prev = dh;
        System.out.println("All Patients are cancelled");
    }

    public void reverseTheLine() {
        Patient head = dh;
        while (head.next != dh) {
            Patient temp = dh.next;
            dh.next = dh.prev;
            dh.prev = temp;
            head = temp;
        }
        while (dh.next != dh) {
            System.out.println(" ID: " + dh.next.id);
            dh = dh.next;
        }
        // To Do
    }

}
