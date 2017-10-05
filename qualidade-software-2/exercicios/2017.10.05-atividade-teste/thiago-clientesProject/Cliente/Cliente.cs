using System;

namespace Cliente
{
    public class Cliente {
        public String Nome {get;set;}
        public String Sobrenome{get;set;}

        public Cliente(){
            
        }
        public Cliente(String n, String sn) {
            this.Nome = n;
            this.Sobrenome = sn;
        }
        public String getFullName(){
            return this.Nome + ' ' + this.Sobrenome;
        }
    }
}
