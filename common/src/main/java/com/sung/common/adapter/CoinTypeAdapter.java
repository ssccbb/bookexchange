package com.sung.common.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import com.sung.common.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Create by sung at 2020-05-18
 *
 * @desc:
 * @notice:
 */
public class CoinTypeAdapter extends RecyclerView.Adapter<CoinTypeAdapter.CoinTypeHolder> {
    private List<String> mDatas;
    private OnItemClickListener mListener;

    public CoinTypeAdapter(List<String> mDatas) {
        if (this.mDatas == null) {
            this.mDatas = new ArrayList<>();
        }
        if (!mDatas.isEmpty()) {
            this.mDatas.addAll(mDatas);
        }
    }

    @NonNull
    @Override
    public CoinTypeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_order_choose_coin_type_item, null, false);
        return new CoinTypeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoinTypeHolder holder, int position) {
        holder.onBind(position);
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    public void setNewData(List data) {
        if (data.isEmpty()) {
            return;
        }
        mDatas.addAll(data);
        notifyDataSetChanged();
    }

    public void addOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mListener = onItemClickListener;
    }

    public class CoinTypeHolder extends RecyclerView.ViewHolder {
        private TextView mContent;

        public CoinTypeHolder(@NonNull View itemView) {
            super(itemView);
            mContent = itemView.findViewById(R.id.tv_coin_content);
        }

        public void onBind(final int pos) {
            mContent.setText(mDatas.get(pos));
            mContent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mListener != null) {
                        mListener.onItemClick(mContent, pos);
                    }
                }
            });
        }
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }
}
