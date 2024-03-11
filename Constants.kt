package com.example.quizapp.classes

import com.example.quizapp.R

object Constants {

    fun getQuestion() : ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
            "What is the capital of France?",
            "Berlin",
            "London",
            "Madrid",
            "Paris",
            4)

        val que2 = Question(2,
            "Which city serves as the capital of Japan?",
            "Kyoto",
            "Tokyo",
            "Osaka",
            "Hiroshima",
            2)

        val que3 = Question(3,
            "What is the capital city of Brazil?",
            "Rio de Janeiro",
            "Brasília",
            "São Paulo",
            "Salvador",
            2)

        val que4 = Question(4,
            "Which city is the capital of Australia?",
            "Sydney",
            "Melbourne",
            "Canberra",
            "Brisbane",
            3)

        val que5 = Question(5,
            "What is the capital of South Africa?",
            "Johannesburg",
            "Pretoria",
            "Cape Town",
            "Durban",
            2)

        val que6 = Question(6,
            "Which city is the capital of Russia?",
            "St. Petersburg",
            "Moscow",
            "Vladivostok",
            "Sochi",
            2)

        val que7 = Question(7,
            "What is the capital of Canada?",
            "Montreal",
            "Toronto",
            "Ottawa",
            "Vancouver",
            3)

        val que8 = Question(8,
            "Which city serves as the capital of Italy?",
            "Milan",
            "Venice",
            "Rome",
            "Florence",
            3)

        val que9 = Question(9,
            "What is the capital of Argentina?",
            "Buenos Aires",
            "Santiago",
            "Lima",
            "Montevideo",
            1)

        val que10 = Question(10,
            "Which city is the capital of Egypt?",
            "Alexandria",
            "Giza",
            "Cairo",
            "Luxor",
            3)

        val que11 = Question(11,
            "What is the capital city of India?",
            "Mumbai",
            "Kolkata",
            "Delhi",
            "Chennai",
            3)

        val que12 = Question(12,
            "Which city serves as the capital of Spain?",
            "Barcelona",
            "Madrid",
            "Valencia",
            "Seville",
            2)

        val que13 = Question(13,
            "What is the capital of Turkey?",
            "Ankara",
            "Istanbul",
            "Izmir",
            "Antalya",
            1)

        val que14 = Question(14,
            "Which city is the capital of South Korea?",
            "Busan",
            "Incheon",
            "Seoul",
            "Daegu",
            3)

        val que15 = Question(15,
            "What is the capital of Nigeria?",
            "Lagos",
            "Abuja",
            "Kano",
            "Ibadan",
            2)

        val que16 = Question(16,
            "Which city serves as the capital of Germany?",
            "Munich",
            "Frankfurt",
            "Hamburg",
            "Berlin",
            4)

        val que17 = Question(17,
            "What is the capital city of Mexico?",
            "Guadalajara",
            "Cancun",
            "Monterrey",
            "Mexico City",
            4)

        val que18 = Question(18,
            "Which city is the capital of China?",
            "Shanghai",
            "Beijing",
            "Guangzhou",
            "Shenzhen",
            2)

        val que19 = Question(19,
            "What is the capital of Saudi Arabia?",
            "Jeddah",
            "Riyadh",
            "Mecca",
            "Medina",
            2)

        val que20 = Question(20,
            "Which city serves as the capital of Thailand?",
            "Pattaya",
            "Phuket",
            "Chiang Mai",
            "Bangkok",
            4)

        val que21 = Question(21,
            "What is the capital city of Poland?",
            "Warsaw",
            "Krakow",
            "Wroclaw",
            "Gdansk",
            1)

        val que22 = Question(22,
            "Which city is the capital of Colombia?",
            "Medellín",
            "Cartagena",
            "Bogotá",
            "Cali",
            3)

        val que23 = Question(23,
            "What is the capital of Iran?",
            "Tehran",
            "Isfahan",
            "Shiraz",
            "Tabriz",
            1)

        val que24 = Question(24,
            "Which city serves as the capital of Indonesia?",
            "Jakarta",
            "Bali",
            "Surabaya",
            "Bandung",
            1)

        val que25 = Question(25,
            "What is the capital city of Pakistan?",
            "Lahore",
            "Karachi",
            "Islamabad",
            "Peshawar",
            3)

        val que26 = Question(26,
            "Which city is the capital of Vietnam?",
            "Da Nang",
            "Ho Chi Minh City",
            "Hanoi",
            "Nha Trang",
            3)

        val que27 = Question(27,
            "What is the capital of Ukraine?",
            "Kharkiv",
            "Lviv",
            "Odessa",
            "Kiev",
            4)

        val que28 = Question(28,
            "Which city serves as the capital of Greece?",
            "Thessaloniki",
            "Athens",
            "Heraklion",
            "Patras",
            2)

        val que29 = Question(29,
            "What is the capital city of Hungary?",
            "Budapest",
            "Debrecen",
            "Szeged",
            "Miskolc",
            1)

        val que30 = Question(30,
            "Which city is the capital of Sweden?",
            "Gothenburg",
            "Malmo",
            "Stockholm",
            "Uppsala",
            3)

        val que31 = Question(31,
            "What is the capital of Malaysia?",
            "Penang",
            "Kuala Lumpur",
            "Johor Bahru",
            "Ipoh",
            2)

        val que32 = Question(32,
            "Which city serves as the capital of the Netherlands?",
            "Rotterdam",
            "The Hague",
            "Amsterdam",
            "Utrecht",
            2)

        val que33 = Question(33,
            "What is the capital city of Belgium?",
            "Antwerp",
            "Ghent",
            "Brussels",
            "Bruges",
            3)

        val que34 = Question(34,
            "Which city is the capital of Portugal?",
            "Porto",
            "Coimbra",
            "Lisbon",
            "Faro",
            3)

        val que35 = Question(35,
            "What is the capital of Austria?",
            "Graz",
            "Salzburg",
            "Vienna",
            "Linz",
            3)

        val que36 = Question(36,
            "Which city serves as the capital of Switzerland?",
            "Geneva",
            "Zurich",
            "Bern",
            "Basel",
            3)

        val que37 = Question(37,
            "What is the capital city of Denmark?",
            "Aarhus",
            "Odense",
            "Copenhagen",
            "Aalborg",
            3)

        val que38 = Question(38,
            "Which city is the capital of Finland?",
            "Tampere",
            "Turku",
            "Helsinki",
            "Oulu",
            3)

        val que39 = Question(39,
            "What is the capital of Norway?",
            "Bergen",
            "Stavanger",
            "Oslo",
            "Trondheim",
            3)

        val que40 = Question(40,
            "Which city serves as the capital of New Zealand?",
            "Christchurch",
            "Wellington",
            "Auckland",
            "Hamilton",
            2)


        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)
        questionsList.add(que11)
        questionsList.add(que12)
        questionsList.add(que13)
        questionsList.add(que14)
        questionsList.add(que15)
        questionsList.add(que16)
        questionsList.add(que17)
        questionsList.add(que18)
        questionsList.add(que19)
        questionsList.add(que20)
        questionsList.add(que21)
        questionsList.add(que22)
        questionsList.add(que23)
        questionsList.add(que24)
        questionsList.add(que25)
        questionsList.add(que26)
        questionsList.add(que27)
        questionsList.add(que28)
        questionsList.add(que29)
        questionsList.add(que30)
        questionsList.add(que31)
        questionsList.add(que32)
        questionsList.add(que33)
        questionsList.add(que34)
        questionsList.add(que35)
        questionsList.add(que36)
        questionsList.add(que37)
        questionsList.add(que38)
        questionsList.add(que39)
        questionsList.add(que40)

        return questionsList
    }
}
