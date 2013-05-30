package edu.auburn.csse.akm0012.futurelab_play;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.InputType;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;

public class LoginActivity extends FragmentActivity {

	private RelativeLayout loginLayout;
	private EditText userNameField, passwordField, confirmPasswordField;
	private Button newUserButton, logInButton;
	
	private boolean isNewUser;
	
	static Toast frag1Toast, newUserToast, logInToast;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
//		
//		// Instantiate all the UI Buttons / Text Fields / Layouts
//		userNameField = (EditText) findViewById(R.id.UserNameField);
//		passwordField = (EditText) findViewById(R.id.PasswordField);
//		
//		newUserButton = (Button) findViewById(R.id.NewUserButton);
//		logInButton = (Button) findViewById(R.id.LogInButton);
//		
//		loginLayout = (RelativeLayout) findViewById(R.id.LoginLayout);
//		
//		isNewUser = false;
		
		frag1Toast = Toast.makeText(this, "Fragment1 Pushed", Toast.LENGTH_SHORT);
		newUserToast = Toast.makeText(this, "New User Pushed", Toast.LENGTH_SHORT);
		logInToast = Toast.makeText(this, "Log In Pushed", Toast.LENGTH_SHORT);
				
//		// User clicks the "New User" button
//		newUserButton.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//            	
//            	newUserToast.show();
//            	
//            	if (!isNewUser)
//            	{
//            		// Create new Confirm Password Field
//            		addPasswordConfirmField();
//            	}
//            	
//            	else
//            	{
//            		// Put the "Register" method here
//            		executeLogin();
//            	}
//            	
//            }
//        });	
//		
//		// User clicks the "Log In" button
//				newUserButton.setOnClickListener(new View.OnClickListener() {
//		            public void onClick(View v) {
//		            	
//		            	logInToast.show();
//		            	
//		            	executeLogin();
//		            	
//		            }
//		        });	
	}
	
//	private void addPasswordConfirmField() {
//		
//		// Set the Layout parameters for the new EditText
//		RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
//		layoutParams.addRule(RelativeLayout.BELOW, R.id.PasswordField);
//		layoutParams.addRule(RelativeLayout.ALIGN_LEFT, R.id.PasswordField);
//		
//		
//		confirmPasswordField = new EditText(this);
//		confirmPasswordField.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
//		confirmPasswordField.setHint("Confirm Password");
//		confirmPasswordField.setEms(10);
//		loginLayout.addView(confirmPasswordField, layoutParams);
//		
//		loginLayout.removeView(logInButton);
//		
//		//Set some boolean so we know the "New User" button has changed to a "Register Button"
//		isNewUser = true;
//		
//		newUserButton.setText("Register");
//		
//	}
//	
//	//Used as a placeholder, may not be necessary. 
//	public void executeLogin() {
//		int deleteME = 1;
//		//Intent intent = new Intent(this, ModuleSelectorActivity.class);
//		//startActivity(intent);
//	}
//	
//	public void executeLogin(View view) {
//		int deleteME = 1;
//		//Intent intent = new Intent(this, ModuleSelectorActivity.class);
//		//startActivity(intent);
//	}
//	
//	public void createNewUser(View view) {
//		int deleteME = 1;
//		//Intent intent = new Intent(this, ModuleSelectorActivity.class);
//		//startActivity(intent);
//	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
