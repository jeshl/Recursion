public class RemoveDuplicateString {
    
    public static void RemoveString(String str, StringBuilder newString, boolean[] arrStore, int index){

        if(index == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);

        if(arrStore[currChar - 'a'] == true){
            RemoveString(str, newString, arrStore, index + 1);
        }else{
            arrStore[currChar - 'a'] = true;
            RemoveString(str, newString.append(currChar), arrStore, index + 1);
        }
    }

    public static void main(String[] args) {
        String str = "aaniissh";
        int index = 0;
        RemoveString(str, new StringBuilder(""), new boolean[26], index);
    }
}
