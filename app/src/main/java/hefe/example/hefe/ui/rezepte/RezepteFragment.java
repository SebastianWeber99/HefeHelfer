package hefe.example.hefe.ui.rezepte;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
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
    private CardView cardView27; // Position 40
    private CardView cardView28; // Position 41
    private CardView cardView29; // Position 42
    private CardView cardView30; // Position 43
    private CardView cardView31; // Position 44
    private CardView cardView32; // Position 45
    private CardView cardView33; // Position 46
    private CardView cardView34; // Position 47
    private CardView cardView35; // Position 48
    private CardView cardView36; // Position 49
    private CardView cardView37; // Position 50
    private CardView cardView38; // Position 51
    private CardView cardView39; // Position 52
    private CardView cardView40; // Position 53
    private CheckBox checkBox;
    private CheckBox checkBox2;
    private CheckBox checkBox4;
    private CheckBox checkBox5;
    private CheckBox checkBox6;
    private CheckBox checkBox7;
    private CheckBox checkBox8;
    private CheckBox checkBox9;
    private CheckBox checkBox10;
    private CheckBox checkBox11;
    private CheckBox checkBox12;
    private CheckBox checkBox13;
    private CheckBox checkBox14;
    private CheckBox checkBox15;
    private CheckBox checkBox16;
    private CheckBox checkBox17;
    private CheckBox checkBox18;
    private CheckBox checkBox19;
    private CheckBox checkBox20;
    private CheckBox checkBox21;
    private CheckBox checkBox22;
    private CheckBox checkBox23;
    private CheckBox checkBox24;
    private CheckBox checkBox25;
    private CheckBox checkBox26;
    private CheckBox checkBox27;
    private CheckBox checkBox28;
    private CheckBox checkBox29;
    private CheckBox checkBox30;
    private CheckBox checkBox31;
    private CheckBox checkBox32;
    private CheckBox checkBox33;
    private CheckBox checkBox34;
    private CheckBox checkBox35;
    private CheckBox checkBox36;
    private CheckBox checkBox37;
    private CheckBox checkBox38;
    private CheckBox checkBox39;
    private CheckBox checkBox40;
    private CheckBox checkBox41;
    private CheckBox checkBox42;
    private CheckBox checkBox43;
    private CheckBox checkBox44;


    private Switch switch2;
    private Switch switch3;
    private Switch switch4;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_rezepte, container, false);



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

        cardView28 = rootView.findViewById(R.id.cardView28);  // Position 41
        cardView29 = rootView.findViewById(R.id.cardView29);  // Position 42
        cardView30 = rootView.findViewById(R.id.cardView30);  // Position 43
        cardView31 = rootView.findViewById(R.id.cardView31);  // Position 44
        cardView32 = rootView.findViewById(R.id.cardView32);  // Position 45
        cardView33 = rootView.findViewById(R.id.cardView33);  // Position 46
        cardView34 = rootView.findViewById(R.id.cardView34);  // Position 47
        cardView35 = rootView.findViewById(R.id.cardView35);  // Position 48
        cardView36 = rootView.findViewById(R.id.cardView36);  // Position 49
        cardView37 = rootView.findViewById(R.id.cardView37);  // Position 50
        cardView38 = rootView.findViewById(R.id.cardView38);  // Position 51
        cardView39 = rootView.findViewById(R.id.cardView39);  // Position 52
        cardView40 = rootView.findViewById(R.id.cardView40);  // Position 53
  // Position 39
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
         checkBox = rootView.findViewById(R.id.checkBox); // Pass entsprechende IDs an
       checkBox2 = rootView.findViewById(R.id.checkBox2); // Pass entsprechende IDs an
       checkBox4 = rootView.findViewById(R.id.checkBox4); // Pass entsprechende IDs an
        checkBox5 = rootView.findViewById(R.id.checkbox5);
        checkBox6 = rootView.findViewById(R.id.checkbox6);
        checkBox7 = rootView.findViewById(R.id.checkbox7);
        checkBox8 = rootView.findViewById(R.id.checkbox8);
        checkBox9 = rootView.findViewById(R.id.checkbox9);
        checkBox10 = rootView.findViewById(R.id.checkbox10);
        checkBox11 = rootView.findViewById(R.id.checkbox11);
        checkBox12 = rootView.findViewById(R.id.checkbox12);
        checkBox13 = rootView.findViewById(R.id.checkbox13);
        checkBox14 = rootView.findViewById(R.id.checkbox14);
        checkBox15 = rootView.findViewById(R.id.checkbox15);
        checkBox16 = rootView.findViewById(R.id.checkbox16);
        checkBox17 = rootView.findViewById(R.id.checkbox17);
        checkBox18 = rootView.findViewById(R.id.checkbox18);
        checkBox19 = rootView.findViewById(R.id.checkbox19);
        checkBox20 = rootView.findViewById(R.id.checkbox20);
        checkBox21 = rootView.findViewById(R.id.checkbox21);
        checkBox22 = rootView.findViewById(R.id.checkbox22);
        checkBox23 = rootView.findViewById(R.id.checkbox23);
        checkBox24 = rootView.findViewById(R.id.checkbox24);
        checkBox25 = rootView.findViewById(R.id.checkbox25);
        checkBox26 = rootView.findViewById(R.id.checkbox26);
        checkBox27 = rootView.findViewById(R.id.checkbox27);
        checkBox28 = rootView.findViewById(R.id.checkbox28);
        checkBox29 = rootView.findViewById(R.id.checkbox29);
        checkBox30 = rootView.findViewById(R.id.checkbox30);
        checkBox31 = rootView.findViewById(R.id.checkbox31);
        checkBox32 = rootView.findViewById(R.id.checkbox32);
        checkBox33 = rootView.findViewById(R.id.checkbox33);
        checkBox34 = rootView.findViewById(R.id.checkbox34);
        checkBox35 = rootView.findViewById(R.id.checkbox35);
        checkBox36 = rootView.findViewById(R.id.checkbox36);
        checkBox37 = rootView.findViewById(R.id.checkbox37);
        checkBox38 = rootView.findViewById(R.id.checkbox38);
        checkBox39 = rootView.findViewById(R.id.checkbox39);
        checkBox40 = rootView.findViewById(R.id.checkbox40);
        checkBox41 = rootView.findViewById(R.id.checkbox41);
        checkBox42 = rootView.findViewById(R.id.checkbox42);
        checkBox43 = rootView.findViewById(R.id.checkbox43);
        checkBox44 = rootView.findViewById(R.id.checkbox44);


        setupCardViewClickListener(cardView, "https://www.brooot.de/broetchen/kartoffelbroetchen/");
        setupCardViewClickListener(cardView1, "https://www.brooot.de/weizenbrote/klassisches-basler-brot/");
        setupCardViewClickListener(cardView2, "https://www.brooot.de/weizenbrote/vollkorn-toastbrot/");
        setupCardViewClickListener(cardView3, "https://www.brooot.de/mischbrote/all-in-one-joghurt-brot/");
        setupCardViewClickListener(cardView4, "https://www.brooot.de/weizenbrote/schnelles-5-stunden-bierbrot/");
        setupCardViewClickListener(cardView5, "https://www.brooot.de/broetchen/salzstangen-selber-machen/");
        setupCardViewClickListener(cardView6, "https://www.brooot.de/broetchen/fruehstuecks-broetchen/");
        setupCardViewClickListener(cardView7, "https://www.brooot.de/broetchen/laugenstangen-selber-machen/");
        setupCardViewClickListener(cardView8, "https://www.brooot.de/mischbrote/friss-dich-dumm-brot-2-0/");
        setupCardViewClickListener(cardView9, "https://www.brooot.de/weizenbrote/all-in-one-kefir-kruste/");
        setupCardViewClickListener(cardView10, "https://www.brooot.de/broetchen/burger-buns-selber-backen/");
        setupCardViewClickListener(cardView11, "https://www.brooot.de/broetchen/toasties-toast-broetchen/");
        setupCardViewClickListener(cardView12, "https://www.brooot.de/weizenbrote/no-knead-topfbrot-mit-apfel-und-mohn/");
        setupCardViewClickListener(cardView13, "https://www.brooot.de/weizenbrote/klassisches-bernerbrot/");
        setupCardViewClickListener(cardView14, "https://www.brooot.de/weizenbrote/weizen-brot-mit-einfachem-teig-und-kalter-gare-im-kuehlschrank/");
        setupCardViewClickListener(cardView15, "https://www.brooot.de/mischbrote/vollkorn-koernerbrot-im-kasten/");
        setupCardViewClickListener(cardView16, "https://www.brooot.de/mischbrote/bayerisches-hausbrot/");
        setupCardViewClickListener(cardView17, "https://www.brooot.de/mischbrote/fendu-mischbrot-ecken/");
        setupCardViewClickListener(cardView18, "https://www.brooot.de/mischbrote/hefe-bauernbrot/");
        setupCardViewClickListener(cardView19, "https://www.brooot.de/weizenbrote/die-rustikale-ciabatta-kruste/");
        setupCardViewClickListener(cardView20, "https://www.brooot.de/mischbrote/das-homeoffice-feierabendbrot/");
        setupCardViewClickListener(cardView21, "https://www.brooot.de/weizenbrote/supersoftes-fruehlingsbrot-mit-karotte/");
        setupCardViewClickListener(cardView22, "https://www.brooot.de/weizenbrote/sonnenblumenkerne-brot/");
        setupCardViewClickListener(cardView23, "https://www.brooot.de/weizenbrote/franzoesisches-baguette-selber-backen/");
        setupCardViewClickListener(cardView24, "https://www.brooot.de/weizenbrote/tuerkisches-fladenbrot-pide-ramazan-pidesi/");
        setupCardViewClickListener(cardView25, "https://www.brooot.de/mischbrote/rezept-fuer-pane-vallemaggia/");
        setupCardViewClickListener(cardView26, "https://www.brooot.de/mischbrote/die-saatenbombe/");

        setupCardViewClickListener(cardView28, "https://www.brooot.de/roggenbrote/rezept-fuer-roggenvollkornbrot/");
        setupCardViewClickListener(cardView29, "https://www.brooot.de/mischbrote/saatiges-wurzelbrot-mit-weizen-und-roggen/");
        setupCardViewClickListener(cardView30, "https://www.brooot.de/mischbrote/kartoffel-bier-krustenbrot/");
        setupCardViewClickListener(cardView31, "https://www.brooot.de/mischbrote/auffrisch-zwillingsbrote/");
        setupCardViewClickListener(cardView32, "https://www.brooot.de/weizenbrote/knorzen-wurzelbrot/");
        setupCardViewClickListener(cardView33, "https://www.brooot.de/weizenbrote/sauerteig-baguette/");
        setupCardViewClickListener(cardView34, "https://www.brooot.de/mischbrote/rezept-fuer-frankenlaib/");
        setupCardViewClickListener(cardView35, "https://www.brooot.de/weizenbrote/1050er-brot/");
        setupCardViewClickListener(cardView36, "https://www.brooot.de/mischbrote/sechskornbrot/");
        setupCardViewClickListener(cardView37, "https://www.brooot.de/weizenbrote/focaccia-im-kasten/");
        setupCardViewClickListener(cardView38, "https://www.brooot.de/mischbrote/bauernbrot-im-kasten/");
        setupCardViewClickListener(cardView39, "https://www.brooot.de/weizenbrote/ruchbrot-stangen/");
        setupCardViewClickListener(cardView40, "https://www.brooot.de/mischbrote/die-maillard-muehlenkruste/");
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

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                updateCardViews();
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                updateCardViews();
            }
        });

        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                updateCardViews();
            }
        });





        return rootView;
    }

    private void setupCardViewClickListener(CardView cardView, final String link) {
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink(link);
            }
        });
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

            cardView28.setVisibility(View.VISIBLE);
            cardView29.setVisibility(View.VISIBLE);
            cardView30.setVisibility(View.VISIBLE);
            cardView31.setVisibility(View.VISIBLE);
            cardView32.setVisibility(View.VISIBLE);
            cardView33.setVisibility(View.VISIBLE);
            cardView34.setVisibility(View.VISIBLE);
            cardView35.setVisibility(View.VISIBLE);
            cardView36.setVisibility(View.VISIBLE);
            cardView37.setVisibility(View.VISIBLE);
            cardView38.setVisibility(View.VISIBLE);
            cardView39.setVisibility(View.VISIBLE);
            cardView40.setVisibility(View.VISIBLE);

        } else {
            cardView.setVisibility(isSwitch2Active ? View.VISIBLE : View.GONE);
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

            cardView28.setVisibility(isSwitch3Active ? View.VISIBLE : View.GONE);
            cardView29.setVisibility(isSwitch3Active ? View.VISIBLE : View.GONE);
            cardView30.setVisibility(isSwitch3Active ? View.VISIBLE : View.GONE);
            cardView31.setVisibility(isSwitch3Active ? View.VISIBLE : View.GONE);
            cardView32.setVisibility(isSwitch3Active ? View.VISIBLE : View.GONE);
            cardView33.setVisibility(isSwitch3Active ? View.VISIBLE : View.GONE);
            cardView34.setVisibility(isSwitch3Active ? View.VISIBLE : View.GONE);
            cardView35.setVisibility(isSwitch3Active ? View.VISIBLE : View.GONE);
            cardView36.setVisibility(isSwitch3Active ? View.VISIBLE : View.GONE);
            cardView37.setVisibility(isSwitch3Active ? View.VISIBLE : View.GONE);
            cardView38.setVisibility(isSwitch3Active ? View.VISIBLE : View.GONE);
            cardView39.setVisibility(isSwitch3Active ? View.VISIBLE : View.GONE);
            cardView40.setVisibility(isSwitch3Active ? View.VISIBLE : View.GONE);

        }

    }
    private void updateCardViews() {
        boolean isCheckBoxActive = checkBox.isChecked();
        boolean isCheckBox2Active = checkBox2.isChecked();
        boolean isCheckBox4Active = checkBox4.isChecked();

        // Abhängig von den Checkbox-Zuständen, steuere die Sichtbarkeit der CardViews
        cardView.setVisibility(isCheckBoxActive ? View.GONE : View.VISIBLE);
        cardView2.setVisibility(isCheckBox2Active ? View.VISIBLE : View.GONE);
        cardView4.setVisibility(isCheckBox4Active ? View.VISIBLE : View.GONE);

        // ...
    }


}
