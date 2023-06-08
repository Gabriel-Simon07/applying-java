import java.util.function.Consumer;

public class TestUsuario {
    public static void main(String[] args) {
        final var listUsuarios = UsuarioFactory.usuariosList();

        Consumer<Usuario> mostraMensagem = value -> System.out.println("Antes de imprimir");

        Consumer<Usuario> imprimiNome = usuario -> System.out.println(listUsuarios.get(0).getNome());

        listUsuarios.forEach(mostraMensagem.andThen(imprimiNome));
    }
}

