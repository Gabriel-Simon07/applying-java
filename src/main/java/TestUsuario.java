import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestUsuario {
    public static void main(String[] args) {
        final var listUsuarios = UsuarioFactory.usuariosList();

//        Consumer<Usuario> mostraMensagem = value -> System.out.println("Antes de imprimir");
//
//        Consumer<Usuario> imprimiNome = usuario -> System.out.println(listUsuarios.get(0).getNome());
//
//        listUsuarios.forEach(mostraMensagem.andThen(imprimiNome));

        Predicate<Usuario> predicate = usuario -> usuario.getPontos() > 160;

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(listUsuarios.get(0));
        usuarios.add(listUsuarios.get(1));
        usuarios.add(listUsuarios.get(2));

        usuarios.removeIf(predicate);
        usuarios.forEach(usuario -> System.out.println(usuario.getNome()));
    }
}

