package edu.gcc.wafflehouse;

import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public class Course {

    // Some extra data
    private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm a");

    // Member variables. These *should* mirror closely the member
    // variables in Deserialize.java, just renamed to be more
    // intuitive
    private long id;
    private String subject;
    private int code;
    private char section;
    private String name;
    private ArrayList<Professor> professors;
    private int creditHours;
    private int openSeats;
    private int totalSeats;
    private int year;
    private String semester; // {Fall}, {Spring}, etc.
    private ArrayList<Timeslot> times;
    private boolean isLab;
    private boolean isOpen;
    private String location;

    // For Jackson deserialization
    public Course() {}

    public Course(long id,
                  String subject,
                  int code,
                  char section,
                  String name,
                  ArrayList<Professor> professors,
                  int creditHours,
                  int openSeats,
                  int totalSeats,
                  int year,
                  String semester,
                  ArrayList<Timeslot> times,
                  boolean isLab,
                  boolean isOpen,
                  String location) {
        this.id = id;
        this.subject = subject;
        this.code = code;
        this.section = section;
        this.name = name;
        this.professors = professors;
        this.creditHours = creditHours;
        this.openSeats = openSeats;
        this.totalSeats = totalSeats;
        this.year = year;
        this.semester = semester;
        this.times = times;
        this.isLab = isLab;
        this.isOpen = isOpen;
        this.location = location;
    }

    public long getID() {
        return id;
    }
    public String getSubject() {
        return subject;
    }
    public int getCode() {
        return code;
    }
    public char getSection() {
        return section;
    }
    public String getName() {
        return name;
    }
    public ArrayList<Professor> getProfessors() {
        return professors;
    }
    public int getCreditHours() {
        return creditHours;
    }
    public int getOpenSeats() {
        return openSeats;
    }
    public int getTotalSeats() {
        return totalSeats;
    }
    public int getYear() {
        return year;
    }
    public String getSemester() {
        return semester;
    }
    public ArrayList<Timeslot> getTimes() {
        return times;
    }
    public boolean getIsLab() {
        return isLab;
    }
    public boolean getIsOpen() {
        return isOpen;
    }
    public String getLocation() {
        return location;
    }

    public String timesToString() {
        StringBuilder sb = new StringBuilder();
        for (Timeslot time : times) {
            sb.append(time.toString());
        }
        return sb.toString();
    }

    public String professorsToString() {
        StringBuilder sb = new StringBuilder();
        for (Professor prof : professors) {
            sb.append(prof.toString());
        }
        return sb.toString();
    }
}
