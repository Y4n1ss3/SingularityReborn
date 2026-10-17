package defpackage;

import android.app.Activity;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class g8 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Activity e;

    public /* synthetic */ g8(Activity activity, int i) {
        this.d = i;
        this.e = activity;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        final Activity activity = this.e;
        final int i2 = 2;
        char c = 1;
        char c2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(95766300, intValue, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous> (AppsActivity.kt:670)");
                    }
                    AppBarKt.m1624TopAppBarGHTll3U(wk.c, null, ComposableLambdaKt.rememberComposableLambda(496721250, true, new g8(activity, c == true ? 1 : 0), composer, 54), null, 0.0f, null, null, null, composer, 390, ProgressIndicatorKt.FirstLineTailDelay);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(496721250, intValue2, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous> (AppsActivity.kt:673)");
                    }
                    boolean changedInstance = composer2.changedInstance(activity);
                    Object rememberedValue = composer2.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        final int i3 = r7 ? 1 : 0;
                        rememberedValue = new iy() { // from class: r8
                            @Override // defpackage.iy
                            public final Object invoke() {
                                int i4 = i3;
                                w01 w01Var2 = w01.a;
                                Activity activity2 = activity;
                                switch (i4) {
                                    case 0:
                                        if (activity2 != null) {
                                            activity2.finish();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (activity2 != null) {
                                            activity2.finish();
                                            break;
                                        }
                                        break;
                                    default:
                                        if (activity2 != null) {
                                            activity2.finish();
                                            break;
                                        }
                                        break;
                                }
                                return w01Var2;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    IconButtonKt.IconButton((iy) rememberedValue, null, false, null, null, null, wk.d, composer2, 1572864, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (!composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(104275325, intValue3, -1, "com.lumi.singularity.ui.activities.LedColorScreen.<anonymous> (LedColorActivity.kt:61)");
                    }
                    AppBarKt.m1624TopAppBarGHTll3U(dl.d, null, ComposableLambdaKt.rememberComposableLambda(-693207101, true, new g8(activity, 3), composer3, 54), null, 0.0f, null, null, null, composer3, 390, ProgressIndicatorKt.FirstLineTailDelay);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (!composer4.shouldExecute((intValue4 & 3) != 2, intValue4 & 1)) {
                    composer4.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-693207101, intValue4, -1, "com.lumi.singularity.ui.activities.LedColorScreen.<anonymous>.<anonymous> (LedColorActivity.kt:64)");
                    }
                    boolean changedInstance2 = composer4.changedInstance(activity);
                    Object rememberedValue2 = composer4.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        final char c3 = c2 == true ? 1 : 0;
                        rememberedValue2 = new iy() { // from class: r8
                            @Override // defpackage.iy
                            public final Object invoke() {
                                int i4 = c3;
                                w01 w01Var2 = w01.a;
                                Activity activity2 = activity;
                                switch (i4) {
                                    case 0:
                                        if (activity2 != null) {
                                            activity2.finish();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (activity2 != null) {
                                            activity2.finish();
                                            break;
                                        }
                                        break;
                                    default:
                                        if (activity2 != null) {
                                            activity2.finish();
                                            break;
                                        }
                                        break;
                                }
                                return w01Var2;
                            }
                        };
                        composer4.updateRememberedValue(rememberedValue2);
                    }
                    IconButtonKt.IconButton((iy) rememberedValue2, null, false, null, null, null, dl.e, composer4, 1572864, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (!composer5.shouldExecute((intValue5 & 3) != 2, intValue5 & 1)) {
                    composer5.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1373589909, intValue5, -1, "com.lumi.singularity.ui.activities.TerminalScreen.<anonymous>.<anonymous> (TerminalActivity.kt:116)");
                    }
                    boolean changedInstance3 = composer5.changedInstance(activity);
                    Object rememberedValue3 = composer5.rememberedValue();
                    if (changedInstance3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                        rememberedValue3 = new iy() { // from class: r8
                            @Override // defpackage.iy
                            public final Object invoke() {
                                int i4 = i2;
                                w01 w01Var2 = w01.a;
                                Activity activity2 = activity;
                                switch (i4) {
                                    case 0:
                                        if (activity2 != null) {
                                            activity2.finish();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (activity2 != null) {
                                            activity2.finish();
                                            break;
                                        }
                                        break;
                                    default:
                                        if (activity2 != null) {
                                            activity2.finish();
                                            break;
                                        }
                                        break;
                                }
                                return w01Var2;
                            }
                        };
                        composer5.updateRememberedValue(rememberedValue3);
                    }
                    IconButtonKt.IconButton((iy) rememberedValue3, null, false, null, null, null, fl.a, composer5, 1572864, 62);
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
