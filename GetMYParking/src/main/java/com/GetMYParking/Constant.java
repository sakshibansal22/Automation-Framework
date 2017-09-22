package com.GetMYParking;

public class Constant {
	// App Objects
		
		public static final String DEVICE_NAME ="TestAutomationEmulator";
		public static final String DEVICE_VERSION = "6.0";
		public static final String PLATFORM = "Android";	
		public static final String Application ="Get My Parking_com.gmpuser.app.apk";		
		public static final String HUB_URL = "http://127.0.0.1:4723/wd/hub";
		

		
		// UI Elements
		public static final String SIGNIN_TAB="//android.widget.TextView[contains(@text, 'Sign Up')]";
		//LOGIN PAGE
		public static final String EMAIL_ID = "com.gmpuser.app:id/et_email";
		public static final String PASSWORD_ID = "com.gmpuser.app:id/et_password";
		public static final String LOGIN_BTN = "com.gmpuser.app:id/btn_login";
		public static final String CONFIRMPWD_ID = "com.gmpuser.app:id/et_confirm_password";
		public static final String SKIP_BTN = "com.gmpuser.app:id/btn_skip";
		public static final String ALLOW_PERM = "com.android.packageinstaller:id/permission_allow_button";
		
		//HOME PAGE
		public static final String SEARCH_BTN="com.gmpuser.app:id/btn_search";
		public static final String SEARCH_BOX="com.gmpuser.app:id/atv_search";
		public static final String SEARCH_TITLE="com.gmpuser.app:id/tv_title";


}
