package com.laioffer.matrix;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import androidx.annotation.NonNull;

public class ReportDialog extends Dialog {
    public ReportDialog(@NonNull Context context) {
        this(context,R.style.MyAlertDialogStyle);
    }
    public ReportDialog(@NonNull Context context, int themeResld) {
        super(context,themeResld);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final View dialogView = View.inflate(getContext(),R.layout.dialog,null);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(dialogView);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }
}
