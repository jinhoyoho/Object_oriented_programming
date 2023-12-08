
public class CheckingAccount extends BankAccount{
	private boolean first;	// 처음인지
	
	public CheckingAccount()
	{
		super();
		first = true;
	}
	
	public void withdraw(double amount) {
		double currentBalance = super.getBalance();	// 현재 잔액
		
		if (currentBalance < amount)	// overdraft인 경우
		{
			if (first)	// 처음이면 20 dollar penalty
			{
				super.withdraw(amount+20);
				first = false;
			}
			else
			{
				super.withdraw(amount+30); // 여러번이면 30 dollar penalty
			}
		}
		else
		{
			super.withdraw(amount);	// overdraft가 아니면 그냥 인출
		}
	}
	
	public void monthEnd() {
		first = true;	// 초기화
    }
	
}
