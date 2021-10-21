package com.clearsky77.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onDestroy() { // 액티비티가 종료될 때 호출된다.
        super.onDestroy()
        saveText()
    }


//    ----- 이하 메소드 -----

    private fun saveText() {
        val pref = getSharedPreferences("pref", 0) // 내부 저장소에 pref라는 이름으로 저장
        val edit = pref.edit()
        edit.putString("text_main",editTxt.text.toString()) // 키 값, 실제 담을 값
        edit.apply() // 저장 실행
    }

}