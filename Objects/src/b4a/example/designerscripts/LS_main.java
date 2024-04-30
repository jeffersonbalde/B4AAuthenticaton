package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_main{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[Main/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="Panel1.Width = 90%X"[Main/General script]
views.get("panel1").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 5;BA.debugLine="Panel1.Left = 5%X"[Main/General script]
views.get("panel1").vw.setLeft((int)((5d / 100 * width)));
//BA.debugLineNum = 6;BA.debugLine="Panel1.Bottom = 50%Y"[Main/General script]
views.get("panel1").vw.setTop((int)((50d / 100 * height) - (views.get("panel1").vw.getHeight())));
//BA.debugLineNum = 7;BA.debugLine="Panel1.SetTopAndBottom(20%x, 90%y)"[Main/General script]
views.get("panel1").vw.setTop((int)((20d / 100 * width)));
views.get("panel1").vw.setHeight((int)((90d / 100 * height) - ((20d / 100 * width))));
//BA.debugLineNum = 9;BA.debugLine="Email.Width = 70%X"[Main/General script]
views.get("email").vw.setWidth((int)((70d / 100 * width)));
//BA.debugLineNum = 10;BA.debugLine="Email.Height = 7%Y"[Main/General script]
views.get("email").vw.setHeight((int)((7d / 100 * height)));
//BA.debugLineNum = 11;BA.debugLine="Email.Left = 10%X"[Main/General script]
views.get("email").vw.setLeft((int)((10d / 100 * width)));
//BA.debugLineNum = 12;BA.debugLine="Email.Bottom = 25%Y"[Main/General script]
views.get("email").vw.setTop((int)((25d / 100 * height) - (views.get("email").vw.getHeight())));
//BA.debugLineNum = 14;BA.debugLine="Password.Width = 70%X"[Main/General script]
views.get("password").vw.setWidth((int)((70d / 100 * width)));
//BA.debugLineNum = 15;BA.debugLine="Password.Height = 7%Y"[Main/General script]
views.get("password").vw.setHeight((int)((7d / 100 * height)));
//BA.debugLineNum = 16;BA.debugLine="Password.Left = 10%X"[Main/General script]
views.get("password").vw.setLeft((int)((10d / 100 * width)));
//BA.debugLineNum = 17;BA.debugLine="Password.Bottom = 35%Y"[Main/General script]
views.get("password").vw.setTop((int)((35d / 100 * height) - (views.get("password").vw.getHeight())));
//BA.debugLineNum = 19;BA.debugLine="LoginButton.Width = 70%X"[Main/General script]
views.get("loginbutton").vw.setWidth((int)((70d / 100 * width)));
//BA.debugLineNum = 20;BA.debugLine="LoginButton.Height = 7%Y"[Main/General script]
views.get("loginbutton").vw.setHeight((int)((7d / 100 * height)));
//BA.debugLineNum = 21;BA.debugLine="LoginButton.Left = 10%X"[Main/General script]
views.get("loginbutton").vw.setLeft((int)((10d / 100 * width)));
//BA.debugLineNum = 22;BA.debugLine="LoginButton.Bottom = 50%Y"[Main/General script]
views.get("loginbutton").vw.setTop((int)((50d / 100 * height) - (views.get("loginbutton").vw.getHeight())));
//BA.debugLineNum = 24;BA.debugLine="Register.Width = 70%X"[Main/General script]
views.get("register").vw.setWidth((int)((70d / 100 * width)));
//BA.debugLineNum = 25;BA.debugLine="Register.Height = 7%Y"[Main/General script]
views.get("register").vw.setHeight((int)((7d / 100 * height)));
//BA.debugLineNum = 26;BA.debugLine="Register.Left = 10%X"[Main/General script]
views.get("register").vw.setLeft((int)((10d / 100 * width)));
//BA.debugLineNum = 27;BA.debugLine="Register.Bottom = 70%Y"[Main/General script]
views.get("register").vw.setTop((int)((70d / 100 * height) - (views.get("register").vw.getHeight())));

}
}