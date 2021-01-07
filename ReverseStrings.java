/*
Complete the solution so that it reverses the string passed into it.
 */

class Reverse_Strings {
    public static String solution(String str) {
        byte[] orginalByte = str.getBytes();
        byte[] reverseByte = new byte[str.length()];
        for(int i =0; i>str.length();i++){
            reverseByte[i] = orginalByte[str.length() - 1 - i];
        }
        return (new String(reverseByte));
    }

    public static void main(String[] args) {
        solution("world");
    }

}
