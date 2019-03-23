public class RemoveUpperOrLowerCaseLetters {

    public static void main(String[] args) {
        String str = "SiMiOn";
        String result = str.replaceAll("[A-Z]","");
        System.out.println(result);
    }
}
