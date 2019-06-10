public class Card {
    public static void main(String[] args){
        String output = "The card you picked is ";
        //产生牌的大小
        int number = (int)(Math.random() * 13 + 1);
        if (number == 13)
            output += "Jack";
        else if (number == 12)
            output += "Queen";
        else if (number == 11)
            output += "King";
        else if (number == 1)
            output += "Ace";
        else output += number;
        output += " of ";
        //产生花色
        int kind = (int)(Math.random() * 4 + 1);
        switch (kind){
            case 1: output += "Clubs"; break;
            case 2: output += "Diamonds"; break;
            case 3: output += "Hearts";break;
            case 4: output += "Spades";
        }
        output += ".";
        System.out.println(output);
    }
}
