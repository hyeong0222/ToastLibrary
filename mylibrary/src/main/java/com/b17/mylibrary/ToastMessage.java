package com.b17.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {

    public static void getToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
