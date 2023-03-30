import androidx.appcompat.app.AppCompatActivity;

package com.example.students;

public class FourthActivity extends AppCompatActivity {


    private EditText editTextName, editTextEmail, editTextPassword;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        editTextName = findViewById(R.id.edit_text_name);
        editTextEmail = findViewById(R.id.edit_text_email);
        editTextPassword = findViewById(R.id.edit_text_password);
        buttonRegister = findViewById(R.id.button_register);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();

                // Guarda los datos del usuario en una base de datos o realiza otra acción requerida por la aplicación
                // ...

                Toast.makeText(FourthActivity.this, "¡Registro completado con éxito!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
