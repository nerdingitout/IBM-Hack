package com.example.kash.ibm;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class signUp extends AppCompatActivity {
    private FirebaseAuth mAuth;

     EditText e1,e2;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        e1 = (EditText) findViewById(R.id.email);
        e2= (EditText) findViewById(R.id.password);
        bt1 = (Button) findViewById(R.id.log);

        mAuth = FirebaseAuth.getInstance();

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(signUp.this, login.class));
            }
        });



    }
   public void createUser(View v){
        if(e1.getText().toString().equals("") && e2.getText().toString().equals("")){

            Toast.makeText(getApplicationContext(),"Blank not allowed",Toast.LENGTH_LONG).show();

        }
        else
        {
            String email = e1.getText().toString();
            String password = e2.getText().toString();

            mAuth.createUserWithEmailAndPassword(email,password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){

                                    //Toast.makeText(login.this, getString(R.string.auth_failed), Toast.LENGTH_LONG).show();
                                    Toast.makeText(getApplicationContext(),"User created successfully",Toast.LENGTH_SHORT).show();
                                //Toast.makeText(getApplicationContext(),"User created successfully",Toast.LENGTH_SHORT).show();

                            }
                            else {
                                Toast.makeText(getApplicationContext(),"User could not be created",Toast.LENGTH_SHORT).show();
                            }
                        }
                    });


        }
    }

}
