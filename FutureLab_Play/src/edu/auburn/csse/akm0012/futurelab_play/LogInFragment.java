package edu.auburn.csse.akm0012.futurelab_play;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class LogInFragment extends Fragment {

	View view;
	private RelativeLayout loginLayout;
	private EditText userNameField, passwordField, confirmPasswordField;
	private Button newUserButton, logInButton;

	private boolean isNewUser;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		view = inflater.inflate(R.layout.activity_log_in_fragment, container,
				false);

		userNameField = (EditText) view.findViewById(R.id.UserNameField);
		passwordField = (EditText) view.findViewById(R.id.PasswordField);

		newUserButton = (Button) view.findViewById(R.id.NewUserButton);
		logInButton = (Button) view.findViewById(R.id.LogInButton);

		loginLayout = (RelativeLayout) view.findViewById(R.id.LoginLayout);

		isNewUser = false;

		// User clicks the "New User" button
		newUserButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				LoginActivity.newUserToast.show();

				if (!isNewUser) {
					// Create new Confirm Password Field
					// addPasswordConfirmField();
				}

				else {
					// Put the "Register" method here
					executeLogin();
				}

			}
		});

		// User clicks the "Log In" button
		logInButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				LoginActivity.logInToast.show();

				executeLogin();

			}
		});

		return view;

	}

	// private void addPasswordConfirmField() {
	//
	// // Set the Layout parameters for the new EditText
	// RelativeLayout.LayoutParams layoutParams = new
	// RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
	// LayoutParams.WRAP_CONTENT);
	// layoutParams.addRule(RelativeLayout.BELOW, R.id.PasswordField);
	// layoutParams.addRule(RelativeLayout.ALIGN_LEFT, R.id.PasswordField);
	//
	//
	// confirmPasswordField = new EditText(LoginActivity.this);
	// confirmPasswordField.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
	// confirmPasswordField.setHint("Confirm Password");
	// confirmPasswordField.setEms(10);
	// loginLayout.addView(confirmPasswordField, layoutParams);
	//
	// loginLayout.removeView(logInButton);
	//
	// //Set some boolean so we know the "New User" button has changed to a
	// "Register Button"
	// isNewUser = true;
	//
	// newUserButton.setText("Register");
	//
	// }

	// Used as a placeholder, may not be necessary.
	public void executeLogin() {
		int deleteME = 1;
		// Intent intent = new Intent(this, ModuleSelectorActivity.class);
		// startActivity(intent);
	}

	public void executeLogin(View view) {
		int deleteME = 1;
		// Intent intent = new Intent(this, ModuleSelectorActivity.class);
		// startActivity(intent);
	}

	public void createNewUser(View view) {
		int deleteME = 1;
		// Intent intent = new Intent(this, ModuleSelectorActivity.class);
		// startActivity(intent);
	}

}