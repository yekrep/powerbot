package scripts;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Component;
public class Wrappers{
	void widgetInteract(ClientContext ctx,int widgetIndex,String text,String type){
		ctx.components.select(true,widgetIndex);
		switch(type){
			case "text":
				ctx.components.textContains(text);
				break;
			case "tooltip":
				ctx.components.tooltipContains(text);
				break;
		}
		if(!ctx.components.isEmpty()){
			if(ctx.components.poll().click()){
				//wait for something to happen
			}
		}
	}
	void widgetInteract(ClientContext ctx,int widgetIndex,String text){
	}
}
