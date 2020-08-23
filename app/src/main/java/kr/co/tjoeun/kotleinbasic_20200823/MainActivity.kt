package kr.co.tjoeun.kotleinbasic_20200823

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickMeBtn.setOnClickListener {
//            클릭미 버튼이 눌리면 실행될 코드를 적는  {}
            Log.d("메인화면","클릭미버튼이 눌림")
        }
    }
}