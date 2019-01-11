package embrace.com.dependencyinjection

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject @field:Named("Love") lateinit var infoLove: Info
    @Inject @field:Named("Hello") lateinit var infoHello: Info


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerInjectingComponent.create().inject(this)
        text_view.text = "${infoLove.text}"
        text_view2.text = "${infoHello.text}"

    }
}
