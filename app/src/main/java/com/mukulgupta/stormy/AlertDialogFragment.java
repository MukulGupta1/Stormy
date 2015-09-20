package com.mukulgupta.stormy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by mukul on 19/09/15.
 */
public class AlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(context.getString(R.string.error_title)).
                setMessage(context.getString(R.string.error_message))
                .setPositiveButton(context.getString(R.string.Ok), null);

        AlertDialog dialog = builder.create();
        return dialog;
    }
}
