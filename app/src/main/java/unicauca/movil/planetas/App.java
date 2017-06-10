package unicauca.movil.planetas;

import android.app.Application;

import org.greenrobot.greendao.database.Database;

import unicauca.movil.planetas.models.DaoMaster;
import unicauca.movil.planetas.models.DaoSession;

public class App extends Application {

    DaoSession session;

    @Override
    public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "planetas.db");
        Database db =  helper.getWritableDb();
        session =  new DaoMaster(db).newSession();
    }
}
