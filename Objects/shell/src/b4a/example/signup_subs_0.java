package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class signup_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (signup) ","signup",1,signup.mostCurrent.activityBA,signup.mostCurrent,22);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.signup.remoteMe.runUserSub(false, "signup","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 22;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 24;BA.debugLine="Activity.LoadLayout(\"SignUp\")";
Debug.ShouldStop(8388608);
signup.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("SignUp")),signup.mostCurrent.activityBA);
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (signup) ","signup",1,signup.mostCurrent.activityBA,signup.mostCurrent,31);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.signup.remoteMe.runUserSub(false, "signup","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (signup) ","signup",1,signup.mostCurrent.activityBA,signup.mostCurrent,27);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.signup.remoteMe.runUserSub(false, "signup","activity_resume");}
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private Name As B4XFloatTextField";
signup.mostCurrent._name = RemoteObject.createNew ("b4a.example.b4xfloattextfield");
 //BA.debugLineNum = 18;BA.debugLine="Private Email As B4XFloatTextField";
signup.mostCurrent._email = RemoteObject.createNew ("b4a.example.b4xfloattextfield");
 //BA.debugLineNum = 19;BA.debugLine="Private Password As B4XFloatTextField";
signup.mostCurrent._password = RemoteObject.createNew ("b4a.example.b4xfloattextfield");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _insertdata() throws Exception{
try {
		Debug.PushSubsStack("insertData (signup) ","signup",1,signup.mostCurrent.activityBA,signup.mostCurrent,35);
if (RapidSub.canDelegate("insertdata")) { return b4a.example.signup.remoteMe.runUserSub(false, "signup","insertdata");}
ResumableSub_insertData rsub = new ResumableSub_insertData(null);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_insertData extends BA.ResumableSub {
public ResumableSub_insertData(b4a.example.signup parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.signup parent;
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _query = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("insertData (signup) ","signup",1,signup.mostCurrent.activityBA,signup.mostCurrent,35);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 36;BA.debugLine="Dim result As Boolean";
Debug.ShouldStop(8);
_result = RemoteObject.createImmutable(false);Debug.locals.put("result", _result);
 BA.debugLineNum = 38;BA.debugLine="Try";
Debug.ShouldStop(32);
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
 BA.debugLineNum = 39;BA.debugLine="Dim query As String = $\"INSERT INTO accounts (na";
Debug.ShouldStop(64);
_query = (RemoteObject.createImmutable("INSERT INTO accounts (name, email, password) VALUES (?,?,?)"));Debug.locals.put("query", _query);Debug.locals.put("query", _query);
 BA.debugLineNum = 40;BA.debugLine="Main.sql.ExecNonQuery2(query, Array As Object(Na";
Debug.ShouldStop(128);
parent.mostCurrent._main._sql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(_query),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(parent.mostCurrent._name.runClassMethod (b4a.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ )),(parent.mostCurrent._email.runClassMethod (b4a.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ )),(parent.mostCurrent._password.runClassMethod (b4a.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ))})))));
 BA.debugLineNum = 41;BA.debugLine="result = True";
Debug.ShouldStop(256);
_result = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("result", _result);
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 43;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","21114120",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",signup.mostCurrent.activityBA)),0);
 BA.debugLineNum = 44;BA.debugLine="xui.MsgboxAsync(LastException, \"Error\")";
Debug.ShouldStop(2048);
parent._xui.runVoidMethod ("MsgboxAsync",signup.processBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent.__c.runMethod(false,"LastException",signup.mostCurrent.activityBA).getObject())),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))));
 BA.debugLineNum = 45;BA.debugLine="result = False";
Debug.ShouldStop(4096);
_result = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("result", _result);
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 48;BA.debugLine="Return result";
Debug.ShouldStop(32768);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_result));return;};
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",signup.processBA, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
signup._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _registerbutton_click() throws Exception{
try {
		Debug.PushSubsStack("RegisterButton_Click (signup) ","signup",1,signup.mostCurrent.activityBA,signup.mostCurrent,52);
if (RapidSub.canDelegate("registerbutton_click")) { b4a.example.signup.remoteMe.runUserSub(false, "signup","registerbutton_click"); return;}
ResumableSub_RegisterButton_Click rsub = new ResumableSub_RegisterButton_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_RegisterButton_Click extends BA.ResumableSub {
public ResumableSub_RegisterButton_Click(b4a.example.signup parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.signup parent;
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _response = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RegisterButton_Click (signup) ","signup",1,signup.mostCurrent.activityBA,signup.mostCurrent,52);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 53;BA.debugLine="Try";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//try
this.state = 14;
this.catchState = 13;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 13;
 BA.debugLineNum = 54;BA.debugLine="Wait For (insertData) Complete (Success As Boole";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", signup.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "signup", "registerbutton_click"), _insertdata());
this.state = 15;
return;
case 15:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 55;BA.debugLine="If Success Then";
Debug.ShouldStop(4194304);
if (true) break;

case 4:
//if
this.state = 11;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 56;BA.debugLine="xui.MsgboxAsync(\"Register Complete\", \"Register\"";
Debug.ShouldStop(8388608);
parent._xui.runVoidMethod ("MsgboxAsync",signup.processBA,(Object)(BA.ObjectToCharSequence("Register Complete")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Register"))));
 BA.debugLineNum = 57;BA.debugLine="Wait For Msgbox_Result (response As Int)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", signup.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "signup", "registerbutton_click"), null);
this.state = 16;
return;
case 16:
//C
this.state = 7;
_response = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("response", _response);
;
 BA.debugLineNum = 58;BA.debugLine="If response = xui.DialogResponse_Positive Then";
Debug.ShouldStop(33554432);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_response,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 59;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",signup.processBA,(Object)((parent.mostCurrent._main.getObject())));
 BA.debugLineNum = 60;BA.debugLine="Activity.Finish";
Debug.ShouldStop(134217728);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 14;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
 BA.debugLineNum = 64;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","21179660",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",signup.mostCurrent.activityBA)),0);
 BA.debugLineNum = 65;BA.debugLine="xui.MsgboxAsync(LastException, \"Error\")";
Debug.ShouldStop(1);
parent._xui.runVoidMethod ("MsgboxAsync",signup.processBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent.__c.runMethod(false,"LastException",signup.mostCurrent.activityBA).getObject())),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))));
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",signup.processBA, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject _success) throws Exception{
}
public static void  _msgbox_result(RemoteObject _response) throws Exception{
}
}