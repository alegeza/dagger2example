package com.alexfcmkh.dagger2boilerplate.mvp.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class BaseViewModel extends ViewModel {

    protected MutableLiveData<Boolean> loadingProgressLiveData;
    protected MutableLiveData<String> infoMessageLiveData;

    public MutableLiveData<Boolean> getLoadingProgressLiveData() {
        if (loadingProgressLiveData == null) {
            loadingProgressLiveData = new MutableLiveData<>();
        }
        return loadingProgressLiveData;
    }

    public MutableLiveData<String> getInfoMessageLiveData() {
        if (infoMessageLiveData == null) {
            infoMessageLiveData = new MutableLiveData<>();
        }
        return infoMessageLiveData;
    }

}
