package androidx.compose.runtime;

import defpackage.er;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.o;
import defpackage.q10;
import defpackage.yn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposablesKt {
    public static final <T, E extends Applier<?>> void ComposeNode(iy iyVar, ky kyVar, Composer composer, int i) {
        composer.getApplier();
        q10.G();
        throw null;
    }

    public static final <T, E extends Applier<?>> void ReusableComposeNode(iy iyVar, ky kyVar, Composer composer, int i) {
        composer.getApplier();
        q10.G();
        throw null;
    }

    public static final void ReusableContent(Object obj, my myVar, Composer composer, int i) {
        composer.startReusableGroup(ComposerKt.reuseKey, obj);
        myVar.invoke(composer, Integer.valueOf((i >> 3) & 14));
        composer.endReusableGroup();
    }

    public static final void ReusableContentHost(boolean z, my myVar, Composer composer, int i) {
        composer.startReusableGroup(ComposerKt.reuseKey, Boolean.valueOf(z));
        boolean changed = composer.changed(z);
        if (z) {
            myVar.invoke(composer, Integer.valueOf((i >> 3) & 14));
        } else {
            composer.deactivateToEndGroup(changed);
        }
        composer.endReusableGroup();
    }

    public static final Composer getCurrentComposer(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554250212, i, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:191)");
        }
        throw new yn("Implemented as an intrinsic");
    }

    public static final int getCurrentCompositeKeyHash(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(524444915, i, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:252)");
        }
        int compoundKeyHash = composer.getCompoundKeyHash();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compoundKeyHash;
    }

    public static final long getCurrentCompositeKeyHashCode(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-168259424, i, -1, "androidx.compose.runtime.<get-currentCompositeKeyHashCode> (Composables.kt:268)");
        }
        long compositeKeyHashCode = composer.getCompositeKeyHashCode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compositeKeyHashCode;
    }

    public static final CompositionContext getCurrentCompositionContext(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1645225943, i, -1, "androidx.compose.runtime.<get-currentCompositionContext> (Composables.kt:206)");
        }
        ControlledComposition composition = composer.getComposition();
        composition.getClass();
        CompositionContext parent = ((CompositionImpl) composition).getParent();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return parent;
    }

    public static final CompositionLocalContext getCurrentCompositionLocalContext(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-43352356, i, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:231)");
        }
        CompositionLocalContext compositionLocalContext = new CompositionLocalContext(composer.buildContext().getCompositionLocalScope$runtime());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compositionLocalContext;
    }

    public static final RecomposeScope getCurrentRecomposeScope(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394957799, i, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:216)");
        }
        RecomposeScope recomposeScope = composer.getRecomposeScope();
        if (recomposeScope == null) {
            o.f("no recompose scope found");
            return null;
        }
        composer.recordUsed(recomposeScope);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return recomposeScope;
    }

    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final <T> T key(Object[] objArr, my myVar, Composer composer, int i) {
        return (T) myVar.invoke(composer, Integer.valueOf((i >> 3) & 14));
    }

    public static final <T> T remember(Object[] objArr, iy iyVar, Composer composer, int i) {
        boolean z = false;
        for (Object obj : objArr) {
            z |= composer.changed(obj);
        }
        T t = (T) composer.rememberedValue();
        if (!z && t != Composer.Companion.getEmpty()) {
            return t;
        }
        T t2 = (T) iyVar.invoke();
        composer.updateRememberedValue(t2);
        return t2;
    }

    public static final CompositionContext rememberCompositionContext(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1165786124, i, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:516)");
        }
        CompositionContext buildContext = composer.buildContext();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buildContext;
    }

    public static final <T, E extends Applier<?>> void ComposeNode(iy iyVar, ky kyVar, my myVar, Composer composer, int i) {
        composer.getApplier();
        q10.G();
        throw null;
    }

    public static final <T, E extends Applier<?>> void ReusableComposeNode(iy iyVar, ky kyVar, my myVar, Composer composer, int i) {
        composer.getApplier();
        q10.G();
        throw null;
    }

    public static final <T, E extends Applier<?>> void ComposeNode(iy iyVar, ky kyVar, ny nyVar, my myVar, Composer composer, int i) {
        composer.getApplier();
        q10.G();
        throw null;
    }

    public static final <T, E extends Applier<?>> void ReusableComposeNode(iy iyVar, ky kyVar, ny nyVar, my myVar, Composer composer, int i) {
        composer.getApplier();
        q10.G();
        throw null;
    }

    public static final <T> T remember(Object obj, Object obj2, iy iyVar, Composer composer, int i) {
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        T t = (T) composer.rememberedValue();
        if (!changed && t != Composer.Companion.getEmpty()) {
            return t;
        }
        T t2 = (T) iyVar.invoke();
        composer.updateRememberedValue(t2);
        return t2;
    }

    @er
    public static /* synthetic */ void getCurrentCompositeKeyHash$annotations(Composer composer, int i) {
    }

    public static /* synthetic */ void getCurrentCompositionContext$annotations(Composer composer, int i) {
    }

    public static /* synthetic */ void getCurrentCompositionLocalContext$annotations(Composer composer, int i) {
    }

    public static final <T> T remember(Object obj, Object obj2, Object obj3, iy iyVar, Composer composer, int i) {
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        T t = (T) composer.rememberedValue();
        if (!changed && t != Composer.Companion.getEmpty()) {
            return t;
        }
        T t2 = (T) iyVar.invoke();
        composer.updateRememberedValue(t2);
        return t2;
    }

    public static final <T> T remember(Object obj, iy iyVar, Composer composer, int i) {
        boolean changed = composer.changed(obj);
        T t = (T) composer.rememberedValue();
        if (!changed && t != Composer.Companion.getEmpty()) {
            return t;
        }
        T t2 = (T) iyVar.invoke();
        composer.updateRememberedValue(t2);
        return t2;
    }

    public static final <T> T remember(iy iyVar, Composer composer, int i) {
        T t = (T) composer.rememberedValue();
        if (t != Composer.Companion.getEmpty()) {
            return t;
        }
        T t2 = (T) iyVar.invoke();
        composer.updateRememberedValue(t2);
        return t2;
    }
}
