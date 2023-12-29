package med.voll.api.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.EnderecoDTO;

public record DadosAtualizacaoPacienteDTO(@NotNull Long id, String nome, String telefone, EnderecoDTO endereco) {
}