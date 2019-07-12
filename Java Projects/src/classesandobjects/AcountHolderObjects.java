package classesandobjects;

public class AcountHolderObjects {
	
	public static void main(String[] args) {
		
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		
		tom.firstName="Tom";
		tom.lastName="Smith";
		tom.age=21;
		tom.accountBalance=10000;
		tom.testEligibilityForCeditCard();
		System.out.println("Is Tom Eligible for Credit Card : "+tom.eligibleForCreditCard);
		
		henry.firstName="Henry";
		henry.lastName="Hill";
		henry.age=51;
		henry.accountBalance=20000;
		henry.testEligibilityForCeditCard();
		System.out.println("Is Henry Eligible for Credit Card : "+henry.eligibleForCreditCard);
		
		sarah.firstName="Sarah";
		sarah.lastName="Miller";
		sarah.age=41;
		sarah.accountBalance=30000;
		sarah.testEligibilityForCeditCard();
		System.out.println("Is Henry Eligible for Credit Card : "+sarah.eligibleForCreditCard);
	}
}
