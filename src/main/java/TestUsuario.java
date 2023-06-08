public class TestUsuario {
    public static void main(String[] args) {
        final var listUsuarios = UsuarioFactory.usuariosList();

        Mostrador mostrador = new Mostrador();
        listUsuarios.forEach(mostrador);

        listUsuarios.forEach(usuario -> System.out.println(usuario.getNome()));
    }
}

