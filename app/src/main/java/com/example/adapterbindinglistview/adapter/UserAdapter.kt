package com.example.adapterbindinglistview.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.adapterbindinglistview.R
import com.example.adapterbindinglistview.databinding.ListItemBinding
import com.example.adapterbindinglistview.model.user.User

class UserAdapter(context: Context, var users: MutableList<User>) :
    ArrayAdapter<User>(context, R.layout.list_item, users) {

    override fun getCount(): Int {
        return users.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val userItem: ListItemBinding
        if (convertView == null) {
            userItem = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            Log.d("TAG", "create: $position")
        }
        else {
            userItem = ListItemBinding.bind(convertView)
            Log.d("TAG", "update: $position")
        }

        val user = users[position]
        userItem.name.text = user.name
        userItem.surname.text = user.surname
        userItem.image.setImageResource(user.img)

        return userItem.root
    }
}