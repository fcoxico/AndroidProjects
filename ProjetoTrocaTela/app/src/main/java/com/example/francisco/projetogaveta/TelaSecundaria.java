package com.example.francisco.projetogaveta;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class TelaSecundaria extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Context context = TelaSecundaria.this;
    protected DrawerLayout Drawer;
    private android.support.v7.widget.Toolbar barra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_secundaria_01);

        //Barra ------------------------------------------------------------------------------------
        barra = findViewById(R.id.tb_telasecundaria);
        setSupportActionBar(barra);

        //Inicializando a Drawer--------------------------------------------------------------------
        initDrawer();


    }// Fim do onCreate----------------------------------

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout_secundaria);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tela_secundaria, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Navegacao entre os itens do menu
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.tela_principal) {
            Intent mudaTela = new Intent(context, TelaPrincipal.class);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            startActivity(mudaTela);

        } else if (id == R.id.tela_secundaria) {
            Intent mudaTela = new Intent(context, TelaSecundaria.class);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            startActivity(mudaTela);
        }//Fim dos else if

        Drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    //MÉTODOS---------------------------------------------------------------------------------------
    public void initDrawer() {
        Drawer = (DrawerLayout) findViewById(R.id.drawer_layout_secundaria);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, Drawer, barra, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        Drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view_tsec);
        navigationView.setCheckedItem(R.id.home);
        navigationView.setNavigationItemSelectedListener(this);

    }


}
