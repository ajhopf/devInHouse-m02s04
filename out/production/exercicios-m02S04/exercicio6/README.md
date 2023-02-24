## Instruções

Crie uma classe de Teste, e nela crie um método “validar” que recebe como argumentos um parâmetro valorCampo do tipo String, e outro parâmetro do tipo tamanhoMaximo do tipo Inteiro.

A assinatura do método deve ser desta forma:

```
public void validar(String valorCampo, Integer valorMaximoCampo)
```
Na sequência, crie uma exceção customizada (própria) chamada “TamanhoInvalidoException”. Esta exceção deve ser ‘checked’, ou seja, extender a classe ‘Exception’.

Na implementação do método ‘validar’, atenda as seguintes situações:

a) Se o conteúdo de algum dos argumentos (valor ou tamanho) forem nulos, ou se o parâmetro de valor for um número negativo, o método deve lançar a exceção IllegalArgumentException (do pacote java.lang).

b) Se o tamanho do parâmetro “valorCampo” (nro de caracteres da String) for maior que o número constante no argumento ‘valorMaximoCampo’, o método deve lançar a exceção criada 'TamanhoInvalidoException'.

c) Caso não tenha estas inconsistências, o método não deve retornar nada.