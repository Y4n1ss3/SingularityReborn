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
public final class FlowColumnOverflow extends FlowLayoutOverflow {
    public static final int $stable = 0;
    private static final FlowColumnOverflow Clip;
    public static final Companion Companion = new Companion(null);
    private static final FlowColumnOverflow Visible;

    static {
        int i = 0;
        ky kyVar = null;
        Visible = new FlowColumnOverflow(FlowLayoutOverflow.OverflowType.Visible, 0, i, null, kyVar, 30, null);
        Clip = new FlowColumnOverflow(FlowLayoutOverflow.OverflowType.Clip, i, 0, kyVar, null, 30, null);
    }

    public /* synthetic */ FlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i, int i2, ky kyVar, ky kyVar2, int i3, dq dqVar) {
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
            return ComposableLambdaKt.composableLambdaInstance(-1176120337, true, new am(flowLayoutOverflowState, nyVar, 6));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 expandIndicator$lambda$0$0(FlowLayoutOverflowState flowLayoutOverflowState, ny nyVar, Composer composer, int i) {
            if (composer.shouldExecute((i & 3) != 2, i & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1176120337, i, -1, "androidx.compose.foundation.layout.FlowColumnOverflow.Companion.expandIndicator.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:231)");
                }
                nyVar.invoke(new FlowColumnOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
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
            return ComposableLambdaKt.composableLambdaInstance(1455675245, true, new am(flowLayoutOverflowState, nyVar, 7));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 expandOrCollapseIndicator__jt2gSs$lambda$1$0$0(FlowLayoutOverflowState flowLayoutOverflowState, ny nyVar, Composer composer, int i) {
            if (composer.shouldExecute((i & 3) != 2, i & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1455675245, i, -1, "androidx.compose.foundation.layout.FlowColumnOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:278)");
                }
                nyVar.invoke(new FlowColumnOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
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
            return ComposableLambdaKt.composableLambdaInstance(-892739916, true, new am(flowLayoutOverflowState, nyVar, 8));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 expandOrCollapseIndicator__jt2gSs$lambda$1$1$0(FlowLayoutOverflowState flowLayoutOverflowState, ny nyVar, Composer composer, int i) {
            if (composer.shouldExecute((i & 3) != 2, i & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-892739916, i, -1, "androidx.compose.foundation.layout.FlowColumnOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:285)");
                }
                nyVar.invoke(new FlowColumnOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return w01.a;
        }

        public final FlowColumnOverflow expandIndicator(ny nyVar) {
            return new FlowColumnOverflow(FlowLayoutOverflow.OverflowType.ExpandIndicator, 0, 0, new bm(nyVar, 6), null, 22, null);
        }

        /* renamed from: expandOrCollapseIndicator--jt2gSs, reason: not valid java name */
        public final FlowColumnOverflow m685expandOrCollapseIndicatorjt2gSs(ny nyVar, ny nyVar2, int i, float f, Composer composer, int i2, int i3) {
            boolean z = true;
            int i4 = (i3 & 4) != 0 ? 1 : i;
            int i5 = 8;
            if ((i3 & 8) != 0) {
                f = Dp.m7611constructorimpl(0.0f);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(582202068, i2, -1, "androidx.compose.foundation.layout.FlowColumnOverflow.Companion.expandOrCollapseIndicator (FlowLayoutOverflow.kt:267)");
            }
            int mo361roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo361roundToPx0680j_4(f);
            boolean changed = ((((i2 & 896) ^ 384) > 256 && composer.changed(i4)) || (i2 & 384) == 256) | composer.changed(mo361roundToPx0680j_4) | ((((i2 & 14) ^ 6) > 4 && composer.changed(nyVar)) || (i2 & 6) == 4);
            if ((((i2 & 112) ^ 48) <= 32 || !composer.changed(nyVar2)) && (i2 & 48) != 32) {
                z = false;
            }
            boolean z2 = changed | z;
            Object rememberedValue = composer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                FlowColumnOverflow flowColumnOverflow = new FlowColumnOverflow(FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator, i4, mo361roundToPx0680j_4, new bm(nyVar, 7), new bm(nyVar2, i5), null);
                composer.updateRememberedValue(flowColumnOverflow);
                rememberedValue = flowColumnOverflow;
            }
            FlowColumnOverflow flowColumnOverflow2 = (FlowColumnOverflow) rememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return flowColumnOverflow2;
        }

        public final FlowColumnOverflow getClip() {
            return FlowColumnOverflow.Clip;
        }

        public final FlowColumnOverflow getVisible() {
            return FlowColumnOverflow.Visible;
        }

        private Companion() {
        }

        public static /* synthetic */ void getClip$annotations() {
        }

        public static /* synthetic */ void getVisible$annotations() {
        }
    }

    private FlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i, int i2, ky kyVar, ky kyVar2) {
        super(overflowType, i, i2, kyVar, kyVar2, null);
    }

    public /* synthetic */ FlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i, int i2, ky kyVar, ky kyVar2, dq dqVar) {
        this(overflowType, i, i2, kyVar, kyVar2);
    }
}
