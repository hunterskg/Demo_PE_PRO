
public class MyString implements IString {

    @Override
    public int f1(String string) {
        int count = 0;
        String[] words = string.split("\\s+");
        
        for(String str:words){
            if (str.matches(".*[a-zA-Z]+.*")){
                count++;
            }
        }
        return count;
    }
    // a a1 2b cd 1 12 b

    @Override
    public String f2(String string) {
        String[] tachTu = string.split("\\s+");
        int lastWord = string.lastIndexOf(" ");
        return string.substring(0, lastWord);
    }

}
