package ChapterTwo.VarA;

public class AverageLength {
    public static void main(String[] args) {
        double average = 0;
        for (String a : args){
            average += a.length();
        }
        average /= args.length;
        System.out.println(average);
        for (String a : args){
            if (a.length() > average){
                System.out.println(a + " length: " + a.length());
            }
        }
    }

}
