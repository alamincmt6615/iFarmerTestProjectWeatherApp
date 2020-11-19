package alamin.iFarmer.TestProjectWeather.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import alamin.iFarmer.TestProjectWeather.util.DayManager;
import alamin.iFarmer.TestProjectWeather.core.network.dto.FiveDaysCityDTO;
import alamin.iFarmer.TestProjectWeather.ui.dashboard.DayDetailsListFragment;

import java.util.List;


public class DayDetailsPagerAdapter extends FragmentStatePagerAdapter {

    private DayManager dayManager;

    public DayDetailsPagerAdapter(FragmentManager fm, List<FiveDaysCityDTO> dayDetails) {
        super(fm);

        dayManager = new DayManager(dayDetails, DayManager.NO_SHORT);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return DayDetailsListFragment.newInstance(dayManager.getToday());

            case 1:
                return DayDetailsListFragment.newInstance(dayManager.getTomorrow());

            case 2:
                return DayDetailsListFragment.newInstance(dayManager.getSecondDay());

            case 3:
                return DayDetailsListFragment.newInstance(dayManager.getThirdDay());

            case 4:
                return DayDetailsListFragment.newInstance(dayManager.getFourthDay());

            default:
                return new Fragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return dayManager.getToday().getDayName();

            case 1:
                return dayManager.getTomorrow().getDayName();

            case 2:
                return dayManager.getSecondDay().getDayName();

            case 3:
                return dayManager.getThirdDay().getDayName();

            case 4:
                return dayManager.getFourthDay().getDayName();
        }

        return null;
    }
}
