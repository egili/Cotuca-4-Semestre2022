namespace ProjetoEscola_API.Models
{
    public class Aluno
    {
        public int id       {get; set;} //entity framework, toda tabela precisa ter o campo id
        public string? ra   {get; set;}
        public string? nome {get; set;}
        public int codCurso {get; set;}
    }
}