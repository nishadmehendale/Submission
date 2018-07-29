//Class BankFactory having abstract methods for creating SavingsAcc and CurrentAcc
public abstract class BankFactory {
	public abstract SavingAcc getNewSavingAcc(int accNo, String accNm, int accBal, boolean isSalaried);
	public abstract CurrentAcc getNewCurrentAcc(int accNo, String accNm, int accBal, float creditLimit);
}
