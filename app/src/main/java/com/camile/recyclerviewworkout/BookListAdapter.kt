package com.camile.recyclerviewworkout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.camile.recyclerviewworkout.models.BookList
import kotlinx.android.synthetic.main.book_list.view.*

class BookListAdapter(private val onItemClicked : (BookList) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items : List<BookList> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BookListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.book_list, parent, false)
        )

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (holder) {
            is BookListViewHolder -> {
                holder.bind(items[position], onItemClicked)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size

    }

    fun setDataSet(list: List<BookList>){
        this.items = list
    }

    class BookListViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        private val bookname = itemView.name
        private val bookauthor = itemView.author
        private val bookyear = itemView.year

        fun bind(bookList: BookList, onItemClicked: (BookList) -> Unit){
            bookname.text = bookList.name
            bookauthor.text = bookList.author
            bookyear.text = bookList.year

            itemView.setOnClickListener{
                onItemClicked(bookList)
            }
        }
    }

}