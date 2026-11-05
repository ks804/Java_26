package bank.app;

import bank.account.AccountListDao;
import bank.account.AccountService;
import bank.account.SBAccountService;
import bank.app.menu.*;
import bank.member.MemberListDao;
import bank.member.MemberService;
import bank.member.SBMemberService;

public class SBConsoleBankApp {

	public static void main(String[] args) {
		MemberService ms = new SBMemberService(new MemberListDao());
		AccountService as = new SBAccountService(new AccountListDao());
		
		new AdminMenu(as, ms).run();
		new BankingMenu(as, ms).run();
		new AdminAccountMenu(as, ms).run();
		new AdminMemberMenu(as, ms).run();
		new MyInfoMenu(as, ms).run();
		new StartMenu(as, ms).run();
	}
}
