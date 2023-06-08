import java.util.List;

public class UsuarioFactory {
    public static Usuario createUsuario(String nome, int pontos, boolean moderador) {
        return new Usuario(nome, pontos, moderador);
    }

    public static List<Usuario> usuariosList() {
        final var usuario1 = createUsuario("Usuario 1", 170, false);
        final var usuario2 = createUsuario("Usuario 2", 20, true);
        final var usuario3 = createUsuario("Usuario 3", 30, false);

        return List.of(usuario1, usuario2, usuario3);
    }
}
