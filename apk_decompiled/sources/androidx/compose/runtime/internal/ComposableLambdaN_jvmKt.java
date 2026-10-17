package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposableLambdaN_jvmKt {
    @ComposeCompilerApi
    public static final ComposableLambdaN composableLambdaN(Composer composer, int i, boolean z, int i2, Object obj) {
        ComposableLambdaNImpl composableLambdaNImpl;
        composer.startReplaceableGroup(i);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            composableLambdaNImpl = new ComposableLambdaNImpl(i, z, i2);
            composer.updateRememberedValue(composableLambdaNImpl);
        } else {
            rememberedValue.getClass();
            composableLambdaNImpl = (ComposableLambdaNImpl) rememberedValue;
        }
        composableLambdaNImpl.update(obj);
        composer.endReplaceableGroup();
        return composableLambdaNImpl;
    }

    @ComposeCompilerApi
    public static final ComposableLambdaN composableLambdaNInstance(int i, boolean z, int i2, Object obj) {
        ComposableLambdaNImpl composableLambdaNImpl = new ComposableLambdaNImpl(i, z, i2);
        composableLambdaNImpl.update(obj);
        return composableLambdaNImpl;
    }

    @ComposeCompilerApi
    public static final ComposableLambdaN rememberComposableLambdaN(int i, boolean z, int i2, Object obj, Composer composer, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1441426514, i3, -1, "androidx.compose.runtime.internal.rememberComposableLambdaN (ComposableLambdaN.jvmAndAndroid.kt:171)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ComposableLambdaNImpl(i, z, i2);
            composer.updateRememberedValue(rememberedValue);
        }
        ComposableLambdaNImpl composableLambdaNImpl = (ComposableLambdaNImpl) rememberedValue;
        composableLambdaNImpl.update(obj);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return composableLambdaNImpl;
    }
}
