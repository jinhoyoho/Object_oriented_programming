
public class BasicAccount extends BankAccount{
	
	public BasicAccount(double money)
	{
		super(money);	// 생성
	}
	
	public void withdraw(double amount) {
		double currentBalance = super.getBalance(); // 현재 잔액
		
		if (currentBalance < amount)	// 현재 잔액이 인출하려는 돈보다 적으면
		{
			super.withdraw(amount+30);	// 30 dollar penalty
		}
		else
			super.withdraw(amount);
	}
}
