package com.rcDev.ecommerce

import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rcDev.ecommerce.R
import com.rcDev.ecommerce.Utils.Utils
import com.rcDev.ecommerce.adapter.ItemAdapter
import com.rcDev.ecommerce.model.ShopItem
import com.rcDev.ecommerce.repository.ItemRepository
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var itemArrayList: ArrayList<ShopItem>
    private lateinit var mAdapter: ItemAdapter
    internal var numberOfColumns = 2
    private val filterViewHeight = 50
    private var dyg = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()

        initUI()

        initDataBinding()

        initActions()
    }

    private fun initData() {

        itemArrayList = ItemRepository.menShopItemList

    }

    private fun initUI() {

        initToolbar()

        mAdapter = ItemAdapter(itemArrayList, numberOfColumns)

        // Init Filter UI
        val cityCardView = findViewById<CardView>(R.id.cityFilterCardView)
        val categoryCardView = findViewById<CardView>(R.id.categoryFilterCardView)
        val sortCardView = findViewById<CardView>(R.id.sortCardView)

        cityCardView.setOnClickListener { Toast.makeText(this, "Clicked City Filter.", Toast.LENGTH_SHORT).show() }

        categoryCardView.setOnClickListener { Toast.makeText(this, "Clicked Category Filter.", Toast.LENGTH_SHORT).show() }

        sortCardView.setOnClickListener { Toast.makeText(this, "Clicked Sort/Filter.", Toast.LENGTH_SHORT).show() }

        // get RecyclerView and bind

        recyclerView.layoutManager = GridLayoutManager(this, numberOfColumns)
        recyclerView.itemAnimator = DefaultItemAnimator()


        recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                if (dy > 1) {

                    dyg -= dy

                    if (dyg < -filterViewHeight) {
                        dyg = -filterViewHeight
                    }

                    filterConstraintLayout.animate()
                        .translationY(Utils.dpToPx(applicationContext, dyg).toFloat())
                        .alpha(1f).setDuration(100).interpolator = DecelerateInterpolator()
                } else if (dy < 0) {

                    dyg -= dy

                    if (dyg > 0) {
                        dyg = 0
                    }

                    filterConstraintLayout.animate()
                        .translationY(dyg.toFloat())
                        .alpha(1f).setDuration(100).interpolator = DecelerateInterpolator()
                }
            }
        })

    }

    private fun initDataBinding() {
        // get data and adapter
        recyclerView.adapter = mAdapter
    }

    private fun initActions() {
        mAdapter.setOnItemClickListener(object : ItemAdapter.OnItemClickListener {
            override fun onItemClick(view: View, obj: ShopItem, position: Int) {
                Toast.makeText(applicationContext, "Clicked " + obj.name, Toast.LENGTH_SHORT).show()
            }

            override fun onAddToCartClick(view: View, obj: ShopItem, position: Int) {
                Toast.makeText(applicationContext, "Clicked Add To Cart ", Toast.LENGTH_SHORT).show()
            }

            override fun onLikeClick(view: View, obj: ShopItem, position: Int) {
                Toast.makeText(applicationContext, "Clicked Like ", Toast.LENGTH_SHORT).show()
            }

            override fun onMenuClick(view: View, obj: ShopItem, position: Int) {
                Toast.makeText(applicationContext, "Clicked Menu ", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun initToolbar() {
        toolbar.setNavigationIcon(R.drawable.baseline_menu_black_24)

        if (toolbar.navigationIcon != null) {
            toolbar.navigationIcon?.setColorFilter(ContextCompat.getColor(this, R.color.md_white_1000), PorterDuff.Mode.SRC_ATOP)
        }

        toolbar.title = "ECommerce"

        try {
            toolbar.setTitleTextColor(ContextCompat.getColor(this,R.color.md_white_1000))
        } catch (e: Exception) {
            Log.e("ECommerce", "Can't set color.")
        }

        try {
            setSupportActionBar(toolbar)
        } catch (e: Exception) {
            Log.e("ECommerce", "Error in set support action bar.")
        }

        try {
            if (supportActionBar != null) {
                supportActionBar?.setDisplayHomeAsUpEnabled(true)
            }
        } catch (e: Exception) {
            Log.e("ECommerce", "Error in set display home as up enabled.")
        }

    }

}