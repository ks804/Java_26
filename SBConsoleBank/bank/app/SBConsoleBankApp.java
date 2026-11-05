package bank.app;

import bank.account.AccountListDao;
import bank.account.AccountService;
import bank.account.SBAccountService;
import bank.app.menu.StartMenu;
import bank.member.MemberListDao;
import bank.member.MemberService;
import bank.member.SBMemberService;

public class SBConsoleBankApp {

	public static void main(String[] args) {
		MemberService ms = new SBMemberService(new MemberListDao());
		AccountService as = new SBAccountService(new AccountListDao());
		
		new StartMenu(as, ms).run();
	}
}
