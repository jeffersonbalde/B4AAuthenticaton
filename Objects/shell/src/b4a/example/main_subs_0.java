package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) { b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(b4a.example.main parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _firsttime;
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
int step13;
int limit13;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,26);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 27;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 4;
if (_firsttime.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 28;BA.debugLine="sql.Initialize(File.DirInternal, \"test.db\", True";
Debug.ShouldStop(134217728);
parent._sql.runVoidMethod ("Initialize",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("test.db")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 31;BA.debugLine="Wait For (dropTable) Complete (Success As Boolean";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "activity_create"), _droptable());
this.state = 21;
return;
case 21:
//C
this.state = 5;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 32;BA.debugLine="If Success Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 5:
//if
this.state = 8;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 36;BA.debugLine="Wait For (createTable) Complete (Success As Boole";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "activity_create"), _createtable());
this.state = 22;
return;
case 22:
//C
this.state = 9;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 37;BA.debugLine="If Success Then'";
Debug.ShouldStop(16);
if (true) break;

case 9:
//if
this.state = 20;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 38;BA.debugLine="Wait For (insertData) Complete (Success As Boole";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "activity_create"), _insertdata());
this.state = 23;
return;
case 23:
//C
this.state = 12;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 39;BA.debugLine="If Success Then";
Debug.ShouldStop(64);
if (true) break;

case 12:
//if
this.state = 19;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 40;BA.debugLine="Dim Cursor As Cursor";
Debug.ShouldStop(128);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 41;BA.debugLine="Cursor = sql.ExecQuery(\"SELECT * FROM table1\")";
Debug.ShouldStop(256);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent._sql.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM table1"))));Debug.locals.put("Cursor", _cursor);
 BA.debugLineNum = 42;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
Debug.ShouldStop(512);
if (true) break;

case 15:
//for
this.state = 18;
step13 = 1;
limit13 = RemoteObject.solve(new RemoteObject[] {_cursor.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 24;
if (true) break;

case 24:
//C
this.state = 18;
if ((step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13)) this.state = 17;
if (true) break;

case 25:
//C
this.state = 24;
_i = ((int)(0 + _i + step13)) ;
Debug.locals.put("i", _i);
if (true) break;

case 17:
//C
this.state = 25;
 BA.debugLineNum = 43;BA.debugLine="Cursor.Position = i";
Debug.ShouldStop(1024);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 45;BA.debugLine="Log($\"column1: ${Cursor.GetString(\"col1\")} \"$)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5131091",(RemoteObject.concat(RemoteObject.createImmutable("column1: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("col1")))))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 46;BA.debugLine="Log($\"column2: ${Cursor.GetString(\"col2\")} \"$)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5131092",(RemoteObject.concat(RemoteObject.createImmutable("column2: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("col2")))))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 47;BA.debugLine="Log($\"column3: ${Cursor.GetString(\"col3\")} \"$)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5131093",(RemoteObject.concat(RemoteObject.createImmutable("column3: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("col3")))))),RemoteObject.createImmutable(" "))),0);
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
Debug.locals.put("i", _i);
;
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 52;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(524288);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
if (true) break;

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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,59);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 59;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,55);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 55;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,63);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button1_click");}
 BA.debugLineNum = 63;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
Debug.ShouldStop(-2147483648);
main._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("Hello world!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("B4X"))));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtable() throws Exception{
try {
		Debug.PushSubsStack("createTable (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,67);
if (RapidSub.canDelegate("createtable")) { return b4a.example.main.remoteMe.runUserSub(false, "main","createtable");}
ResumableSub_createTable rsub = new ResumableSub_createTable(null);
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
public static class ResumableSub_createTable extends BA.ResumableSub {
public ResumableSub_createTable(b4a.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("createTable (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,67);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
 BA.debugLineNum = 68;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS tabl";
Debug.ShouldStop(8);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS table1 (col1 TEXT, col2 TEXT, col3 TEXT)")));
 BA.debugLineNum = 69;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
if (true) break;

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
public static RemoteObject  _droptable() throws Exception{
try {
		Debug.PushSubsStack("dropTable (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,77);
if (RapidSub.canDelegate("droptable")) { return b4a.example.main.remoteMe.runUserSub(false, "main","droptable");}
ResumableSub_dropTable rsub = new ResumableSub_dropTable(null);
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
public static class ResumableSub_dropTable extends BA.ResumableSub {
public ResumableSub_dropTable(b4a.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("dropTable (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,77);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
 BA.debugLineNum = 78;BA.debugLine="sql.ExecNonQuery(\"DROP TABLE table1\")";
Debug.ShouldStop(8192);
parent._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE table1")));
 BA.debugLineNum = 79;BA.debugLine="Return True";
Debug.ShouldStop(16384);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
if (true) break;

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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _insertdata() throws Exception{
try {
		Debug.PushSubsStack("insertData (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,72);
if (RapidSub.canDelegate("insertdata")) { return b4a.example.main.remoteMe.runUserSub(false, "main","insertdata");}
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
public ResumableSub_insertData(b4a.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("insertData (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,72);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
 BA.debugLineNum = 73;BA.debugLine="sql.ExecNonQuery2(\"INSERT INTO table1 (col1, col2";
Debug.ShouldStop(256);
parent._sql.runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO table1 (col1, col2, col3) VALUES (?,?,?)")),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("col1test1")),RemoteObject.createImmutable(("col2test1")),(RemoteObject.createImmutable("col3test1"))})))));
 BA.debugLineNum = 74;BA.debugLine="Return True";
Debug.ShouldStop(512);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
if (true) break;

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

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 19;BA.debugLine="Dim sql As SQL";
main._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}