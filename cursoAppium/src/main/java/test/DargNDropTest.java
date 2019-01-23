package test;

import org.junit.Assert;
import org.junit.Test;

import appium.core.BaseTest;
import page.DragDropPage;
import page.MenuPage;

public class DargNDropTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private DragDropPage page = new DragDropPage();
	private String[] estadoInicial = new String[] {"Esta", "� uma lista", "Drag em Drop!", "Fa�a um clique longo", "e arrase para", "qualquer local desejado."};
	private String[] estadoIntermediario = new String[] {"� uma lista", "Drag em Drop!", "Fa�a um clique longo", "e arrase para", "Esta", "qualquer local desejado."};
	private String[] estadoFinal = new String[] {"Fa�a um clique longo", "� uma lista", "Drag em Drop!", "e arrase para", "Esta", "qualquer local desejado."};
	
	@Test
	public void deveEfetuarDragNDrop() {
		
		//Acessar menu
		menu.acesssarDragNDrop();
		
		//Verificar estado inicial
		Assert.assertArrayEquals(estadoInicial, page.obterLista());
		page.obterLista();
		
		//Arrastar "Esta" para "e arraste para"
		page.arrastar("Esta", "e arraste para");
		
		//Verificar estado intermedi�rio
		Assert.assertArrayEquals(estadoIntermediario, page.obterLista());
		
		//Arrastar "Fa�a um clique longo," para "� uma lista"
		page.arrastar("Fa�a um clique longo,", "� uma lista");
		
		//Verificar estado final
		Assert.assertArrayEquals(estadoFinal, page.obterLista());
		
	}
}
