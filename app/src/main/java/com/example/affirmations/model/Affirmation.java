package com.example.affirmations.model;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

public class Affirmation {
    @StringRes private final int stringResourcesId;
    @DrawableRes private final int imgResourceId;

    public Affirmation(int stringResourcesId, int imgResourceId) {
        this.stringResourcesId = stringResourcesId;
        this.imgResourceId = imgResourceId;
    }

    public int getStringResourcesId() {
        return this.stringResourcesId;
    }

    public int getImgResourceId() {
        return this.imgResourceId;
    }
}
