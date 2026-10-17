package defpackage;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.lumi.singularity.ui.activities.TweaksActivity;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class tw0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ TweaksActivity e;
    public final /* synthetic */ MutableState f;

    public /* synthetic */ tw0(TweaksActivity tweaksActivity, MutableState mutableState, int i) {
        this.d = i;
        this.e = tweaksActivity;
        this.f = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        MutableState mutableState = this.f;
        TweaksActivity tweaksActivity = this.e;
        char c = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = TweaksActivity.C;
                if (!composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-918716830, intValue, -1, "com.lumi.singularity.ui.activities.TweaksActivity.onCreate.<anonymous>.<anonymous> (TweaksActivity.kt:584)");
                    }
                    SurfaceKt.m2464SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m1747getBackground0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1350278439, true, new tw0(tweaksActivity, mutableState, c == true ? 1 : 0), composer, 54), composer, 12582918, 122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i3 = TweaksActivity.C;
                if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1350278439, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:585)");
                    }
                    boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    boolean changedInstance = composer2.changedInstance(tweaksActivity);
                    Object rememberedValue = composer2.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new hm0(tweaksActivity, 18);
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    o01.b(tweaksActivity, booleanValue, (iy) rememberedValue, composer2, 0);
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
