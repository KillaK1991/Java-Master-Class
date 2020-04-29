import java.util.ArrayList;
import java.util.List;

public class Tekken implements ISaveable {

    private String characterName;
    private String characterFightingStyle;
    private String characterSpecialMove;
    private int characterRank;

    Tekken(String characterName, String characterFightingStyle, String characterSpecialMove, int characterRank){
        this.characterName = characterName;
        this.characterFightingStyle = characterFightingStyle;
        this.characterSpecialMove = characterSpecialMove;
        this.characterRank = characterRank;
    }

    @Override
    public List<String> write(){
        List<String> valuesList = new ArrayList<String>();
        valuesList.add(this.characterName);
        valuesList.add(this.characterFightingStyle);
        valuesList.add(this.characterSpecialMove);
        valuesList.add(Integer.toString(this.characterRank));
        return valuesList;
    }

    @Override
    public void read(List<String> stringArray){
        this.characterName = stringArray.get(0);
        this.characterFightingStyle = stringArray.get(1);
        this.characterSpecialMove = stringArray.get(2);
        this.characterRank = Integer.parseInt(stringArray.get(3));
    }

    @Override
    public String toString(){
        return "Character Name: " + this.characterName +
                "\nCharacter Rank: " + this.characterRank +
                "\nChracter Special Move: " + this.characterSpecialMove;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterFightingStyle() {
        return characterFightingStyle;
    }

    public void setCharacterFightingStyle(String characterFightingStyle) {
        this.characterFightingStyle = characterFightingStyle;
    }

    public String getCharacterSpecialMove() {
        return characterSpecialMove;
    }

    public void setCharacterSpecialMove(String characterSpecialMove) {
        this.characterSpecialMove = characterSpecialMove;
    }

    public int getCharacterRank() {
        return characterRank;
    }

    public void setCharacterRank(int characterRank) {
        this.characterRank = characterRank;
    }
}
