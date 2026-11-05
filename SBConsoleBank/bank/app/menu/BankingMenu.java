package bank.app.menu;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.MemberService;

public class BankingMenu extends ConsoleMenu {

	protected BankingMenu(AccountService as, MemberService ms) {
		super(as, ms);
		this.menuList = new String[] {"로그아웃", "계좌 목록", "입금", "출금", "계좌 생성", "계좌 해지", "내 정보"};
	}

	@Override
	public void run() {
		System.out.println("::: 은행 메뉴 :::");
		while (true) {
			int menu = selectMenu();
			switch (menu) {
			case 1 -> listMyAccounts();
			case 2 -> deposit();
			case 3 -> withdraw();
			case 4 -> createAccount();
			case 5 -> deleteAccount();
			case 6 -> new MyInfoMenu(as, ms).run();
			case 0 -> {logout(); return;}
			default -> System.out.println("!! 메뉴에 있는 번호 선택 !!");
			}
		}
		
	}

	private void logout() {
		System.out.println("::: 로그아웃 :::");
	}

	private void listMyAccounts() {
		System.out.println("::: 계좌 목록 :::");
	}

	private void deposit() {
		System.out.println("::: 입금 :::");
	}

	private void withdraw() {
		System.out.println("::: 출금 :::");
	}

	private void createAccount() {
		System.out.println("::: 계좌 생성 :::");
	}

	private void deleteAccount() {
		System.out.println("::: 계좌 해지 :::");
	}

}
