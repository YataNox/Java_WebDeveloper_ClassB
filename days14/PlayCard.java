package days14;

import java.util.Random;

class CardDeck
{
	Card[] cards = new Card[52];
	
	CardDeck()
	{
		int count = 0; // c의 인덱스로 사용될 변수
		
		for(int i = 1; i <= 4; i++) // 카드의 종류 1~4반복
			for(int j = 1; j <= 13; j++) // 카드 번호 1~13 반복 
				cards[count++] = new Card(i, j); // 카드장 수 i는 0~51
	}
	
	public void shuffle()
	{
		Random rd = new Random();
		for(int i = 0; i < 52; i++)
		{
			// int r = (int)(Math.random()  * 52);
			int r = Math.abs(rd.nextInt() % 52);
			Card temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;
		}
		
	}
	
	public Card pick(int i)
	{
		return cards[i];
	}
}

public class PlayCard 
{
	public static void main(String[] args)
	{
		CardDeck d = new CardDeck();
		d.shuffle();
		/*
		System.out.println(d.cards[12].toString());
		System.out.println(d.cards[51]);
		System.out.println(d.pick(1));
		System.out.printf("%s", d.pick(0));
		System.out.printf("%s", d.pick(1));
		System.out.printf("%s", d.pick(2));
		System.out.printf("%s", d.pick(3));
		System.out.printf("%s", d.pick(4));
		*/
		
		Card [] player1 = new Card[5];
		Card [] player2 = new Card[5];
		Card [] player3 = new Card[5];
		Card [] player4 = new Card[5];
		
		// 카드를 1명당 5장씩 분배하고 한 명당 1줄에 보유카드를 출력해서
		// 네 줄을 출력해주세요
		int k = 0;
		for(int i = 0; i < player1.length; i++)
		{
			player1[i] = d.pick(k++);
			player2[i] = d.pick(k++);
			player3[i] = d.pick(k++);
			player4[i] = d.pick(k++);
		}
		
		System.out.print("player1 : ");
		for(int j = 0; j < player1.length; j++)
			System.out.print(player1[j] + " ");
		System.out.println();
		
		System.out.print("player2 : ");
		for(int j = 0; j < player2.length; j++)
			System.out.print(player2[j] + " ");
		System.out.println();
		
		System.out.print("player3 : ");
		for(int j = 0; j < player3.length; j++)
			System.out.print(player3[j] + " ");
		System.out.println();
		
		System.out.print("player4 : ");
		for(int j = 0; j < player4.length; j++)
			System.out.print(player4[j] + " ");
		System.out.println();
		
	}
}
