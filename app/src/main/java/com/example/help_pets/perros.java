package com.example.help_pets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class perros extends AppCompatActivity {


    private TextView tv1,tv2,tv3,descripcion,sintomas,cuidado;
    private  Button ep1,ep2;
/*

    private  String enfermedades [] = {"Parviovirus","Moquillo","Artrosis","Otitis","Leishmaniosis","Gusano del corazon","Tos de las perreras","Problemas urinarios","Problemas digestivos",
            "Problemas de piel","Hepatitis","Rabia"};
*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perros);

        ep1 = (Button)findViewById(R.id.ep1);
        ep2 = (Button)findViewById(R.id.ep2);

        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        descripcion = (TextView)findViewById(R.id.Descripcion);
        sintomas = (TextView)findViewById(R.id.Sintomas);
        cuidado = (TextView)findViewById(R.id.Cuidado);


       /* ver1 = (Button)findViewById(R.id.botonver);
        ver2 = (Button)findViewById(R.id.botonver2);*/
        //nover = (EditText) findViewById(R.id.botonnover);
        //nover2 = (EditText) findViewById(R.id.botonnover2);


/*

        lv1 = (ListView)findViewById(R.id.lvperros);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,enfermedades);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(lv1.getAdapter(position)=="Parviovirus") {
                    tv1.setVisibility(View.VISIBLE);
                    tv2.setVisibility(View.VISIBLE);
                }
            }
        });*/

    }


    public void ep1(View view){
        descripcion.setVisibility(View.VISIBLE);
        sintomas.setVisibility(View.VISIBLE);
        cuidado.setVisibility(View.VISIBLE);
        tv1.setText("Es una enfermedad infecciosa, de tipo vírica, grave y potencialmente letal." +
                "ante cualquier sospecha de tener esta enfermedad es imprescindible acudir de forma inmediata al centro veterinario mas cercano." +
                "Algunas razas de perro como el Rottweiler son mas propensos a contraer esta enfermedad.\n" +
                "El Parvovirus se contagia mediante contacto oral/nasal directo de un perro infectado a otro perro," +
                " a través de las heces de perros infectados con el canino\n" +
                "Es considerado un virus muy contagioso y tiene un periodo de incubación corto (entre cinco y diez días)");

        tv2.setText("Esta enfermedad por lo general ataca al tejido linfatico e intastinal. Los principales sintomas que produce esta enfermedad son:\n" +
                "Diarrea (que suele ir acompañada de hemorragia)\n" +
                "Vómitos\n" +
                "Fiebre\n" +
                "Falta de apetito y decaimiento.\n" +
                "Apatía y/o letargo.\n" +
                "Depresión\n" +
                "Pérdida de peso.\n" +
                "Dolor a la palpación de abdomen.\n" +
                "En casos más graves, deshidratación (más o menos severa, ya que el virus afecta al tracto intestinal) y muerte del paciente.");

        tv3.setText("");
    }
    public void ep2(View view){
        descripcion.setVisibility(View.VISIBLE);
        sintomas.setVisibility(View.VISIBLE);
        cuidado.setVisibility(View.VISIBLE);
        tv1.setText(" dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd");
        tv2.setText(" dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd\n" +
                "        dashdioasjdasjlkdjaslkdjlaskjdsajdasd");
    }


}