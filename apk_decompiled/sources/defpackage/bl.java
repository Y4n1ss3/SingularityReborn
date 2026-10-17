package defpackage;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.automirrored.filled.SendKt;
import androidx.compose.material.icons.filled.DeleteKt;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.DrawerValue;
import androidx.compose.material3.ExposedDropdownMenuPositionProvider;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.internal.DropdownMenuPositionProvider;
import androidx.compose.runtime.ComposableSingletons$RecomposerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.TextUnitKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class bl implements my {
    public final /* synthetic */ int d;

    public /* synthetic */ bl(int i) {
        this.d = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 lambda__1091980426$lambda$0;
        hj hjVar;
        DrawerValue Saver$lambda$0;
        w01 _init_$lambda$1;
        w01 _init_$lambda$12;
        int i = this.d;
        hm hmVar = null;
        w01 w01Var = w01.a;
        int i2 = 2;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1893792911, intValue, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$DomainBlockerActivityKt.lambda$1893792911.<anonymous> (DomainBlockerActivity.kt:80)");
                    }
                    IconKt.m2055Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Back", (Modifier) null, 0L, composer, 48, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return w01Var;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2028279402, intValue2, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$DomainBlockerActivityKt.lambda$-2028279402.<anonymous> (DomainBlockerActivity.kt:319)");
                    }
                    TextKt.m2607TextNvy7gAk("example.com", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return w01Var;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1106290312, intValue3, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$DomainBlockerActivityKt.lambda$-1106290312.<anonymous> (DomainBlockerActivity.kt:374)");
                    }
                    Object rememberedValue = composer3.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new e1(14);
                        composer3.updateRememberedValue(rememberedValue);
                    }
                    gs.a((iy) rememberedValue, composer3, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return w01Var;
            case 3:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (composer4.shouldExecute((intValue4 & 3) != 2, intValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-4138509, intValue4, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$DomainBlockerActivityKt.lambda$-4138509.<anonymous> (DomainBlockerActivity.kt:373)");
                    }
                    SurfaceKt.m2464SurfaceT9BRK9s(null, null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).m1747getBackground0d7_KjU(), 0L, 0.0f, 0.0f, null, cl.e, composer4, 12582912, 123);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return w01Var;
            case 4:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (composer5.shouldExecute((intValue5 & 3) != 2, intValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1640906887, intValue5, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$LedColorActivityKt.lambda$1640906887.<anonymous> (LedColorActivity.kt:38)");
                    }
                    m40.b(composer5, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return w01Var;
            case 5:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (composer6.shouldExecute((intValue6 & 3) != 2, intValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-134804414, intValue6, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$LedColorActivityKt.lambda$-134804414.<anonymous> (LedColorActivity.kt:37)");
                    }
                    SurfaceKt.m2464SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).m1747getBackground0d7_KjU(), 0L, 0.0f, 0.0f, null, dl.a, composer6, 12582918, 122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return w01Var;
            case 6:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (composer7.shouldExecute((intValue7 & 3) != 2, intValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1458711662, intValue7, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$LedColorActivityKt.lambda$1458711662.<anonymous> (LedColorActivity.kt:34)");
                    }
                    MaterialThemeKt.MaterialTheme(y90.a(composer7), null, null, dl.b, composer7, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return w01Var;
            case 7:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (composer8.shouldExecute((intValue8 & 3) != 2, intValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1670634561, intValue8, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$LedColorActivityKt.lambda$1670634561.<anonymous> (LedColorActivity.kt:62)");
                    }
                    TextKt.m2607TextNvy7gAk("Custom LED Color", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer8, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return w01Var;
            case 8:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if (composer9.shouldExecute((intValue9 & 3) != 2, intValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-739506975, intValue9, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$LedColorActivityKt.lambda$-739506975.<anonymous> (LedColorActivity.kt:65)");
                    }
                    IconKt.m2055Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Back", (Modifier) null, 0L, composer9, 48, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return w01Var;
            case 9:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if (composer10.shouldExecute((intValue10 & 3) != 2, intValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-445049570, intValue10, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$LedColorActivityKt.lambda$-445049570.<anonymous> (LedColorActivity.kt:190)");
                    }
                    m40.b(composer10, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return w01Var;
            case 10:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if (composer11.shouldExecute((intValue11 & 3) != 2, intValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(148824921, intValue11, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$LedColorActivityKt.lambda$148824921.<anonymous> (LedColorActivity.kt:189)");
                    }
                    SurfaceKt.m2464SurfaceT9BRK9s(null, null, MaterialTheme.INSTANCE.getColorScheme(composer11, MaterialTheme.$stable).m1747getBackground0d7_KjU(), 0L, 0.0f, 0.0f, null, dl.g, composer11, 12582912, 123);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return w01Var;
            case 11:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if (composer12.shouldExecute((intValue12 & 3) != 2, intValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1386882737, intValue12, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$MainActivityKt.lambda$1386882737.<anonymous> (MainActivity.kt:2414)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return w01Var;
            case Matrix.TranslateX /* 12 */:
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if (composer13.shouldExecute((intValue13 & 3) != 2, intValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1094585522, intValue13, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$MainActivityKt.lambda$1094585522.<anonymous> (MainActivity.kt:2227)");
                    }
                    IconKt.m2055Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Back", (Modifier) null, 0L, composer13, 48, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return w01Var;
            case Matrix.TranslateY /* 13 */:
                lambda__1091980426$lambda$0 = ComposableSingletons$RecomposerKt.lambda__1091980426$lambda$0((Composer) obj, ((Integer) obj2).intValue());
                return lambda__1091980426$lambda$0;
            case Matrix.TranslateZ /* 14 */:
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if (composer14.shouldExecute((intValue14 & 3) != 2, intValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1940670349, intValue14, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$TerminalActivityKt.lambda$1940670349.<anonymous> (TerminalActivity.kt:117)");
                    }
                    IconKt.m2055Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Back", (Modifier) null, 0L, composer14, 48, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return w01Var;
            case 15:
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if (composer15.shouldExecute((intValue15 & 3) != 2, intValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1554121216, intValue15, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$TerminalActivityKt.lambda$1554121216.<anonymous> (TerminalActivity.kt:125)");
                    }
                    IconKt.m2055Iconww6aTOc(DeleteKt.getDelete(Icons.INSTANCE.getDefault()), "Clear output", (Modifier) null, 0L, composer15, 48, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return w01Var;
            case 16:
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                if (composer16.shouldExecute((intValue16 & 3) != 2, intValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1183664498, intValue16, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$TerminalActivityKt.lambda$1183664498.<anonymous> (TerminalActivity.kt:200)");
                    }
                    TextKt.m2607TextNvy7gAk("Enter command...", null, 0L, null, TextUnitKt.getSp(13), null, null, FontFamily.Companion.getMonospace(), 0L, null, null, 0L, 0, false, 0, 0, null, null, composer16, 24582, 0, 261998);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return w01Var;
            case 17:
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                if (composer17.shouldExecute((intValue17 & 3) != 2, intValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1542336875, intValue17, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$TerminalActivityKt.lambda$1542336875.<anonymous> (TerminalActivity.kt:212)");
                    }
                    IconKt.m2055Iconww6aTOc(SendKt.getSend(Icons.AutoMirrored.Filled.INSTANCE), "Run", (Modifier) null, 0L, composer17, 48, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                return w01Var;
            case 18:
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                if (composer18.shouldExecute((intValue18 & 3) != 2, intValue18 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1965571926, intValue18, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$TerminalActivityKt.lambda$1965571926.<anonymous> (TerminalActivity.kt:224)");
                    }
                    Object rememberedValue2 = composer18.rememberedValue();
                    if (rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new w2(i2, 3, hmVar);
                        composer18.updateRememberedValue(rememberedValue2);
                    }
                    st0.a(null, (my) rememberedValue2, composer18, 0, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer18.skipToGroupEnd();
                }
                return w01Var;
            case 19:
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                if (composer19.shouldExecute((intValue19 & 3) != 2, intValue19 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1735520879, intValue19, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$TerminalActivityKt.lambda$-1735520879.<anonymous> (TerminalActivity.kt:223)");
                    }
                    SurfaceKt.m2464SurfaceT9BRK9s(null, null, MaterialTheme.INSTANCE.getColorScheme(composer19, MaterialTheme.$stable).m1747getBackground0d7_KjU(), 0L, 0.0f, 0.0f, null, fl.e, composer19, 12582912, 123);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer19.skipToGroupEnd();
                }
                return w01Var;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                if (composer20.shouldExecute((intValue20 & 3) != 2, intValue20 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-122722543, intValue20, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$TweaksActivityKt.lambda$-122722543.<anonymous> (TweaksActivity.kt:1419)");
                    }
                    TextKt.m2607TextNvy7gAk("AIO Tweaks", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer20, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer20.skipToGroupEnd();
                }
                return w01Var;
            case 21:
                Composer composer21 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                if (composer21.shouldExecute((intValue21 & 3) != 2, intValue21 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1025694321, intValue21, -1, "com.lumi.singularity.ui.activities.ComposableSingletons$TweaksActivityKt.lambda$1025694321.<anonymous> (TweaksActivity.kt:1422)");
                    }
                    IconKt.m2055Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Back", (Modifier) null, 0L, composer21, 48, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer21.skipToGroupEnd();
                }
                return w01Var;
            case 22:
                kn knVar = (kn) obj;
                in inVar = (in) obj2;
                knVar.getClass();
                inVar.getClass();
                kn minusKey = knVar.minusKey(inVar.getKey());
                st stVar = st.d;
                if (minusKey == stVar) {
                    return inVar;
                }
                ts tsVar = ts.i;
                mn mnVar = (mn) minusKey.get(tsVar);
                if (mnVar == null) {
                    hjVar = new hj(inVar, minusKey);
                } else {
                    kn minusKey2 = minusKey.minusKey(tsVar);
                    if (minusKey2 == stVar) {
                        return new hj(mnVar, inVar);
                    }
                    hjVar = new hj(mnVar, new hj(inVar, minusKey2));
                }
                return hjVar;
            case 23:
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 24:
                return ((kn) obj).plus((in) obj2);
            case RectListKt.BitOffsetForParentId /* 25 */:
                return ((kn) obj).plus((in) obj2);
            case 26:
                Saver$lambda$0 = DrawerState.Companion.Saver$lambda$0((SaverScope) obj, (DrawerState) obj2);
                return Saver$lambda$0;
            case 27:
                _init_$lambda$1 = DropdownMenuPositionProvider._init_$lambda$1((IntRect) obj, (IntRect) obj2);
                return _init_$lambda$1;
            case 28:
                _init_$lambda$12 = ExposedDropdownMenuPositionProvider._init_$lambda$1((IntRect) obj, (IntRect) obj2);
                return _init_$lambda$12;
            default:
                return Boolean.valueOf(q10.b(obj, obj2));
        }
    }
}
