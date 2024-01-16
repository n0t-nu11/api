package med.voll.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.EnderecoDTO;

public record DadosAtualizacaoPacienteDTO(@NotNull Long id, String nome, String telefone, EnderecoDTO endereco) {
}