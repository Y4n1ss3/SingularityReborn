package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.BadgeTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.HorizontalRuler;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.VerticalRuler;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import defpackage.h7;
import defpackage.iy;
import defpackage.k4;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BadgeKt {
    private static final float BadgeWithContentHorizontalPadding = Dp.m7611constructorimpl(4.0f);
    private static final float BadgeWithContentHorizontalOffset = Dp.m7611constructorimpl(12.0f);
    private static final float BadgeWithContentVerticalOffset = Dp.m7611constructorimpl(14.0f);
    private static final float BadgeOffset = Dp.m7611constructorimpl(6.0f);
    private static final HorizontalRuler BadgeTopRuler = new HorizontalRuler();
    private static final VerticalRuler BadgeEndRuler = new VerticalRuler();

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0182, code lost:
    
        if (defpackage.q10.b(r13.rememberedValue(), java.lang.Integer.valueOf(r6)) == false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x007f  */
    /* renamed from: Badge-eopBjH0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1638BadgeeopBjH0(Modifier modifier, long j, long j2, ny nyVar, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        final ny nyVar2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        Shape value;
        BadgeTokens badgeTokens;
        Composer startRestartGroup = composer.startRestartGroup(1428256508);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            j3 = j;
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changed(j3)) ? 32 : 16;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            j4 = j2;
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j4)) ? Fields.RotationX : Fields.SpotShadowColor;
        } else {
            j4 = j2;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            nyVar2 = nyVar;
            i3 |= startRestartGroup.changedInstance(nyVar2) ? Fields.CameraDistance : Fields.RotationZ;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    modifier4 = i4 != 0 ? Modifier.Companion : modifier2;
                    if ((i2 & 2) != 0) {
                        j3 = BadgeDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        j4 = ColorSchemeKt.m1797contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                    }
                    if (i5 != 0) {
                        nyVar2 = null;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier4 = modifier2;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1428256508, i3, -1, "androidx.compose.material3.Badge (Badge.kt:155)");
                }
                BadgeTokens badgeTokens2 = BadgeTokens.INSTANCE;
                float m3031getLargeSizeD9Ej5fM = nyVar2 != null ? badgeTokens2.m3031getLargeSizeD9Ej5fM() : badgeTokens2.m3032getSizeD9Ej5fM();
                if (nyVar2 != null) {
                    startRestartGroup.startReplaceGroup(-1051012910);
                    value = ShapesKt.getValue(badgeTokens2.getLargeShape(), startRestartGroup, 6);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1050955529);
                    value = ShapesKt.getValue(badgeTokens2.getShape(), startRestartGroup, 6);
                    startRestartGroup.endReplaceGroup();
                }
                Modifier then = BackgroundKt.m226backgroundbw27NRU(SizeKt.m791defaultMinSizeVpY3zN4(modifier4, m3031getLargeSizeD9Ej5fM, m3031getLargeSizeD9Ej5fM), j3, value).then(nyVar2 != null ? PaddingKt.m764paddingVpY3zN4$default(Modifier.Companion, BadgeWithContentHorizontalPadding, 0.0f, 2, null) : Modifier.Companion);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterVertically(), startRestartGroup, 54);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                iy constructor = companion.getConstructor();
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
                my b = k4.b(companion, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                if (m3878constructorimpl.getInserting()) {
                    badgeTokens = badgeTokens2;
                } else {
                    badgeTokens = badgeTokens2;
                }
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                if (nyVar2 != null) {
                    startRestartGroup.startReplaceGroup(1345815094);
                    ProvideContentColorTextStyleKt.m2902ProvideContentColorTextStyle3JVO9M(j4, TypographyKt.getValue(badgeTokens.getLargeLabelTextFont(), startRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(541712501, true, new my() { // from class: androidx.compose.material3.BadgeKt$Badge$1$1
                        public final void invoke(Composer composer3, int i6) {
                            if (!composer3.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(541712501, i6, -1, "androidx.compose.material3.Badge.<anonymous>.<anonymous> (Badge.kt:184)");
                            }
                            ny.this.invoke(rowScopeInstance, composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // defpackage.my
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return w01.a;
                        }
                    }, startRestartGroup, 54), startRestartGroup, ((i3 >> 6) & 14) | 384);
                    composer2 = startRestartGroup;
                    composer2.endReplaceGroup();
                } else {
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(1346141834);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            final long j5 = j3;
            final long j6 = j4;
            final ny nyVar3 = nyVar2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new my() { // from class: lc
                    @Override // defpackage.my
                    public final Object invoke(Object obj, Object obj2) {
                        w01 Badge_eopBjH0$lambda$4;
                        int intValue = ((Integer) obj2).intValue();
                        Badge_eopBjH0$lambda$4 = BadgeKt.Badge_eopBjH0$lambda$4(Modifier.this, j5, j6, nyVar3, i, i2, (Composer) obj, intValue);
                        return Badge_eopBjH0$lambda$4;
                    }
                });
                return;
            }
            return;
        }
        nyVar2 = nyVar;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        final long j52 = j3;
        final long j62 = j4;
        final ny nyVar32 = nyVar2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Badge_eopBjH0$lambda$4(Modifier modifier, long j, long j2, ny nyVar, int i, int i2, Composer composer, int i3) {
        m1638BadgeeopBjH0(modifier, j, j2, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BadgedBox(ny nyVar, Modifier modifier, ny nyVar2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1693825945);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(nyVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(nyVar2) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1693825945, i3, -1, "androidx.compose.material3.BadgedBox (Badge.kt:67)");
                }
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = BadgeKt$BadgedBox$1$1.INSTANCE;
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                iy constructor = companion.getConstructor();
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
                my b = k4.b(companion, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                }
                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                Modifier.Companion companion2 = Modifier.Companion;
                Modifier layoutId = LayoutIdKt.layoutId(companion2, "anchor");
                Alignment.Companion companion3 = Alignment.Companion;
                int i5 = ((i3 << 3) & 7168) | 54;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
                iy constructor2 = companion.getConstructor();
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3878constructorimpl2 = Updater.m3878constructorimpl(startRestartGroup);
                my b2 = k4.b(companion, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                }
                Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                nyVar2.invoke(boxScopeInstance, startRestartGroup, Integer.valueOf(((i5 >> 6) & 112) | 6));
                startRestartGroup.endNode();
                Modifier layoutId2 = LayoutIdKt.layoutId(companion2, "badge");
                int i6 = ((i3 << 9) & 7168) | 6;
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId2);
                iy constructor3 = companion.getConstructor();
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3878constructorimpl3 = Updater.m3878constructorimpl(startRestartGroup);
                my b3 = k4.b(companion, m3878constructorimpl3, maybeCachedBoxMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    k4.j(b3, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
                }
                Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion.getSetModifier());
                nyVar.invoke(boxScopeInstance, startRestartGroup, Integer.valueOf(((i6 >> 6) & 112) | 6));
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new defpackage.g1(nyVar, modifier3, nyVar2, i, i2, 2));
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BadgedBox$lambda$2(ny nyVar, Modifier modifier, ny nyVar2, int i, int i2, Composer composer, int i3) {
        BadgedBox(nyVar, modifier, nyVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    public static final Modifier badgeBounds(Modifier modifier) {
        return LayoutModifierKt.layout(modifier, new defpackage.i1(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult badgeBounds$lambda$7(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(constraints.m7570unboximpl());
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new defpackage.d1(26), new h7(1, mo6234measureBRTryo0), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 badgeBounds$lambda$7$lambda$5(RulerScope rulerScope) {
        rulerScope.provides(BadgeEndRuler, (int) (rulerScope.getCoordinates().mo6242getSizeYbymL2g() >> 32));
        rulerScope.provides(BadgeTopRuler, 0.0f);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 badgeBounds$lambda$7$lambda$6(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return w01.a;
    }

    public static final VerticalRuler getBadgeEndRuler() {
        return BadgeEndRuler;
    }

    public static final float getBadgeOffset() {
        return BadgeOffset;
    }

    public static final HorizontalRuler getBadgeTopRuler() {
        return BadgeTopRuler;
    }

    public static final float getBadgeWithContentHorizontalOffset() {
        return BadgeWithContentHorizontalOffset;
    }

    public static final float getBadgeWithContentHorizontalPadding() {
        return BadgeWithContentHorizontalPadding;
    }

    public static final float getBadgeWithContentVerticalOffset() {
        return BadgeWithContentVerticalOffset;
    }
}
