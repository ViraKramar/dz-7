public class Main {
    public static void main(String[] args) {
        for (CardRank card : CardRank.values()){
            System.out.println(card);
        }
        CardRank day = CardRank.valueOf ("TWO");
        System.out.println(day.getNum());

        Sentence mySent = new Sentence();
        mySent.countVowels();
    }
}