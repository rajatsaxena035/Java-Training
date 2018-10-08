abstract class Worker
{
	public String name;
	public double salary;
	public String type_worker;
	public abstract double pay(); 
}

class DailyWorker extends Worker
{
	public double pay_per_day;
	public int days_worked;
	DailyWorker(String naam, String tw, double ppd, int dw)
	{
		this.name = naam;
		this.type_worker = tw;
		this.pay_per_day = ppd;
		this.days_worked = dw;
	}
	public double pay()
	{
		this.salary = pay_per_day * 7;
		return salary;
	}
}

class SalariedWorker extends Worker
{
	public double pay_per_week;
	SalariedWorker(String naam, String tw, double ppw)
	{
		this.name = naam;
		this.type_worker = tw;
		this.pay_per_week = ppw;
	}
	public double pay()
	{
		this.salary = pay_per_week;
		return salary;
	}
}

class Money
{
	public static void main(String[] args)
	{
		DailyWorker w1 = new DailyWorker("Kurt","Daily",10000,5);
		SalariedWorker w2 = new SalariedWorker("Angle", "Salaried", 100000);
		DailyWorker w3 = new DailyWorker("Kurt","Daily",20000,4);
		SalariedWorker w4 = new SalariedWorker("Angle", "Salaried", 50000);
		w1.pay();
		w2.pay();

		System.out.println("Name = " + w1.name + ", Type = " + w1.type_worker + ", Salary = " + w1.salary);
		System.out.println("Name = " + w2.name + ", Type = " + w2.type_worker + ", Salary = " + w2.salary);

	}
}