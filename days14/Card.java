package days14;

public class Card 
{
	final static int spade = 4;
	final static int diamond = 3;
	final static int heart = 2;
	final static int clover = 1;
	// final : 변수의 값을 변경하지 못하도록 하는 키워드.
	
	private int kind;
	private int number;
	
	public Card(int kind, int number)
	{
		this.kind = kind;
		this.number = number;
	}
	public Card()
	{
		this(spade, 1);
		//	this.kind = spade;
		//	this.number = 1;
	}
	public String toString()
	{
		// kind : 4, number : 13이라면 만들어지고 리턴 될 문자열 "[Spade : K]"
		String[] kinds = {"", "Clover", " Heart", "Diamond", "Spade"};
		String[] numbers = {"", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K"};
		String result = "[" + kinds[this.kind] + " : " + numbers[this.number] + "]";
		return result;
	}
	// toString() 메서드가 있는 클래스의 객체를 System.out.println()으로 출력하면
	// 클래스 이름@해쉬코드가 아닌 toString()에서 리턴해주면 내용이 출력됩니다.
	// Card c = new Card(4, 13);
	// System.out.println(c);
	// 출력 : [Spade : K] System.out.println(c.toString());과 같은 출력
}
