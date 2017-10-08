public class Twofer {
    public String twofer(String name) {
        String person = name != null ? name : "you";
        return "One for " + person + ", one for me.";
    }
}