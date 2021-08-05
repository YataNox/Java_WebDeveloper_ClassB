package days16;

class Unit
{
	int hp; // 현재 체력
	int max_hp; // 최대 체력
	Unit(int p)
	{
		max_hp = p; // super()로 호출되고 전달된 체력을 max_hp에 저장
		hp = (int)(p*0.8);
	}
	public void prnHp()
	{
		System.out.println("최대 체력 : " + max_hp + ", 현재 체력 : " + hp);
	}
}

class GroundUnit extends Unit
{
	GroundUnit(int p)
	{
		super(p);
	}
}

class AirUnit extends Unit
{
	AirUnit(int p)
	{
		super(p);
	}
}

class Tank extends GroundUnit
{
	Tank()
	{
		super(150);
	}
	public String toString()
	{
		return "Tank";		
	}
}

class Dropship extends AirUnit
{
	Dropship()
	{
		super(150);
	}
	public String toString()
	{
		return "Dropship";
	}
}

class Marine extends GroundUnit
{
	Marine()
	{
		super(40);
	}
	public String toString()
	{
		return "Marine";
	}
}

class SCV extends GroundUnit
{
	SCV()
	{
		super(40);
	}
	public String toString()
	{
		return "SCV";
	}
}

public class Extends12_Interface04 
{
	public static void main(String[] args)
	{
		Tank tank1 = new Tank();
		Dropship dropship1 = new Dropship();
		Marine marine1 = new Marine();
		SCV scv1 = new SCV();
		
		System.out.printf("%s : ", tank1.toString());
		tank1.prnHp();
		System.out.printf("%s : ", dropship1.toString());
		dropship1.prnHp();
		System.out.printf("%s : ", marine1.toString());
		marine1.prnHp();
		System.out.printf("%s : ", scv1.toString());
		scv1.prnHp();
	}
}
