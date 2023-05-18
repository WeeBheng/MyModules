package sg.edu.rp.c346.id22016788.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleClass extends AppCompatActivity {

    TextView ModuleCode, ModuleName, ModuleYear, ModuleSemester, ModuleCredit, ModuleVenue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_class);
        ModuleCode = findViewById(R.id.ModuleCode);
        ModuleName = findViewById(R.id.ModuleName);
        ModuleYear = findViewById(R.id.Year);
        ModuleSemester = findViewById(R.id.Semester);
        ModuleCredit = findViewById(R.id.Credit);
        ModuleVenue = findViewById(R.id.Venue);

        Intent intentReceived = getIntent();
        String ModuleCode1 = intentReceived.getStringExtra("ModuleCode");
        String ModuleName1 = intentReceived.getStringExtra("ModuleName");
        int ModuleYear1 = intentReceived.getIntExtra("ModuleYear", 1);
        int ModuleSem = intentReceived.getIntExtra("ModuleSemester", 1);
        int ModuleCre = intentReceived.getIntExtra("ModuleCredit", 1);
        String ModuleVenue1 = intentReceived.getStringExtra("ModuleVenue");
        ModuleCode.setText("Module Code: " + ModuleCode1);
        ModuleName.setText("Module Name: " + ModuleName1);
        ModuleYear.setText("Academic Year: " + ModuleYear1);
        ModuleSemester.setText("Semester: " + ModuleSem);
        ModuleCredit.setText("Module Credit: " + ModuleCre);
        ModuleVenue.setText("Venue: " + ModuleVenue1);

    }
}