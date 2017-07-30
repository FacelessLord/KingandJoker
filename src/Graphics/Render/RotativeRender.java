package Graphics.Render;

import org.lwjgl.opengl.GL11;

import Game.Entities.Entity;
import Graphics.GUI;
import Utilities.Tessellator;

public class RotativeRender extends Render
{

	@Override
	public void render(Entity obj)
	{
		Tessellator t = GUI.t;

		if (obj.getSprite() != null)
		{
			obj.getSprite().getTexture().bind();

			GL11.glPushMatrix();
			GL11.glTranslated(obj.pos.x, obj.pos.y + obj.height / 2, 0);
			GL11.glRotated(obj.rotation, 0, 0, 1);

			t.start(GL11.GL_QUADS);

			t.addVertexWithUV(-obj.width / 2, +obj.height / 2, 0, 0);
			t.addVertexWithUV(+obj.width / 2, +obj.height / 2, 1, 0);
			t.addVertexWithUV(+obj.width / 2, -obj.height / 2, 1, 1);
			t.addVertexWithUV(-obj.width / 2, -obj.height / 2, 0, 1);

			t.draw();
			GL11.glPopMatrix();
		}
	}

}
