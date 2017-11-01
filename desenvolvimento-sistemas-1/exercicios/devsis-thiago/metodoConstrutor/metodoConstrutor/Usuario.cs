namespace metodoConstrutor
{

    public class Usuario
    {
        public string nomeCompleto { get; set; }
        public string cidade { get; set; }
        public string estado { get; set; } 
        private int cpf { get; set; }
        private int rg { get; set; }
        

        public Usuario(string nome, string cidade, string estado, int cpf, int rg)
        {
            this.nomeCompleto = nome;
            this.cidade = cidade;
            this.estado = estado;
            this.cpf = cpf;
            this.rg = rg;
            this.nomeCompleto = nome;

        }

    }
}