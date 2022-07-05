public class Task11 {

    public static void main(String[] args) {
        String s1 = "test";
        String s2 = "new_test";
        String s3 = "test";
        String s4 = "BIG";
        String s5 = "small";
        String s6 = "          space       ";

        CustomEquals equals = new CustomEquals();
        CustomStartsWith startsWith = new CustomStartsWith();
        CustomEndsWith endsWith = new CustomEndsWith();
        CustomIndexOf indexOf = new CustomIndexOf();
        CustomLastIndexOf lastIndexOf = new CustomLastIndexOf();
        CustomSubString subString = new CustomSubString();
        CustomRepeat repeat = new CustomRepeat();
        CustomReplace replace = new CustomReplace();
        CustomReplaceAll replaceAll = new CustomReplaceAll();
        CustomReplaceFirst replaceFirst = new CustomReplaceFirst();
        CustomToLowerCase toLowerCase = new CustomToLowerCase();
        CustomToUpperCase toUpperCase = new CustomToUpperCase();
        CustomTrim trim = new CustomTrim();

        equals.customEquals(s1, s3);
        startsWith.customStartsWith(s2);
        endsWith.customEndsWith(s2);
        indexOf.customEndsWith(s2);
        lastIndexOf.customLastIndexOf(s2);
        subString.customSubString(s2);
        repeat.customRepeat(s2);
        replace.customReplace(s2);
        replaceAll.customReplaceAll(s2);
        replaceFirst.customReplaceFirst(s2);
        toLowerCase.customToLowerCase(s4);
        toUpperCase.customToUpperCase(s5);
        trim.customTrim(s6);
    }
}

class CustomEquals {
    void customEquals(String s1, String s3) {
        System.out.println("Method - equals");
        System.out.println("Comparison STR 's1' and  STR 's2' : " + s1.equals(s3));
    }
}

class CustomStartsWith {
    void customStartsWith(String s2) {
        System.out.println("Method - startsWith");
        System.out.println("Comparison beginning symbol STR 's2' and argument: " + s2.startsWith("ne"));
    }
}

class CustomEndsWith {
    void customEndsWith(String s2) {
        System.out.println("Method - endsWith");
        System.out.println("Comparison end symbol  STR 's2' and argument: " + s2.endsWith("st"));
    }
}

class CustomIndexOf {
    void customEndsWith(String s2) {
        System.out.println("Method - indexOf");
        System.out.println("Number symbol STR 's2' of beginning: " + s2.indexOf("t"));
    }
}

class CustomLastIndexOf {
    void customLastIndexOf(String s2) {
        System.out.println("Method - lastIndexOf");
        System.out.println("Number symbol STR 's2' of END: " + s2.lastIndexOf("q"));
    }
}

class CustomSubString {
    void customSubString(String s2) {
        System.out.println("Method - subString");
        System.out.println("Output STR 's2' with '2' symbol: " + s2.substring(3));
    }
}

class CustomRepeat {
    void customRepeat(String s2) {
        System.out.println("Method - repeat");
        System.out.println("Repeat STR 's2' in quantity '4': " + s2.repeat(4));
    }
}

class CustomReplace {
    void customReplace(String s2) {
        System.out.println("Method - replace");
        System.out.println("Repeat all oldChar STR 's2' on all newChar: " + s2.replace('n', 'N'));
    }
}

class CustomReplaceAll {
    void customReplaceAll(String s2) {
        System.out.println("Method - replaceAll");
        System.out.println("Repeat all oldChar STR 's2' on all newChar: " + s2.replaceAll("n", "NN"));
    }
}

class CustomReplaceFirst {
    void customReplaceFirst(String s2) {
        System.out.println("Method - replaceFirst");
        System.out.println("Repeat First Char STR 's2': " + s2.replaceFirst("t", "T"));
    }
}

class CustomToLowerCase {
    void customToLowerCase(String s4) {
        System.out.println("Method - toLowerCase");
        System.out.println("Register DOWN STR 's4': " + s4.toLowerCase());
    }
}

class CustomToUpperCase {
    void customToUpperCase(String s5) {
        System.out.println("Method - toUpperCase");
        System.out.println("Register UP STR 's5': " + s5.toUpperCase());
    }
}

class CustomTrim {
    void customTrim(String s6) {
        System.out.println("Method - toUpperCase");
        System.out.println("Delete spaces beginning and end STR 's2':" + s6.trim());
    }
}
