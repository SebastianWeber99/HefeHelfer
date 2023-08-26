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
    private CardView cardView2;  // Position 15
    private CardView cardView3;  // Position 16
    private CardView cardView4;  // Position 17
    private CardView cardView5;  // Position 18
    private CardView cardView6;  // Position 19
    private CardView cardView7;  // Position 20
    private CardView cardView8;  // Position 21
    private CardView cardView9;  // Position 22
    private CardView cardView10; // Position 23
    private CardView cardView11; // Position 24
    private CardView cardView12; // Position 25
    private CardView cardView13; // Position 26
    private CardView cardView14; // Position 27
    private CardView cardView15; // Position 28
    private CardView cardView16; // Position 29
    private CardView cardView17; // Position 30
    private CardView cardView18; // Position 31
    private CardView cardView19; // Position 32
    private CardView cardView20; // Position 33
    private CardView cardView21; // Position 34
    private CardView cardView22; // Position 35
    private CardView cardView23; // Position 36
    private CardView cardView24; // Position 37
    private CardView cardView25; // Position 38
    private CardView cardView26; // Position 39

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
        cardView1 = rootView.findViewById(R.id.cardView1);
        cardView2 = rootView.findViewById(R.id.cardView2);
        cardView3 = rootView.findViewById(R.id.cardView3);
        cardView4 = rootView.findViewById(R.id.cardView4);
        cardView5 = rootView.findViewById(R.id.cardView5);
        cardView6 = rootView.findViewById(R.id.cardView6);
        cardView7 = rootView.findViewById(R.id.cardView7);
        cardView8 = rootView.findViewById(R.id.cardView8);
        cardView9 = rootView.findViewById(R.id.cardView9);
        cardView10 = rootView.findViewById(R.id.cardView10);
        cardView11 = rootView.findViewById(R.id.cardView11);
        cardView12 = rootView.findViewById(R.id.cardView12);
        cardView13 = rootView.findViewById(R.id.cardView13);
        cardView14 = rootView.findViewById(R.id.cardView14);
        cardView15 = rootView.findViewById(R.id.cardView15);  // Position 28
        cardView16 = rootView.findViewById(R.id.cardView16);  // Position 29
        cardView17 = rootView.findViewById(R.id.cardView17);  // Position 30
        cardView18 = rootView.findViewById(R.id.cardView18);  // Position 31
        cardView19 = rootView.findViewById(R.id.cardView19);  // Position 32
        cardView20 = rootView.findViewById(R.id.cardView20);  // Position 33
        cardView21 = rootView.findViewById(R.id.cardView21);  // Position 34
        cardView22 = rootView.findViewById(R.id.cardView22);  // Position 35
        cardView23 = rootView.findViewById(R.id.cardView23);  // Position 36
        cardView24 = rootView.findViewById(R.id.cardView24);  // Position 37
        cardView25 = rootView.findViewById(R.id.cardView25);  // Position 38
        cardView26 = rootView.findViewById(R.id.cardView26);  // Position 39
    // Position 40
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
        cardView2.setVisibility(View.VISIBLE);
        cardView3.setVisibility(View.VISIBLE);
        cardView4.setVisibility(View.VISIBLE);
        cardView5.setVisibility(View.VISIBLE);
        cardView6.setVisibility(View.VISIBLE);
        cardView7.setVisibility(View.VISIBLE);
        cardView8.setVisibility(View.VISIBLE);
        cardView9.setVisibility(View.VISIBLE);
        cardView10.setVisibility(View.VISIBLE);
        cardView11.setVisibility(View.VISIBLE);
        cardView12.setVisibility(View.VISIBLE);
        cardView13.setVisibility(View.VISIBLE);
        cardView14.setVisibility(View.VISIBLE);
        cardView15.setVisibility(View.VISIBLE);
        cardView16.setVisibility(View.VISIBLE);
        cardView17.setVisibility(View.VISIBLE);
        cardView18.setVisibility(View.VISIBLE);
        cardView19.setVisibility(View.VISIBLE);
        cardView20.setVisibility(View.VISIBLE);
        cardView21.setVisibility(View.VISIBLE);
        cardView22.setVisibility(View.VISIBLE);
        cardView23.setVisibility(View.VISIBLE);
        cardView24.setVisibility(View.VISIBLE);
        cardView25.setVisibility(View.VISIBLE);
        cardView26.setVisibility(View.VISIBLE);
        } else {
            cardView1.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView2.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView3.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView4.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView5.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView6.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView7.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView8.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView9.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView10.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView11.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView12.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView13.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView14.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView15.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView16.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView17.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView18.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView19.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView20.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView21.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView22.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView23.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView24.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView25.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
            cardView26.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);

        }

    }


}
