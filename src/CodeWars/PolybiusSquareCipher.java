package CodeWars;

public class PolybiusSquareCipher {
    public static void main(String[] args) {
//        –еализовать шифрование по типу квадрата ѕолиби€
//          1	2	3	4	5
//        1	A	B	C	D	E
//        2	F	G	H	I/J	K
//        3	L	M	N	O	P
//        4	Q	R	S	T	U
//        5	V	W	X	Y	Z
//        ѕерва€ цифра Ч это номер строки, а втора€ цифра Ч номер столбца следующего квадрата. где I/J  - 24.
//        ”читываютс€ только заглавные буквы
        String text = "POLYBIUS SQUARE CIPHER";

        String[] arrayLetters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
                "V", "W", "X", "Y", "Z"};
        String[] arrayPolybius = {"11", "12", "13", "14", "15", "21", "22", "23", "24", "24", "25", "31", "32", "33", "34", "35", "41", "42",
                "43", "44", "45", "51", "52", "53", "54", "55"};

        String wordPolybius = "";
        for (String letter : text.split("")){
            if (letter.equals(" ")) {
                wordPolybius += letter;
                continue;
            }
            for (int i=0; i<arrayLetters.length-1; i++){
                if (letter.equals(arrayLetters[i])) {
                    wordPolybius += arrayPolybius[i];
                }
            }
        }
        System.out.println(wordPolybius);
    }
}
