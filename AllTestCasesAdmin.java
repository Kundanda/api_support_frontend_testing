			package adminsidetesting;

public class AllTestCasesAdmin {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//AddtoMyJobsTest
		System.out.println("Test 1: Add the respected ticket to My Jobs");
		AddtoMyJobsTest.addToMyJobsTesting();
		
		//AdminSignInTesting
		System.out.println("Test 2: SignInFail 'i'");
		AdminSignInTesting.SignInFailBoundaryCase1();
		
		System.out.println("Test 3: SignInFail 'ii'");
		AdminSignInTesting.SignInFailEmptyPassword();
		
		System.out.println("Test 4: SignInFail 'iii'");
		AdminSignInTesting.SignInFailEmptyUserName();
		
		System.out.println("Test 5: SignInFail 'iv'");
		AdminSignInTesting.SignInFailIncorrectPassword();
		
		System.out.println("Test 6: SignInFail 'v'");
		AdminSignInTesting.SignInFailCommonCase();
		
		System.out.println("Test 7: SignIn Successful Test");
		AdminSignInTesting.SignInPass();
		
		//ChatTestingAdmin
		
		System.out.println("Test 8: Chat testing for Admin");
		
		ChatTestingAdmin.chatTestAdmin();
		
		//LogoutButtonTest
		
		System.out.println("Test 10: Logout test");
		
		LogoutButtonTest.logoutButtonTest();
		
		//OpenJobsTesting
		
		System.out.println("Test 11: Opening New Jobs tab to view new tickets for admin side");
		
		OpenJobsTesting.openNewJobsTestingPass();
		
		System.out.println("Test 12: Opening My Jobs tab to view current tickets for the logged in admin to resolve");
		OpenJobsTesting.openMyJobsTestingPass();
		
		//RegisterNewAdminTest
		
		System.out.println("Test 13: Registration Successful Test");
		RegisterNewAdminTest.registerNewAdminPass();
		
		System.out.println("Test 14: Registration Fail Test 'a'");
		RegisterNewAdminTest.registerNewAdminFailPasswordsDontMatch();
		
		System.out.println("Test 15: Registration Fail Test 'b'");
		RegisterNewAdminTest.registerNewAdminFailInvalidemail();
		
		System.out.println("Test 16: Registration Fail Test'c'");
		RegisterNewAdminTest.registerNewAdminFailDuplicateAccountExists();
		
		System.out.println("Test 17: Registration Cancel Test");
		RegisterNewAdminTest.registerNewAdminCancelButton();
		
		//SearchBarTest
		
		System.out.println("Test 18: Successful Search Bar Test for tickets under New Jobs");
		SearchBarTest.searchBarTestingPassNewJobs();
		
		System.out.println("Test 19: Successful Search Bar Test for tickets under My Jobs");
		SearchBarTest.searchBarTestingPassMyJobs();
		
		System.out.println("Test 20: Failed Search Bar Test for tickets under New Jobs");
		SearchBarTest.searchBarTestingFailNewJobs();
		
		System.out.println("Test 21: Failed Search Bar Test for tickets under My Jobs");
		SearchBarTest.searchBarTestingFailMyJobs();
		
		//UploadMediaAdminTest
		
		System.out.println("Test 22: Successful Upload media testing");
		UploadMediaAdminTest.uploadMediaConfirm();
		
		System.out.println("Test 23: Cancelled Upload media testing");
		UploadMediaAdminTest.uploadMediaCancel();
		
		System.out.println("Test 25: Unsuccessful Upload media testing due to unsupported file format");
		UploadMediaAdminTest.uploadMediaFailUnsupportedFileSupport();
		
		//ViewMyJobs
		
		System.out.println("Test 25: View requested ticket under My Jobs");
		ViewMyJobs.viewMyJobsTestingPass();
		
		//ViewNewJobs
		
		System.out.println("Test 26: View requested ticket under New Jobs");
		ViewNewJobs.viewNewJobsTestingPass();
		
		//DownloadMediaAdmin
		
		System.out.println("Test 27: Download media testing for Admin");
				
		DownloadMediaAdmin.downloadMediaAdminTest();
		
		//SendEmail
		
		System.out.println("Test 27: Send email to the client");
		SendEmail.sendEmail();
		
		//FilterTest
		
		System.out.println("Test 28: Filter list test for New Jobs");
		FilterTest.filterTestNewJobs();
		
		System.out.println("Test 29: Filter list test for My Jobs");
		FilterTest.filterTestMyJobs();
		
		
		
	}

}
