package Computador;

public class Computador {

    private Armazenamento armazenamento;
    private PlacaMae placaMae;
    private PlacaDeVideo placaDeVideo;
    private MemoriaRam memoriaRam;
    private Processador processador;

    public Computador(Armazenamento armazenamento, PlacaMae placaMae, PlacaDeVideo placaDeVideo, MemoriaRam memoriaRam, Processador processador){
        setArmazenamento(armazenamento);
        setMemoriaRam(memoriaRam);
        setProcessador(processador);
        setPlacaMae(placaMae);
        setPlacaDeVideo(placaDeVideo);
    }

    public Armazenamento getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(Armazenamento armazenamento) {
        this.armazenamento = armazenamento;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(PlacaMae placaMae) {
        this.placaMae = placaMae;
    }

    public PlacaDeVideo getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(PlacaDeVideo placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public MemoriaRam getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(MemoriaRam memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public void exibeItens(){
        armazenamento.exibeDados();
        placaMae.exibeDados();
        processador.exibeDados();
        memoriaRam.exibeDados();
        placaDeVideo.exibeDados();
    }


}
