package br.utfpr.architecture.project;


import br.utfpr.architecture.DAO.AulasDoPlanoSubstituicaoDAO;
import br.utfpr.architecture.DAO.CargoDAO;
import br.utfpr.architecture.DAO.DisciplinaDAO;
import br.utfpr.architecture.DAO.ProfessorDAO;
import br.utfpr.architecture.DAO.SolicitacaoPlanoDeSubstituicaoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner{
    
    private final ProfessorDAO professorDAO;
    private final AulasDoPlanoSubstituicaoDAO aulas;
    private final CargoDAO cargo;
    private final SolicitacaoPlanoDeSubstituicaoDAO solicita;
    private final DisciplinaDAO disciplina;
    
    @Autowired
    public ProjectApplication(ProfessorDAO professorDAO,AulasDoPlanoSubstituicaoDAO aulas,CargoDAO cargo,
           SolicitacaoPlanoDeSubstituicaoDAO solicita, DisciplinaDAO disciplina) {
        this.professorDAO = professorDAO;
        this.solicita = solicita;
        this.aulas = aulas;
        this.cargo = cargo;
        this.disciplina = disciplina;
    }
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
