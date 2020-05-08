package com.example.amalharian;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;



import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class AmalanListAdapter extends RecyclerView.Adapter<AmalanListAdapter.AmalanViewHolder> {
    private final LinkedList<Amalan> mNamaAmalan;
    private LayoutInflater mInflater;


    public AmalanListAdapter(Context context, LinkedList<Amalan> namaAmalan) {
        mInflater = LayoutInflater.from(context);
        this.mNamaAmalan = namaAmalan;
    }

    @Override
    public AmalanViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View mItemView = mInflater.inflate(R.layout.isicekamalan, parent, false);
        return new AmalanViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder( AmalanListAdapter.AmalanViewHolder holder, int position) {
        for (int i = 0 ; i < mNamaAmalan.size(); i++){
            holder.cekAmalan[i].setText(mNamaAmalan.get(i).namaAmalan);
        }
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    class AmalanViewHolder extends RecyclerView.ViewHolder{

        public final CheckBox[] cekAmalan;
        final AmalanListAdapter mAdapter;

        public AmalanViewHolder(View itemView, AmalanListAdapter adapter){
            super(itemView);
            cekAmalan = new CheckBox[23];
            cekAmalan[0] = (CheckBox) itemView.findViewById(R.id.cekAmalan1);
            cekAmalan[1] = (CheckBox) itemView.findViewById(R.id.cekAmalan2);
            cekAmalan[2] = (CheckBox) itemView.findViewById(R.id.cekAmalan3);
            cekAmalan[3] = (CheckBox) itemView.findViewById(R.id.cekAmalan4);
            cekAmalan[4] = (CheckBox) itemView.findViewById(R.id.cekAmalan5);
            cekAmalan[5] = (CheckBox) itemView.findViewById(R.id.cekAmalan6);
            cekAmalan[6] = (CheckBox) itemView.findViewById(R.id.cekAmalan7);
            cekAmalan[7] = (CheckBox) itemView.findViewById(R.id.cekAmalan8);
            cekAmalan[8] = (CheckBox) itemView.findViewById(R.id.cekAmalan9);
            cekAmalan[9] = (CheckBox) itemView.findViewById(R.id.cekAmalan10);
            cekAmalan[10] = (CheckBox) itemView.findViewById(R.id.cekAmalan11);
            cekAmalan[11] = (CheckBox) itemView.findViewById(R.id.cekAmalan12);
            cekAmalan[12] = (CheckBox) itemView.findViewById(R.id.cekAmalan13);
            cekAmalan[13] = (CheckBox) itemView.findViewById(R.id.cekAmalan14);
            cekAmalan[14] = (CheckBox) itemView.findViewById(R.id.cekAmalan15);
            cekAmalan[15] = (CheckBox) itemView.findViewById(R.id.cekAmalan16);
            cekAmalan[16] = (CheckBox) itemView.findViewById(R.id.cekAmalan17);
            cekAmalan[17] = (CheckBox) itemView.findViewById(R.id.cekAmalan18);
            cekAmalan[18] = (CheckBox) itemView.findViewById(R.id.cekAmalan19);
            cekAmalan[19] = (CheckBox) itemView.findViewById(R.id.cekAmalan20);
            cekAmalan[20] = (CheckBox) itemView.findViewById(R.id.cekAmalan21);
            cekAmalan[21] = (CheckBox) itemView.findViewById(R.id.cekAmalan22);
            cekAmalan[22] = (CheckBox) itemView.findViewById(R.id.cekAmalan23);


            this.mAdapter = adapter;
        }
    }
}
