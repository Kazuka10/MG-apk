package com.example.mkorpal.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mkorpal.myapplication.Wypozyczenie.WypozyczenieActivity;
import com.example.mkorpal.myapplication.Zwrot.ZwrotActivity;
import com.example.mkorpal.myapplication.przyjecie.PrzyjecieActivity;

public class ekranglowny extends AppCompatActivity {


    Button button2;                 //1 pobieranie uzytkownikow
    Button button3;               //2 usuwanie baz
    Button button4;             //3 ADMINISTROWANIE HASLEM
    Button button5;         //4 utsawienia terminala
    Button button6;         //5 klawiatura ekrnaowa
    Button button7;        // 6 webtransfer
    Button button8;     //7 slowniki
    Button button9;     //8 inwentaryzacja
    Button button10; //9 przyjecie
    Button button11;        //10 wypozyczenie
    Button button12;        //11 Zwrot
   public Button button13;        //12 Wydanie



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elramglowny);


        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        button10 = (Button)findViewById(R.id.button10);
        button11 = (Button)findViewById(R.id.button11);  //wypozyczenie
        button12 = (Button)findViewById(R.id.button12); // Zwrot
        button13 = (Button)findViewById(R.id.button13); // Wydanie
     //  button13.setOnClickListener(this);
 /*       button12.setOnClickListener(btnListener);
        button11.setOnClickListener(btnListener);
        button10.setOnClickListener(btnListener);
        button9.setOnClickListener(btnListener);
        button8.setOnClickListener(btnListener);
        button7.setOnClickListener(btnListener);
        button6.setOnClickListener(btnListener);
        button5.setOnClickListener(btnListener);
        button4.setOnClickListener(btnListener);
        button3.setOnClickListener(btnListener);
        button2.setOnClickListener(btnListener);//klijkuhkjuhkjuihj*/

    }
  /* public void onButtonClick(View v)
   {

       if(v.getId()==R.id.button13)
       {
           Intent i = new Intent(ekranglowny.this,PrzyjecieActivity.class);
            startActivity(i);
       }

   }*/



    public void WydanieStart(View v){
        switch (v.getId()) {
            case R.id.button13: {    //WypozyczenieActivity - menu glowne Wydanie
                Intent intent = new Intent(ekranglowny.this,WydanieActivity.class);
                startActivity(intent);
                //FUNCKJA OTWIERANIA MENU WYDANIE
                break;
            }
            case R.id.button12:
            {
                   Intent intent = new Intent(ekranglowny.this,ZwrotActivity.class);
                   startActivity(intent);
                //FUNCKJA OTWIERANIA MENU zwrot
                break;
            }
            case R.id.button11:
            {
                Intent intent = new Intent(ekranglowny.this,WypozyczenieActivity.class);
                startActivity(intent);
                //FUNCKJA OTWIERANIA MENU wypozyczenie
                break;
            }

            case R.id.button10:
            {
                Intent intent = new Intent(ekranglowny.this,PrzyjecieActivity.class);
                startActivity(intent);
                //FUNCKJA OTWIERANIA MENU przyjecie
                break;
            }
            case R.id.button9:
            {
                //FUNCKJA OTWIERANIA MENU inwentaryzacja
                break;
            }
            case R.id.button8:
            {
                //FUNCKJA OTWIERANIA MENU slowniki
                break;
            }
            case R.id.button7:
            {
                Intent intent = new Intent(ekranglowny.this,Webtransfer_opcje.class);
                startActivity(intent);
                //FUNCKJA OTWIERANIA MENU webtransfer
                break;
            }
            case R.id.button6:
            {
                //FUNCKJA OTWIERANIA MENU klawiatura ekranowa
                break;
            }
            case R.id.button5:
            {
                //FUNCKJA OTWIERANIA MENU ustawienia terminala
                break;
            }
            case R.id.button4:
            {
                //FUNCKJA OTWIERANIA MENU administrowanie hasłem
                break;
            }
            case R.id.button3:
            {
                //FUNCKJA OTWIERANIA MENU usuwanie baz
                break;
            }
            case R.id.button2:
            {
                //FUNCKJA OTWIERANIA MENU pobieranie użytkowników
                break;
            }
        }


    }


/*private View.OnClickListener btnListener = new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button13: {    //PrzyjecieActivity - menu glowne Wydanie
                Intent intent = new Intent(ekranglowny.this,PrzyjecieActivity.class);
                startActivity(intent);
                //FUNCKJA OTWIERANIA MENU WYDANIE
                break;
            }
            case R.id.button12:
            {
                //FUNCKJA OTWIERANIA MENU zwrot
            }
            case R.id.button11:
            {
                //FUNCKJA OTWIERANIA MENU wypozyczenie
                break;
            }

            case R.id.button10:
            {
                //FUNCKJA OTWIERANIA MENU przyjecie
                break;
            }
            case R.id.button9:
            {
                //FUNCKJA OTWIERANIA MENU inwentaryzacja
                break;
            }
            case R.id.button8:
            {
                //FUNCKJA OTWIERANIA MENU slowniki
                break;
            }
            case R.id.button7:
            {
                //FUNCKJA OTWIERANIA MENU webtransfer
                break;
            }
            case R.id.button6:
            {
                //FUNCKJA OTWIERANIA MENU klawiatura ekranowa
                break;
            }
            case R.id.button5:
            {
                //FUNCKJA OTWIERANIA MENU ustawienia terminala
                break;
            }
            case R.id.button4:
            {
                //FUNCKJA OTWIERANIA MENU administrowanie hasłem
                break;
            }
            case R.id.button3:
            {
                //FUNCKJA OTWIERANIA MENU usuwanie baz
                break;
            }
            case R.id.button2:
            {
                //FUNCKJA OTWIERANIA MENU pobieranie użytkowników
                break;
            }
        }

    }
};
*/



}