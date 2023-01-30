package p004io.kodular.kajalnikunj1024.Classifier;

import androidx.fragment.app.FragmentTransaction;
import com.aktech.colorsextractor.ColorsExtractor;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.ImagePicker;
import com.google.appinventor.components.runtime.KodularColorUtilities;
import com.google.appinventor.components.runtime.KodularDynamicCardView;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.MakeroidDynamicLabel;
import com.google.appinventor.components.runtime.MakeroidDynamicTextBox;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.Web;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.StopBlocksExecution;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.C1168runtime;
import com.microsoft.appcenter.ingestion.models.CommonProperties;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.AddOp;
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
import p004io.mohamed.JsonToDictionary.C1287JsonToDictionary;

/* renamed from: io.kodular.kajalnikunj1024.Classifier.saving1_s5 */
/* compiled from: saving1_s5.yail */
public class saving1_s5 extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final SimpleSymbol Lit10;
    static final FString Lit100;
    static final SimpleSymbol Lit101;
    static final IntNum Lit102;
    static final FString Lit103;
    static final PairWithPosition Lit104 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 774257), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 774249);
    static final SimpleSymbol Lit105;
    static final SimpleSymbol Lit106;
    static final SimpleSymbol Lit107;
    static final IntNum Lit108 = IntNum.make(100);
    static final PairWithPosition Lit109 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit221, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 774466), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 774459), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 774449), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 774441);
    static final SimpleSymbol Lit11;
    static final SimpleSymbol Lit110;
    static final SimpleSymbol Lit111;
    static final PairWithPosition Lit112 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 774612), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 774604);
    static final SimpleSymbol Lit113;
    static final PairWithPosition Lit114 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 774760), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 774752);
    static final SimpleSymbol Lit115;
    static final SimpleSymbol Lit116;
    static final SimpleSymbol Lit117;
    static final PairWithPosition Lit118 = PairWithPosition.make(Lit8, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 774967);
    static final PairWithPosition Lit119 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit221, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 774987), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 774979);
    static final SimpleSymbol Lit12;
    static final SimpleSymbol Lit120;
    static final IntNum Lit121 = IntNum.make(-1);
    static final PairWithPosition Lit122 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 775107), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 775099);
    static final SimpleSymbol Lit123;
    static final SimpleSymbol Lit124;
    static final SimpleSymbol Lit125;
    static final PairWithPosition Lit126 = PairWithPosition.make(Lit8, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 775425);
    static final PairWithPosition Lit127 = PairWithPosition.make(Lit8, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 775637);
    static final PairWithPosition Lit128 = PairWithPosition.make(Lit10, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 775649);
    static final PairWithPosition Lit129 = PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 775678), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 775670);
    static final IntNum Lit13;
    static final PairWithPosition Lit130 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit8, PairWithPosition.make(Lit8, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 775706), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 775699), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 775693);
    static final PairWithPosition Lit131 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit10, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 775734), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 775728);
    static final PairWithPosition Lit132;
    static final SimpleSymbol Lit133;
    static final SimpleSymbol Lit134;
    static final PairWithPosition Lit135 = PairWithPosition.make(Lit10, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 775887);
    static final SimpleSymbol Lit136;
    static final FString Lit137;
    static final SimpleSymbol Lit138;
    static final IntNum Lit139 = IntNum.make(10);
    static final SimpleSymbol Lit14;
    static final FString Lit140;
    static final FString Lit141;
    static final SimpleSymbol Lit142;
    static final SimpleSymbol Lit143;
    static final IntNum Lit144 = IntNum.make(25);
    static final IntNum Lit145;
    static final FString Lit146;
    static final FString Lit147;
    static final SimpleSymbol Lit148;
    static final FString Lit149;
    static final IntNum Lit15 = IntNum.make(23);
    static final FString Lit150;
    static final SimpleSymbol Lit151;
    static final IntNum Lit152;
    static final FString Lit153;
    static final FString Lit154;
    static final SimpleSymbol Lit155;
    static final IntNum Lit156;
    static final FString Lit157;
    static final FString Lit158;
    static final SimpleSymbol Lit159;
    static final SimpleSymbol Lit16;
    static final IntNum Lit160;
    static final FString Lit161;
    static final PairWithPosition Lit162 = PairWithPosition.make(Lit10, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 1093711);
    static final SimpleSymbol Lit163;
    static final FString Lit164;
    static final SimpleSymbol Lit165;
    static final FString Lit166;
    static final FString Lit167;
    static final SimpleSymbol Lit168;
    static final IntNum Lit169;
    static final IntNum Lit17;
    static final FString Lit170;
    static final SimpleSymbol Lit171;
    static final FString Lit172;
    static final FString Lit173;
    static final FString Lit174;
    static final FString Lit175;
    static final SimpleSymbol Lit176;
    static final SimpleSymbol Lit177;
    static final PairWithPosition Lit178;
    static final SimpleSymbol Lit179;
    static final SimpleSymbol Lit18;
    static final SimpleSymbol Lit180;
    static final PairWithPosition Lit181 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit10, PairWithPosition.make(Lit10, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 1241480), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 1241475), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 1241469);
    static final PairWithPosition Lit182 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit10, PairWithPosition.make(Lit10, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 1241530), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 1241525), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 1241519);
    static final SimpleSymbol Lit183;
    static final SimpleSymbol Lit184;
    static final FString Lit185;
    static final FString Lit186;
    static final FString Lit187;
    static final FString Lit188;
    static final FString Lit189;
    static final IntNum Lit19;
    static final FString Lit190;
    static final SimpleSymbol Lit191;
    static final SimpleSymbol Lit192;
    static final SimpleSymbol Lit193;
    static final PairWithPosition Lit194;
    static final PairWithPosition Lit195 = PairWithPosition.make(Lit220, PairWithPosition.make(Lit219, PairWithPosition.make(Lit219, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 1311112), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 1311108), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 1311103);
    static final PairWithPosition Lit196 = PairWithPosition.make(Lit220, PairWithPosition.make(Lit219, PairWithPosition.make(Lit219, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 1311162), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 1311158), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 1311153);
    static final SimpleSymbol Lit197;
    static final SimpleSymbol Lit198;
    static final FString Lit199;
    static final SimpleSymbol Lit2;
    static final SimpleSymbol Lit20;
    static final FString Lit200;
    static final FString Lit201;
    static final SimpleSymbol Lit202;
    static final FString Lit203;
    static final SimpleSymbol Lit204;
    static final SimpleSymbol Lit205;
    static final SimpleSymbol Lit206;
    static final SimpleSymbol Lit207;
    static final SimpleSymbol Lit208;
    static final SimpleSymbol Lit209;
    static final SimpleSymbol Lit21;
    static final SimpleSymbol Lit210;
    static final SimpleSymbol Lit211;
    static final SimpleSymbol Lit212;
    static final SimpleSymbol Lit213;
    static final SimpleSymbol Lit214;
    static final SimpleSymbol Lit215;
    static final SimpleSymbol Lit216;
    static final SimpleSymbol Lit217;
    static final SimpleSymbol Lit218;
    static final SimpleSymbol Lit219;
    static final SimpleSymbol Lit22;
    static final SimpleSymbol Lit220;
    static final SimpleSymbol Lit221;
    static final SimpleSymbol Lit23;
    static final SimpleSymbol Lit24;
    static final SimpleSymbol Lit25;
    static final SimpleSymbol Lit26;
    static final FString Lit27;
    static final SimpleSymbol Lit28;
    static final IntNum Lit29;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final IntNum Lit31 = IntNum.make(-2);
    static final FString Lit32;
    static final FString Lit33;
    static final SimpleSymbol Lit34;
    static final SimpleSymbol Lit35;
    static final FString Lit36;
    static final FString Lit37;
    static final SimpleSymbol Lit38;
    static final IntNum Lit39 = IntNum.make(80);
    static final IntNum Lit4 = IntNum.make(0);
    static final FString Lit40;
    static final FString Lit41;
    static final SimpleSymbol Lit42;
    static final SimpleSymbol Lit43;
    static final FString Lit44;
    static final FString Lit45;
    static final SimpleSymbol Lit46;
    static final FString Lit47;
    static final FString Lit48;
    static final SimpleSymbol Lit49;
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final IntNum Lit51 = IntNum.make(40);
    static final SimpleSymbol Lit52;
    static final IntNum Lit53 = IntNum.make(2);
    static final SimpleSymbol Lit54;
    static final SimpleSymbol Lit55;
    static final IntNum Lit56 = IntNum.make(1);
    static final SimpleSymbol Lit57;
    static final IntNum Lit58;
    static final FString Lit59;
    static final SimpleSymbol Lit6;
    static final FString Lit60;
    static final SimpleSymbol Lit61;
    static final IntNum Lit62;
    static final FString Lit63;
    static final FString Lit64;
    static final SimpleSymbol Lit65;
    static final SimpleSymbol Lit66;
    static final IntNum Lit67 = IntNum.make(70);
    static final FString Lit68;
    static final FString Lit69;
    static final IntNum Lit7;
    static final SimpleSymbol Lit70;
    static final FString Lit71;
    static final FString Lit72;
    static final SimpleSymbol Lit73;
    static final IntNum Lit74;
    static final SimpleSymbol Lit75;
    static final FString Lit76;
    static final PairWithPosition Lit77 = PairWithPosition.make(Lit10, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 524366);
    static final SimpleSymbol Lit78;
    static final SimpleSymbol Lit79;
    static final SimpleSymbol Lit8;
    static final FString Lit80;
    static final SimpleSymbol Lit81;
    static final IntNum Lit82 = IntNum.make(3);
    static final FString Lit83;
    static final FString Lit84;
    static final SimpleSymbol Lit85;
    static final FString Lit86;
    static final FString Lit87;
    static final SimpleSymbol Lit88;
    static final SimpleSymbol Lit89;
    static final SimpleSymbol Lit9;
    static final FString Lit90;
    static final FString Lit91;
    static final SimpleSymbol Lit92;
    static final IntNum Lit93;
    static final IntNum Lit94 = IntNum.make(18);
    static final FString Lit95;
    static final SimpleSymbol Lit96;
    static final PairWithPosition Lit97 = PairWithPosition.make(Lit10, PairWithPosition.make(Lit10, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 704661), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 704655);
    static final SimpleSymbol Lit98;
    static final SimpleSymbol Lit99;
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
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    static final ModuleMethod proc$Fn33 = null;
    public static saving1_s5 saving1_s5;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public KodularColorUtilities Color_Utilities1;
    public ColorsExtractor ColorsExtractor1;
    public KodularDynamicCardView Dynamic_Card_View1;
    public final ModuleMethod Dynamic_Card_View1$Click;
    public MakeroidDynamicLabel Dynamic_Label1;
    public MakeroidDynamicTextBox Dynamic_Text_Box1;
    public HorizontalArrangement Horizontal_Arrangement1;
    public HorizontalArrangement Horizontal_Arrangement2;
    public HorizontalArrangement Horizontal_Arrangement3;
    public HorizontalArrangement Horizontal_Arrangement4;
    public Image Image1;
    public ImagePicker Image_Picker1;
    public final ModuleMethod Image_Picker1$AfterPicking;
    public C1287JsonToDictionary JsonToDictionary1;
    public Label Label1;
    public VerticalArrangement Vertical_Arrangement1;
    public VerticalArrangement Vertical_Arrangement11;
    public VerticalArrangement Vertical_Arrangement12;
    public VerticalArrangement Vertical_Arrangement13;
    public VerticalArrangement Vertical_Arrangement2;
    public VerticalArrangement Vertical_Arrangement3;
    public VerticalArrangement Vertical_Arrangement9;
    public Web Web1;
    public final ModuleMethod Web1$GotText;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public VerticalArrangement arr_lib;
    public Button color_analysis;
    public final ModuleMethod color_analysis$Click;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public Button exit;
    public final ModuleMethod exit$Click;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;

    /* renamed from: ii */
    public Label f260ii;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public VerticalArrangement main_display;
    public Button next_pg;
    public final ModuleMethod next_pg$Click;

    /* renamed from: op */
    public VerticalArrangement f261op;
    public final ModuleMethod process$Mnexception;
    public Image s5_img;
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
        SimpleSymbol simpleSymbol18;
        FString fString;
        SimpleSymbol simpleSymbol19;
        FString fString2;
        FString fString3;
        FString fString4;
        SimpleSymbol simpleSymbol20;
        SimpleSymbol simpleSymbol21;
        SimpleSymbol simpleSymbol22;
        SimpleSymbol simpleSymbol23;
        SimpleSymbol simpleSymbol24;
        SimpleSymbol simpleSymbol25;
        FString fString5;
        FString fString6;
        FString fString7;
        FString fString8;
        FString fString9;
        FString fString10;
        SimpleSymbol simpleSymbol26;
        SimpleSymbol simpleSymbol27;
        SimpleSymbol simpleSymbol28;
        SimpleSymbol simpleSymbol29;
        SimpleSymbol simpleSymbol30;
        SimpleSymbol simpleSymbol31;
        SimpleSymbol simpleSymbol32;
        FString fString11;
        FString fString12;
        FString fString13;
        FString fString14;
        SimpleSymbol simpleSymbol33;
        FString fString15;
        SimpleSymbol simpleSymbol34;
        FString fString16;
        FString fString17;
        SimpleSymbol simpleSymbol35;
        FString fString18;
        SimpleSymbol simpleSymbol36;
        FString fString19;
        SimpleSymbol simpleSymbol37;
        FString fString20;
        FString fString21;
        SimpleSymbol simpleSymbol38;
        FString fString22;
        FString fString23;
        SimpleSymbol simpleSymbol39;
        FString fString24;
        FString fString25;
        SimpleSymbol simpleSymbol40;
        FString fString26;
        FString fString27;
        SimpleSymbol simpleSymbol41;
        SimpleSymbol simpleSymbol42;
        FString fString28;
        FString fString29;
        SimpleSymbol simpleSymbol43;
        FString fString30;
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
        SimpleSymbol simpleSymbol57;
        SimpleSymbol simpleSymbol58;
        SimpleSymbol simpleSymbol59;
        SimpleSymbol simpleSymbol60;
        FString fString31;
        SimpleSymbol simpleSymbol61;
        FString fString32;
        SimpleSymbol simpleSymbol62;
        SimpleSymbol simpleSymbol63;
        SimpleSymbol simpleSymbol64;
        FString fString33;
        SimpleSymbol simpleSymbol65;
        FString fString34;
        FString fString35;
        SimpleSymbol simpleSymbol66;
        SimpleSymbol simpleSymbol67;
        FString fString36;
        FString fString37;
        SimpleSymbol simpleSymbol68;
        FString fString38;
        FString fString39;
        SimpleSymbol simpleSymbol69;
        FString fString40;
        SimpleSymbol simpleSymbol70;
        SimpleSymbol simpleSymbol71;
        FString fString41;
        SimpleSymbol simpleSymbol72;
        SimpleSymbol simpleSymbol73;
        FString fString42;
        FString fString43;
        SimpleSymbol simpleSymbol74;
        FString fString44;
        FString fString45;
        SimpleSymbol simpleSymbol75;
        SimpleSymbol simpleSymbol76;
        FString fString46;
        FString fString47;
        SimpleSymbol simpleSymbol77;
        FString fString48;
        FString fString49;
        SimpleSymbol simpleSymbol78;
        SimpleSymbol simpleSymbol79;
        SimpleSymbol simpleSymbol80;
        SimpleSymbol simpleSymbol81;
        SimpleSymbol simpleSymbol82;
        SimpleSymbol simpleSymbol83;
        FString fString50;
        FString fString51;
        SimpleSymbol simpleSymbol84;
        FString fString52;
        FString fString53;
        SimpleSymbol simpleSymbol85;
        SimpleSymbol simpleSymbol86;
        FString fString54;
        FString fString55;
        SimpleSymbol simpleSymbol87;
        FString fString56;
        FString fString57;
        SimpleSymbol simpleSymbol88;
        SimpleSymbol simpleSymbol89;
        FString fString58;
        FString fString59;
        SimpleSymbol simpleSymbol90;
        SimpleSymbol simpleSymbol91;
        FString fString60;
        SimpleSymbol simpleSymbol92;
        SimpleSymbol simpleSymbol93;
        SimpleSymbol simpleSymbol94;
        SimpleSymbol simpleSymbol95;
        SimpleSymbol simpleSymbol96;
        SimpleSymbol simpleSymbol97;
        SimpleSymbol simpleSymbol98;
        SimpleSymbol simpleSymbol99;
        SimpleSymbol simpleSymbol100;
        SimpleSymbol simpleSymbol101;
        SimpleSymbol simpleSymbol102;
        SimpleSymbol simpleSymbol103;
        SimpleSymbol simpleSymbol104;
        SimpleSymbol simpleSymbol105;
        SimpleSymbol simpleSymbol106;
        SimpleSymbol simpleSymbol107;
        SimpleSymbol simpleSymbol108;
        SimpleSymbol simpleSymbol109;
        new SimpleSymbol("component");
        Lit221 = (SimpleSymbol) simpleSymbol.readResolve();
        new SimpleSymbol("key");
        Lit220 = (SimpleSymbol) simpleSymbol2.readResolve();
        new SimpleSymbol("any");
        Lit219 = (SimpleSymbol) simpleSymbol3.readResolve();
        new SimpleSymbol("proc");
        Lit218 = (SimpleSymbol) simpleSymbol4.readResolve();
        new SimpleSymbol("lookup-handler");
        Lit217 = (SimpleSymbol) simpleSymbol5.readResolve();
        new SimpleSymbol("dispatchGenericEvent");
        Lit216 = (SimpleSymbol) simpleSymbol6.readResolve();
        new SimpleSymbol("dispatchEvent");
        Lit215 = (SimpleSymbol) simpleSymbol7.readResolve();
        new SimpleSymbol("send-error");
        Lit214 = (SimpleSymbol) simpleSymbol8.readResolve();
        new SimpleSymbol("add-to-form-do-after-creation");
        Lit213 = (SimpleSymbol) simpleSymbol9.readResolve();
        new SimpleSymbol("add-to-global-vars");
        Lit212 = (SimpleSymbol) simpleSymbol10.readResolve();
        new SimpleSymbol("add-to-components");
        Lit211 = (SimpleSymbol) simpleSymbol11.readResolve();
        new SimpleSymbol("add-to-events");
        Lit210 = (SimpleSymbol) simpleSymbol12.readResolve();
        new SimpleSymbol("add-to-global-var-environment");
        Lit209 = (SimpleSymbol) simpleSymbol13.readResolve();
        new SimpleSymbol("is-bound-in-form-environment");
        Lit208 = (SimpleSymbol) simpleSymbol14.readResolve();
        new SimpleSymbol("lookup-in-form-environment");
        Lit207 = (SimpleSymbol) simpleSymbol15.readResolve();
        new SimpleSymbol("add-to-form-environment");
        Lit206 = (SimpleSymbol) simpleSymbol16.readResolve();
        new SimpleSymbol("android-log-form");
        Lit205 = (SimpleSymbol) simpleSymbol17.readResolve();
        new SimpleSymbol("get-simple-name");
        Lit204 = (SimpleSymbol) simpleSymbol18.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidDynamicTextBox");
        Lit203 = fString;
        new SimpleSymbol("Dynamic_Text_Box1");
        Lit202 = (SimpleSymbol) simpleSymbol19.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidDynamicTextBox");
        Lit201 = fString2;
        new FString("io.mohamed.JsonToDictionary.JsonToDictionary");
        Lit200 = fString3;
        new FString("io.mohamed.JsonToDictionary.JsonToDictionary");
        Lit199 = fString4;
        new SimpleSymbol("GotText");
        Lit198 = (SimpleSymbol) simpleSymbol20.readResolve();
        new SimpleSymbol("Web1$GotText");
        Lit197 = (SimpleSymbol) simpleSymbol21.readResolve();
        new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT);
        SimpleSymbol simpleSymbol110 = (SimpleSymbol) simpleSymbol22.readResolve();
        Lit10 = simpleSymbol110;
        Lit194 = PairWithPosition.make(simpleSymbol110, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 1310876);
        new SimpleSymbol("$responseContent");
        Lit193 = (SimpleSymbol) simpleSymbol23.readResolve();
        new SimpleSymbol("JsonTextDecodeWithDictionaries");
        Lit192 = (SimpleSymbol) simpleSymbol24.readResolve();
        new SimpleSymbol("JsonToDictionary1");
        Lit191 = (SimpleSymbol) simpleSymbol25.readResolve();
        new FString("com.google.appinventor.components.runtime.Web");
        Lit190 = fString5;
        new FString("com.google.appinventor.components.runtime.Web");
        Lit189 = fString6;
        new FString("com.google.appinventor.components.runtime.MakeroidDynamicLabel");
        Lit188 = fString7;
        new FString("com.google.appinventor.components.runtime.MakeroidDynamicLabel");
        Lit187 = fString8;
        new FString("com.google.appinventor.components.runtime.KodularColorUtilities");
        Lit186 = fString9;
        new FString("com.google.appinventor.components.runtime.KodularColorUtilities");
        Lit185 = fString10;
        new SimpleSymbol("Dynamic_Card_View1$Click");
        Lit184 = (SimpleSymbol) simpleSymbol26.readResolve();
        new SimpleSymbol("Get");
        Lit183 = (SimpleSymbol) simpleSymbol27.readResolve();
        new SimpleSymbol("Url");
        Lit180 = (SimpleSymbol) simpleSymbol28.readResolve();
        new SimpleSymbol("Web1");
        Lit179 = (SimpleSymbol) simpleSymbol29.readResolve();
        new SimpleSymbol("number");
        SimpleSymbol simpleSymbol111 = (SimpleSymbol) simpleSymbol30.readResolve();
        Lit8 = simpleSymbol111;
        Lit178 = PairWithPosition.make(simpleSymbol111, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 1241232);
        new SimpleSymbol("GetText");
        Lit177 = (SimpleSymbol) simpleSymbol31.readResolve();
        new SimpleSymbol("$id");
        Lit176 = (SimpleSymbol) simpleSymbol32.readResolve();
        new FString("com.google.appinventor.components.runtime.KodularDynamicCardView");
        Lit175 = fString11;
        new FString("com.google.appinventor.components.runtime.KodularDynamicCardView");
        Lit174 = fString12;
        new FString("com.aktech.colorsextractor.ColorsExtractor");
        Lit173 = fString13;
        new FString("com.aktech.colorsextractor.ColorsExtractor");
        Lit172 = fString14;
        new SimpleSymbol("exit$Click");
        Lit171 = (SimpleSymbol) simpleSymbol33.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit170 = fString15;
        int[] iArr = new int[2];
        iArr[0] = -92160;
        Lit169 = IntNum.make(iArr);
        new SimpleSymbol("exit");
        Lit168 = (SimpleSymbol) simpleSymbol34.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit167 = fString16;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit166 = fString17;
        new SimpleSymbol("Vertical_Arrangement9");
        Lit165 = (SimpleSymbol) simpleSymbol35.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit164 = fString18;
        new SimpleSymbol("color_analysis$Click");
        Lit163 = (SimpleSymbol) simpleSymbol36.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit161 = fString19;
        int[] iArr2 = new int[2];
        iArr2[0] = -92160;
        Lit160 = IntNum.make(iArr2);
        new SimpleSymbol("color_analysis");
        Lit159 = (SimpleSymbol) simpleSymbol37.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit158 = fString20;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit157 = fString21;
        int[] iArr3 = new int[2];
        iArr3[0] = -1;
        Lit156 = IntNum.make(iArr3);
        new SimpleSymbol("Vertical_Arrangement13");
        Lit155 = (SimpleSymbol) simpleSymbol38.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit154 = fString22;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit153 = fString23;
        int[] iArr4 = new int[2];
        iArr4[0] = -1;
        Lit152 = IntNum.make(iArr4);
        new SimpleSymbol("main_display");
        Lit151 = (SimpleSymbol) simpleSymbol39.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit150 = fString24;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit149 = fString25;
        new SimpleSymbol("Vertical_Arrangement12");
        Lit148 = (SimpleSymbol) simpleSymbol40.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit147 = fString26;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit146 = fString27;
        int[] iArr5 = new int[2];
        iArr5[0] = -32615864;
        Lit145 = IntNum.make(iArr5);
        new SimpleSymbol("FontBold");
        Lit143 = (SimpleSymbol) simpleSymbol41.readResolve();
        new SimpleSymbol("Label1");
        Lit142 = (SimpleSymbol) simpleSymbol42.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit141 = fString28;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit140 = fString29;
        new SimpleSymbol("Vertical_Arrangement11");
        Lit138 = (SimpleSymbol) simpleSymbol43.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit137 = fString30;
        new SimpleSymbol("Button1$Click");
        Lit136 = (SimpleSymbol) simpleSymbol44.readResolve();
        new SimpleSymbol("GetColors");
        Lit134 = (SimpleSymbol) simpleSymbol45.readResolve();
        new SimpleSymbol("ColorsExtractor1");
        Lit133 = (SimpleSymbol) simpleSymbol46.readResolve();
        SimpleSymbol simpleSymbol112 = Lit8;
        SimpleSymbol simpleSymbol113 = Lit10;
        new SimpleSymbol("boolean");
        SimpleSymbol simpleSymbol114 = (SimpleSymbol) simpleSymbol47.readResolve();
        Lit22 = simpleSymbol114;
        Lit132 = PairWithPosition.make(simpleSymbol112, PairWithPosition.make(simpleSymbol113, PairWithPosition.make(simpleSymbol114, LList.Empty, "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 775768), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 775763), "/tmp/1659259710880_0.2921613529838907-0/youngandroidproject/../src/io/kodular/kajalnikunj1024/Classifier/saving1_s5.yail", 775755);
        new SimpleSymbol("ConvertIntToHex");
        Lit125 = (SimpleSymbol) simpleSymbol48.readResolve();
        new SimpleSymbol("Color_Utilities1");
        Lit124 = (SimpleSymbol) simpleSymbol49.readResolve();
        new SimpleSymbol("SetText");
        Lit123 = (SimpleSymbol) simpleSymbol50.readResolve();
        new SimpleSymbol("SetTextColor");
        Lit120 = (SimpleSymbol) simpleSymbol51.readResolve();
        new SimpleSymbol("GetCardViewById");
        Lit117 = (SimpleSymbol) simpleSymbol52.readResolve();
        new SimpleSymbol("CreateLabel");
        Lit116 = (SimpleSymbol) simpleSymbol53.readResolve();
        new SimpleSymbol("Dynamic_Label1");
        Lit115 = (SimpleSymbol) simpleSymbol54.readResolve();
        new SimpleSymbol("SetWidth");
        Lit113 = (SimpleSymbol) simpleSymbol55.readResolve();
        new SimpleSymbol("$item");
        Lit111 = (SimpleSymbol) simpleSymbol56.readResolve();
        new SimpleSymbol("SetBackgroundColor");
        Lit110 = (SimpleSymbol) simpleSymbol57.readResolve();
        new SimpleSymbol("$name");
        Lit107 = (SimpleSymbol) simpleSymbol58.readResolve();
        new SimpleSymbol("CreateCardView");
        Lit106 = (SimpleSymbol) simpleSymbol59.readResolve();
        new SimpleSymbol("Dynamic_Card_View1");
        Lit105 = (SimpleSymbol) simpleSymbol60.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit103 = fString31;
        int[] iArr6 = new int[2];
        iArr6[0] = -92160;
        Lit102 = IntNum.make(iArr6);
        new SimpleSymbol("Button1");
        Lit101 = (SimpleSymbol) simpleSymbol61.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit100 = fString32;
        new SimpleSymbol("AfterPicking");
        Lit99 = (SimpleSymbol) simpleSymbol62.readResolve();
        new SimpleSymbol("Image_Picker1$AfterPicking");
        Lit98 = (SimpleSymbol) simpleSymbol63.readResolve();
        new SimpleSymbol("$selection");
        Lit96 = (SimpleSymbol) simpleSymbol64.readResolve();
        new FString("com.google.appinventor.components.runtime.ImagePicker");
        Lit95 = fString33;
        int[] iArr7 = new int[2];
        iArr7[0] = -92160;
        Lit93 = IntNum.make(iArr7);
        new SimpleSymbol("Image_Picker1");
        Lit92 = (SimpleSymbol) simpleSymbol65.readResolve();
        new FString("com.google.appinventor.components.runtime.ImagePicker");
        Lit91 = fString34;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit90 = fString35;
        new SimpleSymbol("AlignVertical");
        Lit89 = (SimpleSymbol) simpleSymbol66.readResolve();
        new SimpleSymbol("Vertical_Arrangement3");
        Lit88 = (SimpleSymbol) simpleSymbol67.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit87 = fString36;
        new FString("com.google.appinventor.components.runtime.Image");
        Lit86 = fString37;
        new SimpleSymbol("s5_img");
        Lit85 = (SimpleSymbol) simpleSymbol68.readResolve();
        new FString("com.google.appinventor.components.runtime.Image");
        Lit84 = fString38;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit83 = fString39;
        new SimpleSymbol("Vertical_Arrangement2");
        Lit81 = (SimpleSymbol) simpleSymbol69.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit80 = fString40;
        new SimpleSymbol("Click");
        Lit79 = (SimpleSymbol) simpleSymbol70.readResolve();
        new SimpleSymbol("next_pg$Click");
        Lit78 = (SimpleSymbol) simpleSymbol71.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit76 = fString41;
        new SimpleSymbol("Shape");
        Lit75 = (SimpleSymbol) simpleSymbol72.readResolve();
        int[] iArr8 = new int[2];
        iArr8[0] = -92160;
        Lit74 = IntNum.make(iArr8);
        new SimpleSymbol("next_pg");
        Lit73 = (SimpleSymbol) simpleSymbol73.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit72 = fString42;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit71 = fString43;
        new SimpleSymbol("Horizontal_Arrangement4");
        Lit70 = (SimpleSymbol) simpleSymbol74.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit69 = fString44;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit68 = fString45;
        new SimpleSymbol("AlignHorizontal");
        Lit66 = (SimpleSymbol) simpleSymbol75.readResolve();
        new SimpleSymbol("op");
        Lit65 = (SimpleSymbol) simpleSymbol76.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit64 = fString46;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit63 = fString47;
        int[] iArr9 = new int[2];
        iArr9[0] = -1770809;
        Lit62 = IntNum.make(iArr9);
        new SimpleSymbol("arr_lib");
        Lit61 = (SimpleSymbol) simpleSymbol77.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit60 = fString48;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit59 = fString49;
        int[] iArr10 = new int[2];
        iArr10[0] = -17564930;
        Lit58 = IntNum.make(iArr10);
        new SimpleSymbol("TextColor");
        Lit57 = (SimpleSymbol) simpleSymbol78.readResolve();
        new SimpleSymbol("TextAlignment");
        Lit55 = (SimpleSymbol) simpleSymbol79.readResolve();
        new SimpleSymbol("Text");
        Lit54 = (SimpleSymbol) simpleSymbol80.readResolve();
        new SimpleSymbol("FontTypeface");
        Lit52 = (SimpleSymbol) simpleSymbol81.readResolve();
        new SimpleSymbol("FontSize");
        Lit50 = (SimpleSymbol) simpleSymbol82.readResolve();
        new SimpleSymbol("ii");
        Lit49 = (SimpleSymbol) simpleSymbol83.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit48 = fString50;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit47 = fString51;
        new SimpleSymbol("Horizontal_Arrangement3");
        Lit46 = (SimpleSymbol) simpleSymbol84.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit45 = fString52;
        new FString("com.google.appinventor.components.runtime.Image");
        Lit44 = fString53;
        new SimpleSymbol("Picture");
        Lit43 = (SimpleSymbol) simpleSymbol85.readResolve();
        new SimpleSymbol("Image1");
        Lit42 = (SimpleSymbol) simpleSymbol86.readResolve();
        new FString("com.google.appinventor.components.runtime.Image");
        Lit41 = fString54;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit40 = fString55;
        new SimpleSymbol("Horizontal_Arrangement2");
        Lit38 = (SimpleSymbol) simpleSymbol87.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit37 = fString56;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit36 = fString57;
        new SimpleSymbol("Height");
        Lit35 = (SimpleSymbol) simpleSymbol88.readResolve();
        new SimpleSymbol("Horizontal_Arrangement1");
        Lit34 = (SimpleSymbol) simpleSymbol89.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit33 = fString58;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit32 = fString59;
        new SimpleSymbol("Width");
        Lit30 = (SimpleSymbol) simpleSymbol90.readResolve();
        int[] iArr11 = new int[2];
        iArr11[0] = -13463672;
        Lit29 = IntNum.make(iArr11);
        new SimpleSymbol("Vertical_Arrangement1");
        Lit28 = (SimpleSymbol) simpleSymbol91.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit27 = fString60;
        new SimpleSymbol("TitleVisible");
        Lit26 = (SimpleSymbol) simpleSymbol92.readResolve();
        new SimpleSymbol("Title");
        Lit25 = (SimpleSymbol) simpleSymbol93.readResolve();
        new SimpleSymbol("ShowStatusBar");
        Lit24 = (SimpleSymbol) simpleSymbol94.readResolve();
        new SimpleSymbol("ShowOptionsMenu");
        Lit23 = (SimpleSymbol) simpleSymbol95.readResolve();
        new SimpleSymbol("Scrollable");
        Lit21 = (SimpleSymbol) simpleSymbol96.readResolve();
        new SimpleSymbol("ReceiveSharedText");
        Lit20 = (SimpleSymbol) simpleSymbol97.readResolve();
        int[] iArr12 = new int[2];
        iArr12[0] = -32615864;
        Lit19 = IntNum.make(iArr12);
        new SimpleSymbol("PrimaryColorDark");
        Lit18 = (SimpleSymbol) simpleSymbol98.readResolve();
        int[] iArr13 = new int[2];
        iArr13[0] = -26950686;
        Lit17 = IntNum.make(iArr13);
        new SimpleSymbol("PrimaryColor");
        Lit16 = (SimpleSymbol) simpleSymbol99.readResolve();
        new SimpleSymbol("MinSdk");
        Lit14 = (SimpleSymbol) simpleSymbol100.readResolve();
        int[] iArr14 = new int[2];
        iArr14[0] = -722477;
        Lit13 = IntNum.make(iArr14);
        new SimpleSymbol("BackgroundColor");
        Lit12 = (SimpleSymbol) simpleSymbol101.readResolve();
        new SimpleSymbol("AppName");
        Lit11 = (SimpleSymbol) simpleSymbol102.readResolve();
        new SimpleSymbol("AppId");
        Lit9 = (SimpleSymbol) simpleSymbol103.readResolve();
        int[] iArr15 = new int[2];
        iArr15[0] = -92160;
        Lit7 = IntNum.make(iArr15);
        new SimpleSymbol("AccentColor");
        Lit6 = (SimpleSymbol) simpleSymbol104.readResolve();
        new SimpleSymbol("g$response2");
        Lit5 = (SimpleSymbol) simpleSymbol105.readResolve();
        new SimpleSymbol("g$id");
        Lit3 = (SimpleSymbol) simpleSymbol106.readResolve();
        new SimpleSymbol("*the-null-value*");
        Lit2 = (SimpleSymbol) simpleSymbol107.readResolve();
        new SimpleSymbol("getMessage");
        Lit1 = (SimpleSymbol) simpleSymbol108.readResolve();
        new SimpleSymbol("saving1_s5");
        Lit0 = (SimpleSymbol) simpleSymbol109.readResolve();
    }

    public saving1_s5() {
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
        ModuleMethod moduleMethod70;
        ModuleMethod moduleMethod71;
        ModuleMethod moduleMethod72;
        ModuleInfo.register(this);
        ModuleMethod moduleMethod73 = moduleMethod;
        new frame();
        frame frame3 = frame2;
        frame3.$main = this;
        frame frame4 = frame3;
        new ModuleMethod(frame4, 1, Lit204, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.get$Mnsimple$Mnname = moduleMethod73;
        new ModuleMethod(frame4, 2, Lit205, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = moduleMethod2;
        new ModuleMethod(frame4, 3, Lit206, 8194);
        this.add$Mnto$Mnform$Mnenvironment = moduleMethod3;
        new ModuleMethod(frame4, 4, Lit207, 8193);
        this.lookup$Mnin$Mnform$Mnenvironment = moduleMethod4;
        new ModuleMethod(frame4, 6, Lit208, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = moduleMethod5;
        new ModuleMethod(frame4, 7, Lit209, 8194);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = moduleMethod6;
        new ModuleMethod(frame4, 8, Lit210, 8194);
        this.add$Mnto$Mnevents = moduleMethod7;
        new ModuleMethod(frame4, 9, Lit211, 16388);
        this.add$Mnto$Mncomponents = moduleMethod8;
        new ModuleMethod(frame4, 10, Lit212, 8194);
        this.add$Mnto$Mnglobal$Mnvars = moduleMethod9;
        new ModuleMethod(frame4, 11, Lit213, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = moduleMethod10;
        new ModuleMethod(frame4, 12, Lit214, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = moduleMethod11;
        new ModuleMethod(frame4, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = moduleMethod12;
        new ModuleMethod(frame4, 14, Lit215, 16388);
        this.dispatchEvent = moduleMethod13;
        new ModuleMethod(frame4, 15, Lit216, 16388);
        this.dispatchGenericEvent = moduleMethod14;
        new ModuleMethod(frame4, 16, Lit217, 8194);
        this.lookup$Mnhandler = moduleMethod15;
        new ModuleMethod(frame4, 17, (Object) null, 0);
        ModuleMethod moduleMethod74 = moduleMethod16;
        moduleMethod74.setProperty("source-location", "/tmp/runtime2211785962717768109.scm:620");
        lambda$Fn1 = moduleMethod74;
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
        new ModuleMethod(frame4, 40, Lit78, 0);
        this.next_pg$Click = moduleMethod39;
        new ModuleMethod(frame4, 41, (Object) null, 0);
        lambda$Fn23 = moduleMethod40;
        new ModuleMethod(frame4, 42, (Object) null, 0);
        lambda$Fn24 = moduleMethod41;
        new ModuleMethod(frame4, 43, (Object) null, 0);
        lambda$Fn25 = moduleMethod42;
        new ModuleMethod(frame4, 44, (Object) null, 0);
        lambda$Fn26 = moduleMethod43;
        new ModuleMethod(frame4, 45, (Object) null, 0);
        lambda$Fn27 = moduleMethod44;
        new ModuleMethod(frame4, 46, (Object) null, 0);
        lambda$Fn28 = moduleMethod45;
        new ModuleMethod(frame4, 47, (Object) null, 0);
        lambda$Fn29 = moduleMethod46;
        new ModuleMethod(frame4, 48, (Object) null, 0);
        lambda$Fn30 = moduleMethod47;
        new ModuleMethod(frame4, 49, Lit98, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.Image_Picker1$AfterPicking = moduleMethod48;
        new ModuleMethod(frame4, 50, (Object) null, 0);
        lambda$Fn31 = moduleMethod49;
        new ModuleMethod(frame4, 51, (Object) null, 0);
        lambda$Fn32 = moduleMethod50;
        new ModuleMethod(frame4, 52, Lit218, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        proc$Fn33 = moduleMethod51;
        new ModuleMethod(frame4, 53, Lit136, 0);
        this.Button1$Click = moduleMethod52;
        new ModuleMethod(frame4, 54, (Object) null, 0);
        lambda$Fn34 = moduleMethod53;
        new ModuleMethod(frame4, 55, (Object) null, 0);
        lambda$Fn35 = moduleMethod54;
        new ModuleMethod(frame4, 56, (Object) null, 0);
        lambda$Fn36 = moduleMethod55;
        new ModuleMethod(frame4, 57, (Object) null, 0);
        lambda$Fn37 = moduleMethod56;
        new ModuleMethod(frame4, 58, (Object) null, 0);
        lambda$Fn38 = moduleMethod57;
        new ModuleMethod(frame4, 59, (Object) null, 0);
        lambda$Fn39 = moduleMethod58;
        new ModuleMethod(frame4, 60, (Object) null, 0);
        lambda$Fn40 = moduleMethod59;
        new ModuleMethod(frame4, 61, (Object) null, 0);
        lambda$Fn41 = moduleMethod60;
        new ModuleMethod(frame4, 62, (Object) null, 0);
        lambda$Fn42 = moduleMethod61;
        new ModuleMethod(frame4, 63, (Object) null, 0);
        lambda$Fn43 = moduleMethod62;
        new ModuleMethod(frame4, 64, (Object) null, 0);
        lambda$Fn44 = moduleMethod63;
        new ModuleMethod(frame4, 65, (Object) null, 0);
        lambda$Fn45 = moduleMethod64;
        new ModuleMethod(frame4, 66, Lit163, 0);
        this.color_analysis$Click = moduleMethod65;
        new ModuleMethod(frame4, 67, (Object) null, 0);
        lambda$Fn46 = moduleMethod66;
        new ModuleMethod(frame4, 68, (Object) null, 0);
        lambda$Fn47 = moduleMethod67;
        new ModuleMethod(frame4, 69, (Object) null, 0);
        lambda$Fn48 = moduleMethod68;
        new ModuleMethod(frame4, 70, (Object) null, 0);
        lambda$Fn49 = moduleMethod69;
        new ModuleMethod(frame4, 71, Lit171, 0);
        this.exit$Click = moduleMethod70;
        new ModuleMethod(frame4, 72, Lit184, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.Dynamic_Card_View1$Click = moduleMethod71;
        new ModuleMethod(frame4, 73, Lit197, 16388);
        this.Web1$GotText = moduleMethod72;
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
        saving1_s5 = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        C1168runtime.$instance.run();
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addGlobalVarToCurrentFormEnvironment(Lit3, Lit4), $result);
        } else {
            addToGlobalVars(Lit3, lambda$Fn2);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addGlobalVarToCurrentFormEnvironment(Lit5, C1168runtime.callYailPrimitive(C1168runtime.make$Mnyail$Mndictionary, LList.Empty, LList.Empty, "make a dictionary")), $result);
        } else {
            addToGlobalVars(Lit5, lambda$Fn3);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Lit7, Lit8);
            Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "6063526160367616", Lit10);
            Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "Classifier", Lit10);
            Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit12, Lit13, Lit8);
            Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Lit15, Lit8);
            Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Lit17, Lit8);
            Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit18, Lit19, Lit8);
            Object andCoerceProperty$Ex8 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit20, AlgorithmIdentifiers.NONE, Lit10);
            Object andCoerceProperty$Ex9 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit21, Boolean.TRUE, Lit22);
            Object andCoerceProperty$Ex10 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit23, Boolean.FALSE, Lit22);
            Object andCoerceProperty$Ex11 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Boolean.FALSE, Lit22);
            Object andCoerceProperty$Ex12 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit25, "saving1_s5", Lit10);
            Values.writeValues(C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit26, Boolean.FALSE, Lit22), $result);
        } else {
            new Promise(lambda$Fn4);
            addToFormDoAfterCreation(obj2);
        }
        this.Vertical_Arrangement1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit27, Lit28, lambda$Fn5), $result);
        } else {
            addToComponents(Lit0, Lit32, Lit28, lambda$Fn6);
        }
        this.Horizontal_Arrangement1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit28, Lit33, Lit34, lambda$Fn7), $result);
        } else {
            addToComponents(Lit28, Lit36, Lit34, lambda$Fn8);
        }
        this.Horizontal_Arrangement2 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit34, Lit37, Lit38, lambda$Fn9), $result);
        } else {
            addToComponents(Lit34, Lit40, Lit38, lambda$Fn10);
        }
        this.Image1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit38, Lit41, Lit42, lambda$Fn11), $result);
        } else {
            addToComponents(Lit38, Lit44, Lit42, lambda$Fn12);
        }
        this.Horizontal_Arrangement3 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit34, Lit45, Lit46, lambda$Fn13), $result);
        } else {
            addToComponents(Lit34, Lit47, Lit46, lambda$Fn14);
        }
        this.f260ii = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit46, Lit48, Lit49, lambda$Fn15), $result);
        } else {
            addToComponents(Lit46, Lit59, Lit49, lambda$Fn16);
        }
        this.arr_lib = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit60, Lit61, lambda$Fn17), $result);
        } else {
            addToComponents(Lit0, Lit63, Lit61, lambda$Fn18);
        }
        this.f261op = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit61, Lit64, Lit65, lambda$Fn19), $result);
        } else {
            addToComponents(Lit61, Lit68, Lit65, lambda$Fn20);
        }
        this.Horizontal_Arrangement4 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit65, Lit69, Lit70, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit65, Lit71, Lit70, Boolean.FALSE);
        }
        this.next_pg = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit70, Lit72, Lit73, lambda$Fn21), $result);
        } else {
            addToComponents(Lit70, Lit76, Lit73, lambda$Fn22);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment = C1168runtime.addToCurrentFormEnvironment(Lit78, this.next_pg$Click);
        } else {
            addToFormEnvironment(Lit78, this.next_pg$Click);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "next_pg", "Click");
        } else {
            addToEvents(Lit73, Lit79);
        }
        this.Vertical_Arrangement2 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit61, Lit80, Lit81, lambda$Fn23), $result);
        } else {
            addToComponents(Lit61, Lit83, Lit81, lambda$Fn24);
        }
        this.s5_img = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit81, Lit84, Lit85, lambda$Fn25), $result);
        } else {
            addToComponents(Lit81, Lit86, Lit85, lambda$Fn26);
        }
        this.Vertical_Arrangement3 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit61, Lit87, Lit88, lambda$Fn27), $result);
        } else {
            addToComponents(Lit61, Lit90, Lit88, lambda$Fn28);
        }
        this.Image_Picker1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit88, Lit91, Lit92, lambda$Fn29), $result);
        } else {
            addToComponents(Lit88, Lit95, Lit92, lambda$Fn30);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment2 = C1168runtime.addToCurrentFormEnvironment(Lit98, this.Image_Picker1$AfterPicking);
        } else {
            addToFormEnvironment(Lit98, this.Image_Picker1$AfterPicking);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "Image_Picker1", "AfterPicking");
        } else {
            addToEvents(Lit92, Lit99);
        }
        this.Button1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit88, Lit100, Lit101, lambda$Fn31), $result);
        } else {
            addToComponents(Lit88, Lit103, Lit101, lambda$Fn32);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment3 = C1168runtime.addToCurrentFormEnvironment(Lit136, this.Button1$Click);
        } else {
            addToFormEnvironment(Lit136, this.Button1$Click);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "Button1", "Click");
        } else {
            addToEvents(Lit101, Lit79);
        }
        this.Vertical_Arrangement11 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit61, Lit137, Lit138, lambda$Fn34), $result);
        } else {
            addToComponents(Lit61, Lit140, Lit138, lambda$Fn35);
        }
        this.Label1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit61, Lit141, Lit142, lambda$Fn36), $result);
        } else {
            addToComponents(Lit61, Lit146, Lit142, lambda$Fn37);
        }
        this.Vertical_Arrangement12 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit61, Lit147, Lit148, lambda$Fn38), $result);
        } else {
            addToComponents(Lit61, Lit149, Lit148, lambda$Fn39);
        }
        this.main_display = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit61, Lit150, Lit151, lambda$Fn40), $result);
        } else {
            addToComponents(Lit61, Lit153, Lit151, lambda$Fn41);
        }
        this.Vertical_Arrangement13 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit61, Lit154, Lit155, lambda$Fn42), $result);
        } else {
            addToComponents(Lit61, Lit157, Lit155, lambda$Fn43);
        }
        this.color_analysis = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit155, Lit158, Lit159, lambda$Fn44), $result);
        } else {
            addToComponents(Lit155, Lit161, Lit159, lambda$Fn45);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment4 = C1168runtime.addToCurrentFormEnvironment(Lit163, this.color_analysis$Click);
        } else {
            addToFormEnvironment(Lit163, this.color_analysis$Click);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "color_analysis", "Click");
        } else {
            addToEvents(Lit159, Lit79);
        }
        this.Vertical_Arrangement9 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit164, Lit165, lambda$Fn46), $result);
        } else {
            addToComponents(Lit0, Lit166, Lit165, lambda$Fn47);
        }
        this.exit = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit165, Lit167, Lit168, lambda$Fn48), $result);
        } else {
            addToComponents(Lit165, Lit170, Lit168, lambda$Fn49);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment5 = C1168runtime.addToCurrentFormEnvironment(Lit171, this.exit$Click);
        } else {
            addToFormEnvironment(Lit171, this.exit$Click);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "exit", "Click");
        } else {
            addToEvents(Lit168, Lit79);
        }
        this.ColorsExtractor1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit172, Lit133, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit173, Lit133, Boolean.FALSE);
        }
        this.Dynamic_Card_View1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit174, Lit105, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit175, Lit105, Boolean.FALSE);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment6 = C1168runtime.addToCurrentFormEnvironment(Lit184, this.Dynamic_Card_View1$Click);
        } else {
            addToFormEnvironment(Lit184, this.Dynamic_Card_View1$Click);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "Dynamic_Card_View1", "Click");
        } else {
            addToEvents(Lit105, Lit79);
        }
        this.Color_Utilities1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit185, Lit124, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit186, Lit124, Boolean.FALSE);
        }
        this.Dynamic_Label1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit187, Lit115, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit188, Lit115, Boolean.FALSE);
        }
        this.Web1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit189, Lit179, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit190, Lit179, Boolean.FALSE);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment7 = C1168runtime.addToCurrentFormEnvironment(Lit197, this.Web1$GotText);
        } else {
            addToFormEnvironment(Lit197, this.Web1$GotText);
        }
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) C1168runtime.$Stthis$Mnform$St, "Web1", "GotText");
        } else {
            addToEvents(Lit179, Lit198);
        }
        this.JsonToDictionary1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit199, Lit191, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit200, Lit191, Boolean.FALSE);
        }
        this.Dynamic_Text_Box1 = null;
        if (C1168runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(C1168runtime.addComponentWithinRepl(Lit0, Lit201, Lit202, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit203, Lit202, Boolean.FALSE);
        }
        C1168runtime.initRuntime();
    }

    static IntNum lambda3() {
        return Lit4;
    }

    static Object lambda4() {
        return C1168runtime.callYailPrimitive(C1168runtime.make$Mnyail$Mndictionary, LList.Empty, LList.Empty, "make a dictionary");
    }

    static Object lambda5() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Lit7, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "6063526160367616", Lit10);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "Classifier", Lit10);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit12, Lit13, Lit8);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Lit15, Lit8);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Lit17, Lit8);
        Object andCoerceProperty$Ex7 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit18, Lit19, Lit8);
        Object andCoerceProperty$Ex8 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit20, AlgorithmIdentifiers.NONE, Lit10);
        Object andCoerceProperty$Ex9 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit21, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex10 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit23, Boolean.FALSE, Lit22);
        Object andCoerceProperty$Ex11 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit24, Boolean.FALSE, Lit22);
        Object andCoerceProperty$Ex12 = C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit25, "saving1_s5", Lit10);
        return C1168runtime.setAndCoerceProperty$Ex(Lit0, Lit26, Boolean.FALSE, Lit22);
    }

    static Object lambda6() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit28, Lit12, Lit29, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit28, Lit30, Lit31, Lit8);
    }

    static Object lambda7() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit28, Lit12, Lit29, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit28, Lit30, Lit31, Lit8);
    }

    static Object lambda8() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit35, Lit31, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit30, Lit31, Lit8);
    }

    static Object lambda9() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit35, Lit31, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit34, Lit30, Lit31, Lit8);
    }

    static Object lambda10() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit38, Lit35, Lit39, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit38, Lit30, Lit39, Lit8);
    }

    static Object lambda11() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit38, Lit35, Lit39, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit38, Lit30, Lit39, Lit8);
    }

    static Object lambda12() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit42, Lit43, "Classifier.png", Lit10);
    }

    static Object lambda13() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit42, Lit43, "Classifier.png", Lit10);
    }

    static Object lambda14() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit46, Lit30, Lit31, Lit8);
    }

    static Object lambda15() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit46, Lit30, Lit31, Lit8);
    }

    static Object lambda16() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit49, Lit50, Lit51, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit49, Lit52, Lit53, Lit8);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit49, Lit35, Lit31, Lit8);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit49, Lit54, "Classifier", Lit10);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit49, Lit55, Lit56, Lit8);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit49, Lit57, Lit58, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit49, Lit30, Lit31, Lit8);
    }

    static Object lambda17() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit49, Lit50, Lit51, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit49, Lit52, Lit53, Lit8);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit49, Lit35, Lit31, Lit8);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit49, Lit54, "Classifier", Lit10);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit49, Lit55, Lit56, Lit8);
        Object andCoerceProperty$Ex6 = C1168runtime.setAndCoerceProperty$Ex(Lit49, Lit57, Lit58, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit49, Lit30, Lit31, Lit8);
    }

    static Object lambda18() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit61, Lit12, Lit62, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit61, Lit35, Lit31, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit61, Lit30, Lit31, Lit8);
    }

    static Object lambda19() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit61, Lit12, Lit62, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit61, Lit35, Lit31, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit61, Lit30, Lit31, Lit8);
    }

    static Object lambda20() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit65, Lit66, Lit53, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit65, Lit35, Lit67, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit65, Lit30, Lit31, Lit8);
    }

    static Object lambda21() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit65, Lit66, Lit53, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit65, Lit35, Lit67, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit65, Lit30, Lit31, Lit8);
    }

    static Object lambda22() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit73, Lit12, Lit74, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit73, Lit52, Lit53, Lit8);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit73, Lit75, Lit56, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit73, Lit54, "Go to library", Lit10);
    }

    static Object lambda23() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit73, Lit12, Lit74, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit73, Lit52, Lit53, Lit8);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit73, Lit75, Lit56, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit73, Lit54, "Go to library", Lit10);
    }

    public Object next_pg$Click() {
        C1168runtime.setThisForm();
        return C1168runtime.callYailPrimitive(C1168runtime.open$Mnanother$Mnscreen, LList.list1("Screen6"), Lit77, "open another screen");
    }

    static Object lambda24() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit81, Lit66, Lit82, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit81, Lit30, Lit31, Lit8);
    }

    static Object lambda25() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit81, Lit66, Lit82, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit81, Lit30, Lit31, Lit8);
    }

    static Object lambda26() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit85, Lit43, "1.png", Lit10);
    }

    static Object lambda27() {
        return C1168runtime.setAndCoerceProperty$Ex(Lit85, Lit43, "1.png", Lit10);
    }

    static Object lambda28() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit88, Lit66, Lit82, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit88, Lit89, Lit82, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit88, Lit30, Lit31, Lit8);
    }

    static Object lambda29() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit88, Lit66, Lit82, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit88, Lit89, Lit82, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit88, Lit30, Lit31, Lit8);
    }

    static Object lambda30() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit92, Lit12, Lit93, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit92, Lit50, Lit94, Lit8);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit92, Lit52, Lit53, Lit8);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit92, Lit75, Lit56, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit92, Lit54, "Upload from gallery", Lit10);
    }

    static Object lambda31() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit92, Lit12, Lit93, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit92, Lit50, Lit94, Lit8);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit92, Lit52, Lit53, Lit8);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit92, Lit75, Lit56, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit92, Lit54, "Upload from gallery", Lit10);
    }

    public Object Image_Picker1$AfterPicking(Object $selection) {
        Object obj;
        Object $selection2 = C1168runtime.sanitizeComponentData($selection);
        C1168runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit42;
        SimpleSymbol simpleSymbol2 = Lit43;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        if ($selection2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1168runtime.getDisplayRepresentation(Lit96);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1168runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $selection2;
        }
        return C1168runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, C1168runtime.callYailPrimitive(moduleMethod, LList.list2("file://", obj), Lit97, "join"), Lit10);
    }

    static Object lambda32() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit101, Lit12, Lit102, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit101, Lit50, Lit94, Lit8);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit101, Lit52, Lit53, Lit8);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit101, Lit75, Lit56, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit101, Lit54, "Extract color", Lit10);
    }

    static Object lambda33() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit101, Lit12, Lit102, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit101, Lit50, Lit94, Lit8);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit101, Lit52, Lit53, Lit8);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit101, Lit75, Lit56, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit101, Lit54, "Extract color", Lit10);
    }

    public Object Button1$Click() {
        C1168runtime.setThisForm();
        ModuleMethod moduleMethod = proc$Fn33;
        return C1168runtime.yailForEach(proc$Fn33, C1168runtime.callComponentMethod(Lit133, Lit134, LList.list1(C1168runtime.get$Mnproperty.apply2(Lit42, Lit43)), Lit135));
    }

    public static Object lambda34proc(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object $item = obj;
        Object $name = C1168runtime.callYailPrimitive(C1168runtime.random$Mninteger, LList.list2(Lit56, Lit56), Lit104, "random integer");
        SimpleSymbol simpleSymbol = Lit105;
        SimpleSymbol simpleSymbol2 = Lit106;
        if ($name instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1168runtime.getDisplayRepresentation(Lit107);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj2 = C1168runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj2 = $name;
        }
        Object callComponentMethod = C1168runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list4(obj2, C1168runtime.lookupInCurrentFormEnvironment(Lit28), Lit108, Lit108), Lit109);
        SimpleSymbol simpleSymbol3 = Lit105;
        SimpleSymbol simpleSymbol4 = Lit110;
        if ($name instanceof Package) {
            Object[] objArr4 = new Object[3];
            objArr4[0] = "The variable ";
            Object[] objArr5 = objArr4;
            objArr5[1] = C1168runtime.getDisplayRepresentation(Lit107);
            Object[] objArr6 = objArr5;
            objArr6[2] = " is not bound in the current context";
            obj3 = C1168runtime.signalRuntimeError(strings.stringAppend(objArr6), "Unbound Variable");
        } else {
            obj3 = $name;
        }
        if ($item instanceof Package) {
            Object[] objArr7 = new Object[3];
            objArr7[0] = "The variable ";
            Object[] objArr8 = objArr7;
            objArr8[1] = C1168runtime.getDisplayRepresentation(Lit111);
            Object[] objArr9 = objArr8;
            objArr9[2] = " is not bound in the current context";
            obj4 = C1168runtime.signalRuntimeError(strings.stringAppend(objArr9), "Unbound Variable");
        } else {
            obj4 = $item;
        }
        Object callComponentMethod2 = C1168runtime.callComponentMethod(simpleSymbol3, simpleSymbol4, LList.list2(obj3, obj4), Lit112);
        SimpleSymbol simpleSymbol5 = Lit105;
        SimpleSymbol simpleSymbol6 = Lit113;
        if ($name instanceof Package) {
            Object[] objArr10 = new Object[3];
            objArr10[0] = "The variable ";
            Object[] objArr11 = objArr10;
            objArr11[1] = C1168runtime.getDisplayRepresentation(Lit107);
            Object[] objArr12 = objArr11;
            objArr12[2] = " is not bound in the current context";
            obj5 = C1168runtime.signalRuntimeError(strings.stringAppend(objArr12), "Unbound Variable");
        } else {
            obj5 = $name;
        }
        Object callComponentMethod3 = C1168runtime.callComponentMethod(simpleSymbol5, simpleSymbol6, LList.list2(obj5, C1168runtime.get$Mnproperty.apply2(Lit0, Lit30)), Lit114);
        SimpleSymbol simpleSymbol7 = Lit115;
        SimpleSymbol simpleSymbol8 = Lit116;
        if ($name instanceof Package) {
            Object[] objArr13 = new Object[3];
            objArr13[0] = "The variable ";
            Object[] objArr14 = objArr13;
            objArr14[1] = C1168runtime.getDisplayRepresentation(Lit107);
            Object[] objArr15 = objArr14;
            objArr15[2] = " is not bound in the current context";
            obj6 = C1168runtime.signalRuntimeError(strings.stringAppend(objArr15), "Unbound Variable");
        } else {
            obj6 = $name;
        }
        SimpleSymbol simpleSymbol9 = Lit105;
        SimpleSymbol simpleSymbol10 = Lit117;
        if ($name instanceof Package) {
            Object[] objArr16 = new Object[3];
            objArr16[0] = "The variable ";
            Object[] objArr17 = objArr16;
            objArr17[1] = C1168runtime.getDisplayRepresentation(Lit107);
            Object[] objArr18 = objArr17;
            objArr18[2] = " is not bound in the current context";
            obj7 = C1168runtime.signalRuntimeError(strings.stringAppend(objArr18), "Unbound Variable");
        } else {
            obj7 = $name;
        }
        Object callComponentMethod4 = C1168runtime.callComponentMethod(simpleSymbol7, simpleSymbol8, LList.list2(obj6, C1168runtime.callComponentMethod(simpleSymbol9, simpleSymbol10, LList.list1(obj7), Lit118)), Lit119);
        SimpleSymbol simpleSymbol11 = Lit115;
        SimpleSymbol simpleSymbol12 = Lit120;
        if ($name instanceof Package) {
            Object[] objArr19 = new Object[3];
            objArr19[0] = "The variable ";
            Object[] objArr20 = objArr19;
            objArr20[1] = C1168runtime.getDisplayRepresentation(Lit107);
            Object[] objArr21 = objArr20;
            objArr21[2] = " is not bound in the current context";
            obj8 = C1168runtime.signalRuntimeError(strings.stringAppend(objArr21), "Unbound Variable");
        } else {
            obj8 = $name;
        }
        Object callComponentMethod5 = C1168runtime.callComponentMethod(simpleSymbol11, simpleSymbol12, LList.list2(obj8, Lit121), Lit122);
        SimpleSymbol simpleSymbol13 = Lit115;
        SimpleSymbol simpleSymbol14 = Lit123;
        if ($name instanceof Package) {
            Object[] objArr22 = new Object[3];
            objArr22[0] = "The variable ";
            Object[] objArr23 = objArr22;
            objArr23[1] = C1168runtime.getDisplayRepresentation(Lit107);
            Object[] objArr24 = objArr23;
            objArr24[2] = " is not bound in the current context";
            obj9 = C1168runtime.signalRuntimeError(strings.stringAppend(objArr24), "Unbound Variable");
        } else {
            obj9 = $name;
        }
        ModuleMethod moduleMethod = strings.string$Mnappend;
        ModuleMethod moduleMethod2 = C1168runtime.string$Mnsubstring;
        SimpleSymbol simpleSymbol15 = Lit124;
        SimpleSymbol simpleSymbol16 = Lit125;
        if ($item instanceof Package) {
            Object[] objArr25 = new Object[3];
            objArr25[0] = "The variable ";
            Object[] objArr26 = objArr25;
            objArr26[1] = C1168runtime.getDisplayRepresentation(Lit111);
            Object[] objArr27 = objArr26;
            objArr27[2] = " is not bound in the current context";
            obj10 = C1168runtime.signalRuntimeError(strings.stringAppend(objArr27), "Unbound Variable");
        } else {
            obj10 = $item;
        }
        Object callComponentMethod6 = C1168runtime.callComponentMethod(simpleSymbol15, simpleSymbol16, LList.list1(obj10), Lit126);
        IntNum intNum = Lit82;
        AddOp addOp = AddOp.$Mn;
        ModuleMethod moduleMethod3 = strings.string$Mnlength;
        SimpleSymbol simpleSymbol17 = Lit124;
        SimpleSymbol simpleSymbol18 = Lit125;
        if ($item instanceof Package) {
            Object[] objArr28 = new Object[3];
            objArr28[0] = "The variable ";
            Object[] objArr29 = objArr28;
            objArr29[1] = C1168runtime.getDisplayRepresentation(Lit111);
            Object[] objArr30 = objArr29;
            objArr30[2] = " is not bound in the current context";
            obj11 = C1168runtime.signalRuntimeError(strings.stringAppend(objArr30), "Unbound Variable");
        } else {
            obj11 = $item;
        }
        return C1168runtime.callComponentMethod(simpleSymbol13, simpleSymbol14, LList.list3(obj9, C1168runtime.callYailPrimitive(moduleMethod, LList.list2("#", C1168runtime.callYailPrimitive(moduleMethod2, LList.list3(callComponentMethod6, intNum, C1168runtime.callYailPrimitive(addOp, LList.list2(C1168runtime.callYailPrimitive(moduleMethod3, LList.list1(C1168runtime.callComponentMethod(simpleSymbol17, simpleSymbol18, LList.list1(obj11), Lit127)), Lit128, "length"), Lit53), Lit129, "-")), Lit130, "segment")), Lit131, "join"), Boolean.FALSE), Lit132);
    }

    static Object lambda35() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit138, Lit35, Lit139, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit138, Lit30, Lit31, Lit8);
    }

    static Object lambda36() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit138, Lit35, Lit139, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit138, Lit30, Lit31, Lit8);
    }

    static Object lambda37() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit142, Lit143, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit142, Lit50, Lit144, Lit8);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit142, Lit52, Lit53, Lit8);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit142, Lit55, Lit56, Lit8);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit142, Lit57, Lit145, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit142, Lit30, Lit31, Lit8);
    }

    static Object lambda38() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit142, Lit143, Boolean.TRUE, Lit22);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit142, Lit50, Lit144, Lit8);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit142, Lit52, Lit53, Lit8);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit142, Lit55, Lit56, Lit8);
        Object andCoerceProperty$Ex5 = C1168runtime.setAndCoerceProperty$Ex(Lit142, Lit57, Lit145, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit142, Lit30, Lit31, Lit8);
    }

    static Object lambda39() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit148, Lit35, Lit139, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit148, Lit30, Lit31, Lit8);
    }

    static Object lambda40() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit148, Lit35, Lit139, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit148, Lit30, Lit31, Lit8);
    }

    static Object lambda41() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit151, Lit12, Lit152, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit151, Lit35, Lit108, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit151, Lit30, Lit31, Lit8);
    }

    static Object lambda42() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit151, Lit12, Lit152, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit151, Lit35, Lit108, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit151, Lit30, Lit31, Lit8);
    }

    static Object lambda43() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit155, Lit66, Lit82, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit155, Lit89, Lit82, Lit8);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit155, Lit12, Lit156, Lit8);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit155, Lit35, Lit31, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit155, Lit30, Lit31, Lit8);
    }

    static Object lambda44() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit155, Lit66, Lit82, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit155, Lit89, Lit82, Lit8);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit155, Lit12, Lit156, Lit8);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit155, Lit35, Lit31, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit155, Lit30, Lit31, Lit8);
    }

    static Object lambda45() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit159, Lit12, Lit160, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit159, Lit50, Lit94, Lit8);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit159, Lit52, Lit53, Lit8);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit159, Lit75, Lit56, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit159, Lit54, "Color Analysis", Lit10);
    }

    static Object lambda46() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit159, Lit12, Lit160, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit159, Lit50, Lit94, Lit8);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit159, Lit52, Lit53, Lit8);
        Object andCoerceProperty$Ex4 = C1168runtime.setAndCoerceProperty$Ex(Lit159, Lit75, Lit56, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit159, Lit54, "Color Analysis", Lit10);
    }

    public Object color_analysis$Click() {
        C1168runtime.setThisForm();
        return C1168runtime.callYailPrimitive(C1168runtime.open$Mnanother$Mnscreen, LList.list1("Screen16"), Lit162, "open another screen");
    }

    static Object lambda47() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit165, Lit89, Lit53, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit165, Lit30, Lit31, Lit8);
    }

    static Object lambda48() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit165, Lit89, Lit53, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit165, Lit30, Lit31, Lit8);
    }

    static Object lambda49() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit168, Lit12, Lit169, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit168, Lit52, Lit53, Lit8);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit168, Lit75, Lit56, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit168, Lit54, "EXIT", Lit10);
    }

    static Object lambda50() {
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(Lit168, Lit12, Lit169, Lit8);
        Object andCoerceProperty$Ex2 = C1168runtime.setAndCoerceProperty$Ex(Lit168, Lit52, Lit53, Lit8);
        Object andCoerceProperty$Ex3 = C1168runtime.setAndCoerceProperty$Ex(Lit168, Lit75, Lit56, Lit8);
        return C1168runtime.setAndCoerceProperty$Ex(Lit168, Lit54, "EXIT", Lit10);
    }

    public Object exit$Click() {
        C1168runtime.setThisForm();
        return C1168runtime.callYailPrimitive(C1168runtime.close$Mnapplication, LList.Empty, LList.Empty, "close application");
    }

    public Object Dynamic_Card_View1$Click(Object $id) {
        Object obj;
        Object obj2;
        Object obj3;
        Object $id2 = C1168runtime.sanitizeComponentData($id);
        C1168runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit3;
        if ($id2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1168runtime.getDisplayRepresentation(Lit176);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1168runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $id2;
        }
        Object addGlobalVarToCurrentFormEnvironment = C1168runtime.addGlobalVarToCurrentFormEnvironment(simpleSymbol, obj);
        SimpleSymbol simpleSymbol2 = Lit115;
        SimpleSymbol simpleSymbol3 = Lit177;
        if ($id2 instanceof Package) {
            Object[] objArr4 = new Object[3];
            objArr4[0] = "The variable ";
            Object[] objArr5 = objArr4;
            objArr5[1] = C1168runtime.getDisplayRepresentation(Lit176);
            Object[] objArr6 = objArr5;
            objArr6[2] = " is not bound in the current context";
            obj2 = C1168runtime.signalRuntimeError(strings.stringAppend(objArr6), "Unbound Variable");
        } else {
            obj2 = $id2;
        }
        Object $name = C1168runtime.callComponentMethod(simpleSymbol2, simpleSymbol3, LList.list1(obj2), Lit178);
        SimpleSymbol simpleSymbol4 = Lit179;
        SimpleSymbol simpleSymbol5 = Lit180;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        ModuleMethod moduleMethod2 = C1168runtime.string$Mnreplace$Mnall;
        if ($name instanceof Package) {
            Object[] objArr7 = new Object[3];
            objArr7[0] = "The variable ";
            Object[] objArr8 = objArr7;
            objArr8[1] = C1168runtime.getDisplayRepresentation(Lit107);
            Object[] objArr9 = objArr8;
            objArr9[2] = " is not bound in the current context";
            obj3 = C1168runtime.signalRuntimeError(strings.stringAppend(objArr9), "Unbound Variable");
        } else {
            obj3 = $name;
        }
        Object andCoerceProperty$Ex = C1168runtime.setAndCoerceProperty$Ex(simpleSymbol4, simpleSymbol5, C1168runtime.callYailPrimitive(moduleMethod, LList.list3("https://www.thecolorapi.com/id?hex=", C1168runtime.callYailPrimitive(moduleMethod2, LList.list3(obj3, "#", ""), Lit181, "replace all"), "&format=json"), Lit182, "join"), Lit10);
        return C1168runtime.callComponentMethod(Lit179, Lit183, LList.Empty, LList.Empty);
    }

    /* renamed from: io.kodular.kajalnikunj1024.Classifier.saving1_s5$frame */
    /* compiled from: saving1_s5.yail */
    public class frame extends ModuleBody {
        saving1_s5 $main;

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
                    if (!(obj7 instanceof saving1_s5)) {
                        return -786431;
                    }
                    callContext5.value1 = obj8;
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 1;
                    return 0;
                case 49:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 1;
                    return 0;
                case 52:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 1;
                    return 0;
                case 72:
                    callContext2.value1 = obj2;
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
                    if (!(obj9 instanceof saving1_s5)) {
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
                    if (!(obj17 instanceof saving1_s5)) {
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
                case 73:
                    callContext2.value1 = obj5;
                    callContext2.value2 = obj6;
                    callContext2.value3 = obj7;
                    callContext2.value4 = obj8;
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
                case 49:
                    return this.$main.Image_Picker1$AfterPicking(obj2);
                case 52:
                    return saving1_s5.lambda34proc(obj2);
                case 72:
                    return this.$main.Dynamic_Card_View1$Click(obj2);
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
                case 73:
                    return this.$main.Web1$GotText(obj5, obj6, obj7, obj8);
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
                    return saving1_s5.lambda2();
                case 18:
                    this.$main.$define();
                    return Values.empty;
                case 19:
                    return saving1_s5.lambda3();
                case 20:
                    return saving1_s5.lambda4();
                case 21:
                    return saving1_s5.lambda5();
                case 22:
                    return saving1_s5.lambda6();
                case 23:
                    return saving1_s5.lambda7();
                case 24:
                    return saving1_s5.lambda8();
                case 25:
                    return saving1_s5.lambda9();
                case 26:
                    return saving1_s5.lambda10();
                case 27:
                    return saving1_s5.lambda11();
                case 28:
                    return saving1_s5.lambda12();
                case 29:
                    return saving1_s5.lambda13();
                case 30:
                    return saving1_s5.lambda14();
                case 31:
                    return saving1_s5.lambda15();
                case 32:
                    return saving1_s5.lambda16();
                case 33:
                    return saving1_s5.lambda17();
                case 34:
                    return saving1_s5.lambda18();
                case 35:
                    return saving1_s5.lambda19();
                case 36:
                    return saving1_s5.lambda20();
                case 37:
                    return saving1_s5.lambda21();
                case 38:
                    return saving1_s5.lambda22();
                case 39:
                    return saving1_s5.lambda23();
                case 40:
                    return this.$main.next_pg$Click();
                case 41:
                    return saving1_s5.lambda24();
                case 42:
                    return saving1_s5.lambda25();
                case 43:
                    return saving1_s5.lambda26();
                case 44:
                    return saving1_s5.lambda27();
                case 45:
                    return saving1_s5.lambda28();
                case 46:
                    return saving1_s5.lambda29();
                case 47:
                    return saving1_s5.lambda30();
                case 48:
                    return saving1_s5.lambda31();
                case 50:
                    return saving1_s5.lambda32();
                case 51:
                    return saving1_s5.lambda33();
                case 53:
                    return this.$main.Button1$Click();
                case 54:
                    return saving1_s5.lambda35();
                case 55:
                    return saving1_s5.lambda36();
                case 56:
                    return saving1_s5.lambda37();
                case 57:
                    return saving1_s5.lambda38();
                case 58:
                    return saving1_s5.lambda39();
                case 59:
                    return saving1_s5.lambda40();
                case 60:
                    return saving1_s5.lambda41();
                case 61:
                    return saving1_s5.lambda42();
                case 62:
                    return saving1_s5.lambda43();
                case 63:
                    return saving1_s5.lambda44();
                case 64:
                    return saving1_s5.lambda45();
                case 65:
                    return saving1_s5.lambda46();
                case 66:
                    return this.$main.color_analysis$Click();
                case 67:
                    return saving1_s5.lambda47();
                case 68:
                    return saving1_s5.lambda48();
                case 69:
                    return saving1_s5.lambda49();
                case 70:
                    return saving1_s5.lambda50();
                case 71:
                    return this.$main.exit$Click();
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
                case 50:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                case 51:
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
                case 71:
                    callContext2.proc = moduleMethod2;
                    callContext2.f243pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod2, callContext2);
            }
        }
    }

    public Object Web1$GotText(Object $url, Object $responseCode, Object $responseType, Object $responseContent) {
        Object obj;
        Object sanitizeComponentData = C1168runtime.sanitizeComponentData($url);
        Object sanitizeComponentData2 = C1168runtime.sanitizeComponentData($responseCode);
        Object sanitizeComponentData3 = C1168runtime.sanitizeComponentData($responseType);
        Object $responseContent2 = C1168runtime.sanitizeComponentData($responseContent);
        C1168runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit5;
        SimpleSymbol simpleSymbol2 = Lit191;
        SimpleSymbol simpleSymbol3 = Lit192;
        if ($responseContent2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = C1168runtime.getDisplayRepresentation(Lit193);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = C1168runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $responseContent2;
        }
        Object addGlobalVarToCurrentFormEnvironment = C1168runtime.addGlobalVarToCurrentFormEnvironment(simpleSymbol, C1168runtime.callComponentMethod(simpleSymbol2, simpleSymbol3, LList.list1(obj), Lit194));
        return C1168runtime.setAndCoerceProperty$Ex(Lit142, Lit54, C1168runtime.callYailPrimitive(C1168runtime.yail$Mndictionary$Mnlookup, LList.list3(CommonProperties.VALUE, C1168runtime.callYailPrimitive(C1168runtime.yail$Mndictionary$Mnlookup, LList.list3(CommonProperties.NAME, C1168runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, C1168runtime.$Stthe$Mnnull$Mnvalue$St), "not found"), Lit195, "dictionary lookup"), "not found"), Lit196, "dictionary lookup"), Lit10);
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
        saving1_s5 = this;
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
