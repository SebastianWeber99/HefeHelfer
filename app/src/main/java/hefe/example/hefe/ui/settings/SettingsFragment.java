package hefe.example.hefe.ui.settings;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Locale;

import hefe.example.hefe.LanguageManager;
import hefe.example.hefe.R;

public class SettingsFragment extends Fragment {

    private ImageButton languageDE;
    private ImageButton languageES;
    private ImageButton languageHR;
    private ImageButton languageFR;
    private ImageButton languageIT;
    private ImageButton languageJA;
    private ImageButton languageNL;
    private ImageButton languageRU;
    private ImageButton languageTR;
    private ImageButton languageUK;
    private ImageButton languageEN;
    private ImageButton languagePL;
    private ImageButton languageSA;
    private ImageButton languageCN;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_settings, container, false);

        languageDE = rootView.findViewById(R.id.languageDE);
        languageES = rootView.findViewById(R.id.languageES);
        languageHR = rootView.findViewById(R.id.languageHR);
        languageFR = rootView.findViewById(R.id.languageFR);
        languageIT = rootView.findViewById(R.id.languageIT);
        languageJA = rootView.findViewById(R.id.languageJA);
        languageNL = rootView.findViewById(R.id.languageNL);
        languageRU = rootView.findViewById(R.id.languageRU);
        languageTR = rootView.findViewById(R.id.languageTR);
        languageUK = rootView.findViewById(R.id.languageUK);
        languageEN = rootView.findViewById(R.id.languageEN);
        languagePL = rootView.findViewById(R.id.languagePL);
        languageSA = rootView.findViewById(R.id.languageSA);
        languageCN = rootView.findViewById(R.id.languageCN);

        LanguageManager languageManager = new LanguageManager(getActivity());

        languageDE.setOnClickListener(view -> {
            languageManager.updateResource("de");
            updateLanguage("de");
            restartActivity();
        });
        languageES.setOnClickListener(view -> {
            languageManager.updateResource("es");
            updateLanguage("es");
            restartActivity();
        });
        languageHR.setOnClickListener(view -> {
            languageManager.updateResource("hr");
            updateLanguage("hr");
            restartActivity();
        });
        languageFR.setOnClickListener(view -> {
            languageManager.updateResource("fr");
            updateLanguage("fr");
            restartActivity();
        });
        languageIT.setOnClickListener(view -> {
            languageManager.updateResource("it");
            updateLanguage("it");
            restartActivity();
        });
        languageJA.setOnClickListener(view -> {
            languageManager.updateResource("ja");
            updateLanguage("ja");
            restartActivity();
        });
        languageNL.setOnClickListener(view -> {
            languageManager.updateResource("nl");
            updateLanguage("nl");
            restartActivity();
        });
        languageRU.setOnClickListener(view -> {
            languageManager.updateResource("ru");
            updateLanguage("ru");
            restartActivity();
        });
        languageTR.setOnClickListener(view -> {
            languageManager.updateResource("tr");
            updateLanguage("tr");
            restartActivity();
        });
        languageUK.setOnClickListener(view -> {
            languageManager.updateResource("uk");
            updateLanguage("uk");
            restartActivity();
        });
        languageEN.setOnClickListener(view -> {
            languageManager.updateResource("en");
            updateLanguage("en");
            restartActivity();
        });
        languagePL.setOnClickListener(view -> {
            languageManager.updateResource("pl");
            updateLanguage("pl");
            restartActivity();
        });
        languageSA.setOnClickListener(view -> {
            languageManager.updateResource("ar");
            updateLanguage("ar");
            restartActivity();
        });
        languageCN.setOnClickListener(view -> {
            languageManager.updateResource("zh");
            updateLanguage("zh");
            restartActivity();
        });
        return rootView;
    }

    private void updateLanguage(String languageCode) {
        Locale newLocale = new Locale(languageCode);
        Locale.setDefault(newLocale);

        Configuration configuration = new Configuration(getResources().getConfiguration());
        configuration.setLocale(newLocale);

        getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());

        // Broadcast-Nachricht senden, um Aktualisierung in allen Aktivitäten anzufordern
        Intent refreshIntent = new Intent("LanguageChanged");
        requireContext().sendBroadcast(refreshIntent);
    }

    private void restartActivity() {
        Intent intent = getActivity().getIntent();
        getActivity().finish();
        startActivity(intent);
    }
}