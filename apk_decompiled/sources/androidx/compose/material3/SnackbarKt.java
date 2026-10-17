package androidx.compose.material3;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SnackbarData;
import androidx.compose.material3.SnackbarKt;
import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import defpackage.iy;
import defpackage.k4;
import defpackage.my;
import defpackage.q10;
import defpackage.w01;
import defpackage.zq0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnackbarKt {
    private static final float ContainerMaxWidth = Dp.m7611constructorimpl(600.0f);
    private static final float HeightToFirstLine = Dp.m7611constructorimpl(30.0f);
    private static final float HorizontalSpacing = Dp.m7611constructorimpl(16.0f);
    private static final float HorizontalSpacingButtonSide = Dp.m7611constructorimpl(8.0f);
    private static final float SeparateButtonExtraY = Dp.m7611constructorimpl(2.0f);
    private static final float SnackbarVerticalPadding = Dp.m7611constructorimpl(6.0f);
    private static final float TextEndExtraSpacing = Dp.m7611constructorimpl(8.0f);
    private static final float LongButtonVerticalOffset = Dp.m7611constructorimpl(12.0f);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NewLineButtonSnackbar-kKq0p4A, reason: not valid java name */
    public static final void m2447NewLineButtonSnackbarkKq0p4A(my myVar, my myVar2, my myVar3, TextStyle textStyle, long j, long j2, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-264666338);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(textStyle) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(j) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(j2) ? Fields.RenderEffect : 65536;
        }
        if (startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-264666338, i2, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:258)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.m814widthInVpY3zN4$default(companion, 0.0f, ContainerMaxWidth, 1, null), 0.0f, 1, null), HorizontalSpacing, 0.0f, 0.0f, SeparateButtonExtraY, 6, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            int i3 = i2;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m766paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            iy constructor = companion3.getConstructor();
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
            my b = k4.b(companion3, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier m621paddingFromBaselineVpY3zN4 = AlignmentLineKt.m621paddingFromBaselineVpY3zN4(companion, HeightToFirstLine, LongButtonVerticalOffset);
            float f = HorizontalSpacingButtonSide;
            Modifier m766paddingqDBjuR0$default2 = PaddingKt.m766paddingqDBjuR0$default(m621paddingFromBaselineVpY3zN4, 0.0f, 0.0f, f, 0.0f, 11, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m766paddingqDBjuR0$default2);
            iy constructor2 = companion3.getConstructor();
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
            my b2 = k4.b(companion3, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
            if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
            }
            Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            myVar.invoke(startRestartGroup, Integer.valueOf(i3 & 14));
            startRestartGroup.endNode();
            Modifier align = columnScopeInstance.align(companion, companion2.getEnd());
            if (myVar3 != null) {
                f = Dp.m7611constructorimpl(0.0f);
            }
            Modifier m766paddingqDBjuR0$default3 = PaddingKt.m766paddingqDBjuR0$default(align, 0.0f, 0.0f, f, 0.0f, 11, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m766paddingqDBjuR0$default3);
            iy constructor3 = companion3.getConstructor();
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
            my b3 = k4.b(companion3, m3878constructorimpl3, maybeCachedBoxMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
            if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                k4.j(b3, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
            }
            Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion3.getSetModifier());
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), startRestartGroup, 0);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            iy constructor4 = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3878constructorimpl4 = Updater.m3878constructorimpl(startRestartGroup);
            my b4 = k4.b(companion3, m3878constructorimpl4, rowMeasurePolicy, m3878constructorimpl4, currentCompositionLocalMap4);
            if (m3878constructorimpl4.getInserting() || !q10.b(m3878constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                k4.j(b4, currentCompositeKeyHash4, m3878constructorimpl4, currentCompositeKeyHash4);
            }
            Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(j)), TextKt.getLocalTextStyle().provides(textStyle)};
            int i4 = ProvidedValue.$stable;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, myVar2, startRestartGroup, (i3 & 112) | i4);
            if (myVar3 != null) {
                startRestartGroup.startReplaceGroup(916269829);
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(j2)), myVar3, startRestartGroup, i4 | ((i3 >> 3) & 112));
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(916475483);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new zq0(myVar, myVar2, myVar3, textStyle, j, j2, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 NewLineButtonSnackbar_kKq0p4A$lambda$6(my myVar, my myVar2, my myVar3, TextStyle textStyle, long j, long j2, int i, Composer composer, int i2) {
        m2447NewLineButtonSnackbarkKq0p4A(myVar, myVar2, myVar3, textStyle, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OneRowSnackbar-kKq0p4A, reason: not valid java name */
    public static final void m2448OneRowSnackbarkKq0p4A(my myVar, my myVar2, my myVar3, TextStyle textStyle, long j, long j2, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-931325388);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(textStyle) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(j) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(j2) ? Fields.RenderEffect : 65536;
        }
        if (startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-931325388, i2, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:303)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(companion, HorizontalSpacing, 0.0f, myVar3 == null ? HorizontalSpacingButtonSide : Dp.m7611constructorimpl(0.0f), 0.0f, 10, null);
            Object rememberedValue = startRestartGroup.rememberedValue();
            int i3 = i2;
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SnackbarKt$OneRowSnackbar$2$1("action", "dismissAction", "text");
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m766paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            iy constructor = companion2.getConstructor();
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
            my b = k4.b(companion2, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
            Modifier m764paddingVpY3zN4$default = PaddingKt.m764paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), 0.0f, SnackbarVerticalPadding, 1, null);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m764paddingVpY3zN4$default);
            iy constructor2 = companion2.getConstructor();
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
            my b2 = k4.b(companion2, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
            if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
            }
            Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            myVar.invoke(startRestartGroup, Integer.valueOf(i3 & 14));
            startRestartGroup.endNode();
            if (myVar2 != null) {
                startRestartGroup.startReplaceGroup(-1014168049);
                Modifier layoutId = LayoutIdKt.layoutId(companion, "action");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
                iy constructor3 = companion2.getConstructor();
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
                my b3 = k4.b(companion2, m3878constructorimpl3, maybeCachedBoxMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    k4.j(b3, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
                }
                Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion2.getSetModifier());
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(j)), TextKt.getLocalTextStyle().provides(textStyle)}, myVar2, startRestartGroup, ProvidedValue.$stable | (i3 & 112));
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1013852841);
                startRestartGroup.endReplaceGroup();
            }
            if (myVar3 != null) {
                startRestartGroup.startReplaceGroup(-1013804481);
                Modifier layoutId2 = LayoutIdKt.layoutId(companion, "dismissAction");
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId2);
                iy constructor4 = companion2.getConstructor();
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3878constructorimpl4 = Updater.m3878constructorimpl(startRestartGroup);
                my b4 = k4.b(companion2, m3878constructorimpl4, maybeCachedBoxMeasurePolicy3, m3878constructorimpl4, currentCompositionLocalMap4);
                if (m3878constructorimpl4.getInserting() || !q10.b(m3878constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    k4.j(b4, currentCompositeKeyHash4, m3878constructorimpl4, currentCompositeKeyHash4);
                }
                Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, companion2.getSetModifier());
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(j2)), myVar3, startRestartGroup, ProvidedValue.$stable | ((i3 >> 3) & 112));
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1013535401);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new zq0(myVar, myVar2, myVar3, textStyle, j, j2, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 OneRowSnackbar_kKq0p4A$lambda$12(my myVar, my myVar2, my myVar3, TextStyle textStyle, long j, long j2, int i, Composer composer, int i2) {
        m2448OneRowSnackbarkKq0p4A(myVar, myVar2, myVar3, textStyle, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* renamed from: Snackbar-eQBnUkQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2449SnackbareQBnUkQ(Modifier modifier, my myVar, my myVar2, boolean z, Shape shape, long j, long j2, long j3, long j4, final my myVar3, Composer composer, final int i, final int i2) {
        int i3;
        my myVar4;
        int i4;
        my myVar5;
        int i5;
        boolean z2;
        Shape shape2;
        long j5;
        int i6;
        Composer composer2;
        final Modifier modifier2;
        final my myVar6;
        final my myVar7;
        final boolean z3;
        final Shape shape3;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        my myVar8;
        boolean z4;
        Shape shape4;
        long j10;
        long j11;
        long j12;
        long j13;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-1218779924);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            myVar4 = myVar;
            i3 |= startRestartGroup.changedInstance(myVar4) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                myVar5 = myVar2;
                i3 |= startRestartGroup.changedInstance(myVar5) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i8 = Fields.Clip;
                                i3 |= i8;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i8 = 8192;
                        i3 |= i8;
                    } else {
                        shape2 = shape;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            j5 = j;
                            if (startRestartGroup.changed(j5)) {
                                i7 = Fields.RenderEffect;
                                i3 |= i7;
                            }
                        } else {
                            j5 = j;
                        }
                        i7 = 65536;
                        i3 |= i7;
                    } else {
                        j5 = j;
                    }
                    if ((i & 1572864) != 0) {
                        i6 = i9;
                        i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j2)) ? 1048576 : Fields.BlendMode;
                    } else {
                        i6 = i9;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= ((i2 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(j3)) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                    if ((100663296 & i) == 0) {
                        i3 |= ((i2 & Fields.RotationX) == 0 && startRestartGroup.changed(j4)) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    if ((i2 & Fields.RotationY) == 0) {
                        i3 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i3 |= startRestartGroup.changedInstance(myVar3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                modifier3 = i6 != 0 ? Modifier.Companion : modifier;
                                if (i10 != 0) {
                                    myVar4 = null;
                                }
                                myVar8 = i4 == 0 ? myVar5 : null;
                                z4 = i5 != 0 ? false : z2;
                                if ((i2 & 16) != 0) {
                                    shape4 = SnackbarDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                    i3 &= -57345;
                                } else {
                                    shape4 = shape2;
                                }
                                if ((i2 & 32) != 0) {
                                    j10 = SnackbarDefaults.INSTANCE.getColor(startRestartGroup, 6);
                                    i3 &= -458753;
                                } else {
                                    j10 = j5;
                                }
                                if ((i2 & 64) != 0) {
                                    j11 = SnackbarDefaults.INSTANCE.getContentColor(startRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    j11 = j2;
                                }
                                if ((i2 & Fields.SpotShadowColor) != 0) {
                                    j12 = SnackbarDefaults.INSTANCE.getActionContentColor(startRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    j12 = j3;
                                }
                                if ((i2 & Fields.RotationX) != 0) {
                                    j13 = SnackbarDefaults.INSTANCE.getDismissActionContentColor(startRestartGroup, 6);
                                    i3 &= -234881025;
                                } else {
                                    j13 = j4;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & Fields.SpotShadowColor) != 0) {
                                    i3 &= -29360129;
                                }
                                if ((i2 & Fields.RotationX) != 0) {
                                    i3 &= -234881025;
                                }
                                modifier3 = modifier;
                                j13 = j4;
                                myVar8 = myVar5;
                                z4 = z2;
                                shape4 = shape2;
                                j10 = j5;
                                j11 = j2;
                                j12 = j3;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1218779924, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:110)");
                            }
                            final my myVar9 = myVar4;
                            final long j14 = j12;
                            final boolean z5 = z4;
                            final long j15 = j13;
                            final my myVar10 = myVar8;
                            Modifier modifier4 = modifier3;
                            int i11 = i3 >> 9;
                            SurfaceKt.m2464SurfaceT9BRK9s(modifier4, shape4, j10, j11, 0.0f, SnackbarTokens.INSTANCE.m3637getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.rememberComposableLambda(-1343524879, true, new my() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                                public final void invoke(Composer composer3, int i12) {
                                    if (!composer3.shouldExecute((i12 & 3) != 2, i12 & 1)) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1343524879, i12, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:118)");
                                    }
                                    SnackbarTokens snackbarTokens = SnackbarTokens.INSTANCE;
                                    TextStyle value = TypographyKt.getValue(snackbarTokens.getSupportingTextFont(), composer3, 6);
                                    final TextStyle value2 = TypographyKt.getValue(snackbarTokens.getActionLabelTextFont(), composer3, 6);
                                    ProvidedValue<TextStyle> provides = TextKt.getLocalTextStyle().provides(value);
                                    final boolean z6 = z5;
                                    final my myVar11 = myVar9;
                                    final my myVar12 = myVar3;
                                    final my myVar13 = myVar10;
                                    final long j16 = j14;
                                    final long j17 = j15;
                                    CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.rememberComposableLambda(969655473, true, new my() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                        public final void invoke(Composer composer4, int i13) {
                                            if (!composer4.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(969655473, i13, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:121)");
                                            }
                                            if (!z6 || myVar11 == null) {
                                                composer4.startReplaceGroup(-168976609);
                                                SnackbarKt.m2448OneRowSnackbarkKq0p4A(myVar12, myVar11, myVar13, value2, j16, j17, composer4, 0);
                                                composer4.endReplaceGroup();
                                            } else {
                                                composer4.startReplaceGroup(-168990288);
                                                SnackbarKt.m2447NewLineButtonSnackbarkKq0p4A(myVar12, myVar11, myVar13, value2, j16, j17, composer4, 0);
                                                composer4.endReplaceGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // defpackage.my
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            invoke((Composer) obj, ((Number) obj2).intValue());
                                            return w01.a;
                                        }
                                    }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.my
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return w01.a;
                                }
                            }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 12779520 | (i11 & 112) | (i11 & 896) | (i11 & 7168), 80);
                            modifier2 = modifier4;
                            composer2 = startRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape3 = shape4;
                            myVar6 = myVar4;
                            j6 = j10;
                            j7 = j11;
                            j8 = j12;
                            z3 = z4;
                            j9 = j13;
                            myVar7 = myVar8;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            myVar6 = myVar4;
                            myVar7 = myVar5;
                            z3 = z2;
                            shape3 = shape2;
                            j6 = j5;
                            j7 = j2;
                            j8 = j3;
                            j9 = j4;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new my() { // from class: br0
                                @Override // defpackage.my
                                public final Object invoke(Object obj, Object obj2) {
                                    w01 Snackbar_eQBnUkQ$lambda$0;
                                    int intValue = ((Integer) obj2).intValue();
                                    Snackbar_eQBnUkQ$lambda$0 = SnackbarKt.Snackbar_eQBnUkQ$lambda$0(Modifier.this, myVar6, myVar7, z3, shape3, j6, j7, j8, j9, myVar3, i, i2, (Composer) obj, intValue);
                                    return Snackbar_eQBnUkQ$lambda$0;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z2 = z;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                if ((i & 1572864) != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((100663296 & i) == 0) {
                }
                if ((i2 & Fields.RotationY) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            myVar5 = myVar2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z2 = z;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            if ((i & 1572864) != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((100663296 & i) == 0) {
            }
            if ((i2 & Fields.RotationY) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        myVar4 = myVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        myVar5 = myVar2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z2 = z;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((100663296 & i) == 0) {
        }
        if ((i2 & Fields.RotationY) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e  */
    /* renamed from: Snackbar-sDKtq54, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2450SnackbarsDKtq54(final SnackbarData snackbarData, Modifier modifier, boolean z, Shape shape, long j, long j2, long j3, long j4, long j5, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        long j6;
        long j7;
        int i5;
        int i6;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        final long j8;
        final long j9;
        final long j10;
        final long j11;
        final long j12;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        Shape shape5;
        boolean z4;
        ComposableLambda composableLambda;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(274621471);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(snackbarData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i11 = Fields.CameraDistance;
                            i3 |= i11;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i11 = Fields.RotationZ;
                    i3 |= i11;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j6 = j;
                        if (startRestartGroup.changed(j6)) {
                            i10 = Fields.Clip;
                            i3 |= i10;
                        }
                    } else {
                        j6 = j;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    j6 = j;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        j7 = j2;
                        if (startRestartGroup.changed(j7)) {
                            i9 = Fields.RenderEffect;
                            i3 |= i9;
                        }
                    } else {
                        j7 = j2;
                    }
                    i9 = 65536;
                    i3 |= i9;
                } else {
                    j7 = j2;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        i7 = i3;
                        i6 = i12;
                        if (startRestartGroup.changed(j3)) {
                            i8 = 1048576;
                            i5 = i7 | i8;
                        }
                    } else {
                        i7 = i3;
                        i6 = i12;
                    }
                    i8 = Fields.BlendMode;
                    i5 = i7 | i8;
                } else {
                    i5 = i3;
                    i6 = i12;
                }
                if ((i & 12582912) == 0) {
                    i5 |= ((i2 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(j4)) ? GroupFlagsKt.IsNodeFlag : 4194304;
                }
                if ((100663296 & i) == 0) {
                    i5 |= ((i2 & Fields.RotationX) == 0 && startRestartGroup.changed(j5)) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                }
                if (startRestartGroup.shouldExecute((38347923 & i5) != 38347922, i5 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i6 != 0 ? Modifier.Companion : modifier2;
                        boolean z5 = i4 != 0 ? false : z2;
                        if ((i2 & 8) != 0) {
                            shape4 = SnackbarDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            i5 &= -7169;
                        } else {
                            shape4 = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            j13 = SnackbarDefaults.INSTANCE.getColor(startRestartGroup, 6);
                            i5 &= -57345;
                        } else {
                            j13 = j6;
                        }
                        if ((i2 & 32) != 0) {
                            j14 = SnackbarDefaults.INSTANCE.getContentColor(startRestartGroup, 6);
                            i5 &= -458753;
                        } else {
                            j14 = j7;
                        }
                        if ((i2 & 64) != 0) {
                            j15 = SnackbarDefaults.INSTANCE.getActionColor(startRestartGroup, 6);
                            i5 &= -3670017;
                        } else {
                            j15 = j3;
                        }
                        if ((i2 & Fields.SpotShadowColor) != 0) {
                            j16 = SnackbarDefaults.INSTANCE.getActionContentColor(startRestartGroup, 6);
                            i5 &= -29360129;
                        } else {
                            j16 = j4;
                        }
                        if ((i2 & Fields.RotationX) != 0) {
                            i5 &= -234881025;
                            j19 = j14;
                            j20 = j16;
                            j17 = SnackbarDefaults.INSTANCE.getDismissActionContentColor(startRestartGroup, 6);
                            shape5 = shape4;
                            j18 = j13;
                        } else {
                            j17 = j5;
                            j18 = j13;
                            j19 = j14;
                            j20 = j16;
                            shape5 = shape4;
                        }
                        z4 = z5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i5 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i5 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i5 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i5 &= -3670017;
                        }
                        if ((i2 & Fields.SpotShadowColor) != 0) {
                            i5 &= -29360129;
                        }
                        if ((i2 & Fields.RotationX) != 0) {
                            i5 &= -234881025;
                        }
                        j20 = j4;
                        j17 = j5;
                        modifier3 = modifier2;
                        z4 = z2;
                        shape5 = shape2;
                        j18 = j6;
                        j19 = j7;
                        j15 = j3;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(274621471, i5, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:206)");
                    }
                    String actionLabel = snackbarData.getVisuals().getActionLabel();
                    ComposableLambda composableLambda2 = null;
                    if (actionLabel != null) {
                        startRestartGroup.startReplaceGroup(-663815981);
                        ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1378313599, true, new SnackbarKt$Snackbar$actionComposable$1(j15, snackbarData, actionLabel), startRestartGroup, 54);
                        startRestartGroup.endReplaceGroup();
                        composableLambda = rememberComposableLambda;
                    } else {
                        startRestartGroup.startReplaceGroup(-663517017);
                        startRestartGroup.endReplaceGroup();
                        composableLambda = null;
                    }
                    if (snackbarData.getVisuals().getWithDismissAction()) {
                        startRestartGroup.startReplaceGroup(-663364652);
                        composableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1812633777, true, new SnackbarKt$Snackbar$dismissActionComposable$1(snackbarData), startRestartGroup, 54);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-662974393);
                        startRestartGroup.endReplaceGroup();
                    }
                    int i13 = i5 << 3;
                    composer2 = startRestartGroup;
                    m2449SnackbareQBnUkQ(PaddingKt.m762padding3ABfNKs(modifier3, Dp.m7611constructorimpl(12.0f)), composableLambda, composableLambda2, z4, shape5, j18, j19, j20, j17, ComposableLambdaKt.rememberComposableLambda(-1266389126, true, new my() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                        public final void invoke(Composer composer3, int i14) {
                            if (!composer3.shouldExecute((i14 & 3) != 2, i14 & 1)) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1266389126, i14, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:246)");
                            }
                            TextKt.m2607TextNvy7gAk(SnackbarData.this.getVisuals().getMessage(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 262142);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // defpackage.my
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return w01.a;
                        }
                    }, startRestartGroup, 54), composer2, (i13 & 3670016) | (i13 & 7168) | 805306368 | (57344 & i13) | (458752 & i13) | (29360128 & i5) | (234881024 & i5), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j10 = j15;
                    z3 = z4;
                    shape3 = shape5;
                    j8 = j18;
                    j9 = j19;
                    j11 = j20;
                    j12 = j17;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                    shape3 = shape2;
                    j8 = j6;
                    j9 = j7;
                    j10 = j3;
                    j11 = j4;
                    j12 = j5;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new my() { // from class: ar0
                        @Override // defpackage.my
                        public final Object invoke(Object obj, Object obj2) {
                            w01 Snackbar_sDKtq54$lambda$1;
                            int intValue = ((Integer) obj2).intValue();
                            Snackbar_sDKtq54$lambda$1 = SnackbarKt.Snackbar_sDKtq54$lambda$1(SnackbarData.this, modifier3, z3, shape3, j8, j9, j10, j11, j12, i, i2, (Composer) obj, intValue);
                            return Snackbar_sDKtq54$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((100663296 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((38347923 & i5) != 38347922, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((100663296 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((38347923 & i5) != 38347922, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Snackbar_eQBnUkQ$lambda$0(Modifier modifier, my myVar, my myVar2, boolean z, Shape shape, long j, long j2, long j3, long j4, my myVar3, int i, int i2, Composer composer, int i3) {
        m2449SnackbareQBnUkQ(modifier, myVar, myVar2, z, shape, j, j2, j3, j4, myVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Snackbar_sDKtq54$lambda$1(SnackbarData snackbarData, Modifier modifier, boolean z, Shape shape, long j, long j2, long j3, long j4, long j5, int i, int i2, Composer composer, int i3) {
        m2450SnackbarsDKtq54(snackbarData, modifier, z, shape, j, j2, j3, j4, j5, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }
}
