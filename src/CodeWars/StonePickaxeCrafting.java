package CodeWars;

public class StonePickaxeCrafting {
    public static void main(String[] args) {

        String[] array = {"Sticks", "Cobblestone", "Sticks", "Cobblestone", "Cobblestone", "Cobblestone", "Cobblestone", "Sticks",
                "Sticks", "Cobblestone"};
        int sticks = 0;
        int cobblestone = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("Cobblestone")) {
                cobblestone++;
            } else if (array[i].equals("Sticks")) {
                sticks++;
            } else if (array[i].equals("Wood")) {
                sticks = sticks + 4;
            }
        }

        System.out.println(Math.min(cobblestone/3, sticks/2));
    }
}
