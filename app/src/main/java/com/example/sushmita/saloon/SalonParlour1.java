package com.example.sushmita.saloon;
/**
 * Sushmita Shrestha -2019445
 */

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class SalonParlour1 extends AppCompatActivity {

    int time,date;

    TextView datepicker;
    int year_x,month_x,day_x;
    static final int DILOG_ID = 0;


    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;
    CheckBox checkBox6;
    CheckBox checkBox7;
    CheckBox checkBox8;
    CheckBox checkBox9;
    CheckBox checkBox10;
    CheckBox checkBox11;
    CheckBox checkBox12;
    CheckBox checkBox13;
    int temp;
    Button button;

    TextView timepicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salon_parlour1);

        datepicker = findViewById(R.id.datepicker);

        final Calendar calendar = Calendar.getInstance();
        year_x = calendar.get(Calendar.YEAR);
        month_x = calendar.get(Calendar.MONTH);
        day_x = calendar.get(Calendar.DAY_OF_MONTH);

        button = findViewById(R.id.pay);

        checkBox1 = findViewById(R.id.chk1);
        checkBox2 = findViewById(R.id.chk2);
        checkBox3 = findViewById(R.id.chk3);
        checkBox4 = findViewById(R.id.chk4);
        checkBox5 = findViewById(R.id.chk5);
        checkBox6 = findViewById(R.id.chk6);
        checkBox7 = findViewById(R.id.chk7);
        checkBox8 = findViewById(R.id.chk8);
        checkBox9 = findViewById(R.id.chk9);
        checkBox10 = findViewById(R.id.chk10);
        checkBox11 = findViewById(R.id.chk11);
        checkBox12 = findViewById(R.id.chk12);
        checkBox13 = findViewById(R.id.chk13);





        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox1.isChecked())
                {
                    temp += 50;
                    button.setBackgroundResource(R.drawable.greenshape);
                    button.setText("Pay  " + temp);
                }
                else {
                    temp -= 50;
                    button.setText("Pay  " + temp);
                }
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(checkBox2.isChecked())
                {
                    temp += 15;
                    button.setBackgroundResource(R.drawable.greenshape);
                    button.setText("Pay  " + temp);
                }
                else {
                    temp -= 15;
                    button.setText("Pay  " + temp);
                }
            }
        });

        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(checkBox3.isChecked())
                {
                    temp += 25;
                    button.setBackgroundResource(R.drawable.greenshape);
                    button.setText("Pay  " + temp);
                }
                else {
                    temp -= 25;
                    button.setText("Pay  " + temp);
                }
            }
        });

        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox4.isChecked())
                {
                    temp += 30;
                    button.setBackgroundResource(R.drawable.greenshape);
                    button.setText("Pay  " + temp);
                }
                else {
                    temp -= 30;
                    button.setText("Pay  " + temp);
                }
            }
        });

        checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox5.isChecked())
                {
                    temp += 140;
                    button.setBackgroundResource(R.drawable.greenshape);
                    button.setText("Pay  " + temp);
                }
                else {
                    temp -= 140;
                    button.setText("Pay  " + temp);
                }
            }
        });

        checkBox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox6.isChecked())
                {
                    temp += 200;
                    button.setBackgroundResource(R.drawable.greenshape);
                    button.setText("Pay  " + temp);
                }
                else {
                    temp -= 200;
                    button.setText("Pay  " + temp);
                }
            }
        });

        checkBox7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox7.isChecked())
                {
                    temp += 80;
                    button.setBackgroundResource(R.drawable.greenshape);
                    button.setText("Pay  " + temp);
                }
                else {
                    temp -= 80;
                    button.setText("Pay  " + temp);
                }
            }
        });

        checkBox8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox8.isChecked())
                {
                    temp += 90;
                    button.setBackgroundResource(R.drawable.greenshape);
                    button.setText("Pay  " + temp);
                }
                else {
                    temp -= 90;
                    button.setText("Pay  " + temp);
                }
            }
        });

        checkBox9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox9.isChecked())
                {
                    temp += 100;
                    button.setBackgroundResource(R.drawable.greenshape);
                    button.setText("Pay  " + temp);
                }
                else {
                    temp -= 100;
                    button.setText("Pay  " + temp);
                }
            }
        });

        checkBox10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox10.isChecked())
                {
                    temp += 35;
                    button.setBackgroundResource(R.drawable.greenshape);
                    button.setText("Pay  " + temp);
                }
                else {
                    temp -= 35;
                    button.setText("Pay  " + temp);
                }
            }
        });

        checkBox11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox11.isChecked())
                {
                    temp += 500;
                    button.setBackgroundResource(R.drawable.greenshape);
                    button.setText("Pay  " + temp);
                }
                else {
                    temp -= 500;
                    button.setText("Pay  " + temp);
                }
            }
        });


        checkBox12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox12.isChecked())
                {
                    temp += 100;
                    button.setBackgroundResource(R.drawable.greenshape);
                    button.setText("Pay  " + temp);
                }
                else {
                    temp -= 100;
                    button.setText("Pay  " + temp);
                }
            }
        });

        checkBox13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox13.isChecked())
                {
                    temp += 200;
                    button.setBackgroundResource(R.drawable.greenshape);
                    button.setText("Pay  " + temp);
                }
                else {
                    temp -= 200;
                    button.setText("Pay  " + temp);
                }
            }
        });

        timepicker = findViewById(R.id.timePicker);
        timepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Calendar mcurrentTime = Calendar.getInstance();
                final int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(SalonParlour1.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {

                        if(selectedHour <= 9 || selectedHour >= 21)
                        {
                            Toast.makeText(SalonParlour1.this, "Please select valid time", Toast.LENGTH_SHORT).show();

                        }else {

                            timepicker.setText(selectedHour + " : " + selectedMinute);
                            time = 1;
                        }
                    }
                }, hour, minute,false);
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });
    }


    public void pay(View view)
    {
        AlertDialog.Builder ab = new AlertDialog.Builder(this);
        ab.setTitle("PAYMENT  !!");
        ab.setIcon(R.drawable.ic_launcher_background);
        ab.setMessage("Do you want to pay  " + temp);
        ab.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                if(temp == 0)
                {
                    Toast.makeText(SalonParlour1.this, "Please select any services", Toast.LENGTH_SHORT).show();
                }
                else if (time == 0){
                    Toast.makeText(SalonParlour1.this, "Please select time", Toast.LENGTH_SHORT).show();
                }
                else if(date == 0){
                    Toast.makeText(SalonParlour1.this, "Please select Date", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i = new Intent(SalonParlour1.this, FeePaymentActivity.class);
                    startActivity(i);
                }
            }
        });
        ab.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(SalonParlour1.this, "Did you change your mind", Toast.LENGTH_SHORT).show();
            }
        });
        ab.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(SalonParlour1.this, "Do you wanna more services", Toast.LENGTH_SHORT).show();
            }
        });
        LayoutInflater inflater = getLayoutInflater();
        View v = inflater.inflate(R.layout.dialogue_box_helper,null);
        ab.setView(v);
        ab.setCancelable(false);
        ab.show();
    }

    //Date picker has 3 functionality
    public void showDialogOnclick(View view)
    {

        datepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DILOG_ID);
            }
        });

    }

    @Override
    protected Dialog onCreateDialog(int id)
    {
        if (id == DILOG_ID)
        {
            DatePickerDialog _date = new DatePickerDialog(this, dpickerListner, year_x,month_x,day_x){
                @Override
                public void onDateChanged(@NonNull DatePicker view, int year, int month, int dayOfMonth) {
                    super.onDateChanged(view, year, month, dayOfMonth);

                    if(year < year_x)
                    {
                        view.updateDate(year_x, month_x,day_x);
                    }
                    if(month < month_x  && year == year_x)
                    {
                        view.updateDate(year_x,month_x,day_x);
                    }
                    if(dayOfMonth < day_x && year == year_x && month == month_x)
                    {
                        view.updateDate(year_x,month_x,day_x);
                    }

                }
            };
            return _date;
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener dpickerListner = new DatePickerDialog.OnDateSetListener() {
        @SuppressLint("SetTextI18n")
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

            year_x = year;
            month_x = month + 1;
            day_x = dayOfMonth;

            datepicker.setText(day_x + " / "+month_x+" / "+year_x);
            date = 1;
        }
    };
}
