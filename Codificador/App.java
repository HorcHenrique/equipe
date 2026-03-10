public class App {
    public static void main(String[] args) throws Exception {
        Codificador cod = new CodificadorSimples();
        Codificador henrique = new CodificadorHenrique();

        System.out.println("Codificador: "+cod.getNome());
        System.out.println("Versao: "+cod.getDataCriacao());
        System.out.println("Nivel de segurança: "+cod.getNivelSeguranca());
        
        String texto = "Este e o string a ser codificado";
        String codificado = cod.codifica(texto);
        String decodificado = cod.decodifica(codificado);

        System.out.println("Texto original: "+texto);
        System.out.println("Texto codificado: "+codificado);
        System.out.println("Texto decodificado: "+decodificado);

        //------

        System.out.println("Codificador: "+henrique.getNome());
        System.out.println("Versao: "+henrique.getDataCriacao());
        System.out.println("Nivel de segurança: "+henrique.getNivelSeguranca());
        
        String textoHenrique = "Este e o string a ser codificado";
        String codificadoHenrique = henrique.codifica(textoHenrique);
        String decodificadoHenrique = henrique.decodifica(codificadoHenrique);

        System.out.println("Texto original: "+textoHenrique);
        System.out.println("Texto codificado: "+codificadoHenrique);
        System.out.println("Texto decodificado: "+decodificadoHenrique);
    }
}
