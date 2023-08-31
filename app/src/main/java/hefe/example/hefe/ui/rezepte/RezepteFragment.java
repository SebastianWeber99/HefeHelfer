    package hefe.example.hefe.ui.rezepte;

    import android.content.Intent;
    import android.net.Uri;
    import android.os.Bundle;
    import android.util.Log;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;

    import androidx.annotation.NonNull;
    import androidx.appcompat.widget.SearchView;
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
    private SearchView searchView;

        private ArrayList<View> allCardViews;
        private String currentLink = "";
        private InterstitialAd mInterstitialAd;
        private static final String TAG = "RezepteFragment"; // Update TAG appropriately


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_rezepte, container, false);
            SearchView searchView = view.findViewById(R.id.searchView);



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

            MobileAds.initialize(requireContext(), new OnInitializationCompleteListener() {
                @Override
                public void onInitializationComplete(InitializationStatus initializationStatus) {
                    // Initialization completed
                }
            });

            // Load the interstitial ad
            AdRequest adRequest = new AdRequest.Builder().build();
            InterstitialAd.load(requireContext(), "ca-app-pub-3940256099942544/3419835294", adRequest,
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
        }

        private void showInterstitialAdAndOpenLink(String link) {
            if (mInterstitialAd != null) {
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        Log.d(TAG, "Ad dismissed fullscreen content.");
                        openLink(link);
                        loadInterstitialAd(); // Load a new ad for the next time
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

        // Rest of the code remains the same
    }