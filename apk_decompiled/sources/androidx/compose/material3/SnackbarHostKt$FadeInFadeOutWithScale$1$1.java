package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.dj;
import defpackage.fc;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnackbarHostKt$FadeInFadeOutWithScale$1$1 implements ny {
    final /* synthetic */ String $a11yPaneTitle;
    final /* synthetic */ SnackbarData $current;
    final /* synthetic */ SnackbarData $key;
    final /* synthetic */ FadeInFadeOutState<SnackbarData> $state;

    public SnackbarHostKt$FadeInFadeOutWithScale$1$1(SnackbarData snackbarData, SnackbarData snackbarData2, FadeInFadeOutState<SnackbarData> fadeInFadeOutState, String str) {
        this.$key = snackbarData;
        this.$current = snackbarData2;
        this.$state = fadeInFadeOutState;
        this.$a11yPaneTitle = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$2$lambda$1(SnackbarData snackbarData, FadeInFadeOutState fadeInFadeOutState) {
        if (!q10.b(snackbarData, fadeInFadeOutState.getCurrent())) {
            dj.g0(new o(snackbarData, 7), fadeInFadeOutState.getItems());
            RecomposeScope scope = fadeInFadeOutState.getScope();
            if (scope != null) {
                scope.invalidate();
            }
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$2$lambda$1$lambda$0(SnackbarData snackbarData, FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem) {
        return q10.b(fadeInFadeOutAnimationItem.getKey(), snackbarData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$5$lambda$4(boolean z, String str, SnackbarData snackbarData, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (z) {
            SemanticsPropertiesKt.m6846setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m6820getPolite0phEisY());
        }
        SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new c1(snackbarData, 0), 1, null);
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$5$lambda$4$lambda$3(SnackbarData snackbarData) {
        snackbarData.dismiss();
        return true;
    }

    public final void invoke(my myVar, Composer composer, int i) {
        int i2;
        State animatedOpacity;
        State animatedScale;
        Modifier m4923graphicsLayerAp8cVGQ;
        if ((i & 6) == 0) {
            i2 = i | (composer.changedInstance(myVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1952400805, i2, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:338)");
        }
        boolean b = q10.b(this.$key, this.$current);
        FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer, 6);
        boolean changed = composer.changed(this.$key) | composer.changedInstance(this.$state);
        SnackbarData snackbarData = this.$key;
        FadeInFadeOutState<SnackbarData> fadeInFadeOutState = this.$state;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new h(5, snackbarData, fadeInFadeOutState);
            composer.updateRememberedValue(rememberedValue);
        }
        animatedOpacity = SnackbarHostKt.animatedOpacity(value, b, (iy) rememberedValue, composer, 0, 0);
        animatedScale = SnackbarHostKt.animatedScale(MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer, 6), b, composer, 0);
        m4923graphicsLayerAp8cVGQ = GraphicsLayerModifierKt.m4923graphicsLayerAp8cVGQ(Modifier.Companion, (r41 & 1) != 0 ? 1.0f : ((Number) animatedScale.getValue()).floatValue(), (r41 & 2) != 0 ? 1.0f : ((Number) animatedScale.getValue()).floatValue(), (r41 & 4) == 0 ? ((Number) animatedOpacity.getValue()).floatValue() : 1.0f, (r41 & 8) != 0 ? 0.0f : 0.0f, (r41 & 16) != 0 ? 0.0f : 0.0f, (r41 & 32) != 0 ? 0.0f : 0.0f, (r41 & 64) != 0 ? 0.0f : 0.0f, (r41 & Fields.SpotShadowColor) != 0 ? 0.0f : 0.0f, (r41 & Fields.RotationX) == 0 ? 0.0f : 0.0f, (r41 & Fields.RotationY) != 0 ? 8.0f : 0.0f, (r41 & Fields.RotationZ) != 0 ? TransformOrigin.Companion.m5174getCenterSzJe1aQ() : 0L, (r41 & Fields.CameraDistance) != 0 ? RectangleShapeKt.getRectangleShape() : null, (r41 & Fields.TransformOrigin) != 0 ? false : false, (r41 & 8192) != 0 ? null : null, (r41 & Fields.Clip) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (32768 & r41) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (r41 & 65536) != 0 ? CompositingStrategy.Companion.m4850getAutoNrFUSI() : 0);
        boolean changed2 = composer.changed(b) | composer.changed(this.$key) | composer.changed(this.$a11yPaneTitle);
        String str = this.$a11yPaneTitle;
        SnackbarData snackbarData2 = this.$key;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new d1(b, str, snackbarData2);
            composer.updateRememberedValue(rememberedValue2);
        }
        Modifier semantics$default = SemanticsModifierKt.semantics$default(m4923graphicsLayerAp8cVGQ, false, (ky) rememberedValue2, 1, null);
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, semantics$default);
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
        my b2 = k4.b(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            k4.j(b2, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
        }
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (fc.l(myVar, composer, i2 & 14)) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((my) obj, (Composer) obj2, ((Number) obj3).intValue());
        return w01.a;
    }
}
