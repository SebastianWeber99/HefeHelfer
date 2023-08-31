package hefe.example.hefe;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class firstContent extends AppCompatActivity {

    private CheckBox checkBox5;
    private CheckBox checkBox6;
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_content);

        checkBox5 = findViewById(R.id.checkbox5);
        checkBox6 = findViewById(R.id.checkbox6);

        pref = getSharedPreferences("my_pref",
                Context.MODE_PRIVATE);
        editor = pref.edit();

        // Wiederherstellen des Zustands der Checkboxen aus den SharedPreferences
        boolean checkBox5State = pref.getBoolean("checkBox5", false);
        boolean checkBox6State = pref.getBoolean("checkBox6", false);
        checkBox5.setChecked(checkBox5State);
        checkBox6.setChecked(checkBox6State);

        checkBox5.setOnCheckedChangeListener((buttonView, isChecked) -> {
            editor.putBoolean("checkBox5", isChecked);
            editor.apply();
        });

        checkBox6.setOnCheckedChangeListener((buttonView, isChecked) -> {
            editor.putBoolean("checkBox6", isChecked);
            editor.apply();
        });
    }

}
