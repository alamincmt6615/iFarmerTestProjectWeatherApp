package alamin.iFarmer.TestProjectWeather.ui.dashboard;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import alamin.iFarmer.TestProjectWeather.util.DayWeather;
import com.farukydnn.weatherplus.R;
import alamin.iFarmer.TestProjectWeather.adapter.DayDetailsListAdapter;


public class DayDetailsListFragment extends Fragment {

    private static final String TAG = DayDetailsListFragment.class.getSimpleName();

    private static final String DAY_DETAILS = "DAY_DETAILS";

    private DayWeather mDayDetails;

    public DayDetailsListFragment() {
        // Required empty public constructor
    }

    public static DayDetailsListFragment newInstance(DayWeather dayDetails) {
        Log.d(TAG, "newInstance");

        DayDetailsListFragment fragment = new DayDetailsListFragment();

        Bundle args = new Bundle();
        args.putParcelable(DAY_DETAILS, dayDetails);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mDayDetails = getArguments().getParcelable(DAY_DETAILS);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");

        View view =  inflater.inflate(R.layout.fragment_day_details_list, container, false);

        RecyclerView detailsList = view.findViewById(R.id.recycler_view);
        detailsList.setHasFixedSize(true);
        detailsList.setLayoutManager(new LinearLayoutManager(getActivity()));

        DayDetailsListAdapter adapter = new DayDetailsListAdapter(mDayDetails);
        detailsList.setAdapter(adapter);

        return view;
    }

}
