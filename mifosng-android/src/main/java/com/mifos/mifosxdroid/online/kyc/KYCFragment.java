package com.mifos.mifosxdroid.online.kyc;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.mifos.mifosxdroid.R;
import com.mifos.mifosxdroid.core.MifosBaseFragment;

public class KYCFragment extends MifosBaseFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fragment_kyc, container, false);
        return mView;
    }
}
