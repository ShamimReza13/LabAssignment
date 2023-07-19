public class SpaceEatter {
    private String sentence;
    public SpaceEatter(){
        sentence="     my name is fayed     ";
    }
    public String myTrimer(){
        String word;
       word=sentence.trim();
       return word;
    }
    public String myReplace(){
        String word;
        word=sentence.replace(" ","");
        return word;
    }



}
