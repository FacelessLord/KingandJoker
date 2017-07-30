package Game.Inventory.Base;

import Graphics.Sprite;

public class GuiOBJ
{
	public String name = "";
	public int x = 0;
	public int y = 0;
	public int sizex = 0;
	public int sizey = 0;
	public int type = -1;
	public boolean hidden = false;

	public Sprite CustomTexture = null;
	public boolean custText = false;
	public static Sprite baseTexture = Sprite.getSprite("guibases/base");
	public static final Sprite vanillaTexture = Sprite.getSprite("guibases/base");

	public GuiBase gui;

	public void render(int k, int l)
	{

	}

	public void setGui(GuiBase gui)
	{
		this.gui = gui;
	}

	public GuiOBJ setHidden(boolean hide)
	{
		this.hidden = hide;
		return this;
	}

	public void setCustomTexture(String way)
	{
		this.CustomTexture = Sprite.getSprite(way);
		this.custText = true;
	}

	public static void setBaseTexture(String way)
	{
		baseTexture = Sprite.getSprite(way);
	}

	public void disableCustomTexture()
	{
		this.CustomTexture = null;
		this.custText = false;
	}

	public void reloadBaseTexture()
	{
		baseTexture = vanillaTexture;
	}

	public void bindTexture()
	{
		if (this.custText)
		{
			this.gui.setDrawingTexture(this.CustomTexture);
		}
		else
		{
			this.gui.setDrawingTexture(baseTexture);
		}
	}

	public void setType(int type)
	{
		this.type = type;
	}
}