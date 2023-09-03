package hefe.example.hefe.ui.home;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.TimeZone;

import hefe.example.hefe.R;

public class HomeFragment extends Fragment {
    private EditText numberField;
    private Button calculateButton;
    private TextView resultLabel;
    private TextView resultLabel2;
    private TextView resultLabel3;
    private TextView resultLabel4;
    private double resultLabel5 = 0.0; // New variable of type double for resultlabel5
    private EditText Celsius;
    private EditText editText1;
    private EditText editText3;
    private EditText editText4; // New EditText for the sum
    private EditText editText6; // New EditText for the sum
    private TextView textView16;
    private Button button3; // Corrected variable name
    private TextView contentTextView1;
    private TextView contentTextView2;
    private TextView contentTextView3;
    private TextView resultlabel4;
    private boolean iscontentTextView1Visible = false;
    private boolean iscontentTextView2Visible = false;

    private boolean iscontentTextView3Visible = false;
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        pref = this.getActivity().getSharedPreferences("my_pref",
                Context.MODE_PRIVATE);
        editor = pref.edit();

        numberField = rootView.findViewById(R.id.editText);
        calculateButton = rootView.findViewById(R.id.calculateButton);
        resultLabel = rootView.findViewById(R.id.resultlabel);
        resultLabel2 = rootView.findViewById(R.id.resultlabel2);
        textView16 = rootView.findViewById(R.id.textView18);
        resultLabel4 = rootView.findViewById(R.id.resultlabel4);
        Celsius = rootView.findViewById(R.id.editText3);
        editText4 = rootView.findViewById(R.id.editText4); // Initialize the new EditText
        editText6 = rootView.findViewById(R.id.editText6); // Initialize the new EditText
        textView16 = rootView.findViewById(R.id.textView16);
        button3 = rootView.findViewById(R.id.button3);
        numberField.addTextChangedListener(decimalTextWatcher);
        Celsius.addTextChangedListener(decimalTextWatcher);
        contentTextView1 = rootView.findViewById(R.id.contentTextView1);
        contentTextView2 = rootView.findViewById(R.id.contentTextView2);
        contentTextView3 = rootView.findViewById(R.id.contentTextView3);
        resultLabel4 = rootView.findViewById(R.id.resultlabel4);
        contentTextView1.setVisibility(View.GONE);
        contentTextView2.setVisibility(View.GONE);
        contentTextView3.setVisibility(View.GONE);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResultLabel5();
                calculateResult();
                updateTime();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iscontentTextView1Visible = !iscontentTextView1Visible;
                iscontentTextView2Visible = !iscontentTextView2Visible;
                iscontentTextView3Visible = !iscontentTextView3Visible;
                updatecontentTextView1Visibility();
                updatecontentTextView2Visibility();
                updatecontentTextView3Visibility();
            }
        });
        resultLabel4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // Nicht benötigt
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                editor.putString("resultLabel4", charSequence.toString());
                editor.apply();
            }

            @Override
            public void afterTextChanged(Editable editable) {
                // Nicht benötigt
            }
        });

        return rootView;
    }

    private TextWatcher decimalTextWatcher = new TextWatcher() {
        private boolean isEditing;

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            if (isEditing) return;
            isEditing = true;

            String originalText = s.toString();
            String formattedText = originalText.replace(',', '.');

            if (!formattedText.equals(originalText)) {
                // Wenn das Format geändert wurde, setze den neuen formatierten Text zurück
                s.replace(0, s.length(), formattedText);
            }

            isEditing = false;
        }
    };

    private void calculateResultLabel5() {
        String input1 = editText4.getText().toString().trim();
        String input2 = editText6.getText().toString().trim();

        if (input1.isEmpty() || input2.isEmpty()) {
            // If any of the input fields are empty, show an error message or handle it accordingly
            Toast.makeText(getActivity(), "Bitte geben Sie beide Werte ein", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double value1 = Double.parseDouble(input1);
            double value2 = Double.parseDouble(input2);

            // Perform your calculation for resultlabel5
            double result = value1 + (value2 / 60); // For example, you can add both values
            // Format the result to display only 2 decimal places

            resultLabel5 = result; // Update the resultLabel5 double variable

            // Update the TextView with the calculated value


        } catch (NumberFormatException e) {
            // Handle the parsing error, show an error message or handle it accordingly
            Toast.makeText(getActivity(), "Ungültige Eingabe", Toast.LENGTH_SHORT).show();
        }
    }

    private void calculateResult() {
        String input = numberField.getText().toString().trim();
        if (input.isEmpty()) {
            // Wenn das Feld leer ist, zeige eine Fehlermeldung oder handle es entsprechend
            Toast.makeText(getActivity(), "Bitte geben Sie eine Zahl ein", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double number = Double.parseDouble(input);
            double factor1 = resultLabel5; // Use the resultLabel5 double value instead of parsing it from the TextView
            double factor2 = Double.parseDouble(Celsius.getText().toString());

            if (factor2 < 6 || factor2 > 48) {
                Toast.makeText(getActivity(), "Bitte Grad im Bereich 6-48 angeben", Toast.LENGTH_SHORT).show();
                return;
            }

            // Berechnung von factor1 basierend auf dem Eingabebereich
            if (factor1 >= 0.1 && factor1 <= 38) {
                factor1 = 0.9986090369155 * Math.pow(factor1, -1.4482936391728);
            } else if (factor1 > 38 && factor1 <= 60) {
                factor1 = -0.0000000237485 * Math.pow(factor1, 4)
                        + 0.0000040372705 * Math.pow(factor1, 3)
                        - 0.0002555371044 * Math.pow(factor1, 2)
                        + 0.0070878839939 * factor1
                        - 0.070721168739;
            } else {
                Toast.makeText(getActivity(), "Der Wert für Stunden muss zwischen 0.1 und 60 liegen.", Toast.LENGTH_SHORT).show();
                return;
            }

            double result = (number * 0.4603 + 15.34) * (6.4167364361284 * Math.exp(-0.1857846786979 * factor2) * factor1);
            double dividedResult = result / 3.0;


            // Format the results to display only 2 decimal places
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String formattedResult = decimalFormat.format(result) + "g";
            String formattedDividedResult = decimalFormat.format(dividedResult) + "g";



            resultLabel.setText(formattedResult);
            resultLabel2.setText(formattedDividedResult);


        } catch (NumberFormatException e) {
            // Fehler beim Parsen der Zahl, zeige eine Fehlermeldung oder handle es entsprechend
            Toast.makeText(getActivity(), "Ungültige Eingabe", Toast.LENGTH_SHORT).show();
        }
    }

    private void updateTime() {
        // Use the resultLabel5 double value directly
        double selectedFactor = resultLabel5;

        // Convert the selectedFactor from hours to minutes
        int minutesToAdd = (int) (selectedFactor * 60);

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("Europe/Berlin"));
        calendar.add(Calendar.MINUTE, minutesToAdd); // Add the calculated minutes to the current time

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        String currentTime = String.format("%02d:%02d", hour, minute);
        showTime(currentTime);
    }


    private void updatecontentTextView1Visibility() {
        if (iscontentTextView1Visible) {
            contentTextView1.setVisibility(View.VISIBLE);
        } else {
            contentTextView1.setVisibility(View.GONE);
        }
    }

    private void updatecontentTextView2Visibility() {
        if (iscontentTextView2Visible) {
            contentTextView2.setVisibility(View.VISIBLE);
        } else {
            contentTextView2.setVisibility(View.GONE);
        }
    }

    private void updatecontentTextView3Visibility() {
        if (iscontentTextView3Visible) {
            contentTextView3.setVisibility(View.VISIBLE);
        } else {
            contentTextView3.setVisibility(View.GONE);
        }
    }

    private void showTime(String time) {
        String uhrString = getResources().getString(R.string.uhr);
        String timeWithSuffix = time + " " + uhrString;
        resultLabel4.setText(timeWithSuffix);
    }


    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        // Setze den Text des TextView40 auf den eingegebenen Text in TextView7
        resultLabel4.setText(charSequence);
        editor.putString("resultLabel4", resultLabel4.getText().toString());
        editor.apply();
    }
    @Override
    public void onStart() {
        super.onStart();

        // ... deine bestehende Logik ...

        String resultLabel4Val = pref.getString("resultLabel4", "n/a");
        if (!resultLabel4Val.equals("n/a")) {
            resultLabel4.setText(resultLabel4Val);
        }

        // ... deine bestehende Logik ...
    }

}