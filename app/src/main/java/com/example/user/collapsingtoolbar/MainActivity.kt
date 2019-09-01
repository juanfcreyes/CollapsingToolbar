package com.example.user.collapsingtoolbar

import android.content.DialogInterface
import android.content.Intent
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.support.v4.graphics.drawable.RoundedBitmapDrawable
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper
import android.view.LayoutInflater
import android.widget.ImageView
import com.example.user.collapsingtoolbar.adapter.DataAdapter
import com.example.user.collapsingtoolbar.adapter.ItemDivider
import com.example.user.collapsingtoolbar.fillings.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        initFloatingButtonCustom()
        initRecyclerView()
    }

    private fun initFloatingButtonCustom() {
        floating_action_button.setOnClickListener { _ ->
            val builder: AlertDialog.Builder = AlertDialog.Builder(this@MainActivity)
            val inflater: LayoutInflater = this@MainActivity.layoutInflater
            builder.setView(inflater.inflate(R.layout.checkout_dialog, null))
                .setPositiveButton(getString(R.string.dialog_positive_label))
                { _: DialogInterface, _: Int ->
                    startActivity(Intent(this@MainActivity, CheckoutActivity::class.java))
                }
                .setNegativeButton(getString(R.string.dialog_negative_label)) { _: DialogInterface, _: Int -> }
            val dialog: AlertDialog = builder.create()
            dialog.show()
            this@MainActivity.roundImage(dialog)
        }
    }

    private fun roundImage(dialog: AlertDialog) {
        val imageDialog: ImageView = dialog.findViewById(R.id.dialog_image)!!
        val roundedDrawable: RoundedBitmapDrawable = RoundedBitmapDrawableFactory.create(resources, (getDrawable(R.drawable.sandwich) as BitmapDrawable).bitmap)
        roundedDrawable.cornerRadius = 30f
        imageDialog.setImageDrawable(roundedDrawable)
    }

    private fun initFloatingButton() {
        floating_action_button.setOnClickListener { _ ->
            val builder: AlertDialog.Builder = AlertDialog.Builder(this@MainActivity)
            builder
                .setTitle(getString(R.string.checkout_title))
                .setMessage(getString(R.string.checkout_message))
                .setIcon(R.drawable.baseline_shopping_basket_24)
                .setPositiveButton(getString(R.string.dialog_positive_label))
                { _: DialogInterface, _: Int ->
                    startActivity(Intent(this@MainActivity, CheckoutActivity::class.java))
                }
                .setNegativeButton(getString(R.string.dialog_negative_label)) { _: DialogInterface, _: Int -> }
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
    }


    private fun initRecyclerView() {
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = DataAdapter(createCheeses())
        recycler_view.addItemDecoration(ItemDivider(this, R.drawable.item_divider))
        recycler_view.setHasFixedSize(false)
        initSetItemTouchHelper() /*It works only if setHasFixedSize is false*/
    }

    private fun initSetItemTouchHelper() {
        val callback : ItemTouchHelper.SimpleCallback = object : ItemTouchHelper.SimpleCallback(0,
            ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) {
            override fun onMove(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder,
                                target: RecyclerView.ViewHolder): Boolean {
                return false
            }
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                (recycler_view.adapter as DataAdapter).removeItem(viewHolder.adapterPosition)
            }
        }
        ItemTouchHelper(callback).attachToRecyclerView(recycler_view)
    }


    private fun createCheeses(): ArrayList<Cheese> {
        val cheeses: ArrayList<Cheese> = ArrayList<Cheese>()
        cheeses.add(American())
        cheeses.add(Blue())
        cheeses.add(Brie())
        cheeses.add(Camembert())
        cheeses.add(Cheddar())
        cheeses.add(Colby())
        cheeses.add(Edam())
        cheeses.add(Feta())
        cheeses.add(Mozzarella())
        return cheeses
    }
}
