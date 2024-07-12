public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void finalizarChamada() {
        System.out.println("Chamada finalizada.");
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    @Override
    public void adicionarAosFavoritos(String url) {
        System.out.println("Adicionando aos favoritos: " + url);
    }

    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        meuIPhone.tocarMusica();
        meuIPhone.pausarMusica();
        meuIPhone.selecionarMusica("California Dreamin - The Mamas & The Papas");

        meuIPhone.fazerChamada("01001010001");
        meuIPhone.atenderChamada();
        meuIPhone.finalizarChamada();

        meuIPhone.abrirPagina("https://web.dio.me/home");
        meuIPhone.atualizarPagina();
        meuIPhone.adicionarAosFavoritos("https://web.dio.me/home");
    }
}
