package alamin.iFarmer.TestProjectWeather.interfaces;

import androidx.recyclerview.widget.RecyclerView;


public interface ItemTouchHelperListener {

    void onSwiped(RecyclerView.ViewHolder viewHolder, int direction, int position);

    void onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder,
                   RecyclerView.ViewHolder target);
}
