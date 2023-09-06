package pro.example.pro;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.os.LocaleListCompat;

public class LanguageManager extends AppCompatActivity {
    private Context ct;
    public LanguageManager (Context ctx){
        ct = ctx;
    }
    public void updateResource(String code){
//        Locale locale = new Locale(code);
//        Locale.setDefault(locale);
//        Resources resources = ct.getResources();
//        Configuration configuration = resources.getConfiguration();
//        configuration.setLocale(locale);
//        resources.updateConfiguration(configuration, resources.getDisplayMetrics());


        LocaleListCompat appLocale = LocaleListCompat.forLanguageTags(code);
        // Call this on the main thread as it may require Activity.restart()
        AppCompatDelegate.setApplicationLocales(appLocale);


    }
}
