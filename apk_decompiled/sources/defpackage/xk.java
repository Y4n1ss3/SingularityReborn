package defpackage;

import android.os.Build;
import androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt;
import androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.LinkOffKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.composer.gapbuffer.changelist.Operation;
import androidx.compose.runtime.composer.linkbuffer.SlotTableEditor;
import androidx.compose.runtime.composer.linkbuffer.changelist.Operation;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class xk implements ny {
    public final /* synthetic */ int d;

    public /* synthetic */ xk(cq0 cq0Var) {
        this.d = 27;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w01 lambda_759698998$lambda$0;
        w01 lambda_486633673$lambda$0;
        w01 lambda_444370233$lambda$0;
        w01 lambda__665310900$lambda$0;
        w01 lambda__1455401925$lambda$0;
        w01 lambda_559628295$lambda$0;
        w01 detectDragGestures$lambda$6;
        w01 _init_$lambda$0;
        w01 _init_$lambda$02;
        int i = this.d;
        w01 w01Var = w01.a;
        switch (i) {
            case 0:
                lambda_759698998$lambda$0 = ComposableSingletons$BasicTextFieldKt.lambda_759698998$lambda$0((my) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return lambda_759698998$lambda$0;
            case 1:
                lambda_486633673$lambda$0 = ComposableSingletons$BasicTextFieldKt.lambda_486633673$lambda$0((my) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return lambda_486633673$lambda$0;
            case 2:
                lambda_444370233$lambda$0 = ComposableSingletons$BasicTextFieldKt.lambda_444370233$lambda$0((my) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return lambda_444370233$lambda$0;
            case 3:
                lambda__665310900$lambda$0 = ComposableSingletons$BasicTextFieldKt.lambda__665310900$lambda$0((my) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return lambda__665310900$lambda$0;
            case 4:
                lambda__1455401925$lambda$0 = ComposableSingletons$ContextMenuUiKt.lambda__1455401925$lambda$0((ContextMenuColors) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return lambda__1455401925$lambda$0;
            case 5:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1270596411, intValue, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$ControllerInfoActivityKt.lambda$1270596411.<anonymous> (ControllerInfoActivity.kt:329)");
                    }
                    ImageVector linkOff = LinkOffKt.getLinkOff(Icons.INSTANCE.getDefault());
                    Modifier.Companion companion = Modifier.Companion;
                    IconKt.m2055Iconww6aTOc(linkOff, (String) null, SizeKt.m807size3ABfNKs(companion, Dp.m7611constructorimpl(16.0f)), 0L, composer, 432, 8);
                    SpacerKt.Spacer(SizeKt.m812width3ABfNKs(companion, Dp.m7611constructorimpl(6.0f)), composer, 6);
                    TextKt.m2607TextNvy7gAk("Unpair", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return w01Var;
            case 6:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1054651308, intValue2, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$ControllerInfoActivityKt.lambda$-1054651308.<anonymous> (ControllerInfoActivity.kt:365)");
                    }
                    TextKt.m2607TextNvy7gAk("Scan & Pair", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return w01Var;
            case 7:
                lambda_559628295$lambda$0 = ComposableSingletons$CoreTextFieldKt.lambda_559628295$lambda$0((my) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return lambda_559628295$lambda$0;
            case 8:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer3.shouldExecute((intValue3 & 17) != 16, intValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-759531904, intValue3, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$DomainBlockerActivityKt.lambda$-759531904.<anonymous> (DomainBlockerActivity.kt:334)");
                    }
                    TextKt.m2607TextNvy7gAk("Add", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return w01Var;
            case 9:
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer4.shouldExecute((intValue4 & 17) != 16, intValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1312808136, intValue4, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$LedColorActivityKt.lambda$-1312808136.<anonymous> (LedColorActivity.kt:141)");
                    }
                    TextKt.m2607TextNvy7gAk("Set Color", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return w01Var;
            case 10:
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer5.shouldExecute((intValue5 & 17) != 16, intValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(158223105, intValue5, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$MainActivityKt.lambda$158223105.<anonymous> (MainActivity.kt:2481)");
                    }
                    TextKt.m2607TextNvy7gAk("Install", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer5, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return w01Var;
            case 11:
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer6.shouldExecute((intValue6 & 17) != 16, intValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1526994182, intValue6, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$MainActivityKt.lambda$-1526994182.<anonymous> (MainActivity.kt:2563)");
                    }
                    TextKt.m2607TextNvy7gAk("Close", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer6, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return w01Var;
            case Matrix.TranslateX /* 12 */:
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer7.shouldExecute((intValue7 & 17) != 16, intValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2074171752, intValue7, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$MainActivityKt.lambda$2074171752.<anonymous> (MainActivity.kt:2545)");
                    }
                    TextKt.m2607TextNvy7gAk("Check for Updates", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer7, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return w01Var;
            case Matrix.TranslateY /* 13 */:
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer8.shouldExecute((intValue8 & 17) != 16, intValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2074237901, intValue8, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$TweaksActivityKt.lambda$2074237901.<anonymous> (TweaksActivity.kt:2652)");
                    }
                    TextKt.m2607TextNvy7gAk("Apply", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer8, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return w01Var;
            case Matrix.TranslateZ /* 14 */:
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer9.shouldExecute((intValue9 & 17) != 16, intValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1062884067, intValue9, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$TweaksActivityKt.lambda$-1062884067.<anonymous> (TweaksActivity.kt:2678)");
                    }
                    TextKt.m2607TextNvy7gAk("user", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer9, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return w01Var;
            case 15:
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer10.shouldExecute((intValue10 & 17) != 16, intValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-552924780, intValue10, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$TweaksActivityKt.lambda$-552924780.<anonymous> (TweaksActivity.kt:2685)");
                    }
                    TextKt.m2607TextNvy7gAk("userdebug", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer10, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return w01Var;
            case 16:
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer11.shouldExecute((intValue11 & 17) != 16, intValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-259311467, intValue11, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$TweaksActivityKt.lambda$-259311467.<anonymous> (TweaksActivity.kt:2692)");
                    }
                    TextKt.m2607TextNvy7gAk("eng", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer11, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return w01Var;
            case 17:
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer12.shouldExecute((intValue12 & 17) != 16, intValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-410228897, intValue12, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$TweaksActivityKt.lambda$-410228897.<anonymous> (TweaksActivity.kt:2733)");
                    }
                    TextKt.m2607TextNvy7gAk("Apply", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer12, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return w01Var;
            case 18:
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer13.shouldExecute((intValue13 & 17) != 16, intValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(509836680, intValue13, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$TweaksActivityKt.lambda$509836680.<anonymous> (TweaksActivity.kt:2786)");
                    }
                    TextKt.m2607TextNvy7gAk("Apply", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer13, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return w01Var;
            case 19:
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer14.shouldExecute((intValue14 & 17) != 16, intValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(288669633, intValue14, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$TweaksActivityKt.lambda$288669633.<anonymous> (TweaksActivity.kt:3025)");
                    }
                    TextKt.m2607TextNvy7gAk("Reboot", null, 0L, null, TextUnitKt.getSp(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer14, 24582, 0, 262126);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return w01Var;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer15.shouldExecute((intValue15 & 17) != 16, intValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-502870010, intValue15, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$TweaksActivityKt.lambda$-502870010.<anonymous> (TweaksActivity.kt:3183)");
                    }
                    TextKt.m2607TextNvy7gAk("Apply", null, 0L, null, TextUnitKt.getSp(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer15, 24582, 0, 262126);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return w01Var;
            case 21:
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer16.shouldExecute((intValue16 & 17) != 16, intValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(409648749, intValue16, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$TweaksActivityKt.lambda$409648749.<anonymous> (TweaksActivity.kt:3259)");
                    }
                    TextKt.m2607TextNvy7gAk("Launch", null, 0L, null, TextUnitKt.getSp(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer16, 24582, 0, 262126);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return w01Var;
            case 22:
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer17.shouldExecute((intValue17 & 17) != 16, intValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1274878713, intValue17, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$TweaksActivityKt.lambda$1274878713.<anonymous> (TweaksActivity.kt:3358)");
                    }
                    TextKt.m2607TextNvy7gAk("Launch", null, 0L, null, TextUnitKt.getSp(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer17, 24582, 0, 262126);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                return w01Var;
            case 23:
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer18.shouldExecute((intValue18 & 17) != 16, intValue18 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1909429560, intValue18, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$TweaksActivityKt.lambda$1909429560.<anonymous> (TweaksActivity.kt:1803)");
                    }
                    TextKt.m2607TextNvy7gAk("Backup", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer18, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer18.skipToGroupEnd();
                }
                return w01Var;
            case 24:
                Composer composer19 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer19.shouldExecute((intValue19 & 17) != 16, intValue19 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(885809129, intValue19, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$TweaksActivityKt.lambda$885809129.<anonymous> (TweaksActivity.kt:1991)");
                    }
                    TextKt.m2607TextNvy7gAk("Setup Blocker", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer19, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer19.skipToGroupEnd();
                }
                return w01Var;
            case RectListKt.BitOffsetForParentId /* 25 */:
                Composer composer20 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer20.shouldExecute((intValue20 & 17) != 16, intValue20 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2095165098, intValue20, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$TweaksActivityKt.lambda$-2095165098.<anonymous> (TweaksActivity.kt:2004)");
                    }
                    TextKt.m2607TextNvy7gAk("Config", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer20, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer20.skipToGroupEnd();
                }
                return w01Var;
            case 26:
                detectDragGestures$lambda$6 = DragGestureDetectorKt.detectDragGestures$lambda$6((PointerInputChange) obj, (PointerInputChange) obj2, (Offset) obj3);
                return detectDragGestures$lambda$6;
            case 27:
                Composer composer21 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer21.shouldExecute((intValue21 & 17) != 16, intValue21 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-300319879, intValue21, -1, "com.lumi.singularity.ui.activities.SingularityApp.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:1645)");
                    }
                    Modifier m762padding3ABfNKs = PaddingKt.m762padding3ABfNKs(Modifier.Companion, Dp.m7611constructorimpl(16.0f));
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer21, 0);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer21, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer21.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer21, m762padding3ABfNKs);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    iy constructor = companion2.getConstructor();
                    if (composer21.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer21.startReusableNode();
                    if (composer21.getInserting()) {
                        composer21.createNode(constructor);
                    } else {
                        composer21.useNode();
                    }
                    Composer m3878constructorimpl = Updater.m3878constructorimpl(composer21);
                    uo.h(companion2, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion2, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i2 = MaterialTheme.$stable;
                    TextStyle bodyLarge = materialTheme.getTypography(composer21, i2).getBodyLarge();
                    FontWeight.Companion companion3 = FontWeight.Companion;
                    TextKt.m2607TextNvy7gAk("⚠️ Exploit not supported on this device", null, materialTheme.getColorScheme(composer21, i2).m1755getOnErrorContainer0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7073copyp1EtxEg$default(bodyLarge, 0L, 0L, companion3.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer21, 6, 0, 131066);
                    TextKt.m2607TextNvy7gAk("The exploit will NOT work on this firmware version", null, materialTheme.getColorScheme(composer21, i2).m1755getOnErrorContainer0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7073copyp1EtxEg$default(materialTheme.getTypography(composer21, i2).getBodyMedium(), 0L, 0L, companion3.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer21, 6, 0, 131066);
                    String str = Build.VERSION.INCREMENTAL;
                    str.getClass();
                    TextKt.m2607TextNvy7gAk("Firmware: " + Long.parseLong(str), null, materialTheme.getColorScheme(composer21, i2).m1755getOnErrorContainer0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7073copyp1EtxEg$default(materialTheme.getTypography(composer21, i2).getBodySmall(), 0L, 0L, companion3.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer21, 0, 0, 131066);
                    composer21.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer21.skipToGroupEnd();
                }
                return w01Var;
            case 28:
                _init_$lambda$0 = Operation.TestOperation._init_$lambda$0((Applier) obj, (SlotTableEditor) obj2, (RememberManager) obj3);
                return _init_$lambda$0;
            default:
                _init_$lambda$02 = Operation.TestOperation._init_$lambda$0((Applier) obj, (SlotWriter) obj2, (RememberManager) obj3);
                return _init_$lambda$02;
        }
    }

    public /* synthetic */ xk(int i) {
        this.d = i;
    }
}
