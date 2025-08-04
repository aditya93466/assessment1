//public class EmployeeOnboardingSystem {
//    private String name;
//    private int age;
//    private String city;
//    private float joiningPercentage;
//    private char performanceGrade;
//    final String COMPANY_NAME = "HDFC LIFE";
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public float getJoiningPercentage() {
//        return joiningPercentage;
//    }
//
//    public void setJoiningPercentage(float joiningPercentage) {
//        this.joiningPercentage = joiningPercentage;
//    }
//
//    public char getPerformanceGrade() {
//        return performanceGrade;
//    }
//
//    public void setPerformanceGrade(char performanceGrade) {
//        this.performanceGrade = performanceGrade;
//    }
//
//    public String getCOMPANY_NAME() {
//        return COMPANY_NAME;
//    }
//
//}

public class EmployeeOnboardingSystem {

    public static void main(String[] args) {

        String employeeName = "Priya Mehra";
        int employeeAge = 22;
        String employeeCity = "Pune";
        float joiningPercentage = 86.7f;
        char performanceGrade;
        final String COMPANY_NAME = "HDFC Life";

        System.out.println("Welcome to " + COMPANY_NAME + "!");
        System.out.println("Employee: " + employeeName + " | Age: " + employeeAge + " | City: " + employeeCity);
        System.out.println("Joining Percentage: " + joiningPercentage);


        if(joiningPercentage > 90) {
            performanceGrade = 'A';
        } else if (joiningPercentage >= 75 && joiningPercentage <= 90) {
            performanceGrade = 'B';
        } else if (joiningPercentage >= 60 && joiningPercentage <= 74) {
            performanceGrade = 'C';
        } else {
            performanceGrade = 'D';
        }

        System.out.println("Performance Grade: " + performanceGrade);

        String hrFeedback = switch (performanceGrade) {
            case 'A' -> "Star Performer";
            case 'B' -> "Strong Start";
            case 'C' -> "Satisfactory";
            case 'D' -> "Needs Mentorship";
            default -> "Unknown Grade";
        };
        System.out.println("HR Feedback: " + hrFeedback);
        System.out.println();

        System.out.println("--- Prime Employee Codes ---");
        for (int i = 1; i <= 50; i++) {
            boolean isPrime = true;
            if (i == 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        System.out.println("--- ID Card Pattern ---");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("--- Compensation Details ---");
        float monthlyCTC = 58000.50f;
        int monthlyCTCInt = (int) monthlyCTC;

        System.out.println("Monthly CTC (float): " + monthlyCTC);
        System.out.println("Monthly CTC (int after typecast): " + monthlyCTCInt);


        float annualCTC = monthlyCTC * 12;
        annualCTC += 10000;

        System.out.println("Annual CTC (including bonus): " + annualCTC);
    }
}
