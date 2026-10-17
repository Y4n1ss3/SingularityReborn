package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import defpackage.er;
import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TestModifierUpdaterKt {
    @er
    public static final void TestModifierUpdaterLayout(ky kyVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1673066036);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(kyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1673066036, i2, -1, "androidx.compose.ui.layout.TestModifierUpdaterLayout (TestModifierUpdater.kt:48)");
            }
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        return MeasureScope.layout$default(measureScope, Constraints.m7564getMaxWidthimpl(j), Constraints.m7563getMaxHeightimpl(j), null, AnonymousClass1.INSTANCE, 4, null);
                    }

                    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                    /* renamed from: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1$1$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends f30 implements ky {
                        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                        public AnonymousClass1() {
                            super(1);
                        }

                        @Override // defpackage.ky
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return w01.a;
                        }

                        public final void invoke(Placeable.PlacementScope placementScope) {
                        }
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            iy constructor$ui = LayoutNode.Companion.getConstructor$ui();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor$ui);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Updater.m3886setimpl(m3878constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m3886setimpl(m3878constructorimpl, Integer.valueOf(hashCode), companion.getSetCompositeKeyHash());
            Updater.m3883initimpl(m3878constructorimpl, new TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1(kyVar));
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TestModifierUpdaterKt$TestModifierUpdaterLayout$2(kyVar, i));
        }
    }
}
