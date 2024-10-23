package exdotrab;



import java.util.Map;

public class Tratar {

	public String tratarFormulario(Map<String, String> params) {

		StringBuilder sb = new StringBuilder();

		sb.append("Nome: " + params.get("nome"));
		sb.append("\n");
		sb.append("Sobrenome: " + params.get("sobrenome"));

		return sb.toString();
		
	}
}
