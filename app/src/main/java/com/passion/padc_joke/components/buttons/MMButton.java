package com.passion.padc_joke.components.buttons;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import com.passion.padc_joke.utils.MMFontUtils;

/**
 * Created by Dell on 6/25/2016.
 */
public class MMButton extends Button {
    public MMButton(Context context) {
        super(context);
        if (!isInEditMode()) {
            MMFontUtils.setMMFont(this);
        }
    }

    public MMButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode()) {
            MMFontUtils.setMMFont(this);
        }
    }

    public MMButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (!isInEditMode()) {
            MMFontUtils.setMMFont(this);
        }
    }
}
