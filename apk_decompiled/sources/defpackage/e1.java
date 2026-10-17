package defpackage;

import android.os.Build;
import androidx.compose.foundation.text.AutofillHighlightKt;
import androidx.compose.foundation.text.BasicText_androidKt;
import androidx.compose.material3.AppBarDslKt;
import androidx.compose.material3.AppBarOverflowStateImpl;
import androidx.compose.material3.BasicAlertDialogOverride;
import androidx.compose.material3.BottomAppBarDefaults;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.DateInputKt;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DefaultBasicAlertDialogOverride;
import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.SingleRowTopAppBarOverride;
import androidx.compose.material3.TwoRowsTopAppBarOverride;
import androidx.compose.runtime.ComputedProvidableCompositionLocal;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.tooling.CompositionErrorContext;
import androidx.compose.runtime.tooling.CompositionErrorContextKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.spatial.RectListKt;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements iy {
    public final /* synthetic */ int d;

    public /* synthetic */ e1(int i) {
        this.d = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r1.equals("xse_panther") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return defpackage.rh0.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0070, code lost:
    
        if (r1.equals("panther") == false) goto L48;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // defpackage.iy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        w01 w01Var;
        BasicAlertDialogOverride basicAlertDialogOverride;
        AppBarOverflowStateImpl rememberAppBarOverflowState$lambda$1$lambda$0;
        SingleRowTopAppBarOverride singleRowTopAppBarOverride;
        TwoRowsTopAppBarOverride twoRowsTopAppBarOverride;
        Brush LocalAutofillHighlightBrush$lambda$0;
        UUID randomUUID;
        Executor LocalBackgroundTextMeasurementExecutor$lambda$0;
        boolean exitAlwaysScrollBehavior$lambda$1$lambda$0;
        ColorScheme LocalColorScheme$lambda$1;
        boolean LocalTonalElevationEnabled$lambda$2;
        CompositionErrorContext LocalCompositionErrorContext$lambda$0;
        Object _init_$lambda$0;
        w01 w01Var2;
        MutableState DateInputTextField_xJ3Ic0Y$lambda$5$lambda$4;
        MutableState DatePickerContent$lambda$25$lambda$24;
        float SingleRowTopAppBar$lambda$15$lambda$14$lambda$13;
        w01 w01Var3;
        w01 w01Var4;
        w01 w01Var5;
        w01 w01Var6;
        w01 w01Var7;
        w01 w01Var8;
        w01 w01Var9;
        w01 w01Var10;
        int i = this.d;
        w01 w01Var11 = w01.a;
        switch (i) {
            case 0:
                w01Var = w01.a;
                return w01Var;
            case 1:
                basicAlertDialogOverride = DefaultBasicAlertDialogOverride.INSTANCE;
                return basicAlertDialogOverride;
            case 2:
                rememberAppBarOverflowState$lambda$1$lambda$0 = AppBarDslKt.rememberAppBarOverflowState$lambda$1$lambda$0();
                return rememberAppBarOverflowState$lambda$1$lambda$0;
            case 3:
                singleRowTopAppBarOverride = DefaultSingleRowTopAppBarOverride.INSTANCE;
                return singleRowTopAppBarOverride;
            case 4:
                twoRowsTopAppBarOverride = DefaultTwoRowsTopAppBarOverride.INSTANCE;
                return twoRowsTopAppBarOverride;
            case 5:
                return w01Var11;
            case 6:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            case 7:
                LocalAutofillHighlightBrush$lambda$0 = AutofillHighlightKt.LocalAutofillHighlightBrush$lambda$0();
                return LocalAutofillHighlightBrush$lambda$0;
            case 8:
                randomUUID = UUID.randomUUID();
                return randomUUID;
            case 9:
                LocalBackgroundTextMeasurementExecutor$lambda$0 = BasicText_androidKt.LocalBackgroundTextMeasurementExecutor$lambda$0();
                return LocalBackgroundTextMeasurementExecutor$lambda$0;
            case 10:
                exitAlwaysScrollBehavior$lambda$1$lambda$0 = BottomAppBarDefaults.exitAlwaysScrollBehavior$lambda$1$lambda$0();
                return Boolean.valueOf(exitAlwaysScrollBehavior$lambda$1$lambda$0);
            case 11:
                LocalColorScheme$lambda$1 = ColorSchemeKt.LocalColorScheme$lambda$1();
                return LocalColorScheme$lambda$1;
            case Matrix.TranslateX /* 12 */:
                LocalTonalElevationEnabled$lambda$2 = ColorSchemeKt.LocalTonalElevationEnabled$lambda$2();
                return Boolean.valueOf(LocalTonalElevationEnabled$lambda$2);
            case Matrix.TranslateY /* 13 */:
                zj0 zj0Var = zj0.a;
                zj0.a("svc power reboot");
                return w01Var11;
            case Matrix.TranslateZ /* 14 */:
                return w01Var11;
            case 15:
                LocalCompositionErrorContext$lambda$0 = CompositionErrorContextKt.LocalCompositionErrorContext$lambda$0();
                return LocalCompositionErrorContext$lambda$0;
            case 16:
                _init_$lambda$0 = ComputedProvidableCompositionLocal._init_$lambda$0();
                return _init_$lambda$0;
            case 17:
                w01Var2 = w01.a;
                return w01Var2;
            case 18:
                DateInputTextField_xJ3Ic0Y$lambda$5$lambda$4 = DateInputKt.DateInputTextField_xJ3Ic0Y$lambda$5$lambda$4();
                return DateInputTextField_xJ3Ic0Y$lambda$5$lambda$4;
            case 19:
                DatePickerContent$lambda$25$lambda$24 = DatePickerKt.DatePickerContent$lambda$25$lambda$24();
                return DatePickerContent$lambda$25$lambda$24;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                SingleRowTopAppBar$lambda$15$lambda$14$lambda$13 = DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$15$lambda$14$lambda$13();
                return Float.valueOf(SingleRowTopAppBar$lambda$15$lambda$14$lambda$13);
            case 21:
                String str = Build.PRODUCT;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1291874439:
                            if (str.equals("eureka")) {
                                return rh0.g;
                            }
                            break;
                        case -796628930:
                            break;
                        case 875062001:
                            if (str.equals("seacliff")) {
                                return rh0.f;
                            }
                            break;
                        case 1455215167:
                            if (str.equals("hollywood")) {
                                return rh0.e;
                            }
                            break;
                        case 1551834924:
                            if (str.equals("vr_monterey")) {
                                return rh0.d;
                            }
                            break;
                        case 1682273737:
                            break;
                    }
                }
                return rh0.i;
            case 22:
                w01Var3 = w01.a;
                return w01Var3;
            case 23:
                w01Var4 = w01.a;
                return w01Var4;
            case 24:
                w01Var5 = w01.a;
                return w01Var5;
            case RectListKt.BitOffsetForParentId /* 25 */:
                w01Var6 = w01.a;
                return w01Var6;
            case 26:
                w01Var7 = w01.a;
                return w01Var7;
            case 27:
                w01Var8 = w01.a;
                return w01Var8;
            case 28:
                w01Var9 = w01.a;
                return w01Var9;
            default:
                w01Var10 = w01.a;
                return w01Var10;
        }
    }
}
