import java.util.List;

public class HumanPetsStreamApi {
    private String nameHuman;
    private List<String> pets;

    public HumanPetsStreamApi(String nameHuman, List<String> pets) {
        this.nameHuman = nameHuman;
        this.pets = pets;
    }

    public String getNameHuman() {
        return nameHuman;
    }

    public List<String> getPets() {
        return pets;
    }
}
