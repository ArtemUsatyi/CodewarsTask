package CodeWars;

public class ConvertStringCamelCase {
    public static void main(String[] args) {
        String s = "You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields";
        s = s.replaceAll("-", " ").replaceAll("_", " ");
        String[] textArray = s.split(" ");

        String newString = textArray[0].substring(0, 1).toLowerCase().concat(textArray[0].substring(1));
        for (int i = 1; i < textArray.length; i++) {
            newString = newString + textArray[i].substring(0, 1).toUpperCase().concat(textArray[i].substring(1));
        }
        System.out.println(newString);
    }
}
