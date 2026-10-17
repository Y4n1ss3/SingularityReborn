package androidx.compose.animation;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.f30;
import defpackage.iy;
import defpackage.k4;
import defpackage.ny;
import defpackage.oy;
import defpackage.uo;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedTransitionScopeKt$SharedTransitionLayout$1 extends f30 implements oy {
    final /* synthetic */ ny $content;
    final /* synthetic */ Modifier $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeKt$SharedTransitionLayout$1(Modifier modifier, ny nyVar) {
        super(4);
        this.$modifier = modifier;
        this.$content = nyVar;
    }

    public final void invoke(SharedTransitionScope sharedTransitionScope, Modifier modifier, Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = (composer.changed(sharedTransitionScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composer.changed(modifier) ? 32 : 16;
        }
        if (!composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1948801580, i2, -1, "androidx.compose.animation.SharedTransitionLayout.<anonymous> (SharedTransitionScope.kt:124)");
        }
        Modifier then = this.$modifier.then(modifier);
        ny nyVar = this.$content;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, then);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        iy constructor = companion.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m3878constructorimpl = Updater.m3878constructorimpl(composer);
        uo.h(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        nyVar.invoke(sharedTransitionScope, composer, Integer.valueOf(i2 & 14));
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.oy
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((SharedTransitionScope) obj, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return w01.a;
    }
}
