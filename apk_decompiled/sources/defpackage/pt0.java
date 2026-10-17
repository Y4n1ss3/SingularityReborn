package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.lumi.singularity.ui.activities.TerminalActivity;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class pt0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ MutableState f;

    public /* synthetic */ pt0(Context context, MutableState mutableState, int i) {
        this.d = i;
        this.e = context;
        this.f = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        my myVar;
        int i = this.d;
        w01 w01Var = w01.a;
        MutableState mutableState = this.f;
        Context context = this.e;
        int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = TerminalActivity.v;
                if (!composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1840259522, intValue, -1, "com.lumi.singularity.ui.activities.TerminalActivity.onCreate.<anonymous>.<anonymous> (TerminalActivity.kt:62)");
                    }
                    SurfaceKt.m2464SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m1747getBackground0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-678996473, true, new pt0(context, mutableState, i2), composer, 54), composer, 12582918, 122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i4 = TerminalActivity.v;
                if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-678996473, intValue2, -1, "com.lumi.singularity.ui.activities.TerminalActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (TerminalActivity.kt:63)");
                    }
                    String str = ((Boolean) mutableState.getValue()).booleanValue() ? "Root Shell" : "Wireless Shell";
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        composer2.startReplaceGroup(1312211456);
                        Object rememberedValue = composer2.rememberedValue();
                        if (rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = new t9(2, 1, null);
                            composer2.updateRememberedValue(rememberedValue);
                        }
                        myVar = (my) rememberedValue;
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1312314345);
                        boolean changedInstance = composer2.changedInstance(context);
                        Object rememberedValue2 = composer2.rememberedValue();
                        if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                            rememberedValue2 = new d4(context, null, 7);
                            composer2.updateRememberedValue(rememberedValue2);
                        }
                        myVar = (my) rememberedValue2;
                        composer2.endReplaceGroup();
                    }
                    st0.a(str, myVar, composer2, 0, 0);
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
