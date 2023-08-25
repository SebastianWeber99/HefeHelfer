package hefe.example.hefe.ui.rezepte;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

import hefe.example.hefe.R;

public class RezepteFragment extends Fragment {
    private boolean isContentVisible1 = false;
    private TextView headlineTextView3;
    private TextView headlineTextView1;
    private TextView textView1;
    private ImageView imageView1;

    private TextView headlineTextView6;
    private TextView textView2;
    private ImageView imageView2;
    private TextView button2;
    private TextView headlineTextView7;
    private CardView cardView;
    private SearchView searchView;
    private List<String> itemList;
    private CardView cardView1;
    private Switch switch2;
    private Switch switch3;
    private Switch switch4;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_rezepte, container, false);

        headlineTextView1 = rootView.findViewById(R.id.headlineTextView1);
        headlineTextView3 = rootView.findViewById(R.id.headlineTextView3);
        textView1 = rootView.findViewById(R.id.textView1);
        imageView1 = rootView.findViewById(R.id.imageView1);
        cardView1 = rootView.findViewById(R.id.cardView1);  // Rufen Sie CardView1 entsprechend auf
        cardView = rootView.findViewById(R.id.cardView);
        headlineTextView6 = rootView.findViewById(R.id.headlineTextView6);
        textView2 = rootView.findViewById(R.id.textView2);
        imageView2 = rootView.findViewById(R.id.imageView2);

        headlineTextView7 = rootView.findViewById(R.id.headlineTextView7);
        switch2 = rootView.findViewById(R.id.switch2);
        switch3 = rootView.findViewById(R.id.switch3);
        switch4 = rootView.findViewById(R.id.switch4);
        searchView = rootView.findViewById(R.id.searchView);
        searchView.clearFocus();
        itemList = new ArrayList<>();
        switch4.setChecked(true);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.brooot.de/broetchen/kartoffelbroetchen/");
            }
        });

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://www.brooot.de/weizenbrote/klassisches-basler-brot/");
            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Hier können Sie eine Aktion ausführen, wenn die Suche eingereicht wird
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                List<String> filteredList = new ArrayList<>();
                for (String item : itemList) {
                    if (item.toLowerCase().contains(newText.toLowerCase())) {
                        filteredList.add(item);
                    }
                }

                // Hier führen Sie die Logik durch, um die 'CardViews' entsprechend zu aktualisieren
                updateCardViews(filteredList);

                return true;
            }
        });
        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                updateCardViews(itemList);

                // Wenn Switch2 aktiviert wird, deaktiviere Switch4
                if (isChecked) {
                    switch4.setChecked(false);
                }


            }
        });

        switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                updateCardViews(itemList);

                // Wenn Switch3 aktiviert wird, deaktiviere Switch4
                if (isChecked) {
                    switch4.setChecked(false);
                }


            }
        });

        switch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                updateCardViews(itemList);

                // Wenn Switch4 aktiviert wird, deaktiviere Switch2 und Switch3
                if (isChecked) {
                    switch2.setChecked(false);
                    switch3.setChecked(false);
                }

            }
        });

        return rootView;
    }


    private void openLink(String link) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
        startActivity(intent);
    }


    private void updateCardViews(List<String> filteredList) {
        boolean isSwitch2Active = switch2.isChecked();
        boolean isSwitch3Active = switch3.isChecked();
        boolean isSwitch4Active = switch4.isChecked();

        if (isSwitch4Active) {
            cardView.setVisibility(View.VISIBLE);
            cardView1.setVisibility(View.VISIBLE);
        } else {
            cardView1.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView.setVisibility(isSwitch3Active ? View.VISIBLE : View.GONE);
        }
    }


}
