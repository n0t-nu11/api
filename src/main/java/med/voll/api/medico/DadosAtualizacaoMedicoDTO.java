package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.EnderecoDTO;

public record DadosAtualizacaoMedicoDTO(@NotNull Long id, String nome, String telefone, EnderecoDTO endereco) {
}