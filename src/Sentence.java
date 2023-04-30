public class Sentence {
    static String sent = "I would like to have a dog";
    public static int countVowels() {
        int count = 0;
        String three;
        String catReplace;
        String myNew;
        String newSent = sent.toLowerCase();

        char[] someCharArray = newSent.toCharArray();

        for(int i = 0; i < someCharArray.length; i++){
            if(someCharArray[i] == 'a' || someCharArray[i] == 'i' || someCharArray[i] == 'o'|| someCharArray[i] == 'e'
                    || someCharArray[i] == 'u'){
                count++;
            }
        }
        for(String el : sent.split(" ")){
            System.out.println(el);
        }
        three = sent.split(" ")[1].substring(0,3);
        System.out.println(three);

        catReplace = sent.replace("dog", "cat");
        System.out.println(catReplace);

        StringBuilder newBuilder = new StringBuilder();
        newBuilder.append("I ");
        newBuilder.append("would ");
        newBuilder.append("like ");
        newBuilder.append("to ");
        newBuilder.append("have ");
        newBuilder.append("a ");
        newBuilder.append("dog ");

        myNew = newBuilder.toString();
        System.out.println(myNew.toUpperCase());

        System.out.println(count);
        return count;
    }
}
