package com.workintech.developers;

public class HRManager extends Employee {
    public JuniorDeveloper[] juniorDevelopers;
    public MidDeveloper[] midDevelopers;
    public SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HR manager starts working");
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {
        if (index > juniorDevelopers.length - 1 || index < 0) {
            System.out.println("Exceeding junior developers array.");
        } else if (juniorDevelopers[index] != null) {
            System.out.println("Index already assigned.");
        } else {
            juniorDevelopers[index] = juniorDeveloper;
        }
    }

    public void addEmployee(int index, MidDeveloper midDeveloper) {
        if (index > midDevelopers.length - 1 || index < 0) {
            System.out.println("Exceeding junior developers array.");
        } else if (midDevelopers[index] != null) {
            System.out.println("Index already assigned.");
        } else {
            midDevelopers[index] = midDeveloper;
        }
    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
        if (index > seniorDevelopers.length - 1 || index < 0) {
            System.out.println("Exceeding junior developers array.");
        } else if (seniorDevelopers[index] != null) {
            System.out.println("Index already assigned.");
        } else {
            seniorDevelopers[index] = seniorDeveloper;
        }
    }
}
