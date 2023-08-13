package hefe.example.hefe.ui.spenden;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import hefe.example.hefe.R;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;

import java.util.Random;

public class SpendenFragment extends Fragment {


    private static final String SP_KEY_IS_REWARD_EARNED = "is_reward_earned";
    private SharedPreferences sharedPreferences;
    private TextView textView23;
    private Button button5;
    private final String TAG = "SpendenFragment";
    private RewardedAd rewardedAd;
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;


    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_spenden, container, false);
        AdRequest adRequest = new AdRequest.Builder().build();
        RewardedAd.load(this.getContext(), "ca-app-pub-3940256099942544/5224354917",
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
        button5 = rootView.findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click(v);
            }
        });
        return rootView;
    }



    @Override
    public void onStart() {
        super.onStart();
        String val = this.getActivity().getSharedPreferences("my_pref",
                Context.MODE_PRIVATE).getString("val", "n/a");
        if(!val.equals("n/a")) {
            textView23.setText(val);
        }
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
                    showReward(randomMessage);
                    Log.d(TAG, "Try to show text");

                }
            });
        } else {
            Log.d(TAG, "The rewarded ad wasn't ready yet.");
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
    private void showReward(String rewardMessage) {
        // Set the reward message to the textView23
        textView23.setText(" " + rewardMessage);
        editor.putString("val", textView23.getText().toString());
        editor.apply();

        // Make textView23 visible since the reward has been shown
        textView23.setVisibility(View.VISIBLE);
        Log.d(TAG, "Make textview visible");
        // Save the reward status in SharedPreferences

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(SP_KEY_IS_REWARD_EARNED, true);
        editor.apply();
    }
    // Rest of your methods...
}
