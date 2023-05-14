package com.msaggik.fifthlessonanimalhandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {


    List<Planet> animals = new ArrayList<Planet>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.list_animal);


        PlanetAdapter adapter = new PlanetAdapter(this, animals);


        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        animals.add( new Planet("Меркурий", "наименьшая планета Солнечной системы и самая близкая к Солнцу. Названа в честь древнеримского бога торговли — быстрого Меркурия, поскольку она движется по небу быстрее других планет",
                R.drawable.merkuri, "Спутников 0"));
        animals.add(new Planet("Венера", " вторая по удалённости от Солнца и шестая по размеру планета Солнечной системы, названа в честь древнеримской богини любви Венеры",
                R.drawable.venera, "Спутников 0"));
        animals.add( new Planet("Земля", "третья по удалённости от Солнца планета Солнечной системы, единственное известное человеку в настоящее время тело во Вселенной, населённое живыми организмами",
                R.drawable.zemla, "Спутников 1"));
        animals.add( new Planet("Марс", "Четвёртая по удалённости от Солнца и седьмая по размеру планета Солнечной системы",
                R.drawable.mars, "Спутника 2"));
        animals.add( new Planet("Юпитер", "Пятая планета от Солнца и самая большая в Солнечной системе. Это газовый гигант с массой, более чем в два с половиной раза превышающей массу всех других планет Солнечной системы",
                R.drawable.ypiter, "Спутников 95"));
        animals.add( new Planet("Сатурн", "Газовый гигант, состоящий преимущественно из водорода и гелия",
                R.drawable.satyrn, "Спутника 63"));
        animals.add( new Planet("Уран", "Планета Солнечной системы, седьмая по удалённости от Солнца, третья по диаметру и четвёртая по массе.",
                R.drawable.yran, "Cпутников 27"));
        animals.add( new Planet("Нептун", "Восьмая и самая дальняя от Солнца планета Солнечной системы. Его масса превышает массу Земли в 17,2 раза",
                R.drawable.neptyn, "Спутников 14"));
    }
}