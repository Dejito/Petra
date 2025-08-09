package com.mobile.petra.data.local


class DataSource {

//    fun loadDurations(): List<String> {
//        return listOf("Recent","Today","Last 7 Days","Last 14 Days","Last 30 Days","Last 3 Months","All Time","Custom")
//    }

    fun loadProducts(): List<Product> {
        return listOf(
            Product(
                title = "Majestic Mountain",
                description = "A beautiful golden dress",
                slug = "",
                price = 2000.0,
                isFavorite = true,
                category = ProdCategory(id = 1),
                images = listOf(
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Famazon.png?alt=media\\&token=2dd621ba-d831-459c-80fb-dc6049ef6d85](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Famazon.png?alt=media&token=2dd621ba-d831-459c-80fb-dc6049ef6d85)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fapple\\_iTunes.jpg?alt=media\\&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fapple_iTunes.jpg?alt=media&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Febay.jpg?alt=media\\&token=146e63fa-e233-4342-92be-585d8079054e](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Febay.jpg?alt=media&token=146e63fa-e233-4342-92be-585d8079054e)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fgoogle\\_play.jpg?alt=media\\&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fgoogle_play.jpg?alt=media&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037)",
                ),
            ),

            Product(
                title = "Bajectic Skillful",
                description = "Inter-milan midfield dynamo",
                slug = "",
                price = 3000.0,
                isFavorite = false,
                category = ProdCategory(id = 1),
                images = listOf(
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Famazon.png?alt=media\\&token=2dd621ba-d831-459c-80fb-dc6049ef6d85](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Famazon.png?alt=media&token=2dd621ba-d831-459c-80fb-dc6049ef6d85)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fapple\\_iTunes.jpg?alt=media\\&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fapple_iTunes.jpg?alt=media&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Febay.jpg?alt=media\\&token=146e63fa-e233-4342-92be-585d8079054e](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Febay.jpg?alt=media&token=146e63fa-e233-4342-92be-585d8079054e)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fgoogle\\_play.jpg?alt=media\\&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fgoogle_play.jpg?alt=media&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037)",
                ),
            ),

            Product(
                title = "Diogo Jota",
                description = "A beautiful number 20",
                slug = "",
                price = 4500.0,
                isFavorite = true,
                category = ProdCategory(id = 1),
                images = listOf(
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Famazon.png?alt=media\\&token=2dd621ba-d831-459c-80fb-dc6049ef6d85](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Famazon.png?alt=media&token=2dd621ba-d831-459c-80fb-dc6049ef6d85)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fapple\\_iTunes.jpg?alt=media\\&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fapple_iTunes.jpg?alt=media&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Febay.jpg?alt=media\\&token=146e63fa-e233-4342-92be-585d8079054e](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Febay.jpg?alt=media&token=146e63fa-e233-4342-92be-585d8079054e)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fgoogle\\_play.jpg?alt=media\\&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fgoogle_play.jpg?alt=media&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037)",
                ),
            ),

            Product(
                title = "Eden Hazard",
                description = "Player of the beautiful game",
                slug = "",
                price = 5400.0,
                isFavorite = true,
                category = ProdCategory(id = 1),
                images = listOf(
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Famazon.png?alt=media\\&token=2dd621ba-d831-459c-80fb-dc6049ef6d85](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Famazon.png?alt=media&token=2dd621ba-d831-459c-80fb-dc6049ef6d85)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fapple\\_iTunes.jpg?alt=media\\&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fapple_iTunes.jpg?alt=media&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Febay.jpg?alt=media\\&token=146e63fa-e233-4342-92be-585d8079054e](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Febay.jpg?alt=media&token=146e63fa-e233-4342-92be-585d8079054e)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fgoogle\\_play.jpg?alt=media\\&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fgoogle_play.jpg?alt=media&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037)",
                ),
            ),

            Product(
                title = "Didier Drogba",
                description = "Powerful number 11",
                slug = "",
                price = 4900.0,
                isFavorite = false,
                category = ProdCategory(id = 1),
                images = listOf(
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Famazon.png?alt=media\\&token=2dd621ba-d831-459c-80fb-dc6049ef6d85](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Famazon.png?alt=media&token=2dd621ba-d831-459c-80fb-dc6049ef6d85)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fapple\\_iTunes.jpg?alt=media\\&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fapple_iTunes.jpg?alt=media&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Febay.jpg?alt=media\\&token=146e63fa-e233-4342-92be-585d8079054e](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Febay.jpg?alt=media&token=146e63fa-e233-4342-92be-585d8079054e)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fgoogle\\_play.jpg?alt=media\\&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fgoogle_play.jpg?alt=media&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037)",
                ),
            ),

            Product(
                title = "Frankie Lampard",
                description = "Super Dynamic 08 ",
                slug = "",
                price = 8900.0,
                isFavorite = true,
                category = ProdCategory(id = 1),
                images = listOf(
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Famazon.png?alt=media\\&token=2dd621ba-d831-459c-80fb-dc6049ef6d85](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Famazon.png?alt=media&token=2dd621ba-d831-459c-80fb-dc6049ef6d85)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fapple\\_iTunes.jpg?alt=media\\&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fapple_iTunes.jpg?alt=media&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Febay.jpg?alt=media\\&token=146e63fa-e233-4342-92be-585d8079054e](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Febay.jpg?alt=media&token=146e63fa-e233-4342-92be-585d8079054e)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fgoogle\\_play.jpg?alt=media\\&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fgoogle_play.jpg?alt=media&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037)",
                ),
            ),

            Product(
                title = "Michael Ballack",
                description = "German midfield kingpin",
                slug = "",
                price = 1200.0,
                isFavorite = false,
                category = ProdCategory(id = 1),
                images = listOf(
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Famazon.png?alt=media\\&token=2dd621ba-d831-459c-80fb-dc6049ef6d85](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Famazon.png?alt=media&token=2dd621ba-d831-459c-80fb-dc6049ef6d85)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fapple\\_iTunes.jpg?alt=media\\&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fapple_iTunes.jpg?alt=media&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Febay.jpg?alt=media\\&token=146e63fa-e233-4342-92be-585d8079054e](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Febay.jpg?alt=media&token=146e63fa-e233-4342-92be-585d8079054e)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fgoogle\\_play.jpg?alt=media\\&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fgoogle_play.jpg?alt=media&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037)",
                ),
            ),

            Product(
                title = "Philip Lahm",
                description = "Neat and tidy fullback",
                slug = "",
                price = 2000.0,
                isFavorite = false,
                category = ProdCategory(id = 1),
                images = listOf(
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Famazon.png?alt=media\\&token=2dd621ba-d831-459c-80fb-dc6049ef6d85](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Famazon.png?alt=media&token=2dd621ba-d831-459c-80fb-dc6049ef6d85)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fapple\\_iTunes.jpg?alt=media\\&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fapple_iTunes.jpg?alt=media&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Febay.jpg?alt=media\\&token=146e63fa-e233-4342-92be-585d8079054e](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Febay.jpg?alt=media&token=146e63fa-e233-4342-92be-585d8079054e)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fgoogle\\_play.jpg?alt=media\\&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fgoogle_play.jpg?alt=media&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037)",
                ),
            ),

            Product(
                title = "Per Mertesacker",
                description = "Elongated, languid, lanky, CB",
                slug = "",
                price = 2000.0,
                isFavorite = true,
                category = ProdCategory(id = 1),
                images = listOf(
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Famazon.png?alt=media\\&token=2dd621ba-d831-459c-80fb-dc6049ef6d85](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Famazon.png?alt=media&token=2dd621ba-d831-459c-80fb-dc6049ef6d85)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fapple\\_iTunes.jpg?alt=media\\&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fapple_iTunes.jpg?alt=media&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Febay.jpg?alt=media\\&token=146e63fa-e233-4342-92be-585d8079054e](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Febay.jpg?alt=media&token=146e63fa-e233-4342-92be-585d8079054e)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fgoogle\\_play.jpg?alt=media\\&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fgoogle_play.jpg?alt=media&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037)",
                ),
            ),

            Product(
                title = "Aymeric Laporte",
                description = "Espano-Franco national",
                slug = "",
                price = 9100.0,
                isFavorite = false,
                category = ProdCategory(id = 1),
                images = listOf(
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Famazon.png?alt=media\\&token=2dd621ba-d831-459c-80fb-dc6049ef6d85](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Famazon.png?alt=media&token=2dd621ba-d831-459c-80fb-dc6049ef6d85)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fapple\\_iTunes.jpg?alt=media\\&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fapple_iTunes.jpg?alt=media&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Febay.jpg?alt=media\\&token=146e63fa-e233-4342-92be-585d8079054e](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Febay.jpg?alt=media&token=146e63fa-e233-4342-92be-585d8079054e)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fgoogle\\_play.jpg?alt=media\\&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fgoogle_play.jpg?alt=media&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037)",
                ),
            ),

            Product(
                title = "Ousmane Dembele",
                description = "Belatedly realising potential",
                slug = "",
                price = 2200.0,
                isFavorite = true,
                category = ProdCategory(id = 1),
                images = listOf(
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Famazon.png?alt=media\\&token=2dd621ba-d831-459c-80fb-dc6049ef6d85](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Famazon.png?alt=media&token=2dd621ba-d831-459c-80fb-dc6049ef6d85)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fapple\\_iTunes.jpg?alt=media\\&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fapple_iTunes.jpg?alt=media&token=fe980cfd-1c1f-4c71-9416-1d25e0b4f8e7)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Febay.jpg?alt=media\\&token=146e63fa-e233-4342-92be-585d8079054e](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Febay.jpg?alt=media&token=146e63fa-e233-4342-92be-585d8079054e)",
                    "https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard\\_logo%2Fgoogle\\_play.jpg?alt=media\\&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037](https://firebasestorage.googleapis.com/v0/b/blackchinx-e2472.firebasestorage.app/o/giftcard_logo%2Fgoogle_play.jpg?alt=media&token=1855eb10-72d3-4b6e-a5d0-6155a07b4037)",
                ),
            ),


        )
    }


}