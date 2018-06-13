package com.enzosalvetore.circle;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.enzosalvetore.circle.mainFragment.RecordFrag;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";
    private EditText accountView,passwordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }
        accountView = (EditText)findViewById(R.id.login_account_edit_view);
        passwordView = (EditText)findViewById(R.id.login_password_edit_view);
        ((Button)findViewById(R.id.login_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String account = accountView.getText().toString();
                String password = passwordView.getText().toString();
                if(checkAccount(account,password)){
                    Intent intent = new Intent(LoginActivity.this,
                            MainActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(LoginActivity.this,"账号与密码不匹配",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }

    private boolean checkAccount(final String account,final String password){
        if(account.equals("123456")&&password.equals("123456")){
            return true;
        }else return false;
    }
}
