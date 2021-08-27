package br.com.temasistemas.hearthstone.dtos;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CartaDTO {
    public Long id;
    @NotNull @NotEmpty
    public String nome;
    @NotNull @NotEmpty
    public String descricao;
    @Min(value = 0,message = "O valor de ataque deve ser maior que zero!")
    @Max(value = 10, message = "O valor de ataque deve ser inferior a 10!")
    public Integer ataque;
    @Min(value = 0,message = "O valor de defesa deve ser maior que zero!")
    @Max(value = 10, message = "O valor de defesa deve ser inferior a 10!")
    public Integer defesa;
    @NotNull @NotEmpty
    public String tipo;
    @NotNull @NotEmpty
    public String classe;

}
