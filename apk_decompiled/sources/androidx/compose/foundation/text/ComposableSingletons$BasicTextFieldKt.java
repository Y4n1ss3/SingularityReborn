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
public final class ComposableSingletons$BasicTextFieldKt {
    public static final ComposableSingletons$BasicTextFieldKt INSTANCE = new ComposableSingletons$BasicTextFieldKt();
    private static ny lambda$759698998 = ComposableLambdaKt.composableLambdaInstance(759698998, false, new xk(0));
    private static ny lambda$486633673 = ComposableLambdaKt.composableLambdaInstance(486633673, false, new xk(1));
    private static ny lambda$444370233 = ComposableLambdaKt.composableLambdaInstance(444370233, false, new xk(2));

    /* renamed from: lambda$-665310900, reason: not valid java name */
    private static ny f54lambda$665310900 = ComposableLambdaKt.composableLambdaInstance(-665310900, false, new xk(3));

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 lambda_444370233$lambda$0(my myVar, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changedInstance(myVar) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(444370233, i, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda$444370233.<anonymous> (BasicTextField.kt:949)");
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 lambda_486633673$lambda$0(my myVar, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changedInstance(myVar) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(486633673, i, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda$486633673.<anonymous> (BasicTextField.kt:905)");
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 lambda_759698998$lambda$0(my myVar, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changedInstance(myVar) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(759698998, i, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda$759698998.<anonymous> (BasicTextField.kt:748)");
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 lambda__665310900$lambda$0(my myVar, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changedInstance(myVar) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-665310900, i, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda$-665310900.<anonymous> (BasicTextField.kt:989)");
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

    /* renamed from: getLambda$-665310900$foundation, reason: not valid java name */
    public final ny m1086getLambda$665310900$foundation() {
        return f54lambda$665310900;
    }

    public final ny getLambda$444370233$foundation() {
        return lambda$444370233;
    }

    public final ny getLambda$486633673$foundation() {
        return lambda$486633673;
    }

    public final ny getLambda$759698998$foundation() {
        return lambda$759698998;
    }
}
