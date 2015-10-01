package io.nuri.pinterest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by chayongbin on 15. 10. 2..
 */

public class PinterestAdapter extends RecyclerView.Adapter<PinterestAdapter.PinterestView>{

    int[] imgList = {R.drawable.two, R.drawable.one, R.drawable.three, R.drawable.four,
            R.drawable.five, R.drawable.six, R.drawable.seven, R.drawable.eight,
            R.drawable.nine, R.drawable.ten};

    String[] nameList = {"One", "Two", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten"};

    public PinterestAdapter(Context context) {
    }

    @Override
    public PinterestView onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.grid_item, parent, false);
        PinterestView pinterestView = new PinterestView(layoutView);
        return pinterestView;
    }

    @Override
    public void onBindViewHolder(PinterestView holder, int position) {
        holder.imageView.setImageResource(imgList[position]);
        holder.textView.setText(nameList[position]);
    }

    @Override
    public int getItemCount() {
        return nameList.length;
    }

    class PinterestView extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public PinterestView(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.img);
            textView = (TextView) itemView.findViewById(R.id.img_name);

        }
    }
}
