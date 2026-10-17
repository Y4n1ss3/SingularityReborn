package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.layout.LookaheadScope;
import defpackage.f30;
import defpackage.ny;
import defpackage.oy;
import defpackage.st;
import defpackage.un;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedTransitionScopeKt$SharedTransitionScope$1 extends f30 implements ny {
    final /* synthetic */ oy $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeKt$SharedTransitionScope$1(oy oyVar) {
        super(3);
        this.$content = oyVar;
    }

    public final void invoke(LookaheadScope lookaheadScope, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2062852661, i, -1, "androidx.compose.animation.SharedTransitionScope.<anonymous> (SharedTransitionScope.kt:144)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, composer);
            composer.updateRememberedValue(rememberedValue);
        }
        un unVar = (un) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SharedTransitionScopeImpl(lookaheadScope, unVar);
            composer.updateRememberedValue(rememberedValue2);
        }
        SharedTransitionScopeImpl sharedTransitionScopeImpl = (SharedTransitionScopeImpl) rememberedValue2;
        this.$content.invoke(sharedTransitionScopeImpl, new SharedTransitionScopeRootModifierElement(sharedTransitionScopeImpl), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((LookaheadScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return w01.a;
    }
}
