package com.pals.gittest;

import android.content.Context;
import android.widget.Toast;

public class MyToast {
    public void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}