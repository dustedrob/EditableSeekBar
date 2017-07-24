package me.roberto;

import android.widget.SeekBar;

/**
 * Created by roberto on 24/07/17.
 */

public abstract class OnEditableSeekBarChangeListener {


        void onEditableSeekBarProgressChanged(SeekBar seekBar, int progress, boolean fromUser){}
        void onStartTrackingTouch(SeekBar seekBar){}
        void onStopTrackingTouch(SeekBar seekBar){}
        void onEnteredValueTooHigh(){}
        void onEnteredValueTooLow(){}
        void onEditableSeekBarValueChanged(int id, int value){}
    }


