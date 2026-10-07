package bank.test;

import java.util.List;

import bank.account.Account;
import bank.account.AccountDao;
import bank.account.AccountListDao;

public class TestAccount {
	public static void main(String[] args) {
		testAccountDao();
	}

	public static void testAccountDao() {
		AccountDao adao = new AccountListDao();

		System.out.println(">>> 계좌 추가 및 계좌 목록");
		adao.save(new Account(1001, "1111", "soonbeom", 10000));
		adao.save(new Account(1002, "2222", "curi", 5000));
		adao.save(new Account(1002, "1234", "curi", 1234));
		adao.save(new Account(1003, "3333", "curi", 2000));
		printAccountList(adao.findAll());

		System.out.println(">>> 계좌번호로 계좌 찾기");
		Account a = adao.findById(1002);
		System.out.println(a);
		
		

		System.out.println(">>> 계좌에 3000원 입금");
		a.setBalance(a.getBalance() + 3000);
		adao.update(a);
		printAccountList(adao.findAll());

		System.out.println(">>> 계좌 삭제");
		adao.delete(adao.findById(1002));
		printAccountList(adao.findAll());
	}

	public static void printAccountList(List<Account> alist) {
		for (Account a : alist) {
			System.out.println(a);
		}
	}
	
	
}