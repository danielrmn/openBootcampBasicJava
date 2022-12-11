package notes.refactoring;

public class main {

    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    /*double calculateExtraSalary(){
        double result = 0;
        if (seniority<1){
            return 0;
        }
        if (education<1){
            return 0;
        }
        if (incidents<10){
            return 0;
        }
        if (!certification){
            return 0;
        }
        // calculate extra salary
        return 0;
    }*/

    double calculateExtraSalary(){
        double result;
        if (!isElegibleExtraSalary()){
            return 0;
        }
        // calculate extra salary

        // ...
        return 0;
    }

    public boolean isElegibleExtraSalary(){
        boolean estudios = seniority<1 || education<1;
        boolean antiguedad = incidents<10 || !certification;
        return estudios || antiguedad;
    }

}
