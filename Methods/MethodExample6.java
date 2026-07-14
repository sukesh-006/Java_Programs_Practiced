/*
 * Program Name: MethodExample6
 * Problem Statement: Method example 6
 */
class MethodExample6{
    public static void main(String[] args) {
        System.out.println("Employee Innformation");
        System.out.println("************************");
        companyDetails();
        System.out.println("----------------------");
        companyName = "Infosys";
        companyDetails();
    }
    static String companyName="Wipro";
    static void companyDetails(){
        System.out.println("Company name "+companyName);
        System.out.println("Location Chennai");
        System.out.println("Domain Testing");


    }
}