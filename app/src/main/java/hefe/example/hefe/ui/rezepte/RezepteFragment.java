    package hefe.example.hefe.ui.rezepte;

    import android.content.Context;
    import android.content.Intent;
    import android.content.SharedPreferences;
    import android.net.Uri;
    import android.os.Bundle;
    import android.util.Log;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.CheckBox;
    import android.widget.CompoundButton;
    import android.widget.Switch;

    import androidx.annotation.NonNull;
    import androidx.cardview.widget.CardView;
    import androidx.fragment.app.Fragment;

    import com.google.android.gms.ads.AdRequest;
    import com.google.android.gms.ads.FullScreenContentCallback;
    import com.google.android.gms.ads.LoadAdError;
    import com.google.android.gms.ads.MobileAds;
    import com.google.android.gms.ads.initialization.InitializationStatus;
    import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
    import com.google.android.gms.ads.interstitial.InterstitialAd;
    import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

    import java.util.ArrayList;

    import hefe.example.hefe.R;

    public class RezepteFragment extends Fragment {


        private ArrayList<View> allCardViews;
        private String currentLink = "";
        private InterstitialAd mInterstitialAd;
        private static final String TAG = "RezepteFragment"; // Update TAG appropriately


        private Switch switch2;
        private Switch switch3;
        private Switch switch4;


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_rezepte, container, false);

            switch2 = view.findViewById(R.id.switch2);
            switch3 = view.findViewById(R.id.switch3);
            switch4 = view.findViewById(R.id.switch4);


            SharedPreferences pref = requireContext().getSharedPreferences("my_pref", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = pref.edit();


            // Inflate the first_content.xml layout
            View firstContentView = inflater.inflate(R.layout.first_content, container, false);
            View cardView = view.findViewById(R.id.cardView);
            View cardView1 = view.findViewById(R.id.cardView1);
            View cardView2 = view.findViewById(R.id.cardView2);
            View cardView3 = view.findViewById(R.id.cardView3);
            View cardView4 = view.findViewById(R.id.cardView4);
            View cardView5 = view.findViewById(R.id.cardView5);
            View cardView6 = view.findViewById(R.id.cardView6);
            View cardView7 = view.findViewById(R.id.cardView7);
            View cardView8 = view.findViewById(R.id.cardView8);
            View cardView9 = view.findViewById(R.id.cardView9);
            View cardView10 = view.findViewById(R.id.cardView10);
            View cardView11 = view.findViewById(R.id.cardView11);
            View cardView12 = view.findViewById(R.id.cardView12);
            View cardView13 = view.findViewById(R.id.cardView13);
            View cardView14 = view.findViewById(R.id.cardView14);
            View cardView15 = view.findViewById(R.id.cardView15);
            View cardView16 = view.findViewById(R.id.cardView16);
            View cardView17 = view.findViewById(R.id.cardView17);
            View cardView18 = view.findViewById(R.id.cardView18);
            View cardView19 = view.findViewById(R.id.cardView19);
            View cardView20 = view.findViewById(R.id.cardView20);
            View cardView21 = view.findViewById(R.id.cardView21);


            CheckBox checkBox5 = view.findViewById(R.id.checkbox5);
            CheckBox checkBox6 = view.findViewById(R.id.checkbox6);
            CheckBox checkBox7 = view.findViewById(R.id.checkbox7);
            CheckBox checkBox8 = view.findViewById(R.id.checkbox8);
            CheckBox checkBox9 = view.findViewById(R.id.checkbox9);
            CheckBox checkBox10 = view.findViewById(R.id.checkbox10);
            CheckBox checkBox11 = view.findViewById(R.id.checkbox11);
            CheckBox checkBox12 = view.findViewById(R.id.checkbox12);
            CheckBox checkBox13 = view.findViewById(R.id.checkbox13);
            CheckBox checkBox14 = view.findViewById(R.id.checkbox14);
            CheckBox checkBox15 = view.findViewById(R.id.checkbox15);
            CheckBox checkBox16 = view.findViewById(R.id.checkbox16);
            CheckBox checkBox17 = view.findViewById(R.id.checkbox17);
            CheckBox checkBox18 = view.findViewById(R.id.checkbox18);
            CheckBox checkBox19 = view.findViewById(R.id.checkbox19);
            CheckBox checkBox20 = view.findViewById(R.id.checkbox20);
            CheckBox checkBox21 = view.findViewById(R.id.checkbox21);
            CheckBox checkBox22 = view.findViewById(R.id.checkbox22);
            CheckBox checkBox23 = view.findViewById(R.id.checkbox23);
            CheckBox checkBox24 = view.findViewById(R.id.checkbox24);
            CheckBox checkBox25 = view.findViewById(R.id.checkbox25);
            CheckBox checkBox26 = view.findViewById(R.id.checkbox26);


            View secondContentView = inflater.inflate(R.layout.second_content, container, false);
            View cardView22 = view.findViewById(R.id.cardView22);
            View cardView23 = view.findViewById(R.id.cardView23);
            View cardView24 = view.findViewById(R.id.cardView24);
            View cardView25 = view.findViewById(R.id.cardView25);
            View cardView26 = view.findViewById(R.id.cardView26);
            View cardView28 = view.findViewById(R.id.cardView28);
            View cardView29 = view.findViewById(R.id.cardView29);
            View cardView30 = view.findViewById(R.id.cardView30);
            View cardView31 = view.findViewById(R.id.cardView31);
            View cardView32 = view.findViewById(R.id.cardView32);
            View cardView33 = view.findViewById(R.id.cardView33);
            View cardView34 = view.findViewById(R.id.cardView34);
            View cardView35 = view.findViewById(R.id.cardView35);
            View cardView36 = view.findViewById(R.id.cardView36);
            View cardView37 = view.findViewById(R.id.cardView37);
            View cardView38 = view.findViewById(R.id.cardView38);
            View cardView39 = view.findViewById(R.id.cardView39);
            View cardView40 = view.findViewById(R.id.cardView40);
            CheckBox checkBox27 = view.findViewById(R.id.checkbox27);
            CheckBox checkBox28 = view.findViewById(R.id.checkbox28);
            CheckBox checkBox29 = view.findViewById(R.id.checkbox29);
            CheckBox checkBox30 = view.findViewById(R.id.checkbox30);
            CheckBox checkBox31 = view.findViewById(R.id.checkbox31);
            CheckBox checkBox32 = view.findViewById(R.id.checkbox32);
            CheckBox checkBox33 = view.findViewById(R.id.checkbox33);
            CheckBox checkBox34 = view.findViewById(R.id.checkbox34);
            CheckBox checkBox35 = view.findViewById(R.id.checkbox35);
            CheckBox checkBox36 = view.findViewById(R.id.checkbox36);
            CheckBox checkBox37 = view.findViewById(R.id.checkbox37);
            CheckBox checkBox38 = view.findViewById(R.id.checkbox38);
            CheckBox checkBox39 = view.findViewById(R.id.checkbox39);
            CheckBox checkBox40 = view.findViewById(R.id.checkbox40);
            CheckBox checkBox41 = view.findViewById(R.id.checkbox41);
            CheckBox checkBox42 = view.findViewById(R.id.checkbox42);
            CheckBox checkBox43 = view.findViewById(R.id.checkbox43);
            CheckBox checkBox44 = view.findViewById(R.id.checkbox44);


            setupCardViewClickListener((CardView) cardView, "https://www.brooot.de/broetchen/kartoffelbroetchen/");
            setupCardViewClickListener((CardView) cardView1, "https://www.brooot.de/weizenbrote/klassisches-basler-brot/");
            setupCardViewClickListener((CardView) cardView2, "https://www.brooot.de/weizenbrote/vollkorn-toastbrot/");
            setupCardViewClickListener((CardView) cardView3, "https://www.brooot.de/mischbrote/all-in-one-joghurt-brot/");
            setupCardViewClickListener((CardView) cardView4, "https://www.brooot.de/weizenbrote/schnelles-5-stunden-bierbrot/");
            setupCardViewClickListener((CardView) cardView5, "https://www.brooot.de/broetchen/salzstangen-selber-machen/");
            setupCardViewClickListener((CardView) cardView6, "https://www.brooot.de/broetchen/fruehstuecks-broetchen/");
            setupCardViewClickListener((CardView) cardView7, "https://www.brooot.de/broetchen/laugenstangen-selber-machen/");
            setupCardViewClickListener((CardView) cardView8, "https://www.brooot.de/mischbrote/friss-dich-dumm-brot-2-0/");
            setupCardViewClickListener((CardView) cardView9, "https://www.brooot.de/weizenbrote/all-in-one-kefir-kruste/");
            setupCardViewClickListener((CardView) cardView10, "https://www.brooot.de/broetchen/burger-buns-selber-backen/");
            setupCardViewClickListener((CardView) cardView11, "https://www.brooot.de/broetchen/toasties-toast-broetchen/");
            setupCardViewClickListener((CardView) cardView12, "https://www.brooot.de/weizenbrote/no-knead-topfbrot-mit-apfel-und-mohn/");
            setupCardViewClickListener((CardView) cardView13, "https://www.brooot.de/weizenbrote/klassisches-bernerbrot/");
            setupCardViewClickListener((CardView) cardView14, "https://www.brooot.de/weizenbrote/weizen-brot-mit-einfachem-teig-und-kalter-gare-im-kuehlschrank/");
            setupCardViewClickListener((CardView) cardView15, "https://www.brooot.de/mischbrote/vollkorn-koernerbrot-im-kasten/");
            setupCardViewClickListener((CardView) cardView16, "https://www.brooot.de/mischbrote/bayerisches-hausbrot/");
            setupCardViewClickListener((CardView) cardView17, "https://www.brooot.de/mischbrote/fendu-mischbrot-ecken/");
            setupCardViewClickListener((CardView) cardView18, "https://www.brooot.de/mischbrote/hefe-bauernbrot/");
            setupCardViewClickListener((CardView) cardView19, "https://www.brooot.de/weizenbrote/die-rustikale-ciabatta-kruste/");
            setupCardViewClickListener((CardView) cardView20, "https://www.brooot.de/mischbrote/das-homeoffice-feierabendbrot/");
            setupCardViewClickListener((CardView) cardView21, "https://www.brooot.de/weizenbrote/supersoftes-fruehlingsbrot-mit-karotte/");
            setupCardViewClickListener((CardView) cardView22, "https://www.brooot.de/weizenbrote/sonnenblumenkerne-brot/");
            setupCardViewClickListener((CardView) cardView23, "https://www.brooot.de/weizenbrote/franzoesisches-baguette-selber-backen/");
            setupCardViewClickListener((CardView) cardView24, "https://www.brooot.de/weizenbrote/tuerkisches-fladenbrot-pide-ramazan-pidesi/");
            setupCardViewClickListener((CardView) cardView25, "https://www.brooot.de/mischbrote/rezept-fuer-pane-vallemaggia/");
            setupCardViewClickListener((CardView) cardView26, "https://www.brooot.de/mischbrote/die-saatenbombe/");

            setupCardViewClickListener((CardView) cardView28, "https://www.brooot.de/roggenbrote/rezept-fuer-roggenvollkornbrot/");
            setupCardViewClickListener((CardView) cardView29, "https://www.brooot.de/mischbrote/saatiges-wurzelbrot-mit-weizen-und-roggen/");
            setupCardViewClickListener((CardView) cardView30, "https://www.brooot.de/mischbrote/kartoffel-bier-krustenbrot/");
            setupCardViewClickListener((CardView) cardView31, "https://www.brooot.de/mischbrote/auffrisch-zwillingsbrote/");
            setupCardViewClickListener((CardView) cardView32, "https://www.brooot.de/weizenbrote/knorzen-wurzelbrot/");
            setupCardViewClickListener((CardView) cardView33, "https://www.brooot.de/weizenbrote/sauerteig-baguette/");
            setupCardViewClickListener((CardView) cardView34, "https://www.brooot.de/mischbrote/rezept-fuer-frankenlaib/");
            setupCardViewClickListener((CardView) cardView35, "https://www.brooot.de/weizenbrote/1050er-brot/");
            setupCardViewClickListener((CardView) cardView36, "https://www.brooot.de/mischbrote/sechskornbrot/");
            setupCardViewClickListener((CardView) cardView37, "https://www.brooot.de/weizenbrote/focaccia-im-kasten/");
            setupCardViewClickListener((CardView) cardView38, "https://www.brooot.de/mischbrote/bauernbrot-im-kasten/");
            setupCardViewClickListener((CardView) cardView39, "https://www.brooot.de/weizenbrote/ruchbrot-stangen/");
            setupCardViewClickListener((CardView) cardView40, "https://www.brooot.de/mischbrote/die-maillard-muehlenkruste/");

            checkBox5.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox5 in den SharedPreferences
                editor.putBoolean("checkBox5_state", isChecked);
                editor.apply();
            });

            checkBox6.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox6 in den SharedPreferences
                editor.putBoolean("checkBox6_state", isChecked);
                editor.apply();
            });
            checkBox7.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox7 in den SharedPreferences
                editor.putBoolean("checkBox7_state", isChecked);
                editor.apply();
            });

            checkBox8.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox8 in den SharedPreferences
                editor.putBoolean("checkBox8_state", isChecked);
                editor.apply();
            });
            checkBox9.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox9 in den SharedPreferences
                editor.putBoolean("checkBox9_state", isChecked);
                editor.apply();
            });

            checkBox10.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox10_state", isChecked);
                editor.apply();
            });
            checkBox11.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox11_state", isChecked);
                editor.apply();
            });
            checkBox12.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox12_state", isChecked);
                editor.apply();
            });
            checkBox13.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox13_state", isChecked);
                editor.apply();
            });
            checkBox14.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox14_state", isChecked);
                editor.apply();
            });
            checkBox15.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox15_state", isChecked);
                editor.apply();
            });
            checkBox16.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox16_state", isChecked);
                editor.apply();
            });
            checkBox17.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox17_state", isChecked);
                editor.apply();
            });
            checkBox18.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox18_state", isChecked);
                editor.apply();
            });
            checkBox19.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox19_state", isChecked);
                editor.apply();
            });
            checkBox20.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox20_state", isChecked);
                editor.apply();
            });
            checkBox21.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox21_state", isChecked);
                editor.apply();
            });
            checkBox22.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox22_state", isChecked);
                editor.apply();
            });
            checkBox23.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox23_state", isChecked);
                editor.apply();
            });
            checkBox24.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox24_state", isChecked);
                editor.apply();
            });
            checkBox25.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox25_state", isChecked);
                editor.apply();
            });
            checkBox26.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox26_state", isChecked);
                editor.apply();
            });
            checkBox27.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox27_state", isChecked);
                editor.apply();
            });
            checkBox28.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox28_state", isChecked);
                editor.apply();
            });
            checkBox29.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox29_state", isChecked);
                editor.apply();
            });
            checkBox30.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox30_state", isChecked);
                editor.apply();
            });
            checkBox31.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox31_state", isChecked);
                editor.apply();
            });
            checkBox32.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox32_state", isChecked);
                editor.apply();
            });
            checkBox33.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox33_state", isChecked);
                editor.apply();
            });
            checkBox34.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox34_state", isChecked);
                editor.apply();
            });
            checkBox35.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox35_state", isChecked);
                editor.apply();
            });
            checkBox36.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox36_state", isChecked);
                editor.apply();
            });
            checkBox37.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox37_state", isChecked);
                editor.apply();
            });
            checkBox38.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox38_state", isChecked);
                editor.apply();
            });
            checkBox39.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox39_state", isChecked);
                editor.apply();
            });
            checkBox40.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox40_state", isChecked);
                editor.apply();
            });
            checkBox41.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox41_state", isChecked);
                editor.apply();
            });
            checkBox42.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox42_state", isChecked);
                editor.apply();
            });
            checkBox43.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox44_state", isChecked);
                editor.apply();
            });
            checkBox44.setOnCheckedChangeListener((buttonView, isChecked) -> {
                // Speichere den Zustand von checkBox10 in den SharedPreferences
                editor.putBoolean("checkBox44_state", isChecked);
                editor.apply();
            });


            boolean checkBox5State = pref.getBoolean("checkBox5_state", false);
            boolean checkBox6State = pref.getBoolean("checkBox6_state", false);
            boolean checkBox7State = pref.getBoolean("checkBox7_state", false);
            boolean checkBox8State = pref.getBoolean("checkBox8_state", false);
            boolean checkBox9State = pref.getBoolean("checkBox9_state", false);
            boolean checkBox10State = pref.getBoolean("checkBox10_state", false);
            boolean checkBox11State = pref.getBoolean("checkBox11_state", false);
            boolean checkBox12State = pref.getBoolean("checkBox12_state", false);
            boolean checkBox13State = pref.getBoolean("checkBox13_state", false);
            boolean checkBox14State = pref.getBoolean("checkBox14_state", false);
            boolean checkBox15State = pref.getBoolean("checkBox15_state", false);
            boolean checkBox16State = pref.getBoolean("checkBox16_state", false);
            boolean checkBox17State = pref.getBoolean("checkBox17_state", false);
            boolean checkBox18State = pref.getBoolean("checkBox18_state", false);
            boolean checkBox19State = pref.getBoolean("checkBox19_state", false);
            boolean checkBox20State = pref.getBoolean("checkBox20_state", false);
            boolean checkBox21State = pref.getBoolean("checkBox21_state", false);
            boolean checkBox22State = pref.getBoolean("checkBox22_state", false);
            boolean checkBox23State = pref.getBoolean("checkBox23_state", false);
            boolean checkBox24State = pref.getBoolean("checkBox24_state", false);
            boolean checkBox25State = pref.getBoolean("checkBox25_state", false);
            boolean checkBox26State = pref.getBoolean("checkBox26_state", false);
            boolean checkBox27State = pref.getBoolean("checkBox27_state", false);
            boolean checkBox28State = pref.getBoolean("checkBox28_state", false);
            boolean checkBox29State = pref.getBoolean("checkBox29_state", false);
            boolean checkBox30State = pref.getBoolean("checkBox30_state", false);
            boolean checkBox31State = pref.getBoolean("checkBox31_state", false);
            boolean checkBox32State = pref.getBoolean("checkBox32_state", false);
            boolean checkBox33State = pref.getBoolean("checkBox33_state", false);
            boolean checkBox34State = pref.getBoolean("checkBox34_state", false);
            boolean checkBox35State = pref.getBoolean("checkBox35_state", false);
            boolean checkBox36State = pref.getBoolean("checkBox36_state", false);
            boolean checkBox37State = pref.getBoolean("checkBox37_state", false);
            boolean checkBox38State = pref.getBoolean("checkBox38_state", false);
            boolean checkBox39State = pref.getBoolean("checkBox39_state", false);
            boolean checkBox40State = pref.getBoolean("checkBox40_state", false);
            boolean checkBox41State = pref.getBoolean("checkBox41_state", false);
            boolean checkBox42State = pref.getBoolean("checkBox42_state", false);
            boolean checkBox43State = pref.getBoolean("checkBox43_state", false);
            boolean checkBox44State = pref.getBoolean("checkBox44_state", false);


            checkBox5.setChecked(checkBox5State);
            checkBox6.setChecked(checkBox6State);
            checkBox7.setChecked(checkBox7State);
            checkBox8.setChecked(checkBox8State);
            checkBox9.setChecked(checkBox9State);
            checkBox10.setChecked(checkBox10State);
            checkBox11.setChecked(checkBox11State);
            checkBox12.setChecked(checkBox12State);
            checkBox13.setChecked(checkBox13State);
            checkBox14.setChecked(checkBox14State);
            checkBox15.setChecked(checkBox15State);
            checkBox16.setChecked(checkBox16State);
            checkBox17.setChecked(checkBox17State);
            checkBox18.setChecked(checkBox18State);
            checkBox19.setChecked(checkBox19State);
            checkBox20.setChecked(checkBox20State);
            checkBox21.setChecked(checkBox21State);
            checkBox22.setChecked(checkBox22State);
            checkBox23.setChecked(checkBox23State);
            checkBox24.setChecked(checkBox24State);
            checkBox25.setChecked(checkBox25State);
            checkBox26.setChecked(checkBox26State);
            checkBox27.setChecked(checkBox27State);
            checkBox28.setChecked(checkBox28State);
            checkBox29.setChecked(checkBox29State);
            checkBox30.setChecked(checkBox30State);
            checkBox31.setChecked(checkBox31State);
            checkBox32.setChecked(checkBox32State);
            checkBox33.setChecked(checkBox33State);
            checkBox34.setChecked(checkBox34State);
            checkBox35.setChecked(checkBox35State);
            checkBox36.setChecked(checkBox36State);
            checkBox37.setChecked(checkBox37State);
            checkBox38.setChecked(checkBox38State);
            checkBox39.setChecked(checkBox39State);
            checkBox40.setChecked(checkBox40State);
            checkBox41.setChecked(checkBox41State);
            checkBox42.setChecked(checkBox42State);
            checkBox43.setChecked(checkBox43State);
            checkBox44.setChecked(checkBox44State);


            switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    updateSwitch4State();
                    if (isChecked) {
                        cardView28.setVisibility(View.GONE);
                        cardView29.setVisibility(View.GONE);
                        cardView30.setVisibility(View.GONE);
                        cardView31.setVisibility(View.GONE);
                        cardView32.setVisibility(View.GONE);
                        cardView33.setVisibility(View.GONE);
                        cardView34.setVisibility(View.GONE);
                        cardView35.setVisibility(View.GONE);
                        cardView36.setVisibility(View.GONE);
                        cardView37.setVisibility(View.GONE);
                        cardView38.setVisibility(View.GONE);
                        cardView39.setVisibility(View.GONE);
                        cardView40.setVisibility(View.GONE);
                    } else {
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
                    }
                }
            });
            switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    updateSwitch4State();
                    if (isChecked) {
                        cardView.setVisibility(View.GONE);
                        cardView1.setVisibility(View.GONE);
                        cardView2.setVisibility(View.GONE);
                        cardView3.setVisibility(View.GONE);
                        cardView4.setVisibility(View.GONE);
                        cardView5.setVisibility(View.GONE);
                        cardView6.setVisibility(View.GONE);
                        cardView7.setVisibility(View.GONE);
                        cardView8.setVisibility(View.GONE);
                        cardView9.setVisibility(View.GONE);
                        cardView10.setVisibility(View.GONE);
                        cardView11.setVisibility(View.GONE);
                        cardView12.setVisibility(View.GONE);
                        cardView13.setVisibility(View.GONE);
                        cardView14.setVisibility(View.GONE);
                        cardView15.setVisibility(View.GONE);
                        cardView16.setVisibility(View.GONE);
                        cardView17.setVisibility(View.GONE);
                        cardView18.setVisibility(View.GONE);
                        cardView19.setVisibility(View.GONE);
                        cardView20.setVisibility(View.GONE);
                        cardView21.setVisibility(View.GONE);
                        cardView22.setVisibility(View.GONE);
                        cardView23.setVisibility(View.GONE);
                        cardView24.setVisibility(View.GONE);
                        cardView25.setVisibility(View.GONE);
                        cardView26.setVisibility(View.GONE);


                    } else {
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


                    }
                }
            });
            switch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {


                    } else {
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

                    }
                }
            });


            MobileAds.initialize(requireContext(), new OnInitializationCompleteListener() {
                @Override
                public void onInitializationComplete(InitializationStatus initializationStatus) {
                    // Initialization completed
                }
            });

            // Load the interstitial ad
            AdRequest adRequest = new AdRequest.Builder().build();
            InterstitialAd.load(requireContext(), "ca-app-pub-3940256099942544/1033173712", adRequest,
                    new InterstitialAdLoadCallback() {
                        @Override
                        public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                            mInterstitialAd = interstitialAd;
                            Log.i(TAG, "Interstitial ad loaded");
                        }

                        @Override
                        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                            Log.e(TAG, "Interstitial ad failed to load: " + loadAdError.getMessage());
                        }
                    });


            return view;
        }



        private void loadInterstitialAd() {
            if (mInterstitialAd == null) {
                AdRequest adRequest = new AdRequest.Builder().build();
                InterstitialAd.load(requireContext(), "ca-app-pub-2553874194034729/1472691396", adRequest,
                        new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                mInterstitialAd = interstitialAd;
                                Log.i(TAG, "Interstitial ad loaded");
                            }

                            @Override
                            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                                Log.e(TAG, "Interstitial ad failed to load: " + loadAdError.getMessage());
                            }
                        });
            }
        }

        private void showInterstitialAdAndOpenLink(String link) {
            if (mInterstitialAd != null) {
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        Log.d(TAG, "Ad dismissed fullscreen content.");
                        openLink(link);
                    }
                });

                currentLink = link;
                mInterstitialAd.show(requireActivity());
            } else {
                openLink(link); // Show the link directly if the ad isn't loaded
            }
        }

        private void setupCardViewClickListener(CardView cardView, final String link) {
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showInterstitialAdAndOpenLink(link);
                }
            });

        }



        private void openLink(String link) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
            startActivity(intent);
        }

        private void updateSwitch4State() {
            boolean switch2State = switch2.isChecked();
            boolean switch3State = switch3.isChecked();

            if (switch2State && switch3State) {
                // Schalten Sie switch4 ein
                switch4.setChecked(true);
                // Schalten Sie switch2 und switch3 aus
                switch2.setChecked(false);
                switch3.setChecked(false);
            } else {
                // Wenn switch2 oder switch3 deaktiviert ist, lassen Sie switch4 unverändert
                // Sie können hier je nach Ihren Anforderungen weitere Logik hinzufügen
            }
        }
    }