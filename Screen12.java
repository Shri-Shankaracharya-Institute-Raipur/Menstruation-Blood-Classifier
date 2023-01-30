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

/* renamed from: io.kodular.kajalnikunj1024.Classifier.Screen12 */
/* compiled from: Screen12.yail */
public class Screen12 extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final IntNum Lit10;
    static final SimpleSymbol Lit100;
    static final SimpleSymbol Lit101;
    static final SimpleSymbol Lit102;
    static final SimpleSymbol Lit11;
    static final IntNum Lit12 = IntNum.make(23);
    static final SimpleSymbol Lit13;
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
    static final IntNum Lit45;
    static final SimpleSymbol Lit46;
    static final IntNum Lit47 = IntNum.make(2);
    static final SimpleSymbol Lit48;
    static final IntNum Lit49 = IntNum.make(3);
    static final SimpleSymbol Lit5;
    static final FString Lit50;
    static final FString Lit51;
    static final SimpleSymbol Lit52;
    static final IntNum Lit53;
    static final FString Lit54;
    static final FString Lit55;
    static final SimpleSymbol Lit56;
    static final FString Lit57;
    static final FString Lit58;
    static final SimpleSymbol Lit59;
    static final SimpleSymbol Lit6;
    static final IntNum Lit60;
    static final FString Lit61;
    static final FString Lit62;
    static final SimpleSymbol Lit63;
    static final SimpleSymbol Lit64;
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
    static final FString Lit78;
    static final FString Lit79;
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit80;
    static final IntNum Lit81;
    static final SimpleSymbol Lit82;
    static final IntNum Lit83 = IntNum.make(15);
    static final IntNum Lit84 = IntNum.make(1);
    static final FString Lit85;
    static final PairWithPosition Lit86;
    static final SimpleSymbol Lit87;
    static final SimpleSymbol Lit88;
    static final SimpleSymbol Lit89;
    static final SimpleSymbol Lit9;
    static final SimpleSymbol Lit90;
    static final SimpleSymbol Lit91;
    static final SimpleSymbol Lit92;
    static final SimpleSymbol Lit93;
    static final SimpleSymbol Lit94;
    static final SimpleSymbol Lit95;
    static final SimpleSymbol Lit96;
    static final SimpleSymbol Lit97;
    static final SimpleSymbol Lit98;
    static final SimpleSymbol Lit99;
    public static Screen12 Screen12;
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
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button Button1;
    public Button Button2;
    public Button Button3;
    public Button Button4;
    public final ModuleMethod Button4$Click;
    public Label Label1;
    public Label Label2;
    public Label Label3;
    public Label Label4;
    public VerticalArrangement Vertical_Arrangement1;
    public VerticalArrangement Vertical_Arrangement2;
    public VerticalArrangement Vertical_Arrangement2_copy;
    public VerticalArrangement Vertical_Arrangement2_copy1;
    public VerticalArrangement Vertical_Arrangement2_copy2;
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
        SimpleSymbol simpleSymbol25;
        FString fString12;
        FString fString13;
        SimpleSymbol simpleSymbol26;
        FString fString14;
        FString fString15;
        SimpleSymbol simpleSymbol27;
        FString fString16;
        FString fString17;
        SimpleSymbol simpleSymbol28;
        FString fString18;
        FString fString19;
        SimpleSymbol simpleSymbol29;
        SimpleSymbol simpleSymbol30;
        SimpleSymbol simpleSymbol31;
        FString fString20;
        FString fString21;
        SimpleSymbol simpleSymbol32;
        FString fString22;
        FString fString23;
        SimpleSymbol simpleSymbol33;
        SimpleSymbol simpleSymbol34;
        SimpleSymbol simpleSymbol35;
        SimpleSymbol simpleSymbol36;
        SimpleSymbol simpleSymbol37;
        FString fString24;
        FString fString25;
        SimpleSymbol simpleSymbol38;
        SimpleSymbol simpleSymbol39;
        FString fString26;
        SimpleSymbol simpleSymbol40;
        SimpleSymbol simpleSymbol41;
        SimpleSymbol simpleSymbol42;
        SimpleSymbol simpleSymbol43;
        SimpleSymbol simpleSymbol44;
        SimpleSymbol simpleSymbol45;
        SimpleSymbol simpleSymbol46;
        SimpleSymbol simpleSymbol47;
        SimpleSymbol simpleSymbol48;
        SimpleSymbol simpleSymbol49;
        SimpleSymbol simpleSymbol50;
        SimpleSymbol simpleSymbol51;
        SimpleSymbol simpleSymbol52;
        SimpleSymbol simpleSymbol53;
        SimpleSymbol simpleSymbol54;
        SimpleSymbol simpleSymbol55;
        SimpleSymbol simpleSymbol56;
        new SimpleSymbol("lookup-handler");
        Lit102 = (SimpleSymbol) simpleSymbol.readResolve();
        new SimpleSymbol("dispatchGenericEvent");
        Lit101 = (SimpleSymbol) simpleSymbol2.readResolve();
        new SimpleSymbol("dispatchEvent");
        Lit100 = (SimpleSymbol) simpleSymbol3.readResolve();
        new SimpleSymbol("send-error");
        Lit99 = (SimpleSymbol) simpleSymbol4.readResolve();
        new SimpleSymbol("add-to-form-do-after-creation");
        Lit98 = (SimpleSymbol) simpleSymbol5.readResolve();
        new SimpleSymbol("add-to-global-vars");
        Lit97 = (SimpleSymbol) simpleSymbol6.readResolve();
        new SimpleSymbol("add-to-components");
        Lit96 = (SimpleSymbol) simpleSymbol7.readResolve();
        new SimpleSymbol("add-to-events");
        Lit95 = (SimpleSymbol) simpleSymbol8.readResolve();
        new SimpleSymbol("add-to-global-var-environment");
        Lit94 = (SimpleSymbol) simpleSymbol9.readResolve();
        new SimpleSymbol("is-bound-in-form-environment");
        Lit93 = (SimpleSymbol) simpleSymbol10.readResolve();
        new SimpleSymbol("lookup-in-form-environment");
        Lit92 = (SimpleSymbol) simpleSymbol11.readResolve();
        new SimpleSymbol("add-to-form-environment");
        Lit91 = (SimpleSymbol) simpleSymbol12.readResolve();
        new SimpleSymbol("android-log-form");
        Lit90 = (SimpleSymbol) simpleSymbol13.readResolve();
        new SimpleSymbol("get-simple-name");
        Lit89 = (SimpleSymbol) simpleSymbol14.readResolve();
        new SimpleSymbol("Click");
        Lit88 = (SimpleSymbol) simpleSymbol15.readResolve();
        new SimpleSymbol("Button4$Click");
        Lit87 = (SimpleSymbol) simpleSymbol16.readResolve();
        new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT);
        SimpleSymbol simpleSymbol57 = (SimpleSymbol) simpleSymbol17.readResolve();
        Lit7 = simpleSymbol57;
        Lit86 = PairWithPosition.make(simpleSymbol57, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/Screen12.yail", 737358);
        new FString("com.google.appinventor.components.runtime.Button");
        Lit85 = fString;
        new SimpleSymbol("FontBold");
        Lit82 = (SimpleSymbol) simpleSymbol18.readResolve();
        int[] iArr = new int[2];
        iArr[0] = -13463672;
        Lit81 = IntNum.make(iArr);
        new SimpleSymbol("Button4");
        Lit80 = (SimpleSymbol) simpleSymbol19.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit79 = fString2;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit78 = fString3;
        new SimpleSymbol("Vertical_Arrangement2_copy1");
        Lit77 = (SimpleSymbol) simpleSymbol20.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit76 = fString4;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit75 = fString5;
        new SimpleSymbol("Label4");
        Lit74 = (SimpleSymbol) simpleSymbol21.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit73 = fString6;
        new FString("com.google.appinventor.components.runtime.Button");
        Lit72 = fString7;
        int[] iArr2 = new int[2];
        iArr2[0] = -92160;
        Lit71 = IntNum.make(iArr2);
        new SimpleSymbol("Button3");
        Lit70 = (SimpleSymbol) simpleSymbol22.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit69 = fString8;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit68 = fString9;
        new SimpleSymbol("Vertical_Arrangement2_copy");
        Lit67 = (SimpleSymbol) simpleSymbol23.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit66 = fString10;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit65 = fString11;
        new SimpleSymbol("Marquee");
        Lit64 = (SimpleSymbol) simpleSymbol24.readResolve();
        new SimpleSymbol("Label3");
        Lit63 = (SimpleSymbol) simpleSymbol25.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit62 = fString12;
        new FString("com.google.appinventor.components.runtime.Button");
        Lit61 = fString13;
        int[] iArr3 = new int[2];
        iArr3[0] = -92160;
        Lit60 = IntNum.make(iArr3);
        new SimpleSymbol("Button2");
        Lit59 = (SimpleSymbol) simpleSymbol26.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit58 = fString14;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit57 = fString15;
        new SimpleSymbol("Vertical_Arrangement2_copy2");
        Lit56 = (SimpleSymbol) simpleSymbol27.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit55 = fString16;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit54 = fString17;
        int[] iArr4 = new int[2];
        iArr4[0] = -722477;
        Lit53 = IntNum.make(iArr4);
        new SimpleSymbol("Label2");
        Lit52 = (SimpleSymbol) simpleSymbol28.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit51 = fString18;
        new FString("com.google.appinventor.components.runtime.Button");
        Lit50 = fString19;
        new SimpleSymbol("Shape");
        Lit48 = (SimpleSymbol) simpleSymbol29.readResolve();
        new SimpleSymbol("FontTypeface");
        Lit46 = (SimpleSymbol) simpleSymbol30.readResolve();
        int[] iArr5 = new int[2];
        iArr5[0] = -92160;
        Lit45 = IntNum.make(iArr5);
        new SimpleSymbol("Button1");
        Lit44 = (SimpleSymbol) simpleSymbol31.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit43 = fString20;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit42 = fString21;
        new SimpleSymbol("Vertical_Arrangement2");
        Lit40 = (SimpleSymbol) simpleSymbol32.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit39 = fString22;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit38 = fString23;
        int[] iArr6 = new int[2];
        iArr6[0] = -1;
        Lit37 = IntNum.make(iArr6);
        new SimpleSymbol("TextColor");
        Lit36 = (SimpleSymbol) simpleSymbol33.readResolve();
        new SimpleSymbol("Text");
        Lit35 = (SimpleSymbol) simpleSymbol34.readResolve();
        new SimpleSymbol("Height");
        Lit34 = (SimpleSymbol) simpleSymbol35.readResolve();
        new SimpleSymbol("FontSize");
        Lit32 = (SimpleSymbol) simpleSymbol36.readResolve();
        new SimpleSymbol("Label1");
        Lit31 = (SimpleSymbol) simpleSymbol37.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit30 = fString24;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit29 = fString25;
        new SimpleSymbol("Width");
        Lit27 = (SimpleSymbol) simpleSymbol38.readResolve();
        int[] iArr7 = new int[2];
        iArr7[0] = -13463672;
        Lit26 = IntNum.make(iArr7);
        new SimpleSymbol("Vertical_Arrangement1");
        Lit25 = (SimpleSymbol) simpleSymbol39.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit24 = fString26;
        new SimpleSymbol("TitleVisible");
        Lit23 = (SimpleSymbol) simpleSymbol40.readResolve();
        new SimpleSymbol("Title");
        Lit22 = (SimpleSymbol) simpleSymbol41.readResolve();
        new SimpleSymbol("boolean");
        Lit21 = (SimpleSymbol) simpleSymbol42.readResolve();
        new SimpleSymbol("Scrollable");
        Lit20 = (SimpleSymbol) simpleSymbol43.readResolve();
        new SimpleSymbol("ReceiveSharedText");
        Lit19 = (SimpleSymbol) simpleSymbol44.readResolve();
        int[] iArr8 = new int[2];
        iArr8[0] = -32615864;
        Lit18 = IntNum.make(iArr8);
        new SimpleSymbol("PrimaryColorDark");
        Lit17 = (SimpleSymbol) simpleSymbol45.readResolve();
        int[] iArr9 = new int[2];
        iArr9[0] = -26950686;
        Lit16 = IntNum.make(iArr9);
        new SimpleSymbol("PrimaryColor");
        Lit15 = (SimpleSymbol) simpleSymbol46.readResolve();
        int[] iArr10 = new int[2];
        iArr10[0] = -17564930;
        Lit14 = IntNum.make(iArr10);
        new SimpleSymbol("NavigationBarColor");
        Lit13 = (SimpleSymbol) simpleSymbol47.readResolve();
        new SimpleSymbol("MinSdk");
        Lit11 = (SimpleSymbol) simpleSymbol48.readResolve();
        int[] iArr11 = new int[2];
        iArr11[0] = -722477;
        Lit10 = IntNum.make(iArr11);
        new SimpleSymbol("BackgroundColor");
        Lit9 = (SimpleSymbol) simpleSymbol49.readResolve();
        new SimpleSymbol("AppName");
        Lit8 = (SimpleSymbol) simpleSymbol50.readResolve();
        new SimpleSymbol("AppId");
        Lit6 = (SimpleSymbol) simpleSymbol51.readResolve();
        new SimpleSymbol("number");
        Lit5 = (SimpleSymbol) simpleSymbol52.readResolve();
        int[] iArr12 = new int[2];
        iArr12[0] = -92160;
        Lit4 = IntNum.make(iArr12);
        new SimpleSymbol("AccentColor");
        Lit3 = (SimpleSymbol) simpleSymbol53.readResolve();
        new SimpleSymbol("*the-null-value*");
        Lit2 = (SimpleSymbol) simpleSymbol54.readResolve();
        new SimpleSymbol("getMessage");
        Lit1 = (SimpleSymbol) simpleSymbol55.readResolve();
        new SimpleSymbol("Screen12");
        Lit0 = (SimpleSymbol) simpleSymbol56.readResolve();
    }

    public Screen12() {
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
        ModuleInfo.register(this);
        ModuleMethod moduleMethod46 = moduleMethod;
        new frame();
        frame frame3 = frame2;
        frame3.$main = this;
        frame frame4 = frame3;
        new ModuleMethod(frame4, 1, Lit89, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.get$Mnsimple$Mnname = moduleMethod46;
        new ModuleMethod(frame4, 2, Lit90, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = moduleMethod2;
        new ModuleMethod(frame4, 3, Lit91, 8194);
        this.add$Mnto$Mnform$Mnenvironment = moduleMethod3;
        new ModuleMethod(frame4, 4, Lit92, 8193);
        this.lookup$Mnin$Mnform$Mnenvironment = moduleMethod4;
        new ModuleMethod(frame4, 6, Lit93, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = moduleMethod5;
        new ModuleMethod(frame4, 7, Lit94, 8194);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = moduleMethod6;
        new ModuleMethod(frame4, 8, Lit95, 8194);
        this.add$Mnto$Mnevents = moduleMethod7;
        new ModuleMethod(frame4, 9, Lit96, 16388);
        this.add$Mnto$Mncomponents = moduleMethod8;
        new ModuleMethod(frame4, 10, Lit97, 8194);
        this.add$Mnto$Mnglobal$Mnvars = moduleMethod9;
        new ModuleMethod(frame4, 11, Lit98, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = moduleMethod10;
        new ModuleMethod(frame4, 12, Lit99, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = moduleMethod11;
        new ModuleMethod(frame4, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = moduleMethod12;
        new ModuleMethod(frame4, 14, Lit100, 16388);
        this.dispatchEvent = moduleMethod13;
        new ModuleMethod(frame4, 15, Lit101, 16388);
        this.dispatchGenericEvent = moduleMethod14;
        new ModuleMethod(frame4, 16, Lit102, 8194);
        this.lookup$Mnhandler = moduleMethod15;
        new ModuleMethod(frame4, 17, (Object) null, 0);
        ModuleMethod moduleMethod47 = moduleMethod16;
        moduleMethod47.setProperty("source-location", "/tmp/runtime2211785962717768109.scm:620");
        lambda$Fn1 = moduleMethod47;
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
        new ModuleMethod(frame4, 46, Lit87, 0);
        this.Button4$Click = moduleMethod45;
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
        Screen12 = null;
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
            Object andCoerceProperty$Ex11 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "Screen12", Lit7);
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
        this.Vertical_Arrangement2 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit39, Lit40, lambda$Fn7), $result);
        } else {
            addToComponents(Lit0, Lit42, Lit40, lambda$Fn8);
        }
        this.Button1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit43, Lit44, lambda$Fn9), $result);
        } else {
            addToComponents(Lit0, Lit50, Lit44, lambda$Fn10);
        }
        this.Label2 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit51, Lit52, lambda$Fn11), $result);
        } else {
            addToComponents(Lit0, Lit54, Lit52, lambda$Fn12);
        }
        this.Vertical_Arrangement2_copy2 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit55, Lit56, lambda$Fn13), $result);
        } else {
            addToComponents(Lit0, Lit57, Lit56, lambda$Fn14);
        }
        this.Button2 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit58, Lit59, lambda$Fn15), $result);
        } else {
            addToComponents(Lit0, Lit61, Lit59, lambda$Fn16);
        }
        this.Label3 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit62, Lit63, lambda$Fn17), $result);
        } else {
            addToComponents(Lit0, Lit65, Lit63, lambda$Fn18);
        }
        this.Vertical_Arrangement2_copy = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit66, Lit67, lambda$Fn19), $result);
        } else {
            addToComponents(Lit0, Lit68, Lit67, lambda$Fn20);
        }
        this.Button3 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit69, Lit70, lambda$Fn21), $result);
        } else {
            addToComponents(Lit0, Lit72, Lit70, lambda$Fn22);
        }
        this.Label4 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit73, Lit74, lambda$Fn23), $result);
        } else {
            addToComponents(Lit0, Lit75, Lit74, lambda$Fn24);
        }
        this.Vertical_Arrangement2_copy1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit76, Lit77, lambda$Fn25), $result);
        } else {
            addToComponents(Lit0, Lit78, Lit77, lambda$Fn26);
        }
        this.Button4 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit79, Lit80, lambda$Fn27), $result);
        } else {
            addToComponents(Lit0, Lit85, Lit80, lambda$Fn28);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment = C1168runtime.addToCurrentFormEnvironment(Lit87, this.Button4$Click);
        } else {
            addToFormEnvironment(Lit87, this.Button4$Click);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "Button4", "Click");
        } else {
            addToEvents(Lit80, Lit88);
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
        Object andCoerceProperty$Ex11 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit22, "Screen12", Lit7);
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
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit31, Lit35, "Amenorrhea (Absence of Menstruation) ", Lit7);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit31, Lit36, Lit37, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit31, Lit27, Lit28, Lit5);
    }

    static Object lambda7() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit31, Lit32, Lit33, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit31, Lit34, Lit28, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit31, Lit35, "Amenorrhea (Absence of Menstruation) ", Lit7);
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
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit44, Lit9, Lit45, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit44, Lit32, Lit41, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit44, Lit46, Lit47, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit44, Lit48, Lit49, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit44, Lit35, "Symptoms", Lit7);
    }

    static Object lambda11() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit44, Lit9, Lit45, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit44, Lit32, Lit41, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit44, Lit46, Lit47, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit44, Lit48, Lit49, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit44, Lit35, "Symptoms", Lit7);
    }

    static Object lambda12() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit52, Lit9, Lit53, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit52, Lit32, Lit41, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit52, Lit46, Lit47, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit52, Lit35, "Primary amenorrhea: \n\n Occurs when a girl does not begin to menstruate by age 16. \n\nGirls who show no signs of sexual development (breast development and pubic hair) by age 13 should be evaluated by a doctor. \n\nAny girl who does not have her period by age 15 should be evaluated for primary amenorrhea. \n\nSecondary amenorrhea: \n\nperiods that were previously regular stop for at least 3 months. ", Lit7);
    }

    static Object lambda13() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit52, Lit9, Lit53, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit52, Lit32, Lit41, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit52, Lit46, Lit47, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit52, Lit35, "Primary amenorrhea: \n\n Occurs when a girl does not begin to menstruate by age 16. \n\nGirls who show no signs of sexual development (breast development and pubic hair) by age 13 should be evaluated by a doctor. \n\nAny girl who does not have her period by age 15 should be evaluated for primary amenorrhea. \n\nSecondary amenorrhea: \n\nperiods that were previously regular stop for at least 3 months. ", Lit7);
    }

    static Object lambda14() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit56, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit56, Lit27, Lit28, Lit5);
    }

    static Object lambda15() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit56, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit56, Lit27, Lit28, Lit5);
    }

    static Object lambda16() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit59, Lit9, Lit60, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit59, Lit32, Lit41, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit59, Lit46, Lit47, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit59, Lit48, Lit49, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit59, Lit35, "Causes", Lit7);
    }

    static Object lambda17() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit59, Lit9, Lit60, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit59, Lit32, Lit41, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit59, Lit46, Lit47, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit59, Lit48, Lit49, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit59, Lit35, "Causes", Lit7);
    }

    static Object lambda18() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit63, Lit32, Lit41, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit63, Lit46, Lit47, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit63, Lit64, Boolean.FALSE, Lit21);
        return C1168runtime.setAndCoerceProperty$Ex(Lit63, Lit35, " Delayed Puberty due to genetic factors. Failure of ovarian development is the most common cause of primary amenorrhea. \n\nHormonal Changes and Puberty. Oligomenorrhea (infrequent menstruation) is commonly experienced by girls who are just beginning to have their periods. ", Lit7);
    }

    static Object lambda19() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit63, Lit32, Lit41, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit63, Lit46, Lit47, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit63, Lit64, Boolean.FALSE, Lit21);
        return C1168runtime.setAndCoerceProperty$Ex(Lit63, Lit35, " Delayed Puberty due to genetic factors. Failure of ovarian development is the most common cause of primary amenorrhea. \n\nHormonal Changes and Puberty. Oligomenorrhea (infrequent menstruation) is commonly experienced by girls who are just beginning to have their periods. ", Lit7);
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
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit70, Lit32, Lit41, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit70, Lit48, Lit49, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit70, Lit35, "Treatment", Lit7);
    }

    static Object lambda23() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit70, Lit9, Lit71, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit70, Lit32, Lit41, Lit5);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit70, Lit48, Lit49, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit70, Lit35, "Treatment", Lit7);
    }

    static Object lambda24() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit74, Lit32, Lit41, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit74, Lit46, Lit47, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit74, Lit35, "You may need to make lifestyle changes, such as diet, activity, and stress. \n\nSurgery is rare, but may be needed in some cases. ", Lit7);
    }

    static Object lambda25() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit74, Lit32, Lit41, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit74, Lit46, Lit47, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit74, Lit35, "You may need to make lifestyle changes, such as diet, activity, and stress. \n\nSurgery is rare, but may be needed in some cases. ", Lit7);
    }

    static Object lambda26() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit77, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit77, Lit27, Lit28, Lit5);
    }

    static Object lambda27() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit77, Lit34, Lit41, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit77, Lit27, Lit28, Lit5);
    }

    static Object lambda28() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit80, Lit9, Lit81, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit80, Lit82, Boolean.TRUE, Lit21);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit80, Lit32, Lit83, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit80, Lit46, Lit84, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit80, Lit35, "Back", Lit7);
    }

    static Object lambda29() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit80, Lit9, Lit81, Lit5);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit80, Lit82, Boolean.TRUE, Lit21);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit80, Lit32, Lit83, Lit5);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit80, Lit46, Lit84, Lit5);
        return C1168runtime.setAndCoerceProperty$Ex(Lit80, Lit35, "Back", Lit7);
    }

    public Object Button4$Click() {
        C1168runtime.setThisForm();
        return C1168runtime.callYailPrimitive(C1168runtime.open$Mnanother$Mnscreen, LList.list1("Screen6"), Lit86, "open another screen");
    }

    /* renamed from: io.kodular.kajalnikunj1024.Classifier.Screen12$frame */
    /* compiled from: Screen12.yail */
    public class frame extends ModuleBody {
        Screen12 $main;

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
                    if (!(obj7 instanceof Screen12)) {
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
                    if (!(obj9 instanceof Screen12)) {
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
                    if (!(obj17 instanceof Screen12)) {
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
                    return Screen12.lambda2();
                case 18:
                    this.$main.$define();
                    return Values.empty;
                case 19:
                    return Screen12.lambda3();
                case 20:
                    return Screen12.lambda4();
                case 21:
                    return Screen12.lambda5();
                case 22:
                    return Screen12.lambda6();
                case 23:
                    return Screen12.lambda7();
                case 24:
                    return Screen12.lambda8();
                case 25:
                    return Screen12.lambda9();
                case 26:
                    return Screen12.lambda10();
                case 27:
                    return Screen12.lambda11();
                case 28:
                    return Screen12.lambda12();
                case 29:
                    return Screen12.lambda13();
                case 30:
                    return Screen12.lambda14();
                case 31:
                    return Screen12.lambda15();
                case 32:
                    return Screen12.lambda16();
                case 33:
                    return Screen12.lambda17();
                case 34:
                    return Screen12.lambda18();
                case 35:
                    return Screen12.lambda19();
                case 36:
                    return Screen12.lambda20();
                case 37:
                    return Screen12.lambda21();
                case 38:
                    return Screen12.lambda22();
                case 39:
                    return Screen12.lambda23();
                case 40:
                    return Screen12.lambda24();
                case 41:
                    return Screen12.lambda25();
                case 42:
                    return Screen12.lambda26();
                case 43:
                    return Screen12.lambda27();
                case 44:
                    return Screen12.lambda28();
                case 45:
                    return Screen12.lambda29();
                case 46:
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
        Screen12 = this;
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
