public class CampeonatoBrasileiro {

    public static void main(String[] args) {
        String[] times = {
                "Botafogo", "Palmeiras", "Grêmio", "Flamengo", "Fluminense",
                "Bragantino", "Athletico-PR", "Fortaleza", "São Paulo", "Cruzeiro",
                "Internacional", "Atlético-MG", "Cuiabá", "Corinthians", "Goiás",
                "Bahia", "Santos", "Vasco da Gama", "Coritiba", "America-MG"
        };

        // Saída da tabela de classificação
        System.out.println("Tabela de Classificação do Campeonato Brasileiro:");
        for (int i = 0; i < times.length; i++) {
            System.out.println((i + 1) + "º " + times[i]); 
        }
    }
}