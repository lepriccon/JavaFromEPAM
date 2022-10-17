package ChapterTwo.VarA;

public class LongerLess {
    public static void main(String[] args) {
        if(args.length != 0){
            String longer = args[0];
            String less = args[0];
            for (String number : args){
              longer = number.length() > longer.length() ? number : longer;
              less = number.length() < less.length() ? number : less;
            }
            System.out.println("longer: " + longer + "\n less: " + less);
        }
    }
}
