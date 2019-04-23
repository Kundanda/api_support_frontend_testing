package usersidetesting;

public class AllTestCasesUser {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//BackButtonOpenTicketsTesting
		
		System.out.println("Test 1: Back button test to go back to home page from the chat page for the open ticket");
		BackButtonOpenTicketsTesting.backButtonTest();
		
		//CreateTicketTesting
		
		System.out.println("Test 2: Create Ticket Test Successful  'i'");
		CreateTicketTesting.FormFillPass1();
		
		System.out.println("Test 3: Create Ticket Test Successful 'ii'");
		CreateTicketTesting.FormFillPass2();
		
		System.out.println("Test 4: Create Ticket Test Failed 'i'");
		CreateTicketTesting.FormFillFail1();
		
		System.out.println("Test 6: Create Ticket Test Failed 'iii'");
		CreateTicketTesting.FormFillFail3();
		
		//DownloadMediaUserSide
		
		System.out.println("Test 7: Download media testing for User");
		DownloadMediaUserSide.downloadMediaTest();
		
		//OpenTicketsandChatTesting
		
		System.out.println("Test 8: Open the requested ticket test");
		OpenTicketsandChatTesting.openTicketPass();
		
		System.out.println("Test 9: Chat testing with uploaded media succesul for user");
		OpenTicketsandChatTesting.chatPasswithUploadMediaButtonConfirmTest();
		
		System.out.println("Test 10: Chat testing with uploaded media cancelled by user");
		OpenTicketsandChatTesting.cancelUploadMediaButtonTest();
		
		System.out.println("Test 11: Chat testing with uploaded media unsuccessful due to unsupported file format for user");
		OpenTicketsandChatTesting.unsupportedFileFormatUploadCheckTesting();
		
		//SignInTesting
		
		System.out.println("Test 12: SignIn Successful Test");
		SignInTesting.SignInPass();
		
		System.out.println("Test 13: SignIn Fail Test 'i'");
		SignInTesting.SignInFailBoundaryCase1();
		
		System.out.println("Test 14: SignIn Fail Test 'ii'");
		SignInTesting.SignInFailCommonCase();
		
		System.out.println("Test 15: SignIn Fail Test 'iii'");
		SignInTesting.SignInFailEmptyPassword();
		
		System.out.println("Test 16: SignIn Fail Test 'iv'");
		SignInTesting.SignInFailEmptyUserName();
		
		System.out.println("Test 17: SignIn Fail Test 'v'");
		SignInTesting.SignInFailIncorrectPassword();
		
		System.out.println("Test 18: SignIn Successful Test using Google Sign-in");
		SignInTesting.SignInWithGoogleButton();
		
		//SignOutTesting
		
		System.out.println("Test 19: Sign out testing");
		SignOutTesting.SignOutTestUser();
		
		//ViewTicketTesting
		
		System.out.println("Test 20: View Open Tickets test");
		ViewTicketTesting.viewTicketsOpenPass();
		
		System.out.println("Test 21: View Closed Tickets test");
		ViewTicketTesting.viewTicketsClosedPass();
		
//		//CloseTicketTesting
		System.out.println("Test 22: Close and resolve ticket test");
		CloseTicketTesting.closeTicketTest();
		
		//RegisterNewUserTest
		
		System.out.println("Test 23: Registration Successful Test");
		RegisterNewUserTest.registerNewUserPass();
				
		System.out.println("Test 24: Registration Fail Test 'a'");
		RegisterNewUserTest.registerNewUserPasswordsDontMatch();
				
		System.out.println("Test 25: Registration Fail Test 'b'");
		RegisterNewUserTest.registerNewUserFailInvalidemail();
				
		System.out.println("Test 27: Registration Fail Test'c'");
		RegisterNewUserTest.registerNewUserFailDuplicateAccountExists();
				
		System.out.println("Test 28: Registration Cancel Test");
		RegisterNewUserTest.registerNewUserCancelButton();
		
	}

}
