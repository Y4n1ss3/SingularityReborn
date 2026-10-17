package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LookaheadScopeKt {
    private static final my defaultPlacementApproachInProgress = LookaheadScopeKt$defaultPlacementApproachInProgress$1.INSTANCE;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LookaheadScope(ny nyVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(441837433);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(nyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(441837433, i2, -1, "androidx.compose.ui.layout.LookaheadScope (LookaheadScope.kt:49)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new LookaheadScopeImpl(null, i3, 0 == true ? 1 : 0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            LookaheadScopeImpl lookaheadScopeImpl = (LookaheadScopeImpl) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = LookaheadScopeKt$LookaheadScope$1$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            iy iyVar = (iy) rememberedValue2;
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(iyVar);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
            Updater.m3883initimpl(m3878constructorimpl, LookaheadScopeKt$LookaheadScope$2$1.INSTANCE);
            Updater.m3886setimpl(m3878constructorimpl, lookaheadScopeImpl, LookaheadScopeKt$LookaheadScope$2$2.INSTANCE);
            nyVar.invoke(lookaheadScopeImpl, startRestartGroup, Integer.valueOf((i2 << 3) & 112));
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LookaheadScopeKt$LookaheadScope$4(nyVar, i));
        }
    }

    public static final Modifier approachLayout(Modifier modifier, ky kyVar, my myVar, ny nyVar) {
        return modifier.then(new ApproachLayoutElement(nyVar, kyVar, myVar));
    }

    public static /* synthetic */ Modifier approachLayout$default(Modifier modifier, ky kyVar, my myVar, ny nyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            myVar = defaultPlacementApproachInProgress;
        }
        return approachLayout(modifier, kyVar, myVar, nyVar);
    }

    /* renamed from: localLookaheadPositionOf-Fgt4K4Q, reason: not valid java name */
    public static final long m6266localLookaheadPositionOfFgt4K4Q(LookaheadScope lookaheadScope, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j, boolean z) {
        LayoutCoordinates lookaheadCoordinates = lookaheadScope.toLookaheadCoordinates(layoutCoordinates);
        LayoutCoordinates lookaheadCoordinates2 = lookaheadScope.toLookaheadCoordinates(layoutCoordinates2);
        return lookaheadCoordinates instanceof LookaheadLayoutCoordinates ? ((LookaheadLayoutCoordinates) lookaheadCoordinates).mo6244localPositionOfS_NoaFU(lookaheadCoordinates2, j, z) : lookaheadCoordinates2 instanceof LookaheadLayoutCoordinates ? Offset.m4508constructorimpl(((LookaheadLayoutCoordinates) lookaheadCoordinates2).mo6244localPositionOfS_NoaFU(lookaheadCoordinates, j, z) ^ (-9223372034707292160L)) : lookaheadCoordinates.mo6244localPositionOfS_NoaFU(lookaheadCoordinates, j, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LayoutCoordinates lookaheadScopeCoordinates(LookaheadScope lookaheadScope, LayoutCoordinates layoutCoordinates) {
        if (layoutCoordinates instanceof LookaheadCapablePlaceable) {
            return lookaheadScope.getLookaheadScopeCoordinates(((LookaheadCapablePlaceable) layoutCoordinates).getPlacementScope());
        }
        o.t(layoutCoordinates, "Invalid LayoutCoordinates: ");
        return null;
    }
}
