package com.example.pf_sistemainventarioitt;

import android.preference.PreferenceActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HeaderAdapter extends RecyclerView.Adapter<HeaderAdapter.ViewHolder> {

        private ArrayList<Product> mDataset;

        /**
         * Provide a reference to the type of views that you are using
         * (custom ViewHolder).
         */
        static class ViewHolder extends RecyclerView.ViewHolder {
            public TextView headerCode;
            public TextView responsibleName;
            public TextView headerDate;

            ViewHolder(View v) {
                super(v);
                // Define click listener for the ViewHolder's View

                headerCode = (TextView) v.findViewById(R.id.headerCode);
                responsibleName = (TextView) v.findViewById(R.id.responsibleName);
                headerDate = (TextView) v.findViewById(R.id.headerDate);

            }
        }

        /**
         * Initialize the dataset of the Adapter.
         *
         * @param MyDataset String[] containing the data to populate views to be used
         * by RecyclerView.
         */
        public HeaderAdapter(ArrayList<Product> MyDataset) {
            mDataset = MyDataset;
        }

        // Create new views (invoked by the layout manager)
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            // Create a new view, which defines the UI of the list item
            View v = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_header, viewGroup, false);

            return new ViewHolder(v);
        }

        // Replace the contents of a view (invoked by the layout manager)
        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {

            // Get element from your dataset at this position and replace the
            // contents of the view with that element
            holder.headerCode.setText(mDataset.get(position).getHeaderCode());
            holder.responsibleName.setText(mDataset.get(position).getResponsibleName());
            holder.headerDate.setText(mDataset.get(position).getHeaderDate());
        }

        // Return the size of your dataset (invoked by the layout manager)
        @Override
        public int getItemCount() {
            return mDataset.size();
        }
    }
