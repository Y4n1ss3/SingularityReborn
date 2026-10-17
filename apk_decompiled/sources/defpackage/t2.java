package defpackage;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ExpandLessKt;
import androidx.compose.material.icons.filled.ExpandMoreKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class t2 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState f;

    public /* synthetic */ t2(MutableState mutableState, MutableState mutableState2, int i) {
        this.d = i;
        this.e = mutableState;
        this.f = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        int i = this.d;
        w01 w01Var = w01.a;
        MutableState mutableState = this.f;
        MutableState mutableState2 = this.e;
        switch (i) {
            case 0:
                Composer composer2 = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer2.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1152406651, intValue, -1, "com.lumi.singularity.ui.activities.AdbScreen.<anonymous>.<anonymous>.<anonymous> (AdbActivity.kt:228)");
                    }
                    TextKt.m2607TextNvy7gAk(!((Boolean) mutableState2.getValue()).booleanValue() ? "Patch boot.img (Requires Root)" : ((Boolean) mutableState.getValue()).booleanValue() ? "Processing..." : "Patch boot.img", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                Composer composer3 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (!composer3.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(951961641, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2016)");
                    }
                    if (((Boolean) mutableState2.getValue()).booleanValue()) {
                        composer3.startReplaceGroup(220268952);
                        TextKt.m2607TextNvy7gAk(uo.d("adb connect ", (String) mutableState.getValue(), ":5555"), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium(), composer3, 0, 0, 131070);
                        composer = composer3;
                    } else {
                        composer = composer3;
                        composer.startReplaceGroup(99439353);
                    }
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 2:
                Composer composer4 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer4.shouldExecute((intValue3 & 17) != 16, intValue3 & 1)) {
                    composer4.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1789018080, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2427)");
                    }
                    TextKt.m2607TextNvy7gAk(((Number) mutableState2.getValue()).intValue() + "%", null, 0L, null, 0L, null, FontWeight.Companion.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodySmall(), composer4, 1572864, 0, 131006);
                    IconKt.m2055Iconww6aTOc(((Boolean) mutableState.getValue()).booleanValue() ? ExpandLessKt.getExpandLess(Icons.INSTANCE.getDefault()) : ExpandMoreKt.getExpandMore(Icons.INSTANCE.getDefault()), (String) null, PaddingKt.m766paddingqDBjuR0$default(SizeKt.m807size3ABfNKs(Modifier.Companion, Dp.m7611constructorimpl(18.0f)), Dp.m7611constructorimpl(4.0f), 0.0f, 0.0f, 0.0f, 14, null), 0L, composer4, 432, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer5 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (!composer5.shouldExecute((intValue4 & 17) != 16, intValue4 & 1)) {
                    composer5.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1070316751, intValue4, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:4116)");
                    }
                    TextKt.m2607TextNvy7gAk(((String) mutableState2.getValue()) + " MHz", null, 0L, null, 0L, null, FontWeight.Companion.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getBodySmall(), composer5, 1572864, 0, 131006);
                    IconKt.m2055Iconww6aTOc(((Boolean) mutableState.getValue()).booleanValue() ? ExpandLessKt.getExpandLess(Icons.INSTANCE.getDefault()) : ExpandMoreKt.getExpandMore(Icons.INSTANCE.getDefault()), (String) null, PaddingKt.m766paddingqDBjuR0$default(SizeKt.m807size3ABfNKs(Modifier.Companion, Dp.m7611constructorimpl(18.0f)), Dp.m7611constructorimpl(4.0f), 0.0f, 0.0f, 0.0f, 14, null), 0L, composer5, 432, 8);
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
