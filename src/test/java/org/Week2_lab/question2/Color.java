package org.Week2_lab.question2;

public enum Color {

    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF"),
    YELLOW("#FFFF00"),
    BLACK("#000000");

    private final String colorCode;

    Color(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorCode() {
        return colorCode;
    }
    public static void printColorAndCode() {
        for (Color color : Color.values()) {
            System.out.println(color + ": " + color.getColorCode());
        }
    }

    public static void main(String[] args) {
        Color.printColorAndCode();
    }

}
