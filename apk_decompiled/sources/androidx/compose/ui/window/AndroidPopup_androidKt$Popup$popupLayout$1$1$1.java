package androidx.compose.ui.window;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import defpackage.f30;
import defpackage.fc;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.uo;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidPopup_androidKt$Popup$popupLayout$1$1$1 extends f30 implements my {
    final /* synthetic */ State<my> $currentContent$delegate;
    final /* synthetic */ PopupLayout $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidPopup_androidKt$Popup$popupLayout$1$1$1(PopupLayout popupLayout, State<? extends my> state) {
        super(2);
        this.$this_apply = popupLayout;
        this.$currentContent$delegate = state;
    }

    public final void invoke(Composer composer, int i) {
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-297523940, i, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:440)");
        }
        CompositionLocalKt.CompositionLocalProvider(AndroidPopup_androidKt.getLocalIsInPopupLayout().provides(Boolean.TRUE), ComposableLambdaKt.rememberComposableLambda(1022273628, true, new AnonymousClass1(this.$this_apply, this.$currentContent$delegate), composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f30 implements my {
        final /* synthetic */ State<my> $currentContent$delegate;
        final /* synthetic */ PopupLayout $this_apply;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(PopupLayout popupLayout, State<? extends my> state) {
            super(2);
            this.$this_apply = popupLayout;
            this.$currentContent$delegate = state;
        }

        public final void invoke(Composer composer, int i) {
            my Popup$lambda$0;
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1022273628, i, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:441)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (rememberedValue == companion2.getEmpty()) {
                rememberedValue = AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1.INSTANCE;
                composer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (ky) rememberedValue, 1, null);
            boolean changedInstance = composer.changedInstance(this.$this_apply);
            PopupLayout popupLayout = this.$this_apply;
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == companion2.getEmpty()) {
                rememberedValue2 = new AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1(popupLayout);
                composer.updateRememberedValue(rememberedValue2);
            }
            Modifier alpha = AlphaKt.alpha(OnRemeasuredModifierKt.onSizeChanged(semantics$default, (ky) rememberedValue2), this.$this_apply.getCanCalculatePosition() ? 1.0f : 0.0f);
            Popup$lambda$0 = AndroidPopup_androidKt.Popup$lambda$0(this.$currentContent$delegate);
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion2.getEmpty()) {
                rememberedValue3 = AndroidPopup_androidKt$SimpleStack$1$1.INSTANCE;
                composer.updateRememberedValue(rememberedValue3);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, alpha);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            iy constructor = companion3.getConstructor();
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
            uo.h(companion3, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            Updater.m3886setimpl(m3878constructorimpl, Integer.valueOf(hashCode), companion3.getSetCompositeKeyHash());
            Updater.m3884reconcileimpl(m3878constructorimpl, companion3.getApplyOnDeactivatedNodeAssertion());
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
            if (fc.l(Popup$lambda$0, composer, 0)) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // defpackage.my
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return w01.a;
        }
    }
}
