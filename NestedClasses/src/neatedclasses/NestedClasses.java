package neatedclasses;

import neatedclasses.Bank.Account;

public class NestedClasses {
	public static void main(String[] args) {
	Bank.Banker banker=new Bank.Banker();
	Bank bank = banker.createBank();
	Bank.Account account  = bank.new Account("001", "Petrov", 1200);
	account.open();
	bank.putMoney("001", 1200);
	bank.putMoney("001", 1200);
	account.close();

	}

}
