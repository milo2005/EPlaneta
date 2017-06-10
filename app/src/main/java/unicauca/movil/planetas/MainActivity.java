package unicauca.movil.planetas;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import unicauca.movil.planetas.adapters.PlanetaAdapter;
import unicauca.movil.planetas.databinding.ActivityMainBinding;
import unicauca.movil.planetas.models.Planeta;
import unicauca.movil.planetas.models.PlanetaDao;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    PlanetaAdapter adapter;
    PlanetaDao dao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        List<Planeta> data = new ArrayList<>();
        adapter = new PlanetaAdapter(getLayoutInflater(), data);
        binding.list.setAdapter(adapter);
        dao = ((App)getApplication()).session.getPlanetaDao();
    }

    @Override
    protected void onResume() {
        super.onResume();
        List<Planeta> data = dao.loadAll();
        adapter.setData(data);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(this, AddActivity.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}
