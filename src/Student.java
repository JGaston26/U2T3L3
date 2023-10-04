public class Student {
    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores;
    private int testScoreCount;

    private double highestScore;

    public Student(String firstName, String lastName, int gradYear)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        accumulatedTestScores = 0;
        testScoreCount = 0;
        highestScore = 0;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public double getHighestScore()
    {
        return highestScore;
    }
    public void changeFirstName(String newFirstName)
    {
        firstName = newFirstName;
    }
    public void changeLastName(String newLastName)
    {
        lastName = newLastName;
    }

    public void setGradYear(int newGradYear)
    {
        gradYear = newGradYear;
    }
    public void addTestScore(double newTestScore)
    {
        if (newTestScore > highestScore)
        {
            highestScore = newTestScore;
        }
        accumulatedTestScores += newTestScore;

        testScoreCount ++;
    }
    public double averageTestScore()
    {
        return accumulatedTestScores/testScoreCount;
    }
    public boolean isPassing()
    {
        if(averageTestScore() >= 65)
        {
            return true;
        }else {
            return false;
        }
    }


    public void printStudentInfo()
    {
        System.out.println("Student Full Name: " + firstName + " " + lastName);
        System.out.println("Graduation year: " + gradYear);
        System.out.println("Number of tests: " + testScoreCount);
        System.out.println("Average Test Score: " + averageTestScore());
        System.out.println(highestScore);
        System.out.println("Is passing: " + isPassing());
    }

}


