import androidx.appcompat.app.AppCompatActivity;

package com.example.students;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation_view);

        // Configura el listener de la barra de navegación inferior
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_second:
                        startActivity(new Intent(MainActivity.this, SecondActivity.class));
                        return true;
                    case R.id.action_third:
                        startActivity(new Intent(MainActivity.this, ThirdActivity.class));
                        return true;
                    case R.id.action_fourth:
                        startActivity(new Intent(MainActivity.this, FourthActivity.class));
                        return true;
                }
                return false;
            }
        });

        // Muestra la actividad inicial (Main Activity)
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new MainFragment()).commit();
    }
}
