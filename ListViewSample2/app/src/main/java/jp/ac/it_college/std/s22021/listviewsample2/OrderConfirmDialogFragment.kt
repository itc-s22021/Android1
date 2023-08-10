package jp.ac.it_college.std.s22021.listviewsample2

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class OrderConfirmDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        AlertDialog.Builder(requireActivity())
            .setTitle(R.string.dialog_title)
            .setMessage(R.string.dialog_msg)
            .setPositiveButton(R.string.dialog_btn_ok, DialogButtonClickListener())
            .setNegativeButton(R.string.dialog_btn_ng, DialogButtonClickListener())
            .setNeutralButton(R.string.dialog_btn_nu, DialogButtonClickListTener())
            .create()
    }
}