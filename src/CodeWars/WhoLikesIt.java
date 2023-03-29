package CodeWars;

public class WhoLikesIt {
    public static void main(String[] args) {
        String[] names = {"Alex", "Jacob", "Mark1", "Max22", "Jacob1", "Mark12", "Max224"};

        String textLikes = "no one likes this";
        for (int i = 0; i < names.length; i++) {
            if (textLikes.equals("no one likes this")) {
                textLikes = names[i];
            } else if (names[i].equals(names[names.length - 1])) {
                textLikes = textLikes.concat(" and ").concat(names[i]).concat(" likes this");
                break;
            } else if (i == 2) {
                textLikes = textLikes.concat(" and " + (names.length - 2) + " others like this");
                break;
            } else {
                textLikes = textLikes.concat(", ").concat(names[i]);
            }
            if (names.length == 1) textLikes = textLikes.concat(" like this");
        }
        System.out.println(textLikes);

        // можно использовать switch-case
//        switch (names.length) {
//            case 0: return "no one likes this";
//            case 1: return String.format("%s likes this", nms[0]);
//            case 2: return String.format("%s and %s like this", nms[0], nms[1]);
//        }
    }
}
