package p004io.kodular.kajalnikunj1024.Classifier;

import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
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

/* renamed from: io.kodular.kajalnikunj1024.Classifier.Screen6 */
/* compiled from: Screen6.yail */
public class Screen6 extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final IntNum Lit10;
    static final FString Lit100;
    static final PairWithPosition Lit101 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/Screen6.yail", 852047);
    static final SimpleSymbol Lit102;
    static final FString Lit103;
    static final SimpleSymbol Lit104;
    static final IntNum Lit105;
    static final IntNum Lit106;
    static final FString Lit107;
    static final PairWithPosition Lit108 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/Screen6.yail", 946255);
    static final SimpleSymbol Lit109;
    static final SimpleSymbol Lit11;
    static final FString Lit110;
    static final SimpleSymbol Lit111;
    static final IntNum Lit112;
    static final IntNum Lit113;
    static final FString Lit114;
    static final PairWithPosition Lit115 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/Screen6.yail", 1040463);
    static final SimpleSymbol Lit116;
    static final FString Lit117;
    static final SimpleSymbol Lit118;
    static final IntNum Lit119;
    static final IntNum Lit12 = IntNum.make(23);
    static final IntNum Lit120;
    static final FString Lit121;
    static final PairWithPosition Lit122 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/Screen6.yail", 1126479);
    static final SimpleSymbol Lit123;
    static final FString Lit124;
    static final SimpleSymbol Lit125;
    static final IntNum Lit126;
    static final IntNum Lit127;
    static final FString Lit128;
    static final PairWithPosition Lit129 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/Screen6.yail", 1220687);
    static final SimpleSymbol Lit13;
    static final SimpleSymbol Lit130;
    static final FString Lit131;
    static final SimpleSymbol Lit132;
    static final IntNum Lit133;
    static final IntNum Lit134;
    static final FString Lit135;
    static final PairWithPosition Lit136 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/Screen6.yail", 1314895);
    static final SimpleSymbol Lit137;
    static final FString Lit138;
    static final SimpleSymbol Lit139;
    static final IntNum Lit14;
    static final FString Lit140;
    static final FString Lit141;
    static final SimpleSymbol Lit142;
    static final IntNum Lit143;
    static final FString Lit144;
    static final PairWithPosition Lit145;
    static final SimpleSymbol Lit146;
    static final SimpleSymbol Lit147;
    static final SimpleSymbol Lit148;
    static final SimpleSymbol Lit149;
    static final SimpleSymbol Lit15;
    static final SimpleSymbol Lit150;
    static final SimpleSymbol Lit151;
    static final SimpleSymbol Lit152;
    static final SimpleSymbol Lit153;
    static final SimpleSymbol Lit154;
    static final SimpleSymbol Lit155;
    static final SimpleSymbol Lit156;
    static final SimpleSymbol Lit157;
    static final SimpleSymbol Lit158;
    static final SimpleSymbol Lit159;
    static final IntNum Lit16;
    static final SimpleSymbol Lit160;
    static final SimpleSymbol Lit17;
    static final SimpleSymbol Lit18;
    static final SimpleSymbol Lit19;
    static final SimpleSymbol Lit2;
    static final SimpleSymbol Lit20;
    static final SimpleSymbol Lit21;
    static final SimpleSymbol Lit22;
    static final FString Lit23;
    static final SimpleSymbol Lit24;
    static final IntNum Lit25;
    static final SimpleSymbol Lit26;
    static final IntNum Lit27 = IntNum.make(-2);
    static final FString Lit28;
    static final FString Lit29;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final IntNum Lit31;
    static final SimpleSymbol Lit32;
    static final FString Lit33;
    static final FString Lit34;
    static final SimpleSymbol Lit35;
    static final IntNum Lit36 = IntNum.make(80);
    static final FString Lit37;
    static final FString Lit38;
    static final SimpleSymbol Lit39;
    static final IntNum Lit4;
    static final SimpleSymbol Lit40;
    static final FString Lit41;
    static final FString Lit42;
    static final SimpleSymbol Lit43;
    static final FString Lit44;
    static final FString Lit45;
    static final SimpleSymbol Lit46;
    static final SimpleSymbol Lit47;
    static final IntNum Lit48 = IntNum.make(40);
    static final SimpleSymbol Lit49;
    static final SimpleSymbol Lit5;
    static final IntNum Lit50 = IntNum.make(2);
    static final SimpleSymbol Lit51;
    static final SimpleSymbol Lit52;
    static final IntNum Lit53 = IntNum.make(1);
    static final SimpleSymbol Lit54;
    static final IntNum Lit55;
    static final FString Lit56;
    static final FString Lit57;
    static final SimpleSymbol Lit58;
    static final FString Lit59;
    static final SimpleSymbol Lit6;
    static final FString Lit60;
    static final SimpleSymbol Lit61;
    static final IntNum Lit62 = IntNum.make(30);
    static final FString Lit63;
    static final FString Lit64;
    static final SimpleSymbol Lit65;
    static final IntNum Lit66;
    static final SimpleSymbol Lit67;
    static final IntNum Lit68 = IntNum.make(25);
    static final IntNum Lit69 = IntNum.make(0);
    static final SimpleSymbol Lit7;
    static final IntNum Lit70;
    static final FString Lit71;
    static final PairWithPosition Lit72 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/Screen6.yail", 507982);
    static final SimpleSymbol Lit73;
    static final SimpleSymbol Lit74;
    static final FString Lit75;
    static final SimpleSymbol Lit76;
    static final IntNum Lit77;
    static final IntNum Lit78;
    static final FString Lit79;
    static final SimpleSymbol Lit8;
    static final PairWithPosition Lit80 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/Screen6.yail", 593998);
    static final SimpleSymbol Lit81;
    static final FString Lit82;
    static final SimpleSymbol Lit83;
    static final IntNum Lit84;
    static final IntNum Lit85;
    static final FString Lit86;
    static final PairWithPosition Lit87 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/Screen6.yail", 680015);
    static final SimpleSymbol Lit88;
    static final FString Lit89;
    static final SimpleSymbol Lit9;
    static final SimpleSymbol Lit90;
    static final IntNum Lit91;
    static final IntNum Lit92;
    static final FString Lit93;
    static final PairWithPosition Lit94 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/Screen6.yail", 766030);
    static final SimpleSymbol Lit95;
    static final FString Lit96;
    static final SimpleSymbol Lit97;
    static final IntNum Lit98;
    static final IntNum Lit99;
    public static Screen6 Screen6;
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
    public Button Amenorrhea;
    public final ModuleMethod Amenorrhea$Click;
    public Button Back_Home;
    public final ModuleMethod Back_Home$Click;
    public Button Color_Chart;
    public final ModuleMethod Color_Chart$Click;
    public Button Dysfunctional;
    public final ModuleMethod Dysfunctional$Click;
    public Button Dysmenorrhea;
    public final ModuleMethod Dysmenorrhea$Click;
    public HorizontalArrangement Horizontal_Arrangement1;
    public HorizontalArrangement Horizontal_Arrangement2;
    public HorizontalArrangement Horizontal_Arrangement3;
    public Image Image1;
    public Label Label1;
    public Button Menometrorrhagia;
    public final ModuleMethod Menometrorrhagia$Click;
    public Button Menometrorrhagia_copy;
    public final ModuleMethod Menometrorrhagia_copy$Click;
    public Button Menorrhagia;
    public final ModuleMethod Menorrhagia$Click;
    public Button Oligomenorrhea;
    public final ModuleMethod Oligomenorrhea$Click;
    public Button PCOD;
    public final ModuleMethod PCOD$Click;
    public Button Premenstrual;
    public final ModuleMethod Premenstrual$Click;
    public VerticalArrangement Vertical_Arrangement1;
    public VerticalArrangement Vertical_Arrangement2;
    public VerticalArrangement Vertical_Arrangement3;
    public VerticalArrangement Vertical_Arrangement4;
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
        FString fString;
        SimpleSymbol simpleSymbol17;
        FString fString2;
        FString fString3;
        SimpleSymbol simpleSymbol18;
        FString fString4;
        SimpleSymbol simpleSymbol19;
        FString fString5;
        SimpleSymbol simpleSymbol20;
        FString fString6;
        SimpleSymbol simpleSymbol21;
        FString fString7;
        SimpleSymbol simpleSymbol22;
        FString fString8;
        SimpleSymbol simpleSymbol23;
        FString fString9;
        SimpleSymbol simpleSymbol24;
        FString fString10;
        SimpleSymbol simpleSymbol25;
        FString fString11;
        SimpleSymbol simpleSymbol26;
        FString fString12;
        SimpleSymbol simpleSymbol27;
        FString fString13;
        SimpleSymbol simpleSymbol28;
        FString fString14;
        SimpleSymbol simpleSymbol29;
        FString fString15;
        SimpleSymbol simpleSymbol30;
        FString fString16;
        SimpleSymbol simpleSymbol31;
        FString fString17;
        SimpleSymbol simpleSymbol32;
        FString fString18;
        SimpleSymbol simpleSymbol33;
        FString fString19;
        SimpleSymbol simpleSymbol34;
        FString fString20;
        SimpleSymbol simpleSymbol35;
        FString fString21;
        SimpleSymbol simpleSymbol36;
        FString fString22;
        SimpleSymbol simpleSymbol37;
        SimpleSymbol simpleSymbol38;
        FString fString23;
        SimpleSymbol simpleSymbol39;
        SimpleSymbol simpleSymbol40;
        FString fString24;
        FString fString25;
        SimpleSymbol simpleSymbol41;
        FString fString26;
        FString fString27;
        SimpleSymbol simpleSymbol42;
        FString fString28;
        FString fString29;
        SimpleSymbol simpleSymbol43;
        SimpleSymbol simpleSymbol44;
        SimpleSymbol simpleSymbol45;
        SimpleSymbol simpleSymbol46;
        SimpleSymbol simpleSymbol47;
        SimpleSymbol simpleSymbol48;
        FString fString30;
        FString fString31;
        SimpleSymbol simpleSymbol49;
        FString fString32;
        FString fString33;
        SimpleSymbol simpleSymbol50;
        SimpleSymbol simpleSymbol51;
        FString fString34;
        FString fString35;
        SimpleSymbol simpleSymbol52;
        FString fString36;
        FString fString37;
        SimpleSymbol simpleSymbol53;
        SimpleSymbol simpleSymbol54;
        FString fString38;
        FString fString39;
        SimpleSymbol simpleSymbol55;
        SimpleSymbol simpleSymbol56;
        FString fString40;
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
        SimpleSymbol simpleSymbol70;
        SimpleSymbol simpleSymbol71;
        SimpleSymbol simpleSymbol72;
        SimpleSymbol simpleSymbol73;
        new SimpleSymbol("lookup-handler");
        Lit160 = (SimpleSymbol) simpleSymbol.readResolve();
        new SimpleSymbol("dispatchGenericEvent");
        Lit159 = (SimpleSymbol) simpleSymbol2.readResolve();
        new SimpleSymbol("dispatchEvent");
        Lit158 = (SimpleSymbol) simpleSymbol3.readResolve();
        new SimpleSymbol("send-error");
        Lit157 = (SimpleSymbol) simpleSymbol4.readResolve();
        new SimpleSymbol("add-to-form-do-after-creation");
        Lit156 = (SimpleSymbol) simpleSymbol5.readResolve();
        new SimpleSymbol("add-to-global-vars");
        Lit155 = (SimpleSymbol) simpleSymbol6.readResolve();
        new SimpleSymbol("add-to-components");
        Lit154 = (SimpleSymbol) simpleSymbol7.readResolve();
        new SimpleSymbol("add-to-events");
        Lit153 = (SimpleSymbol) simpleSymbol8.readResolve();
        new SimpleSymbol("add-to-global-var-environment");
        Lit152 = (SimpleSymbol) simpleSymbol9.readResolve();
        new SimpleSymbol("is-bound-in-form-environment");
        Lit151 = (SimpleSymbol) simpleSymbol10.readResolve();
        new SimpleSymbol("lookup-in-form-environment");
        Lit150 = (SimpleSymbol) simpleSymbol11.readResolve();
        new SimpleSymbol("add-to-form-environment");
        Lit149 = (SimpleSymbol) simpleSymbol12.readResolve();
        new SimpleSymbol("android-log-form");
        Lit148 = (SimpleSymbol) simpleSymbol13.readResolve();
        new SimpleSymbol("get-simple-name");
        Lit147 = (SimpleSymbol) simpleSymbol14.readResolve();
        new SimpleSymbol("Back_Home$Click");
        Lit146 = (SimpleSymbol) simpleSymbol15.readResolve();
        new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT);
        SimpleSymbol simpleSymbol74 = (SimpleSymbol) simpleSymbol16.readResolve();
        Lit7 = simpleSymbol74;
        Lit145 = PairWithPosition.make(simpleSymbol74, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/Screen6.yail", 1405009);
        new FString("com.google.appinventor.components.runtime.Button");
        Lit144 = fString;
        int[] iArr = new int[2];
        iArr[0] = -92160;
        Lit143 = IntNum.make(iArr);
        new SimpleSymbol("Back_Home");
        Lit142 = (SimpleSymbol) simpleSymbol17.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit141 = fString2;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit140 = fString3;
        new SimpleSymbol("Vertical_Arrangement4");
        Lit139 = (SimpleSymbol) simpleSymbol18.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit138 = fString4;
        new SimpleSymbol("Color_Chart$Click");
        Lit137 = (SimpleSymbol) simpleSymbol19.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit135 = fString5;
        int[] iArr2 = new int[2];
        iArr2[0] = -10395295;
        Lit134 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -722477;
        Lit133 = IntNum.make(iArr3);
        new SimpleSymbol("Color_Chart");
        Lit132 = (SimpleSymbol) simpleSymbol20.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit131 = fString6;
        new SimpleSymbol("PCOD$Click");
        Lit130 = (SimpleSymbol) simpleSymbol21.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit128 = fString7;
        int[] iArr4 = new int[2];
        iArr4[0] = -10395295;
        Lit127 = IntNum.make(iArr4);
        int[] iArr5 = new int[2];
        iArr5[0] = -722477;
        Lit126 = IntNum.make(iArr5);
        new SimpleSymbol("PCOD");
        Lit125 = (SimpleSymbol) simpleSymbol22.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit124 = fString8;
        new SimpleSymbol("Premenstrual$Click");
        Lit123 = (SimpleSymbol) simpleSymbol23.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit121 = fString9;
        int[] iArr6 = new int[2];
        iArr6[0] = -10395295;
        Lit120 = IntNum.make(iArr6);
        int[] iArr7 = new int[2];
        iArr7[0] = -722477;
        Lit119 = IntNum.make(iArr7);
        new SimpleSymbol("Premenstrual");
        Lit118 = (SimpleSymbol) simpleSymbol24.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit117 = fString10;
        new SimpleSymbol("Oligomenorrhea$Click");
        Lit116 = (SimpleSymbol) simpleSymbol25.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit114 = fString11;
        int[] iArr8 = new int[2];
        iArr8[0] = -10395295;
        Lit113 = IntNum.make(iArr8);
        int[] iArr9 = new int[2];
        iArr9[0] = -722477;
        Lit112 = IntNum.make(iArr9);
        new SimpleSymbol("Oligomenorrhea");
        Lit111 = (SimpleSymbol) simpleSymbol26.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit110 = fString12;
        new SimpleSymbol("Amenorrhea$Click");
        Lit109 = (SimpleSymbol) simpleSymbol27.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit107 = fString13;
        int[] iArr10 = new int[2];
        iArr10[0] = -10395295;
        Lit106 = IntNum.make(iArr10);
        int[] iArr11 = new int[2];
        iArr11[0] = -722477;
        Lit105 = IntNum.make(iArr11);
        new SimpleSymbol("Amenorrhea");
        Lit104 = (SimpleSymbol) simpleSymbol28.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit103 = fString14;
        new SimpleSymbol("Dysfunctional$Click");
        Lit102 = (SimpleSymbol) simpleSymbol29.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit100 = fString15;
        int[] iArr12 = new int[2];
        iArr12[0] = -10395295;
        Lit99 = IntNum.make(iArr12);
        int[] iArr13 = new int[2];
        iArr13[0] = -722477;
        Lit98 = IntNum.make(iArr13);
        new SimpleSymbol("Dysfunctional");
        Lit97 = (SimpleSymbol) simpleSymbol30.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit96 = fString16;
        new SimpleSymbol("Menometrorrhagia_copy$Click");
        Lit95 = (SimpleSymbol) simpleSymbol31.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit93 = fString17;
        int[] iArr14 = new int[2];
        iArr14[0] = -10395295;
        Lit92 = IntNum.make(iArr14);
        int[] iArr15 = new int[2];
        iArr15[0] = -722477;
        Lit91 = IntNum.make(iArr15);
        new SimpleSymbol("Menometrorrhagia_copy");
        Lit90 = (SimpleSymbol) simpleSymbol32.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit89 = fString18;
        new SimpleSymbol("Menometrorrhagia$Click");
        Lit88 = (SimpleSymbol) simpleSymbol33.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit86 = fString19;
        int[] iArr16 = new int[2];
        iArr16[0] = -10395295;
        Lit85 = IntNum.make(iArr16);
        int[] iArr17 = new int[2];
        iArr17[0] = -722477;
        Lit84 = IntNum.make(iArr17);
        new SimpleSymbol("Menometrorrhagia");
        Lit83 = (SimpleSymbol) simpleSymbol34.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit82 = fString20;
        new SimpleSymbol("Menorrhagia$Click");
        Lit81 = (SimpleSymbol) simpleSymbol35.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit79 = fString21;
        int[] iArr18 = new int[2];
        iArr18[0] = -10395295;
        Lit78 = IntNum.make(iArr18);
        int[] iArr19 = new int[2];
        iArr19[0] = -722477;
        Lit77 = IntNum.make(iArr19);
        new SimpleSymbol("Menorrhagia");
        Lit76 = (SimpleSymbol) simpleSymbol36.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit75 = fString22;
        new SimpleSymbol("Click");
        Lit74 = (SimpleSymbol) simpleSymbol37.readResolve();
        new SimpleSymbol("Dysmenorrhea$Click");
        Lit73 = (SimpleSymbol) simpleSymbol38.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit71 = fString23;
        int[] iArr20 = new int[2];
        iArr20[0] = -10395295;
        Lit70 = IntNum.make(iArr20);
        new SimpleSymbol("FontBold");
        Lit67 = (SimpleSymbol) simpleSymbol39.readResolve();
        int[] iArr21 = new int[2];
        iArr21[0] = -722477;
        Lit66 = IntNum.make(iArr21);
        new SimpleSymbol("Dysmenorrhea");
        Lit65 = (SimpleSymbol) simpleSymbol40.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit64 = fString24;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit63 = fString25;
        new SimpleSymbol("Vertical_Arrangement3");
        Lit61 = (SimpleSymbol) simpleSymbol41.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit60 = fString26;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit59 = fString27;
        new SimpleSymbol("Vertical_Arrangement2");
        Lit58 = (SimpleSymbol) simpleSymbol42.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit57 = fString28;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit56 = fString29;
        int[] iArr22 = new int[2];
        iArr22[0] = -17564930;
        Lit55 = IntNum.make(iArr22);
        new SimpleSymbol("TextColor");
        Lit54 = (SimpleSymbol) simpleSymbol43.readResolve();
        new SimpleSymbol("TextAlignment");
        Lit52 = (SimpleSymbol) simpleSymbol44.readResolve();
        new SimpleSymbol("Text");
        Lit51 = (SimpleSymbol) simpleSymbol45.readResolve();
        new SimpleSymbol("FontTypeface");
        Lit49 = (SimpleSymbol) simpleSymbol46.readResolve();
        new SimpleSymbol("FontSize");
        Lit47 = (SimpleSymbol) simpleSymbol47.readResolve();
        new SimpleSymbol("Label1");
        Lit46 = (SimpleSymbol) simpleSymbol48.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit45 = fString30;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit44 = fString31;
        new SimpleSymbol("Horizontal_Arrangement3");
        Lit43 = (SimpleSymbol) simpleSymbol49.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit42 = fString32;
        new FString("com.google.appinventor.components.runtime.Image");
        Lit41 = fString33;
        new SimpleSymbol("Picture");
        Lit40 = (SimpleSymbol) simpleSymbol50.readResolve();
        new SimpleSymbol("Image1");
        Lit39 = (SimpleSymbol) simpleSymbol51.readResolve();
        new FString("com.google.appinventor.components.runtime.Image");
        Lit38 = fString34;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit37 = fString35;
        new SimpleSymbol("Horizontal_Arrangement2");
        Lit35 = (SimpleSymbol) simpleSymbol52.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit34 = fString36;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit33 = fString37;
        new SimpleSymbol("Height");
        Lit32 = (SimpleSymbol) simpleSymbol53.readResolve();
        int[] iArr23 = new int[2];
        iArr23[0] = -13463672;
        Lit31 = IntNum.make(iArr23);
        new SimpleSymbol("Horizontal_Arrangement1");
        Lit30 = (SimpleSymbol) simpleSymbol54.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit29 = fString38;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit28 = fString39;
        new SimpleSymbol("Width");
        Lit26 = (SimpleSymbol) simpleSymbol55.readResolve();
        int[] iArr24 = new int[2];
        iArr24[0] = -23886135;
        Lit25 = IntNum.make(iArr24);
        new SimpleSymbol("Vertical_Arrangement1");
        Lit24 = (SimpleSymbol) simpleSymbol56.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit23 = fString40;
        new SimpleSymbol("TitleVisible");
        Lit22 = (SimpleSymbol) simpleSymbol57.readResolve();
        new SimpleSymbol("Title");
        Lit21 = (SimpleSymbol) simpleSymbol58.readResolve();
        new SimpleSymbol("ShowStatusBar");
        Lit20 = (SimpleSymbol) simpleSymbol59.readResolve();
        new SimpleSymbol("boolean");
        Lit19 = (SimpleSymbol) simpleSymbol60.readResolve();
        new SimpleSymbol("ShowOptionsMenu");
        Lit18 = (SimpleSymbol) simpleSymbol61.readResolve();
        new SimpleSymbol("ReceiveSharedText");
        Lit17 = (SimpleSymbol) simpleSymbol62.readResolve();
        int[] iArr25 = new int[2];
        iArr25[0] = -32615864;
        Lit16 = IntNum.make(iArr25);
        new SimpleSymbol("PrimaryColorDark");
        Lit15 = (SimpleSymbol) simpleSymbol63.readResolve();
        int[] iArr26 = new int[2];
        iArr26[0] = -26950686;
        Lit14 = IntNum.make(iArr26);
        new SimpleSymbol("PrimaryColor");
        Lit13 = (SimpleSymbol) simpleSymbol64.readResolve();
        new SimpleSymbol("MinSdk");
        Lit11 = (SimpleSymbol) simpleSymbol65.readResolve();
        int[] iArr27 = new int[2];
        iArr27[0] = -1770809;
        Lit10 = IntNum.make(iArr27);
        new SimpleSymbol("BackgroundColor");
        Lit9 = (SimpleSymbol) simpleSymbol66.readResolve();
        new SimpleSymbol("AppName");
        Lit8 = (SimpleSymbol) simpleSymbol67.readResolve();
        new SimpleSymbol("AppId");
        Lit6 = (SimpleSymbol) simpleSymbol68.readResolve();
        new SimpleSymbol("number");
        Lit5 = (SimpleSymbol) simpleSymbol69.readResolve();
        int[] iArr28 = new int[2];
        iArr28[0] = -92160;
        Lit4 = IntNum.make(iArr28);
        new SimpleSymbol("AccentColor");
        Lit3 = (SimpleSymbol) simpleSymbol70.readResolve();
        new SimpleSymbol("*the-null-value*");
        Lit2 = (SimpleSymbol) simpleSymbol71.readResolve();
        new SimpleSymbol("getMessage");
        Lit1 = (SimpleSymbol) simpleSymbol72.readResolve();
        new SimpleSymbol("Screen6");
        Lit0 = (SimpleSymbol) simpleSymbol73.readResolve();
    }

    public Screen6() {
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
        ModuleMethod moduleMethod68;
        ModuleMethod moduleMethod69;
        ModuleInfo.register(this);
        ModuleMethod moduleMethod70 = moduleMethod;
        new frame();
        frame frame3 = frame2;
        frame3.$main = this;
        frame frame4 = frame3;
        new ModuleMethod(frame4, 1, Lit147, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.get$Mnsimple$Mnname = moduleMethod70;
        new ModuleMethod(frame4, 2, Lit148, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = moduleMethod2;
        new ModuleMethod(frame4, 3, Lit149, 8194);
        this.add$Mnto$Mnform$Mnenvironment = moduleMethod3;
        new ModuleMethod(frame4, 4, Lit150, 8193);
        this.lookup$Mnin$Mnform$Mnenvironment = moduleMethod4;
        new ModuleMethod(frame4, 6, Lit151, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = moduleMethod5;
        new ModuleMethod(frame4, 7, Lit152, 8194);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = moduleMethod6;
        new ModuleMethod(frame4, 8, Lit153, 8194);
        this.add$Mnto$Mnevents = moduleMethod7;
        new ModuleMethod(frame4, 9, Lit154, 16388);
        this.add$Mnto$Mncomponents = moduleMethod8;
        new ModuleMethod(frame4, 10, Lit155, 8194);
        this.add$Mnto$Mnglobal$Mnvars = moduleMethod9;
        new ModuleMethod(frame4, 11, Lit156, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = moduleMethod10;
        new ModuleMethod(frame4, 12, Lit157, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = moduleMethod11;
        new ModuleMethod(frame4, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = moduleMethod12;
        new ModuleMethod(frame4, 14, Lit158, 16388);
        this.dispatchEvent = moduleMethod13;
        new ModuleMethod(frame4, 15, Lit159, 16388);
        this.dispatchGenericEvent = moduleMethod14;
        new ModuleMethod(frame4, 16, Lit160, 8194);
        this.lookup$Mnhandler = moduleMethod15;
        new ModuleMethod(frame4, 17, (Object) null, 0);
        ModuleMethod moduleMethod71 = moduleMethod16;
        moduleMethod71.setProperty("source-location", "/tmp/runtime2211785962717768109.scm:620");
        lambda$Fn1 = moduleMethod71;
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
        new ModuleMethod(frame4, 38, Lit73, 0);
        this.Dysmenorrhea$Click = moduleMethod37;
        new ModuleMethod(frame4, 39, (Object) null, 0);
        lambda$Fn21 = moduleMethod38;
        new ModuleMethod(frame4, 40, (Object) null, 0);
        lambda$Fn22 = moduleMethod39;
        new ModuleMethod(frame4, 41, Lit81, 0);
        this.Menorrhagia$Click = moduleMethod40;
        new ModuleMethod(frame4, 42, (Object) null, 0);
        lambda$Fn23 = moduleMethod41;
        new ModuleMethod(frame4, 43, (Object) null, 0);
        lambda$Fn24 = moduleMethod42;
        new ModuleMethod(frame4, 44, Lit88, 0);
        this.Menometrorrhagia$Click = moduleMethod43;
        new ModuleMethod(frame4, 45, (Object) null, 0);
        lambda$Fn25 = moduleMethod44;
        new ModuleMethod(frame4, 46, (Object) null, 0);
        lambda$Fn26 = moduleMethod45;
        new ModuleMethod(frame4, 47, Lit95, 0);
        this.Menometrorrhagia_copy$Click = moduleMethod46;
        new ModuleMethod(frame4, 48, (Object) null, 0);
        lambda$Fn27 = moduleMethod47;
        new ModuleMethod(frame4, 49, (Object) null, 0);
        lambda$Fn28 = moduleMethod48;
        new ModuleMethod(frame4, 50, Lit102, 0);
        this.Dysfunctional$Click = moduleMethod49;
        new ModuleMethod(frame4, 51, (Object) null, 0);
        lambda$Fn29 = moduleMethod50;
        new ModuleMethod(frame4, 52, (Object) null, 0);
        lambda$Fn30 = moduleMethod51;
        new ModuleMethod(frame4, 53, Lit109, 0);
        this.Amenorrhea$Click = moduleMethod52;
        new ModuleMethod(frame4, 54, (Object) null, 0);
        lambda$Fn31 = moduleMethod53;
        new ModuleMethod(frame4, 55, (Object) null, 0);
        lambda$Fn32 = moduleMethod54;
        new ModuleMethod(frame4, 56, Lit116, 0);
        this.Oligomenorrhea$Click = moduleMethod55;
        new ModuleMethod(frame4, 57, (Object) null, 0);
        lambda$Fn33 = moduleMethod56;
        new ModuleMethod(frame4, 58, (Object) null, 0);
        lambda$Fn34 = moduleMethod57;
        new ModuleMethod(frame4, 59, Lit123, 0);
        this.Premenstrual$Click = moduleMethod58;
        new ModuleMethod(frame4, 60, (Object) null, 0);
        lambda$Fn35 = moduleMethod59;
        new ModuleMethod(frame4, 61, (Object) null, 0);
        lambda$Fn36 = moduleMethod60;
        new ModuleMethod(frame4, 62, Lit130, 0);
        this.PCOD$Click = moduleMethod61;
        new ModuleMethod(frame4, 63, (Object) null, 0);
        lambda$Fn37 = moduleMethod62;
        new ModuleMethod(frame4, 64, (Object) null, 0);
        lambda$Fn38 = moduleMethod63;
        new ModuleMethod(frame4, 65, Lit137, 0);
        this.Color_Chart$Click = moduleMethod64;
        new ModuleMethod(frame4, 66, (Object) null, 0);
        lambda$Fn39 = moduleMethod65;
        new ModuleMethod(frame4, 67, (Object) null, 0);
        lambda$Fn40 = moduleMethod66;
        new ModuleMethod(frame4, 68, (Object) null, 0);
        lambda$Fn41 = moduleMethod67;
        new ModuleMethod(frame4, 69, (Object) null, 0);
        lambda$Fn42 = moduleMethod68;
        new ModuleMethod(frame4, 70, Lit146, 0);
        this.Back_Home$Click = moduleMethod69;
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
        Screen6 = null;
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
            Object andCoerceProperty$Ex9 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit18, Boolean.FALSE, Lit19);
            Object andCoerceProperty$Ex10 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit20, Boolean.FALSE, Lit19);
            Object andCoerceProperty$Ex11 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "Screen6", Lit7);
            Values.writeValues(C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit22, Boolean.FALSE, Lit19), $result);
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
        this.Horizontal_Arrangement1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit24, Lit29, Lit30, lambda$Fn5), $result);
        } else {
            addToComponents(Lit24, Lit33, Lit30, lambda$Fn6);
        }
        this.Horizontal_Arrangement2 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit30, Lit34, Lit35, lambda$Fn7), $result);
        } else {
            addToComponents(Lit30, Lit37, Lit35, lambda$Fn8);
        }
        this.Image1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit35, Lit38, Lit39, lambda$Fn9), $result);
        } else {
            addToComponents(Lit35, Lit41, Lit39, lambda$Fn10);
        }
        this.Horizontal_Arrangement3 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit30, Lit42, Lit43, lambda$Fn11), $result);
        } else {
            addToComponents(Lit30, Lit44, Lit43, lambda$Fn12);
        }
        this.Label1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit43, Lit45, Lit46, lambda$Fn13), $result);
        } else {
            addToComponents(Lit43, Lit56, Lit46, lambda$Fn14);
        }
        this.Vertical_Arrangement2 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit57, Lit58, lambda$Fn15), $result);
        } else {
            addToComponents(Lit0, Lit59, Lit58, lambda$Fn16);
        }
        this.Vertical_Arrangement3 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit58, Lit60, Lit61, lambda$Fn17), $result);
        } else {
            addToComponents(Lit58, Lit63, Lit61, lambda$Fn18);
        }
        this.Dysmenorrhea = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit58, Lit64, Lit65, lambda$Fn19), $result);
        } else {
            addToComponents(Lit58, Lit71, Lit65, lambda$Fn20);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment = C1168runtime.addToCurrentFormEnvironment(Lit73, this.Dysmenorrhea$Click);
        } else {
            addToFormEnvironment(Lit73, this.Dysmenorrhea$Click);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "Dysmenorrhea", "Click");
        } else {
            addToEvents(Lit65, Lit74);
        }
        this.Menorrhagia = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit58, Lit75, Lit76, lambda$Fn21), $result);
        } else {
            addToComponents(Lit58, Lit79, Lit76, lambda$Fn22);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment2 = C1168runtime.addToCurrentFormEnvironment(Lit81, this.Menorrhagia$Click);
        } else {
            addToFormEnvironment(Lit81, this.Menorrhagia$Click);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "Menorrhagia", "Click");
        } else {
            addToEvents(Lit76, Lit74);
        }
        this.Menometrorrhagia = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit58, Lit82, Lit83, lambda$Fn23), $result);
        } else {
            addToComponents(Lit58, Lit86, Lit83, lambda$Fn24);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment3 = C1168runtime.addToCurrentFormEnvironment(Lit88, this.Menometrorrhagia$Click);
        } else {
            addToFormEnvironment(Lit88, this.Menometrorrhagia$Click);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "Menometrorrhagia", "Click");
        } else {
            addToEvents(Lit83, Lit74);
        }
        this.Menometrorrhagia_copy = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit58, Lit89, Lit90, lambda$Fn25), $result);
        } else {
            addToComponents(Lit58, Lit93, Lit90, lambda$Fn26);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment4 = C1168runtime.addToCurrentFormEnvironment(Lit95, this.Menometrorrhagia_copy$Click);
        } else {
            addToFormEnvironment(Lit95, this.Menometrorrhagia_copy$Click);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "Menometrorrhagia_copy", "Click");
        } else {
            addToEvents(Lit90, Lit74);
        }
        this.Dysfunctional = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit58, Lit96, Lit97, lambda$Fn27), $result);
        } else {
            addToComponents(Lit58, Lit100, Lit97, lambda$Fn28);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment5 = C1168runtime.addToCurrentFormEnvironment(Lit102, this.Dysfunctional$Click);
        } else {
            addToFormEnvironment(Lit102, this.Dysfunctional$Click);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "Dysfunctional", "Click");
        } else {
            addToEvents(Lit97, Lit74);
        }
        this.Amenorrhea = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit58, Lit103, Lit104, lambda$Fn29), $result);
        } else {
            addToComponents(Lit58, Lit107, Lit104, lambda$Fn30);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment6 = C1168runtime.addToCurrentFormEnvironment(Lit109, this.Amenorrhea$Click);
        } else {
            addToFormEnvironment(Lit109, this.Amenorrhea$Click);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "Amenorrhea", "Click");
        } else {
            addToEvents(Lit104, Lit74);
        }
        this.Oligomenorrhea = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit58, Lit110, Lit111, lambda$Fn31), $result);
        } else {
            addToComponents(Lit58, Lit114, Lit111, lambda$Fn32);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment7 = C1168runtime.addToCurrentFormEnvironment(Lit116, this.Oligomenorrhea$Click);
        } else {
            addToFormEnvironment(Lit116, this.Oligomenorrhea$Click);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "Oligomenorrhea", "Click");
        } else {
            addToEvents(Lit111, Lit74);
        }
        this.Premenstrual = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit58, Lit117, Lit118, lambda$Fn33), $result);
        } else {
            addToComponents(Lit58, Lit121, Lit118, lambda$Fn34);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment8 = C1168runtime.addToCurrentFormEnvironment(Lit123, this.Premenstrual$Click);
        } else {
            addToFormEnvironment(Lit123, this.Premenstrual$Click);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "Premenstrual", "Click");
        } else {
            addToEvents(Lit118, Lit74);
        }
        this.PCOD = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit58, Lit124, Lit125, lambda$Fn35), $result);
        } else {
            addToComponents(Lit58, Lit128, Lit125, lambda$Fn36);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment9 = C1168runtime.addToCurrentFormEnvironment(Lit130, this.PCOD$Click);
        } else {
            addToFormEnvironment(Lit130, this.PCOD$Click);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "PCOD", "Click");
        } else {
            addToEvents(Lit125, Lit74);
        }
        this.Color_Chart = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit58, Lit131, Lit132, lambda$Fn37), $result);
        } else {
            addToComponents(Lit58, Lit135, Lit132, lambda$Fn38);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment10 = C1168runtime.addToCurrentFormEnvironment(Lit137, this.Color_Chart$Click);
        } else {
            addToFormEnvironment(Lit137, this.Color_Chart$Click);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "Color_Chart", "Click");
        } else {
            addToEvents(Lit132, Lit74);
        }
        this.Vertical_Arrangement4 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit58, Lit138, Lit139, lambda$Fn39), $result);
        } else {
            addToComponents(Lit58, Lit140, Lit139, lambda$Fn40);
        }
        this.Back_Home = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit58, Lit141, Lit142, lambda$Fn41), $result);
        } else {
            addToComponents(Lit58, Lit144, Lit142, lambda$Fn42);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment11 = C1168runtime.addToCurrentFormEnvironment(Lit146, this.Back_Home$Click);
        } else {
            addToFormEnvironment(Lit146, this.Back_Home$Click);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "Back_Home", "Click");
        } else {
            addToEvents(Lit142, Lit74);
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
        Object andCoerceProperty$Ex9 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit18, Boolean.FALSE, Lit19);
        Object andCoerceProperty$Ex10 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit20, Boolean.FALSE, Lit19);
        Object andCoerceProperty$Ex11 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit21, "Screen6", Lit7);
        return C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit22, Boolean.FALSE, Lit19);
    }

    static Object lambda4() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit24, Lit9, Lit25, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit24, Lit26, Lit27, Lit5);
    }

    static Object lambda5() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit24, Lit9, Lit25, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit24, Lit26, Lit27, Lit5);
    }

    static Object lambda6() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit30, Lit9, Lit31, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit30, Lit32, Lit27, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit30, Lit26, Lit27, Lit5);
    }

    static Object lambda7() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit30, Lit9, Lit31, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit30, Lit32, Lit27, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit30, Lit26, Lit27, Lit5);
    }

    static Object lambda8() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit35, Lit32, Lit36, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit35, Lit26, Lit36, Lit5);
    }

    static Object lambda9() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit35, Lit32, Lit36, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit35, Lit26, Lit36, Lit5);
    }

    static Object lambda10() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit39, Lit40, "Classifier.png", Lit7);
    }

    static Object lambda11() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit39, Lit40, "Classifier.png", Lit7);
    }

    static Object lambda12() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit43, Lit26, Lit27, Lit5);
    }

    static Object lambda13() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit43, Lit26, Lit27, Lit5);
    }

    static Object lambda14() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit46, Lit47, Lit48, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit46, Lit49, Lit50, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit46, Lit32, Lit27, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit46, Lit51, "Classifier", Lit7);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit46, Lit52, Lit53, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit46, Lit54, Lit55, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit46, Lit26, Lit27, Lit5);
    }

    static Object lambda15() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit46, Lit47, Lit48, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit46, Lit49, Lit50, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit46, Lit32, Lit27, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit46, Lit51, "Classifier", Lit7);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit46, Lit52, Lit53, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit46, Lit54, Lit55, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit46, Lit26, Lit27, Lit5);
    }

    static Object lambda16() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit58, Lit32, Lit27, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit58, Lit26, Lit27, Lit5);
    }

    static Object lambda17() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit58, Lit32, Lit27, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit58, Lit26, Lit27, Lit5);
    }

    static Object lambda18() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit61, Lit32, Lit62, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit61, Lit26, Lit27, Lit5);
    }

    static Object lambda19() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit61, Lit32, Lit62, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit61, Lit26, Lit27, Lit5);
    }

    static Object lambda20() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit65, Lit9, Lit66, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit65, Lit67, Boolean.TRUE, Lit19);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit65, Lit47, Lit68, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit65, Lit51, "Dysmenorrhea", Lit7);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit65, Lit52, Lit69, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit65, Lit54, Lit70, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit65, Lit26, Lit27, Lit5);
    }

    static Object lambda21() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit65, Lit9, Lit66, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit65, Lit67, Boolean.TRUE, Lit19);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit65, Lit47, Lit68, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit65, Lit51, "Dysmenorrhea", Lit7);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit65, Lit52, Lit69, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit65, Lit54, Lit70, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit65, Lit26, Lit27, Lit5);
    }

    public Object Dysmenorrhea$Click() {
        C1168runtime.setThisForm();
        return C1168runtime.callYailPrimitive(C1168runtime.open$Mnanother$Mnscreen, LList.list1("Screen7"), Lit72, "open another screen");
    }

    static Object lambda22() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit76, Lit9, Lit77, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit76, Lit67, Boolean.TRUE, Lit19);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit76, Lit47, Lit68, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit76, Lit51, "Menorrhagia", Lit7);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit76, Lit52, Lit69, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit76, Lit54, Lit78, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit76, Lit26, Lit27, Lit5);
    }

    static Object lambda23() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit76, Lit9, Lit77, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit76, Lit67, Boolean.TRUE, Lit19);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit76, Lit47, Lit68, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit76, Lit51, "Menorrhagia", Lit7);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit76, Lit52, Lit69, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit76, Lit54, Lit78, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit76, Lit26, Lit27, Lit5);
    }

    public Object Menorrhagia$Click() {
        C1168runtime.setThisForm();
        return C1168runtime.callYailPrimitive(C1168runtime.open$Mnanother$Mnscreen, LList.list1("Screen8"), Lit80, "open another screen");
    }

    static Object lambda24() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit83, Lit9, Lit84, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit83, Lit67, Boolean.TRUE, Lit19);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit83, Lit47, Lit68, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit83, Lit51, "Metrorrhagia", Lit7);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit83, Lit52, Lit69, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit83, Lit54, Lit85, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit83, Lit26, Lit27, Lit5);
    }

    static Object lambda25() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit83, Lit9, Lit84, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit83, Lit67, Boolean.TRUE, Lit19);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit83, Lit47, Lit68, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit83, Lit51, "Metrorrhagia", Lit7);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit83, Lit52, Lit69, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit83, Lit54, Lit85, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit83, Lit26, Lit27, Lit5);
    }

    public Object Menometrorrhagia$Click() {
        C1168runtime.setThisForm();
        return C1168runtime.callYailPrimitive(C1168runtime.open$Mnanother$Mnscreen, LList.list1("Screen10"), Lit87, "open another screen");
    }

    static Object lambda26() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit90, Lit9, Lit91, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit90, Lit67, Boolean.TRUE, Lit19);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit90, Lit47, Lit68, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit90, Lit51, "Menometrorrhagia", Lit7);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit90, Lit52, Lit69, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit90, Lit54, Lit92, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit90, Lit26, Lit27, Lit5);
    }

    static Object lambda27() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit90, Lit9, Lit91, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit90, Lit67, Boolean.TRUE, Lit19);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit90, Lit47, Lit68, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit90, Lit51, "Menometrorrhagia", Lit7);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit90, Lit52, Lit69, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit90, Lit54, Lit92, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit90, Lit26, Lit27, Lit5);
    }

    public Object Menometrorrhagia_copy$Click() {
        C1168runtime.setThisForm();
        return C1168runtime.callYailPrimitive(C1168runtime.open$Mnanother$Mnscreen, LList.list1("Screen9"), Lit94, "open another screen");
    }

    static Object lambda28() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit97, Lit9, Lit98, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit97, Lit67, Boolean.TRUE, Lit19);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit97, Lit47, Lit68, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit97, Lit51, "Dysfunctional uterine bleeding", Lit7);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit97, Lit52, Lit69, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit97, Lit54, Lit99, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit97, Lit26, Lit27, Lit5);
    }

    static Object lambda29() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit97, Lit9, Lit98, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit97, Lit67, Boolean.TRUE, Lit19);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit97, Lit47, Lit68, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit97, Lit51, "Dysfunctional uterine bleeding", Lit7);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit97, Lit52, Lit69, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit97, Lit54, Lit99, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit97, Lit26, Lit27, Lit5);
    }

    public Object Dysfunctional$Click() {
        C1168runtime.setThisForm();
        return C1168runtime.callYailPrimitive(C1168runtime.open$Mnanother$Mnscreen, LList.list1("Screen11"), Lit101, "open another screen");
    }

    static Object lambda30() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit104, Lit9, Lit105, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit104, Lit67, Boolean.TRUE, Lit19);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit104, Lit47, Lit68, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit104, Lit49, Lit53, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit104, Lit51, "Amenorrhea", Lit7);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit104, Lit52, Lit69, Lit5);
        Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit104, Lit54, Lit106, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit104, Lit26, Lit27, Lit5);
    }

    static Object lambda31() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit104, Lit9, Lit105, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit104, Lit67, Boolean.TRUE, Lit19);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit104, Lit47, Lit68, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit104, Lit49, Lit53, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit104, Lit51, "Amenorrhea", Lit7);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit104, Lit52, Lit69, Lit5);
        Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit104, Lit54, Lit106, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit104, Lit26, Lit27, Lit5);
    }

    public Object Amenorrhea$Click() {
        C1168runtime.setThisForm();
        return C1168runtime.callYailPrimitive(C1168runtime.open$Mnanother$Mnscreen, LList.list1("Screen12"), Lit108, "open another screen");
    }

    static Object lambda32() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit111, Lit9, Lit112, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit111, Lit67, Boolean.TRUE, Lit19);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit111, Lit47, Lit68, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit111, Lit49, Lit53, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit111, Lit51, "Oligomenorrhea", Lit7);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit111, Lit52, Lit69, Lit5);
        Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit111, Lit54, Lit113, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit111, Lit26, Lit27, Lit5);
    }

    static Object lambda33() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit111, Lit9, Lit112, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit111, Lit67, Boolean.TRUE, Lit19);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit111, Lit47, Lit68, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit111, Lit49, Lit53, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit111, Lit51, "Oligomenorrhea", Lit7);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit111, Lit52, Lit69, Lit5);
        Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit111, Lit54, Lit113, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit111, Lit26, Lit27, Lit5);
    }

    public Object Oligomenorrhea$Click() {
        C1168runtime.setThisForm();
        return C1168runtime.callYailPrimitive(C1168runtime.open$Mnanother$Mnscreen, LList.list1("Screen13"), Lit115, "open another screen");
    }

    static Object lambda34() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit118, Lit9, Lit119, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit118, Lit67, Boolean.TRUE, Lit19);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit118, Lit47, Lit68, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit118, Lit51, "Premenstrual Syndrome (PMS) ", Lit7);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit118, Lit52, Lit69, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit118, Lit54, Lit120, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit118, Lit26, Lit27, Lit5);
    }

    static Object lambda35() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit118, Lit9, Lit119, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit118, Lit67, Boolean.TRUE, Lit19);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit118, Lit47, Lit68, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit118, Lit51, "Premenstrual Syndrome (PMS) ", Lit7);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit118, Lit52, Lit69, Lit5);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit118, Lit54, Lit120, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit118, Lit26, Lit27, Lit5);
    }

    public Object Premenstrual$Click() {
        C1168runtime.setThisForm();
        return C1168runtime.callYailPrimitive(C1168runtime.open$Mnanother$Mnscreen, LList.list1("Screen14"), Lit122, "open another screen");
    }

    static Object lambda36() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit125, Lit9, Lit126, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit125, Lit67, Boolean.TRUE, Lit19);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit125, Lit47, Lit68, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit125, Lit49, Lit53, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit125, Lit51, "PCOD (Polycystic Ovarian Disease) ", Lit7);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit125, Lit52, Lit69, Lit5);
        Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit125, Lit54, Lit127, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit125, Lit26, Lit27, Lit5);
    }

    static Object lambda37() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit125, Lit9, Lit126, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit125, Lit67, Boolean.TRUE, Lit19);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit125, Lit47, Lit68, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit125, Lit49, Lit53, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit125, Lit51, "PCOD (Polycystic Ovarian Disease) ", Lit7);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit125, Lit52, Lit69, Lit5);
        Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit125, Lit54, Lit127, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit125, Lit26, Lit27, Lit5);
    }

    public Object PCOD$Click() {
        C1168runtime.setThisForm();
        return C1168runtime.callYailPrimitive(C1168runtime.open$Mnanother$Mnscreen, LList.list1("Screen15"), Lit129, "open another screen");
    }

    static Object lambda38() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit132, Lit9, Lit133, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit132, Lit67, Boolean.TRUE, Lit19);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit132, Lit47, Lit68, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit132, Lit49, Lit53, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit132, Lit51, "Color Chart", Lit7);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit132, Lit52, Lit69, Lit5);
        Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit132, Lit54, Lit134, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit132, Lit26, Lit27, Lit5);
    }

    static Object lambda39() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit132, Lit9, Lit133, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit132, Lit67, Boolean.TRUE, Lit19);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit132, Lit47, Lit68, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit132, Lit49, Lit53, Lit5);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit132, Lit51, "Color Chart", Lit7);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit132, Lit52, Lit69, Lit5);
        Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit132, Lit54, Lit134, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit132, Lit26, Lit27, Lit5);
    }

    /* renamed from: io.kodular.kajalnikunj1024.Classifier.Screen6$frame */
    /* compiled from: Screen6.yail */
    public class frame extends ModuleBody {
        Screen6 $main;

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
                    if (!(obj7 instanceof Screen6)) {
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
                    if (!(obj9 instanceof Screen6)) {
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
                    if (!(obj17 instanceof Screen6)) {
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
                    return Screen6.lambda2();
                case 18:
                    this.$main.$define();
                    return Values.empty;
                case 19:
                    return Screen6.lambda3();
                case 20:
                    return Screen6.lambda4();
                case 21:
                    return Screen6.lambda5();
                case 22:
                    return Screen6.lambda6();
                case 23:
                    return Screen6.lambda7();
                case 24:
                    return Screen6.lambda8();
                case 25:
                    return Screen6.lambda9();
                case 26:
                    return Screen6.lambda10();
                case 27:
                    return Screen6.lambda11();
                case 28:
                    return Screen6.lambda12();
                case 29:
                    return Screen6.lambda13();
                case 30:
                    return Screen6.lambda14();
                case 31:
                    return Screen6.lambda15();
                case 32:
                    return Screen6.lambda16();
                case 33:
                    return Screen6.lambda17();
                case 34:
                    return Screen6.lambda18();
                case 35:
                    return Screen6.lambda19();
                case 36:
                    return Screen6.lambda20();
                case 37:
                    return Screen6.lambda21();
                case 38:
                    return this.$main.Dysmenorrhea$Click();
                case 39:
                    return Screen6.lambda22();
                case 40:
                    return Screen6.lambda23();
                case 41:
                    return this.$main.Menorrhagia$Click();
                case 42:
                    return Screen6.lambda24();
                case 43:
                    return Screen6.lambda25();
                case 44:
                    return this.$main.Menometrorrhagia$Click();
                case 45:
                    return Screen6.lambda26();
                case 46:
                    return Screen6.lambda27();
                case 47:
                    return this.$main.Menometrorrhagia_copy$Click();
                case 48:
                    return Screen6.lambda28();
                case 49:
                    return Screen6.lambda29();
                case 50:
                    return this.$main.Dysfunctional$Click();
                case 51:
                    return Screen6.lambda30();
                case 52:
                    return Screen6.lambda31();
                case 53:
                    return this.$main.Amenorrhea$Click();
                case 54:
                    return Screen6.lambda32();
                case 55:
                    return Screen6.lambda33();
                case 56:
                    return this.$main.Oligomenorrhea$Click();
                case 57:
                    return Screen6.lambda34();
                case 58:
                    return Screen6.lambda35();
                case 59:
                    return this.$main.Premenstrual$Click();
                case 60:
                    return Screen6.lambda36();
                case 61:
                    return Screen6.lambda37();
                case 62:
                    return this.$main.PCOD$Click();
                case 63:
                    return Screen6.lambda38();
                case 64:
                    return Screen6.lambda39();
                case 65:
                    return this.$main.Color_Chart$Click();
                case 66:
                    return Screen6.lambda40();
                case 67:
                    return Screen6.lambda41();
                case 68:
                    return Screen6.lambda42();
                case 69:
                    return Screen6.lambda43();
                case 70:
                    return this.$main.Back_Home$Click();
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
                case 69:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 70:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod2, callContext2);
            }
        }
    }

    public Object Color_Chart$Click() {
        C1168runtime.setThisForm();
        return C1168runtime.callYailPrimitive(C1168runtime.open$Mnanother$Mnscreen, LList.list1("Screen16"), Lit136, "open another screen");
    }

    static Object lambda40() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit139, Lit26, Lit27, Lit5);
    }

    static Object lambda41() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit139, Lit26, Lit27, Lit5);
    }

    static Object lambda42() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit142, Lit9, Lit143, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit142, Lit49, Lit50, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit142, Lit51, "Back to home", Lit7);
        return C1168runtime.setAndCoerceProperty$Ex(Lit142, Lit52, Lit69, Lit5);
    }

    static Object lambda43() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit142, Lit9, Lit143, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit142, Lit49, Lit50, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit142, Lit51, "Back to home", Lit7);
        return C1168runtime.setAndCoerceProperty$Ex(Lit142, Lit52, Lit69, Lit5);
    }

    public Object Back_Home$Click() {
        C1168runtime.setThisForm();
        return C1168runtime.callYailPrimitive(C1168runtime.open$Mnanother$Mnscreen, LList.list1("saving1_s5"), Lit145, "open another screen");
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
        Screen6 = this;
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
