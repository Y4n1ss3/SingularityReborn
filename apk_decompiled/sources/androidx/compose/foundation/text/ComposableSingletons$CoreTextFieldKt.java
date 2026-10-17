package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.my;
import defpackage.ny;
import defpackage.w01;
import defpackage.xk;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposableSingletons$CoreTextFieldKt {
    public static final ComposableSingletons$CoreTextFieldKt INSTANCE = new ComposableSingletons$CoreTextFieldKt();
    private static ny lambda$559628295 = ComposableLambdaKt.composableLambdaInstance(559628295, false, new xk(7));

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 lambda_559628295$lambda$0(my myVar, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changedInstance(myVar) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(559628295, i, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda$559628295.<anonymous> (CoreTextField.kt:210)");
            }
            myVar.invoke(composer, Integer.valueOf(i & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    public final ny getLambda$559628295$foundation() {
        return lambda$559628295;
    }
}
