package pl.sda.arp4.inheritance.exceptions;

public class MainRzucanieWyjatkow {

    public static void main(String[] args) {
        try {
            metoda();
        } catch (Exception e) {
            System.out.println("so sorry");
        }
    }

    // rekurancja -> metoda wywołuje metode samą siebie
    public static void metoda() throws Exception {
       // metoda();
        // niejawny
     //   throw new RuntimeException("Runtime Yo!");
        throw new Exception(":(");
    }

    public static void drugaMetoda(){
        try{
            metoda();
        } catch (Exception e) {
            System.out.println("error occured");
            return; // konczy sie metoda
        } finally {
            // służy, żeby ostatecznie zwalniać zasoby, do sprzątania tego co było w try/catch
        System.out.println("la la la ");
}}}
