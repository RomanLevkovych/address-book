package dev.rlevkovych.addressbook.groupslistactivity

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.rlevkovych.addressbook.R
import dev.rlevkovych.addressbook.data.entities.Group

class GroupViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.groups_list_item, parent, false)) {

    var isDisplayed: CheckBox = itemView.findViewById(R.id.is_displayed)

    fun bind(group: Group) {
        isDisplayed.isChecked = group.isActive
        isDisplayed.text = group.name
    }
}