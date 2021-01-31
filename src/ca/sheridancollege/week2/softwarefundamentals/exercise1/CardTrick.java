/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.exercise1;
import java.util.Scanner;
import ca.sheridancollege.week2.softwarefundamentals.exercise1.Card;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Card[] magicHand = new Card[7];
        Scanner in=new Scanner(System.in);
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int a=(int)(Math.random()*(13-1+1)+1);
            int b=(int)(Math.random()*(3-0+1)+0);
            
            //c.setValue(insert call to random number generator here)
            c.setValue(a);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[b]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter the Suit of the card:");
        String h=in.nextLine();
        System.out.println("Enter the card number:");
        int d=in.nextInt();
         System.out.println("Suit="+h+"Number="+d);

         Card ca = new Card();
        ca.setValue(d);
        ca.setSuit(h);
        
        // search magicHand and report the result
        boolean match = false;
        for (Card car : magicHand) {
            if (car.getValue() == ca.getValue() && car.getSuit().equals(ca.getSuit())) 
            {
                System.out.println("There a match!");
                match = !match;
                break;
            }
        }
        
        if (!match) {
        System.out.println("Better luck next time!");
        }
        
    }
    
}
