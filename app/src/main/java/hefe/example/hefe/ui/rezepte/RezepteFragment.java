package hefe.example.hefe.ui.rezepte;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import hefe.example.hefe.R;

public class RezepteFragment extends Fragment {
private SearchView searchView;

    private ArrayList<View> allCardViews;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rezepte, container, false);
        SearchView searchView = view.findViewById(R.id.searchView);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Perform search based on the query
                performSearch(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // Update search results as the user types
                updateSearchResults(newText);
                return true;
            }
        });

        allCardViews = new ArrayList<>();
        collectCardViews(view);

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
        return view;
    }
    private void collectCardViews(View view) {

        if (view instanceof CardView) {
            allCardViews.add(view);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                collectCardViews(viewGroup.getChildAt(i));
            }
        }
    }
    private void performSearch(String query) {
        for (View cardView : allCardViews) {


        }
    }

    private void updateSearchResults(String newText) {
        for (View cardView : allCardViews) {
            TextView titleTextView = cardView.findViewById(R.id.cardView);

            if (titleTextView != null) {
                String title = titleTextView.getText().toString();

                if (title.toLowerCase().contains(newText.toLowerCase())) {
                    cardView.setVisibility(View.VISIBLE);
                } else {
                    cardView.setVisibility(View.GONE);
                }
            }
        }
    }}
