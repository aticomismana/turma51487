using System;
using Xunit;

namespace Cliente.Test
{
    public class ClienteTest
    {
        private readonly Cliente _cliente;

        public ClienteTest(){
            _cliente = new Cliente();
        }

        [Fact]
        public void getFullName()
        {
            _cliente.Nome = "Thiago";
            _cliente.Sobrenome = "Nogueira";
            Assert.Equal(_cliente.Nome + ' ' + _cliente.Sobrenome, _cliente.getFullName());
        }
    }
}
 