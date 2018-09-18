package com.example.senthil.kotlinalertdialog.Activity.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import com.example.senthil.kotlinalertdialog.R
import kotlinx.android.synthetic.main.activity_alert_dialog.*

class AlertDialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        simpleAlert_btn.setOnClickListener {
            showSimpleAlert()
        }

        simpleAlertWtTwo_Btn.setOnClickListener {
            showAlertWithTwoButton()
        }

        simpleAlertWtThree_Btn.setOnClickListener {
            showAlertWithThreeButton()
        }
    }

    private fun showSimpleAlert() {

        val alertDialog = AlertDialog.Builder(this).create()
        alertDialog.setTitle(Constant.ALERTTITLE)
        alertDialog.setMessage(Constant.SIMPLEALERTDIALOG)

        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", { dialogInterface, i ->
            // your code here
        })

        alertDialog.show()
    }

    private fun showAlertWithTwoButton() {
        val alertDialog = AlertDialog.Builder(this).create()
        alertDialog.setTitle(Constant.ALERTTITLE)
        alertDialog.setMessage(Constant.TWOBTNMSG)

        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, Constant.ACCEPT, { dialogInterface, i ->
            // your code here
        })

        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, Constant.REJECT, { dialogInterface, i ->
            // your code here
        })

        alertDialog.show()
    }

    private fun showAlertWithThreeButton() {
        val alertDialog = AlertDialog.Builder(this).create()
        alertDialog.setTitle(Constant.ALERTTITLE)
        alertDialog.setMessage(Constant.THREEBUTTONMSG)

        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, Constant.LIKE, { dialogInterface, i ->
            // your code here
        })

        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, Constant.COMMENT, { dialogInterface, j ->
            // your code here
        })
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, Constant.SHARE, { dialogInterface, k ->
            // your code here
        })

        alertDialog.show()
    }
}
