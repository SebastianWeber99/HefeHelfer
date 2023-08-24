package hefe.example.hefe.ui.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.utils.widget.MotionButton;
import androidx.fragment.app.Fragment;

import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.tasks.Task;

import hefe.example.hefe.LanguageManager;
import hefe.example.hefe.R;

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
        button7 = rootView.findViewById(R.id.button7);

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


        return rootView;
    }
                // ... rest of your code ...
                private void startReviewFlow() {
                    if (reviewInfo != null) {
                        Task<Void> flow = manager.launchReviewFlow(requireActivity(), reviewInfo);
                        flow.addOnCompleteListener(task -> {
                            Toast.makeText(requireContext(), "Rating is completed", Toast.LENGTH_SHORT).show();
                        });
                    } else {
                        Toast.makeText(requireContext(), "Review information is not available", Toast.LENGTH_SHORT).show();
                    }
                }

    @Override
    public void onResume() {
        super.onResume();
        // Request review flow information when the fragment is resumed
        activateReviewInfo();
    }

    private void activateReviewInfo() {
        Task<ReviewInfo> managerInfoTask = manager.requestReviewFlow();
        managerInfoTask.addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                reviewInfo = task.getResult();
            } else {
                Toast.makeText(requireContext(), "Review failed to start", Toast.LENGTH_SHORT).show();
            }
        });
    }

        // ... rest of your code ...

        // Helper method to restart the activity to apply language changes to all components
        private void restartActivity() {
            Intent intent = getActivity().getIntent();
            requireActivity().finish();
            startActivity(intent);
        }
    }