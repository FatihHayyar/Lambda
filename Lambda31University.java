public class Lambda31University {
    private String universityName;
    private String department;
    private int numberOfTotalSturdents;
    private double avarageOfNotes;

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        department = department;
    }

    public int getNumberOfTotalSturdents() {
        return numberOfTotalSturdents;
    }

    public void setNumberOfTotalSturdents(int numberOfTotalSturdents) {
        this.numberOfTotalSturdents = numberOfTotalSturdents;
    }

    public double getAvarageOfNotes() {
        return avarageOfNotes;
    }

    public void setAvarageOfNotes(double avarageOfNotes) {
        this.avarageOfNotes = avarageOfNotes;
    }

    public Lambda31University() {
    }

    public Lambda31University(String universityName, String department, int numberOfTotalSturdents, double avarageOfNotes) {
        this.universityName = universityName;
        this.department = department;
        this.numberOfTotalSturdents = numberOfTotalSturdents;
        this.avarageOfNotes = avarageOfNotes;
    }

    @Override
    public String toString() {
        return "Lambda31University{" +
                "universityName='" + universityName + '\'' +
                ", department='" + department + '\'' +
                ", numberOfTotalSturdents=" + numberOfTotalSturdents +
                ", avarageOfNotes=" + avarageOfNotes +
                '}';
    }
}
