public class SearchinString {
    public static void main(String[] args) {
        String name = "Vishesh";
        char target = 'z';
        boolean answer = isThere(name,target);
        System.out.println(answer);

    }


    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for(char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    static boolean isThere(String name, char target) {
        if (name.length()==0){
            return false;
        }
        for (int i = 0 ; i < name.length() ; i++ ){
            if (target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
