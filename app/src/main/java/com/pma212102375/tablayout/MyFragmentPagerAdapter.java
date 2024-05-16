package com.pma212102375.tablayout;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter
{
    private BeritaFragment _beritafragment = new BeritaFragment();
    private Context _context;
    private ECommerceFragment _eCommercefragment = new ECommerceFragment();
    private int _tabCount;
    private KampusFragment _kampusfragment = new KampusFragment();

    public MyFragmentPagerAdapter(Context context, FragmentManager fragmentManager, int tabCount)
    {
        super(fragmentManager);

        _context = context;
        _tabCount = tabCount;
    }
    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return _eCommercefragment;
            case 1:
                return _beritafragment;
            case 2:
                return _kampusfragment;
        }
        return null;
    }

    @Override
    public int getCount()
    {
       return _tabCount;
    }
}
