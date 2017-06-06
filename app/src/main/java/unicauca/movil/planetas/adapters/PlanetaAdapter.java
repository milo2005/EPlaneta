package unicauca.movil.planetas.adapters;

import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import unicauca.movil.planetas.R;
import unicauca.movil.planetas.databinding.TemplatePlanetaBinding;
import unicauca.movil.planetas.models.Planeta;

public class PlanetaAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private List<Planeta> data;

    public PlanetaAdapter(LayoutInflater inflater, List<Planeta> data) {
        this.inflater = inflater;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(v == null)
            v = inflater.inflate(R.layout.template_planeta, parent, false);

        TemplatePlanetaBinding binding = DataBindingUtil.bind(v);
        binding.setPlaneta(data.get(position));

        return binding.getRoot();
    }

    public void setData(List<Planeta> data){
        this.data = data;
        notifyDataSetChanged();
    }

}
