package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.f30;
import defpackage.ny;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutKt$materializerOfWithCompositionLocalInjection$1 extends f30 implements ny {
    final /* synthetic */ Modifier $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutKt$materializerOfWithCompositionLocalInjection$1(Modifier modifier) {
        super(3);
        this.$modifier = modifier;
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m6259invokeDeg8D_g(((SkippableUpdater) obj).m3858unboximpl(), (Composer) obj2, ((Number) obj3).intValue());
        return w01.a;
    }

    /* renamed from: invoke-Deg8D_g, reason: not valid java name */
    public final void m6259invokeDeg8D_g(Composer composer, Composer composer2, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2123382363, i, -1, "androidx.compose.ui.layout.materializerOfWithCompositionLocalInjection.<anonymous> (Layout.kt:222)");
        }
        int hashCode = Integer.hashCode(ComposablesKt.getCurrentCompositeKeyHash(composer2, 0));
        Modifier materializeWithCompositionLocalInjectionInternal = ComposedModifierKt.materializeWithCompositionLocalInjectionInternal(composer2, this.$modifier);
        composer.startReplaceableGroup(509942095);
        Composer m3878constructorimpl = Updater.m3878constructorimpl(composer);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Updater.m3886setimpl(m3878constructorimpl, materializeWithCompositionLocalInjectionInternal, companion.getSetModifier());
        Updater.m3886setimpl(m3878constructorimpl, Integer.valueOf(hashCode), companion.getSetCompositeKeyHash());
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
