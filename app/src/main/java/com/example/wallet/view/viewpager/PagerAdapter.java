package com.example.wallet.view.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.wallet.view.fragments.StateFragment;
import com.example.wallet.view.fragments.InputFragment;
import com.example.wallet.view.fragments.ListFragment;
import com.example.wallet.view.fragments.ProfileFragment;

public class PagerAdapter extends FragmentPagerAdapter {


    private static final int item_coutn =  4;
    public static final int FRAGMENT_1 = 0;
    public static final int FRAGMENT_2= 1;
    public  static final int FRAGMENT_3  = 2;
    public static final int FRAGMENT_4 = 3;



    public PagerAdapter(@NonNull FragmentManager fm){
        super(fm  , BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        Fragment fragment;
        switch (position){
            case FRAGMENT_4: fragment = new ProfileFragment();   break;
            case FRAGMENT_3: fragment = new ListFragment(); break;
            case FRAGMENT_2: fragment = new InputFragment(); break;

            default:
                fragment = new StateFragment(); break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return item_coutn;
    }



}
