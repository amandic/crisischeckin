package org.htbox.crisischeckin.activity;

import org.htbox.crisischeckin.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	
	// Declaring our views
	private EditText edit_username;
	private EditText edit_password;
	private Button btn_login;
	
	// Called when the activity is first created
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.login);
			
			edit_username=(EditText)this.findViewById(R.id.edit_username);
			edit_password=(EditText)this.findViewById(R.id.edit_password);
			btn_login=(Button)this.findViewById(R.id.btn_login);
			btn_login.setOnClickListener(new OnClickListener() {
				
				// Method
				@Override
				public void onClick(View v) {
					if((edit_username.getText().toString()).equals(edit_password.getText().toString())) {
				Toast.makeText(LoginActivity.this, "Login Successful",Toast.LENGTH_LONG).show();
			} else {
				Toast.makeText(LoginActivity.this, "Invalid Login",Toast.LENGTH_LONG).show();
			}
				}
			});
			
		}
}