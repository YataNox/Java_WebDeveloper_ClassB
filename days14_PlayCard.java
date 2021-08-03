package days14;

class CardDeck
{
	Card[] c = new Card[52];
	
	CardDeck()
	{
		int count = 0; // c의 인덱스로 사용될 변수
		
		for(int i = 1; i <= 4; i++) // 카드의 종류 1~4반복
			for(int j = 1; j <= 13; j++) // 카드 번호 1~13 반복 
				c[count++] = new Card(i, j); // 카드장 수 i는 0~51
	}
}

public class PlayCard 
{
	public static void main(String[] args)
	{
		
	}
}
