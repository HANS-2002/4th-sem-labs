import java.io.*;
import java.util.*;

class Department {
    String DName;
    String HoDName;

    Department(String DName, String HoDName) {
        this.DName = DName;
        this.HoDName = HoDName;
    }

    public void PrintDepartmentDetails() {
        System.out.println("Department name -> " + this.DName);
        System.out.println("Department HOD name -> " + this.HoDName);
    }
}

class StaffMember extends Department {
    String staffName;
    String staffQualification;

    StaffMember(String staffName, String staffQualification, String DName, String HoDName) {
        super(DName, HoDName);
        this.staffName = staffName;
        this.staffQualification = staffQualification;
    }

    public void printStaffDetails() {
        System.out.println("Staff name -> " + this.staffName);
        System.out.println("Staff qualification -> " + this.staffQualification);
    }
}

public class examp {
    public static void main(String args[]) {
        StaffMember s = new StaffMember("STAFF NAME", "STAFF Qualification", "DEPARTMENT Name", "HOD Name");
        s.PrintDepartmentDetails();
        s.printStaffDetails();
    }
}
