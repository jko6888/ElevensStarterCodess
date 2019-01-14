package CardLab;

import java.util.ArrayList;
import java.util.List;

public class DeckClass {
    List<CardClass> unDealt;
    List<CardClass> Dealt;

    public DeckClass(String[] Rank, String[] Suit, int[] pointValue)
    {
        List<CardClass> deck = new ArrayList();

        for(int s = 0;s<Suit.length;s++)
        {
            for(int i = 0;i<Rank.length;i++)
            {
                deck.add(new CardClass(Rank[i] , Suit[s], pointValue[i]));
            }
        }
        this.unDealt = deck;
        this.Dealt = new ArrayList();

    }
    public boolean isEmpty()
    {
        return unDealt.size() <= 0;
    }
    public int size(int amount)
    {
        return unDealt.size();
    }
    public CardClass deal()
    {
        if(this.unDealt.size() <= 0)
        {
            return null;
        }
        CardClass topCard = this.unDealt.remove(0);
        this.Dealt.add(topCard);
        return topCard;
    }
    public void shuffle()
    {
        System.out.println(this.unDealt);
        for(int i = 0;i<this.Dealt.size()-1;i++)
        {
            this.unDealt.add(this.Dealt.get(i));
        }
        for(int k = this.unDealt.size()-1;k>0;k--)
        {
            int r = (int)(Math.random() * this.unDealt.size());
            CardClass temp = this.unDealt.get(k);
            this.unDealt.set(k,this.unDealt.get(r));
            this.unDealt.set(r,temp);
        }

    }
}
