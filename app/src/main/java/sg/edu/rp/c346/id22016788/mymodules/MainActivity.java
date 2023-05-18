package sg.edu.rp.c346.id22016788.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    TextView Module1, Module2, Module3, Module4, Module5, Module6, Module7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Module1 = findViewById(R.id.Module1Display);
        Module2 = findViewById(R.id.Module2Display);
        Module3 = findViewById(R.id.Module3Display);
        Module4 = findViewById(R.id.Module4Display);
        Module5 = findViewById(R.id.Module5Display);
        Module6 = findViewById(R.id.Module6Display);
        Module7 = findViewById(R.id.Module7Display);

        Module1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleClass.class);
                intent.putExtra("ModuleCode", "C390");
                intent.putExtra("ModuleName", "Portfolio Development");
                intent.putExtra("ModuleYear", 2023);
                intent.putExtra("ModuleSemester",  1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("ModuleVenue", "N/A");
                startActivity(intent);
            }
        });

        Module2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleClass.class);
                intent.putExtra("ModuleCode", "C203");
                intent.putExtra("ModuleName", "Web AppIn Development in php");
                intent.putExtra("ModuleYear", 2023);
                intent.putExtra("ModuleSemester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("ModuleVenue", "W65D");
                startActivity(intent);
            }
        });

        Module3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleClass.class);
                intent.putExtra("ModuleCode", "C206");
                intent.putExtra("ModuleName", "Software Development Process");
                intent.putExtra("ModuleYear", 2023);
                intent.putExtra("ModuleSemester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("ModuleVenue", "W65D");
                startActivity(intent);
            }
        });

        Module4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleClass.class);
                intent.putExtra("ModuleCode", "C218");
                intent.putExtra("ModuleName", "UI/UX Design for Apps");
                intent.putExtra("ModuleYear", 2023);
                intent.putExtra("ModuleSemester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("ModuleVenue", "W65D");
                startActivity(intent);
            }
        });

        Module5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleClass.class);
                intent.putExtra("ModuleCode", "C235");
                intent.putExtra("ModuleName", "IT Security and Management");
                intent.putExtra("ModuleYear", 2023);
                intent.putExtra("ModuleSemester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("ModuleVenue", "W65D");
                startActivity(intent);
            }
        });

        Module6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleClass.class);
                intent.putExtra("ModuleCode", "C346");
                intent.putExtra("ModuleName", "Mobile App Development");
                intent.putExtra("ModuleYear", 2023);
                intent.putExtra("ModuleSemester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("ModuleVenue", "E63A");
                startActivity(intent);
            }
        });

        Module7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleClass.class);
                intent.putExtra("ModuleCode", "G953");
                intent.putExtra("ModuleName", "Life Skills III");
                intent.putExtra("ModuleYear", 2023);
                intent.putExtra("ModuleSemester", 1);
                intent.putExtra("ModuleCredit", 1);
                intent.putExtra("ModuleVenue", "HB02");
                startActivity(intent);
            }
        });
    }
}