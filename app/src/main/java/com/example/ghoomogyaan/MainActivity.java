package com.example.ghoomogyaan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ghoomogyaan.Adapter.TopPlacesAdapter;
import com.example.ghoomogyaan.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView topPlacesRecycler;

    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<TopPlacesData> topPlacesDataList = new ArrayList<>();

        topPlacesDataList.add(new TopPlacesData("Shaniwar Wada", "Pune", "5-125 Rs", R.drawable.shanivar_wada,"Shaniwar Wada is a historical fortification in the city of Pune, India.Built in 1732, it was the great seat of the Peshwas of the Maratha Empire until 1818. Following the rise of the Maratha Empire, the palace became the center of Indian politics in the 18th century.\n" +
                "\n" +
                "The fort itself was largely destroyed in 1828 by an unexplained fire, but the surviving structures are now maintained as a tourist site.\n \nThe Shaniwar Wada was normally the seven-story capital building of the Peshwas of the Maratha Empire. It was supposed to be made entirely of stone. However, after the completion of the base floor or the first story, the people of Satara (the national capital) complained to the Chhatrapati Shahu I (Emperor) saying that a stone monument can be sanctioned and built only by the emperor himself and not the Peshwas. Following this, an official letter was written to the Peshwas stating that the remaining building had to be made of brick and not stone.",R.drawable.shaniwar_wada_bg));


        topPlacesDataList.add(new TopPlacesData("Saras Baug", "Pune", "Free Rs", R.drawable.sarasbag,"Sarasbaug is a major landmark in the city of Pune in India. The place where the park now stands was once occupied by a small lake. However, the lake dried up and was later developed into Sarasbaug. The whole 25-acre (10 ha) complex is known as Sarasbaug. The Ganesh temple in Saras Baug is also known as Talyatla Ganapati (in Marathi:तळ्यातला गणपती ) which translates as the Ganapati of the lake.\n \n The Construction of the Temple started in 1750 under the direction of Naansaheb Peshwe, the de facto head of the Maratha confederacy. The construction of the temple was completed in 1784 with the idol of Hindu Lord Ganesh in the temple. The temple was built in the lake near the Parvati Temple, which was also the primary residence of the Peshwa family. The inscription in the temple reads:\n" +
                "\n" +
                "|| देवदेवेश्वर सुतं देवं | सारासोद्यान भूषणं ||\n" +
                "|| कल्पद्रुमां त्वां भक्तानां | वन्दे सिद्धीविनायकं ||",R.drawable.saras_baug_bg));


        topPlacesDataList.add(new TopPlacesData("Dagdushet Halwai", "Pune", "Free", R.drawable.dagdushet,"The Dagadusheth Halwai Ganapati temple is a Hindu Temple located in Pune and is dedicated to the Hindu god Ganesh. The temple is visited by over hundred thousand pilgrims every year.Devotees of the temple include celebrities and chief ministers of Maharashtra who visit during the annual ten-day Ganeshotsav festival. The main Ganesh idol is insured for sum of ₹10 million (US$130,000). It celebrated 130 years of its Ganapati in 2022 \n \nLater, as they did not have any heir, Dagdusheth adopted his nephew Govindsheth (born 1865) who was 9 years old at the time of their death. Govindsheth was born in 1891 in Pune. He replaced the first Ganesh idol by a new one, with the first one still being present at Akra Maruti Chowk. A kind-hearted and generous man, he established one more Ganesh idol in wrestlers training center, which is called Jagoba Dada Talim. This talim was owned by Dagdusheth as he was also a former wrestling trainer. One of the chowk (area) in Pune is named Govind Halwai Chowk, after him. Along with his mother, Govindsheth handled all the programmes like Ganesh Utsav, Datta Jayanti and other festivities.\nLaxmi Road in Pune is named after Laxmibai Dagdusheth halwai.",R.drawable.dagdusheth_halwai_bg));


        topPlacesDataList.add(new TopPlacesData("Sinhagad Fort", "Pune", "Free", R.drawable.sinhagad,"Sinhagad is an ancient hill fortress located at around 49 km southwest of the city of Pune, India.Previously known as Kondhana, the fort had been the site of many battles, most notably the Battle of Sinhagad in 1670. It is located in the Pune district in Maharashtra. The fort is also on the famous fort in Maharashtra which has a great history of Tanaji Malusare. The fort was captured by Tanaji Malusare and his brother \n \nSinhagad (Lion's Fort) fort was strategically built to provide natural protection from the enemies due to its very steep slopes. The walls of the forts and bastions were constructed only at key places. There are two gates to enter the fort named Kalyan Darwaja and Pune Darwaza. The Kalyan Darwaja is towards the southeast while the Pune Darwaza is towards north east. The fort is surrounded by several other forts, and was known as the control center of the Maratha Empire. In clear weather, Rajgad, Purandar and Torna forts can be seen from the Sinhagad killa.",R.drawable.sinhgad_bg));


        topPlacesDataList.add(new TopPlacesData("Rajiv Gandhi Zoological Park", "Pune", "100 Rs", R.drawable.rajiv_gandhi_garden,"The Rajiv Gandhi Zoological Park, commonly known as the Rajiv Gandhi Zoo or Katraj Zoo, is located in Katraj, Pune district, Maharashtra State, India. It is managed by the Pune Municipal Corporation. The 130-acre (53 ha) zoo is divided into three parts: an animal orphanage, a snake park, and a zoo, and includes the 42-acre (17 ha) Katraj Lake.\n \nIn 1953 the Pune Municipal Corporation created Peshwe Park on about 7 acres (2.8 ha) where Madhavrao Peshwe had established a private menagerie in 1770. Located in the heart of the city at the base of Parvati Hill, this zoo exhibited animals in traditional cages.\n \nIn 2004, Mr. Neelam Kumar Khaire (the first director of the park), with assistance from the Pune Municipal Corporation, created the Katraj Snake Park on land that was to become the Rajiv Gandhi Zoological Park\n \nThe zoo has a collection of reptiles, mammals, and birds. Among mammals, the zoo had a white tiger and has a male Bengal tiger named Tanaji. Other mammals at the zoo include leopard, sloth bears, sambhars, barking deer, blackbucks, monkeys, and elephants. Reptiles include Indian rock python, cobra, snakes, vipers, Indian crocodiles and Indian star tortoise and birds such as peafowl also feature.",R.drawable.rajiv_gandhi_park_bg));


        topPlacesDataList.add(new TopPlacesData("Laal Mahal", "Pune", "5 Rs", R.drawable.lal_mahal,"In the year 1630 AD, Shivaji's Father Shahaji, established the Lal Mahal for his wife Jijabai and son.Chhatrapati Shivaji Maharaj stayed here for many years till he captured the first fort. The current Lal Mahal is a reconstruction of the original and located in the center of the Pune city. The original Lal Mahal was built with the idea of rejuvenating the recently razed city of Pune when Shahaji Raje entered the city along with Shivaji and his mother, Maasaheb Jijabai. Young Shivaji grew up here, and stayed in the Lal Mahal till he captured the Torna fort in 1645. Shivaji's marriage with his first wife, Saibai took place in Lal Mahal on 16 May 1640.\n" +
                "\n" +
                "The Lal Mahal is also famous for an encounter between Shivaji and Shaista Khan where Shivaji cut off the latter's fingers when he was trying to escape from the window of the Lal Mahal.This was part of a surreptitious guerrilla attack on the massive and entrenched Mughal Army that had camped in Pune, with Shaista occupying (possibly symbolically) Shivaji's childhood home. As a punishment for the ignominy of the defeat despite superior numbers and better armed and fed soldiers, Shaista was transferred by the Mughal Emperor Aurangzeb to Bengal. ",R.drawable.lal_mahal_bg));


        topPlacesDataList.add(new TopPlacesData("Okayama Friendship Garden", "Pune", "5 Rs", R.drawable.okayama_friendship_garden,"Welcome to the Japanese Garden in Pune. One of its kinds, the Pune Okayama Friendship Garden is the largest Japanese garden outside of Japan, in Asia. Also called the Pu. La. Deshpande Udyan, it was named after the famous Marathi writer and humorist, Pu La Deshpande who received the Padma Bhushan in 1990. This garden reflects on the Indo-Japanese relationship, as it is inspired by the 300-year old Okayama Korakuen Garden in Japan.\n" +
                "\n" +
                "Located on Sinhagad Road in Dattawadi, this park offers the perfect blend between nature and concrete, with a natural canal passing through the garden whilst having man-made ponds and waterfalls. Right from lush green plants, Pergolas to sit at and lawns,beautiful flowers and the artificial hills, this garden has everything that will take your breath away. Visitors come here to take a stroll after a stressful day or even better, plan a trip to this garden to explore the wide variety of flora. The garden perfectly resembles the Japanese Yin and Yang theory, laying emphasis on motion and stillness, light and darkness, warmth and cold, representing the authentic Japanese culture.",R.drawable.pu_la_deshpande_garden_bg));


        topPlacesDataList.add(new TopPlacesData("Aga Khan Palace", "Pune", "2-100 Rs", R.drawable.aga_khan_palace,"Located on the Nagar Road, at a distance of 2 km from the Bund garden, Aga Khan Palace is a one of the popular tourist spots in Pune. This palace was built in 1892 by Sultan Mohammad shah Aga khan, primarily to help famine affected people in Maharashtra. This palace, which is spread across an area of 1756 sq. meters, took 5 years for its completion.\n" +
                "\n" +
                "Aga Khan Palace, Pune is known for its memorials of Kasturba Gandhi, who was the wife of Mahatma Gandhi and Mahadev Desai, a close associate of Mahatma Gandhi. Apparently both of them had breathed their last in the premises of this palace. In the honour of them, their memorials have been built inside the palace ground. The world famous architect Charles Correa had designed the memorials.\n" +
                "\n" +
                "Aga Khan Palace also mesmerizes its visitors with beautiful spacious lawns. Comprising of five halls, its Italian arches leave you awestruck. It has two floors, first floor is about 1080 sq. meters while the second floor is of 445 sq. meters. The corridor of 2.5 meters is spread around the entire building.\n" +
                "\n" ,R.drawable.aga_khan_palace_bg));


        topPlacesDataList.add(new TopPlacesData("The Empress Garden", "Pune", "20 Rs", R.drawable.empress_garden,"Empress Botanical Garden in Pune. It is a 182-year-old garden blessed with the most beautiful collection of flora that is a delight for sore eyes. This old garden's fresh air and serene beauty provide you with a rejuvenating experience.The Empress Botanical Garden is a popular tourist spot in Pune that will surely make you one.\n" +
                "\n" +
                "The gorgeous tall trees and the excellent foliage make you wonder about its history and how it has thrived and survived for more than a century. Take a break from the concrete monuments and quaint cafes and visit the Empress Botanical Garden to enjoy the calmness.\n" +
                "\n" +
                "The Empress Botanical Garden is spread over an area of 39 acres. It is named after Queen Victoria who visited the garden when she held the royal mace.\n" +
                "\n" +
                "#Trivia: The Empress Botanical Garden is also called the Soldiers Garden as the British officials loved it. They used to spend their leisure time here often.",R.drawable.empress_garden_bg));



        topPlacesDataList.add(new TopPlacesData("Khadakwasla Dam","Pune","Free",R.drawable.khadakvasla_dam,"Khadakwasla Dam is a dam on the Mutha River 21 km (13 mi) from the centre of the city of Pune in Maharashtra, India. The dam created a reservoir known as Khadakwasla Lake which is the main source of water for Pune and its suburbs.\n \nKhadakwasla Dam is an ideal spot for a quick weekend getaway. This breezy and misty place with greenery all around provides the much-needed rest from the city life and an environment to feel rejuvenated.\n \nMost travellers and people from Pune visit the place to watch the magnificent sunrise and sunset by the lake. From Khadakwasla Dam sunset point, you can get an elegant view of the golden sky and the evening sun setting behind the trees. You can also capture some stunning pictures during these hours.\n \nYou'll find various scenic tourist attractions near the dam. Neelakantheswar Temple, Peacock Bay and Kudje village are few of those places near Khadakwasla Dam side. The area around Khadakwasla Dam tourist spot offers camping options too. Trekking opportunities are also available near the dam. So, take a tent and set up your camp by the water. If you visit Panshet Dam nearby, you can also enjoy water sports.",R.drawable.khadakvasla_dam_bg));


        setTopPlacesRecycler(topPlacesDataList);

    }


    private void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList) {
        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);


    }
}