package io.loqee.retro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager;
    List<Retro> retros = new ArrayList<>();
    OnBoardingAdapter onBoardingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        initData();
        onBoardingAdapter = new OnBoardingAdapter(retros);
        viewPager.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
        viewPager.setAdapter(onBoardingAdapter);
    }

    private void initData() {
        Retro retro = new Retro("MS-DOS", "Microsoft Disk Operating System, also known as Microsoft DOS " +
                "is an operating system for x86-based personal computers mostly developed by Microsoft.", R.drawable.msdos);
        retros.add(retro);
        retro = new Retro("System 1", "The Macintosh \"System 1\" is the first version of Apple Macintosh " +
                "operating system and the beginning of the classic Mac OS series.", R.drawable.apple);
        retros.add(retro);
        retro = new Retro("AmigaOS", "AmigaOS is a family of proprietary native operating systems of the Amiga and AmigaOne personal computers. " +
                "It was developed first by Commodore International and introduced with the launch of the first Amiga, the Amiga 1000, in 1985.", R.drawable.amigaos);
        retros.add(retro);
    }
}