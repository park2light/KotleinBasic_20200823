package kr.co.tjoeun.kotleinbasic_20200823

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
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

        toastBtn.setOnClickListener {
            Toast.makeText(this,"버튼눌림",Toast.LENGTH_SHORT).show()
        }
//        입력한 문구를 받아서 => 토스트로 출력

        contentToastBtn.setOnClickListener {
////              contentEdt의 문구(text 속성의 값) => 받아서 => 코틀린 변수 저장
//            val inputContent = contentEdt.text.toString()
////              변수에 저장된 문구를 => 토스트의 재료로 사용.
//                Toast.makeText(this,inputContent,Toast.LENGTH_SHORT).show()
//            Log.d("메인화면",inputContent)

            val inputContent = contentEdt.text.toString()
            when (inputContent) {
                "안녕하세요" -> {
                    Toast.makeText(this,"인사",Toast.LENGTH_SHORT).show()
                }
                "안녕히 가세요" -> {
                    //if는 안되는거 맞는데 혹시 이거는 맞니?
                    Toast.makeText(this,"작별인사",Toast.LENGTH_SHORT).show()
                }
                "맛있게 드세요" -> {
                    Toast.makeText(this,"식사 인사",Toast.LENGTH_SHORT).show()
                }
                else -> {
                    Toast.makeText(this,"그 외의 문장",Toast.LENGTH_SHORT).show()
                }
            }

        }


        changeTextBtn.setOnClickListener {
            val inputMessage = messageEdt.text.toString();
            resultTxt.text = inputMessage
        }

        greetingBtn.setOnClickListener {

            val inputName = nameEdt.text.toString()
            val printMessage="안녕하세요 저는 ${inputName} 입니다"
            Toast.makeText(this,printMessage,Toast.LENGTH_SHORT).show()
        }



    }
}