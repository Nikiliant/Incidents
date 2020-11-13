package com.example.incidents;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.maps.MapView;

import java.util.List;

public class AdapteList extends RecyclerView.Adapter<AdapteList.MyViewHolder> {
    private static final String TAG = "CustomAdapter";
    private List<String> mDataset;

    void DataContainer (Context context, List<String> mDataset) {
        this.mDataset = mDataset;
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public final TextView textView;
        public final TextView textContainer;
        public final MapView mapViewIncident;

        public MyViewHolder(View v) {
            super(v);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick (View v) {
                    Log.d (TAG, "Element" + getAdapterPosition() + " clicked.");
                }
            });
            textView = (TextView) v.findViewById(R.id.textView);
            textContainer = (TextView) v.findViewById(R.id.textContainer);
            mapViewIncident = (MapView) v.findViewById(R.id.mapViewIncident);

        }


        public TextView getTextView () {
            return textView;
        }
    }


    // Provide a suitable constructor (depends on the kind of dataset)
    public AdapteList (List<String> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup,
                                           int viewType) {
        // create a new view
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.my_text_view;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutIdForListItem, viewGroup, false);
        MyViewHolder viewHolder = new MyViewHolder(view);


        return viewHolder;
    }



    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

        //Втыкаем данные в название
        holder.getTextView().setText(mDataset.get(position));
        //Втыкаем данные в краткое описание
        holder.textContainer.setText("Ble-ble-ble"+position);
        //Втыкаем данные местоположения - пока хз как
        //holder.mapViewIncident



    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}

