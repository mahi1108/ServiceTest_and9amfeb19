package cubex.mahesh.servicetest_and9amfeb19

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start.setOnClickListener {
            var i = Intent(this@MainActivity,
                MyService::class.java)
            startService(i)
        }

        stop.setOnClickListener {
            var i = Intent(this@MainActivity,
                MyService::class.java)
            stopService(i)
        }
    }
}
