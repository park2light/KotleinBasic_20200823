package kr.co.tjoeun.kotleinbasic_20200823

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //매인화면이 만들어질때
        setContentView(R.layout.activity_main)

        clickMeBtn.setOnClickListener {
//            클릭미 버튼이 눌리면 실행될 코드를 적는  {}
            Log.d("메인화면","클릭미버튼이 눌림")
        }

//        XML에 추가한 버튼을 makeLogBtn으로 이름지어서 => 눌리면 로그남기기 버튼 눌림 로그 남겨보기
        makeLogBtn.setOnClickListener {
            Log.d("메인화면","로그남기기 버튼눌림")
        }

    }
}