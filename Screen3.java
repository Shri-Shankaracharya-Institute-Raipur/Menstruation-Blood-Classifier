package p004io.kodular.kajalnikunj1024.Classifier;

import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.StopBlocksExecution;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.C1168runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.C1189lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;
import org.jose4j.jws.AlgorithmIdentifiers;

/* renamed from: io.kodular.kajalnikunj1024.Classifier.Screen3 */
/* compiled from: Screen3.yail */
public class Screen3 extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10;
    static final IntNum Lit100;
    static final FString Lit101;
    static final FString Lit102;
    static final SimpleSymbol Lit103;
    static final FString Lit104;
    static final FString Lit105;
    static final SimpleSymbol Lit106;
    static final FString Lit107;
    static final FString Lit108;
    static final SimpleSymbol Lit109;
    static final SimpleSymbol Lit11;
    static final FString Lit110;
    static final FString Lit111;
    static final SimpleSymbol Lit112;
    static final FString Lit113;
    static final FString Lit114;
    static final SimpleSymbol Lit115;
    static final IntNum Lit116;
    static final FString Lit117;
    static final FString Lit118;
    static final SimpleSymbol Lit119;
    static final IntNum Lit12;
    static final FString Lit120;
    static final FString Lit121;
    static final SimpleSymbol Lit122;
    static final FString Lit123;
    static final FString Lit124;
    static final SimpleSymbol Lit125;
    static final FString Lit126;
    static final FString Lit127;
    static final SimpleSymbol Lit128;
    static final FString Lit129;
    static final SimpleSymbol Lit13;
    static final FString Lit130;
    static final SimpleSymbol Lit131;
    static final IntNum Lit132;
    static final IntNum Lit133;
    static final SimpleSymbol Lit134;
    static final IntNum Lit135 = IntNum.make(5);
    static final SimpleSymbol Lit136;
    static final IntNum Lit137 = IntNum.make(100);
    static final FString Lit138;
    static final FString Lit139;
    static final IntNum Lit14 = IntNum.make(23);
    static final SimpleSymbol Lit140;
    static final FString Lit141;
    static final FString Lit142;
    static final SimpleSymbol Lit143;
    static final IntNum Lit144;
    static final IntNum Lit145;
    static final FString Lit146;
    static final FString Lit147;
    static final SimpleSymbol Lit148;
    static final FString Lit149;
    static final SimpleSymbol Lit15;
    static final FString Lit150;
    static final SimpleSymbol Lit151;
    static final SimpleSymbol Lit152;
    static final FString Lit153;
    static final FString Lit154;
    static final SimpleSymbol Lit155;
    static final IntNum Lit156;
    static final FString Lit157;
    static final PairWithPosition Lit158;
    static final SimpleSymbol Lit159;
    static final IntNum Lit16;
    static final SimpleSymbol Lit160;
    static final SimpleSymbol Lit161;
    static final SimpleSymbol Lit162;
    static final SimpleSymbol Lit163;
    static final SimpleSymbol Lit164;
    static final SimpleSymbol Lit165;
    static final SimpleSymbol Lit166;
    static final SimpleSymbol Lit167;
    static final SimpleSymbol Lit168;
    static final SimpleSymbol Lit169;
    static final SimpleSymbol Lit17;
    static final SimpleSymbol Lit170;
    static final SimpleSymbol Lit171;
    static final SimpleSymbol Lit172;
    static final SimpleSymbol Lit173;
    static final SimpleSymbol Lit174;
    static final IntNum Lit18;
    static final SimpleSymbol Lit19;
    static final SimpleSymbol Lit2;
    static final SimpleSymbol Lit20;
    static final SimpleSymbol Lit21;
    static final SimpleSymbol Lit22;
    static final FString Lit23;
    static final SimpleSymbol Lit24;
    static final SimpleSymbol Lit25;
    static final IntNum Lit26 = IntNum.make(-2);
    static final SimpleSymbol Lit27;
    static final FString Lit28;
    static final FString Lit29;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final FString Lit31;
    static final FString Lit32;
    static final SimpleSymbol Lit33;
    static final SimpleSymbol Lit34;
    static final IntNum Lit35 = IntNum.make(3);
    static final IntNum Lit36 = IntNum.make(16777215);
    static final FString Lit37;
    static final FString Lit38;
    static final SimpleSymbol Lit39;
    static final IntNum Lit4;
    static final IntNum Lit40;
    static final SimpleSymbol Lit41;
    static final SimpleSymbol Lit42;
    static final IntNum Lit43 = IntNum.make(30);
    static final SimpleSymbol Lit44;
    static final IntNum Lit45 = IntNum.make(2);
    static final SimpleSymbol Lit46;
    static final IntNum Lit47 = IntNum.make(1);
    static final SimpleSymbol Lit48;
    static final IntNum Lit49 = IntNum.make((int) ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    static final SimpleSymbol Lit5;
    static final FString Lit50;
    static final FString Lit51;
    static final SimpleSymbol Lit52;
    static final IntNum Lit53 = IntNum.make(50);
    static final FString Lit54;
    static final FString Lit55;
    static final SimpleSymbol Lit56;
    static final IntNum Lit57 = IntNum.make(60);
    static final FString Lit58;
    static final FString Lit59;
    static final SimpleSymbol Lit6;
    static final SimpleSymbol Lit60;
    static final IntNum Lit61 = IntNum.make(25);
    static final SimpleSymbol Lit62;
    static final SimpleSymbol Lit63;
    static final IntNum Lit64;
    static final FString Lit65;
    static final FString Lit66;
    static final SimpleSymbol Lit67;
    static final FString Lit68;
    static final FString Lit69;
    static final IntNum Lit7;
    static final SimpleSymbol Lit70;
    static final IntNum Lit71 = IntNum.make(26);
    static final FString Lit72;
    static final FString Lit73;
    static final SimpleSymbol Lit74;
    static final IntNum Lit75;
    static final SimpleSymbol Lit76;
    static final SimpleSymbol Lit77;
    static final IntNum Lit78;
    static final FString Lit79;
    static final SimpleSymbol Lit8;
    static final FString Lit80;
    static final SimpleSymbol Lit81;
    static final FString Lit82;
    static final FString Lit83;
    static final SimpleSymbol Lit84;
    static final FString Lit85;
    static final FString Lit86;
    static final SimpleSymbol Lit87;
    static final FString Lit88;
    static final FString Lit89;
    static final SimpleSymbol Lit9;
    static final SimpleSymbol Lit90;
    static final FString Lit91;
    static final FString Lit92;
    static final SimpleSymbol Lit93;
    static final FString Lit94;
    static final FString Lit95;
    static final SimpleSymbol Lit96;
    static final FString Lit97;
    static final FString Lit98;
    static final SimpleSymbol Lit99;
    public static Screen3 Screen3;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn33 = null;
    static final ModuleMethod lambda$Fn34 = null;
    static final ModuleMethod lambda$Fn35 = null;
    static final ModuleMethod lambda$Fn36 = null;
    static final ModuleMethod lambda$Fn37 = null;
    static final ModuleMethod lambda$Fn38 = null;
    static final ModuleMethod lambda$Fn39 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn40 = null;
    static final ModuleMethod lambda$Fn41 = null;
    static final ModuleMethod lambda$Fn42 = null;
    static final ModuleMethod lambda$Fn43 = null;
    static final ModuleMethod lambda$Fn44 = null;
    static final ModuleMethod lambda$Fn45 = null;
    static final ModuleMethod lambda$Fn46 = null;
    static final ModuleMethod lambda$Fn47 = null;
    static final ModuleMethod lambda$Fn48 = null;
    static final ModuleMethod lambda$Fn49 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn50 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button Button2;
    public Button Button5;
    public final ModuleMethod Button5$Click;
    public HorizontalArrangement Horizontal_Arrangement1;
    public HorizontalArrangement Horizontal_Arrangement10;
    public HorizontalArrangement Horizontal_Arrangement11;
    public HorizontalArrangement Horizontal_Arrangement12;
    public HorizontalArrangement Horizontal_Arrangement13;
    public HorizontalArrangement Horizontal_Arrangement2;
    public HorizontalArrangement Horizontal_Arrangement4;
    public HorizontalArrangement Horizontal_Arrangement6;
    public HorizontalArrangement Horizontal_Arrangement7;
    public HorizontalArrangement Horizontal_Arrangement9;
    public HorizontalArrangement Horizontal_Arrangement9_copy;
    public HorizontalArrangement Horizontal_Arrangement9_copy_copy1;
    public HorizontalArrangement Horizontal_Arrangement9_copy_copy2;
    public Label Label1;
    public Label Label2;
    public Label Label3;
    public VerticalArrangement Vertical_Arrangement1;
    public VerticalArrangement Vertical_Arrangement10;
    public VerticalArrangement Vertical_Arrangement11;
    public VerticalArrangement Vertical_Arrangement12;
    public VerticalArrangement Vertical_Arrangement13;
    public VerticalArrangement Vertical_Arrangement2;
    public VerticalArrangement Vertical_Arrangement3;
    public VerticalArrangement Vertical_Arrangement5;
    public VerticalArrangement Vertical_Arrangement7;
    public VerticalArrangement Vertical_Arrangement8;
    public VerticalArrangement Vertical_Arrangement9;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public TextBox enter_age;
    public TextBox enter_name;
    public TextBox enter_weight;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    static {
        SimpleSymbol simpleSymbol;
        SimpleSymbol simpleSymbol2;
        SimpleSymbol simpleSymbol3;
        SimpleSymbol simpleSymbol4;
        SimpleSymbol simpleSymbol5;
        SimpleSymbol simpleSymbol6;
        SimpleSymbol simpleSymbol7;
        SimpleSymbol simpleSymbol8;
        SimpleSymbol simpleSymbol9;
        SimpleSymbol simpleSymbol10;
        SimpleSymbol simpleSymbol11;
        SimpleSymbol simpleSymbol12;
        SimpleSymbol simpleSymbol13;
        SimpleSymbol simpleSymbol14;
        SimpleSymbol simpleSymbol15;
        SimpleSymbol simpleSymbol16;
        SimpleSymbol simpleSymbol17;
        FString fString;
        SimpleSymbol simpleSymbol18;
        FString fString2;
        FString fString3;
        SimpleSymbol simpleSymbol19;
        SimpleSymbol simpleSymbol20;
        FString fString4;
        FString fString5;
        SimpleSymbol simpleSymbol21;
        FString fString6;
        FString fString7;
        SimpleSymbol simpleSymbol22;
        FString fString8;
        FString fString9;
        SimpleSymbol simpleSymbol23;
        FString fString10;
        FString fString11;
        SimpleSymbol simpleSymbol24;
        SimpleSymbol simpleSymbol25;
        SimpleSymbol simpleSymbol26;
        FString fString12;
        FString fString13;
        SimpleSymbol simpleSymbol27;
        FString fString14;
        FString fString15;
        SimpleSymbol simpleSymbol28;
        FString fString16;
        FString fString17;
        SimpleSymbol simpleSymbol29;
        FString fString18;
        FString fString19;
        SimpleSymbol simpleSymbol30;
        FString fString20;
        FString fString21;
        SimpleSymbol simpleSymbol31;
        FString fString22;
        FString fString23;
        SimpleSymbol simpleSymbol32;
        FString fString24;
        FString fString25;
        SimpleSymbol simpleSymbol33;
        FString fString26;
        FString fString27;
        SimpleSymbol simpleSymbol34;
        FString fString28;
        FString fString29;
        SimpleSymbol simpleSymbol35;
        FString fString30;
        FString fString31;
        SimpleSymbol simpleSymbol36;
        FString fString32;
        FString fString33;
        SimpleSymbol simpleSymbol37;
        FString fString34;
        FString fString35;
        SimpleSymbol simpleSymbol38;
        FString fString36;
        FString fString37;
        SimpleSymbol simpleSymbol39;
        FString fString38;
        FString fString39;
        SimpleSymbol simpleSymbol40;
        FString fString40;
        FString fString41;
        SimpleSymbol simpleSymbol41;
        FString fString42;
        FString fString43;
        SimpleSymbol simpleSymbol42;
        FString fString44;
        FString fString45;
        SimpleSymbol simpleSymbol43;
        SimpleSymbol simpleSymbol44;
        SimpleSymbol simpleSymbol45;
        FString fString46;
        FString fString47;
        SimpleSymbol simpleSymbol46;
        FString fString48;
        FString fString49;
        SimpleSymbol simpleSymbol47;
        FString fString50;
        FString fString51;
        SimpleSymbol simpleSymbol48;
        SimpleSymbol simpleSymbol49;
        SimpleSymbol simpleSymbol50;
        FString fString52;
        FString fString53;
        SimpleSymbol simpleSymbol51;
        FString fString54;
        FString fString55;
        SimpleSymbol simpleSymbol52;
        FString fString56;
        FString fString57;
        SimpleSymbol simpleSymbol53;
        SimpleSymbol simpleSymbol54;
        SimpleSymbol simpleSymbol55;
        SimpleSymbol simpleSymbol56;
        SimpleSymbol simpleSymbol57;
        SimpleSymbol simpleSymbol58;
        FString fString58;
        FString fString59;
        SimpleSymbol simpleSymbol59;
        SimpleSymbol simpleSymbol60;
        FString fString60;
        FString fString61;
        SimpleSymbol simpleSymbol61;
        FString fString62;
        FString fString63;
        SimpleSymbol simpleSymbol62;
        SimpleSymbol simpleSymbol63;
        SimpleSymbol simpleSymbol64;
        FString fString64;
        SimpleSymbol simpleSymbol65;
        SimpleSymbol simpleSymbol66;
        SimpleSymbol simpleSymbol67;
        SimpleSymbol simpleSymbol68;
        SimpleSymbol simpleSymbol69;
        SimpleSymbol simpleSymbol70;
        SimpleSymbol simpleSymbol71;
        SimpleSymbol simpleSymbol72;
        SimpleSymbol simpleSymbol73;
        SimpleSymbol simpleSymbol74;
        SimpleSymbol simpleSymbol75;
        SimpleSymbol simpleSymbol76;
        SimpleSymbol simpleSymbol77;
        SimpleSymbol simpleSymbol78;
        SimpleSymbol simpleSymbol79;
        SimpleSymbol simpleSymbol80;
        new SimpleSymbol("lookup-handler");
        Lit174 = (SimpleSymbol) simpleSymbol.readResolve();
        new SimpleSymbol("dispatchGenericEvent");
        Lit173 = (SimpleSymbol) simpleSymbol2.readResolve();
        new SimpleSymbol("dispatchEvent");
        Lit172 = (SimpleSymbol) simpleSymbol3.readResolve();
        new SimpleSymbol("send-error");
        Lit171 = (SimpleSymbol) simpleSymbol4.readResolve();
        new SimpleSymbol("add-to-form-do-after-creation");
        Lit170 = (SimpleSymbol) simpleSymbol5.readResolve();
        new SimpleSymbol("add-to-global-vars");
        Lit169 = (SimpleSymbol) simpleSymbol6.readResolve();
        new SimpleSymbol("add-to-components");
        Lit168 = (SimpleSymbol) simpleSymbol7.readResolve();
        new SimpleSymbol("add-to-events");
        Lit167 = (SimpleSymbol) simpleSymbol8.readResolve();
        new SimpleSymbol("add-to-global-var-environment");
        Lit166 = (SimpleSymbol) simpleSymbol9.readResolve();
        new SimpleSymbol("is-bound-in-form-environment");
        Lit165 = (SimpleSymbol) simpleSymbol10.readResolve();
        new SimpleSymbol("lookup-in-form-environment");
        Lit164 = (SimpleSymbol) simpleSymbol11.readResolve();
        new SimpleSymbol("add-to-form-environment");
        Lit163 = (SimpleSymbol) simpleSymbol12.readResolve();
        new SimpleSymbol("android-log-form");
        Lit162 = (SimpleSymbol) simpleSymbol13.readResolve();
        new SimpleSymbol("get-simple-name");
        Lit161 = (SimpleSymbol) simpleSymbol14.readResolve();
        new SimpleSymbol("Click");
        Lit160 = (SimpleSymbol) simpleSymbol15.readResolve();
        new SimpleSymbol("Button5$Click");
        Lit159 = (SimpleSymbol) simpleSymbol16.readResolve();
        new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT);
        SimpleSymbol simpleSymbol81 = (SimpleSymbol) simpleSymbol17.readResolve();
        Lit9 = simpleSymbol81;
        Lit158 = PairWithPosition.make(simpleSymbol81, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/Screen3.yail", 1351758);
        new FString("com.google.appinventor.components.runtime.Button");
        Lit157 = fString;
        int[] iArr = new int[2];
        iArr[0] = -13463672;
        Lit156 = IntNum.make(iArr);
        new SimpleSymbol("Button5");
        Lit155 = (SimpleSymbol) simpleSymbol18.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit154 = fString2;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit153 = fString3;
        new SimpleSymbol("Clickable");
        Lit152 = (SimpleSymbol) simpleSymbol19.readResolve();
        new SimpleSymbol("Vertical_Arrangement8");
        Lit151 = (SimpleSymbol) simpleSymbol20.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit150 = fString4;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit149 = fString5;
        new SimpleSymbol("Vertical_Arrangement13");
        Lit148 = (SimpleSymbol) simpleSymbol21.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit147 = fString6;
        new FString("com.google.appinventor.components.runtime.TextBox");
        Lit146 = fString7;
        int[] iArr2 = new int[2];
        iArr2[0] = -6381922;
        Lit145 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -1;
        Lit144 = IntNum.make(iArr3);
        new SimpleSymbol("enter_weight");
        Lit143 = (SimpleSymbol) simpleSymbol22.readResolve();
        new FString("com.google.appinventor.components.runtime.TextBox");
        Lit142 = fString8;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit141 = fString9;
        new SimpleSymbol("Horizontal_Arrangement9");
        Lit140 = (SimpleSymbol) simpleSymbol23.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit139 = fString10;
        new FString("com.google.appinventor.components.runtime.TextBox");
        Lit138 = fString11;
        new SimpleSymbol("MultiLine");
        Lit136 = (SimpleSymbol) simpleSymbol24.readResolve();
        new SimpleSymbol("InputType");
        Lit134 = (SimpleSymbol) simpleSymbol25.readResolve();
        int[] iArr4 = new int[2];
        iArr4[0] = -6381922;
        Lit133 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -1;
        Lit132 = IntNum.make(iArr5);
        new SimpleSymbol("enter_age");
        Lit131 = (SimpleSymbol) simpleSymbol26.readResolve();
        new FString("com.google.appinventor.components.runtime.TextBox");
        Lit130 = fString12;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit129 = fString13;
        new SimpleSymbol("Horizontal_Arrangement7");
        Lit128 = (SimpleSymbol) simpleSymbol27.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit127 = fString14;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit126 = fString15;
        new SimpleSymbol("Horizontal_Arrangement9_copy");
        Lit125 = (SimpleSymbol) simpleSymbol28.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit124 = fString16;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit123 = fString17;
        new SimpleSymbol("Horizontal_Arrangement6");
        Lit122 = (SimpleSymbol) simpleSymbol29.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit121 = fString18;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit120 = fString19;
        new SimpleSymbol("Vertical_Arrangement12");
        Lit119 = (SimpleSymbol) simpleSymbol30.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit118 = fString20;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit117 = fString21;
        int[] iArr6 = new int[2];
        iArr6[0] = -10395295;
        Lit116 = IntNum.make(iArr6);
        new SimpleSymbol("Label3");
        Lit115 = (SimpleSymbol) simpleSymbol31.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit114 = fString22;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit113 = fString23;
        new SimpleSymbol("Horizontal_Arrangement11");
        Lit112 = (SimpleSymbol) simpleSymbol32.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit111 = fString24;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit110 = fString25;
        new SimpleSymbol("Horizontal_Arrangement4");
        Lit109 = (SimpleSymbol) simpleSymbol33.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit108 = fString26;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit107 = fString27;
        new SimpleSymbol("Horizontal_Arrangement13");
        Lit106 = (SimpleSymbol) simpleSymbol34.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit105 = fString28;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit104 = fString29;
        new SimpleSymbol("Horizontal_Arrangement10");
        Lit103 = (SimpleSymbol) simpleSymbol35.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit102 = fString30;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit101 = fString31;
        int[] iArr7 = new int[2];
        iArr7[0] = -10395295;
        Lit100 = IntNum.make(iArr7);
        new SimpleSymbol("Label2");
        Lit99 = (SimpleSymbol) simpleSymbol36.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit98 = fString32;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit97 = fString33;
        new SimpleSymbol("Horizontal_Arrangement12");
        Lit96 = (SimpleSymbol) simpleSymbol37.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit95 = fString34;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit94 = fString35;
        new SimpleSymbol("Horizontal_Arrangement2");
        Lit93 = (SimpleSymbol) simpleSymbol38.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit92 = fString36;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit91 = fString37;
        new SimpleSymbol("Horizontal_Arrangement1");
        Lit90 = (SimpleSymbol) simpleSymbol39.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit89 = fString38;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit88 = fString39;
        new SimpleSymbol("Vertical_Arrangement7");
        Lit87 = (SimpleSymbol) simpleSymbol40.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit86 = fString40;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit85 = fString41;
        new SimpleSymbol("Vertical_Arrangement5");
        Lit84 = (SimpleSymbol) simpleSymbol41.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit83 = fString42;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit82 = fString43;
        new SimpleSymbol("Vertical_Arrangement11");
        Lit81 = (SimpleSymbol) simpleSymbol42.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit80 = fString44;
        new FString("com.google.appinventor.components.runtime.TextBox");
        Lit79 = fString45;
        int[] iArr8 = new int[2];
        iArr8[0] = -6381922;
        Lit78 = IntNum.make(iArr8);
        new SimpleSymbol("HintColor");
        Lit77 = (SimpleSymbol) simpleSymbol43.readResolve();
        new SimpleSymbol("Hint");
        Lit76 = (SimpleSymbol) simpleSymbol44.readResolve();
        int[] iArr9 = new int[2];
        iArr9[0] = -1;
        Lit75 = IntNum.make(iArr9);
        new SimpleSymbol("enter_name");
        Lit74 = (SimpleSymbol) simpleSymbol45.readResolve();
        new FString("com.google.appinventor.components.runtime.TextBox");
        Lit73 = fString46;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit72 = fString47;
        new SimpleSymbol("Horizontal_Arrangement9_copy_copy2");
        Lit70 = (SimpleSymbol) simpleSymbol46.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit69 = fString48;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit68 = fString49;
        new SimpleSymbol("Horizontal_Arrangement9_copy_copy1");
        Lit67 = (SimpleSymbol) simpleSymbol47.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit66 = fString50;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit65 = fString51;
        int[] iArr10 = new int[2];
        iArr10[0] = -10395295;
        Lit64 = IntNum.make(iArr10);
        new SimpleSymbol("TextColor");
        Lit63 = (SimpleSymbol) simpleSymbol48.readResolve();
        new SimpleSymbol("TextAlignment");
        Lit62 = (SimpleSymbol) simpleSymbol49.readResolve();
        new SimpleSymbol("Label1");
        Lit60 = (SimpleSymbol) simpleSymbol50.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit59 = fString52;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit58 = fString53;
        new SimpleSymbol("Vertical_Arrangement3");
        Lit56 = (SimpleSymbol) simpleSymbol51.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit55 = fString54;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit54 = fString55;
        new SimpleSymbol("Vertical_Arrangement10");
        Lit52 = (SimpleSymbol) simpleSymbol52.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit51 = fString56;
        new FString("com.google.appinventor.components.runtime.Button");
        Lit50 = fString57;
        new SimpleSymbol("Text");
        Lit48 = (SimpleSymbol) simpleSymbol53.readResolve();
        new SimpleSymbol("Shape");
        Lit46 = (SimpleSymbol) simpleSymbol54.readResolve();
        new SimpleSymbol("FontTypeface");
        Lit44 = (SimpleSymbol) simpleSymbol55.readResolve();
        new SimpleSymbol("FontSize");
        Lit42 = (SimpleSymbol) simpleSymbol56.readResolve();
        new SimpleSymbol("FontBold");
        Lit41 = (SimpleSymbol) simpleSymbol57.readResolve();
        int[] iArr11 = new int[2];
        iArr11[0] = -13463672;
        Lit40 = IntNum.make(iArr11);
        new SimpleSymbol("Button2");
        Lit39 = (SimpleSymbol) simpleSymbol58.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit38 = fString58;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit37 = fString59;
        new SimpleSymbol("AlignHorizontal");
        Lit34 = (SimpleSymbol) simpleSymbol59.readResolve();
        new SimpleSymbol("Vertical_Arrangement2");
        Lit33 = (SimpleSymbol) simpleSymbol60.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit32 = fString60;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit31 = fString61;
        new SimpleSymbol("Vertical_Arrangement9");
        Lit30 = (SimpleSymbol) simpleSymbol61.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit29 = fString62;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit28 = fString63;
        new SimpleSymbol("Width");
        Lit27 = (SimpleSymbol) simpleSymbol62.readResolve();
        new SimpleSymbol("Height");
        Lit25 = (SimpleSymbol) simpleSymbol63.readResolve();
        new SimpleSymbol("Vertical_Arrangement1");
        Lit24 = (SimpleSymbol) simpleSymbol64.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit23 = fString64;
        new SimpleSymbol("boolean");
        Lit22 = (SimpleSymbol) simpleSymbol65.readResolve();
        new SimpleSymbol("TitleVisible");
        Lit21 = (SimpleSymbol) simpleSymbol66.readResolve();
        new SimpleSymbol("Title");
        Lit20 = (SimpleSymbol) simpleSymbol67.readResolve();
        new SimpleSymbol("ReceiveSharedText");
        Lit19 = (SimpleSymbol) simpleSymbol68.readResolve();
        int[] iArr12 = new int[2];
        iArr12[0] = -32615864;
        Lit18 = IntNum.make(iArr12);
        new SimpleSymbol("PrimaryColorDark");
        Lit17 = (SimpleSymbol) simpleSymbol69.readResolve();
        int[] iArr13 = new int[2];
        iArr13[0] = -26950686;
        Lit16 = IntNum.make(iArr13);
        new SimpleSymbol("PrimaryColor");
        Lit15 = (SimpleSymbol) simpleSymbol70.readResolve();
        new SimpleSymbol("MinSdk");
        Lit13 = (SimpleSymbol) simpleSymbol71.readResolve();
        int[] iArr14 = new int[2];
        iArr14[0] = -722477;
        Lit12 = IntNum.make(iArr14);
        new SimpleSymbol("BackgroundColor");
        Lit11 = (SimpleSymbol) simpleSymbol72.readResolve();
        new SimpleSymbol("AppName");
        Lit10 = (SimpleSymbol) simpleSymbol73.readResolve();
        new SimpleSymbol("AppId");
        Lit8 = (SimpleSymbol) simpleSymbol74.readResolve();
        int[] iArr15 = new int[2];
        iArr15[0] = -92160;
        Lit7 = IntNum.make(iArr15);
        new SimpleSymbol("AccentColor");
        Lit6 = (SimpleSymbol) simpleSymbol75.readResolve();
        new SimpleSymbol("number");
        Lit5 = (SimpleSymbol) simpleSymbol76.readResolve();
        int[] iArr16 = new int[2];
        iArr16[0] = -17564930;
        Lit4 = IntNum.make(iArr16);
        new SimpleSymbol("AboutScreenBackgroundColor");
        Lit3 = (SimpleSymbol) simpleSymbol77.readResolve();
        new SimpleSymbol("*the-null-value*");
        Lit2 = (SimpleSymbol) simpleSymbol78.readResolve();
        new SimpleSymbol("getMessage");
        Lit1 = (SimpleSymbol) simpleSymbol79.readResolve();
        new SimpleSymbol("Screen3");
        Lit0 = (SimpleSymbol) simpleSymbol80.readResolve();
    }

    public Screen3() {
        ModuleMethod moduleMethod;
        frame frame2;
        ModuleMethod moduleMethod2;
        ModuleMethod moduleMethod3;
        ModuleMethod moduleMethod4;
        ModuleMethod moduleMethod5;
        ModuleMethod moduleMethod6;
        ModuleMethod moduleMethod7;
        ModuleMethod moduleMethod8;
        ModuleMethod moduleMethod9;
        ModuleMethod moduleMethod10;
        ModuleMethod moduleMethod11;
        ModuleMethod moduleMethod12;
        ModuleMethod moduleMethod13;
        ModuleMethod moduleMethod14;
        ModuleMethod moduleMethod15;
        ModuleMethod moduleMethod16;
        ModuleMethod moduleMethod17;
        ModuleMethod moduleMethod18;
        ModuleMethod moduleMethod19;
        ModuleMethod moduleMethod20;
        ModuleMethod moduleMethod21;
        ModuleMethod moduleMethod22;
        ModuleMethod moduleMethod23;
        ModuleMethod moduleMethod24;
        ModuleMethod moduleMethod25;
        ModuleMethod moduleMethod26;
        ModuleMethod moduleMethod27;
        ModuleMethod moduleMethod28;
        ModuleMethod moduleMethod29;
        ModuleMethod moduleMethod30;
        ModuleMethod moduleMethod31;
        ModuleMethod moduleMethod32;
        ModuleMethod moduleMethod33;
        ModuleMethod moduleMethod34;
        ModuleMethod moduleMethod35;
        ModuleMethod moduleMethod36;
        ModuleMethod moduleMethod37;
        ModuleMethod moduleMethod38;
        ModuleMethod moduleMethod39;
        ModuleMethod moduleMethod40;
        ModuleMethod moduleMethod41;
        ModuleMethod moduleMethod42;
        ModuleMethod moduleMethod43;
        ModuleMethod moduleMethod44;
        ModuleMethod moduleMethod45;
        ModuleMethod moduleMethod46;
        ModuleMethod moduleMethod47;
        ModuleMethod moduleMethod48;
        ModuleMethod moduleMethod49;
        ModuleMethod moduleMethod50;
        ModuleMethod moduleMethod51;
        ModuleMethod moduleMethod52;
        ModuleMethod moduleMethod53;
        ModuleMethod moduleMethod54;
        ModuleMethod moduleMethod55;
        ModuleMethod moduleMethod56;
        ModuleMethod moduleMethod57;
        ModuleMethod moduleMethod58;
        ModuleMethod moduleMethod59;
        ModuleMethod moduleMethod60;
        ModuleMethod moduleMethod61;
        ModuleMethod moduleMethod62;
        ModuleMethod moduleMethod63;
        ModuleMethod moduleMethod64;
        ModuleMethod moduleMethod65;
        ModuleMethod moduleMethod66;
        ModuleMethod moduleMethod67;
        ModuleInfo.register(this);
        ModuleMethod moduleMethod68 = moduleMethod;
        new frame();
        frame frame3 = frame2;
        frame3.$main = this;
        frame frame4 = frame3;
        new ModuleMethod(frame4, 1, Lit161, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.get$Mnsimple$Mnname = moduleMethod68;
        new ModuleMethod(frame4, 2, Lit162, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = moduleMethod2;
        new ModuleMethod(frame4, 3, Lit163, 8194);
        this.add$Mnto$Mnform$Mnenvironment = moduleMethod3;
        new ModuleMethod(frame4, 4, Lit164, 8193);
        this.lookup$Mnin$Mnform$Mnenvironment = moduleMethod4;
        new ModuleMethod(frame4, 6, Lit165, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = moduleMethod5;
        new ModuleMethod(frame4, 7, Lit166, 8194);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = moduleMethod6;
        new ModuleMethod(frame4, 8, Lit167, 8194);
        this.add$Mnto$Mnevents = moduleMethod7;
        new ModuleMethod(frame4, 9, Lit168, 16388);
        this.add$Mnto$Mncomponents = moduleMethod8;
        new ModuleMethod(frame4, 10, Lit169, 8194);
        this.add$Mnto$Mnglobal$Mnvars = moduleMethod9;
        new ModuleMethod(frame4, 11, Lit170, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = moduleMethod10;
        new ModuleMethod(frame4, 12, Lit171, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = moduleMethod11;
        new ModuleMethod(frame4, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = moduleMethod12;
        new ModuleMethod(frame4, 14, Lit172, 16388);
        this.dispatchEvent = moduleMethod13;
        new ModuleMethod(frame4, 15, Lit173, 16388);
        this.dispatchGenericEvent = moduleMethod14;
        new ModuleMethod(frame4, 16, Lit174, 8194);
        this.lookup$Mnhandler = moduleMethod15;
        new ModuleMethod(frame4, 17, (Object) null, 0);
        ModuleMethod moduleMethod69 = moduleMethod16;
        moduleMethod69.setProperty("source-location", "/tmp/runtime2211785962717768109.scm:620");
        lambda$Fn1 = moduleMethod69;
        new ModuleMethod(frame4, 18, "$define", 0);
        this.$define = moduleMethod17;
        new ModuleMethod(frame4, 19, (Object) null, 0);
        lambda$Fn2 = moduleMethod18;
        new ModuleMethod(frame4, 20, (Object) null, 0);
        lambda$Fn3 = moduleMethod19;
        new ModuleMethod(frame4, 21, (Object) null, 0);
        lambda$Fn4 = moduleMethod20;
        new ModuleMethod(frame4, 22, (Object) null, 0);
        lambda$Fn5 = moduleMethod21;
        new ModuleMethod(frame4, 23, (Object) null, 0);
        lambda$Fn6 = moduleMethod22;
        new ModuleMethod(frame4, 24, (Object) null, 0);
        lambda$Fn7 = moduleMethod23;
        new ModuleMethod(frame4, 25, (Object) null, 0);
        lambda$Fn8 = moduleMethod24;
        new ModuleMethod(frame4, 26, (Object) null, 0);
        lambda$Fn9 = moduleMethod25;
        new ModuleMethod(frame4, 27, (Object) null, 0);
        lambda$Fn10 = moduleMethod26;
        new ModuleMethod(frame4, 28, (Object) null, 0);
        lambda$Fn11 = moduleMethod27;
        new ModuleMethod(frame4, 29, (Object) null, 0);
        lambda$Fn12 = moduleMethod28;
        new ModuleMethod(frame4, 30, (Object) null, 0);
        lambda$Fn13 = moduleMethod29;
        new ModuleMethod(frame4, 31, (Object) null, 0);
        lambda$Fn14 = moduleMethod30;
        new ModuleMethod(frame4, 32, (Object) null, 0);
        lambda$Fn15 = moduleMethod31;
        new ModuleMethod(frame4, 33, (Object) null, 0);
        lambda$Fn16 = moduleMethod32;
        new ModuleMethod(frame4, 34, (Object) null, 0);
        lambda$Fn17 = moduleMethod33;
        new ModuleMethod(frame4, 35, (Object) null, 0);
        lambda$Fn18 = moduleMethod34;
        new ModuleMethod(frame4, 36, (Object) null, 0);
        lambda$Fn19 = moduleMethod35;
        new ModuleMethod(frame4, 37, (Object) null, 0);
        lambda$Fn20 = moduleMethod36;
        new ModuleMethod(frame4, 38, (Object) null, 0);
        lambda$Fn21 = moduleMethod37;
        new ModuleMethod(frame4, 39, (Object) null, 0);
        lambda$Fn22 = moduleMethod38;
        new ModuleMethod(frame4, 40, (Object) null, 0);
        lambda$Fn23 = moduleMethod39;
        new ModuleMethod(frame4, 41, (Object) null, 0);
        lambda$Fn24 = moduleMethod40;
        new ModuleMethod(frame4, 42, (Object) null, 0);
        lambda$Fn25 = moduleMethod41;
        new ModuleMethod(frame4, 43, (Object) null, 0);
        lambda$Fn26 = moduleMethod42;
        new ModuleMethod(frame4, 44, (Object) null, 0);
        lambda$Fn27 = moduleMethod43;
        new ModuleMethod(frame4, 45, (Object) null, 0);
        lambda$Fn28 = moduleMethod44;
        new ModuleMethod(frame4, 46, (Object) null, 0);
        lambda$Fn29 = moduleMethod45;
        new ModuleMethod(frame4, 47, (Object) null, 0);
        lambda$Fn30 = moduleMethod46;
        new ModuleMethod(frame4, 48, (Object) null, 0);
        lambda$Fn31 = moduleMethod47;
        new ModuleMethod(frame4, 49, (Object) null, 0);
        lambda$Fn32 = moduleMethod48;
        new ModuleMethod(frame4, 50, (Object) null, 0);
        lambda$Fn33 = moduleMethod49;
        new ModuleMethod(frame4, 51, (Object) null, 0);
        lambda$Fn34 = moduleMethod50;
        new ModuleMethod(frame4, 52, (Object) null, 0);
        lambda$Fn35 = moduleMethod51;
        new ModuleMethod(frame4, 53, (Object) null, 0);
        lambda$Fn36 = moduleMethod52;
        new ModuleMethod(frame4, 54, (Object) null, 0);
        lambda$Fn37 = moduleMethod53;
        new ModuleMethod(frame4, 55, (Object) null, 0);
        lambda$Fn38 = moduleMethod54;
        new ModuleMethod(frame4, 56, (Object) null, 0);
        lambda$Fn39 = moduleMethod55;
        new ModuleMethod(frame4, 57, (Object) null, 0);
        lambda$Fn40 = moduleMethod56;
        new ModuleMethod(frame4, 58, (Object) null, 0);
        lambda$Fn41 = moduleMethod57;
        new ModuleMethod(frame4, 59, (Object) null, 0);
        lambda$Fn42 = moduleMethod58;
        new ModuleMethod(frame4, 60, (Object) null, 0);
        lambda$Fn43 = moduleMethod59;
        new ModuleMethod(frame4, 61, (Object) null, 0);
        lambda$Fn44 = moduleMethod60;
        new ModuleMethod(frame4, 62, (Object) null, 0);
        lambda$Fn45 = moduleMethod61;
        new ModuleMethod(frame4, 63, (Object) null, 0);
        lambda$Fn46 = moduleMethod62;
        new ModuleMethod(frame4, 64, (Object) null, 0);
        lambda$Fn47 = moduleMethod63;
        new ModuleMethod(frame4, 65, (Object) null, 0);
        lambda$Fn48 = moduleMethod64;
        new ModuleMethod(frame4, 66, (Object) null, 0);
        lambda$Fn49 = moduleMethod65;
        new ModuleMethod(frame4, 67, (Object) null, 0);
        lambda$Fn50 = moduleMethod66;
        new ModuleMethod(frame4, 68, Lit159, 0);
        this.Button5$Click = moduleMethod67;
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        Throwable th;
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        Throwable th;
        String obj;
        Throwable th2;
        Object obj2;
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        Object obj3 = find;
        try {
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            Object[] objArr = new Object[2];
            objArr[0] = misc.symbol$To$String(Lit0);
            Object[] objArr2 = objArr;
            objArr2[1] = "-global-vars";
            FString stringAppend = strings.stringAppend(objArr2);
            FString fString = stringAppend;
            if (stringAppend == null) {
                obj = null;
            } else {
                obj = fString.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(obj);
            Screen3 = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            Object find2 = require.find("com.google.youngandroid.runtime");
            Object obj4 = find2;
            try {
                ((Runnable) find2).run();
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
                    Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Lit7, Lit5);
                    Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "6063526160367616", Lit9);
                    Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "Classifier", Lit9);
                    Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Lit12, Lit5);
                    Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Lit14, Lit5);
                    Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit15, Lit16, Lit5);
                    Object andCoerceProperty$Ex8 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit17, Lit18, Lit5);
                    Object andCoerceProperty$Ex9 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit19, AlgorithmIdentifiers.NONE, Lit9);
                    Object andCoerceProperty$Ex10 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit20, "Screen3", Lit9);
                    Values.writeValues(C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit21, Boolean.FALSE, Lit22), $result);
                } else {
                    new Promise(lambda$Fn2);
                    addToFormDoAfterCreation(obj2);
                }
                this.Vertical_Arrangement1 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit23, Lit24, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit28, Lit24, lambda$Fn4);
                }
                this.Vertical_Arrangement9 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit24, Lit29, Lit30, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit24, Lit31, Lit30, lambda$Fn6);
                }
                this.Vertical_Arrangement2 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit24, Lit32, Lit33, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit24, Lit37, Lit33, lambda$Fn8);
                }
                this.Button2 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit33, Lit38, Lit39, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit33, Lit50, Lit39, lambda$Fn10);
                }
                this.Vertical_Arrangement10 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit24, Lit51, Lit52, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit24, Lit54, Lit52, lambda$Fn12);
                }
                this.Vertical_Arrangement3 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit24, Lit55, Lit56, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit24, Lit58, Lit56, lambda$Fn14);
                }
                this.Label1 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit56, Lit59, Lit60, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit56, Lit65, Lit60, lambda$Fn16);
                }
                this.Horizontal_Arrangement9_copy_copy1 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit24, Lit66, Lit67, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit24, Lit68, Lit67, lambda$Fn18);
                }
                this.Horizontal_Arrangement9_copy_copy2 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit67, Lit69, Lit70, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit67, Lit72, Lit70, lambda$Fn20);
                }
                this.enter_name = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit67, Lit73, Lit74, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit67, Lit79, Lit74, lambda$Fn22);
                }
                this.Vertical_Arrangement11 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit24, Lit80, Lit81, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit24, Lit82, Lit81, lambda$Fn24);
                }
                this.Vertical_Arrangement5 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit24, Lit83, Lit84, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit24, Lit85, Lit84, lambda$Fn26);
                }
                this.Vertical_Arrangement7 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit84, Lit86, Lit87, lambda$Fn27), $result);
                } else {
                    addToComponents(Lit84, Lit88, Lit87, lambda$Fn28);
                }
                this.Horizontal_Arrangement1 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit87, Lit89, Lit90, lambda$Fn29), $result);
                } else {
                    addToComponents(Lit87, Lit91, Lit90, lambda$Fn30);
                }
                this.Horizontal_Arrangement2 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit90, Lit92, Lit93, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit90, Lit94, Lit93, Boolean.FALSE);
                }
                this.Horizontal_Arrangement12 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit93, Lit95, Lit96, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit93, Lit97, Lit96, Boolean.FALSE);
                }
                this.Label2 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit96, Lit98, Lit99, lambda$Fn31), $result);
                } else {
                    addToComponents(Lit96, Lit101, Lit99, lambda$Fn32);
                }
                this.Horizontal_Arrangement10 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit90, Lit102, Lit103, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit90, Lit104, Lit103, Boolean.FALSE);
                }
                this.Horizontal_Arrangement13 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit90, Lit105, Lit106, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit90, Lit107, Lit106, Boolean.FALSE);
                }
                this.Horizontal_Arrangement4 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit90, Lit108, Lit109, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit90, Lit110, Lit109, Boolean.FALSE);
                }
                this.Horizontal_Arrangement11 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit109, Lit111, Lit112, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit109, Lit113, Lit112, Boolean.FALSE);
                }
                this.Label3 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit112, Lit114, Lit115, lambda$Fn33), $result);
                } else {
                    addToComponents(Lit112, Lit117, Lit115, lambda$Fn34);
                }
                this.Vertical_Arrangement12 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit84, Lit118, Lit119, lambda$Fn35), $result);
                } else {
                    addToComponents(Lit84, Lit120, Lit119, lambda$Fn36);
                }
                this.Horizontal_Arrangement6 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit119, Lit121, Lit122, lambda$Fn37), $result);
                } else {
                    addToComponents(Lit119, Lit123, Lit122, lambda$Fn38);
                }
                this.Horizontal_Arrangement9_copy = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit122, Lit124, Lit125, lambda$Fn39), $result);
                } else {
                    addToComponents(Lit122, Lit126, Lit125, lambda$Fn40);
                }
                this.Horizontal_Arrangement7 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit122, Lit127, Lit128, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit122, Lit129, Lit128, Boolean.FALSE);
                }
                this.enter_age = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit128, Lit130, Lit131, lambda$Fn41), $result);
                } else {
                    addToComponents(Lit128, Lit138, Lit131, lambda$Fn42);
                }
                this.Horizontal_Arrangement9 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit122, Lit139, Lit140, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit122, Lit141, Lit140, Boolean.FALSE);
                }
                this.enter_weight = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit122, Lit142, Lit143, lambda$Fn43), $result);
                } else {
                    addToComponents(Lit122, Lit146, Lit143, lambda$Fn44);
                }
                this.Vertical_Arrangement13 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit84, Lit147, Lit148, lambda$Fn45), $result);
                } else {
                    addToComponents(Lit84, Lit149, Lit148, lambda$Fn46);
                }
                this.Vertical_Arrangement8 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit84, Lit150, Lit151, lambda$Fn47), $result);
                } else {
                    addToComponents(Lit84, Lit153, Lit151, lambda$Fn48);
                }
                this.Button5 = null;
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(C1168runtime.addComponentWithinRepl(Lit151, Lit154, Lit155, lambda$Fn49), $result);
                } else {
                    addToComponents(Lit151, Lit157, Lit155, lambda$Fn50);
                }
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object addToCurrentFormEnvironment = C1168runtime.addToCurrentFormEnvironment(Lit159, this.Button5$Click);
                } else {
                    addToFormEnvironment(Lit159, this.Button5$Click);
                }
                if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "Button5", "Click");
                } else {
                    addToEvents(Lit155, Lit160);
                }
                C1168runtime.initRuntime();
            } catch (ClassCastException e) {
                ClassCastException classCastException = e;
                Throwable th3 = th2;
                new WrongType(classCastException, "java.lang.Runnable.run()", 1, obj4);
                throw th3;
            }
        } catch (ClassCastException e2) {
            ClassCastException classCastException2 = e2;
            Throwable th4 = th;
            new WrongType(classCastException2, "java.lang.Runnable.run()", 1, obj3);
            throw th4;
        }
    }

    static Object lambda3() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Lit7, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "6063526160367616", Lit9);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "Classifier", Lit9);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Lit12, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Lit14, Lit5);
        Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit15, Lit16, Lit5);
        Object andCoerceProperty$Ex8 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit17, Lit18, Lit5);
        Object andCoerceProperty$Ex9 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit19, AlgorithmIdentifiers.NONE, Lit9);
        Object andCoerceProperty$Ex10 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit20, "Screen3", Lit9);
        return C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit21, Boolean.FALSE, Lit22);
    }

    static Object lambda4() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit24, Lit25, Lit26, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit24, Lit27, Lit26, Lit5);
    }

    static Object lambda5() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit24, Lit25, Lit26, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit24, Lit27, Lit26, Lit5);
    }

    static Object lambda6() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit30, Lit27, Lit26, Lit5);
    }

    static Object lambda7() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit30, Lit27, Lit26, Lit5);
    }

    static Object lambda8() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit33, Lit34, Lit35, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit33, Lit11, Lit36, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit33, Lit27, Lit26, Lit5);
    }

    static Object lambda9() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit33, Lit34, Lit35, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit33, Lit11, Lit36, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit33, Lit27, Lit26, Lit5);
    }

    static Object lambda10() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit39, Lit11, Lit40, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit39, Lit41, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit39, Lit42, Lit43, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit39, Lit44, Lit45, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit39, Lit46, Lit47, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit39, Lit48, "Register", Lit9);
        return C1168runtime.setAndCoerceProperty$Ex(Lit39, Lit27, Lit49, Lit5);
    }

    static Object lambda11() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit39, Lit11, Lit40, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit39, Lit41, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit39, Lit42, Lit43, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit39, Lit44, Lit45, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit39, Lit46, Lit47, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit39, Lit48, "Register", Lit9);
        return C1168runtime.setAndCoerceProperty$Ex(Lit39, Lit27, Lit49, Lit5);
    }

    static Object lambda12() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit52, Lit25, Lit53, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit52, Lit27, Lit26, Lit5);
    }

    static Object lambda13() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit52, Lit25, Lit53, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit52, Lit27, Lit26, Lit5);
    }

    static Object lambda14() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit56, Lit25, Lit57, Lit5);
    }

    static Object lambda15() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit56, Lit25, Lit57, Lit5);
    }

    static Object lambda16() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit60, Lit41, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit60, Lit42, Lit61, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit60, Lit44, Lit45, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit60, Lit48, "    Name", Lit9);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit60, Lit62, Lit47, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit60, Lit63, Lit64, Lit5);
    }

    static Object lambda17() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit60, Lit41, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit60, Lit42, Lit61, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit60, Lit44, Lit45, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit60, Lit48, "    Name", Lit9);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit60, Lit62, Lit47, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit60, Lit63, Lit64, Lit5);
    }

    static Object lambda18() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit67, Lit27, Lit26, Lit5);
    }

    static Object lambda19() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit67, Lit27, Lit26, Lit5);
    }

    static Object lambda20() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit70, Lit27, Lit71, Lit5);
    }

    static Object lambda21() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit70, Lit27, Lit71, Lit5);
    }

    static Object lambda22() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit74, Lit11, Lit75, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit74, Lit76, "Enter your name", Lit9);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit74, Lit77, Lit78, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit74, Lit27, Lit49, Lit5);
    }

    static Object lambda23() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit74, Lit11, Lit75, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit74, Lit76, "Enter your name", Lit9);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit74, Lit77, Lit78, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit74, Lit27, Lit49, Lit5);
    }

    static Object lambda24() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit81, Lit25, Lit43, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit81, Lit27, Lit26, Lit5);
    }

    static Object lambda25() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit81, Lit25, Lit43, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit81, Lit27, Lit26, Lit5);
    }

    static Object lambda26() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit84, Lit25, Lit26, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit84, Lit27, Lit26, Lit5);
    }

    static Object lambda27() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit84, Lit25, Lit26, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit84, Lit27, Lit26, Lit5);
    }

    static Object lambda28() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit87, Lit27, Lit26, Lit5);
    }

    static Object lambda29() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit87, Lit27, Lit26, Lit5);
    }

    static Object lambda30() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit90, Lit25, Lit26, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit90, Lit27, Lit26, Lit5);
    }

    static Object lambda31() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit90, Lit25, Lit26, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit90, Lit27, Lit26, Lit5);
    }

    static Object lambda32() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit99, Lit41, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit99, Lit42, Lit61, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit99, Lit44, Lit45, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit99, Lit25, Lit26, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit99, Lit48, "     Age", Lit9);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit99, Lit62, Lit45, Lit5);
        Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit99, Lit63, Lit100, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit99, Lit27, Lit26, Lit5);
    }

    static Object lambda33() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit99, Lit41, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit99, Lit42, Lit61, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit99, Lit44, Lit45, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit99, Lit25, Lit26, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit99, Lit48, "     Age", Lit9);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit99, Lit62, Lit45, Lit5);
        Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit99, Lit63, Lit100, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit99, Lit27, Lit26, Lit5);
    }

    static Object lambda34() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit41, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit42, Lit61, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit44, Lit45, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit25, Lit26, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit48, "Weight", Lit9);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit63, Lit116, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit27, Lit26, Lit5);
    }

    static Object lambda35() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit41, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit42, Lit61, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit44, Lit45, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit25, Lit26, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit48, "Weight", Lit9);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit63, Lit116, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit27, Lit26, Lit5);
    }

    static Object lambda36() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit119, Lit27, Lit26, Lit5);
    }

    static Object lambda37() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit119, Lit27, Lit26, Lit5);
    }

    static Object lambda38() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit122, Lit27, Lit26, Lit5);
    }

    static Object lambda39() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit122, Lit27, Lit26, Lit5);
    }

    static Object lambda40() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit125, Lit27, Lit71, Lit5);
    }

    static Object lambda41() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit125, Lit27, Lit71, Lit5);
    }

    static Object lambda42() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit131, Lit11, Lit132, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit131, Lit25, Lit26, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit131, Lit76, "Enter age", Lit9);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit131, Lit77, Lit133, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit131, Lit134, Lit135, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit131, Lit136, Boolean.TRUE, Lit22);
        return C1168runtime.setAndCoerceProperty$Ex(Lit131, Lit27, Lit137, Lit5);
    }

    static Object lambda43() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit131, Lit11, Lit132, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit131, Lit25, Lit26, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit131, Lit76, "Enter age", Lit9);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit131, Lit77, Lit133, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit131, Lit134, Lit135, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit131, Lit136, Boolean.TRUE, Lit22);
        return C1168runtime.setAndCoerceProperty$Ex(Lit131, Lit27, Lit137, Lit5);
    }

    static Object lambda44() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit143, Lit11, Lit144, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit143, Lit76, "Enter weight", Lit9);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit143, Lit77, Lit145, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit143, Lit134, Lit135, Lit5);
    }

    static Object lambda45() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit143, Lit11, Lit144, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit143, Lit76, "Enter weight", Lit9);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit143, Lit77, Lit145, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit143, Lit134, Lit135, Lit5);
    }

    static Object lambda46() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit148, Lit27, Lit26, Lit5);
    }

    static Object lambda47() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit148, Lit27, Lit26, Lit5);
    }

    static Object lambda48() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit151, Lit34, Lit35, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit151, Lit152, Boolean.TRUE, Lit22);
        return C1168runtime.setAndCoerceProperty$Ex(Lit151, Lit27, Lit26, Lit5);
    }

    static Object lambda49() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit151, Lit34, Lit35, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit151, Lit152, Boolean.TRUE, Lit22);
        return C1168runtime.setAndCoerceProperty$Ex(Lit151, Lit27, Lit26, Lit5);
    }

    /* renamed from: io.kodular.kajalnikunj1024.Classifier.Screen3$frame */
    /* compiled from: Screen3.yail */
    public class frame extends ModuleBody {
        Screen3 $main;

        public frame() {
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj2 = obj;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 1:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 1;
                    return 0;
                case 2:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 1;
                    return 0;
                case 4:
                    CallContext callContext3 = callContext2;
                    Object obj3 = obj2;
                    Object obj4 = obj3;
                    if (!(obj3 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext3.value1 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 1;
                    return 0;
                case 6:
                    CallContext callContext4 = callContext2;
                    Object obj5 = obj2;
                    Object obj6 = obj5;
                    if (!(obj5 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext4.value1 = obj6;
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 1;
                    return 0;
                case 11:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 1;
                    return 0;
                case 12:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 1;
                    return 0;
                case 13:
                    CallContext callContext5 = callContext2;
                    Object obj7 = obj2;
                    Object obj8 = obj7;
                    if (!(obj7 instanceof Screen3)) {
                        return -786431;
                    }
                    callContext5.value1 = obj8;
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod2, obj2, callContext2);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj3 = obj;
            Object obj4 = obj2;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 3:
                    CallContext callContext3 = callContext2;
                    Object obj5 = obj3;
                    Object obj6 = obj5;
                    if (!(obj5 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext3.value1 = obj6;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 2;
                    return 0;
                case 4:
                    CallContext callContext4 = callContext2;
                    Object obj7 = obj3;
                    Object obj8 = obj7;
                    if (!(obj7 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext4.value1 = obj8;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 2;
                    return 0;
                case 7:
                    CallContext callContext5 = callContext2;
                    Object obj9 = obj3;
                    Object obj10 = obj9;
                    if (!(obj9 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext5.value1 = obj10;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 2;
                    return 0;
                case 8:
                    callContext2.value1 = obj3;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 2;
                    return 0;
                case 10:
                    callContext2.value1 = obj3;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 2;
                    return 0;
                case 16:
                    callContext2.value1 = obj3;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod2, obj3, obj4, callContext2);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj5 = obj;
            Object obj6 = obj2;
            Object obj7 = obj3;
            Object obj8 = obj4;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 9:
                    callContext2.value1 = obj5;
                    callContext2.value2 = obj6;
                    callContext2.value3 = obj7;
                    callContext2.value4 = obj8;
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 4;
                    return 0;
                case 14:
                    CallContext callContext3 = callContext2;
                    Object obj9 = obj5;
                    Object obj10 = obj9;
                    if (!(obj9 instanceof Screen3)) {
                        return -786431;
                    }
                    callContext3.value1 = obj10;
                    CallContext callContext4 = callContext2;
                    Object obj11 = obj6;
                    Object obj12 = obj11;
                    if (!(obj11 instanceof Component)) {
                        return -786430;
                    }
                    callContext4.value2 = obj12;
                    CallContext callContext5 = callContext2;
                    Object obj13 = obj7;
                    Object obj14 = obj13;
                    if (!(obj13 instanceof String)) {
                        return -786429;
                    }
                    callContext5.value3 = obj14;
                    CallContext callContext6 = callContext2;
                    Object obj15 = obj8;
                    Object obj16 = obj15;
                    if (!(obj15 instanceof String)) {
                        return -786428;
                    }
                    callContext6.value4 = obj16;
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 4;
                    return 0;
                case 15:
                    CallContext callContext7 = callContext2;
                    Object obj17 = obj5;
                    Object obj18 = obj17;
                    if (!(obj17 instanceof Screen3)) {
                        return -786431;
                    }
                    callContext7.value1 = obj18;
                    CallContext callContext8 = callContext2;
                    Object obj19 = obj6;
                    Object obj20 = obj19;
                    if (!(obj19 instanceof Component)) {
                        return -786430;
                    }
                    callContext8.value2 = obj20;
                    CallContext callContext9 = callContext2;
                    Object obj21 = obj7;
                    Object obj22 = obj21;
                    if (!(obj21 instanceof String)) {
                        return -786429;
                    }
                    callContext9.value3 = obj22;
                    CallContext callContext10 = callContext2;
                    Object obj23 = obj8;
                    Object obj24 = obj23;
                    Object obj25 = obj23;
                    if (1 == 0) {
                        return -786428;
                    }
                    callContext10.value4 = obj24;
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod2, obj5, obj6, obj7, obj8, callContext2);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            Throwable th;
            Throwable th2;
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj2 = obj;
            switch (moduleMethod2.selector) {
                case 1:
                    return this.$main.getSimpleName(obj2);
                case 2:
                    this.$main.androidLogForm(obj2);
                    return Values.empty;
                case 4:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj2);
                    } catch (ClassCastException e) {
                        ClassCastException classCastException = e;
                        Throwable th3 = th2;
                        new WrongType(classCastException, "lookup-in-form-environment", 1, obj2);
                        throw th3;
                    }
                case 6:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj2) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        ClassCastException classCastException2 = e2;
                        Throwable th4 = th;
                        new WrongType(classCastException2, "is-bound-in-form-environment", 1, obj2);
                        throw th4;
                    }
                case 11:
                    this.$main.addToFormDoAfterCreation(obj2);
                    return Values.empty;
                case 12:
                    this.$main.sendError(obj2);
                    return Values.empty;
                case 13:
                    this.$main.processException(obj2);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod2, obj2);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            Throwable th;
            Throwable th2;
            Throwable th3;
            Throwable th4;
            Throwable th5;
            Throwable th6;
            Throwable th7;
            Throwable th8;
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj5 = obj;
            Object obj6 = obj2;
            Object obj7 = obj3;
            Object obj8 = obj4;
            switch (moduleMethod2.selector) {
                case 9:
                    this.$main.addToComponents(obj5, obj6, obj7, obj8);
                    return Values.empty;
                case 14:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj5, (String) obj6, (String) obj7, (Object[]) obj8) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    ClassCastException classCastException = e;
                                    Throwable th9 = th8;
                                    new WrongType(classCastException, "dispatchEvent", 4, obj8);
                                    throw th9;
                                }
                            } catch (ClassCastException e2) {
                                ClassCastException classCastException2 = e2;
                                Throwable th10 = th7;
                                new WrongType(classCastException2, "dispatchEvent", 3, obj7);
                                throw th10;
                            }
                        } catch (ClassCastException e3) {
                            ClassCastException classCastException3 = e3;
                            Throwable th11 = th6;
                            new WrongType(classCastException3, "dispatchEvent", 2, obj6);
                            throw th11;
                        }
                    } catch (ClassCastException e4) {
                        ClassCastException classCastException4 = e4;
                        Throwable th12 = th5;
                        new WrongType(classCastException4, "dispatchEvent", 1, obj5);
                        throw th12;
                    }
                case 15:
                    try {
                        try {
                            try {
                                try {
                                    this.$main.dispatchGenericEvent((Component) obj5, (String) obj6, obj7 != Boolean.FALSE, (Object[]) obj8);
                                    return Values.empty;
                                } catch (ClassCastException e5) {
                                    ClassCastException classCastException5 = e5;
                                    Throwable th13 = th4;
                                    new WrongType(classCastException5, "dispatchGenericEvent", 4, obj8);
                                    throw th13;
                                }
                            } catch (ClassCastException e6) {
                                ClassCastException classCastException6 = e6;
                                Throwable th14 = th3;
                                new WrongType(classCastException6, "dispatchGenericEvent", 3, obj7);
                                throw th14;
                            }
                        } catch (ClassCastException e7) {
                            ClassCastException classCastException7 = e7;
                            Throwable th15 = th2;
                            new WrongType(classCastException7, "dispatchGenericEvent", 2, obj6);
                            throw th15;
                        }
                    } catch (ClassCastException e8) {
                        ClassCastException classCastException8 = e8;
                        Throwable th16 = th;
                        new WrongType(classCastException8, "dispatchGenericEvent", 1, obj5);
                        throw th16;
                    }
                default:
                    return super.apply4(moduleMethod2, obj5, obj6, obj7, obj8);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            Throwable th;
            Throwable th2;
            Throwable th3;
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj3 = obj;
            Object obj4 = obj2;
            switch (moduleMethod2.selector) {
                case 3:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj3, obj4);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        ClassCastException classCastException = e;
                        Throwable th4 = th3;
                        new WrongType(classCastException, "add-to-form-environment", 1, obj3);
                        throw th4;
                    }
                case 4:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj3, obj4);
                    } catch (ClassCastException e2) {
                        ClassCastException classCastException2 = e2;
                        Throwable th5 = th2;
                        new WrongType(classCastException2, "lookup-in-form-environment", 1, obj3);
                        throw th5;
                    }
                case 7:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj3, obj4);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        ClassCastException classCastException3 = e3;
                        Throwable th6 = th;
                        new WrongType(classCastException3, "add-to-global-var-environment", 1, obj3);
                        throw th6;
                    }
                case 8:
                    this.$main.addToEvents(obj3, obj4);
                    return Values.empty;
                case 10:
                    this.$main.addToGlobalVars(obj3, obj4);
                    return Values.empty;
                case 16:
                    return this.$main.lookupHandler(obj3, obj4);
                default:
                    return super.apply2(moduleMethod2, obj3, obj4);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            ModuleMethod moduleMethod2 = moduleMethod;
            switch (moduleMethod2.selector) {
                case 17:
                    return Screen3.lambda2();
                case 18:
                    this.$main.$define();
                    return Values.empty;
                case 19:
                    return Screen3.lambda3();
                case 20:
                    return Screen3.lambda4();
                case 21:
                    return Screen3.lambda5();
                case 22:
                    return Screen3.lambda6();
                case 23:
                    return Screen3.lambda7();
                case 24:
                    return Screen3.lambda8();
                case 25:
                    return Screen3.lambda9();
                case 26:
                    return Screen3.lambda10();
                case 27:
                    return Screen3.lambda11();
                case 28:
                    return Screen3.lambda12();
                case 29:
                    return Screen3.lambda13();
                case 30:
                    return Screen3.lambda14();
                case 31:
                    return Screen3.lambda15();
                case 32:
                    return Screen3.lambda16();
                case 33:
                    return Screen3.lambda17();
                case 34:
                    return Screen3.lambda18();
                case 35:
                    return Screen3.lambda19();
                case 36:
                    return Screen3.lambda20();
                case 37:
                    return Screen3.lambda21();
                case 38:
                    return Screen3.lambda22();
                case 39:
                    return Screen3.lambda23();
                case 40:
                    return Screen3.lambda24();
                case 41:
                    return Screen3.lambda25();
                case 42:
                    return Screen3.lambda26();
                case 43:
                    return Screen3.lambda27();
                case 44:
                    return Screen3.lambda28();
                case 45:
                    return Screen3.lambda29();
                case 46:
                    return Screen3.lambda30();
                case 47:
                    return Screen3.lambda31();
                case 48:
                    return Screen3.lambda32();
                case 49:
                    return Screen3.lambda33();
                case 50:
                    return Screen3.lambda34();
                case 51:
                    return Screen3.lambda35();
                case 52:
                    return Screen3.lambda36();
                case 53:
                    return Screen3.lambda37();
                case 54:
                    return Screen3.lambda38();
                case 55:
                    return Screen3.lambda39();
                case 56:
                    return Screen3.lambda40();
                case 57:
                    return Screen3.lambda41();
                case 58:
                    return Screen3.lambda42();
                case 59:
                    return Screen3.lambda43();
                case 60:
                    return Screen3.lambda44();
                case 61:
                    return Screen3.lambda45();
                case 62:
                    return Screen3.lambda46();
                case 63:
                    return Screen3.lambda47();
                case 64:
                    return Screen3.lambda48();
                case 65:
                    return Screen3.lambda49();
                case 66:
                    return Screen3.lambda50();
                case 67:
                    return Screen3.lambda51();
                case 68:
                    return this.$main.Button5$Click();
                default:
                    return super.apply0(moduleMethod2);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 17:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 18:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 19:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 20:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 21:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 22:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 23:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 24:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 25:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 26:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 27:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 28:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 29:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 30:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 31:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 32:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 33:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 34:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 35:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 36:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 37:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 38:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 39:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 40:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 41:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 42:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 43:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 44:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 45:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 46:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 47:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 48:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 49:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 50:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 51:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 52:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 53:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 54:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 55:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 56:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 57:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 58:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 59:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 60:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 61:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 62:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 63:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 64:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 65:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 66:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 67:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 68:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod2, callContext2);
            }
        }
    }

    static Object lambda50() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit155, Lit11, Lit156, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit155, Lit41, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit155, Lit44, Lit45, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit155, Lit46, Lit47, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit155, Lit48, "NEXT", Lit9);
    }

    static Object lambda51() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit155, Lit11, Lit156, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit155, Lit41, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit155, Lit44, Lit45, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit155, Lit46, Lit47, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit155, Lit48, "NEXT", Lit9);
    }

    public Object Button5$Click() {
        C1168runtime.setThisForm();
        return C1168runtime.callYailPrimitive(C1168runtime.open$Mnanother$Mnscreen, LList.list1("Screen4"), Lit158, "open another screen");
    }

    public String getSimpleName(Object object) {
        return object.getClass().getSimpleName();
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol symbol, Object obj) {
        Symbol name = symbol;
        Object object = obj;
        Object[] objArr = new Object[4];
        objArr[0] = "Adding ~A to env ~A with value ~A";
        Object[] objArr2 = objArr;
        objArr2[1] = name;
        Object[] objArr3 = objArr2;
        objArr3[2] = this.form$Mnenvironment;
        Object[] objArr4 = objArr3;
        objArr4[3] = object;
        androidLogForm(Format.formatToString(0, objArr4));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol symbol, Object obj) {
        Object obj2;
        Symbol name = symbol;
        Object default$Mnvalue = obj;
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & true;
        if (!x ? !x : !this.form$Mnenvironment.isBound(name)) {
            obj2 = default$Mnvalue;
        } else {
            obj2 = this.form$Mnenvironment.get(name);
        }
        return obj2;
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol symbol, Object obj) {
        Symbol name = symbol;
        Object object = obj;
        Object[] objArr = new Object[4];
        objArr[0] = "Adding ~A to env ~A with value ~A";
        Object[] objArr2 = objArr;
        objArr2[1] = name;
        Object[] objArr3 = objArr2;
        objArr3[2] = this.global$Mnvar$Mnenvironment;
        Object[] objArr4 = objArr3;
        objArr4[3] = object;
        androidLogForm(Format.formatToString(0, objArr4));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = C1189lists.cons(C1189lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = C1189lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = C1189lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = C1189lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        Object obj = error;
        RetValManager.sendError(obj == null ? null : obj.toString());
    }

    public void processException(Object obj) {
        Object ex = obj;
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component component, String str, String str2, Object[] objArr) {
        boolean z;
        boolean z2;
        Component componentObject = component;
        String registeredComponentName = str;
        String eventName = str2;
        Object[] args = objArr;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            z = false;
        } else if (lookupInFormEnvironment(registeredObject) == componentObject) {
            try {
                Object apply2 = Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                z2 = true;
            } catch (StopBlocksExecution e) {
                StopBlocksExecution stopBlocksExecution = e;
                z2 = false;
            } catch (PermissionException e2) {
                PermissionException exception = e2;
                exception.printStackTrace();
                boolean x = this == componentObject;
                if (!x ? !x : !IsEqual.apply(eventName, "PermissionNeeded")) {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                } else {
                    processException(exception);
                }
                z2 = false;
            } catch (Throwable th) {
                Throwable exception2 = th;
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
                z2 = false;
            }
            z = z2;
        } else {
            z = false;
        }
        return z;
    }

    public void dispatchGenericEvent(Component component, String str, boolean z, Object[] objArr) {
        Boolean bool;
        Component componentObject = component;
        String eventName = str;
        boolean notAlreadyHandled = z;
        Object[] args = objArr;
        Object[] objArr2 = new Object[4];
        objArr2[0] = "any$";
        Object[] objArr3 = objArr2;
        objArr3[1] = getSimpleName(componentObject);
        Object[] objArr4 = objArr3;
        objArr4[2] = "$";
        Object[] objArr5 = objArr4;
        objArr5[3] = eventName;
        Object handler = lookupInFormEnvironment(misc.string$To$Symbol(strings.stringAppend(objArr5)));
        if (handler != Boolean.FALSE) {
            try {
                Apply apply = Scheme.apply;
                Object obj = handler;
                Component component2 = componentObject;
                if (notAlreadyHandled) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                Object apply2 = apply.apply2(obj, C1189lists.cons(component2, C1189lists.cons(bool, LList.makeList(args, 0))));
            } catch (StopBlocksExecution e) {
                StopBlocksExecution stopBlocksExecution = e;
            } catch (PermissionException e2) {
                PermissionException exception = e2;
                exception.printStackTrace();
                boolean x = this == componentObject;
                if (!x ? !x : !IsEqual.apply(eventName, "PermissionNeeded")) {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                } else {
                    processException(exception);
                }
            } catch (Throwable th) {
                Throwable exception2 = th;
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
            }
        }
    }

    public Object lookupHandler(Object componentName, Object obj) {
        Object eventName = obj;
        Object obj2 = componentName;
        String obj3 = obj2 == null ? null : obj2.toString();
        Object obj4 = eventName;
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj3, obj4 == null ? null : obj4.toString())));
    }

    public void $define() {
        Object obj;
        Throwable th;
        Object obj2;
        Throwable th2;
        Object obj3;
        Throwable th3;
        Object obj4;
        Throwable th4;
        Object obj5;
        Throwable th5;
        Object obj6;
        Throwable th6;
        Object obj7;
        Throwable th7;
        Object obj8;
        Throwable th8;
        Throwable th9;
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception e) {
            Exception exception = e;
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Screen3 = this;
        addToFormEnvironment(Lit0, this);
        Object obj9 = this.events$Mnto$Mnregister;
        while (true) {
            Object obj10 = obj9;
            if (obj10 == LList.Empty) {
                break;
            }
            Object obj11 = obj10;
            Object obj12 = obj11;
            try {
                Pair arg0 = (Pair) obj11;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = C1189lists.car.apply1(event$Mninfo);
                String obj13 = apply1 == null ? null : apply1.toString();
                Object apply12 = C1189lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj13, apply12 == null ? null : apply12.toString());
                obj9 = arg0.getCdr();
            } catch (ClassCastException e2) {
                ClassCastException classCastException = e2;
                Throwable th10 = th9;
                new WrongType(classCastException, "arg0", -2, obj12);
                throw th10;
            }
        }
        try {
            LList components = C1189lists.reverse(this.components$Mnto$Mncreate);
            addToGlobalVars(Lit2, lambda$Fn1);
            LList event$Mninfo2 = components;
            while (event$Mninfo2 != LList.Empty) {
                Object obj14 = event$Mninfo2;
                obj6 = obj14;
                Pair arg02 = (Pair) obj14;
                Object component$Mninfo = arg02.getCar();
                Object apply13 = C1189lists.caddr.apply1(component$Mninfo);
                Object apply14 = C1189lists.cadddr.apply1(component$Mninfo);
                Object component$Mntype = C1189lists.cadr.apply1(component$Mninfo);
                Object apply15 = C1189lists.car.apply1(component$Mninfo);
                obj7 = apply15;
                Object component$Mnname = apply13;
                Object component$Mnobject = Invoke.make.apply2(component$Mntype, lookupInFormEnvironment((Symbol) apply15));
                Object apply3 = SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                Object obj15 = component$Mnname;
                obj8 = obj15;
                addToFormEnvironment((Symbol) obj15, component$Mnobject);
                event$Mninfo2 = arg02.getCdr();
            }
            LList reverse = C1189lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            while (reverse != LList.Empty) {
                Object obj16 = reverse;
                obj4 = obj16;
                Pair arg03 = (Pair) obj16;
                Object var$Mnval = arg03.getCar();
                Object apply16 = C1189lists.car.apply1(var$Mnval);
                obj5 = apply16;
                addToGlobalVarEnvironment((Symbol) apply16, Scheme.applyToArgs.apply1(C1189lists.cadr.apply1(var$Mnval)));
                reverse = arg03.getCdr();
            }
            Object reverse2 = C1189lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (reverse2 != LList.Empty) {
                Object obj17 = reverse2;
                obj3 = obj17;
                Pair arg04 = (Pair) obj17;
                Object force = misc.force(arg04.getCar());
                reverse2 = arg04.getCdr();
            }
            LList component$Mndescriptors = components;
            LList lList = component$Mndescriptors;
            while (lList != LList.Empty) {
                Object obj18 = lList;
                obj2 = obj18;
                Pair arg05 = (Pair) obj18;
                Object component$Mninfo2 = arg05.getCar();
                Object apply17 = C1189lists.caddr.apply1(component$Mninfo2);
                Object init$Mnthunk = C1189lists.cadddr.apply1(component$Mninfo2);
                if (init$Mnthunk != Boolean.FALSE) {
                    Object apply18 = Scheme.applyToArgs.apply1(init$Mnthunk);
                }
                lList = arg05.getCdr();
            }
            LList lList2 = component$Mndescriptors;
            while (lList2 != LList.Empty) {
                Object obj19 = lList2;
                obj = obj19;
                Pair arg06 = (Pair) obj19;
                Object component$Mninfo3 = arg06.getCar();
                Object component$Mnname2 = C1189lists.caddr.apply1(component$Mninfo3);
                Object apply19 = C1189lists.cadddr.apply1(component$Mninfo3);
                callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                lList2 = arg06.getCdr();
            }
        } catch (ClassCastException e3) {
            ClassCastException classCastException2 = e3;
            Throwable th11 = th;
            new WrongType(classCastException2, "arg0", -2, obj);
            throw th11;
        } catch (ClassCastException e4) {
            ClassCastException classCastException3 = e4;
            Throwable th12 = th2;
            new WrongType(classCastException3, "arg0", -2, obj2);
            throw th12;
        } catch (ClassCastException e5) {
            ClassCastException classCastException4 = e5;
            Throwable th13 = th3;
            new WrongType(classCastException4, "arg0", -2, obj3);
            throw th13;
        } catch (ClassCastException e6) {
            ClassCastException classCastException5 = e6;
            Throwable th14 = th5;
            new WrongType(classCastException5, "add-to-global-var-environment", 0, obj5);
            throw th14;
        } catch (ClassCastException e7) {
            ClassCastException classCastException6 = e7;
            Throwable th15 = th4;
            new WrongType(classCastException6, "arg0", -2, obj4);
            throw th15;
        } catch (ClassCastException e8) {
            ClassCastException classCastException7 = e8;
            Throwable th16 = th8;
            new WrongType(classCastException7, "add-to-form-environment", 0, obj8);
            throw th16;
        } catch (ClassCastException e9) {
            ClassCastException classCastException8 = e9;
            Throwable th17 = th7;
            new WrongType(classCastException8, "lookup-in-form-environment", 0, obj7);
            throw th17;
        } catch (ClassCastException e10) {
            ClassCastException classCastException9 = e10;
            Throwable th18 = th6;
            new WrongType(classCastException9, "arg0", -2, obj6);
            throw th18;
        } catch (YailRuntimeError e11) {
            processException(e11);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        LList symbols = LList.makeList(argsArray, 0);
        LList lList = symbols;
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = symbols;
        Object obj2 = LList.Empty;
        while (true) {
            Object obj3 = obj2;
            Object obj4 = obj;
            if (obj4 == LList.Empty) {
                Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj3));
                Object obj5 = apply2;
                try {
                    return misc.string$To$Symbol((CharSequence) apply2);
                } catch (ClassCastException e) {
                    ClassCastException classCastException = e;
                    Throwable th4 = th;
                    new WrongType(classCastException, "string->symbol", 1, obj5);
                    throw th4;
                }
            } else {
                Object obj6 = obj4;
                Object obj7 = obj6;
                try {
                    Pair arg0 = (Pair) obj6;
                    obj = arg0.getCdr();
                    Object car = arg0.getCar();
                    Object obj8 = car;
                    try {
                        obj2 = Pair.make(misc.symbol$To$String((Symbol) car), obj3);
                    } catch (ClassCastException e2) {
                        ClassCastException classCastException2 = e2;
                        Throwable th5 = th3;
                        new WrongType(classCastException2, "symbol->string", 1, obj8);
                        throw th5;
                    }
                } catch (ClassCastException e3) {
                    ClassCastException classCastException3 = e3;
                    Throwable th6 = th2;
                    new WrongType(classCastException3, "arg0", -2, obj7);
                    throw th6;
                }
            }
        }
    }

    static Object lambda2() {
        return null;
    }
}
