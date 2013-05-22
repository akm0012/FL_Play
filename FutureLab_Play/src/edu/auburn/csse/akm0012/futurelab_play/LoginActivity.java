package edu.auburn.csse.akm0012.futurelab_play;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class LoginActivity extends Activity {

	private RelativeLayout loginLayout;
	private EditText userNameField, passwordField;
	private Button newUserButton, logInButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		// Instantiate all the UI Buttons / Text Fields / Layouts
		userNameField = (EditText) findViewById(R.id.UserNameField);
		passwordField = (EditText) findViewById(R.id.PasswordField);
		
		newUserButton = (Button) findViewById(R.id.NewUserButton);
		logInButton = (Button) findViewById(R.id.LogInButton);
		
		loginLayout = (RelativeLayout) findViewById(R.id.LoginLayout);
		
		newUserButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Create new Confirm Password Field
            	
            	addPasswordConfirmField();
            	
            	//EditText confirmPassword = new EditText(this);
            	
            	
            }
        });	
	}
	
	private void addPasswordConfirmField() {
		
		EditText confirmPasswordField = new EditText(this);
		confirmPasswordField.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
		confirmPasswordField.setHint("Confirm Password");
		confirmPasswordField.setEms(10);
		confirmPasswordField.setTop(passwordField.getBottom());
		//confirmPasswordField.addRule();
		loginLayout.addView(confirmPasswordField);
		
	}
	
	public void executeLogin(View view) {
		Intent intent = new Intent(this, ModuleSelectorActivity.class);
		startActivity(intent);
	}
	
	public void createNewUser(View view) {
		//Intent intent = new Intent(this, ModuleSelectorActivity.class);
		//startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
