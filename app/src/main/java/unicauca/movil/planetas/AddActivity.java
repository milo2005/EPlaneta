package unicauca.movil.planetas;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import unicauca.movil.planetas.databinding.ActivityAddBinding;
import unicauca.movil.planetas.models.Planeta;
import unicauca.movil.planetas.models.PlanetaDao;

public class AddActivity extends AppCompatActivity {

    ActivityAddBinding binding;
    PlanetaDao dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add);
        binding.setHandler(this);
        dao = ((App)getApplication()).session.getPlanetaDao();
    }

    public void save(){
        String name =  binding.name.getText().toString();
        String gravity = binding.gravity.getText().toString();
        Planeta planeta = new Planeta();
        planeta.setNombre(name);
        planeta.setGravedad(Float.parseFloat(gravity));

        dao.insert(planeta);
        finish();
    }
}
