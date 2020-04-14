package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_report_bully.*

class ReportBullyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report_bully)

        back.setOnClickListener {
            this.finish()
        }

        bt_cancel.setOnClickListener {
            this.finish()
        }

        bt_submit.setOnClickListener {
            this.finish()
        }

        supportActionBar?.hide()
    }
}
