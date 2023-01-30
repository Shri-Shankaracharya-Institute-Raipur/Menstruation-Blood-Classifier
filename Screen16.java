package p004io.kodular.kajalnikunj1024.Classifier;

import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.Label;
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
import org.jose4j.jws.AlgorithmIdentifiers;

/* renamed from: io.kodular.kajalnikunj1024.Classifier.Screen16 */
/* compiled from: Screen16.yail */
public class Screen16 extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final IntNum Lit10;
    static final FString Lit100;
    static final FString Lit101;
    static final SimpleSymbol Lit102;
    static final FString Lit103;
    static final FString Lit104;
    static final SimpleSymbol Lit105;
    static final IntNum Lit106;
    static final FString Lit107;
    static final FString Lit108;
    static final SimpleSymbol Lit109;
    static final SimpleSymbol Lit11;
    static final FString Lit110;
    static final FString Lit111;
    static final SimpleSymbol Lit112;
    static final IntNum Lit113;
    static final FString Lit114;
    static final FString Lit115;
    static final SimpleSymbol Lit116;
    static final FString Lit117;
    static final FString Lit118;
    static final SimpleSymbol Lit119;
    static final IntNum Lit12 = IntNum.make(23);
    static final IntNum Lit120;
    static final IntNum Lit121 = IntNum.make(15);
    static final FString Lit122;
    static final PairWithPosition Lit123;
    static final SimpleSymbol Lit124;
    static final SimpleSymbol Lit125;
    static final SimpleSymbol Lit126;
    static final SimpleSymbol Lit127;
    static final SimpleSymbol Lit128;
    static final SimpleSymbol Lit129;
    static final SimpleSymbol Lit13;
    static final SimpleSymbol Lit130;
    static final SimpleSymbol Lit131;
    static final SimpleSymbol Lit132;
    static final SimpleSymbol Lit133;
    static final SimpleSymbol Lit134;
    static final SimpleSymbol Lit135;
    static final SimpleSymbol Lit136;
    static final SimpleSymbol Lit137;
    static final SimpleSymbol Lit138;
    static final SimpleSymbol Lit139;
    static final IntNum Lit14;
    static final SimpleSymbol Lit15;
    static final IntNum Lit16;
    static final SimpleSymbol Lit17;
    static final IntNum Lit18;
    static final SimpleSymbol Lit19;
    static final SimpleSymbol Lit2;
    static final SimpleSymbol Lit20;
    static final SimpleSymbol Lit21;
    static final SimpleSymbol Lit22;
    static final SimpleSymbol Lit23;
    static final FString Lit24;
    static final SimpleSymbol Lit25;
    static final IntNum Lit26;
    static final SimpleSymbol Lit27;
    static final IntNum Lit28 = IntNum.make(-2);
    static final FString Lit29;
    static final SimpleSymbol Lit3;
    static final FString Lit30;
    static final SimpleSymbol Lit31;
    static final SimpleSymbol Lit32;
    static final IntNum Lit33 = IntNum.make(30);
    static final SimpleSymbol Lit34;
    static final SimpleSymbol Lit35;
    static final SimpleSymbol Lit36;
    static final IntNum Lit37;
    static final FString Lit38;
    static final FString Lit39;
    static final IntNum Lit4;
    static final SimpleSymbol Lit40;
    static final IntNum Lit41 = IntNum.make(20);
    static final FString Lit42;
    static final FString Lit43;
    static final SimpleSymbol Lit44;
    static final FString Lit45;
    static final FString Lit46;
    static final SimpleSymbol Lit47;
    static final SimpleSymbol Lit48;
    static final IntNum Lit49 = IntNum.make(18);
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final IntNum Lit51 = IntNum.make(2);
    static final SimpleSymbol Lit52;
    static final IntNum Lit53 = IntNum.make(1);
    static final IntNum Lit54;
    static final FString Lit55;
    static final FString Lit56;
    static final SimpleSymbol Lit57;
    static final FString Lit58;
    static final FString Lit59;
    static final SimpleSymbol Lit6;
    static final SimpleSymbol Lit60;
    static final FString Lit61;
    static final FString Lit62;
    static final SimpleSymbol Lit63;
    static final IntNum Lit64;
    static final FString Lit65;
    static final FString Lit66;
    static final SimpleSymbol Lit67;
    static final FString Lit68;
    static final FString Lit69;
    static final SimpleSymbol Lit7;
    static final SimpleSymbol Lit70;
    static final IntNum Lit71;
    static final FString Lit72;
    static final FString Lit73;
    static final SimpleSymbol Lit74;
    static final FString Lit75;
    static final FString Lit76;
    static final SimpleSymbol Lit77;
    static final IntNum Lit78;
    static final FString Lit79;
    static final SimpleSymbol Lit8;
    static final FString Lit80;
    static final SimpleSymbol Lit81;
    static final FString Lit82;
    static final FString Lit83;
    static final SimpleSymbol Lit84;
    static final IntNum Lit85;
    static final FString Lit86;
    static final FString Lit87;
    static final SimpleSymbol Lit88;
    static final FString Lit89;
    static final SimpleSymbol Lit9;
    static final FString Lit90;
    static final SimpleSymbol Lit91;
    static final IntNum Lit92;
    static final FString Lit93;
    static final FString Lit94;
    static final SimpleSymbol Lit95;
    static final FString Lit96;
    static final FString Lit97;
    static final SimpleSymbol Lit98;
    static final IntNum Lit99;
    public static Screen16 Screen16;
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
    public Button Brown;
    public Button Button12;
    public Button Button4;
    public final ModuleMethod Button4$Click;
    public Button Deep_red;
    public Label Label1;
    public Label Label2;
    public Button Pink;
    public VerticalArrangement Vertical_Arrangement1;
    public VerticalArrangement Vertical_Arrangement2_copy;
    public VerticalArrangement Vertical_Arrangement2_copy_copy;
    public VerticalArrangement Vertical_Arrangement2_copy_copy1;
    public VerticalArrangement Vertical_Arrangement2_copy_copy2;
    public VerticalArrangement Vertical_Arrangement2_copy_copy3;
    public VerticalArrangement Vertical_Arrangement2_copy_copy4;
    public VerticalArrangement Vertical_Arrangement2_copy_copy5;
    public VerticalArrangement Vertical_Arrangement2_copy_copy6;
    public VerticalArrangement Vertical_Arrangement2_copy_copy7;
    public VerticalArrangement Vertical_Arrangement2_copy_copy8;
    public VerticalArrangement Vertical_Arrangement2_copy_copy9;
    public VerticalArrangement Vertical_Arrangement2_copy_copy_copy;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public Button black;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public Button grey;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public Button orange;
    public final ModuleMethod process$Mnexception;
    public Button red;
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
        FString fString4;
        FString fString5;
        SimpleSymbol simpleSymbol20;
        FString fString6;
        FString fString7;
        SimpleSymbol simpleSymbol21;
        FString fString8;
        FString fString9;
        SimpleSymbol simpleSymbol22;
        FString fString10;
        FString fString11;
        SimpleSymbol simpleSymbol23;
        FString fString12;
        FString fString13;
        SimpleSymbol simpleSymbol24;
        FString fString14;
        FString fString15;
        SimpleSymbol simpleSymbol25;
        FString fString16;
        FString fString17;
        SimpleSymbol simpleSymbol26;
        FString fString18;
        FString fString19;
        SimpleSymbol simpleSymbol27;
        FString fString20;
        FString fString21;
        SimpleSymbol simpleSymbol28;
        FString fString22;
        FString fString23;
        SimpleSymbol simpleSymbol29;
        FString fString24;
        FString fString25;
        SimpleSymbol simpleSymbol30;
        FString fString26;
        FString fString27;
        SimpleSymbol simpleSymbol31;
        FString fString28;
        FString fString29;
        SimpleSymbol simpleSymbol32;
        FString fString30;
        FString fString31;
        SimpleSymbol simpleSymbol33;
        FString fString32;
        FString fString33;
        SimpleSymbol simpleSymbol34;
        FString fString34;
        FString fString35;
        SimpleSymbol simpleSymbol35;
        FString fString36;
        FString fString37;
        SimpleSymbol simpleSymbol36;
        FString fString38;
        FString fString39;
        SimpleSymbol simpleSymbol37;
        SimpleSymbol simpleSymbol38;
        SimpleSymbol simpleSymbol39;
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
        SimpleSymbol simpleSymbol46;
        SimpleSymbol simpleSymbol47;
        FString fString46;
        FString fString47;
        SimpleSymbol simpleSymbol48;
        SimpleSymbol simpleSymbol49;
        FString fString48;
        SimpleSymbol simpleSymbol50;
        SimpleSymbol simpleSymbol51;
        SimpleSymbol simpleSymbol52;
        SimpleSymbol simpleSymbol53;
        SimpleSymbol simpleSymbol54;
        SimpleSymbol simpleSymbol55;
        SimpleSymbol simpleSymbol56;
        SimpleSymbol simpleSymbol57;
        SimpleSymbol simpleSymbol58;
        SimpleSymbol simpleSymbol59;
        SimpleSymbol simpleSymbol60;
        SimpleSymbol simpleSymbol61;
        SimpleSymbol simpleSymbol62;
        SimpleSymbol simpleSymbol63;
        SimpleSymbol simpleSymbol64;
        SimpleSymbol simpleSymbol65;
        SimpleSymbol simpleSymbol66;
        new SimpleSymbol("lookup-handler");
        Lit139 = (SimpleSymbol) simpleSymbol.readResolve();
        new SimpleSymbol("dispatchGenericEvent");
        Lit138 = (SimpleSymbol) simpleSymbol2.readResolve();
        new SimpleSymbol("dispatchEvent");
        Lit137 = (SimpleSymbol) simpleSymbol3.readResolve();
        new SimpleSymbol("send-error");
        Lit136 = (SimpleSymbol) simpleSymbol4.readResolve();
        new SimpleSymbol("add-to-form-do-after-creation");
        Lit135 = (SimpleSymbol) simpleSymbol5.readResolve();
        new SimpleSymbol("add-to-global-vars");
        Lit134 = (SimpleSymbol) simpleSymbol6.readResolve();
        new SimpleSymbol("add-to-components");
        Lit133 = (SimpleSymbol) simpleSymbol7.readResolve();
        new SimpleSymbol("add-to-events");
        Lit132 = (SimpleSymbol) simpleSymbol8.readResolve();
        new SimpleSymbol("add-to-global-var-environment");
        Lit131 = (SimpleSymbol) simpleSymbol9.readResolve();
        new SimpleSymbol("is-bound-in-form-environment");
        Lit130 = (SimpleSymbol) simpleSymbol10.readResolve();
        new SimpleSymbol("lookup-in-form-environment");
        Lit129 = (SimpleSymbol) simpleSymbol11.readResolve();
        new SimpleSymbol("add-to-form-environment");
        Lit128 = (SimpleSymbol) simpleSymbol12.readResolve();
        new SimpleSymbol("android-log-form");
        Lit127 = (SimpleSymbol) simpleSymbol13.readResolve();
        new SimpleSymbol("get-simple-name");
        Lit126 = (SimpleSymbol) simpleSymbol14.readResolve();
        new SimpleSymbol("Click");
        Lit125 = (SimpleSymbol) simpleSymbol15.readResolve();
        new SimpleSymbol("Button4$Click");
        Lit124 = (SimpleSymbol) simpleSymbol16.readResolve();
        new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT);
        SimpleSymbol simpleSymbol67 = (SimpleSymbol) simpleSymbol17.readResolve();
        Lit7 = simpleSymbol67;
        Lit123 = PairWithPosition.make(simpleSymbol67, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/Screen16.yail", 1069134);
        new FString("com.google.appinventor.components.runtime.Button");
        Lit122 = fString;
        int[] iArr = new int[2];
        iArr[0] = -92160;
        Lit120 = IntNum.make(iArr);
        new SimpleSymbol("Button4");
        Lit119 = (SimpleSymbol) simpleSymbol18.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit118 = fString2;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit117 = fString3;
        new SimpleSymbol("Vertical_Arrangement2_copy_copy1");
        Lit116 = (SimpleSymbol) simpleSymbol19.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit115 = fString4;
        new FString("com.google.appinventor.components.runtime.Button");
        Lit114 = fString5;
        int[] iArr2 = new int[2];
        iArr2[0] = -22127622;
        Lit113 = IntNum.make(iArr2);
        new SimpleSymbol("Button12");
        Lit112 = (SimpleSymbol) simpleSymbol20.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit111 = fString6;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit110 = fString7;
        new SimpleSymbol("Vertical_Arrangement2_copy_copy9");
        Lit109 = (SimpleSymbol) simpleSymbol21.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit108 = fString8;
        new FString("com.google.appinventor.components.runtime.Button");
        Lit107 = fString9;
        int[] iArr3 = new int[2];
        iArr3[0] = -23296;
        Lit106 = IntNum.make(iArr3);
        new SimpleSymbol("orange");
        Lit105 = (SimpleSymbol) simpleSymbol22.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit104 = fString10;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit103 = fString11;
        new SimpleSymbol("Vertical_Arrangement2_copy_copy4");
        Lit102 = (SimpleSymbol) simpleSymbol23.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit101 = fString12;
        new FString("com.google.appinventor.components.runtime.Button");
        Lit100 = fString13;
        int[] iArr4 = new int[2];
        iArr4[0] = -6381922;
        Lit99 = IntNum.make(iArr4);
        new SimpleSymbol("grey");
        Lit98 = (SimpleSymbol) simpleSymbol24.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit97 = fString14;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit96 = fString15;
        new SimpleSymbol("Vertical_Arrangement2_copy_copy8");
        Lit95 = (SimpleSymbol) simpleSymbol25.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit94 = fString16;
        new FString("com.google.appinventor.components.runtime.Button");
        Lit93 = fString17;
        int[] iArr5 = new int[2];
        iArr5[0] = -16777216;
        Lit92 = IntNum.make(iArr5);
        new SimpleSymbol("black");
        Lit91 = (SimpleSymbol) simpleSymbol26.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit90 = fString18;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit89 = fString19;
        new SimpleSymbol("Vertical_Arrangement2_copy_copy7");
        Lit88 = (SimpleSymbol) simpleSymbol27.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit87 = fString20;
        new FString("com.google.appinventor.components.runtime.Button");
        Lit86 = fString21;
        int[] iArr6 = new int[2];
        iArr6[0] = -6927616;
        Lit85 = IntNum.make(iArr6);
        new SimpleSymbol("Brown");
        Lit84 = (SimpleSymbol) simpleSymbol28.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit83 = fString22;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit82 = fString23;
        new SimpleSymbol("Vertical_Arrangement2_copy_copy6");
        Lit81 = (SimpleSymbol) simpleSymbol29.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit80 = fString24;
        new FString("com.google.appinventor.components.runtime.Button");
        Lit79 = fString25;
        int[] iArr7 = new int[2];
        iArr7[0] = -16181;
        Lit78 = IntNum.make(iArr7);
        new SimpleSymbol("Pink");
        Lit77 = (SimpleSymbol) simpleSymbol30.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit76 = fString26;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit75 = fString27;
        new SimpleSymbol("Vertical_Arrangement2_copy_copy5");
        Lit74 = (SimpleSymbol) simpleSymbol31.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit73 = fString28;
        new FString("com.google.appinventor.components.runtime.Button");
        Lit72 = fString29;
        int[] iArr8 = new int[2];
        iArr8[0] = -8060671;
        Lit71 = IntNum.make(iArr8);
        new SimpleSymbol("Deep_red");
        Lit70 = (SimpleSymbol) simpleSymbol32.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit69 = fString30;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit68 = fString31;
        new SimpleSymbol("Vertical_Arrangement2_copy_copy3");
        Lit67 = (SimpleSymbol) simpleSymbol33.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit66 = fString32;
        new FString("com.google.appinventor.components.runtime.Button");
        Lit65 = fString33;
        int[] iArr9 = new int[2];
        iArr9[0] = -65536;
        Lit64 = IntNum.make(iArr9);
        new SimpleSymbol("red");
        Lit63 = (SimpleSymbol) simpleSymbol34.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit62 = fString34;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit61 = fString35;
        new SimpleSymbol("Vertical_Arrangement2_copy_copy2");
        Lit60 = (SimpleSymbol) simpleSymbol35.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit59 = fString36;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit58 = fString37;
        new SimpleSymbol("Vertical_Arrangement2_copy_copy");
        Lit57 = (SimpleSymbol) simpleSymbol36.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit56 = fString38;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit55 = fString39;
        int[] iArr10 = new int[2];
        iArr10[0] = -769226;
        Lit54 = IntNum.make(iArr10);
        new SimpleSymbol("TextAlignment");
        Lit52 = (SimpleSymbol) simpleSymbol37.readResolve();
        new SimpleSymbol("FontTypeface");
        Lit50 = (SimpleSymbol) simpleSymbol38.readResolve();
        new SimpleSymbol("FontBold");
        Lit48 = (SimpleSymbol) simpleSymbol39.readResolve();
        new SimpleSymbol("Label2");
        Lit47 = (SimpleSymbol) simpleSymbol40.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit46 = fString40;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit45 = fString41;
        new SimpleSymbol("Vertical_Arrangement2_copy_copy_copy");
        Lit44 = (SimpleSymbol) simpleSymbol41.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit43 = fString42;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit42 = fString43;
        new SimpleSymbol("Vertical_Arrangement2_copy");
        Lit40 = (SimpleSymbol) simpleSymbol42.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit39 = fString44;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit38 = fString45;
        int[] iArr11 = new int[2];
        iArr11[0] = -1;
        Lit37 = IntNum.make(iArr11);
        new SimpleSymbol("TextColor");
        Lit36 = (SimpleSymbol) simpleSymbol43.readResolve();
        new SimpleSymbol("Text");
        Lit35 = (SimpleSymbol) simpleSymbol44.readResolve();
        new SimpleSymbol("Height");
        Lit34 = (SimpleSymbol) simpleSymbol45.readResolve();
        new SimpleSymbol("FontSize");
        Lit32 = (SimpleSymbol) simpleSymbol46.readResolve();
        new SimpleSymbol("Label1");
        Lit31 = (SimpleSymbol) simpleSymbol47.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit30 = fString46;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit29 = fString47;
        new SimpleSymbol("Width");
        Lit27 = (SimpleSymbol) simpleSymbol48.readResolve();
        int[] iArr12 = new int[2];
        iArr12[0] = -13463672;
        Lit26 = IntNum.make(iArr12);
        new SimpleSymbol("Vertical_Arrangement1");
        Lit25 = (SimpleSymbol) simpleSymbol49.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit24 = fString48;
        new SimpleSymbol("TitleVisible");
        Lit23 = (SimpleSymbol) simpleSymbol50.readResolve();
        new SimpleSymbol("Title");
        Lit22 = (SimpleSymbol) simpleSymbol51.readResolve();
        new SimpleSymbol("boolean");
        Lit21 = (SimpleSymbol) simpleSymbol52.readResolve();
        new SimpleSymbol("Scrollable");
        Lit20 = (SimpleSymbol) simpleSymbol53.readResolve();
        new SimpleSymbol("ReceiveSharedText");
        Lit19 = (SimpleSymbol) simpleSymbol54.readResolve();
        int[] iArr13 = new int[2];
        iArr13[0] = -32615864;
        Lit18 = IntNum.make(iArr13);
        new SimpleSymbol("PrimaryColorDark");
        Lit17 = (SimpleSymbol) simpleSymbol55.readResolve();
        int[] iArr14 = new int[2];
        iArr14[0] = -26950686;
        Lit16 = IntNum.make(iArr14);
        new SimpleSymbol("PrimaryColor");
        Lit15 = (SimpleSymbol) simpleSymbol56.readResolve();
        int[] iArr15 = new int[2];
        iArr15[0] = -17564930;
        Lit14 = IntNum.make(iArr15);
        new SimpleSymbol("NavigationBarColor");
        Lit13 = (SimpleSymbol) simpleSymbol57.readResolve();
        new SimpleSymbol("MinSdk");
        Lit11 = (SimpleSymbol) simpleSymbol58.readResolve();
        int[] iArr16 = new int[2];
        iArr16[0] = -722477;
        Lit10 = IntNum.make(iArr16);
        new SimpleSymbol("BackgroundColor");
        Lit9 = (SimpleSymbol) simpleSymbol59.readResolve();
        new SimpleSymbol("AppName");
        Lit8 = (SimpleSymbol) simpleSymbol60.readResolve();
        new SimpleSymbol("AppId");
        Lit6 = (SimpleSymbol) simpleSymbol61.readResolve();
        new SimpleSymbol("number");
        Lit5 = (SimpleSymbol) simpleSymbol62.readResolve();
        int[] iArr17 = new int[2];
        iArr17[0] = -92160;
        Lit4 = IntNum.make(iArr17);
        new SimpleSymbol("AccentColor");
        Lit3 = (SimpleSymbol) simpleSymbol63.readResolve();
        new SimpleSymbol("*the-null-value*");
        Lit2 = (SimpleSymbol) simpleSymbol64.readResolve();
        new SimpleSymbol("getMessage");
        Lit1 = (SimpleSymbol) simpleSymbol65.readResolve();
        new SimpleSymbol("Screen16");
        Lit0 = (SimpleSymbol) simpleSymbol66.readResolve();
    }

    public Screen16() {
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
        new ModuleMethod(frame4, 1, Lit126, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.get$Mnsimple$Mnname = moduleMethod68;
        new ModuleMethod(frame4, 2, Lit127, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = moduleMethod2;
        new ModuleMethod(frame4, 3, Lit128, 8194);
        this.add$Mnto$Mnform$Mnenvironment = moduleMethod3;
        new ModuleMethod(frame4, 4, Lit129, 8193);
        this.lookup$Mnin$Mnform$Mnenvironment = moduleMethod4;
        new ModuleMethod(frame4, 6, Lit130, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = moduleMethod5;
        new ModuleMethod(frame4, 7, Lit131, 8194);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = moduleMethod6;
        new ModuleMethod(frame4, 8, Lit132, 8194);
        this.add$Mnto$Mnevents = moduleMethod7;
        new ModuleMethod(frame4, 9, Lit133, 16388);
        this.add$Mnto$Mncomponents = moduleMethod8;
        new ModuleMethod(frame4, 10, Lit134, 8194);
        this.add$Mnto$Mnglobal$Mnvars = moduleMethod9;
        new ModuleMethod(frame4, 11, Lit135, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = moduleMethod10;
        new ModuleMethod(frame4, 12, Lit136, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = moduleMethod11;
        new ModuleMethod(frame4, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = moduleMethod12;
        new ModuleMethod(frame4, 14, Lit137, 16388);
        this.dispatchEvent = moduleMethod13;
        new ModuleMethod(frame4, 15, Lit138, 16388);
        this.dispatchGenericEvent = moduleMethod14;
        new ModuleMethod(frame4, 16, Lit139, 8194);
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
        new ModuleMethod(frame4, 68, Lit124, 0);
        this.Button4$Click = moduleMethod67;
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
        String obj;
        Object obj2;
        Consumer $result = $ctx.consumer;
        C1168runtime.$instance.run();
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
        Screen16 = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        C1168runtime.$instance.run();
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
            Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "6063526160367616", Lit7);
            Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Classifier", Lit7);
            Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit9, Lit10, Lit5);
            Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Lit12, Lit5);
            Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Lit14, Lit5);
            Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit15, Lit16, Lit5);
            Object andCoerceProperty$Ex8 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit17, Lit18, Lit5);
            Object andCoerceProperty$Ex9 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit19, AlgorithmIdentifiers.NONE, Lit7);
            Object andCoerceProperty$Ex10 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit20, Boolean.TRUE, Lit21);
            Object andCoerceProperty$Ex11 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "Screen16", Lit7);
            Values.writeValues(C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit23, Boolean.FALSE, Lit21), $result);
        } else {
            new Promise(lambda$Fn2);
            addToFormDoAfterCreation(obj2);
        }
        this.Vertical_Arrangement1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit24, Lit25, lambda$Fn3), $result);
        } else {
            addToComponents(Lit0, Lit29, Lit25, lambda$Fn4);
        }
        this.Label1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit25, Lit30, Lit31, lambda$Fn5), $result);
        } else {
            addToComponents(Lit25, Lit38, Lit31, lambda$Fn6);
        }
        this.Vertical_Arrangement2_copy = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit39, Lit40, lambda$Fn7), $result);
        } else {
            addToComponents(Lit0, Lit42, Lit40, lambda$Fn8);
        }
        this.Vertical_Arrangement2_copy_copy_copy = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit43, Lit44, lambda$Fn9), $result);
        } else {
            addToComponents(Lit0, Lit45, Lit44, lambda$Fn10);
        }
        this.Label2 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit44, Lit46, Lit47, lambda$Fn11), $result);
        } else {
            addToComponents(Lit44, Lit55, Lit47, lambda$Fn12);
        }
        this.Vertical_Arrangement2_copy_copy = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit56, Lit57, lambda$Fn13), $result);
        } else {
            addToComponents(Lit0, Lit58, Lit57, lambda$Fn14);
        }
        this.Vertical_Arrangement2_copy_copy2 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit57, Lit59, Lit60, lambda$Fn15), $result);
        } else {
            addToComponents(Lit57, Lit61, Lit60, lambda$Fn16);
        }
        this.red = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit57, Lit62, Lit63, lambda$Fn17), $result);
        } else {
            addToComponents(Lit57, Lit65, Lit63, lambda$Fn18);
        }
        this.Vertical_Arrangement2_copy_copy3 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit57, Lit66, Lit67, lambda$Fn19), $result);
        } else {
            addToComponents(Lit57, Lit68, Lit67, lambda$Fn20);
        }
        this.Deep_red = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit57, Lit69, Lit70, lambda$Fn21), $result);
        } else {
            addToComponents(Lit57, Lit72, Lit70, lambda$Fn22);
        }
        this.Vertical_Arrangement2_copy_copy5 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit57, Lit73, Lit74, lambda$Fn23), $result);
        } else {
            addToComponents(Lit57, Lit75, Lit74, lambda$Fn24);
        }
        this.Pink = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit57, Lit76, Lit77, lambda$Fn25), $result);
        } else {
            addToComponents(Lit57, Lit79, Lit77, lambda$Fn26);
        }
        this.Vertical_Arrangement2_copy_copy6 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit57, Lit80, Lit81, lambda$Fn27), $result);
        } else {
            addToComponents(Lit57, Lit82, Lit81, lambda$Fn28);
        }
        this.Brown = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit57, Lit83, Lit84, lambda$Fn29), $result);
        } else {
            addToComponents(Lit57, Lit86, Lit84, lambda$Fn30);
        }
        this.Vertical_Arrangement2_copy_copy7 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit57, Lit87, Lit88, lambda$Fn31), $result);
        } else {
            addToComponents(Lit57, Lit89, Lit88, lambda$Fn32);
        }
        this.black = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit57, Lit90, Lit91, lambda$Fn33), $result);
        } else {
            addToComponents(Lit57, Lit93, Lit91, lambda$Fn34);
        }
        this.Vertical_Arrangement2_copy_copy8 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit57, Lit94, Lit95, lambda$Fn35), $result);
        } else {
            addToComponents(Lit57, Lit96, Lit95, lambda$Fn36);
        }
        this.grey = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit57, Lit97, Lit98, lambda$Fn37), $result);
        } else {
            addToComponents(Lit57, Lit100, Lit98, lambda$Fn38);
        }
        this.Vertical_Arrangement2_copy_copy4 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit57, Lit101, Lit102, lambda$Fn39), $result);
        } else {
            addToComponents(Lit57, Lit103, Lit102, lambda$Fn40);
        }
        this.orange = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit57, Lit104, Lit105, lambda$Fn41), $result);
        } else {
            addToComponents(Lit57, Lit107, Lit105, lambda$Fn42);
        }
        this.Vertical_Arrangement2_copy_copy9 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit57, Lit108, Lit109, lambda$Fn43), $result);
        } else {
            addToComponents(Lit57, Lit110, Lit109, lambda$Fn44);
        }
        this.Button12 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit57, Lit111, Lit112, lambda$Fn45), $result);
        } else {
            addToComponents(Lit57, Lit114, Lit112, lambda$Fn46);
        }
        this.Vertical_Arrangement2_copy_copy1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit115, Lit116, lambda$Fn47), $result);
        } else {
            addToComponents(Lit0, Lit117, Lit116, lambda$Fn48);
        }
        this.Button4 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit118, Lit119, lambda$Fn49), $result);
        } else {
            addToComponents(Lit0, Lit122, Lit119, lambda$Fn50);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment = C1168runtime.addToCurrentFormEnvironment(Lit124, this.Button4$Click);
        } else {
            addToFormEnvironment(Lit124, this.Button4$Click);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "Button4", "Click");
        } else {
            addToEvents(Lit119, Lit125);
        }
        C1168runtime.initRuntime();
    }

    static Object lambda3() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit3, Lit4, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "6063526160367616", Lit7);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Classifier", Lit7);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit9, Lit10, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Lit12, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Lit14, Lit5);
        Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit15, Lit16, Lit5);
        Object andCoerceProperty$Ex8 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit17, Lit18, Lit5);
        Object andCoerceProperty$Ex9 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit19, AlgorithmIdentifiers.NONE, Lit7);
        Object andCoerceProperty$Ex10 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit20, Boolean.TRUE, Lit21);
        Object andCoerceProperty$Ex11 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "Screen16", Lit7);
        return C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit23, Boolean.FALSE, Lit21);
    }

    static Object lambda4() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit25, Lit9, Lit26, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit25, Lit27, Lit28, Lit5);
    }

    static Object lambda5() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit25, Lit9, Lit26, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit25, Lit27, Lit28, Lit5);
    }

    static Object lambda6() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit31, Lit32, Lit33, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit31, Lit34, Lit28, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit31, Lit35, "Color chart", Lit7);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit31, Lit36, Lit37, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit31, Lit27, Lit28, Lit5);
    }

    static Object lambda7() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit31, Lit32, Lit33, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit31, Lit34, Lit28, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit31, Lit35, "Color chart", Lit7);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit31, Lit36, Lit37, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit31, Lit27, Lit28, Lit5);
    }

    static Object lambda8() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit40, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit40, Lit27, Lit28, Lit5);
    }

    static Object lambda9() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit40, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit40, Lit27, Lit28, Lit5);
    }

    static Object lambda10() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit44, Lit27, Lit28, Lit5);
    }

    static Object lambda11() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit44, Lit27, Lit28, Lit5);
    }

    static Object lambda12() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit47, Lit48, Boolean.TRUE, Lit21);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit47, Lit32, Lit49, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit47, Lit50, Lit51, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit47, Lit35, "Choose your result color!", Lit7);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit47, Lit52, Lit53, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit47, Lit36, Lit54, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit47, Lit27, Lit28, Lit5);
    }

    static Object lambda13() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit47, Lit48, Boolean.TRUE, Lit21);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit47, Lit32, Lit49, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit47, Lit50, Lit51, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit47, Lit35, "Choose your result color!", Lit7);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit47, Lit52, Lit53, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit47, Lit36, Lit54, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit47, Lit27, Lit28, Lit5);
    }

    static Object lambda14() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit57, Lit34, Lit28, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit57, Lit27, Lit28, Lit5);
    }

    static Object lambda15() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit57, Lit34, Lit28, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit57, Lit27, Lit28, Lit5);
    }

    static Object lambda16() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit60, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit60, Lit27, Lit28, Lit5);
    }

    static Object lambda17() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit60, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit60, Lit27, Lit28, Lit5);
    }

    static Object lambda18() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit63, Lit9, Lit64, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit63, Lit27, Lit28, Lit5);
    }

    static Object lambda19() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit63, Lit9, Lit64, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit63, Lit27, Lit28, Lit5);
    }

    static Object lambda20() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit67, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit67, Lit27, Lit28, Lit5);
    }

    static Object lambda21() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit67, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit67, Lit27, Lit28, Lit5);
    }

    static Object lambda22() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit70, Lit9, Lit71, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit70, Lit27, Lit28, Lit5);
    }

    static Object lambda23() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit70, Lit9, Lit71, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit70, Lit27, Lit28, Lit5);
    }

    static Object lambda24() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit74, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit74, Lit27, Lit28, Lit5);
    }

    static Object lambda25() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit74, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit74, Lit27, Lit28, Lit5);
    }

    static Object lambda26() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit77, Lit9, Lit78, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit77, Lit27, Lit28, Lit5);
    }

    static Object lambda27() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit77, Lit9, Lit78, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit77, Lit27, Lit28, Lit5);
    }

    static Object lambda28() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit81, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit81, Lit27, Lit28, Lit5);
    }

    static Object lambda29() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit81, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit81, Lit27, Lit28, Lit5);
    }

    static Object lambda30() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit84, Lit9, Lit85, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit84, Lit27, Lit28, Lit5);
    }

    static Object lambda31() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit84, Lit9, Lit85, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit84, Lit27, Lit28, Lit5);
    }

    static Object lambda32() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit88, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit88, Lit27, Lit28, Lit5);
    }

    static Object lambda33() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit88, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit88, Lit27, Lit28, Lit5);
    }

    static Object lambda34() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit91, Lit9, Lit92, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit91, Lit27, Lit28, Lit5);
    }

    static Object lambda35() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit91, Lit9, Lit92, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit91, Lit27, Lit28, Lit5);
    }

    static Object lambda36() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit95, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit95, Lit27, Lit28, Lit5);
    }

    static Object lambda37() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit95, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit95, Lit27, Lit28, Lit5);
    }

    static Object lambda38() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit98, Lit9, Lit99, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit98, Lit27, Lit28, Lit5);
    }

    static Object lambda39() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit98, Lit9, Lit99, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit98, Lit27, Lit28, Lit5);
    }

    static Object lambda40() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit102, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit102, Lit27, Lit28, Lit5);
    }

    static Object lambda41() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit102, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit102, Lit27, Lit28, Lit5);
    }

    static Object lambda42() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit105, Lit9, Lit106, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit105, Lit27, Lit28, Lit5);
    }

    static Object lambda43() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit105, Lit9, Lit106, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit105, Lit27, Lit28, Lit5);
    }

    static Object lambda44() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit109, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit109, Lit27, Lit28, Lit5);
    }

    static Object lambda45() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit109, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit109, Lit27, Lit28, Lit5);
    }

    static Object lambda46() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit112, Lit9, Lit113, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit112, Lit27, Lit28, Lit5);
    }

    static Object lambda47() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit112, Lit9, Lit113, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit112, Lit27, Lit28, Lit5);
    }

    static Object lambda48() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit116, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit116, Lit27, Lit28, Lit5);
    }

    static Object lambda49() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit116, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit116, Lit27, Lit28, Lit5);
    }

    static Object lambda50() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit119, Lit9, Lit120, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit119, Lit48, Boolean.TRUE, Lit21);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit119, Lit32, Lit121, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit119, Lit50, Lit53, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit119, Lit35, "Back", Lit7);
    }

    static Object lambda51() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit119, Lit9, Lit120, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit119, Lit48, Boolean.TRUE, Lit21);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit119, Lit32, Lit121, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit119, Lit50, Lit53, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit119, Lit35, "Back", Lit7);
    }

    public Object Button4$Click() {
        C1168runtime.setThisForm();
        return C1168runtime.callYailPrimitive(C1168runtime.open$Mnanother$Mnscreen, LList.list1("Screen6"), Lit123, "open another screen");
    }

    /* renamed from: io.kodular.kajalnikunj1024.Classifier.Screen16$frame */
    /* compiled from: Screen16.yail */
    public class frame extends ModuleBody {
        Screen16 $main;

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
                    if (!(obj7 instanceof Screen16)) {
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
                    if (!(obj9 instanceof Screen16)) {
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
                    if (!(obj17 instanceof Screen16)) {
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
                    return Screen16.lambda2();
                case 18:
                    this.$main.$define();
                    return Values.empty;
                case 19:
                    return Screen16.lambda3();
                case 20:
                    return Screen16.lambda4();
                case 21:
                    return Screen16.lambda5();
                case 22:
                    return Screen16.lambda6();
                case 23:
                    return Screen16.lambda7();
                case 24:
                    return Screen16.lambda8();
                case 25:
                    return Screen16.lambda9();
                case 26:
                    return Screen16.lambda10();
                case 27:
                    return Screen16.lambda11();
                case 28:
                    return Screen16.lambda12();
                case 29:
                    return Screen16.lambda13();
                case 30:
                    return Screen16.lambda14();
                case 31:
                    return Screen16.lambda15();
                case 32:
                    return Screen16.lambda16();
                case 33:
                    return Screen16.lambda17();
                case 34:
                    return Screen16.lambda18();
                case 35:
                    return Screen16.lambda19();
                case 36:
                    return Screen16.lambda20();
                case 37:
                    return Screen16.lambda21();
                case 38:
                    return Screen16.lambda22();
                case 39:
                    return Screen16.lambda23();
                case 40:
                    return Screen16.lambda24();
                case 41:
                    return Screen16.lambda25();
                case 42:
                    return Screen16.lambda26();
                case 43:
                    return Screen16.lambda27();
                case 44:
                    return Screen16.lambda28();
                case 45:
                    return Screen16.lambda29();
                case 46:
                    return Screen16.lambda30();
                case 47:
                    return Screen16.lambda31();
                case 48:
                    return Screen16.lambda32();
                case 49:
                    return Screen16.lambda33();
                case 50:
                    return Screen16.lambda34();
                case 51:
                    return Screen16.lambda35();
                case 52:
                    return Screen16.lambda36();
                case 53:
                    return Screen16.lambda37();
                case 54:
                    return Screen16.lambda38();
                case 55:
                    return Screen16.lambda39();
                case 56:
                    return Screen16.lambda40();
                case 57:
                    return Screen16.lambda41();
                case 58:
                    return Screen16.lambda42();
                case 59:
                    return Screen16.lambda43();
                case 60:
                    return Screen16.lambda44();
                case 61:
                    return Screen16.lambda45();
                case 62:
                    return Screen16.lambda46();
                case 63:
                    return Screen16.lambda47();
                case 64:
                    return Screen16.lambda48();
                case 65:
                    return Screen16.lambda49();
                case 66:
                    return Screen16.lambda50();
                case 67:
                    return Screen16.lambda51();
                case 68:
                    return this.$main.Button4$Click();
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
        Screen16 = this;
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
