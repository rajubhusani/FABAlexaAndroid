package com.orbitahealth.voice.util;

import android.content.Context;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.orbitahealth.voice.R;
import com.willblaschko.android.alexa.data.AlexaCardModel;

import java.util.ArrayList;
import java.util.List;

public class AlexaCardRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int SIMPLE = 0, STANDARD = 1;

    private Context mContext;
    protected final List<AlexaCardModel> mValues;
    protected OnAlexaCardClickListener mListener;

    public AlexaCardRecyclerAdapter(Context context) {
        this.mContext = context;
        mValues = new ArrayList<AlexaCardModel>();
    }

    @Override
    public int getItemViewType(int position) {
        if (mValues.get(position) != null && !TextUtils.isEmpty(mValues.get(position).getType())) {
            if (mValues.get(position).getType().equals("Simple")) {
                return SIMPLE;
            } else if (mValues.get(position).getType().equals("Standard")) {
                return STANDARD;
            } else {
                return super.getItemViewType(position);
            }
        } else {
            return super.getItemViewType(position);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        switch (viewType) {
            case SIMPLE:
                viewHolder = createSimpleViewHolder(parent);
                break;
            case STANDARD:
                viewHolder = createStandardViewHolder(parent);
                break;
            default:
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case SIMPLE:
                bindSimpleLayout(holder, position);
                break;
            case STANDARD:
                bindStandardLayout(holder, position);
                break;
            default:
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }


    public AlexaCardModel getItem(int position) {
        return mValues.get(position);
    }

    public void add(AlexaCardModel item) {
        mValues.add(item);
        notifyItemInserted(mValues.size() - 1);
    }

    public void addToStart(AlexaCardModel item) {
        mValues.add(0, item);
        notifyDataSetChanged();
    }

    public void addAll(List<AlexaCardModel> items) {
        for (AlexaCardModel item : items) {
            add(item);
        }
    }

    private void remove(AlexaCardModel item) {
        int position = mValues.indexOf(item);
        if (position > -1) {
            mValues.remove(position);
            notifyItemRemoved(position);
        }
    }

    public void clear() {
        while (getItemCount() > 0) {
            remove(getItem(0));
        }
    }

    public boolean isEmpty() {
        return getItemCount() == 0;
    }

    public boolean isLastPosition(int position) {
        return (position == mValues.size()-1);
    }

    public void setOnAlexaCardClickListener(OnAlexaCardClickListener listener) {
        this.mListener = listener;
    }

    private RecyclerView.ViewHolder createSimpleViewHolder(ViewGroup viewGroup) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.alexa_simple_card_layout, viewGroup, false);
        return new SimpleCardViewHolder(view);
    }

    private RecyclerView.ViewHolder createStandardViewHolder(ViewGroup viewGroup) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.alexa_standard_card_layout, viewGroup, false);
        return new StandardCardViewHolder(view);
    }

    private void bindSimpleLayout(RecyclerView.ViewHolder viewHolder, final int position) {
        final SimpleCardViewHolder holder = (SimpleCardViewHolder) viewHolder;
        holder.mItem = mValues.get(position);
        if (!TextUtils.isEmpty(holder.mItem.getTitle())) {
            holder.mTitleView.setText(holder.mItem.getTitle());
        }  else {
            holder.mTitleView.setText("");
        }
        if (!TextUtils.isEmpty(holder.mItem.getRichcontent())) {
            if (Build.VERSION.SDK_INT >= 24) {
                holder.mContentView.setText(Html.fromHtml(holder.mItem.getRichcontent(), Html.FROM_HTML_MODE_COMPACT));
            } else {
                holder.mContentView.setText(Html.fromHtml(holder.mItem.getRichcontent()));
            }
        } else if (!TextUtils.isEmpty(holder.mItem.getContent())) {
            holder.mContentView.setText(holder.mItem.getContent());
        } else {
            holder.mContentView.setText("");
        }
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mListener != null) {
                    mListener.onCardClick(position);
                }
            }
        });
    }

    private void bindStandardLayout(RecyclerView.ViewHolder viewHolder, final int position) {
        final StandardCardViewHolder holder = (StandardCardViewHolder) viewHolder;
        holder.mItem = mValues.get(position);
        if (!TextUtils.isEmpty(holder.mItem.getTitle())) {
            holder.mTitleView.setText(holder.mItem.getTitle());
        }  else {
            holder.mTitleView.setText("");
        }
        if (!TextUtils.isEmpty(holder.mItem.getRichcontent())) {
            if (Build.VERSION.SDK_INT >= 24) {
                holder.mContentView.setText(Html.fromHtml(holder.mItem.getRichcontent(), Html.FROM_HTML_MODE_COMPACT));
            } else {
                holder.mContentView.setText(Html.fromHtml(holder.mItem.getRichcontent()));
            }
        } else if (!TextUtils.isEmpty(holder.mItem.getText())) {
            holder.mContentView.setText(holder.mItem.getText());
        } else {
            holder.mContentView.setText("");
        }
        if (holder.mItem.getImage() != null) {
            if (!TextUtils.isEmpty(holder.mItem.getImage().getLargeImageUrl())) {
                holder.mImageView.setVisibility(View.VISIBLE);
                Utilities.loadImageAndCenterCrop(holder.mImageView.getContext(),
                        holder.mImageView,
                        holder.mItem.getImage().getLargeImageUrl(),
                        R.drawable.ic_broken_image_black_large);
            } else if (!TextUtils.isEmpty(holder.mItem.getImage().getSmallImageUrl())) {
                holder.mImageView.setVisibility(View.VISIBLE);
                Utilities.loadImageAndCenterCrop(holder.mImageView.getContext(),
                        holder.mImageView,
                        holder.mItem.getImage().getSmallImageUrl(),
                        R.drawable.ic_broken_image_black_large);
            } else {
                holder.mImageView.setVisibility(View.GONE);
                holder.mImageView.setImageDrawable(null);
            }
        } else if (holder.mItem.getVideo() != null) {
            holder.mImageView.setVisibility(View.VISIBLE);
            Utilities.loadImageAndCenterCrop(holder.mImageView.getContext(),
                    holder.mImageView,
                    holder.mItem.getVideo().getThumbnailUrl(),
                    R.drawable.ic_broken_image_black_large);
            holder.mImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Utilities.showToast(mContext, "Coming Soon", Toast.LENGTH_SHORT);
                }
            });
        } else {
            holder.mImageView.setVisibility(View.GONE);
            holder.mImageView.setImageDrawable(null);
        }
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mListener != null) {
                    mListener.onCardClick(position);
                }
            }
        });
    }

    public class SimpleCardViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mTitleView;
        public final TextView mContentView;
        public AlexaCardModel mItem;

        public SimpleCardViewHolder(View view) {
            super(view);
            mView = view;
            mTitleView = (TextView) mView.findViewById(R.id.card_title);
            mContentView = (TextView) mView.findViewById(R.id.card_content);
            mContentView.setMovementMethod(LinkMovementMethod.getInstance());
        }

    }

    public class StandardCardViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mTitleView;
        public final ImageView mImageView;
        public final TextView mContentView;
        public AlexaCardModel mItem;

        public StandardCardViewHolder(View view) {
            super(view);
            mView = view;
            mTitleView = (TextView) mView.findViewById(R.id.card_title);
            mImageView = (ImageView) mView.findViewById(R.id.card_image);
            mContentView = (TextView) mView.findViewById(R.id.card_content);
            mContentView.setMovementMethod(LinkMovementMethod.getInstance());
        }

    }

    public interface OnAlexaCardClickListener {
        void onCardClick(int position);
    }

}
