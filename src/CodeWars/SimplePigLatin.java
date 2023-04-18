package CodeWars;

public class SimplePigLatin {
    public static void main(String[] args) {
        String str = "Pig latin is cool !";

        String convertStr = "";
        for (String elem : str.split(" ")) {
            if (elem.matches("[a-zA-Z]+")) {
                convertStr += elem.substring(1).concat(elem.substring(0, 1)).concat("ay").concat(" ");
            } else convertStr += elem;
        }
        System.out.println(convertStr.trim());

//        Алтернативный вариант
//        return Arrays.stream(str.trim().split(" "))
//                .map(v -> v.matches("[a-zA-Z]+") ? v.substring(1).concat(v.substring(0, 1)).concat("ay") : v)
//                .collect(Collectors.joining(" "));
    }
}
