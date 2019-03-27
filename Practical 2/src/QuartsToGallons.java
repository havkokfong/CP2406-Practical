public class QuartsToGallons {
    public static void main(String[] args){
        int NUMBEROFQUART = 5;
        int NUBEROFQUARTPERJOB = 28;
        int totalGallon = NUBEROFQUARTPERJOB / NUMBEROFQUART;
        int totalGuarts = NUBEROFQUARTPERJOB % NUMBEROFQUART;
        System.out.println("This job needs " + totalGallon + " gallon " + totalGuarts +" to finish");
    }
}
