package es.pamp.asynctask.task;

import android.os.AsyncTask;

import es.pamp.asynctask.MainActivity;

/**
 * Created by cice on 30/3/17.
 */

public class TaskContador extends AsyncTask <Void, Integer, Void>{
    MainActivity activity;

    public void setActivity(MainActivity activity) {
        this.activity = activity;
    }

    @Override
    protected Void doInBackground(Void... params) {
        for (int contador =0; contador<10001; contador++){

            if (isCancelled()) break;
            publishProgress(contador);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                cancel(true);
            }
        }
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        activity.escribirTexto(values[0].toString());
    }
    public TaskContador() {
        super();
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
    }



    @Override
    protected void onCancelled(Void aVoid) {
        super.onCancelled(aVoid);
    }

    @Override
    protected void onCancelled() {
        super.onCancelled();
    }
}
