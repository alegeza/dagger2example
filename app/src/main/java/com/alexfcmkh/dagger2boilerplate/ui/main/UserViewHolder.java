package com.alexfcmkh.dagger2boilerplate.ui.main;

import android.view.View;
import android.widget.TextView;

import com.alexfcmkh.dagger2boilerplate.R;
import com.alexfcmkh.dagger2boilerplate.ui.base.BaseViewHolder;

import butterknife.BindView;


class UserViewHolder extends BaseViewHolder {

    @BindView(R.id.user_name)
    TextView tvUserName;

    UserViewHolder(View itemView) {
        super(itemView);
    }
}
