package hefe.example.hefe.ui.rezepte;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import hefe.example.hefe.R;

public class RezepteFragment extends Fragment {
    private boolean isContentVisible1 = false;
    private TextView headlineTextView3;
    private TextView headlineTextView1;
    private TextView textView1;
    private ImageView imageView1;
    private TextView button1;
    private TextView headlineTextView6;
    private TextView textView2;
    private ImageView imageView2;
    private TextView button2;
    private TextView headlineTextView7;
    private TextView textView3;
    private ImageView imageView3;
    private TextView button3;
    private TextView headlineTextView8;
    private TextView textView4;
    private ImageView imageView4;
    private TextView button4;
    private TextView headlineTextView9;
    private TextView headlineTextView4;
    private TextView headlineTextView5;
    private TextView textView5;
    private ImageView imageView5;
    private TextView button5;
    private TextView textView6;
    private ImageView imageView6;
    private TextView button6;
    private TextView headlineTextView10;
    private TextView headlineTextView11;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_rezepte, container, false);

        headlineTextView1 = rootView.findViewById(R.id.headlineTextView1);
        headlineTextView3 = rootView.findViewById(R.id.headlineTextView3);
        textView1 = rootView.findViewById(R.id.textView1);
        imageView1 = rootView.findViewById(R.id.imageView1);
        button1 = rootView.findViewById(R.id.button1);
        headlineTextView6 = rootView.findViewById(R.id.headlineTextView6);
        textView2 = rootView.findViewById(R.id.textView2);
        imageView2 = rootView.findViewById(R.id.imageView2);
        button2 = rootView.findViewById(R.id.button2);
        headlineTextView7 = rootView.findViewById(R.id.headlineTextView7);
        textView3 = rootView.findViewById(R.id.textView3);
        imageView3 = rootView.findViewById(R.id.imageView3);
        button3 = rootView.findViewById(R.id.button3);
        headlineTextView8 = rootView.findViewById(R.id.headlineTextView8);
        textView4 = rootView.findViewById(R.id.textView4);
        imageView4 = rootView.findViewById(R.id.imageView4);
        button4 = rootView.findViewById(R.id.button4);
        headlineTextView9 = rootView.findViewById(R.id.headlineTextView9);
        textView5 = rootView.findViewById(R.id.textView5);
        imageView5 = rootView.findViewById(R.id.imageView5);
        button5 = rootView.findViewById(R.id.button5);
        textView6 = rootView.findViewById(R.id.textView6);
        imageView6 = rootView.findViewById(R.id.imageView6);
        button6 = rootView.findViewById(R.id.button6);
        headlineTextView10 = rootView.findViewById(R.id.headlineTextView10);
        headlineTextView4 = rootView.findViewById(R.id.headlineTextView4);
        headlineTextView5 = rootView.findViewById(R.id.headlineTextView5);
        headlineTextView11 = rootView.findViewById(R.id.headlineTextView11);

        // Setze die Views als standardmäßig unsichtbar
        updateVisibility(textView1, false);
        updateVisibility(imageView1, false);
        updateVisibility(button1, false);
        updateVisibility(headlineTextView6, false);
        updateVisibility(textView2, false);
        updateVisibility(imageView2, false);
        updateVisibility(button2, false);
        updateVisibility(headlineTextView7, false);
        updateVisibility(textView3, false);
        updateVisibility(imageView3, false);
        updateVisibility(button3, false);
        updateVisibility(headlineTextView8, false);
        updateVisibility(textView4, false);
        updateVisibility(imageView4, false);
        updateVisibility(button4, false);
        updateVisibility(headlineTextView9, false);
        updateVisibility(textView5, false);
        updateVisibility(imageView5, false);
        updateVisibility(button5, false);
        updateVisibility(textView6, false);
        updateVisibility(imageView6, false);
        updateVisibility(button6, false);
        updateVisibility(headlineTextView10, false);
        updateVisibility(headlineTextView4, false);
        updateVisibility(headlineTextView5, false);
        updateVisibility(headlineTextView3, false);
        updateVisibility(headlineTextView11, false);
        headlineTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isContentVisible1 = !isContentVisible1;
                updateVisibility(headlineTextView3, isContentVisible1);
                updateVisibility(textView1, isContentVisible1);
                updateVisibility(imageView1, isContentVisible1);
                updateVisibility(button1, isContentVisible1);
                updateVisibility(headlineTextView6, isContentVisible1);
                updateVisibility(textView2, isContentVisible1);
                updateVisibility(imageView2, isContentVisible1);
                updateVisibility(button2, isContentVisible1);
                updateVisibility(headlineTextView7, isContentVisible1);
                updateVisibility(textView3, isContentVisible1);
                updateVisibility(imageView3, isContentVisible1);
                updateVisibility(button3, isContentVisible1);
                updateVisibility(headlineTextView7, isContentVisible1);
                updateVisibility(textView4, isContentVisible1);
                updateVisibility(imageView4, isContentVisible1);
                updateVisibility(button4, isContentVisible1);
                updateVisibility(headlineTextView8, isContentVisible1);
                updateVisibility(textView5, isContentVisible1);
                updateVisibility(imageView5, isContentVisible1);
                updateVisibility(button5, isContentVisible1);
                updateVisibility(headlineTextView9, isContentVisible1);
                updateVisibility(textView6, isContentVisible1);
                updateVisibility(imageView6, isContentVisible1);
                updateVisibility(button6, isContentVisible1);
                updateVisibility(headlineTextView9, isContentVisible1);
                updateVisibility(headlineTextView4, isContentVisible1);
                updateVisibility(headlineTextView5, isContentVisible1);
                updateVisibility(headlineTextView11, isContentVisible1);
                updateConstraints();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.brooot.de/broetchen/kartoffelbroetchen/");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.brooot.de/weizenbrote/klassisches-basler-brot/");
            }
        });

// Füge weitere Button-ClickListener für die restlichen Buttons hinzu
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.brooot.de/weizenbrote/vollkorn-toastbrot/");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.brooot.de/mischbrote/joghurtkruste-2-0/");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.brooot.de/weizenbrote/die-rustikale-ciabatta-kruste/");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.brooot.de/mischbrote/die-saatenbombe/");
            }
        });
        return rootView;
    }

    private void updateConstraints() {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) headlineTextView3.getLayoutParams();

        if (isContentVisible1) {
            // Wenn der Inhalt sichtbar ist, passe die Constraints an
            layoutParams.topToBottom = R.id.headlineTextView1;
        } else {
            // Wenn der Inhalt unsichtbar ist, entferne die Constraints
            layoutParams.topToBottom = R.id.headlineTextView1;
        }

        // Setze die aktualisierten LayoutParams zurück
        headlineTextView3.setLayoutParams(layoutParams);
    }

    private void updateVisibility(View view, boolean isVisible) {
        if (isVisible) {
            view.setVisibility(View.VISIBLE);
        } else {
            view.setVisibility(View.GONE);
        }
    }











    private void openLink(String link) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
        startActivity(intent);
    }
}
