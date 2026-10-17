package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.am;
import defpackage.bm;
import defpackage.dq;
import defpackage.er;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes.dex */
public final class ContextualFlowColumnOverflow extends FlowLayoutOverflow {
    public static final int $stable = 0;
    private static final ContextualFlowColumnOverflow Clip;
    public static final Companion Companion = new Companion(null);
    private static final ContextualFlowColumnOverflow Visible;

    static {
        int i = 0;
        ky kyVar = null;
        Visible = new ContextualFlowColumnOverflow(FlowLayoutOverflow.OverflowType.Visible, 0, i, null, kyVar, 30, null);
        Clip = new ContextualFlowColumnOverflow(FlowLayoutOverflow.OverflowType.Clip, i, 0, kyVar, null, 30, null);
    }

    public /* synthetic */ ContextualFlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i, int i2, ky kyVar, ky kyVar2, int i3, dq dqVar) {
        this(overflowType, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : kyVar, (i3 & 16) != 0 ? null : kyVar2);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @er
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final my expandIndicator$lambda$0(ny nyVar, FlowLayoutOverflowState flowLayoutOverflowState) {
            return ComposableLambdaKt.composableLambdaInstance(-800948529, true, new am(flowLayoutOverflowState, nyVar, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 expandIndicator$lambda$0$0(FlowLayoutOverflowState flowLayoutOverflowState, ny nyVar, Composer composer, int i) {
            if (composer.shouldExecute((i & 3) != 2, i & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-800948529, i, -1, "androidx.compose.foundation.layout.ContextualFlowColumnOverflow.Companion.expandIndicator.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:504)");
                }
                nyVar.invoke(new ContextualFlowColumnOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return w01.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final my expandOrCollapseIndicator__jt2gSs$lambda$1$0(ny nyVar, FlowLayoutOverflowState flowLayoutOverflowState) {
            return ComposableLambdaKt.composableLambdaInstance(494662780, true, new am(flowLayoutOverflowState, nyVar, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 expandOrCollapseIndicator__jt2gSs$lambda$1$0$0(FlowLayoutOverflowState flowLayoutOverflowState, ny nyVar, Composer composer, int i) {
            if (composer.shouldExecute((i & 3) != 2, i & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(494662780, i, -1, "androidx.compose.foundation.layout.ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:554)");
                }
                nyVar.invoke(new ContextualFlowColumnOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return w01.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final my expandOrCollapseIndicator__jt2gSs$lambda$1$1(ny nyVar, FlowLayoutOverflowState flowLayoutOverflowState) {
            return ComposableLambdaKt.composableLambdaInstance(1829455235, true, new am(flowLayoutOverflowState, nyVar, 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 expandOrCollapseIndicator__jt2gSs$lambda$1$1$0(FlowLayoutOverflowState flowLayoutOverflowState, ny nyVar, Composer composer, int i) {
            if (composer.shouldExecute((i & 3) != 2, i & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1829455235, i, -1, "androidx.compose.foundation.layout.ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:561)");
                }
                nyVar.invoke(new ContextualFlowColumnOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return w01.a;
        }

        public final ContextualFlowColumnOverflow expandIndicator(ny nyVar) {
            return new ContextualFlowColumnOverflow(FlowLayoutOverflow.OverflowType.ExpandIndicator, 0, 0, new bm(nyVar, 2), null, 22, null);
        }

        /* renamed from: expandOrCollapseIndicator--jt2gSs, reason: not valid java name */
        public final ContextualFlowColumnOverflow m679expandOrCollapseIndicatorjt2gSs(ny nyVar, ny nyVar2, int i, float f, Composer composer, int i2, int i3) {
            int i4 = 1;
            int i5 = (i3 & 4) != 0 ? 1 : i;
            if ((i3 & 8) != 0) {
                f = Dp.m7611constructorimpl(0.0f);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1169622732, i2, -1, "androidx.compose.foundation.layout.ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator (FlowLayoutOverflow.kt:543)");
            }
            int mo361roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo361roundToPx0680j_4(f);
            int i6 = 0;
            boolean changed = ((((i2 & 896) ^ 384) > 256 && composer.changed(i5)) || (i2 & 384) == 256) | composer.changed(mo361roundToPx0680j_4) | ((((i2 & 14) ^ 6) > 4 && composer.changed(nyVar)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(nyVar2)) || (i2 & 48) == 32);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                ContextualFlowColumnOverflow contextualFlowColumnOverflow = new ContextualFlowColumnOverflow(FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator, i5, mo361roundToPx0680j_4, new bm(nyVar, i6), new bm(nyVar2, i4), null);
                composer.updateRememberedValue(contextualFlowColumnOverflow);
                rememberedValue = contextualFlowColumnOverflow;
            }
            ContextualFlowColumnOverflow contextualFlowColumnOverflow2 = (ContextualFlowColumnOverflow) rememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return contextualFlowColumnOverflow2;
        }

        public final ContextualFlowColumnOverflow getClip() {
            return ContextualFlowColumnOverflow.Clip;
        }

        public final ContextualFlowColumnOverflow getVisible() {
            return ContextualFlowColumnOverflow.Visible;
        }

        private Companion() {
        }

        public static /* synthetic */ void getClip$annotations() {
        }

        public static /* synthetic */ void getVisible$annotations() {
        }
    }

    private ContextualFlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i, int i2, ky kyVar, ky kyVar2) {
        super(overflowType, i, i2, kyVar, kyVar2, null);
    }

    public /* synthetic */ ContextualFlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i, int i2, ky kyVar, ky kyVar2, dq dqVar) {
        this(overflowType, i, i2, kyVar, kyVar2);
    }
}
