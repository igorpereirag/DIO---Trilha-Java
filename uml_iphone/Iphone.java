public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private boolean musicaTocando;
    private String musicaAtual;
    private boolean ligacaoAtiva;
    private boolean navegando;

    @Override
    public void tocarMusica() {
        musicaTocando = true;
        System.out.println("Música tocando...");
    }

    @Override
    public void pausarMusica() {
        musicaTocando = false;
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    @Override
    public void ligar() {
        ligacaoAtiva = true;
        System.out.println("Ligação ativa.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina() {
        navegando = true;
        System.out.println("Exibindo página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }