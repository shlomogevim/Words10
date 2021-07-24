package com.sg.words10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,OnMadItemClickListener {

    lateinit var madList:ArrayList<Mad>
    lateinit var postList:ArrayList<Post>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)


        madList= ArrayList()
        postList= ArrayList()

      //  addMads()
        addPosts()

       /* madRecycler.layoutManager= LinearLayoutManager(this)
        madRecycler.addItemDecoration(DividerItemDecoration(this,1))
        madRecycler.adapter=MadAdapter(madList,this)*/
        postRecycler.layoutManager= LinearLayoutManager(this)
        postRecycler.addItemDecoration(DividerItemDecoration(this,1))
        postRecycler.adapter=PostAdapter(postList,this)

    }

    private fun addPosts() {
        postList.add(Post(1,"פוסט מס: 1","https://www.windguru.cz/station/1011",R.drawable.struggle))
        postList.add(Post(2,"פוסט מס: 2","https://www.windguru.cz/station/1011",R.drawable.panorama))
        postList.add(Post(3,"פוסט מס: 3","https://www.windguru.cz/station/1011",R.drawable.war))
        postList.add(Post(4,"פוסט מס: 4","https://www.windguru.cz/station/1011",R.drawable.wamen))


    }
    private fun addMads() {
        madList.add(Mad(1,"חוף און - בצת","https://www.windguru.cz/station/1011",R.drawable.b1))
        madList.add(Mad(2,"שבי ציון","https://www.windguru.cz/station/2763",R.drawable.b2))
        madList.add(Mad(3,"ארגמן - עכו","https://www.windguru.cz/station/2050",R.drawable.b3))
        madList.add(Mad(4,"מכון - בת גלים","https://www.windguru.cz/station/2697",R.drawable.b4))
        madList.add(Mad(5,"כנסיה - בת גלים","https://www.windguru.cz/station/2049",R.drawable.b5))
        madList.add(Mad(6,"נירוונה - חוף דדו","https://www.windguru.cz/station/468",R.drawable.b6))
        madList.add(Mad(7,"עתלית - מבצר","https://www.windguru.cz/station/2256",R.drawable.b7))
        madList.add(Mad(8,"קיסריה - פריגל","https://www.windguru.cz/station/2259",R.drawable.b82))
        madList.add(Mad(9,"בית ינאי","https://www.windguru.cz/station/2161",R.drawable.b91))
        madList.add(Mad(10,"אילת - הריף","https://www.windguru.cz/station/2197",R.drawable.b42))
        madList.add(Mad(11,"משאבות - כנרת","https://www.windguru.cz/station/1909",R.drawable.b21))
        madList.add(Mad(12,"מצוף עין שבע - כנרת","https://www.windguru.cz/station/2752",R.drawable.b82))
        madList.add(Mad(13,"מזח כפר נחום - כנרת","https://www.windguru.cz/station/1206",R.drawable.b22))


    }

    override fun onItemClick(item: Mad, position: Int) {
        val intent= Intent(this,MadDetailActivity::class.java)
        intent.putExtra(POST_NAME,item.name)
        intent.putExtra(POST_ADRESS,item.address)
        intent.putExtra(POST_INDEX,item.index)
        startActivity(intent)
    }
}