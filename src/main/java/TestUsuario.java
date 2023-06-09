import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestUsuario {
    public static void main(String[] args) {
        final var listUsuarios = UsuarioFactory.usuariosList();

//        Consumer<Usuario> mostraMensagem = value -> System.out.println("Antes de imprimir");
//
//        Consumer<Usuario> imprimiNome = usuario -> System.out.println(listUsuarios.get(0).getNome());
//
//        listUsuarios.forEach(mostraMensagem.andThen(imprimiNome));

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(listUsuarios.get(0));
        usuarios.add(listUsuarios.get(1));
        usuarios.add(listUsuarios.get(2));

        usuarios.removeIf(usuario -> usuario.getPontos() > 160);
        usuarios.forEach(usuario -> System.out.println(usuario.getNome()));

//        listUsuarios.sort(Comparator.comparing(Usuario::getNome));

        List<String> palavras = Arrays.asList("java", "python");
        palavras.sort(Comparator.naturalOrder());
        System.out.println(palavras);
        palavras.sort(Comparator.reverseOrder());
        System.out.println(palavras);
    }
}

