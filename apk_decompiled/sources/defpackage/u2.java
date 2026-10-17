package defpackage;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class u2 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ ScrollState e;
    public final /* synthetic */ MutableState f;

    public /* synthetic */ u2(ScrollState scrollState, MutableState mutableState, int i) {
        this.d = i;
        this.e = scrollState;
        this.f = mutableState;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        w01 w01Var = w01.a;
        final MutableState mutableState = this.f;
        final ScrollState scrollState = this.e;
        final int i2 = 1;
        ColumnScope columnScope = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                columnScope.getClass();
                if (!composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(399887074, intValue, -1, "com.lumi.singularity.ui.activities.AdbScreen.<anonymous>.<anonymous>.<anonymous> (AdbActivity.kt:247)");
                    }
                    final int i3 = r8 ? 1 : 0;
                    SelectionContainerKt.SelectionContainer(null, ComposableLambdaKt.rememberComposableLambda(1640875359, true, new my() { // from class: m2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.my
                        public final Object invoke(Object obj4, Object obj5) {
                            int i4 = i3;
                            w01 w01Var2 = w01.a;
                            MutableState mutableState2 = mutableState;
                            switch (i4) {
                                case 0:
                                    Composer composer2 = (Composer) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                                        composer2.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1640875359, intValue2, -1, "com.lumi.singularity.ui.activities.AdbScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdbActivity.kt:248)");
                                        }
                                        TextKt.m2607TextNvy7gAk((String) mutableState2.getValue(), ScrollKt.verticalScroll$default(PaddingKt.m762padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Dp.m7611constructorimpl(12.0f)), scrollState, false, null, false, 14, null), 0L, null, 0L, null, null, FontFamily.Companion.getMonospace(), 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 130940);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    if (!composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                                        composer3.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1584902601, intValue3, -1, "com.lumi.singularity.ui.activities.AdbConnectScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdbRootActivity.kt:646)");
                                        }
                                        TextKt.m2607TextNvy7gAk((String) mutableState2.getValue(), ScrollKt.verticalScroll$default(PaddingKt.m762padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Dp.m7611constructorimpl(12.0f)), scrollState, false, null, false, 14, null), 0L, null, 0L, null, null, FontFamily.Companion.getMonospace(), 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 130940);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj4;
                                    int intValue4 = ((Integer) obj5).intValue();
                                    if (!composer4.shouldExecute((intValue4 & 3) != 2, intValue4 & 1)) {
                                        composer4.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-958729031, intValue4, -1, "com.lumi.singularity.ui.activities.SingularityApp.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:1935)");
                                        }
                                        TextKt.m2607TextNvy7gAk(((String) mutableState2.getValue()).length() == 0 ? "no output yet..." : (String) mutableState2.getValue(), ScrollKt.verticalScroll$default(PaddingKt.m762padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Dp.m7611constructorimpl(12.0f)), scrollState, false, null, false, 14, null), 0L, null, TextUnitKt.getSp(12), null, null, FontFamily.Companion.getMonospace(), 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodySmall(), composer4, 24576, 0, 130924);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                            }
                            return w01Var2;
                        }
                    }, composer, 54), composer, 48, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                columnScope.getClass();
                if (!composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-695276780, intValue, -1, "com.lumi.singularity.ui.activities.AdbConnectScreen.<anonymous>.<anonymous>.<anonymous> (AdbRootActivity.kt:645)");
                    }
                    SelectionContainerKt.SelectionContainer(null, ComposableLambdaKt.rememberComposableLambda(-1584902601, true, new my() { // from class: m2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.my
                        public final Object invoke(Object obj4, Object obj5) {
                            int i4 = i2;
                            w01 w01Var2 = w01.a;
                            MutableState mutableState2 = mutableState;
                            switch (i4) {
                                case 0:
                                    Composer composer2 = (Composer) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                                        composer2.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1640875359, intValue2, -1, "com.lumi.singularity.ui.activities.AdbScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdbActivity.kt:248)");
                                        }
                                        TextKt.m2607TextNvy7gAk((String) mutableState2.getValue(), ScrollKt.verticalScroll$default(PaddingKt.m762padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Dp.m7611constructorimpl(12.0f)), scrollState, false, null, false, 14, null), 0L, null, 0L, null, null, FontFamily.Companion.getMonospace(), 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 130940);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    if (!composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                                        composer3.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1584902601, intValue3, -1, "com.lumi.singularity.ui.activities.AdbConnectScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdbRootActivity.kt:646)");
                                        }
                                        TextKt.m2607TextNvy7gAk((String) mutableState2.getValue(), ScrollKt.verticalScroll$default(PaddingKt.m762padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Dp.m7611constructorimpl(12.0f)), scrollState, false, null, false, 14, null), 0L, null, 0L, null, null, FontFamily.Companion.getMonospace(), 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 130940);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj4;
                                    int intValue4 = ((Integer) obj5).intValue();
                                    if (!composer4.shouldExecute((intValue4 & 3) != 2, intValue4 & 1)) {
                                        composer4.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-958729031, intValue4, -1, "com.lumi.singularity.ui.activities.SingularityApp.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:1935)");
                                        }
                                        TextKt.m2607TextNvy7gAk(((String) mutableState2.getValue()).length() == 0 ? "no output yet..." : (String) mutableState2.getValue(), ScrollKt.verticalScroll$default(PaddingKt.m762padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Dp.m7611constructorimpl(12.0f)), scrollState, false, null, false, 14, null), 0L, null, TextUnitKt.getSp(12), null, null, FontFamily.Companion.getMonospace(), 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodySmall(), composer4, 24576, 0, 130924);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                            }
                            return w01Var2;
                        }
                    }, composer, 54), composer, 48, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                columnScope.getClass();
                if (!composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-40310506, intValue, -1, "com.lumi.singularity.ui.activities.SingularityApp.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:1934)");
                    }
                    final int i4 = 2;
                    SelectionContainerKt.SelectionContainer(null, ComposableLambdaKt.rememberComposableLambda(-958729031, true, new my() { // from class: m2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.my
                        public final Object invoke(Object obj4, Object obj5) {
                            int i42 = i4;
                            w01 w01Var2 = w01.a;
                            MutableState mutableState2 = mutableState;
                            switch (i42) {
                                case 0:
                                    Composer composer2 = (Composer) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                                        composer2.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1640875359, intValue2, -1, "com.lumi.singularity.ui.activities.AdbScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdbActivity.kt:248)");
                                        }
                                        TextKt.m2607TextNvy7gAk((String) mutableState2.getValue(), ScrollKt.verticalScroll$default(PaddingKt.m762padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Dp.m7611constructorimpl(12.0f)), scrollState, false, null, false, 14, null), 0L, null, 0L, null, null, FontFamily.Companion.getMonospace(), 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 130940);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    if (!composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                                        composer3.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1584902601, intValue3, -1, "com.lumi.singularity.ui.activities.AdbConnectScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdbRootActivity.kt:646)");
                                        }
                                        TextKt.m2607TextNvy7gAk((String) mutableState2.getValue(), ScrollKt.verticalScroll$default(PaddingKt.m762padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Dp.m7611constructorimpl(12.0f)), scrollState, false, null, false, 14, null), 0L, null, 0L, null, null, FontFamily.Companion.getMonospace(), 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 130940);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj4;
                                    int intValue4 = ((Integer) obj5).intValue();
                                    if (!composer4.shouldExecute((intValue4 & 3) != 2, intValue4 & 1)) {
                                        composer4.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-958729031, intValue4, -1, "com.lumi.singularity.ui.activities.SingularityApp.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:1935)");
                                        }
                                        TextKt.m2607TextNvy7gAk(((String) mutableState2.getValue()).length() == 0 ? "no output yet..." : (String) mutableState2.getValue(), ScrollKt.verticalScroll$default(PaddingKt.m762padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Dp.m7611constructorimpl(12.0f)), scrollState, false, null, false, 14, null), 0L, null, TextUnitKt.getSp(12), null, null, FontFamily.Companion.getMonospace(), 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodySmall(), composer4, 24576, 0, 130924);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                            }
                            return w01Var2;
                        }
                    }, composer, 54), composer, 48, 1);
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
