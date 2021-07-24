package com.sg.words10

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_post.view.*

class PostAdapter(val items: ArrayList<Post>, val clickListener: OnPostItemClickListener) :
    RecyclerView.Adapter<PostAdapter.PostViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.initialize(items[position],clickListener)
    }

    override fun getItemCount()=items.size

    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var postName=itemView.postName
        var postLogo=itemView.postImage
        fun initialize(item:Post,action:OnPostItemClickListener){
            postName.text=item.name
            postLogo.setImageResource(item.logo)
            itemView.setOnClickListener {
                action.onItemClick(item,adapterPosition)

            }
        }
    }
}


class OnPostItemClickListener {
    fun onItemClick(item: Post,position: Int){}

}
