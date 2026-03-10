import java.time.LocalDate;

public class CodificadorHenrique implements Codificador {
    public String getNome() {
        return "Codificador Henrique";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2026, 3, 10);
    }

    public int getNivelSeguranca() {
        return 2;
    }

    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            encoded.append((char) (c + 2));

            if ((i + 1) % 3 == 0) {
                encoded.append("#d&");
            }
        }

        return encoded.toString();
    }

    public String decodifica(String str) {
        StringBuilder decoded = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            decoded.append((char) (str.charAt(i) - 2));

            if (decoded.length() % 3 == 0 && i + 3 < str.length() && str.substring(i + 1, i + 4).equals("#d&")) {
                i += 3;
            }
        }

        return decoded.toString();
    }
}

