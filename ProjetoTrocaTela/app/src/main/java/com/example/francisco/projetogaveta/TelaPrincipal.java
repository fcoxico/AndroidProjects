package com.example.francisco.projetogaveta;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;

public class TelaPrincipal extends AppCompatActivity implements OnNavigationItemSelectedListener {


    //Tudo que tiver nessa tela é só replicar na outra activity ajustando para aquela tela.


    Context context = TelaPrincipal.this; //Não esqueceça de colocar o contexto aqui.
    protected DrawerLayout Drawer;
    private android.support.v7.widget.Toolbar barra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_principal_01); //Aqui eu pensava que tinha que colocar a tela 2,
        //mas aqui tem que colocar a tela 1, porque quando o Android chega na tela 1 ele vê que o layout
        //está apontando para a segunda tela. Então por colocar tela 01 aqui.


        //Barra ------------------------------------------------------------------------------------
        barra = findViewById(R.id.tb_telaprincipal);
        setSupportActionBar(barra);

        //Inicializando a Drawer--------------------------------------------------------------------
        initDrawer();


    }//---Fim do onCreate------------------------------------------------------


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Infla o menu e coloca os 3 pontos que chama as opções do menu
        getMenuInflater().inflate(R.menu.tela_principal, menu);
        return true;
    }

    //Caso queira que a barra faça alguma coisa quando clicada é aqui que você vai clicar.
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

        //O Primeiro item do menu vai te levar para a tela inicial
        if (id == R.id.tela_principal) {
            Intent mudaTela = new Intent(context, TelaPrincipal.class);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            startActivity(mudaTela);

        //O segundo item do menu vai te levar para a tela inicial
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
        Drawer = (DrawerLayout) findViewById(R.id.drawer_layout_principal); //Coloque aqui o ID da Gaveta da tela
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, Drawer, barra, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        Drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view_tprinc);//COloque aqui o id do Navigation da tela
        navigationView.setCheckedItem(R.id.home);
        navigationView.setNavigationItemSelectedListener(this);
    } //Aqui fica o método para que a gaveta funcione.
}
