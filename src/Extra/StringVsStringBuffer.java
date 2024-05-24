package Extra;
/*
 * Explicacao:
 * A concatenação de Strings usando StringBuffer é muito mais eficiente do que usar 
 * String diretamente devido à natureza mutável de StringBuffer, 
 * que evita a criação de novos objetos durante cada operação de concatenação.
 * 
 * Strings:
 * Quando você concatena Strings usando o operador + dentro de um laço, 
 * uma nova instância de String é criada a cada iteração.
 * 
 * StringBuffer:
 * StringBuffer é uma classe mutável, o que significa que seu conteúdo 
 * pode ser modificado sem a necessidade de criar um novo objeto.
 */
public class StringVsStringBuffer {

    private static final int ITERATIONS = 100000;

    public static void main(String[] args) {
        // Teste de desempenho para String
        long startTime = System.currentTimeMillis();
        testStringConcat();
        long endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução para concatenação com String: " + (endTime - startTime) + " ms");

        // Teste de desempenho para StringBuffer
        startTime = System.currentTimeMillis();
        testStringBufferConcat();
        endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução para concatenação com StringBuffer: " + (endTime - startTime) + " ms");
    }

    private static void testStringConcat() {
        String str = "";
        for (int i = 0; i < ITERATIONS; i++) {
            str += "a";
        }
    }

    private static void testStringBufferConcat() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuffer.append("a");
        }
    }
}
