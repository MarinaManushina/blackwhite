package com.example.blackwhite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] listOfProducts = {"Ратаффия", "Кальвадос", "Лимончело", "Чоколайтер", "Морозная вишня", "Блюкюрасай"};

        ListView listView = findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listOfProducts);
        listView.setAdapter(adapter);

        String rataff = "Ратафию ещё по-другому называют «сладкой водкой», хотя по сути своей она ближе к настойке. Ратафия — это напиток высшей крепости, 40-45 градусов, настаиваемый на фруктах и ягодах. И все же от настоек ратафию отличает не такая высокая сладость.";

        String kalv = "Кальвадо́с (фр. Calvados) — яблочный или грушевый бренди, получаемый путём перегонки сидра, из французского региона. Нижняя Нормандия. Крепость — около 40 % об.";

        String lemonchello = "limoncello – это уменьшительное от «лимон» – «лимончик»./n"+
                "Так ласково и немножко снисходительно жители юга Италии называют сладкий алкогольный напиток";

        String choko = "Чоколайтер - изысканный коньячно-шоколадный дижестив \n"+
                " созданный на основе высококачественных коньячных спиртов \n"+
                " в сочетании с натуральными экстрактами шоколада, кофе и пряностей.";

        String FrCherry = "Зимняя вишня - это сливочно-сладкий коктейль на основе джина. \n" +
                " Ягодные нотки вишни в этом коктейле в сочетании с сахарным сиропом и джином \n" +
                " создают совершенно сладкий и освежающий коктейль.";

        String bluek = "Блюкюраса́о — ароматный ликёр \n" +
                " вырабатываемый из винного спирта с добавлением высушенной апельсиновой корки, мускатного ореха, гвоздики и корицы. Может быть оранжевым, голубым, зеленоватым либо бесцветным.";
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                switch(i) {
                    case 0:
                        intent.putExtra("key", rataff);
                        intent.putExtra("key1", "Ратафия");
                        break;
                    case 1:
                        intent.putExtra("key", kalv);
                        intent.putExtra("key1", "Кальвадос");
                        break;
                    case 2:
                        intent.putExtra("key", lemonchello);
                        intent.putExtra("key1", "Лимончелло");
                        break;
                    case 3:
                        intent.putExtra("key", choko);
                        intent.putExtra("key1", "Чоколайтер");
                        break;
                    case 4:
                        intent.putExtra("key", FrCherry);
                        intent.putExtra("key1", "Морозная Вишня");
                        break;
                    case 5:
                        intent.putExtra("key", bluek);
                        intent.putExtra("key1", "Блюкюрасао");
                        break;
                }
                startActivity(intent);

            }

        });
    }
}