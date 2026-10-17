package defpackage;

import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.RefreshKt;
import androidx.compose.material.icons.filled.SyncKt;
import androidx.compose.material3.BottomAppBarState;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.carousel.CarouselPagerState;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.ComposableSingletons$CompositionKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class w4 implements my {
    public final /* synthetic */ int d;

    public /* synthetic */ w4(int i) {
        this.d = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        Object Saver$lambda$0;
        Object Saver$lambda$6;
        Object Saver$lambda$3;
        Object Saver$lambda$02;
        int spacedBy_0680j_4$lambda$0;
        List Saver$lambda$03;
        List Saver$lambda$04;
        List Saver$lambda$1;
        w01 lambda_954879418$lambda$0;
        w01 lambda_1918065384$lambda$0;
        int i = this.d;
        w01 w01Var = w01.a;
        int i2 = 2;
        switch (i) {
            case 0:
                Saver$lambda$0 = AnchoredDraggableState.Companion.Saver$lambda$0((SaverScope) obj, (AnchoredDraggableState) obj2);
                break;
            case 1:
                Saver$lambda$6 = AnchoredDraggableState.Companion.Saver$lambda$6((SaverScope) obj, (androidx.compose.foundation.gestures.AnchoredDraggableState) obj2);
                break;
            case 2:
                Saver$lambda$3 = AnchoredDraggableState.Companion.Saver$lambda$3((SaverScope) obj, (androidx.compose.foundation.gestures.AnchoredDraggableState) obj2);
                break;
            case 3:
                Saver$lambda$02 = AnchoredDraggableState.Companion.Saver$lambda$0((SaverScope) obj, (androidx.compose.foundation.gestures.AnchoredDraggableState) obj2);
                break;
            case 4:
                spacedBy_0680j_4$lambda$0 = Arrangement.spacedBy_0680j_4$lambda$0(((Integer) obj).intValue(), (LayoutDirection) obj2);
                break;
            case 5:
                Saver$lambda$03 = BottomAppBarState.Companion.Saver$lambda$0((SaverScope) obj, (BottomAppBarState) obj2);
                break;
            case 6:
                Saver$lambda$04 = CarouselPagerState.Saver$lambda$0((SaverScope) obj, (CarouselPagerState) obj2);
                break;
            case 7:
                Saver$lambda$1 = CarouselState.Saver$lambda$1((SaverScope) obj, (CarouselState) obj2);
                break;
            case 8:
                String str = (String) obj;
                in inVar = (in) obj2;
                str.getClass();
                inVar.getClass();
                if (str.length() != 0) {
                    break;
                } else {
                    break;
                }
            case 9:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1557206707, intValue, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AdbActivityKt.lambda$1557206707.<anonymous> (AdbActivity.kt:103)");
                    }
                    TextKt.m2607TextNvy7gAk("Setup With Computer", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 10:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1626922477, intValue2, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AdbActivityKt.lambda$-1626922477.<anonymous> (AdbActivity.kt:106)");
                    }
                    IconKt.m2055Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Back", (Modifier) null, 0L, composer2, 48, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 11:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (!composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1030952133, intValue3, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AdbRootActivityKt.lambda$-1030952133.<anonymous> (AdbRootActivity.kt:246)");
                    }
                    IconKt.m2055Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Back", (Modifier) null, 0L, composer3, 48, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case Matrix.TranslateX /* 12 */:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (!composer4.shouldExecute((intValue4 & 3) != 2, intValue4 & 1)) {
                    composer4.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-38536989, intValue4, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AdbRootActivityKt.lambda$-38536989.<anonymous> (AdbRootActivity.kt:328)");
                    }
                    TextKt.m2607TextNvy7gAk("Pairing Code (6 digits)", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case Matrix.TranslateY /* 13 */:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (!composer5.shouldExecute((intValue5 & 3) != 2, intValue5 & 1)) {
                    composer5.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1310755622, intValue5, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AdbRootActivityKt.lambda$-1310755622.<anonymous> (AdbRootActivity.kt:336)");
                    }
                    TextKt.m2607TextNvy7gAk("Pairing Port", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer5, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case Matrix.TranslateZ /* 14 */:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (!composer6.shouldExecute((intValue6 & 3) != 2, intValue6 & 1)) {
                    composer6.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1976329664, intValue6, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AdbRootActivityKt.lambda$-1976329664.<anonymous> (AdbRootActivity.kt:398)");
                    }
                    TextKt.m2607TextNvy7gAk("Connection Port", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer6, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 15:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (!composer7.shouldExecute((intValue7 & 3) != 2, intValue7 & 1)) {
                    composer7.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(770381949, intValue7, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$770381949.<anonymous> (AppsActivity.kt:1215)");
                    }
                    IconKt.m2055Iconww6aTOc(SyncKt.getSync(Icons.INSTANCE.getDefault()), "Refresh", (Modifier) null, 0L, composer7, 48, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 16:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (!composer8.shouldExecute((intValue8 & 3) != 2, intValue8 & 1)) {
                    composer8.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1530383553, intValue8, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$-1530383553.<anonymous> (AppsActivity.kt:1444)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 17:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if (!composer9.shouldExecute((intValue9 & 3) != 2, intValue9 & 1)) {
                    composer9.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1088414058, intValue9, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$1088414058.<anonymous> (AppsActivity.kt:1545)");
                    }
                    Object rememberedValue = composer9.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new w2(i2, i2, null);
                        composer9.updateRememberedValue(rememberedValue);
                    }
                    kb.c(false, (my) rememberedValue, composer9, 0, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 18:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if (!composer10.shouldExecute((intValue10 & 3) != 2, intValue10 & 1)) {
                    composer10.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-188147035, intValue10, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$-188147035.<anonymous> (AppsActivity.kt:1544)");
                    }
                    SurfaceKt.m2464SurfaceT9BRK9s(null, null, MaterialTheme.INSTANCE.getColorScheme(composer10, MaterialTheme.$stable).m1747getBackground0d7_KjU(), 0L, 0.0f, 0.0f, null, wk.C, composer10, 12582912, 123);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 19:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if (!composer11.shouldExecute((intValue11 & 3) != 2, intValue11 & 1)) {
                    composer11.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835552, intValue11, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$-1835552.<anonymous> (AppsActivity.kt:671)");
                    }
                    TextKt.m2607TextNvy7gAk("Apps", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer11, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if (!composer12.shouldExecute((intValue12 & 3) != 2, intValue12 & 1)) {
                    composer12.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1256790400, intValue12, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$-1256790400.<anonymous> (AppsActivity.kt:674)");
                    }
                    IconKt.m2055Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Back", (Modifier) null, 0L, composer12, 48, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 21:
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if (!composer13.shouldExecute((intValue13 & 3) != 2, intValue13 & 1)) {
                    composer13.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2030738784, intValue13, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$2030738784.<anonymous> (AppsActivity.kt:867)");
                    }
                    IconKt.m2055Iconww6aTOc(SyncKt.getSync(Icons.INSTANCE.getDefault()), "Refresh", (Modifier) null, 0L, composer13, 48, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 22:
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if (!composer14.shouldExecute((intValue14 & 3) != 2, intValue14 & 1)) {
                    composer14.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1996861946, intValue14, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$-1996861946.<anonymous> (AppsActivity.kt:1060)");
                    }
                    IconKt.m2055Iconww6aTOc(SyncKt.getSync(Icons.INSTANCE.getDefault()), "Refresh Zygisk status", (Modifier) null, 0L, composer14, 48, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 23:
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if (!composer15.shouldExecute((intValue15 & 3) != 2, intValue15 & 1)) {
                    composer15.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-160031659, intValue15, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$AppsActivityKt.lambda$-160031659.<anonymous> (AppsActivity.kt:1138)");
                    }
                    IconKt.m2055Iconww6aTOc(SyncKt.getSync(Icons.INSTANCE.getDefault()), "Refresh", (Modifier) null, 0L, composer15, 48, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 24:
                lambda_954879418$lambda$0 = ComposableSingletons$CompositionKt.lambda_954879418$lambda$0((Composer) obj, ((Integer) obj2).intValue());
                break;
            case RectListKt.BitOffsetForParentId /* 25 */:
                lambda_1918065384$lambda$0 = ComposableSingletons$CompositionKt.lambda_1918065384$lambda$0((Composer) obj, ((Integer) obj2).intValue());
                break;
            case 26:
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                if (!composer16.shouldExecute((intValue16 & 3) != 2, intValue16 & 1)) {
                    composer16.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1783777724, intValue16, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$ControllerInfoActivityKt.lambda$1783777724.<anonymous> (ControllerInfoActivity.kt:127)");
                    }
                    TextKt.m2607TextNvy7gAk("Controllers", null, 0L, null, 0L, null, FontWeight.Companion.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer16, MaterialTheme.$stable).getHeadlineLarge(), composer16, 1572870, 0, 131006);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 27:
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                if (!composer17.shouldExecute((intValue17 & 3) != 2, intValue17 & 1)) {
                    composer17.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-413946596, intValue17, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$ControllerInfoActivityKt.lambda$-413946596.<anonymous> (ControllerInfoActivity.kt:135)");
                    }
                    IconKt.m2055Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Back", (Modifier) null, 0L, composer17, 48, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 28:
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                if (!composer18.shouldExecute((intValue18 & 3) != 2, intValue18 & 1)) {
                    composer18.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-303816305, intValue18, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$ControllerInfoActivityKt.lambda$-303816305.<anonymous> (ControllerInfoActivity.kt:143)");
                    }
                    IconKt.m2055Iconww6aTOc(RefreshKt.getRefresh(Icons.INSTANCE.getDefault()), "Refresh", (Modifier) null, 0L, composer18, 48, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                if (!composer19.shouldExecute((intValue19 & 3) != 2, intValue19 & 1)) {
                    composer19.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(563357999, intValue19, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$DomainBlockerActivityKt.lambda$563357999.<anonymous> (DomainBlockerActivity.kt:77)");
                    }
                    TextKt.m2607TextNvy7gAk("Domain Blocker", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer19, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }
}
