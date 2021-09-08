package Basics;
public class PhraseOMatic {

    public static void main(String[] args) {
        //make three sets of words to choose from. Add your own!
        String[] wordListOne = {"24/7","multi-Tier","30k Foot","B-to-B","win-win","front-end","web-based","smart","six-sigma","dynamic"};

        String[] wordListTwo = {"empowered","sticky","meghraj","distributed","outside-the-box","leveraged","aligned","cooperative","shared","saccelerated"};

        String[] wordListThree = {"mission","mindshare","space","core","vision","portal","solution","tripping-point","process","paradigm","architecture","competency"};
        //find out how many words are in each list
        int oneLength =  wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        //generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //now build a phrase
        String phrase = wordListOne [rand1] + " " + wordListTwo [rand2] + " " + wordListThree [rand3];
        //print out the phrase
        System.out.println("What we need is a " + phrase);
    }

}
