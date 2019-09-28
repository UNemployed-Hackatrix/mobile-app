package org.unemployed.mercampo.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.facebook.login.widget.LoginButton;
import com.google.android.gms.common.SignInButton;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.unemployed.mercampo.R;

public class LoginActivity extends AppCompatActivity {

    EditText _emailText;
    EditText _passwordText;

    Button _loginButton;
    Button _anonymousButton;
    LoginButton _facebookButton;
    SignInButton _signInGoogle;

    TextView _signUpLink;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        FirebaseAuth.AuthStateListener authStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();

                if (firebaseUser != null) {
                    goToMainActivity();

                } else {
                    Log.d("Activity", "In SignedInFirebaseMethod");
                }
            }
        };

        FirebaseAuth.getInstance().addAuthStateListener(authStateListener);
        initViews();


    }

    private void inicializarFirebase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        //firebaseDatabase.setPersistenceEnabled(true); //persistencia solo debe ejecutarse una vez en toda la aplicación
        databaseReference =firebaseDatabase.getReference();
    }

    private void goToMainActivity() {
        Intent mainAct = new Intent(getApplicationContext(), MainActivity.class);
        mainAct.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(mainAct);
        finish();
    }

    private void initViews() {

        // Inicialización de Botones y Campos de Texto (desde Layout)
        _emailText = findViewById(R.id.input_email);
        _passwordText = findViewById(R.id.input_password);

        _loginButton = findViewById(R.id.btn_login);
        _anonymousButton = findViewById(R.id.btn_login_A);

        _signUpLink = findViewById(R.id.link_signup);
        //_facebookButton = findViewById(R.id.btn_login_FB);
        //_signInGoogle = findViewById(R.id.btn_login_G);

    }
}
