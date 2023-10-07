package hefe.example.hefe.ui.spenden;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import hefe.example.hefe.R;

public class SpendenFragment extends Fragment {

    private TextView headlineTextView1;
    private TextView ueberschrift2;
    private TextView headlineTextView2;
    private TextView headlineTextView3;
    private TextView textView17;
    private TextView textView18;
    private TextView headlineTextView6;
    private TextView headlineTextView7;
    private TextView headlineTextView8;
    private TextView headlineTextView9;
    private TextView textView20;
    private TextView textView22;
    private TextView textView41;
    private TextView textView42;

    private Button button6;

    private Button button4;
    private static final String SP_KEY_IS_REWARD_EARNED = "is_reward_earned";
    private SharedPreferences sharedPreferences;
    private TextView textView23;
    private TextView textView24;
    private Button button5;
    private final String TAG = "SpendenFragment";
    private RewardedAd rewardedAd;
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;

    private BillingClient billingClient;
    private List<ProductDetails> productDetailsList;
    private  Handler handler;
    ProgressBar progress_circular;
    private boolean isTextView17Visible = false;
    private boolean isTextView18Visible = false;
    private boolean isTextView20Visible = false;
    private boolean isTextView41Visible = false;
    private boolean isTextView42Visible = false;


    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_spenden, container, false);
        AdRequest adRequest = new AdRequest.Builder().build();
        RewardedAd.load(this.getContext(), "ca-app-pub-2553874194034729/1162132374",
                adRequest, new RewardedAdLoadCallback() {
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error.
                        Log.d(TAG, loadAdError.toString());
                        rewardedAd = null;
                    }

                    @Override
                    public void onAdLoaded(@NonNull RewardedAd ad) {
                        rewardedAd = ad;
                        ServerSideVerificationOptions options = new ServerSideVerificationOptions
                                .Builder()
                                .setCustomData("SAMPLE_CUSTOM_DATA_STRING")
                                .build();
                        rewardedAd.setServerSideVerificationOptions(options);
                        rewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdClicked() {
                                // Called when a click is recorded for an ad.
                                Log.d(TAG, "Ad was clicked.");
                            }

                            @Override
                            public void onAdDismissedFullScreenContent() {
                                // Called when ad is dismissed.
                                // Set the ad reference to null so you don't show the ad a second time.
                                Log.d(TAG, "Ad dismissed fullscreen content.");
                                rewardedAd = null;
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(AdError adError) {
                                // Called when ad fails to show.
                                Log.e(TAG, "Ad failed to show fullscreen content.");
                                rewardedAd = null;
                            }

                            @Override
                            public void onAdImpression() {
                                // Called when an impression is recorded for an ad.
                                Log.d(TAG, "Ad recorded an impression.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when ad is shown.
                                Log.d(TAG, "Ad showed fullscreen content.");
                            }
                        });
                        Log.d(TAG, "Ad was loaded.");
                    }
                });
        pref = this.getActivity().getSharedPreferences("my_pref",
                Context.MODE_PRIVATE);
        editor = pref.edit();
        textView23 = rootView.findViewById(R.id.textView23);
        textView24 = rootView.findViewById(R.id.textView24);
        button5 = rootView.findViewById(R.id.button5);
        // Find views by their IDs
        headlineTextView1 = rootView.findViewById(R.id.headlineTextView1);
        ueberschrift2 = rootView.findViewById(R.id.ueberschrift2);
        headlineTextView2 = rootView.findViewById(R.id.headlineTextView2);
        headlineTextView3 = rootView.findViewById(R.id.headlineTextView3);
        textView17 = rootView.findViewById(R.id.textView17);
        textView18 = rootView.findViewById(R.id.textView18);
        headlineTextView6 = rootView.findViewById(R.id.headlineTextView6);
        headlineTextView7 = rootView.findViewById(R.id.headlineTextView7);
        headlineTextView8 = rootView.findViewById(R.id.headlineTextView8);
        headlineTextView9 = rootView.findViewById(R.id.headlineTextView9);
        textView20 = rootView.findViewById(R.id.textView20);
        textView22 = rootView.findViewById(R.id.textView22);
        textView41 = rootView.findViewById(R.id.textView41);
        textView42 = rootView.findViewById(R.id.textView42);

        button6 = rootView.findViewById(R.id.button6);
        button4 = rootView.findViewById(R.id.button4);
        productDetailsList = new ArrayList<>();
        textView17.setVisibility(View.GONE);
        textView18.setVisibility(View.GONE);
        button6.setVisibility(View.GONE);
        textView20.setVisibility(View.GONE);
        button5.setVisibility(View.GONE);
        textView41.setVisibility(View.GONE);
        button4.setVisibility(View.GONE);
        textView42.setVisibility(View.GONE);
        textView23.setVisibility(View.GONE);
        textView24.setVisibility(View.GONE);



        billingClient = BillingClient.newBuilder(this.getActivity())
                .enablePendingPurchases()
                .setListener(
                        (billingResult, list) -> {
                            Log.d(TAG, "onCreateView: " + billingResult.getResponseCode());
                            Log.d(TAG, "onCreateView: " + list);
                            if(billingResult.getResponseCode()==BillingClient.BillingResponseCode.OK && list != null) {
                                for (Purchase purchase: list){
                                    this.verifyPurchase(purchase);
                                }
                            }
                        }
                ).build();
        connectGooglePlayBilling();

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click(v);
            }
        });

        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                launchPurchaseFlow(productDetailsList.get(0));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWebsite();
            }
        });

        //Das ist der Part, für die Anzeige von dem PFeil + String den kannst so lassen
        String dynamicText4 = getString(R.string.spenden_GeldfürunsereKaffeekasse);
        String dynamicText3 = getString(R.string.spenden_kostenloser);
        String dynamicText2 = getString(R.string.spenden_keks);
        String dynamicText1 = getString(R.string.settings_sebi);
        String dynamicText = getString(R.string.settings_michi);


        // Den dynamischen Text in headlineTextView1 einfügen
        headlineTextView2.setText(dynamicText);
        headlineTextView2.setText(" \u25BC " + dynamicText);

        headlineTextView3.setText(dynamicText1);
        headlineTextView3.setText(" \u25BC " + dynamicText1);

        headlineTextView7.setText(dynamicText2);
        headlineTextView7.setText(" \u25BC " + dynamicText2);

        headlineTextView8.setText(dynamicText3);
        headlineTextView8.setText(" \u25BC " + dynamicText3);

        headlineTextView9.setText(dynamicText4);
        headlineTextView9.setText(" \u25BC " + dynamicText4);

        headlineTextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isTextView17Visible = !isTextView17Visible;
                updateVisibility(textView17, isTextView17Visible);
                updateConstraints();
            }
        });
        headlineTextView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isTextView18Visible = !isTextView18Visible;
                updateVisibility(textView18, isTextView18Visible);
                updateConstraints();
            }
        });
        headlineTextView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isTextView20Visible = !isTextView20Visible;
                updateVisibility(button6, isTextView20Visible);
                updateVisibility(textView20, isTextView20Visible);
                updateVisibility(textView24, isTextView20Visible);
                updateConstraints();
            }
        });
        headlineTextView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isTextView41Visible = !isTextView41Visible;
                updateVisibility(button5, isTextView41Visible);
                updateVisibility(textView41, isTextView41Visible);
                updateVisibility(textView23, isTextView41Visible);
                updateConstraints();
            }
        });
        headlineTextView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isTextView42Visible = !isTextView42Visible;
                updateVisibility(button4, isTextView42Visible);
                updateVisibility(textView42, isTextView42Visible);
                updateConstraints();
            }
        });

        return rootView;
    }



    @Override
    public void onStart() {
        super.onStart();
        String adViewedval = this.getActivity().getSharedPreferences("my_pref",
                Context.MODE_PRIVATE).getString("adViewed", "n/a");
        if(!adViewedval.equals("n/a")) {
            textView23.setText(adViewedval);
        }
        String boughtval = this.getActivity().getSharedPreferences("my_pref",
                Context.MODE_PRIVATE).getString("bought", "n/a");
        if(!boughtval.equals("n/a")) {
            textView24.setText(boughtval);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        billingClient.queryPurchasesAsync(
                QueryPurchasesParams.newBuilder().setProductType(BillingClient.ProductType.INAPP).build(),
                (billingResult, list) -> {
                    if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK) {
                        for (Purchase purchase : list) {
                            if (purchase.getPurchaseState() == Purchase.PurchaseState.PURCHASED && !purchase.isAcknowledged()) {
                                verifyPurchase(purchase);
                            }
                        }
                    }
                }
        );
    }

    public void click(View view){
        if (rewardedAd != null) {
            Activity activityContext = getActivity();
            rewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
                @Override
                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                    // Handle the reward.
                    Log.d(TAG, "The user earned the reward.");
                    int rewardAmount = rewardItem.getAmount();
                    String rewardType = rewardItem.getType();
                    // Show a random message as a reward
                    String randomMessage = getRandomMessageFromResources();
                    showReward(randomMessage, textView23);
                    Log.d(TAG, "Try to show text");

                }
            });
        } else {
            Log.d(TAG, "The rewarded ad wasn't ready yet.");
        }
    }

    void showProducts() {

        ImmutableList<QueryProductDetailsParams.Product> productList = ImmutableList.of(
                //Product 1
                QueryProductDetailsParams.Product.newBuilder()
                        .setProductId("glueckskeks")
                        .setProductType(BillingClient.ProductType.INAPP)
                        .build()
        );

        QueryProductDetailsParams params = QueryProductDetailsParams.newBuilder()
                .setProductList(productList)
                .build();

        billingClient.queryProductDetailsAsync(params, (billingResult, list) -> {
            //Clear the list
            productDetailsList.clear();

            Log.d(TAG,"Size "+list.size());

            Log.d(TAG, "inside postDelayed");
            //Adding new productList, returned from google play
            productDetailsList.addAll(list);

            //Since we have one product, we use index zero (0) from list
            ProductDetails productDetails = list.get(0);

            //Getting product details
            String price = productDetails.getOneTimePurchaseOfferDetails().getFormattedPrice();
            String productName = productDetails.getName();
            Log.d(TAG, price + " " + productName);

            //Handler to delay by two seconds to wait for google play to return the list of products.
//            handler.postDelayed(() -> {
//                Log.d(TAG, "inside postDelayed");
//                //Adding new productList, returned from google play
//                productDetailsList.addAll(list);
//
//                //Since we have one product, we use index zero (0) from list
//                ProductDetails productDetails = list.get(0);
//
//                //Getting product details
//                String price = productDetails.getOneTimePurchaseOfferDetails().getFormattedPrice();
//                String productName = productDetails.getName();
//                Log.d(TAG, price + " " + productName);
//                //Updating the UI
//                //If the product is not showing then it means that you didn't properly setup your Testing email.
////                button6.setText(price +"  -  "+productName);
////
////                //Showing the button.
////                button6.setVisibility(View.VISIBLE);
////                progress_circular.setVisibility(View.INVISIBLE);
//
//            }, 2000);
        });
    }

    public void connectGooglePlayBilling() {
        billingClient.startConnection(new BillingClientStateListener() {
            @Override
            public void onBillingServiceDisconnected() {
                connectGooglePlayBilling();
            }

            @Override
            public void onBillingSetupFinished(@NonNull BillingResult billingResult) {
                if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK) {
                    showProducts();
                    Log.d(TAG, "show Products");
                }
            }
        });

    }

    public void launchPurchaseFlow(ProductDetails productDetails) {
        ImmutableList<BillingFlowParams.ProductDetailsParams> productDetailsParamsList =
                ImmutableList.of(
                        BillingFlowParams.ProductDetailsParams.newBuilder()
                                .setProductDetails(productDetails)
                                .build()
                );
        BillingFlowParams billingFlowParams = BillingFlowParams.newBuilder()
                .setProductDetailsParamsList(productDetailsParamsList)
                .build();
        billingClient.launchBillingFlow(this.getActivity(), billingFlowParams);
    }

    public void verifyPurchase(Purchase purchase) {
        Log.d(TAG, "verifyPurchase: try verifing");
        ConsumeParams consumeParams = ConsumeParams.newBuilder()
                .setPurchaseToken(purchase.getPurchaseToken())
                .build();
        ConsumeResponseListener listener = (billingResult, s) -> {
            Log.d(TAG, "verifyPurchase: " + billingResult.getResponseCode());
            if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK || billingResult.getResponseCode()==BillingClient.BillingResponseCode.DEVELOPER_ERROR) {
                String randomMessage = getRandomMessageFromResources();
                showReward(randomMessage, textView24);

//                Log.d(TAG, "Try to show text");
                Log.d(TAG, "give User Item");

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean(SP_KEY_IS_REWARD_EARNED, true);
                editor.apply();
            }
        };

        billingClient.consumeAsync(consumeParams, listener);
    }



    public void verifyPayment(Purchase purchase) {


        if (purchase.getPurchaseState() == Purchase.PurchaseState.PURCHASED) {
            if (!purchase.isAcknowledged()) {
                AcknowledgePurchaseParams acknowledgePurchaseParams =
                        AcknowledgePurchaseParams.newBuilder()
                                .setPurchaseToken(purchase.getPurchaseToken())
                                .build();
                billingClient.acknowledgePurchase(acknowledgePurchaseParams, billingResult -> {

                    if (billingResult.getResponseCode() == BillingClient.BillingResponseCode.OK) {
                        // 1 - True
                        // 0 - False
                        // pref.setRemoveAd(1);
                    }

                });
            }
        }
    }


    // Method to get a random message from string resources
    private String getRandomMessageFromResources() {
        // Array of resource IDs for the random messages
        int[] messageIds = {
                R.string.Code1,
                R.string.Code2,
                R.string.Code3,
                R.string.Code4,
                R.string.Code5,
                R.string.Code6,
                R.string.Code7,
                R.string.Code8,
                R.string.Code9,
                R.string.Code10,
                R.string.Code11,
                R.string.Code12,
                R.string.Code13,
                R.string.Code14,
                R.string.Code15,
                R.string.Code16,
                R.string.Code17,
                R.string.Code18,
                R.string.Code19,
                R.string.Code20,
                R.string.Code21,
                R.string.Code22,
                R.string.Code23,

                R.string.Code25,
                R.string.Code26,
                R.string.Code27,
                R.string.Code28,
                R.string.Code29,
                R.string.Code30,
                R.string.Code31,
                R.string.Code32,
                R.string.Code33,
                R.string.Code34,
                R.string.Code35,
                R.string.Code36,
                R.string.Code37,
                R.string.Code38,
                R.string.Code39,
                R.string.Code40
        };

        // Generate a random index
        int index = new Random().nextInt(messageIds.length);

        // Get the random message from the resources
        return getString(messageIds[index]);
    }

    // Method to open the website
    private void openWebsite() {
        // Add the URL of the website you want to open
        String websiteUrl = "https://ko-fi.com/hefehelfer";

        // Create an Intent to open the website
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));

        // Check if there is an app that can handle this Intent
        if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
            // If there is an app that can handle the Intent, start the activity
            startActivity(intent);
        } else {
            // If there is no app that can handle the Intent, show an error message or handle it as needed
            Log.e(TAG, "No app can handle this Intent.");
            Toast.makeText(getActivity(), "No app can handle this action.", Toast.LENGTH_SHORT).show();
        }
    }
    private void showReward(String rewardMessage, TextView textView) {
        // Set the reward message to the textView23
        textView.setText(" " + rewardMessage);

        if (textView == textView23) {
            editor.putString("adViewed", textView23.getText().toString());
            editor.apply();
        }
        if (textView == textView24) {
            editor.putString("bought", textView24.getText().toString());
            editor.apply();
        }

        // Make textView23 visible since the reward has been shown
        textView.setVisibility(View.VISIBLE);
        Log.d(TAG, "Make textview visible");
        // Save the reward status in SharedPreferences

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(SP_KEY_IS_REWARD_EARNED, true);
        editor.apply();

        SharedPreferences.Editor editor2 = sharedPreferences.edit();
        editor2.putBoolean(SP_KEY_IS_REWARD_EARNED, true);
        editor2.apply();
    }
    private void updateVisibility(View view, boolean isVisible) {
        view.setVisibility(isVisible ? View.VISIBLE : View.GONE);
    }
    private void updateConstraints() {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) textView17.getLayoutParams();
        layoutParams.topToBottom = isTextView17Visible ? R.id.headlineTextView2 : R.id.headlineTextView2;
        textView17.setLayoutParams(layoutParams);
        textView17.requestLayout();
    }



}
