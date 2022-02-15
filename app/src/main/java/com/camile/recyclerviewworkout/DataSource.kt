package com.camile.recyclerviewworkout

import com.camile.recyclerviewworkout.models.BookList

class DataSource {

    companion object {

        fun createDataSet() : ArrayList<BookList>{

            val list = ArrayList<BookList>()

            list.add(
                BookList(
                    "It",
                    "Stephen King",
                    "1986",
                    "https://en.wikipedia.org/wiki/It_(novel)"
                )
            )

            list.add(
                BookList(
                    "Twilight",
                    "Stephanie Meyer",
                    "2005",
                    "https://en.wikipedia.org/wiki/Twilight_(novel_series)"
                )
            )

            list.add(
                BookList(
                    "Harry Potter and the Philosopher Stone",
                    "Hermione Granger",
                    "1997",
                    "https://en.wikipedia.org/wiki/Harry_Potter_and_the_Philosopher%27s_Stone"
                )
            )

            list.add(
                BookList(
                    "The Da Vinci Code",
                    "Dan Brown",
                    "2003",
                    "https://en.wikipedia.org/wiki/The_Da_Vinci_Code"
                )
            )

            list.add(
                BookList(
                    "Becoming",
                    "Michelle Obama",
                    "2018",
                    "https://en.wikipedia.org/wiki/Becoming_(book)"
                )
            )

            list.add(
                BookList(
                    "Red, white and Royal Blue",
                    "Casey McQuiston",
                    "2019",
                    "https://en.wikipedia.org/wiki/Red,_White_%26_Royal_Blue"
                )
            )

            list.add(
                BookList(
                    "New Moon",
                    "Stephanie Meyer",
                    "2007",
                    "https://en.wikipedia.org/wiki/Eclipse_(Meyer_novel)"
                )
            )

            return list
        }
    }
}