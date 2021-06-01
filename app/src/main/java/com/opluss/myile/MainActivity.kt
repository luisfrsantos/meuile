package com.opluss.myile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.opluss.myile.commons.UiRoutes.FEED_ROUTE
import com.opluss.myile.commons.UiRoutes.LOGIN_ROUTE
import com.opluss.myile.commons.ui.StatusBarSettings
import com.opluss.myile.feed.model.News
import com.opluss.myile.feed.ui.Feed
import com.opluss.myile.login.ui.LoginForm

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StatusBarSettings()
            Greeting()
        }
    }
}

@Composable
fun Greeting() {
    val navController = rememberNavController()
    Navigation(navController)
}

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = LOGIN_ROUTE) {
        composable(LOGIN_ROUTE) {
            LoginForm(navController)
        }
        composable(FEED_ROUTE) {
            Feed(getListMock())
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting()
}

fun getListMock(): List<News> {
    val list: ArrayList<News> = arrayListOf()
    list.add(
        News(
            content = "Atualmente no Brasil são cultuados apenas 12 orixás. " +
                "Já foram 16: quatro deles (Obá, Logunedé, Ewa e Irôco) há algum tempo só se manifestam em ocasiões bissextas," +
                " basicamente em festas e rituais espec... \n" +
                "Leia mais em: https://super.abril.com.br/sociedade/os-orixas-mais-populares-do-brasil/",
            image = "https://super.abril.com.br/wp-content/uploads/2018/04/dossic3aa-afro.png"
        )
    )
    list.add(
        News(
            content = "Uma ferramenta muito importante de autoconhecimento, " +
                "os Odus de Nascimento permitem que você entenda a sua forma de amar," +
                " de se relacionar, de lidar com suas emoções e de enfrentar os desafios.",
            image = "https://cdn.astrocentro.com.br/blog/wp-content/uploads/2019/03/17153756/Numerologia-dos-Orix%C3%A1s-blog-730x365-1.jpg"
        )
    )
    list.add(
        News(
            content = "\"Divindades Ancestrais”, série com ilustrações de orixás e estampas, " +
                "é assinada pelo artista Ayodê França. Os desenhos são lançados diariamente," +
                " a partir desta quinta-feira (15), através do Instagram (@ayode_franca e @divindidadesancestrais).",
            image = "https://cdn.folhape.com.br/img/pc/450/450/dn_arquivo/2021/04/1618506940247896-1.jpg"
        )
    )
    list.add(
        News(
            content = "Atualmente no Brasil são cultuados apenas 12 orixás. " +
                "Já foram 16: quatro deles (Obá, Logunedé, Ewa e Irôco) há algum tempo só se manifestam em ocasiões bissextas," +
                " basicamente em festas e rituais espec... \n" +
                "Leia mais em: https://super.abril.com.br/sociedade/os-orixas-mais-populares-do-brasil/",
            image = "https://super.abril.com.br/wp-content/uploads/2018/04/dossic3aa-afro.png"
        )
    )
    list.add(
        News(
            content = "Uma ferramenta muito importante de autoconhecimento, " +
                "os Odus de Nascimento permitem que você entenda a sua forma de amar," +
                " de se relacionar, de lidar com suas emoções e de enfrentar os desafios.",
            image = "https://cdn.astrocentro.com.br/blog/wp-content/uploads/2019/03/17153756/Numerologia-dos-Orix%C3%A1s-blog-730x365-1.jpg"
        )
    )
    list.add(
        News(
            content = "\"Divindades Ancestrais”, série com ilustrações de orixás e estampas, " +
                "é assinada pelo artista Ayodê França. Os desenhos são lançados diariamente," +
                " a partir desta quinta-feira (15), através do Instagram (@ayode_franca e @divindidadesancestrais).",
            image = "https://cdn.folhape.com.br/img/pc/450/450/dn_arquivo/2021/04/1618506940247896-1.jpg"
        )
    )
    return list
}
