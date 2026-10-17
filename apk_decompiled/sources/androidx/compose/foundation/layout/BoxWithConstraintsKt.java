package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import defpackage.ae;
import defpackage.my;
import defpackage.ny;
import defpackage.r4;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BoxWithConstraintsKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BoxWithConstraints(Modifier modifier, Alignment alignment, boolean z, ny nyVar, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Alignment alignment2;
        int i4;
        boolean z2;
        Modifier modifier3;
        Alignment alignment3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(380139498);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            alignment2 = alignment;
            i3 |= startRestartGroup.changed(alignment2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changedInstance(nyVar) ? 2048 : Fields.RotationZ;
                }
                if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    modifier3 = i5 != 0 ? Modifier.Companion : modifier2;
                    alignment3 = i6 != 0 ? Alignment.Companion.getTopStart() : alignment2;
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(380139498, i3, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:61)");
                    }
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment3, z2);
                    boolean changed = startRestartGroup.changed(maybeCachedBoxMeasurePolicy) | ((i3 & 7168) == 2048);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new r4(3, maybeCachedBoxMeasurePolicy, nyVar);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    SubcomposeLayoutKt.SubcomposeLayout(modifier3, (my) rememberedValue, startRestartGroup, i3 & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    alignment3 = alignment2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new ae(modifier3, alignment3, z2, nyVar, i, i2));
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        alignment2 = alignment;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult BoxWithConstraints$lambda$0$0(MeasurePolicy measurePolicy, ny nyVar, SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return measurePolicy.mo5measure3p2s80s(subcomposeMeasureScope, subcomposeMeasureScope.subcompose(w01.a, ComposableLambdaKt.composableLambdaInstance(-431986394, true, new g(2, nyVar, new BoxWithConstraintsScopeImpl(subcomposeMeasureScope, constraints.m7570unboximpl(), null)))), constraints.m7570unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BoxWithConstraints$lambda$0$0$0(ny nyVar, BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-431986394, i, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:66)");
            }
            nyVar.invoke(boxWithConstraintsScopeImpl, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BoxWithConstraints$lambda$1(Modifier modifier, Alignment alignment, boolean z, ny nyVar, int i, int i2, Composer composer, int i3) {
        BoxWithConstraints(modifier, alignment, z, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }
}
