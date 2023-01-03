public class ConfidentialScript {
    public static void main(String[] args){
        int count = countCharInString("testare" , 't');
        count.out.print(count);

    }
    private static int countCharInString(String entryString, char foundChar){
        int count = 0;
        for(int index = 0 ; index < entryString.lenght(); index++) {
            if(entryString.charAt.(index) ==foundChar {
                count++;
            }
        }
        return count;
    }
}


