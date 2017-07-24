package me.roberto;

import android.widget.SeekBar;

/**
 * Created by roberto on 24/07/17.
 */

public abstract class OnEditableSeekBarChangeListener {


        public void onEditableSeekBarProgressChanged(SeekBar seekBar, int progress, boolean fromUser){}
        public void onStartTrackingTouch(SeekBar seekBar){}
        public void onStopTrackingTouch(SeekBar seekBar){}
        public void onEnteredValueTooHigh(){}
        public void onEnteredValueTooLow(){}
        public void onEditableSeekBarValueChanged(int id, int value){}
    }


