package pro.example.pro.ui.settings;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.utils.widget.MotionButton;
import androidx.fragment.app.Fragment;

import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;

import hefe.example.hefe.R;
import pro.example.pro.LanguageManager;

public class SettingsFragment extends Fragment {

    private final String TAG = "SettingsFragment";
    private ReviewInfo reviewInfo;
    private ReviewManager manager;
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

    private ImageButton languageUSA;
private MotionButton button7;
    private TextView versionText;

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
        languageUSA = rootView.findViewById(R.id.languageUSA);
        versionText = rootView.findViewById(R.id.Version);


        LanguageManager languageManager = new LanguageManager(getActivity());

        languageDE.setOnClickListener(view -> {
            languageManager.updateResource("de");
            restartActivity();
        });
        languageES.setOnClickListener(view -> {
            languageManager.updateResource("es");
            restartActivity();
        });
        languageHR.setOnClickListener(view -> {
            languageManager.updateResource("hr");
            restartActivity();
        });
        languageFR.setOnClickListener(view -> {
            languageManager.updateResource("fr");
            restartActivity();
        });
        languageIT.setOnClickListener(view -> {
            languageManager.updateResource("it");
            restartActivity();
        });
        languageJA.setOnClickListener(view -> {
            languageManager.updateResource("ja");
            restartActivity();
        });
        languageNL.setOnClickListener(view -> {
            languageManager.updateResource("nl");
            restartActivity();
        });
        languageRU.setOnClickListener(view -> {
            languageManager.updateResource("ru");
            restartActivity();
        });
        languageTR.setOnClickListener(view -> {
            languageManager.updateResource("tr");
            restartActivity();
        });
        languageUK.setOnClickListener(view -> {
            languageManager.updateResource("uk");
            restartActivity();
        });
        languageEN.setOnClickListener(view -> {
            languageManager.updateResource("en-GB");
            restartActivity();
        });
        languagePL.setOnClickListener(view -> {
            languageManager.updateResource("pl");
            restartActivity();
        });
        languageSA.setOnClickListener(view -> {
            languageManager.updateResource("ar");
            restartActivity();
        });
        languageCN.setOnClickListener(view -> {
            languageManager.updateResource("zh");
            restartActivity();
        });
        languageUSA.setOnClickListener(view -> {
                    languageManager.updateResource("en-US");
                    restartActivity();
        });
        manager = ReviewManagerFactory.create(requireContext());

        // ... (language button click listeners)



        PackageInfo pInfo = null;
        try {
            pInfo = this.getContext().getPackageManager().getPackageInfo(this.getContext().getPackageName(), 0);
            String version = pInfo.versionName;
            versionText.setText("Version: " + version);
            Log.d(TAG, "onCreateView: " + version);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
        return rootView;
    }






        private void restartActivity() {
            Intent intent = getActivity().getIntent();
            requireActivity().finish();
            startActivity(intent);
        }
    }