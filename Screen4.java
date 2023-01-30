package p004io.kodular.kajalnikunj1024.Classifier;

import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Spinner;
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

/* renamed from: io.kodular.kajalnikunj1024.Classifier.Screen4 */
/* compiled from: Screen4.yail */
public class Screen4 extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final IntNum Lit10;
    static final SimpleSymbol Lit100;
    static final IntNum Lit101;
    static final IntNum Lit102;
    static final IntNum Lit103;
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
    static final SimpleSymbol Lit117;
    static final FString Lit118;
    static final PairWithPosition Lit119;
    static final IntNum Lit12 = IntNum.make(23);
    static final SimpleSymbol Lit120;
    static final SimpleSymbol Lit121;
    static final SimpleSymbol Lit122;
    static final SimpleSymbol Lit123;
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
    static final IntNum Lit14;
    static final SimpleSymbol Lit15;
    static final IntNum Lit16;
    static final SimpleSymbol Lit17;
    static final SimpleSymbol Lit18;
    static final SimpleSymbol Lit19;
    static final SimpleSymbol Lit2;
    static final SimpleSymbol Lit20;
    static final FString Lit21;
    static final SimpleSymbol Lit22;
    static final SimpleSymbol Lit23;
    static final IntNum Lit24 = IntNum.make(30);
    static final SimpleSymbol Lit25;
    static final IntNum Lit26 = IntNum.make(-2);
    static final FString Lit27;
    static final FString Lit28;
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final IntNum Lit31 = IntNum.make(3);
    static final FString Lit32;
    static final FString Lit33;
    static final SimpleSymbol Lit34;
    static final IntNum Lit35;
    static final SimpleSymbol Lit36;
    static final SimpleSymbol Lit37;
    static final SimpleSymbol Lit38;
    static final IntNum Lit39 = IntNum.make(2);
    static final IntNum Lit4;
    static final SimpleSymbol Lit40;
    static final SimpleSymbol Lit41;
    static final IntNum Lit42 = IntNum.make(1);
    static final SimpleSymbol Lit43;
    static final IntNum Lit44;
    static final IntNum Lit45 = IntNum.make(300);
    static final FString Lit46;
    static final FString Lit47;
    static final SimpleSymbol Lit48;
    static final FString Lit49;
    static final SimpleSymbol Lit5;
    static final FString Lit50;
    static final SimpleSymbol Lit51;
    static final FString Lit52;
    static final FString Lit53;
    static final SimpleSymbol Lit54;
    static final IntNum Lit55 = IntNum.make(25);
    static final IntNum Lit56;
    static final FString Lit57;
    static final FString Lit58;
    static final SimpleSymbol Lit59;
    static final SimpleSymbol Lit6;
    static final FString Lit60;
    static final FString Lit61;
    static final SimpleSymbol Lit62;
    static final IntNum Lit63;
    static final FString Lit64;
    static final FString Lit65;
    static final SimpleSymbol Lit66;
    static final SimpleSymbol Lit67;
    static final SimpleSymbol Lit68;
    static final IntNum Lit69;
    static final SimpleSymbol Lit7;
    static final SimpleSymbol Lit70;
    static final IntNum Lit71;
    static final SimpleSymbol Lit72;
    static final SimpleSymbol Lit73;
    static final IntNum Lit74;
    static final SimpleSymbol Lit75;
    static final IntNum Lit76 = IntNum.make(15);
    static final SimpleSymbol Lit77;
    static final FString Lit78;
    static final FString Lit79;
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit80;
    static final FString Lit81;
    static final FString Lit82;
    static final SimpleSymbol Lit83;
    static final FString Lit84;
    static final FString Lit85;
    static final SimpleSymbol Lit86;
    static final FString Lit87;
    static final FString Lit88;
    static final SimpleSymbol Lit89;
    static final SimpleSymbol Lit9;
    static final IntNum Lit90;
    static final FString Lit91;
    static final FString Lit92;
    static final SimpleSymbol Lit93;
    static final FString Lit94;
    static final FString Lit95;
    static final SimpleSymbol Lit96;
    static final IntNum Lit97;
    static final FString Lit98;
    static final FString Lit99;
    public static Screen4 Screen4;
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
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public HorizontalArrangement Horizontal_Arrangement1;
    public HorizontalArrangement Horizontal_Arrangement2;
    public Label Label1;
    public Label Label2;
    public Label Label3;
    public Spinner Option_1;
    public Spinner Option_2;
    public VerticalArrangement Vertical_Arrangement1;
    public VerticalArrangement Vertical_Arrangement10;
    public VerticalArrangement Vertical_Arrangement11;
    public VerticalArrangement Vertical_Arrangement12;
    public VerticalArrangement Vertical_Arrangement2;
    public VerticalArrangement Vertical_Arrangement3;
    public VerticalArrangement Vertical_Arrangement4;
    public VerticalArrangement Vertical_Arrangement5;
    public VerticalArrangement Vertical_Arrangement6;
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
    public Button nextpg;
    public final ModuleMethod nextpg$Click;
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
        SimpleSymbol simpleSymbol19;
        FString fString2;
        FString fString3;
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
        FString fString12;
        FString fString13;
        SimpleSymbol simpleSymbol25;
        FString fString14;
        FString fString15;
        SimpleSymbol simpleSymbol26;
        FString fString16;
        FString fString17;
        SimpleSymbol simpleSymbol27;
        FString fString18;
        FString fString19;
        SimpleSymbol simpleSymbol28;
        FString fString20;
        FString fString21;
        SimpleSymbol simpleSymbol29;
        FString fString22;
        FString fString23;
        SimpleSymbol simpleSymbol30;
        SimpleSymbol simpleSymbol31;
        SimpleSymbol simpleSymbol32;
        SimpleSymbol simpleSymbol33;
        SimpleSymbol simpleSymbol34;
        SimpleSymbol simpleSymbol35;
        SimpleSymbol simpleSymbol36;
        SimpleSymbol simpleSymbol37;
        FString fString24;
        FString fString25;
        SimpleSymbol simpleSymbol38;
        FString fString26;
        FString fString27;
        SimpleSymbol simpleSymbol39;
        FString fString28;
        FString fString29;
        SimpleSymbol simpleSymbol40;
        FString fString30;
        FString fString31;
        SimpleSymbol simpleSymbol41;
        FString fString32;
        FString fString33;
        SimpleSymbol simpleSymbol42;
        FString fString34;
        FString fString35;
        SimpleSymbol simpleSymbol43;
        SimpleSymbol simpleSymbol44;
        SimpleSymbol simpleSymbol45;
        SimpleSymbol simpleSymbol46;
        SimpleSymbol simpleSymbol47;
        SimpleSymbol simpleSymbol48;
        SimpleSymbol simpleSymbol49;
        FString fString36;
        FString fString37;
        SimpleSymbol simpleSymbol50;
        SimpleSymbol simpleSymbol51;
        FString fString38;
        FString fString39;
        SimpleSymbol simpleSymbol52;
        SimpleSymbol simpleSymbol53;
        SimpleSymbol simpleSymbol54;
        FString fString40;
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
        SimpleSymbol simpleSymbol67;
        SimpleSymbol simpleSymbol68;
        SimpleSymbol simpleSymbol69;
        new SimpleSymbol("lookup-handler");
        Lit135 = (SimpleSymbol) simpleSymbol.readResolve();
        new SimpleSymbol("dispatchGenericEvent");
        Lit134 = (SimpleSymbol) simpleSymbol2.readResolve();
        new SimpleSymbol("dispatchEvent");
        Lit133 = (SimpleSymbol) simpleSymbol3.readResolve();
        new SimpleSymbol("send-error");
        Lit132 = (SimpleSymbol) simpleSymbol4.readResolve();
        new SimpleSymbol("add-to-form-do-after-creation");
        Lit131 = (SimpleSymbol) simpleSymbol5.readResolve();
        new SimpleSymbol("add-to-global-vars");
        Lit130 = (SimpleSymbol) simpleSymbol6.readResolve();
        new SimpleSymbol("add-to-components");
        Lit129 = (SimpleSymbol) simpleSymbol7.readResolve();
        new SimpleSymbol("add-to-events");
        Lit128 = (SimpleSymbol) simpleSymbol8.readResolve();
        new SimpleSymbol("add-to-global-var-environment");
        Lit127 = (SimpleSymbol) simpleSymbol9.readResolve();
        new SimpleSymbol("is-bound-in-form-environment");
        Lit126 = (SimpleSymbol) simpleSymbol10.readResolve();
        new SimpleSymbol("lookup-in-form-environment");
        Lit125 = (SimpleSymbol) simpleSymbol11.readResolve();
        new SimpleSymbol("add-to-form-environment");
        Lit124 = (SimpleSymbol) simpleSymbol12.readResolve();
        new SimpleSymbol("android-log-form");
        Lit123 = (SimpleSymbol) simpleSymbol13.readResolve();
        new SimpleSymbol("get-simple-name");
        Lit122 = (SimpleSymbol) simpleSymbol14.readResolve();
        new SimpleSymbol("Click");
        Lit121 = (SimpleSymbol) simpleSymbol15.readResolve();
        new SimpleSymbol("nextpg$Click");
        Lit120 = (SimpleSymbol) simpleSymbol16.readResolve();
        new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT);
        SimpleSymbol simpleSymbol70 = (SimpleSymbol) simpleSymbol17.readResolve();
        Lit7 = simpleSymbol70;
        Lit119 = PairWithPosition.make(simpleSymbol70, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/Screen4.yail", 1085521);
        new FString("com.google.appinventor.components.runtime.Button");
        Lit118 = fString;
        new SimpleSymbol("Shape");
        Lit117 = (SimpleSymbol) simpleSymbol18.readResolve();
        int[] iArr = new int[2];
        iArr[0] = -13463672;
        Lit116 = IntNum.make(iArr);
        new SimpleSymbol("nextpg");
        Lit115 = (SimpleSymbol) simpleSymbol19.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit114 = fString2;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit113 = fString3;
        new SimpleSymbol("Vertical_Arrangement9");
        Lit112 = (SimpleSymbol) simpleSymbol20.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit111 = fString4;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit110 = fString5;
        new SimpleSymbol("Vertical_Arrangement12");
        Lit109 = (SimpleSymbol) simpleSymbol21.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit108 = fString6;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit107 = fString7;
        new SimpleSymbol("Vertical_Arrangement10");
        Lit106 = (SimpleSymbol) simpleSymbol22.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit105 = fString8;
        new FString("com.google.appinventor.components.runtime.Spinner");
        Lit104 = fString9;
        int[] iArr2 = new int[2];
        iArr2[0] = -6381922;
        Lit103 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -23886135;
        Lit102 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -32615864;
        Lit101 = IntNum.make(iArr4);
        new SimpleSymbol("Option_2");
        Lit100 = (SimpleSymbol) simpleSymbol23.readResolve();
        new FString("com.google.appinventor.components.runtime.Spinner");
        Lit99 = fString10;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit98 = fString11;
        int[] iArr5 = new int[2];
        iArr5[0] = -1;
        Lit97 = IntNum.make(iArr5);
        new SimpleSymbol("Vertical_Arrangement8");
        Lit96 = (SimpleSymbol) simpleSymbol24.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit95 = fString12;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit94 = fString13;
        new SimpleSymbol("Horizontal_Arrangement2");
        Lit93 = (SimpleSymbol) simpleSymbol25.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit92 = fString14;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit91 = fString15;
        int[] iArr6 = new int[2];
        iArr6[0] = -10395295;
        Lit90 = IntNum.make(iArr6);
        new SimpleSymbol("Label3");
        Lit89 = (SimpleSymbol) simpleSymbol26.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit88 = fString16;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit87 = fString17;
        new SimpleSymbol("Vertical_Arrangement6");
        Lit86 = (SimpleSymbol) simpleSymbol27.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit85 = fString18;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit84 = fString19;
        new SimpleSymbol("Vertical_Arrangement11");
        Lit83 = (SimpleSymbol) simpleSymbol28.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit82 = fString20;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit81 = fString21;
        new SimpleSymbol("Vertical_Arrangement7");
        Lit80 = (SimpleSymbol) simpleSymbol29.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit79 = fString22;
        new FString("com.google.appinventor.components.runtime.Spinner");
        Lit78 = fString23;
        new SimpleSymbol("TextSize");
        Lit77 = (SimpleSymbol) simpleSymbol30.readResolve();
        new SimpleSymbol("SpinnerTextSize");
        Lit75 = (SimpleSymbol) simpleSymbol31.readResolve();
        int[] iArr7 = new int[2];
        iArr7[0] = -6381922;
        Lit74 = IntNum.make(iArr7);
        new SimpleSymbol("SpinnerColor");
        Lit73 = (SimpleSymbol) simpleSymbol32.readResolve();
        new SimpleSymbol("Selection");
        Lit72 = (SimpleSymbol) simpleSymbol33.readResolve();
        int[] iArr8 = new int[2];
        iArr8[0] = -23886135;
        Lit71 = IntNum.make(iArr8);
        new SimpleSymbol("PromptItemColor");
        Lit70 = (SimpleSymbol) simpleSymbol34.readResolve();
        int[] iArr9 = new int[2];
        iArr9[0] = -32615864;
        Lit69 = IntNum.make(iArr9);
        new SimpleSymbol("ItemBackgroundColor");
        Lit68 = (SimpleSymbol) simpleSymbol35.readResolve();
        new SimpleSymbol("ElementsFromString");
        Lit67 = (SimpleSymbol) simpleSymbol36.readResolve();
        new SimpleSymbol("Option_1");
        Lit66 = (SimpleSymbol) simpleSymbol37.readResolve();
        new FString("com.google.appinventor.components.runtime.Spinner");
        Lit65 = fString24;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit64 = fString25;
        int[] iArr10 = new int[2];
        iArr10[0] = -1;
        Lit63 = IntNum.make(iArr10);
        new SimpleSymbol("Vertical_Arrangement5");
        Lit62 = (SimpleSymbol) simpleSymbol38.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit61 = fString26;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit60 = fString27;
        new SimpleSymbol("Horizontal_Arrangement1");
        Lit59 = (SimpleSymbol) simpleSymbol39.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit58 = fString28;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit57 = fString29;
        int[] iArr11 = new int[2];
        iArr11[0] = -10395295;
        Lit56 = IntNum.make(iArr11);
        new SimpleSymbol("Label2");
        Lit54 = (SimpleSymbol) simpleSymbol40.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit53 = fString30;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit52 = fString31;
        new SimpleSymbol("Vertical_Arrangement3");
        Lit51 = (SimpleSymbol) simpleSymbol41.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit50 = fString32;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit49 = fString33;
        new SimpleSymbol("Vertical_Arrangement4");
        Lit48 = (SimpleSymbol) simpleSymbol42.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit47 = fString34;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit46 = fString35;
        int[] iArr12 = new int[2];
        iArr12[0] = -1;
        Lit44 = IntNum.make(iArr12);
        new SimpleSymbol("TextColor");
        Lit43 = (SimpleSymbol) simpleSymbol43.readResolve();
        new SimpleSymbol("TextAlignment");
        Lit41 = (SimpleSymbol) simpleSymbol44.readResolve();
        new SimpleSymbol("Text");
        Lit40 = (SimpleSymbol) simpleSymbol45.readResolve();
        new SimpleSymbol("FontTypeface");
        Lit38 = (SimpleSymbol) simpleSymbol46.readResolve();
        new SimpleSymbol("FontSize");
        Lit37 = (SimpleSymbol) simpleSymbol47.readResolve();
        new SimpleSymbol("FontBold");
        Lit36 = (SimpleSymbol) simpleSymbol48.readResolve();
        int[] iArr13 = new int[2];
        iArr13[0] = -13463672;
        Lit35 = IntNum.make(iArr13);
        new SimpleSymbol("Label1");
        Lit34 = (SimpleSymbol) simpleSymbol49.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit33 = fString36;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit32 = fString37;
        new SimpleSymbol("AlignHorizontal");
        Lit30 = (SimpleSymbol) simpleSymbol50.readResolve();
        new SimpleSymbol("Vertical_Arrangement2");
        Lit29 = (SimpleSymbol) simpleSymbol51.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit28 = fString38;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit27 = fString39;
        new SimpleSymbol("Width");
        Lit25 = (SimpleSymbol) simpleSymbol52.readResolve();
        new SimpleSymbol("Height");
        Lit23 = (SimpleSymbol) simpleSymbol53.readResolve();
        new SimpleSymbol("Vertical_Arrangement1");
        Lit22 = (SimpleSymbol) simpleSymbol54.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit21 = fString40;
        new SimpleSymbol("boolean");
        Lit20 = (SimpleSymbol) simpleSymbol55.readResolve();
        new SimpleSymbol("TitleVisible");
        Lit19 = (SimpleSymbol) simpleSymbol56.readResolve();
        new SimpleSymbol("Title");
        Lit18 = (SimpleSymbol) simpleSymbol57.readResolve();
        new SimpleSymbol("ReceiveSharedText");
        Lit17 = (SimpleSymbol) simpleSymbol58.readResolve();
        int[] iArr14 = new int[2];
        iArr14[0] = -32615864;
        Lit16 = IntNum.make(iArr14);
        new SimpleSymbol("PrimaryColorDark");
        Lit15 = (SimpleSymbol) simpleSymbol59.readResolve();
        int[] iArr15 = new int[2];
        iArr15[0] = -26950686;
        Lit14 = IntNum.make(iArr15);
        new SimpleSymbol("PrimaryColor");
        Lit13 = (SimpleSymbol) simpleSymbol60.readResolve();
        new SimpleSymbol("MinSdk");
        Lit11 = (SimpleSymbol) simpleSymbol61.readResolve();
        int[] iArr16 = new int[2];
        iArr16[0] = -722477;
        Lit10 = IntNum.make(iArr16);
        new SimpleSymbol("BackgroundColor");
        Lit9 = (SimpleSymbol) simpleSymbol62.readResolve();
        new SimpleSymbol("AppName");
        Lit8 = (SimpleSymbol) simpleSymbol63.readResolve();
        new SimpleSymbol("AppId");
        Lit6 = (SimpleSymbol) simpleSymbol64.readResolve();
        new SimpleSymbol("number");
        Lit5 = (SimpleSymbol) simpleSymbol65.readResolve();
        int[] iArr17 = new int[2];
        iArr17[0] = -92160;
        Lit4 = IntNum.make(iArr17);
        new SimpleSymbol("AccentColor");
        Lit3 = (SimpleSymbol) simpleSymbol66.readResolve();
        new SimpleSymbol("*the-null-value*");
        Lit2 = (SimpleSymbol) simpleSymbol67.readResolve();
        new SimpleSymbol("getMessage");
        Lit1 = (SimpleSymbol) simpleSymbol68.readResolve();
        new SimpleSymbol("Screen4");
        Lit0 = (SimpleSymbol) simpleSymbol69.readResolve();
    }

    public Screen4() {
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
        ModuleInfo.register(this);
        ModuleMethod moduleMethod60 = moduleMethod;
        new frame();
        frame frame3 = frame2;
        frame3.$main = this;
        frame frame4 = frame3;
        new ModuleMethod(frame4, 1, Lit122, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.get$Mnsimple$Mnname = moduleMethod60;
        new ModuleMethod(frame4, 2, Lit123, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = moduleMethod2;
        new ModuleMethod(frame4, 3, Lit124, 8194);
        this.add$Mnto$Mnform$Mnenvironment = moduleMethod3;
        new ModuleMethod(frame4, 4, Lit125, 8193);
        this.lookup$Mnin$Mnform$Mnenvironment = moduleMethod4;
        new ModuleMethod(frame4, 6, Lit126, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = moduleMethod5;
        new ModuleMethod(frame4, 7, Lit127, 8194);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = moduleMethod6;
        new ModuleMethod(frame4, 8, Lit128, 8194);
        this.add$Mnto$Mnevents = moduleMethod7;
        new ModuleMethod(frame4, 9, Lit129, 16388);
        this.add$Mnto$Mncomponents = moduleMethod8;
        new ModuleMethod(frame4, 10, Lit130, 8194);
        this.add$Mnto$Mnglobal$Mnvars = moduleMethod9;
        new ModuleMethod(frame4, 11, Lit131, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = moduleMethod10;
        new ModuleMethod(frame4, 12, Lit132, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = moduleMethod11;
        new ModuleMethod(frame4, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = moduleMethod12;
        new ModuleMethod(frame4, 14, Lit133, 16388);
        this.dispatchEvent = moduleMethod13;
        new ModuleMethod(frame4, 15, Lit134, 16388);
        this.dispatchGenericEvent = moduleMethod14;
        new ModuleMethod(frame4, 16, Lit135, 8194);
        this.lookup$Mnhandler = moduleMethod15;
        new ModuleMethod(frame4, 17, (Object) null, 0);
        ModuleMethod moduleMethod61 = moduleMethod16;
        moduleMethod61.setProperty("source-location", "/tmp/runtime2211785962717768109.scm:620");
        lambda$Fn1 = moduleMethod61;
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
        new ModuleMethod(frame4, 60, Lit120, 0);
        this.nextpg$Click = moduleMethod59;
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
        Screen4 = null;
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
            Object andCoerceProperty$Ex8 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit17, AlgorithmIdentifiers.NONE, Lit7);
            Object andCoerceProperty$Ex9 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "Screen4", Lit7);
            Values.writeValues(C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Boolean.FALSE, Lit20), $result);
        } else {
            new Promise(lambda$Fn2);
            addToFormDoAfterCreation(obj2);
        }
        this.Vertical_Arrangement1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit21, Lit22, lambda$Fn3), $result);
        } else {
            addToComponents(Lit0, Lit27, Lit22, lambda$Fn4);
        }
        this.Vertical_Arrangement2 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit28, Lit29, lambda$Fn5), $result);
        } else {
            addToComponents(Lit0, Lit32, Lit29, lambda$Fn6);
        }
        this.Label1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit29, Lit33, Lit34, lambda$Fn7), $result);
        } else {
            addToComponents(Lit29, Lit46, Lit34, lambda$Fn8);
        }
        this.Vertical_Arrangement4 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit47, Lit48, lambda$Fn9), $result);
        } else {
            addToComponents(Lit0, Lit49, Lit48, lambda$Fn10);
        }
        this.Vertical_Arrangement3 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit50, Lit51, lambda$Fn11), $result);
        } else {
            addToComponents(Lit0, Lit52, Lit51, lambda$Fn12);
        }
        this.Label2 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit51, Lit53, Lit54, lambda$Fn13), $result);
        } else {
            addToComponents(Lit51, Lit57, Lit54, lambda$Fn14);
        }
        this.Horizontal_Arrangement1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit58, Lit59, lambda$Fn15), $result);
        } else {
            addToComponents(Lit0, Lit60, Lit59, lambda$Fn16);
        }
        this.Vertical_Arrangement5 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit61, Lit62, lambda$Fn17), $result);
        } else {
            addToComponents(Lit0, Lit64, Lit62, lambda$Fn18);
        }
        this.Option_1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit62, Lit65, Lit66, lambda$Fn19), $result);
        } else {
            addToComponents(Lit62, Lit78, Lit66, lambda$Fn20);
        }
        this.Vertical_Arrangement7 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit79, Lit80, lambda$Fn21), $result);
        } else {
            addToComponents(Lit0, Lit81, Lit80, lambda$Fn22);
        }
        this.Vertical_Arrangement11 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit82, Lit83, lambda$Fn23), $result);
        } else {
            addToComponents(Lit0, Lit84, Lit83, lambda$Fn24);
        }
        this.Vertical_Arrangement6 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit85, Lit86, lambda$Fn25), $result);
        } else {
            addToComponents(Lit0, Lit87, Lit86, lambda$Fn26);
        }
        this.Label3 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit86, Lit88, Lit89, lambda$Fn27), $result);
        } else {
            addToComponents(Lit86, Lit91, Lit89, lambda$Fn28);
        }
        this.Horizontal_Arrangement2 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit92, Lit93, lambda$Fn29), $result);
        } else {
            addToComponents(Lit0, Lit94, Lit93, lambda$Fn30);
        }
        this.Vertical_Arrangement8 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit95, Lit96, lambda$Fn31), $result);
        } else {
            addToComponents(Lit0, Lit98, Lit96, lambda$Fn32);
        }
        this.Option_2 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit96, Lit99, Lit100, lambda$Fn33), $result);
        } else {
            addToComponents(Lit96, Lit104, Lit100, lambda$Fn34);
        }
        this.Vertical_Arrangement10 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit105, Lit106, lambda$Fn35), $result);
        } else {
            addToComponents(Lit0, Lit107, Lit106, lambda$Fn36);
        }
        this.Vertical_Arrangement12 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit108, Lit109, lambda$Fn37), $result);
        } else {
            addToComponents(Lit0, Lit110, Lit109, lambda$Fn38);
        }
        this.Vertical_Arrangement9 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit111, Lit112, lambda$Fn39), $result);
        } else {
            addToComponents(Lit0, Lit113, Lit112, lambda$Fn40);
        }
        this.nextpg = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit112, Lit114, Lit115, lambda$Fn41), $result);
        } else {
            addToComponents(Lit112, Lit118, Lit115, lambda$Fn42);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment = C1168runtime.addToCurrentFormEnvironment(Lit120, this.nextpg$Click);
        } else {
            addToFormEnvironment(Lit120, this.nextpg$Click);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "nextpg", "Click");
        } else {
            addToEvents(Lit115, Lit121);
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
        Object andCoerceProperty$Ex8 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit17, AlgorithmIdentifiers.NONE, Lit7);
        Object andCoerceProperty$Ex9 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "Screen4", Lit7);
        return C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Boolean.FALSE, Lit20);
    }

    static Object lambda4() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit22, Lit23, Lit24, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit22, Lit25, Lit26, Lit5);
    }

    static Object lambda5() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit22, Lit23, Lit24, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit22, Lit25, Lit26, Lit5);
    }

    static Object lambda6() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit29, Lit30, Lit31, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit29, Lit25, Lit26, Lit5);
    }

    static Object lambda7() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit29, Lit30, Lit31, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit29, Lit25, Lit26, Lit5);
    }

    static Object lambda8() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit9, Lit35, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit36, Boolean.TRUE, Lit20);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit37, Lit24, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit38, Lit39, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit23, Lit26, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit40, "Questionnaire", Lit7);
        Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit41, Lit42, Lit5);
        Object andCoerceProperty$Ex8 = C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit43, Lit44, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit25, Lit45, Lit5);
    }

    static Object lambda9() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit9, Lit35, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit36, Boolean.TRUE, Lit20);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit37, Lit24, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit38, Lit39, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit23, Lit26, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit40, "Questionnaire", Lit7);
        Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit41, Lit42, Lit5);
        Object andCoerceProperty$Ex8 = C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit43, Lit44, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit25, Lit45, Lit5);
    }

    static Object lambda10() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit48, Lit23, Lit24, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit48, Lit25, Lit26, Lit5);
    }

    static Object lambda11() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit48, Lit23, Lit24, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit48, Lit25, Lit26, Lit5);
    }

    static Object lambda12() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit51, Lit25, Lit26, Lit5);
    }

    static Object lambda13() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit51, Lit25, Lit26, Lit5);
    }

    static Object lambda14() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit54, Lit36, Boolean.TRUE, Lit20);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit54, Lit37, Lit55, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit54, Lit38, Lit39, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit54, Lit23, Lit26, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit54, Lit40, " Is your period regular?", Lit7);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit54, Lit43, Lit56, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit54, Lit25, Lit26, Lit5);
    }

    static Object lambda15() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit54, Lit36, Boolean.TRUE, Lit20);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit54, Lit37, Lit55, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit54, Lit38, Lit39, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit54, Lit23, Lit26, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit54, Lit40, " Is your period regular?", Lit7);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit54, Lit43, Lit56, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit54, Lit25, Lit26, Lit5);
    }

    static Object lambda16() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit59, Lit23, Lit24, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit59, Lit25, Lit26, Lit5);
    }

    static Object lambda17() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit59, Lit23, Lit24, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit59, Lit25, Lit26, Lit5);
    }

    static Object lambda18() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit62, Lit9, Lit63, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit62, Lit25, Lit26, Lit5);
    }

    static Object lambda19() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit62, Lit9, Lit63, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit62, Lit25, Lit26, Lit5);
    }

    static Object lambda20() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit67, "Yes regular and around same time each month, No irregular (might get late or have missed sometime)​, Absence of period", Lit7);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit36, Boolean.TRUE, Lit20);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit38, Lit39, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit68, Lit69, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit70, Lit71, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit72, "Options", Lit7);
        Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit73, Lit74, Lit5);
        Object andCoerceProperty$Ex8 = C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit75, Lit76, Lit5);
        Object andCoerceProperty$Ex9 = C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit41, Lit42, Lit5);
        Object andCoerceProperty$Ex10 = C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit77, Lit76, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit25, Lit26, Lit5);
    }

    static Object lambda21() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit67, "Yes regular and around same time each month, No irregular (might get late or have missed sometime)​, Absence of period", Lit7);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit36, Boolean.TRUE, Lit20);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit38, Lit39, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit68, Lit69, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit70, Lit71, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit72, "Options", Lit7);
        Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit73, Lit74, Lit5);
        Object andCoerceProperty$Ex8 = C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit75, Lit76, Lit5);
        Object andCoerceProperty$Ex9 = C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit41, Lit42, Lit5);
        Object andCoerceProperty$Ex10 = C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit77, Lit76, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit66, Lit25, Lit26, Lit5);
    }

    static Object lambda22() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit80, Lit25, Lit26, Lit5);
    }

    static Object lambda23() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit80, Lit25, Lit26, Lit5);
    }

    static Object lambda24() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit83, Lit25, Lit26, Lit5);
    }

    static Object lambda25() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit83, Lit25, Lit26, Lit5);
    }

    static Object lambda26() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit86, Lit25, Lit26, Lit5);
    }

    static Object lambda27() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit86, Lit25, Lit26, Lit5);
    }

    static Object lambda28() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit89, Lit36, Boolean.TRUE, Lit20);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit89, Lit37, Lit55, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit89, Lit38, Lit39, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit89, Lit23, Lit26, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit89, Lit40, " Identify your bleeding                 \n condition-", Lit7);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit89, Lit43, Lit90, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit89, Lit25, Lit26, Lit5);
    }

    static Object lambda29() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit89, Lit36, Boolean.TRUE, Lit20);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit89, Lit37, Lit55, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit89, Lit38, Lit39, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit89, Lit23, Lit26, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit89, Lit40, " Identify your bleeding                 \n condition-", Lit7);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit89, Lit43, Lit90, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit89, Lit25, Lit26, Lit5);
    }

    static Object lambda30() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit93, Lit23, Lit24, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit93, Lit25, Lit26, Lit5);
    }

    static Object lambda31() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit93, Lit23, Lit24, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit93, Lit25, Lit26, Lit5);
    }

    static Object lambda32() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit96, Lit9, Lit97, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit96, Lit25, Lit26, Lit5);
    }

    static Object lambda33() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit96, Lit9, Lit97, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit96, Lit25, Lit26, Lit5);
    }

    static Object lambda34() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit100, Lit67, "Healthy, Less than normal, Heavy", Lit7);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit100, Lit36, Boolean.TRUE, Lit20);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit100, Lit38, Lit39, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit100, Lit68, Lit101, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit100, Lit70, Lit102, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit100, Lit73, Lit103, Lit5);
        Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit100, Lit75, Lit76, Lit5);
        Object andCoerceProperty$Ex8 = C1168runtime.setAndCoerceProperty$Ex(Lit100, Lit77, Lit76, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit100, Lit25, Lit26, Lit5);
    }

    static Object lambda35() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit100, Lit67, "Healthy, Less than normal, Heavy", Lit7);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit100, Lit36, Boolean.TRUE, Lit20);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit100, Lit38, Lit39, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit100, Lit68, Lit101, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit100, Lit70, Lit102, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit100, Lit73, Lit103, Lit5);
        Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit100, Lit75, Lit76, Lit5);
        Object andCoerceProperty$Ex8 = C1168runtime.setAndCoerceProperty$Ex(Lit100, Lit77, Lit76, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit100, Lit25, Lit26, Lit5);
    }

    static Object lambda36() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit106, Lit25, Lit26, Lit5);
    }

    static Object lambda37() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit106, Lit25, Lit26, Lit5);
    }

    static Object lambda38() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit109, Lit25, Lit26, Lit5);
    }

    static Object lambda39() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit109, Lit25, Lit26, Lit5);
    }

    static Object lambda40() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit112, Lit30, Lit31, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit112, Lit25, Lit26, Lit5);
    }

    static Object lambda41() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit112, Lit30, Lit31, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit112, Lit25, Lit26, Lit5);
    }

    static Object lambda42() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit9, Lit116, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit36, Boolean.TRUE, Lit20);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit37, Lit76, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit38, Lit39, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit117, Lit42, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit40, "NEXT", Lit7);
    }

    static Object lambda43() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit9, Lit116, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit36, Boolean.TRUE, Lit20);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit37, Lit76, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit38, Lit39, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit117, Lit42, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit115, Lit40, "NEXT", Lit7);
    }

    public Object nextpg$Click() {
        C1168runtime.setThisForm();
        return C1168runtime.callYailPrimitive(C1168runtime.open$Mnanother$Mnscreen, LList.list1("saving1_s5"), Lit119, "open another screen");
    }

    /* renamed from: io.kodular.kajalnikunj1024.Classifier.Screen4$frame */
    /* compiled from: Screen4.yail */
    public class frame extends ModuleBody {
        Screen4 $main;

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
                    if (!(obj7 instanceof Screen4)) {
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
                    if (!(obj9 instanceof Screen4)) {
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
                    if (!(obj17 instanceof Screen4)) {
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
                    return Screen4.lambda2();
                case 18:
                    this.$main.$define();
                    return Values.empty;
                case 19:
                    return Screen4.lambda3();
                case 20:
                    return Screen4.lambda4();
                case 21:
                    return Screen4.lambda5();
                case 22:
                    return Screen4.lambda6();
                case 23:
                    return Screen4.lambda7();
                case 24:
                    return Screen4.lambda8();
                case 25:
                    return Screen4.lambda9();
                case 26:
                    return Screen4.lambda10();
                case 27:
                    return Screen4.lambda11();
                case 28:
                    return Screen4.lambda12();
                case 29:
                    return Screen4.lambda13();
                case 30:
                    return Screen4.lambda14();
                case 31:
                    return Screen4.lambda15();
                case 32:
                    return Screen4.lambda16();
                case 33:
                    return Screen4.lambda17();
                case 34:
                    return Screen4.lambda18();
                case 35:
                    return Screen4.lambda19();
                case 36:
                    return Screen4.lambda20();
                case 37:
                    return Screen4.lambda21();
                case 38:
                    return Screen4.lambda22();
                case 39:
                    return Screen4.lambda23();
                case 40:
                    return Screen4.lambda24();
                case 41:
                    return Screen4.lambda25();
                case 42:
                    return Screen4.lambda26();
                case 43:
                    return Screen4.lambda27();
                case 44:
                    return Screen4.lambda28();
                case 45:
                    return Screen4.lambda29();
                case 46:
                    return Screen4.lambda30();
                case 47:
                    return Screen4.lambda31();
                case 48:
                    return Screen4.lambda32();
                case 49:
                    return Screen4.lambda33();
                case 50:
                    return Screen4.lambda34();
                case 51:
                    return Screen4.lambda35();
                case 52:
                    return Screen4.lambda36();
                case 53:
                    return Screen4.lambda37();
                case 54:
                    return Screen4.lambda38();
                case 55:
                    return Screen4.lambda39();
                case 56:
                    return Screen4.lambda40();
                case 57:
                    return Screen4.lambda41();
                case 58:
                    return Screen4.lambda42();
                case 59:
                    return Screen4.lambda43();
                case 60:
                    return this.$main.nextpg$Click();
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
        Screen4 = this;
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
