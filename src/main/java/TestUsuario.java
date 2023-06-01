import java.util.Arrays;

public class TestUsuario {
    public static void main(String[] args) {
        final var usuario1 = new Usuario("Teste1", 10, true);
        final var usuario2 = new Usuario("Teste2", 20, false);
        final var usuario3 = new Usuario("Teste3", 30, false);

        final var listUsuarios = Arrays.asList(usuario1, usuario2, usuario3);

        for(Usuario u : listUsuarios) {
            System.out.println(u.getNome());
        }

        Mostrador mostrador = new Mostrador();
        listUsuarios.forEach(mostrador);

        listUsuarios.forEach(usuario -> System.out.println(usuario.getNome()));

        Validator<String> validatorCEP = s -> s.matches("[0-9]{5}-[0-9]{3}");
        System.out.println(validatorCEP.valida("88055-009"));
    }
}

