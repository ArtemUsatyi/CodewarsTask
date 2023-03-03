package CodeWars;

import java.util.Arrays;

public class RemoveDuplicateWord {
    public static void main(String[] args) {
        String text = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
        String[] arrayText = text.split(" ");
        String currentText = "";
        String modifiedText = "";

        for (String s : arrayText) {
            if (!currentText.equals(s)) {
                currentText = s;
                modifiedText = modifiedText + " " + currentText;
            }
        }


        System.out.println(modifiedText.trim());


    }
}
