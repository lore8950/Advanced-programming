public class ResearchInstitute {
    int number_of_scientists;
    int number_of_assistants;
    double grant_budget;

    // Constructor 1
    ResearchInstitute() {
        number_of_scientists = 0;
        number_of_assistants = 0;
        grant_budget = 0.0;
    }

    // Constructor 2
    ResearchInstitute(int scientists, int assistants) {
        number_of_scientists = scientists;
        number_of_assistants = assistants;
        grant_budget = 0.0;
    }

    // Constructor 3
    ResearchInstitute(int scientists, int assistants, double budget) {
        number_of_scientists = scientists;
        number_of_assistants = assistants;
        grant_budget = budget;
    }

    // Display method
    void displayInfo() {
        System.out.println("Scientists: " + number_of_scientists);
        System.out.println("Assistants: " + number_of_assistants);
        System.out.println("Grant Budget: " + grant_budget);
        System.out.println("---------------------");
    }
}

class ResearchInstituteTest {
    public static void main(String[] args) {

        ResearchInstitute r1 = new ResearchInstitute();
        ResearchInstitute r2 = new ResearchInstitute(5, 10);
        ResearchInstitute r3 = new ResearchInstitute(8, 15, 250.50);

        r1.displayInfo();
        r2.displayInfo();
        r3.displayInfo();
    }
}

