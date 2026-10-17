package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
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
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import defpackage.ai;
import defpackage.bi;
import defpackage.ci;
import defpackage.ed;
import defpackage.ei;
import defpackage.er;
import defpackage.gi;
import defpackage.hi;
import defpackage.ii;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChipKt {
    private static final PaddingValues AssistChipPadding;
    private static final PaddingValues FilterChipPadding;
    private static final float HorizontalElementsPadding;
    private static final String LabelLayoutId = "label";
    private static final String LeadingIconLayoutId = "leadingIcon";
    private static final PaddingValues SuggestionChipPadding;
    private static final String TrailingIconLayoutId = "trailingIcon";

    static {
        float m7611constructorimpl = Dp.m7611constructorimpl(8.0f);
        HorizontalElementsPadding = m7611constructorimpl;
        AssistChipPadding = PaddingKt.m757PaddingValuesYgX7TsA$default(m7611constructorimpl, 0.0f, 2, null);
        FilterChipPadding = PaddingKt.m757PaddingValuesYgX7TsA$default(m7611constructorimpl, 0.0f, 2, null);
        SuggestionChipPadding = PaddingKt.m757PaddingValuesYgX7TsA$default(m7611constructorimpl, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AnimatingChipContent-fe0OD_I, reason: not valid java name */
    public static final void m1722AnimatingChipContentfe0OD_I(final my myVar, TextStyle textStyle, long j, my myVar2, my myVar3, my myVar4, long j2, long j3, final float f, final PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        my myVar5;
        my myVar6;
        my myVar7;
        long j4;
        long j5;
        Composer startRestartGroup = composer.startRestartGroup(-2070754602);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            myVar5 = myVar2;
            i2 |= startRestartGroup.changedInstance(myVar5) ? Fields.CameraDistance : Fields.RotationZ;
        } else {
            myVar5 = myVar2;
        }
        if ((i & 24576) == 0) {
            myVar6 = myVar3;
            i2 |= startRestartGroup.changedInstance(myVar6) ? Fields.Clip : 8192;
        } else {
            myVar6 = myVar3;
        }
        if ((196608 & i) == 0) {
            myVar7 = myVar4;
            i2 |= startRestartGroup.changedInstance(myVar7) ? Fields.RenderEffect : 65536;
        } else {
            myVar7 = myVar4;
        }
        if ((1572864 & i) == 0) {
            j4 = j2;
            i2 |= startRestartGroup.changed(j4) ? 1048576 : Fields.BlendMode;
        } else {
            j4 = j2;
        }
        if ((12582912 & i) == 0) {
            j5 = j3;
            i2 |= startRestartGroup.changed(j5) ? GroupFlagsKt.IsNodeFlag : 4194304;
        } else {
            j5 = j3;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i2 |= startRestartGroup.changed(paddingValues) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if (startRestartGroup.shouldExecute((i2 & 306783379) != 306783378, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2070754602, i2, -1, "androidx.compose.material3.AnimatingChipContent (Chip.kt:2114)");
            }
            final my myVar8 = myVar5;
            final my myVar9 = myVar6;
            final my myVar10 = myVar7;
            final long j6 = j4;
            final long j7 = j5;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(j)), TextKt.getLocalTextStyle().provides(textStyle)}, ComposableLambdaKt.rememberComposableLambda(-668234218, true, new my() { // from class: androidx.compose.material3.ChipKt$AnimatingChipContent$1
                public final void invoke(Composer composer2, int i3) {
                    Modifier.Companion companion;
                    Modifier modifier;
                    boolean z;
                    float f2;
                    if (!composer2.shouldExecute((i3 & 3) != 2, i3 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-668234218, i3, -1, "androidx.compose.material3.AnimatingChipContent.<anonymous> (Chip.kt:2120)");
                    }
                    FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.SlowEffects, composer2, 6);
                    FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer2, 6);
                    FiniteAnimationSpec value3 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer2, 6);
                    FiniteAnimationSpec value4 = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer2, 6);
                    Modifier.Companion companion2 = Modifier.Companion;
                    Modifier padding = PaddingKt.padding(SizeKt.m792defaultMinSizeVpY3zN4$default(companion2, 0.0f, f, 1, null), paddingValues);
                    Object rememberedValue = composer2.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new ChipLayoutMeasurePolicy();
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    ChipLayoutMeasurePolicy chipLayoutMeasurePolicy = (ChipLayoutMeasurePolicy) rememberedValue;
                    final my myVar11 = myVar9;
                    final my myVar12 = myVar8;
                    final my myVar13 = myVar10;
                    final long j8 = j6;
                    my myVar14 = myVar;
                    final long j9 = j7;
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, padding);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    iy constructor = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3878constructorimpl = Updater.m3878constructorimpl(composer2);
                    Updater.m3886setimpl(m3878constructorimpl, chipLayoutMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m3886setimpl(m3878constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    my setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        k4.j(setCompositeKeyHash, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    }
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
                    Modifier layoutId = LayoutIdKt.layoutId(companion2, "leadingIcon");
                    if (myVar11 == null && myVar12 == null) {
                        companion = companion2;
                        modifier = layoutId;
                        z = false;
                    } else {
                        companion = companion2;
                        modifier = layoutId;
                        z = true;
                    }
                    Alignment.Companion companion4 = Alignment.Companion;
                    Modifier.Companion companion5 = companion;
                    AnimatedVisibilityKt.AnimatedVisibility(z, modifier, EnterExitTransitionKt.expandHorizontally$default(value3, companion4.getStart(), false, null, 12, null).plus(EnterExitTransitionKt.fadeIn$default(value, 0.0f, 2, null)), EnterExitTransitionKt.shrinkHorizontally$default(value4, companion4.getStart(), false, null, 12, null).plus(EnterExitTransitionKt.fadeOut$default(value2, 0.0f, 2, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(687705959, true, new ny() { // from class: androidx.compose.material3.ChipKt$AnimatingChipContent$1$2$1
                        public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, int i4) {
                            my m1730leadingContentXOJAsU;
                            State rememberRetainedState;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(687705959, i4, -1, "androidx.compose.material3.AnimatingChipContent.<anonymous>.<anonymous>.<anonymous> (Chip.kt:2145)");
                            }
                            m1730leadingContentXOJAsU = ChipKt.m1730leadingContentXOJAsU(my.this, myVar12, j8, composer3, 0);
                            rememberRetainedState = ChipKt.rememberRetainedState(m1730leadingContentXOJAsU, composer3, 0);
                            Alignment center = Alignment.Companion.getCenter();
                            Modifier.Companion companion6 = Modifier.Companion;
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, companion6);
                            ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                            iy constructor2 = companion7.getConstructor();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer3);
                            my b = k4.b(companion7, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                            if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                k4.j(b, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                            }
                            Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion7.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            my myVar15 = (my) rememberRetainedState.getValue();
                            if (myVar15 == null) {
                                composer3.startReplaceGroup(-1538103400);
                            } else {
                                composer3.startReplaceGroup(-326710903);
                                myVar15.invoke(composer3, 0);
                            }
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // defpackage.ny
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                            return w01.a;
                        }
                    }, composer2, 54), composer2, 196656, 16);
                    Modifier layoutId2 = LayoutIdKt.layoutId(companion5, "label");
                    f2 = ChipKt.HorizontalElementsPadding;
                    Modifier m764paddingVpY3zN4$default = PaddingKt.m764paddingVpY3zN4$default(layoutId2, f2, 0.0f, 2, null);
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion4.getCenterVertically(), composer2, 54);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m764paddingVpY3zN4$default);
                    iy constructor2 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer2);
                    my b = k4.b(companion3, m3878constructorimpl2, rowMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                    if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        k4.j(b, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                    }
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion3.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    myVar14.invoke(composer2, 0);
                    composer2.endNode();
                    AnimatedVisibilityKt.AnimatedVisibility(myVar13 != null, LayoutIdKt.layoutId(companion5, "trailingIcon"), EnterExitTransitionKt.expandHorizontally$default(value3, companion4.getEnd(), false, null, 12, null).plus(EnterExitTransitionKt.fadeIn$default(value, 0.0f, 2, null)), EnterExitTransitionKt.shrinkHorizontally$default(value4, companion4.getEnd(), false, null, 12, null).plus(EnterExitTransitionKt.fadeOut$default(value2, 0.0f, 2, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(1905252304, true, new ny() { // from class: androidx.compose.material3.ChipKt$AnimatingChipContent$1$2$3
                        public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, int i4) {
                            my m1731trailingContentRPmYEkk;
                            State rememberRetainedState;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1905252304, i4, -1, "androidx.compose.material3.AnimatingChipContent.<anonymous>.<anonymous>.<anonymous> (Chip.kt:2183)");
                            }
                            m1731trailingContentRPmYEkk = ChipKt.m1731trailingContentRPmYEkk(my.this, j9, composer3, 0);
                            rememberRetainedState = ChipKt.rememberRetainedState(m1731trailingContentRPmYEkk, composer3, 0);
                            Alignment center = Alignment.Companion.getCenter();
                            Modifier.Companion companion6 = Modifier.Companion;
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, companion6);
                            ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                            iy constructor3 = companion7.getConstructor();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor3);
                            } else {
                                composer3.useNode();
                            }
                            Composer m3878constructorimpl3 = Updater.m3878constructorimpl(composer3);
                            my b2 = k4.b(companion7, m3878constructorimpl3, maybeCachedBoxMeasurePolicy, m3878constructorimpl3, currentCompositionLocalMap3);
                            if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                k4.j(b2, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
                            }
                            Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion7.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            my myVar15 = (my) rememberRetainedState.getValue();
                            if (myVar15 == null) {
                                composer3.startReplaceGroup(-2101783313);
                            } else {
                                composer3.startReplaceGroup(-344894126);
                                myVar15.invoke(composer3, 0);
                            }
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // defpackage.ny
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                            return w01.a;
                        }
                    }, composer2, 54), composer2, 196656, 16);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return w01.a;
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new bi(myVar, textStyle, j, myVar2, myVar3, myVar4, j2, j3, f, paddingValues, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 AnimatingChipContent_fe0OD_I$lambda$24(my myVar, TextStyle textStyle, long j, my myVar2, my myVar3, my myVar4, long j2, long j3, float f, PaddingValues paddingValues, int i, Composer composer, int i2) {
        m1722AnimatingChipContentfe0OD_I(myVar, textStyle, j, myVar2, myVar3, myVar4, j2, j3, f, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v33, types: [androidx.compose.foundation.BorderStroke] */
    /* JADX WARN: Type inference failed for: r4v35 */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void AssistChip(iy iyVar, my myVar, Modifier modifier, boolean z, my myVar2, my myVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2, int i3) {
        int i4;
        my myVar4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        my myVar5;
        int i7;
        ChipColors chipColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        my myVar6;
        Shape shape2;
        ChipElevation chipElevation2;
        MutableInteractionSource mutableInteractionSource2;
        boolean z3;
        ChipColors chipColors3;
        Modifier modifier3;
        my myVar7;
        ChipBorder chipBorder2;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        int i12;
        Modifier modifier4;
        int i13;
        Composer composer3;
        int i14;
        ChipElevation chipElevation3;
        ChipBorder chipBorder3;
        int i15;
        MutableInteractionSource mutableInteractionSource3;
        ChipElevation chipElevation4;
        my myVar8;
        BorderStroke borderStroke;
        my myVar9;
        Modifier modifier5;
        Shape shape4;
        State<BorderStroke> borderStroke$material3;
        int i16;
        int i17;
        int i18;
        Composer startRestartGroup = composer.startRestartGroup(1930061919);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            myVar4 = myVar;
        } else {
            myVar4 = myVar;
            if ((i & 48) == 0) {
                i4 |= startRestartGroup.changedInstance(myVar4) ? 32 : 16;
            }
        }
        int i19 = i3 & 4;
        if (i19 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    myVar5 = myVar2;
                    i4 |= startRestartGroup.changedInstance(myVar5) ? Fields.Clip : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i4 |= startRestartGroup.changedInstance(myVar3) ? Fields.RenderEffect : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape)) ? 1048576 : Fields.BlendMode;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & Fields.SpotShadowColor) == 0) {
                            chipColors2 = chipColors;
                            if (startRestartGroup.changed(chipColors2)) {
                                i18 = GroupFlagsKt.IsNodeFlag;
                                i4 |= i18;
                            }
                        } else {
                            chipColors2 = chipColors;
                        }
                        i18 = 4194304;
                        i4 |= i18;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i3 & Fields.RotationX) == 0 && startRestartGroup.changed(chipElevation)) {
                            i17 = GroupFlagsKt.IsRecompositionRequiredFlag;
                            i4 |= i17;
                        }
                        i17 = GroupFlagsKt.HasAuxSlotFlag;
                        i4 |= i17;
                    }
                    if ((i & 805306368) == 0) {
                        if ((i3 & Fields.RotationY) == 0 && startRestartGroup.changed(chipBorder)) {
                            i16 = GroupFlagsKt.HasMovableContentFlag;
                            i4 |= i16;
                        }
                        i16 = GroupFlagsKt.IsMovableContentFlag;
                        i4 |= i16;
                    }
                    i8 = i3 & Fields.RotationZ;
                    if (i8 == 0) {
                        i9 = i8;
                        i10 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i9 = i8;
                        i10 = i2 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                    } else {
                        i9 = i8;
                        i10 = i2;
                    }
                    i11 = i4;
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i11 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        myVar6 = myVar3;
                        shape2 = shape;
                        chipElevation2 = chipElevation;
                        mutableInteractionSource2 = mutableInteractionSource;
                        z3 = z2;
                        chipColors3 = chipColors2;
                        modifier3 = modifier2;
                        myVar7 = myVar5;
                        chipBorder2 = chipBorder;
                    } else {
                        startRestartGroup.startDefaults();
                        int i20 = i10;
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier6 = i19 != 0 ? Modifier.Companion : modifier2;
                            boolean z4 = i5 == 0 ? z2 : true;
                            my myVar10 = i6 != 0 ? null : myVar5;
                            my myVar11 = i7 != 0 ? null : myVar3;
                            if ((i3 & 64) != 0) {
                                i12 = i11 & (-3670017);
                                shape3 = AssistChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            } else {
                                shape3 = shape;
                                i12 = i11;
                            }
                            if ((i3 & Fields.SpotShadowColor) != 0) {
                                chipColors2 = AssistChipDefaults.INSTANCE.assistChipColors(startRestartGroup, 6);
                                i12 &= -29360129;
                            }
                            ChipColors chipColors4 = chipColors2;
                            int i21 = i12;
                            if ((i3 & Fields.RotationX) != 0) {
                                composer3 = startRestartGroup;
                                modifier4 = modifier6;
                                i13 = 6;
                                i14 = i20;
                                i21 &= -234881025;
                                chipElevation3 = AssistChipDefaults.INSTANCE.m1633assistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer3, 1572864, 63);
                            } else {
                                modifier4 = modifier6;
                                i13 = 6;
                                composer3 = startRestartGroup;
                                i14 = i20;
                                chipElevation3 = chipElevation;
                            }
                            if ((i3 & Fields.RotationY) != 0) {
                                startRestartGroup = composer3;
                                chipBorder3 = AssistChipDefaults.INSTANCE.m1630assistChipBorderd_3_b6Q(0L, 0L, 0.0f, startRestartGroup, 3072, 7);
                                i15 = i21 & (-1879048193);
                            } else {
                                startRestartGroup = composer3;
                                chipBorder3 = chipBorder;
                                i15 = i21;
                            }
                            if (i9 != 0) {
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            chipElevation4 = chipElevation3;
                            myVar8 = myVar11;
                            z2 = z4;
                            borderStroke = 0;
                            myVar9 = myVar10;
                            chipColors2 = chipColors4;
                            modifier5 = modifier4;
                            shape4 = shape3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            int i22 = (i3 & 64) != 0 ? i11 & (-3670017) : i11;
                            if ((i3 & Fields.SpotShadowColor) != 0) {
                                i22 &= -29360129;
                            }
                            if ((i3 & Fields.RotationX) != 0) {
                                i22 &= -234881025;
                            }
                            if ((i3 & Fields.RotationY) != 0) {
                                i22 &= -1879048193;
                            }
                            shape4 = shape;
                            chipElevation4 = chipElevation;
                            chipBorder3 = chipBorder;
                            mutableInteractionSource3 = mutableInteractionSource;
                            i13 = 6;
                            modifier5 = modifier2;
                            borderStroke = 0;
                            i15 = i22;
                            myVar9 = myVar5;
                            i14 = i20;
                            myVar8 = myVar3;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1930061919, i15, i14, "androidx.compose.material3.AssistChip (Chip.kt:231)");
                        }
                        TextStyle value = TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, i13);
                        long m1713labelColorvNxB06k$material3 = chipColors2.m1713labelColorvNxB06k$material3(z2);
                        if (chipBorder3 == null) {
                            startRestartGroup.startReplaceGroup(1748832781);
                            startRestartGroup.endReplaceGroup();
                            borderStroke$material3 = borderStroke;
                        } else {
                            startRestartGroup.startReplaceGroup(-636322700);
                            borderStroke$material3 = chipBorder3.borderStroke$material3(z2, startRestartGroup, ((i15 >> 9) & 14) | ((i15 >> 24) & 112));
                            startRestartGroup.endReplaceGroup();
                        }
                        if (borderStroke$material3 != null) {
                            borderStroke = borderStroke$material3.getValue();
                        }
                        int i23 = i15 << 6;
                        ChipColors chipColors5 = chipColors2;
                        composer2 = startRestartGroup;
                        boolean z5 = z2;
                        m1723ChipnkUnTEs(modifier5, iyVar, z5, myVar4, value, m1713labelColorvNxB06k$material3, myVar9, myVar8, shape4, chipColors5, chipElevation4, borderStroke, AssistChipDefaults.INSTANCE.m1636getHeightD9Ej5fM(), AssistChipPadding, mutableInteractionSource3, composer2, ((i15 >> 6) & 14) | ((i15 << 3) & 112) | ((i15 >> 3) & 896) | (i23 & 7168) | (3670016 & i23) | (29360128 & i23) | (234881024 & i23) | (i23 & 1879048192), ((i15 >> 24) & 14) | 3456 | ((i14 << 12) & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        chipBorder2 = chipBorder3;
                        modifier3 = modifier5;
                        z3 = z5;
                        myVar7 = myVar9;
                        myVar6 = myVar8;
                        shape2 = shape4;
                        chipColors3 = chipColors5;
                        chipElevation2 = chipElevation4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new ii(iyVar, myVar, modifier3, z3, myVar7, myVar6, shape2, chipColors3, chipElevation2, chipBorder2, mutableInteractionSource2, i, i2, i3, 1));
                        return;
                    }
                    return;
                }
                myVar5 = myVar2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i8 = i3 & Fields.RotationZ;
                if (i8 == 0) {
                }
                i11 = i4;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i11 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            myVar5 = myVar2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i8 = i3 & Fields.RotationZ;
            if (i8 == 0) {
            }
            i11 = i4;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i11 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        myVar5 = myVar2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i8 = i3 & Fields.RotationZ;
        if (i8 == 0) {
        }
        i11 = i4;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i11 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 AssistChip$lambda$0(iy iyVar, my myVar, Modifier modifier, boolean z, my myVar2, my myVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        AssistChip(iyVar, myVar, modifier, z, myVar2, myVar3, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 AssistChip$lambda$2(iy iyVar, my myVar, Modifier modifier, boolean z, my myVar2, my myVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        AssistChip(iyVar, myVar, modifier, z, myVar2, myVar3, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* renamed from: Chip-nkUnTEs, reason: not valid java name */
    private static final void m1723ChipnkUnTEs(final Modifier modifier, final iy iyVar, final boolean z, final my myVar, final TextStyle textStyle, final long j, final my myVar2, final my myVar3, final Shape shape, final ChipColors chipColors, final ChipElevation chipElevation, final BorderStroke borderStroke, final float f, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        my myVar4;
        int i4;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        Composer startRestartGroup = composer.startRestartGroup(892465622);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(iyVar) ? 32 : 16;
        }
        int i5 = i & 384;
        int i6 = Fields.SpotShadowColor;
        if (i5 == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        int i7 = i & 3072;
        int i8 = Fields.RotationZ;
        if (i7 == 0) {
            myVar4 = myVar;
            i3 |= startRestartGroup.changedInstance(myVar4) ? 2048 : 1024;
        } else {
            myVar4 = myVar;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(textStyle) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= startRestartGroup.changed(j) ? Fields.RenderEffect : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar2) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar3) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(shape) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(chipColors) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changed(chipElevation) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(borderStroke) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (startRestartGroup.changed(f)) {
                i6 = 256;
            }
            i4 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (startRestartGroup.changed(paddingValues)) {
                i8 = 2048;
            }
            i4 |= i8;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
        }
        int i9 = i4;
        if (startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i9 & 9363) == 9362) ? false : true, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(892465622, i3, i9, "androidx.compose.material3.Chip (Chip.kt:1957)");
            }
            if (mutableInteractionSource2 == null) {
                startRestartGroup.startReplaceGroup(1596346437);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
            } else {
                startRestartGroup.startReplaceGroup(-1333978926);
                startRestartGroup.endReplaceGroup();
            }
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new ed(19);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            State<Dp> state = null;
            Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, (ky) rememberedValue2, 1, null);
            long m1703containerColorvNxB06k$material3 = chipColors.m1703containerColorvNxB06k$material3(z);
            if (chipElevation == null) {
                startRestartGroup.startReplaceGroup(1596621344);
            } else {
                startRestartGroup.startReplaceGroup(-1333969407);
                state = chipElevation.shadowElevation$material3(z, mutableInteractionSource2, startRestartGroup, ((i3 >> 6) & 14) | ((i9 << 6) & 896));
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            int i10 = i3;
            final my myVar5 = myVar4;
            SurfaceKt.m2467Surfaceo_FOJdg(iyVar, semantics$default, z, shape, m1703containerColorvNxB06k$material3, 0L, 0.0f, state != null ? state.getValue().m7625unboximpl() : Dp.m7611constructorimpl(0.0f), borderStroke, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(-70915349, true, new my() { // from class: androidx.compose.material3.ChipKt$Chip$2
                public final void invoke(Composer composer3, int i11) {
                    if (!composer3.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-70915349, i11, -1, "androidx.compose.material3.Chip.<anonymous> (Chip.kt:1970)");
                    }
                    ChipKt.m1724ChipContentfe0OD_I(my.this, textStyle, j, myVar2, null, myVar3, chipColors.m1714leadingIconContentColorvNxB06k$material3(z), chipColors.m1715trailingIconContentColorvNxB06k$material3(z), f, paddingValues, composer3, 24576);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return w01.a;
                }
            }, composer2, 54), composer2, ((i10 >> 15) & 7168) | ((i10 >> 3) & 14) | (i10 & 896) | ((i9 << 21) & 234881024), 6, 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: fi
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 Chip_nkUnTEs$lambda$18;
                    int intValue = ((Integer) obj2).intValue();
                    Chip_nkUnTEs$lambda$18 = ChipKt.Chip_nkUnTEs$lambda$18(Modifier.this, iyVar, z, myVar, textStyle, j, myVar2, myVar3, shape, chipColors, chipElevation, borderStroke, f, paddingValues, mutableInteractionSource, i, i2, (Composer) obj, intValue);
                    return Chip_nkUnTEs$lambda$18;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ChipContent-fe0OD_I, reason: not valid java name */
    public static final void m1724ChipContentfe0OD_I(final my myVar, TextStyle textStyle, long j, my myVar2, my myVar3, my myVar4, long j2, long j3, final float f, final PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        my myVar5;
        my myVar6;
        my myVar7;
        long j4;
        long j5;
        Composer startRestartGroup = composer.startRestartGroup(1105630840);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            myVar5 = myVar2;
            i2 |= startRestartGroup.changedInstance(myVar5) ? Fields.CameraDistance : Fields.RotationZ;
        } else {
            myVar5 = myVar2;
        }
        if ((i & 24576) == 0) {
            myVar6 = myVar3;
            i2 |= startRestartGroup.changedInstance(myVar6) ? Fields.Clip : 8192;
        } else {
            myVar6 = myVar3;
        }
        if ((196608 & i) == 0) {
            myVar7 = myVar4;
            i2 |= startRestartGroup.changedInstance(myVar7) ? Fields.RenderEffect : 65536;
        } else {
            myVar7 = myVar4;
        }
        if ((1572864 & i) == 0) {
            j4 = j2;
            i2 |= startRestartGroup.changed(j4) ? 1048576 : Fields.BlendMode;
        } else {
            j4 = j2;
        }
        if ((12582912 & i) == 0) {
            j5 = j3;
            i2 |= startRestartGroup.changed(j5) ? GroupFlagsKt.IsNodeFlag : 4194304;
        } else {
            j5 = j3;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i2 |= startRestartGroup.changed(paddingValues) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if (startRestartGroup.shouldExecute((i2 & 306783379) != 306783378, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1105630840, i2, -1, "androidx.compose.material3.ChipContent (Chip.kt:2052)");
            }
            final my myVar8 = myVar5;
            final my myVar9 = myVar6;
            final my myVar10 = myVar7;
            final long j6 = j4;
            final long j7 = j5;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(j)), TextKt.getLocalTextStyle().provides(textStyle)}, ComposableLambdaKt.rememberComposableLambda(-2130105544, true, new my() { // from class: androidx.compose.material3.ChipKt$ChipContent$1
                public final void invoke(Composer composer2, int i3) {
                    ComposeUiNode.Companion companion;
                    my m1730leadingContentXOJAsU;
                    float f2;
                    my m1731trailingContentRPmYEkk;
                    if (!composer2.shouldExecute((i3 & 3) != 2, i3 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2130105544, i3, -1, "androidx.compose.material3.ChipContent.<anonymous> (Chip.kt:2057)");
                    }
                    Modifier.Companion companion2 = Modifier.Companion;
                    Modifier padding = PaddingKt.padding(SizeKt.m792defaultMinSizeVpY3zN4$default(companion2, 0.0f, f, 1, null), paddingValues);
                    Object rememberedValue = composer2.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new ChipLayoutMeasurePolicy();
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    ChipLayoutMeasurePolicy chipLayoutMeasurePolicy = (ChipLayoutMeasurePolicy) rememberedValue;
                    my myVar11 = myVar9;
                    my myVar12 = myVar8;
                    my myVar13 = myVar10;
                    long j8 = j6;
                    my myVar14 = myVar;
                    long j9 = j7;
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, padding);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    iy constructor = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3878constructorimpl = Updater.m3878constructorimpl(composer2);
                    Updater.m3886setimpl(m3878constructorimpl, chipLayoutMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m3886setimpl(m3878constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    my setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        k4.j(setCompositeKeyHash, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    }
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
                    if (myVar11 == null && myVar12 == null) {
                        composer2.startReplaceGroup(-410471693);
                        composer2.endReplaceGroup();
                        companion = companion3;
                    } else {
                        composer2.startReplaceGroup(-410987750);
                        Modifier layoutId = LayoutIdKt.layoutId(companion2, "leadingIcon");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, layoutId);
                        iy constructor2 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer2);
                        my b = k4.b(companion3, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                        if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            k4.j(b, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                        }
                        Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        companion = companion3;
                        m1730leadingContentXOJAsU = ChipKt.m1730leadingContentXOJAsU(myVar11, myVar12, j8, composer2, 0);
                        if (m1730leadingContentXOJAsU != null) {
                            composer2.startReplaceGroup(-1737425918);
                            m1730leadingContentXOJAsU.invoke(composer2, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1737349038);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    }
                    Modifier layoutId2 = LayoutIdKt.layoutId(companion2, "label");
                    f2 = ChipKt.HorizontalElementsPadding;
                    Modifier m763paddingVpY3zN4 = PaddingKt.m763paddingVpY3zN4(layoutId2, f2, Dp.m7611constructorimpl(0.0f));
                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                    Alignment.Companion companion4 = Alignment.Companion;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion4.getCenterVertically(), composer2, 54);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m763paddingVpY3zN4);
                    iy constructor3 = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3878constructorimpl3 = Updater.m3878constructorimpl(composer2);
                    my b2 = k4.b(companion, m3878constructorimpl3, rowMeasurePolicy, m3878constructorimpl3, currentCompositionLocalMap3);
                    if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        k4.j(b2, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
                    }
                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    myVar14.invoke(composer2, 0);
                    composer2.endNode();
                    if (myVar13 != null) {
                        composer2.startReplaceGroup(-410073157);
                        Modifier layoutId3 = LayoutIdKt.layoutId(companion2, "trailingIcon");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, layoutId3);
                        iy constructor4 = companion.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor4);
                        } else {
                            composer2.useNode();
                        }
                        Composer m3878constructorimpl4 = Updater.m3878constructorimpl(composer2);
                        my b3 = k4.b(companion, m3878constructorimpl4, maybeCachedBoxMeasurePolicy2, m3878constructorimpl4, currentCompositionLocalMap4);
                        if (m3878constructorimpl4.getInserting() || !q10.b(m3878constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            k4.j(b3, currentCompositeKeyHash4, m3878constructorimpl4, currentCompositeKeyHash4);
                        }
                        Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, companion.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        m1731trailingContentRPmYEkk = ChipKt.m1731trailingContentRPmYEkk(myVar13, j9, composer2, 0);
                        if (m1731trailingContentRPmYEkk != null) {
                            composer2.startReplaceGroup(1073690090);
                            m1731trailingContentRPmYEkk.invoke(composer2, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1073767931);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-409588813);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return w01.a;
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new bi(myVar, textStyle, j, myVar2, myVar3, myVar4, j2, j3, f, paddingValues, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ChipContent_fe0OD_I$lambda$23(my myVar, TextStyle textStyle, long j, my myVar2, my myVar3, my myVar4, long j2, long j3, float f, PaddingValues paddingValues, int i, Composer composer, int i2) {
        m1724ChipContentfe0OD_I(myVar, textStyle, j, myVar2, myVar3, myVar4, j2, j3, f, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Chip_nkUnTEs$lambda$17$lambda$16(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6847setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m6828getButtono7Vup1c());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Chip_nkUnTEs$lambda$18(Modifier modifier, iy iyVar, boolean z, my myVar, TextStyle textStyle, long j, my myVar2, my myVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, float f, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        m1723ChipnkUnTEs(modifier, iyVar, z, myVar, textStyle, j, myVar2, myVar3, shape, chipColors, chipElevation, borderStroke, f, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return w01.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v33, types: [androidx.compose.foundation.BorderStroke] */
    /* JADX WARN: Type inference failed for: r4v35 */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void ElevatedAssistChip(iy iyVar, my myVar, Modifier modifier, boolean z, my myVar2, my myVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2, int i3) {
        int i4;
        my myVar4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        my myVar5;
        int i7;
        ChipColors chipColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        my myVar6;
        ChipElevation chipElevation2;
        MutableInteractionSource mutableInteractionSource2;
        boolean z3;
        Composer composer2;
        Shape shape2;
        ChipColors chipColors3;
        Modifier modifier3;
        my myVar7;
        ChipBorder chipBorder2;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        int i14;
        Modifier modifier4;
        int i15;
        int i16;
        ChipElevation chipElevation3;
        int i17;
        MutableInteractionSource mutableInteractionSource3;
        ChipElevation chipElevation4;
        ChipBorder chipBorder3;
        my myVar8;
        BorderStroke borderStroke;
        my myVar9;
        Modifier modifier5;
        Shape shape4;
        State<BorderStroke> borderStroke$material3;
        int i18;
        int i19;
        Composer startRestartGroup = composer.startRestartGroup(-759567147);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            myVar4 = myVar;
        } else {
            myVar4 = myVar;
            if ((i & 48) == 0) {
                i4 |= startRestartGroup.changedInstance(myVar4) ? 32 : 16;
            }
        }
        int i20 = i3 & 4;
        if (i20 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    myVar5 = myVar2;
                    i4 |= startRestartGroup.changedInstance(myVar5) ? Fields.Clip : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i4 |= startRestartGroup.changedInstance(myVar3) ? Fields.RenderEffect : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape)) ? 1048576 : Fields.BlendMode;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & Fields.SpotShadowColor) == 0) {
                            chipColors2 = chipColors;
                            if (startRestartGroup.changed(chipColors2)) {
                                i19 = GroupFlagsKt.IsNodeFlag;
                                i4 |= i19;
                            }
                        } else {
                            chipColors2 = chipColors;
                        }
                        i19 = 4194304;
                        i4 |= i19;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i3 & Fields.RotationX) == 0 && startRestartGroup.changed(chipElevation)) {
                            i18 = GroupFlagsKt.IsRecompositionRequiredFlag;
                            i4 |= i18;
                        }
                        i18 = GroupFlagsKt.HasAuxSlotFlag;
                        i4 |= i18;
                    }
                    i8 = i3 & Fields.RotationY;
                    if (i8 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i9 = i8;
                        i4 |= startRestartGroup.changed(chipBorder) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i10 = i3 & Fields.RotationZ;
                        if (i10 != 0) {
                            i11 = i10;
                            i12 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i11 = i10;
                            i12 = i2 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                        } else {
                            i11 = i10;
                            i12 = i2;
                        }
                        i13 = i4;
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i13 & 1)) {
                            startRestartGroup.startDefaults();
                            int i21 = i12;
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier6 = i20 != 0 ? Modifier.Companion : modifier2;
                                boolean z4 = i5 == 0 ? z2 : true;
                                my myVar10 = i6 != 0 ? null : myVar5;
                                my myVar11 = i7 != 0 ? null : myVar3;
                                if ((i3 & 64) != 0) {
                                    i14 = i13 & (-3670017);
                                    shape3 = AssistChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                } else {
                                    shape3 = shape;
                                    i14 = i13;
                                }
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    chipColors2 = AssistChipDefaults.INSTANCE.elevatedAssistChipColors(startRestartGroup, 6);
                                    i14 &= -29360129;
                                }
                                ChipColors chipColors4 = chipColors2;
                                int i22 = i14;
                                if ((i3 & Fields.RotationX) != 0) {
                                    modifier4 = modifier6;
                                    i16 = i21;
                                    i15 = 6;
                                    chipElevation3 = AssistChipDefaults.INSTANCE.m1635elevatedAssistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                                    i17 = i22 & (-234881025);
                                } else {
                                    modifier4 = modifier6;
                                    i15 = 6;
                                    i16 = i21;
                                    chipElevation3 = chipElevation;
                                    i17 = i22;
                                }
                                ChipBorder chipBorder4 = i9 != 0 ? null : chipBorder;
                                if (i11 != 0) {
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    chipElevation4 = chipElevation3;
                                    chipBorder3 = chipBorder4;
                                    mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    chipElevation4 = chipElevation3;
                                    chipBorder3 = chipBorder4;
                                }
                                myVar8 = myVar11;
                                z2 = z4;
                                borderStroke = 0;
                                myVar9 = myVar10;
                                chipColors2 = chipColors4;
                                modifier5 = modifier4;
                                shape4 = shape3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                int i23 = (i3 & 64) != 0 ? i13 & (-3670017) : i13;
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    i23 &= -29360129;
                                }
                                if ((i3 & Fields.RotationX) != 0) {
                                    i23 &= -234881025;
                                }
                                shape4 = shape;
                                chipElevation4 = chipElevation;
                                chipBorder3 = chipBorder;
                                mutableInteractionSource3 = mutableInteractionSource;
                                i15 = 6;
                                modifier5 = modifier2;
                                borderStroke = 0;
                                i17 = i23;
                                myVar9 = myVar5;
                                i16 = i21;
                                myVar8 = myVar3;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-759567147, i17, i16, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:389)");
                            }
                            TextStyle value = TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, i15);
                            long m1713labelColorvNxB06k$material3 = chipColors2.m1713labelColorvNxB06k$material3(z2);
                            float m1636getHeightD9Ej5fM = AssistChipDefaults.INSTANCE.m1636getHeightD9Ej5fM();
                            PaddingValues paddingValues = AssistChipPadding;
                            if (chipBorder3 == null) {
                                startRestartGroup.startReplaceGroup(1919297975);
                                startRestartGroup.endReplaceGroup();
                                borderStroke$material3 = borderStroke;
                            } else {
                                startRestartGroup.startReplaceGroup(200460170);
                                borderStroke$material3 = chipBorder3.borderStroke$material3(z2, startRestartGroup, ((i17 >> 9) & 14) | ((i17 >> 24) & 112));
                                startRestartGroup.endReplaceGroup();
                            }
                            if (borderStroke$material3 != null) {
                                borderStroke = borderStroke$material3.getValue();
                            }
                            int i24 = i17 << 6;
                            ChipColors chipColors5 = chipColors2;
                            boolean z5 = z2;
                            m1723ChipnkUnTEs(modifier5, iyVar, z5, myVar4, value, m1713labelColorvNxB06k$material3, myVar9, myVar8, shape4, chipColors5, chipElevation4, borderStroke, m1636getHeightD9Ej5fM, paddingValues, mutableInteractionSource3, startRestartGroup, ((i17 >> 6) & 14) | ((i17 << 3) & 112) | ((i17 >> 3) & 896) | (i24 & 7168) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24) | (i24 & 1879048192), ((i17 >> 24) & 14) | 3456 | ((i16 << 12) & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            chipBorder2 = chipBorder3;
                            composer2 = startRestartGroup;
                            modifier3 = modifier5;
                            z3 = z5;
                            myVar7 = myVar9;
                            myVar6 = myVar8;
                            shape2 = shape4;
                            chipColors3 = chipColors5;
                            chipElevation2 = chipElevation4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            myVar6 = myVar3;
                            chipElevation2 = chipElevation;
                            mutableInteractionSource2 = mutableInteractionSource;
                            z3 = z2;
                            composer2 = startRestartGroup;
                            shape2 = shape;
                            chipColors3 = chipColors2;
                            modifier3 = modifier2;
                            myVar7 = myVar5;
                            chipBorder2 = chipBorder;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new ii(iyVar, myVar, modifier3, z3, myVar7, myVar6, shape2, chipColors3, chipElevation2, chipBorder2, mutableInteractionSource2, i, i2, i3, 0));
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    i10 = i3 & Fields.RotationZ;
                    if (i10 != 0) {
                    }
                    i13 = i4;
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i13 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                myVar5 = myVar2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i8 = i3 & Fields.RotationY;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i3 & Fields.RotationZ;
                if (i10 != 0) {
                }
                i13 = i4;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i13 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            myVar5 = myVar2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i8 = i3 & Fields.RotationY;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3 & Fields.RotationZ;
            if (i10 != 0) {
            }
            i13 = i4;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i13 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        myVar5 = myVar2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i8 = i3 & Fields.RotationY;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & Fields.RotationZ;
        if (i10 != 0) {
        }
        i13 = i4;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i13 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ElevatedAssistChip$lambda$3(iy iyVar, my myVar, Modifier modifier, boolean z, my myVar2, my myVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        ElevatedAssistChip(iyVar, myVar, modifier, z, myVar2, myVar3, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ElevatedAssistChip$lambda$5(iy iyVar, my myVar, Modifier modifier, boolean z, my myVar2, my myVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        ElevatedAssistChip(iyVar, myVar, modifier, z, myVar2, myVar3, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedFilterChip(boolean z, iy iyVar, my myVar, Modifier modifier, boolean z2, my myVar2, my myVar3, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2, int i3) {
        int i4;
        iy iyVar2;
        my myVar4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        my myVar5;
        Shape shape2;
        SelectableChipColors selectableChipColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        BorderStroke borderStroke2;
        MutableInteractionSource mutableInteractionSource2;
        SelectableChipColors selectableChipColors3;
        Modifier modifier3;
        Composer composer2;
        my myVar6;
        my myVar7;
        Shape shape3;
        boolean z4;
        SelectableChipElevation selectableChipElevation2;
        ScopeUpdateScope endRestartGroup;
        int i15;
        Shape shape4;
        SelectableChipColors selectableChipColors4;
        Modifier modifier4;
        int i16;
        int i17;
        SelectableChipElevation selectableChipElevation3;
        int i18;
        MutableInteractionSource mutableInteractionSource3;
        BorderStroke borderStroke3;
        my myVar8;
        my myVar9;
        Shape shape5;
        SelectableChipColors selectableChipColors5;
        int i19;
        Modifier modifier5;
        SelectableChipElevation selectableChipElevation4;
        int i20;
        boolean z5;
        int i21;
        int i22;
        int i23;
        Composer startRestartGroup = composer.startRestartGroup(1533553846);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 48) == 0) {
                i4 |= startRestartGroup.changedInstance(iyVar2) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
            myVar4 = myVar;
        } else {
            myVar4 = myVar;
            if ((i & 384) == 0) {
                i4 |= startRestartGroup.changedInstance(myVar4) ? Fields.RotationX : Fields.SpotShadowColor;
            }
        }
        int i24 = i3 & 8;
        if (i24 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? Fields.Clip : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= startRestartGroup.changedInstance(myVar2) ? Fields.RenderEffect : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    myVar5 = myVar3;
                } else {
                    myVar5 = myVar3;
                    if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(myVar5) ? 1048576 : Fields.BlendMode;
                    }
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & Fields.SpotShadowColor) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i23 = GroupFlagsKt.IsNodeFlag;
                            i4 |= i23;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i23 = 4194304;
                    i4 |= i23;
                } else {
                    shape2 = shape;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & Fields.RotationX) == 0) {
                        selectableChipColors2 = selectableChipColors;
                        if (startRestartGroup.changed(selectableChipColors2)) {
                            i22 = GroupFlagsKt.IsRecompositionRequiredFlag;
                            i4 |= i22;
                        }
                    } else {
                        selectableChipColors2 = selectableChipColors;
                    }
                    i22 = GroupFlagsKt.HasAuxSlotFlag;
                    i4 |= i22;
                } else {
                    selectableChipColors2 = selectableChipColors;
                }
                if ((i & 805306368) == 0) {
                    if ((i3 & Fields.RotationY) == 0 && startRestartGroup.changed(selectableChipElevation)) {
                        i21 = GroupFlagsKt.HasMovableContentFlag;
                        i4 |= i21;
                    }
                    i21 = GroupFlagsKt.IsMovableContentFlag;
                    i4 |= i21;
                }
                i8 = i3 & Fields.RotationZ;
                if (i8 != 0) {
                    i10 = i2 | 6;
                    i9 = i8;
                } else if ((i2 & 6) == 0) {
                    i9 = i8;
                    i10 = i2 | (startRestartGroup.changed(borderStroke) ? 4 : 2);
                } else {
                    i9 = i8;
                    i10 = i2;
                }
                i11 = i3 & Fields.CameraDistance;
                if (i11 != 0) {
                    i10 |= 48;
                    i12 = i11;
                } else if ((i2 & 48) == 0) {
                    i12 = i11;
                    i10 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                } else {
                    i12 = i11;
                }
                i13 = i10;
                i14 = i4;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i14 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier6 = i24 != 0 ? Modifier.Companion : modifier2;
                        boolean z6 = i5 == 0 ? z3 : true;
                        my myVar10 = i6 != 0 ? null : myVar2;
                        my myVar11 = i7 != 0 ? null : myVar5;
                        if ((i3 & Fields.SpotShadowColor) != 0) {
                            i15 = i14 & (-29360129);
                            shape4 = FilterChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                        } else {
                            i15 = i14;
                            shape4 = shape2;
                        }
                        if ((i3 & Fields.RotationX) != 0) {
                            i15 &= -234881025;
                            selectableChipColors4 = FilterChipDefaults.INSTANCE.elevatedFilterChipColors(startRestartGroup, 6);
                        } else {
                            selectableChipColors4 = selectableChipColors2;
                        }
                        int i25 = i15;
                        if ((i3 & Fields.RotationY) != 0) {
                            modifier4 = modifier6;
                            i17 = i13;
                            i16 = 6;
                            selectableChipElevation3 = FilterChipDefaults.INSTANCE.m1992elevatedFilterChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                            i18 = i25 & (-1879048193);
                        } else {
                            modifier4 = modifier6;
                            i16 = 6;
                            i17 = i13;
                            selectableChipElevation3 = selectableChipElevation;
                            i18 = i25;
                        }
                        BorderStroke borderStroke4 = i9 != 0 ? null : borderStroke;
                        if (i12 != 0) {
                            borderStroke3 = borderStroke4;
                            myVar8 = myVar10;
                            myVar9 = myVar11;
                            shape5 = shape4;
                            mutableInteractionSource3 = null;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                            borderStroke3 = borderStroke4;
                            myVar8 = myVar10;
                            myVar9 = myVar11;
                            shape5 = shape4;
                        }
                        selectableChipColors5 = selectableChipColors4;
                        i19 = 1533553846;
                        modifier5 = modifier4;
                        selectableChipElevation4 = selectableChipElevation3;
                        i20 = 12582912;
                        z5 = z6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        int i26 = (i3 & Fields.SpotShadowColor) != 0 ? i14 & (-29360129) : i14;
                        if ((i3 & Fields.RotationX) != 0) {
                            i26 &= -234881025;
                        }
                        if ((i3 & Fields.RotationY) != 0) {
                            i26 &= -1879048193;
                        }
                        myVar8 = myVar2;
                        selectableChipElevation4 = selectableChipElevation;
                        borderStroke3 = borderStroke;
                        mutableInteractionSource3 = mutableInteractionSource;
                        i16 = 6;
                        myVar9 = myVar5;
                        selectableChipColors5 = selectableChipColors2;
                        modifier5 = modifier2;
                        i20 = 12582912;
                        i19 = 1533553846;
                        i18 = i26;
                        z5 = z3;
                        i17 = i13;
                        shape5 = shape2;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(i19, i18, i17, "androidx.compose.material3.ElevatedFilterChip (Chip.kt:556)");
                    }
                    int i27 = i18 << 3;
                    int i28 = i18 << 6;
                    int i29 = i20 | (i18 & 14) | ((i18 >> 6) & 112) | (i27 & 896) | ((i18 >> 3) & 7168) | (57344 & i28) | (i27 & 3670016) | (234881024 & i28) | (1879048192 & i28);
                    int i30 = i18 >> 24;
                    m1725SelectableChipu0RnIRE(z, modifier5, iyVar2, z5, myVar4, TypographyKt.getValue(FilterChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, i16), myVar8, null, myVar9, shape5, selectableChipColors5, selectableChipElevation4, borderStroke3, FilterChipDefaults.INSTANCE.m1996getHeightD9Ej5fM(), FilterChipPadding, mutableInteractionSource3, startRestartGroup, i29, (i30 & 112) | (i30 & 14) | 27648 | ((i17 << 6) & 896) | ((i17 << 12) & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = startRestartGroup;
                    modifier3 = modifier5;
                    z4 = z5;
                    myVar6 = myVar8;
                    myVar7 = myVar9;
                    shape3 = shape5;
                    selectableChipColors3 = selectableChipColors5;
                    selectableChipElevation2 = selectableChipElevation4;
                    borderStroke2 = borderStroke3;
                    mutableInteractionSource2 = mutableInteractionSource3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    borderStroke2 = borderStroke;
                    mutableInteractionSource2 = mutableInteractionSource;
                    selectableChipColors3 = selectableChipColors2;
                    modifier3 = modifier2;
                    composer2 = startRestartGroup;
                    myVar6 = myVar2;
                    myVar7 = myVar5;
                    shape3 = shape2;
                    z4 = z3;
                    selectableChipElevation2 = selectableChipElevation;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new ai(z, iyVar, myVar, modifier3, z4, myVar6, myVar7, shape3, selectableChipColors3, selectableChipElevation2, borderStroke2, mutableInteractionSource2, i, i2, i3, 1));
                    return;
                }
                return;
            }
            z3 = z2;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i8 = i3 & Fields.RotationZ;
            if (i8 != 0) {
            }
            i11 = i3 & Fields.CameraDistance;
            if (i11 != 0) {
            }
            i13 = i10;
            i14 = i4;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i14 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z3 = z2;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i8 = i3 & Fields.RotationZ;
        if (i8 != 0) {
        }
        i11 = i3 & Fields.CameraDistance;
        if (i11 != 0) {
        }
        i13 = i10;
        i14 = i4;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i14 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ElevatedFilterChip$lambda$7(boolean z, iy iyVar, my myVar, Modifier modifier, boolean z2, my myVar2, my myVar3, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        ElevatedFilterChip(z, iyVar, myVar, modifier, z2, myVar2, myVar3, shape, selectableChipColors, selectableChipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void ElevatedSuggestionChip(iy iyVar, my myVar, Modifier modifier, boolean z, my myVar2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        iy iyVar2;
        int i3;
        my myVar3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        my myVar4;
        Shape shape2;
        ChipColors chipColors2;
        int i6;
        ChipElevation chipElevation2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        my myVar5;
        Composer composer2;
        Shape shape3;
        ChipColors chipColors3;
        ChipElevation chipElevation3;
        ChipBorder chipBorder2;
        MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        int i12;
        Shape shape4;
        ChipColors chipColors4;
        int i13;
        ChipBorder chipBorder3;
        MutableInteractionSource mutableInteractionSource3;
        my myVar6;
        Shape shape5;
        State<BorderStroke> state;
        int i14;
        ChipElevation chipElevation4;
        boolean z4;
        State<BorderStroke> borderStroke$material3;
        int i15;
        int i16;
        int i17;
        Composer startRestartGroup = composer.startRestartGroup(1306662363);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            myVar3 = myVar;
        } else {
            myVar3 = myVar;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(myVar3) ? 32 : 16;
            }
        }
        int i18 = i2 & 4;
        if (i18 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    myVar4 = myVar2;
                    i3 |= startRestartGroup.changedInstance(myVar4) ? Fields.Clip : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i17 = Fields.RenderEffect;
                                i3 |= i17;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i17 = 65536;
                        i3 |= i17;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            chipColors2 = chipColors;
                            if (startRestartGroup.changed(chipColors2)) {
                                i16 = 1048576;
                                i3 |= i16;
                            }
                        } else {
                            chipColors2 = chipColors;
                        }
                        i16 = Fields.BlendMode;
                        i3 |= i16;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 12582912) != 0) {
                        i6 = 12582912;
                        if ((i2 & Fields.SpotShadowColor) == 0) {
                            chipElevation2 = chipElevation;
                            if (startRestartGroup.changed(chipElevation2)) {
                                i15 = GroupFlagsKt.IsNodeFlag;
                                i3 |= i15;
                            }
                        } else {
                            chipElevation2 = chipElevation;
                        }
                        i15 = 4194304;
                        i3 |= i15;
                    } else {
                        i6 = 12582912;
                        chipElevation2 = chipElevation;
                    }
                    i7 = i2 & Fields.RotationX;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i8 = i18;
                        i3 |= startRestartGroup.changed(chipBorder) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        i9 = i2 & Fields.RotationY;
                        if (i9 != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i10 = i9;
                            i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            i11 = i3;
                            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i11 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                z3 = z2;
                                myVar5 = myVar4;
                                composer2 = startRestartGroup;
                                shape3 = shape2;
                                chipColors3 = chipColors2;
                                chipElevation3 = chipElevation2;
                                chipBorder2 = chipBorder;
                                mutableInteractionSource2 = mutableInteractionSource;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    modifier3 = i8 != 0 ? Modifier.Companion : modifier2;
                                    boolean z5 = i4 == 0 ? z2 : true;
                                    my myVar7 = i5 != 0 ? null : myVar4;
                                    if ((i2 & 32) != 0) {
                                        i12 = i11 & (-458753);
                                        shape4 = SuggestionChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                    } else {
                                        i12 = i11;
                                        shape4 = shape2;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i12 &= -3670017;
                                        chipColors4 = SuggestionChipDefaults.INSTANCE.elevatedSuggestionChipColors(startRestartGroup, 6);
                                    } else {
                                        chipColors4 = chipColors2;
                                    }
                                    int i19 = i12;
                                    if ((i2 & Fields.SpotShadowColor) != 0) {
                                        i19 &= -29360129;
                                        i13 = 6;
                                        chipElevation2 = SuggestionChipDefaults.INSTANCE.m2457elevatedSuggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                                    } else {
                                        i13 = 6;
                                    }
                                    chipBorder3 = i7 != 0 ? null : chipBorder;
                                    if (i10 != 0) {
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource;
                                    }
                                    myVar6 = myVar7;
                                    shape5 = shape4;
                                    chipColors2 = chipColors4;
                                    state = null;
                                    i14 = i19;
                                    chipElevation4 = chipElevation2;
                                    z4 = z5;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 32) != 0) {
                                        i11 &= -458753;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i11 &= -3670017;
                                    }
                                    if ((i2 & Fields.SpotShadowColor) != 0) {
                                        i11 &= -29360129;
                                    }
                                    chipBorder3 = chipBorder;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    modifier3 = modifier2;
                                    myVar6 = myVar4;
                                    shape5 = shape2;
                                    state = null;
                                    i13 = 6;
                                    chipElevation4 = chipElevation2;
                                    i14 = i11;
                                    z4 = z2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1306662363, i14, -1, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:980)");
                                }
                                TextStyle value = TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, i13);
                                long m1713labelColorvNxB06k$material3 = chipColors2.m1713labelColorvNxB06k$material3(z4);
                                float m2458getHeightD9Ej5fM = SuggestionChipDefaults.INSTANCE.m2458getHeightD9Ej5fM();
                                PaddingValues paddingValues = SuggestionChipPadding;
                                if (chipBorder3 == null) {
                                    startRestartGroup.startReplaceGroup(1491294513);
                                    startRestartGroup.endReplaceGroup();
                                    borderStroke$material3 = state;
                                } else {
                                    startRestartGroup.startReplaceGroup(1572126928);
                                    borderStroke$material3 = chipBorder3.borderStroke$material3(z4, startRestartGroup, ((i14 >> 9) & 14) | ((i14 >> 21) & 112));
                                    startRestartGroup.endReplaceGroup();
                                }
                                BorderStroke value2 = borderStroke$material3 != null ? borderStroke$material3.getValue() : state;
                                int i20 = i14 << 6;
                                int i21 = ((i14 >> 6) & 14) | i6 | ((i14 << 3) & 112) | ((i14 >> 3) & 896) | (i20 & 7168) | (i20 & 3670016);
                                int i22 = i14 << 9;
                                ChipColors chipColors5 = chipColors2;
                                my myVar8 = myVar3;
                                Modifier modifier4 = modifier3;
                                m1723ChipnkUnTEs(modifier4, iyVar2, z4, myVar8, value, m1713labelColorvNxB06k$material3, myVar6, null, shape5, chipColors5, chipElevation4, value2, m2458getHeightD9Ej5fM, paddingValues, mutableInteractionSource3, startRestartGroup, i21 | (234881024 & i22) | (i22 & 1879048192), ((i14 >> 21) & 14) | 3456 | ((i14 >> 15) & 57344));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                chipBorder2 = chipBorder3;
                                composer2 = startRestartGroup;
                                modifier2 = modifier4;
                                z3 = z4;
                                myVar5 = myVar6;
                                shape3 = shape5;
                                chipColors3 = chipColors5;
                                chipElevation3 = chipElevation4;
                                mutableInteractionSource2 = mutableInteractionSource3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new ci(iyVar, myVar, modifier2, z3, myVar5, shape3, chipColors3, chipElevation3, chipBorder2, mutableInteractionSource2, i, i2, 0));
                                return;
                            }
                            return;
                        }
                        i10 = i9;
                        i11 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i11 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i8 = i18;
                    i9 = i2 & Fields.RotationY;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    i11 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i11 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                myVar4 = myVar2;
                if ((196608 & i) != 0) {
                }
                if ((1572864 & i) != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i7 = i2 & Fields.RotationX;
                if (i7 == 0) {
                }
                i8 = i18;
                i9 = i2 & Fields.RotationY;
                if (i9 != 0) {
                }
                i10 = i9;
                i11 = i3;
                if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i11 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            myVar4 = myVar2;
            if ((196608 & i) != 0) {
            }
            if ((1572864 & i) != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i7 = i2 & Fields.RotationX;
            if (i7 == 0) {
            }
            i8 = i18;
            i9 = i2 & Fields.RotationY;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3;
            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i11 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        myVar4 = myVar2;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i7 = i2 & Fields.RotationX;
        if (i7 == 0) {
        }
        i8 = i18;
        i9 = i2 & Fields.RotationY;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3;
        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i11 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ElevatedSuggestionChip$lambda$12(iy iyVar, my myVar, Modifier modifier, boolean z, my myVar2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        ElevatedSuggestionChip(iyVar, myVar, modifier, z, myVar2, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ElevatedSuggestionChip$lambda$14(iy iyVar, my myVar, Modifier modifier, boolean z, my myVar2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        ElevatedSuggestionChip(iyVar, myVar, modifier, z, myVar2, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilterChip(boolean z, iy iyVar, my myVar, Modifier modifier, boolean z2, my myVar2, my myVar3, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2, int i3) {
        boolean z3;
        int i4;
        iy iyVar2;
        my myVar4;
        Modifier modifier2;
        int i5;
        boolean z4;
        int i6;
        int i7;
        my myVar5;
        Shape shape2;
        SelectableChipColors selectableChipColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        BorderStroke borderStroke2;
        MutableInteractionSource mutableInteractionSource2;
        SelectableChipColors selectableChipColors3;
        Modifier modifier3;
        Composer composer2;
        my myVar6;
        my myVar7;
        Shape shape3;
        boolean z5;
        SelectableChipElevation selectableChipElevation2;
        ScopeUpdateScope endRestartGroup;
        int i13;
        Shape shape4;
        SelectableChipColors selectableChipColors4;
        Modifier modifier4;
        int i14;
        int i15;
        SelectableChipElevation selectableChipElevation3;
        int i16;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource3;
        SelectableChipElevation selectableChipElevation4;
        BorderStroke borderStroke4;
        boolean z6;
        int i17;
        my myVar8;
        my myVar9;
        Shape shape5;
        SelectableChipColors selectableChipColors5;
        Modifier modifier5;
        int i18;
        int i19;
        int i20;
        int i21;
        Composer startRestartGroup = composer.startRestartGroup(-1385473344);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i4 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i4 = i;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 48) == 0) {
                i4 |= startRestartGroup.changedInstance(iyVar2) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
            myVar4 = myVar;
        } else {
            myVar4 = myVar;
            if ((i & 384) == 0) {
                i4 |= startRestartGroup.changedInstance(myVar4) ? Fields.RotationX : Fields.SpotShadowColor;
            }
        }
        int i22 = i3 & 8;
        if (i22 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                z4 = z2;
                i4 |= startRestartGroup.changed(z4) ? Fields.Clip : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= startRestartGroup.changedInstance(myVar2) ? Fields.RenderEffect : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    myVar5 = myVar3;
                } else {
                    myVar5 = myVar3;
                    if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(myVar5) ? 1048576 : Fields.BlendMode;
                    }
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & Fields.SpotShadowColor) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i21 = GroupFlagsKt.IsNodeFlag;
                            i4 |= i21;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i21 = 4194304;
                    i4 |= i21;
                } else {
                    shape2 = shape;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & Fields.RotationX) == 0) {
                        selectableChipColors2 = selectableChipColors;
                        if (startRestartGroup.changed(selectableChipColors2)) {
                            i20 = GroupFlagsKt.IsRecompositionRequiredFlag;
                            i4 |= i20;
                        }
                    } else {
                        selectableChipColors2 = selectableChipColors;
                    }
                    i20 = GroupFlagsKt.HasAuxSlotFlag;
                    i4 |= i20;
                } else {
                    selectableChipColors2 = selectableChipColors;
                }
                if ((i & 805306368) == 0) {
                    if ((i3 & Fields.RotationY) == 0 && startRestartGroup.changed(selectableChipElevation)) {
                        i19 = GroupFlagsKt.HasMovableContentFlag;
                        i4 |= i19;
                    }
                    i19 = GroupFlagsKt.IsMovableContentFlag;
                    i4 |= i19;
                }
                if ((i2 & 6) == 0) {
                    if ((i3 & Fields.RotationZ) == 0 && startRestartGroup.changed(borderStroke)) {
                        i18 = 4;
                        i8 = i2 | i18;
                    }
                    i18 = 2;
                    i8 = i2 | i18;
                } else {
                    i8 = i2;
                }
                i9 = i3 & Fields.CameraDistance;
                if (i9 != 0) {
                    i10 = i9;
                    i11 = i8 | 48;
                } else {
                    if ((i2 & 48) == 0) {
                        i10 = i9;
                        i8 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                    } else {
                        i10 = i9;
                    }
                    i11 = i8;
                }
                i12 = i4;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 19) != 18, i12 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier6 = i22 != 0 ? Modifier.Companion : modifier2;
                        boolean z7 = i5 != 0 ? true : z4;
                        my myVar10 = i6 != 0 ? null : myVar2;
                        my myVar11 = i7 != 0 ? null : myVar5;
                        if ((i3 & Fields.SpotShadowColor) != 0) {
                            i13 = i12 & (-29360129);
                            shape4 = FilterChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                        } else {
                            i13 = i12;
                            shape4 = shape2;
                        }
                        if ((i3 & Fields.RotationX) != 0) {
                            i13 &= -234881025;
                            selectableChipColors4 = FilterChipDefaults.INSTANCE.filterChipColors(startRestartGroup, 6);
                        } else {
                            selectableChipColors4 = selectableChipColors2;
                        }
                        int i23 = i13;
                        if ((i3 & Fields.RotationY) != 0) {
                            modifier4 = modifier6;
                            i14 = 6;
                            i15 = i10;
                            selectableChipElevation3 = FilterChipDefaults.INSTANCE.m1995filterChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                            i16 = i23 & (-1879048193);
                        } else {
                            modifier4 = modifier6;
                            i14 = 6;
                            i15 = i10;
                            selectableChipElevation3 = selectableChipElevation;
                            i16 = i23;
                        }
                        if ((i3 & Fields.RotationZ) != 0) {
                            borderStroke3 = FilterChipDefaults.INSTANCE.m1993filterChipBorder_7El2pE(z7, z3, 0L, 0L, 0L, 0L, 0.0f, 0.0f, startRestartGroup, ((i16 >> 12) & 14) | 100663296 | ((i16 << 3) & 112), 252);
                            i11 &= -15;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i15 != 0) {
                            selectableChipElevation4 = selectableChipElevation3;
                            borderStroke4 = borderStroke3;
                            z6 = z7;
                            i17 = i11;
                            mutableInteractionSource3 = null;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                            selectableChipElevation4 = selectableChipElevation3;
                            borderStroke4 = borderStroke3;
                            z6 = z7;
                            i17 = i11;
                        }
                        myVar8 = myVar10;
                        myVar9 = myVar11;
                        shape5 = shape4;
                        selectableChipColors5 = selectableChipColors4;
                        modifier5 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        int i24 = (i3 & Fields.SpotShadowColor) != 0 ? i12 & (-29360129) : i12;
                        if ((i3 & Fields.RotationX) != 0) {
                            i24 &= -234881025;
                        }
                        if ((i3 & Fields.RotationY) != 0) {
                            i24 &= -1879048193;
                        }
                        if ((i3 & Fields.RotationZ) != 0) {
                            i11 &= -15;
                        }
                        i16 = i24;
                        i14 = 6;
                        myVar8 = myVar2;
                        selectableChipElevation4 = selectableChipElevation;
                        borderStroke4 = borderStroke;
                        mutableInteractionSource3 = mutableInteractionSource;
                        myVar9 = myVar5;
                        shape5 = shape2;
                        selectableChipColors5 = selectableChipColors2;
                        modifier5 = modifier2;
                        z6 = z4;
                        i17 = i11;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1385473344, i16, i17, "androidx.compose.material3.FilterChip (Chip.kt:474)");
                    }
                    int i25 = i16 << 3;
                    int i26 = i16 << 6;
                    int i27 = i16 >> 24;
                    m1725SelectableChipu0RnIRE(z, modifier5, iyVar2, z6, myVar4, TypographyKt.getValue(FilterChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, i14), myVar8, null, myVar9, shape5, selectableChipColors5, selectableChipElevation4, borderStroke4, FilterChipDefaults.INSTANCE.m1996getHeightD9Ej5fM(), FilterChipPadding, mutableInteractionSource3, startRestartGroup, (i16 & 14) | 12582912 | ((i16 >> 6) & 112) | (i25 & 896) | ((i16 >> 3) & 7168) | (57344 & i26) | (i25 & 3670016) | (234881024 & i26) | (1879048192 & i26), (i27 & 112) | (i27 & 14) | 27648 | ((i17 << 6) & 896) | ((i17 << 12) & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = startRestartGroup;
                    modifier3 = modifier5;
                    z5 = z6;
                    myVar6 = myVar8;
                    myVar7 = myVar9;
                    shape3 = shape5;
                    selectableChipColors3 = selectableChipColors5;
                    selectableChipElevation2 = selectableChipElevation4;
                    borderStroke2 = borderStroke4;
                    mutableInteractionSource2 = mutableInteractionSource3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    borderStroke2 = borderStroke;
                    mutableInteractionSource2 = mutableInteractionSource;
                    selectableChipColors3 = selectableChipColors2;
                    modifier3 = modifier2;
                    composer2 = startRestartGroup;
                    myVar6 = myVar2;
                    myVar7 = myVar5;
                    shape3 = shape2;
                    z5 = z4;
                    selectableChipElevation2 = selectableChipElevation;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new ai(z, iyVar, myVar, modifier3, z5, myVar6, myVar7, shape3, selectableChipColors3, selectableChipElevation2, borderStroke2, mutableInteractionSource2, i, i2, i3, 0));
                    return;
                }
                return;
            }
            z4 = z2;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            i9 = i3 & Fields.CameraDistance;
            if (i9 != 0) {
            }
            i12 = i4;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 19) != 18, i12 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z4 = z2;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        i9 = i3 & Fields.CameraDistance;
        if (i9 != 0) {
        }
        i12 = i4;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i11 & 19) != 18, i12 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FilterChip$lambda$6(boolean z, iy iyVar, my myVar, Modifier modifier, boolean z2, my myVar2, my myVar3, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        FilterChip(z, iyVar, myVar, modifier, z2, myVar2, myVar3, shape, selectableChipColors, selectableChipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InputChip(boolean z, iy iyVar, my myVar, Modifier modifier, boolean z2, my myVar2, my myVar3, my myVar4, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2, int i3) {
        boolean z3;
        int i4;
        iy iyVar2;
        int i5;
        int i6;
        int i7;
        my myVar5;
        int i8;
        my myVar6;
        int i9;
        my myVar7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Modifier modifier2;
        boolean z4;
        SelectableChipElevation selectableChipElevation2;
        BorderStroke borderStroke2;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        my myVar8;
        Shape shape2;
        SelectableChipColors selectableChipColors2;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        int i15;
        SelectableChipColors selectableChipColors3;
        int i16;
        Modifier modifier3;
        int i17;
        int i18;
        SelectableChipElevation selectableChipElevation3;
        int i19;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource3;
        SelectableChipElevation selectableChipElevation4;
        BorderStroke borderStroke4;
        boolean z5;
        my myVar9;
        my myVar10;
        Shape shape4;
        SelectableChipColors selectableChipColors4;
        int i20;
        Modifier modifier4;
        boolean z6;
        int i21;
        int i22;
        int i23;
        int i24;
        Composer startRestartGroup = composer.startRestartGroup(-1975409271);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i4 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i4 = i;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 48) == 0) {
                i4 |= startRestartGroup.changedInstance(iyVar2) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(myVar) ? Fields.RotationX : Fields.SpotShadowColor;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(modifier) ? Fields.CameraDistance : Fields.RotationZ;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? Fields.Clip : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                        myVar5 = myVar2;
                    } else {
                        myVar5 = myVar2;
                        if ((i & 196608) == 0) {
                            i4 |= startRestartGroup.changedInstance(myVar5) ? Fields.RenderEffect : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        myVar6 = myVar3;
                    } else {
                        myVar6 = myVar3;
                        if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changedInstance(myVar6) ? 1048576 : Fields.BlendMode;
                        }
                    }
                    i9 = i3 & Fields.SpotShadowColor;
                    if (i9 == 0) {
                        i4 |= 12582912;
                        myVar7 = myVar4;
                    } else {
                        myVar7 = myVar4;
                        if ((i & 12582912) == 0) {
                            i4 |= startRestartGroup.changedInstance(myVar7) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                    }
                    if ((i & 100663296) == 0) {
                        if ((i3 & Fields.RotationX) == 0 && startRestartGroup.changed(shape)) {
                            i24 = GroupFlagsKt.IsRecompositionRequiredFlag;
                            i4 |= i24;
                        }
                        i24 = GroupFlagsKt.HasAuxSlotFlag;
                        i4 |= i24;
                    }
                    if ((i & 805306368) == 0) {
                        if ((i3 & Fields.RotationY) == 0 && startRestartGroup.changed(selectableChipColors)) {
                            i23 = GroupFlagsKt.HasMovableContentFlag;
                            i4 |= i23;
                        }
                        i23 = GroupFlagsKt.IsMovableContentFlag;
                        i4 |= i23;
                    }
                    if ((i2 & 6) != 0) {
                        if ((i3 & Fields.RotationZ) == 0 && startRestartGroup.changed(selectableChipElevation)) {
                            i22 = 4;
                            i10 = i2 | i22;
                        }
                        i22 = 2;
                        i10 = i2 | i22;
                    } else {
                        i10 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        if ((i3 & Fields.CameraDistance) == 0 && startRestartGroup.changed(borderStroke)) {
                            i21 = 32;
                            i10 |= i21;
                        }
                        i21 = 16;
                        i10 |= i21;
                    }
                    int i25 = i10;
                    i11 = i3 & Fields.TransformOrigin;
                    if (i11 == 0) {
                        i12 = i11;
                        i13 = i25 | 384;
                    } else {
                        int i26 = i25;
                        if ((i2 & 384) == 0) {
                            i26 |= startRestartGroup.changed(mutableInteractionSource) ? Fields.RotationX : Fields.SpotShadowColor;
                        }
                        i12 = i11;
                        i13 = i26;
                    }
                    i14 = i4;
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 147) != 146, i14 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        z4 = z2;
                        selectableChipElevation2 = selectableChipElevation;
                        borderStroke2 = borderStroke;
                        mutableInteractionSource2 = mutableInteractionSource;
                        composer2 = startRestartGroup;
                        myVar8 = myVar7;
                        shape2 = shape;
                        selectableChipColors2 = selectableChipColors;
                    } else {
                        startRestartGroup.startDefaults();
                        ComposableLambda composableLambda = null;
                        int i27 = i13;
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i5 != 0 ? Modifier.Companion : modifier;
                            boolean z7 = i6 != 0 ? true : z2;
                            my myVar11 = i7 != 0 ? null : myVar5;
                            my myVar12 = i8 != 0 ? null : myVar6;
                            my myVar13 = i9 != 0 ? null : myVar7;
                            if ((i3 & Fields.RotationX) != 0) {
                                i15 = i14 & (-234881025);
                                shape3 = InputChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            } else {
                                shape3 = shape;
                                i15 = i14;
                            }
                            if ((i3 & Fields.RotationY) != 0) {
                                i16 = (-1879048193) & i15;
                                selectableChipColors3 = InputChipDefaults.INSTANCE.inputChipColors(startRestartGroup, 6);
                            } else {
                                selectableChipColors3 = selectableChipColors;
                                i16 = i15;
                            }
                            if ((i3 & Fields.RotationZ) != 0) {
                                modifier3 = modifier5;
                                i17 = 6;
                                i18 = i12;
                                selectableChipElevation3 = InputChipDefaults.INSTANCE.m2077inputChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                                i19 = i27 & (-15);
                            } else {
                                modifier3 = modifier5;
                                i17 = 6;
                                i18 = i12;
                                selectableChipElevation3 = selectableChipElevation;
                                i19 = i27;
                            }
                            if ((i3 & Fields.CameraDistance) != 0) {
                                borderStroke3 = InputChipDefaults.INSTANCE.m2075inputChipBorder_7El2pE(z7, z3, 0L, 0L, 0L, 0L, 0.0f, 0.0f, startRestartGroup, ((i16 >> 12) & 14) | 100663296 | ((i16 << 3) & 112), 252);
                                i19 &= -113;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i18 != 0) {
                                selectableChipElevation4 = selectableChipElevation3;
                                borderStroke4 = borderStroke3;
                                z5 = z7;
                                mutableInteractionSource3 = null;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                selectableChipElevation4 = selectableChipElevation3;
                                borderStroke4 = borderStroke3;
                                z5 = z7;
                            }
                            myVar9 = myVar11;
                            myVar6 = myVar12;
                            myVar10 = myVar13;
                            shape4 = shape3;
                            selectableChipColors4 = selectableChipColors3;
                            i20 = i16;
                            modifier4 = modifier3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            int i28 = (i3 & Fields.RotationX) != 0 ? i14 & (-234881025) : i14;
                            if ((i3 & Fields.RotationY) != 0) {
                                i28 &= -1879048193;
                            }
                            int i29 = (i3 & Fields.RotationZ) != 0 ? i27 & (-15) : i27;
                            if ((i3 & Fields.CameraDistance) != 0) {
                                i29 &= -113;
                            }
                            int i30 = i29;
                            i20 = i28;
                            i17 = 6;
                            i19 = i30;
                            modifier4 = modifier;
                            z5 = z2;
                            shape4 = shape;
                            selectableChipColors4 = selectableChipColors;
                            selectableChipElevation4 = selectableChipElevation;
                            borderStroke4 = borderStroke;
                            mutableInteractionSource3 = mutableInteractionSource;
                            myVar9 = myVar5;
                            myVar10 = myVar7;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1975409271, i20, i19, "androidx.compose.material3.InputChip (Chip.kt:645)");
                        }
                        if (myVar6 != null) {
                            startRestartGroup.startReplaceGroup(225175787);
                            z6 = true;
                            composableLambda = ComposableLambdaKt.rememberComposableLambda(-570452295, true, new ChipKt$InputChip$1(z5 ? 1.0f : InputChipTokens.INSTANCE.getDisabledAvatarOpacity(), ShapesKt.getValue(InputChipTokens.INSTANCE.getAvatarShape(), startRestartGroup, i17), myVar6), startRestartGroup, 54);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            z6 = true;
                            startRestartGroup.startReplaceGroup(225773529);
                            startRestartGroup.endReplaceGroup();
                        }
                        ComposableLambda composableLambda2 = composableLambda;
                        TextStyle value = TypographyKt.getValue(InputChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, i17);
                        float m2073getHeightD9Ej5fM = InputChipDefaults.INSTANCE.m2073getHeightD9Ej5fM();
                        boolean z8 = composableLambda2 != null ? z6 : false;
                        boolean z9 = myVar9 != null ? z6 : false;
                        if (myVar10 == null) {
                            z6 = false;
                        }
                        PaddingValues inputChipPadding = inputChipPadding(z8, z9, z6);
                        int i31 = i20 << 3;
                        int i32 = (i20 & 14) | ((i20 >> 6) & 112) | (i31 & 896) | ((i20 >> 3) & 7168) | ((i20 << 6) & 57344) | (3670016 & i31) | (234881024 & i31) | (i31 & 1879048192);
                        int i33 = ((i20 >> 27) & 14) | 3072;
                        int i34 = i19 << 3;
                        m1725SelectableChipu0RnIRE(z, modifier4, iyVar2, z5, myVar, value, myVar9, composableLambda2, myVar10, shape4, selectableChipColors4, selectableChipElevation4, borderStroke4, m2073getHeightD9Ej5fM, inputChipPadding, mutableInteractionSource3, startRestartGroup, i32, i33 | (i34 & 112) | (i34 & 896) | ((i19 << 9) & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2 = startRestartGroup;
                        modifier2 = modifier4;
                        z4 = z5;
                        myVar5 = myVar9;
                        myVar8 = myVar10;
                        shape2 = shape4;
                        selectableChipColors2 = selectableChipColors4;
                        selectableChipElevation2 = selectableChipElevation4;
                        borderStroke2 = borderStroke4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new hi(z, iyVar, myVar, modifier2, z4, myVar5, myVar6, myVar8, shape2, selectableChipColors2, selectableChipElevation2, borderStroke2, mutableInteractionSource2, i, i2, i3));
                        return;
                    }
                    return;
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & Fields.SpotShadowColor;
                if (i9 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                if ((i2 & 48) == 0) {
                }
                int i252 = i10;
                i11 = i3 & Fields.TransformOrigin;
                if (i11 == 0) {
                }
                i14 = i4;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 147) != 146, i14 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & Fields.SpotShadowColor;
            if (i9 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i2522 = i10;
            i11 = i3 & Fields.TransformOrigin;
            if (i11 == 0) {
            }
            i14 = i4;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 147) != 146, i14 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & Fields.SpotShadowColor;
        if (i9 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i25222 = i10;
        i11 = i3 & Fields.TransformOrigin;
        if (i11 == 0) {
        }
        i14 = i4;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 147) != 146, i14 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 InputChip$lambda$8(boolean z, iy iyVar, my myVar, Modifier modifier, boolean z2, my myVar2, my myVar3, my myVar4, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        InputChip(z, iyVar, myVar, modifier, z2, myVar2, myVar3, myVar4, shape, selectableChipColors, selectableChipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* renamed from: SelectableChip-u0RnIRE, reason: not valid java name */
    private static final void m1725SelectableChipu0RnIRE(final boolean z, final Modifier modifier, final iy iyVar, final boolean z2, final my myVar, final TextStyle textStyle, final my myVar2, final my myVar3, final my myVar4, final Shape shape, final SelectableChipColors selectableChipColors, final SelectableChipElevation selectableChipElevation, final BorderStroke borderStroke, final float f, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource2;
        Composer startRestartGroup = composer.startRestartGroup(1786844928);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i & 384;
        int i6 = Fields.SpotShadowColor;
        if (i5 == 0) {
            i3 |= startRestartGroup.changedInstance(iyVar) ? 256 : 128;
        }
        int i7 = i & 3072;
        int i8 = Fields.RotationZ;
        if (i7 == 0) {
            i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar2) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar3) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar4) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(shape) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changed(selectableChipColors) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(selectableChipElevation) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (startRestartGroup.changed(borderStroke)) {
                i6 = 256;
            }
            i4 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (startRestartGroup.changed(f)) {
                i8 = 2048;
            }
            i4 |= i8;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changed(paddingValues) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= startRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
        }
        int i9 = i4;
        if (startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (74899 & i9) == 74898) ? false : true, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1786844928, i3, i9, "androidx.compose.material3.SelectableChip (Chip.kt:2003)");
            }
            if (mutableInteractionSource == null) {
                startRestartGroup.startReplaceGroup(73215547);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-828922852);
                startRestartGroup.endReplaceGroup();
                mutableInteractionSource2 = mutableInteractionSource;
            }
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new ed(18);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            State<Dp> state = null;
            int i10 = i3;
            Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, (ky) rememberedValue2, 1, null);
            long m2360containerColorWaAFU9c$material3 = selectableChipColors.m2360containerColorWaAFU9c$material3(z2, z);
            if (selectableChipElevation == null) {
                startRestartGroup.startReplaceGroup(73531126);
            } else {
                startRestartGroup.startReplaceGroup(-828912021);
                state = selectableChipElevation.shadowElevation$material3(z2, mutableInteractionSource2, startRestartGroup, ((i10 >> 9) & 14) | ((i9 << 3) & 896));
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            SurfaceKt.m2465Surfaced85dljk(z, iyVar, semantics$default, z2, shape, m2360containerColorWaAFU9c$material3, 0L, 0.0f, state != null ? state.getValue().m7625unboximpl() : Dp.m7611constructorimpl(0.0f), borderStroke, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(-990050154, true, new my() { // from class: androidx.compose.material3.ChipKt$SelectableChip$2
                public final void invoke(Composer composer3, int i11) {
                    if (!composer3.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-990050154, i11, -1, "androidx.compose.material3.SelectableChip.<anonymous> (Chip.kt:2019)");
                    }
                    ChipKt.m1722AnimatingChipContentfe0OD_I(myVar, textStyle, SelectableChipColors.this.m2362labelColorWaAFU9c$material3(z2, z), myVar2, myVar3, myVar4, SelectableChipColors.this.m2363leadingIconContentColorWaAFU9c$material3(z2, z), SelectableChipColors.this.m2364trailingIconContentColorWaAFU9c$material3(z2, z), f, paddingValues, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return w01.a;
                }
            }, composer2, 54), composer2, (i10 & 14) | ((i10 >> 3) & 112) | (i10 & 7168) | ((i10 >> 15) & 57344) | ((i9 << 21) & 1879048192), 48, 192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: di
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 SelectableChip_u0RnIRE$lambda$22;
                    int intValue = ((Integer) obj2).intValue();
                    SelectableChip_u0RnIRE$lambda$22 = ChipKt.SelectableChip_u0RnIRE$lambda$22(z, modifier, iyVar, z2, myVar, textStyle, myVar2, myVar3, myVar4, shape, selectableChipColors, selectableChipElevation, borderStroke, f, paddingValues, mutableInteractionSource, i, i2, (Composer) obj, intValue);
                    return SelectableChip_u0RnIRE$lambda$22;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SelectableChip_u0RnIRE$lambda$21$lambda$20(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6847setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m6830getCheckboxo7Vup1c());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SelectableChip_u0RnIRE$lambda$22(boolean z, Modifier modifier, iy iyVar, boolean z2, my myVar, TextStyle textStyle, my myVar2, my myVar3, my myVar4, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, float f, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        m1725SelectableChipu0RnIRE(z, modifier, iyVar, z2, myVar, textStyle, myVar2, myVar3, myVar4, shape, selectableChipColors, selectableChipElevation, borderStroke, f, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return w01.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v32, types: [androidx.compose.foundation.BorderStroke] */
    /* JADX WARN: Type inference failed for: r4v33 */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void SuggestionChip(iy iyVar, my myVar, Modifier modifier, boolean z, my myVar2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        iy iyVar2;
        int i3;
        my myVar3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        my myVar4;
        Shape shape2;
        ChipColors chipColors2;
        int i6;
        ChipElevation chipElevation2;
        int i7;
        int i8;
        int i9;
        Composer composer2;
        boolean z3;
        my myVar5;
        Shape shape3;
        ChipColors chipColors3;
        ChipElevation chipElevation3;
        ChipBorder chipBorder2;
        MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        int i10;
        Shape shape4;
        ChipColors chipColors4;
        int i11;
        Composer composer3;
        ChipBorder chipBorder3;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape5;
        ChipColors chipColors5;
        BorderStroke borderStroke;
        int i12;
        ChipElevation chipElevation4;
        boolean z4;
        my myVar6;
        State<BorderStroke> borderStroke$material3;
        int i13;
        int i14;
        int i15;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(270460261);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            myVar3 = myVar;
        } else {
            myVar3 = myVar;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(myVar3) ? 32 : 16;
            }
        }
        int i17 = i2 & 4;
        if (i17 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    myVar4 = myVar2;
                    i3 |= startRestartGroup.changedInstance(myVar4) ? Fields.Clip : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i16 = Fields.RenderEffect;
                                i3 |= i16;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i16 = 65536;
                        i3 |= i16;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            chipColors2 = chipColors;
                            if (startRestartGroup.changed(chipColors2)) {
                                i15 = 1048576;
                                i3 |= i15;
                            }
                        } else {
                            chipColors2 = chipColors;
                        }
                        i15 = Fields.BlendMode;
                        i3 |= i15;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 12582912) != 0) {
                        i6 = 12582912;
                        if ((i2 & Fields.SpotShadowColor) == 0) {
                            chipElevation2 = chipElevation;
                            if (startRestartGroup.changed(chipElevation2)) {
                                i14 = GroupFlagsKt.IsNodeFlag;
                                i3 |= i14;
                            }
                        } else {
                            chipElevation2 = chipElevation;
                        }
                        i14 = 4194304;
                        i3 |= i14;
                    } else {
                        i6 = 12582912;
                        chipElevation2 = chipElevation;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i2 & Fields.RotationX) == 0 && startRestartGroup.changed(chipBorder)) {
                            i13 = GroupFlagsKt.IsRecompositionRequiredFlag;
                            i3 |= i13;
                        }
                        i13 = GroupFlagsKt.HasAuxSlotFlag;
                        i3 |= i13;
                    }
                    i7 = i2 & Fields.RotationY;
                    if (i7 == 0) {
                        i3 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i8 = i7;
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i9 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i9 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier3 = i17 != 0 ? Modifier.Companion : modifier2;
                                boolean z5 = i4 == 0 ? z2 : true;
                                my myVar7 = i5 != 0 ? null : myVar4;
                                if ((i2 & 32) != 0) {
                                    i10 = i9 & (-458753);
                                    shape4 = SuggestionChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                } else {
                                    i10 = i9;
                                    shape4 = shape2;
                                }
                                if ((i2 & 64) != 0) {
                                    i10 &= -3670017;
                                    chipColors4 = SuggestionChipDefaults.INSTANCE.suggestionChipColors(startRestartGroup, 6);
                                } else {
                                    chipColors4 = chipColors2;
                                }
                                int i18 = i10;
                                if ((i2 & Fields.SpotShadowColor) != 0) {
                                    composer3 = startRestartGroup;
                                    i18 &= -29360129;
                                    i11 = 6;
                                    chipElevation2 = SuggestionChipDefaults.INSTANCE.m2463suggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer3, 1572864, 63);
                                } else {
                                    i11 = 6;
                                    composer3 = startRestartGroup;
                                }
                                if ((i2 & Fields.RotationX) != 0) {
                                    startRestartGroup = composer3;
                                    chipBorder3 = SuggestionChipDefaults.INSTANCE.m2460suggestionChipBorderd_3_b6Q(0L, 0L, 0.0f, startRestartGroup, 3072, 7);
                                    i18 &= -234881025;
                                } else {
                                    startRestartGroup = composer3;
                                    chipBorder3 = chipBorder;
                                }
                                if (i8 != 0) {
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    modifier2 = modifier3;
                                    mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    modifier2 = modifier3;
                                }
                                shape5 = shape4;
                                chipColors5 = chipColors4;
                                borderStroke = 0;
                                i12 = i18;
                                chipElevation4 = chipElevation2;
                                z4 = z5;
                                myVar6 = myVar7;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i9 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i9 &= -3670017;
                                }
                                if ((i2 & Fields.SpotShadowColor) != 0) {
                                    i9 &= -29360129;
                                }
                                if ((i2 & Fields.RotationX) != 0) {
                                    i9 &= -234881025;
                                }
                                chipBorder3 = chipBorder;
                                mutableInteractionSource3 = mutableInteractionSource;
                                myVar6 = myVar4;
                                shape5 = shape2;
                                chipColors5 = chipColors2;
                                borderStroke = 0;
                                i11 = 6;
                                chipElevation4 = chipElevation2;
                                i12 = i9;
                                z4 = z2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(270460261, i12, -1, "androidx.compose.material3.SuggestionChip (Chip.kt:828)");
                            }
                            TextStyle value = TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, i11);
                            long m1713labelColorvNxB06k$material3 = chipColors5.m1713labelColorvNxB06k$material3(z4);
                            if (chipBorder3 == null) {
                                startRestartGroup.startReplaceGroup(-75666041);
                                startRestartGroup.endReplaceGroup();
                                borderStroke$material3 = borderStroke;
                            } else {
                                startRestartGroup.startReplaceGroup(-2080650822);
                                borderStroke$material3 = chipBorder3.borderStroke$material3(z4, startRestartGroup, ((i12 >> 9) & 14) | ((i12 >> 21) & 112));
                                startRestartGroup.endReplaceGroup();
                            }
                            if (borderStroke$material3 != null) {
                                borderStroke = borderStroke$material3.getValue();
                            }
                            int i19 = i12 << 6;
                            int i20 = ((i12 >> 6) & 14) | i6 | ((i12 << 3) & 112) | ((i12 >> 3) & 896) | (i19 & 7168) | (i19 & 3670016);
                            int i21 = i12 << 9;
                            ChipColors chipColors6 = chipColors5;
                            composer2 = startRestartGroup;
                            my myVar8 = myVar3;
                            Modifier modifier4 = modifier2;
                            m1723ChipnkUnTEs(modifier4, iyVar2, z4, myVar8, value, m1713labelColorvNxB06k$material3, myVar6, null, shape5, chipColors6, chipElevation4, borderStroke, SuggestionChipDefaults.INSTANCE.m2458getHeightD9Ej5fM(), SuggestionChipPadding, mutableInteractionSource3, composer2, i20 | (234881024 & i21) | (i21 & 1879048192), ((i12 >> 21) & 14) | 3456 | ((i12 >> 15) & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            chipBorder2 = chipBorder3;
                            modifier2 = modifier4;
                            z3 = z4;
                            myVar5 = myVar6;
                            shape3 = shape5;
                            chipColors3 = chipColors6;
                            chipElevation3 = chipElevation4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            z3 = z2;
                            myVar5 = myVar4;
                            shape3 = shape2;
                            chipColors3 = chipColors2;
                            chipElevation3 = chipElevation2;
                            chipBorder2 = chipBorder;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new ci(iyVar, myVar, modifier2, z3, myVar5, shape3, chipColors3, chipElevation3, chipBorder2, mutableInteractionSource2, i, i2, 1));
                            return;
                        }
                        return;
                    }
                    i8 = i7;
                    i9 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i9 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                myVar4 = myVar2;
                if ((196608 & i) != 0) {
                }
                if ((1572864 & i) != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i7 = i2 & Fields.RotationY;
                if (i7 == 0) {
                }
                i8 = i7;
                i9 = i3;
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i9 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            myVar4 = myVar2;
            if ((196608 & i) != 0) {
            }
            if ((1572864 & i) != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i7 = i2 & Fields.RotationY;
            if (i7 == 0) {
            }
            i8 = i7;
            i9 = i3;
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i9 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        myVar4 = myVar2;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i7 = i2 & Fields.RotationY;
        if (i7 == 0) {
        }
        i8 = i7;
        i9 = i3;
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SuggestionChip$lambda$11(iy iyVar, my myVar, Modifier modifier, boolean z, my myVar2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        SuggestionChip(iyVar, myVar, modifier, z, myVar2, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SuggestionChip$lambda$9(iy iyVar, my myVar, Modifier modifier, boolean z, my myVar2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        SuggestionChip(iyVar, myVar, modifier, z, myVar2, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    public static final ChipColors getDefaultSuggestionChipColors(ColorScheme colorScheme) {
        ChipColors defaultSuggestionChipColorsCached$material3 = colorScheme.getDefaultSuggestionChipColorsCached$material3();
        if (defaultSuggestionChipColorsCached$material3 != null) {
            return defaultSuggestionChipColorsCached$material3;
        }
        Color.Companion companion = Color.Companion;
        long m4796getTransparent0d7_KjU = companion.m4796getTransparent0d7_KjU();
        SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
        ChipColors chipColors = new ChipColors(m4796getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getLeadingIconColor()), companion.m4797getUnspecified0d7_KjU(), companion.m4796getTransparent0d7_KjU(), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getDisabledLabelTextColor()), suggestionChipTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getDisabledLeadingIconColor()), suggestionChipTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), companion.m4797getUnspecified0d7_KjU(), null);
        colorScheme.setDefaultSuggestionChipColorsCached$material3(chipColors);
        return chipColors;
    }

    private static final PaddingValues inputChipPadding(boolean z, boolean z2, boolean z3) {
        return PaddingKt.m759PaddingValuesa9UjIt4$default((z || !z2) ? Dp.m7611constructorimpl(4.0f) : Dp.m7611constructorimpl(8.0f), 0.0f, z3 ? Dp.m7611constructorimpl(8.0f) : Dp.m7611constructorimpl(4.0f), 0.0f, 10, null);
    }

    public static /* synthetic */ PaddingValues inputChipPadding$default(boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return inputChipPadding(z, z2, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: leadingContent-XO-JAsU, reason: not valid java name */
    public static final my m1730leadingContentXOJAsU(my myVar, final my myVar2, final long j, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1330309098, i, -1, "androidx.compose.material3.leadingContent (Chip.kt:2212)");
        }
        if (myVar != null) {
            composer.startReplaceGroup(-1473203984);
            composer.endReplaceGroup();
        } else if (myVar2 != null) {
            composer.startReplaceGroup(1575390813);
            myVar = ComposableLambdaKt.rememberComposableLambda(-237350650, true, new my() { // from class: androidx.compose.material3.ChipKt$leadingContent$1
                public final void invoke(Composer composer2, int i2) {
                    if (!composer2.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-237350650, i2, -1, "androidx.compose.material3.leadingContent.<anonymous> (Chip.kt:2216)");
                    }
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(j)), myVar2, composer2, ProvidedValue.$stable);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return w01.a;
                }
            }, composer, 54);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1575618259);
            composer.endReplaceGroup();
            myVar = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return myVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> State<T> rememberRetainedState(T t, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-618198444, i, -1, "androidx.compose.material3.rememberRetainedState (Chip.kt:2248)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        if (t != null) {
            mutableState.setValue(t);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: trailingContent-RPmYEkk, reason: not valid java name */
    public static final my m1731trailingContentRPmYEkk(final my myVar, final long j, Composer composer, int i) {
        ComposableLambda composableLambda;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-165980551, i, -1, "androidx.compose.material3.trailingContent (Chip.kt:2231)");
        }
        if (myVar != null) {
            composer.startReplaceGroup(-1219055576);
            composableLambda = ComposableLambdaKt.rememberComposableLambda(-566924201, true, new my() { // from class: androidx.compose.material3.ChipKt$trailingContent$1
                public final void invoke(Composer composer2, int i2) {
                    if (!composer2.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-566924201, i2, -1, "androidx.compose.material3.trailingContent.<anonymous> (Chip.kt:2233)");
                    }
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(j)), myVar, composer2, ProvidedValue.$stable);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return w01.a;
                }
            }, composer, 54);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1218863531);
            composer.endReplaceGroup();
            composableLambda = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return composableLambda;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedSuggestionChip(iy iyVar, my myVar, Modifier modifier, boolean z, my myVar2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        iy iyVar2;
        int i3;
        my myVar3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        my myVar4;
        Shape shape2;
        ChipColors chipColors2;
        int i6;
        ChipElevation chipElevation2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        my myVar5;
        Composer composer2;
        Shape shape3;
        ChipColors chipColors3;
        ChipElevation chipElevation3;
        BorderStroke borderStroke2;
        MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        int i12;
        Shape shape4;
        ChipColors chipColors4;
        int i13;
        BorderStroke borderStroke3;
        int i14;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape5;
        my myVar6;
        ChipElevation chipElevation4;
        boolean z4;
        int i15;
        int i16;
        int i17;
        Composer startRestartGroup = composer.startRestartGroup(-894435833);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            myVar3 = myVar;
        } else {
            myVar3 = myVar;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(myVar3) ? 32 : 16;
            }
        }
        int i18 = i2 & 4;
        if (i18 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    myVar4 = myVar2;
                    i3 |= startRestartGroup.changedInstance(myVar4) ? Fields.Clip : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i17 = Fields.RenderEffect;
                                i3 |= i17;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i17 = 65536;
                        i3 |= i17;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            chipColors2 = chipColors;
                            if (startRestartGroup.changed(chipColors2)) {
                                i16 = 1048576;
                                i3 |= i16;
                            }
                        } else {
                            chipColors2 = chipColors;
                        }
                        i16 = Fields.BlendMode;
                        i3 |= i16;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 12582912) != 0) {
                        i6 = 12582912;
                        if ((i2 & Fields.SpotShadowColor) == 0) {
                            chipElevation2 = chipElevation;
                            if (startRestartGroup.changed(chipElevation2)) {
                                i15 = GroupFlagsKt.IsNodeFlag;
                                i3 |= i15;
                            }
                        } else {
                            chipElevation2 = chipElevation;
                        }
                        i15 = 4194304;
                        i3 |= i15;
                    } else {
                        i6 = 12582912;
                        chipElevation2 = chipElevation;
                    }
                    i7 = i2 & Fields.RotationX;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i8 = i18;
                        i3 |= startRestartGroup.changed(borderStroke) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        i9 = i2 & Fields.RotationY;
                        if (i9 != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i10 = i9;
                            i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            i11 = i3;
                            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i11 & 1)) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 32) != 0) {
                                        i11 &= -458753;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i11 &= -3670017;
                                    }
                                    if ((i2 & Fields.SpotShadowColor) != 0) {
                                        i11 &= -29360129;
                                    }
                                    borderStroke3 = borderStroke;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    modifier3 = modifier2;
                                    myVar6 = myVar4;
                                    shape5 = shape2;
                                    chipElevation4 = chipElevation2;
                                    i14 = i11;
                                    i13 = 6;
                                    z4 = z2;
                                } else {
                                    modifier3 = i8 != 0 ? Modifier.Companion : modifier2;
                                    boolean z5 = i4 == 0 ? z2 : true;
                                    my myVar7 = i5 != 0 ? null : myVar4;
                                    if ((i2 & 32) != 0) {
                                        i12 = i11 & (-458753);
                                        shape4 = SuggestionChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                    } else {
                                        i12 = i11;
                                        shape4 = shape2;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i12 &= -3670017;
                                        chipColors4 = SuggestionChipDefaults.INSTANCE.elevatedSuggestionChipColors(startRestartGroup, 6);
                                    } else {
                                        chipColors4 = chipColors2;
                                    }
                                    int i19 = i12;
                                    if ((i2 & Fields.SpotShadowColor) != 0) {
                                        i19 &= -29360129;
                                        i13 = 6;
                                        chipElevation2 = SuggestionChipDefaults.INSTANCE.m2457elevatedSuggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                                    } else {
                                        i13 = 6;
                                    }
                                    int i20 = i19;
                                    borderStroke3 = i7 != 0 ? null : borderStroke;
                                    i14 = i20;
                                    mutableInteractionSource3 = i10 != 0 ? null : mutableInteractionSource;
                                    shape5 = shape4;
                                    chipColors2 = chipColors4;
                                    myVar6 = myVar7;
                                    chipElevation4 = chipElevation2;
                                    z4 = z5;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-894435833, i14, -1, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:899)");
                                }
                                int i21 = i14 << 6;
                                int i22 = ((i14 >> 6) & 14) | i6 | ((i14 << 3) & 112) | ((i14 >> 3) & 896) | (i21 & 7168) | (i21 & 3670016);
                                int i23 = i14 << 9;
                                int i24 = i22 | (234881024 & i23) | (i23 & 1879048192);
                                int i25 = i14 >> 21;
                                ChipColors chipColors5 = chipColors2;
                                my myVar8 = myVar3;
                                Modifier modifier4 = modifier3;
                                m1723ChipnkUnTEs(modifier4, iyVar2, z4, myVar8, TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, i13), chipColors2.m1713labelColorvNxB06k$material3(z4), myVar6, null, shape5, chipColors5, chipElevation4, borderStroke3, SuggestionChipDefaults.INSTANCE.m2458getHeightD9Ej5fM(), SuggestionChipPadding, mutableInteractionSource3, startRestartGroup, i24, (i25 & 112) | (i25 & 14) | 3456 | ((i14 >> 15) & 57344));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2 = startRestartGroup;
                                modifier2 = modifier4;
                                z3 = z4;
                                myVar5 = myVar6;
                                shape3 = shape5;
                                chipColors3 = chipColors5;
                                chipElevation3 = chipElevation4;
                                borderStroke2 = borderStroke3;
                                mutableInteractionSource2 = mutableInteractionSource3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                z3 = z2;
                                myVar5 = myVar4;
                                composer2 = startRestartGroup;
                                shape3 = shape2;
                                chipColors3 = chipColors2;
                                chipElevation3 = chipElevation2;
                                borderStroke2 = borderStroke;
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new gi(iyVar, myVar, modifier2, z3, myVar5, shape3, chipColors3, chipElevation3, borderStroke2, mutableInteractionSource2, i, i2, 1));
                                return;
                            }
                            return;
                        }
                        i10 = i9;
                        i11 = i3;
                        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i11 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i8 = i18;
                    i9 = i2 & Fields.RotationY;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    i11 = i3;
                    if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i11 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                myVar4 = myVar2;
                if ((196608 & i) != 0) {
                }
                if ((1572864 & i) != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i7 = i2 & Fields.RotationX;
                if (i7 == 0) {
                }
                i8 = i18;
                i9 = i2 & Fields.RotationY;
                if (i9 != 0) {
                }
                i10 = i9;
                i11 = i3;
                if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i11 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            myVar4 = myVar2;
            if ((196608 & i) != 0) {
            }
            if ((1572864 & i) != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i7 = i2 & Fields.RotationX;
            if (i7 == 0) {
            }
            i8 = i18;
            i9 = i2 & Fields.RotationY;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3;
            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i11 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        myVar4 = myVar2;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i7 = i2 & Fields.RotationX;
        if (i7 == 0) {
        }
        i8 = i18;
        i9 = i2 & Fields.RotationY;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3;
        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i11 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SuggestionChip(iy iyVar, my myVar, Modifier modifier, boolean z, my myVar2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        iy iyVar2;
        int i3;
        my myVar3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        my myVar4;
        Shape shape2;
        ChipColors chipColors2;
        int i6;
        ChipElevation chipElevation2;
        int i7;
        int i8;
        int i9;
        boolean z3;
        my myVar5;
        Composer composer2;
        Shape shape3;
        ChipColors chipColors3;
        ChipElevation chipElevation3;
        BorderStroke borderStroke2;
        MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        int i10;
        Shape shape4;
        ChipColors chipColors4;
        int i11;
        Modifier modifier3;
        int i12;
        boolean z4;
        BorderStroke borderStroke3;
        int i13;
        MutableInteractionSource mutableInteractionSource3;
        BorderStroke borderStroke4;
        int i14;
        Shape shape5;
        my myVar6;
        ChipElevation chipElevation4;
        boolean z5;
        int i15;
        int i16;
        int i17;
        int i18;
        Composer startRestartGroup = composer.startRestartGroup(-252243183);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            myVar3 = myVar;
        } else {
            myVar3 = myVar;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(myVar3) ? 32 : 16;
            }
        }
        int i19 = i2 & 4;
        if (i19 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    myVar4 = myVar2;
                    i3 |= startRestartGroup.changedInstance(myVar4) ? Fields.Clip : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i18 = Fields.RenderEffect;
                                i3 |= i18;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i18 = 65536;
                        i3 |= i18;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            chipColors2 = chipColors;
                            if (startRestartGroup.changed(chipColors2)) {
                                i17 = 1048576;
                                i3 |= i17;
                            }
                        } else {
                            chipColors2 = chipColors;
                        }
                        i17 = Fields.BlendMode;
                        i3 |= i17;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 12582912) != 0) {
                        i6 = 12582912;
                        if ((i2 & Fields.SpotShadowColor) == 0) {
                            chipElevation2 = chipElevation;
                            if (startRestartGroup.changed(chipElevation2)) {
                                i16 = GroupFlagsKt.IsNodeFlag;
                                i3 |= i16;
                            }
                        } else {
                            chipElevation2 = chipElevation;
                        }
                        i16 = 4194304;
                        i3 |= i16;
                    } else {
                        i6 = 12582912;
                        chipElevation2 = chipElevation;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i2 & Fields.RotationX) == 0 && startRestartGroup.changed(borderStroke)) {
                            i15 = GroupFlagsKt.IsRecompositionRequiredFlag;
                            i3 |= i15;
                        }
                        i15 = GroupFlagsKt.HasAuxSlotFlag;
                        i3 |= i15;
                    }
                    i7 = i2 & Fields.RotationY;
                    if (i7 == 0) {
                        i3 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i8 = i7;
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i9 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i9 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i9 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i9 &= -3670017;
                                }
                                if ((i2 & Fields.SpotShadowColor) != 0) {
                                    i9 &= -29360129;
                                }
                                if ((i2 & Fields.RotationX) != 0) {
                                    i9 &= -234881025;
                                }
                                borderStroke4 = borderStroke;
                                mutableInteractionSource3 = mutableInteractionSource;
                                i12 = 6;
                                myVar6 = myVar4;
                                shape5 = shape2;
                                chipElevation4 = chipElevation2;
                                i14 = i9;
                                z5 = z2;
                            } else {
                                Modifier modifier4 = i19 != 0 ? Modifier.Companion : modifier2;
                                boolean z6 = i4 == 0 ? z2 : true;
                                my myVar7 = i5 != 0 ? null : myVar4;
                                if ((i2 & 32) != 0) {
                                    i10 = i9 & (-458753);
                                    shape4 = SuggestionChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                } else {
                                    i10 = i9;
                                    shape4 = shape2;
                                }
                                if ((i2 & 64) != 0) {
                                    i10 &= -3670017;
                                    chipColors4 = SuggestionChipDefaults.INSTANCE.suggestionChipColors(startRestartGroup, 6);
                                } else {
                                    chipColors4 = chipColors2;
                                }
                                int i20 = i10;
                                if ((i2 & Fields.SpotShadowColor) != 0) {
                                    i20 &= -29360129;
                                    i11 = 6;
                                    chipElevation2 = SuggestionChipDefaults.INSTANCE.m2463suggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                                } else {
                                    i11 = 6;
                                }
                                if ((i2 & Fields.RotationX) != 0) {
                                    modifier3 = modifier4;
                                    i12 = i11;
                                    z4 = z6;
                                    borderStroke3 = SuggestionChipDefaults.INSTANCE.m2461suggestionChipBorderh1eTWw(z4, 0L, 0L, 0.0f, startRestartGroup, ((i20 >> 9) & 14) | 24576, 14);
                                    i13 = i20 & (-234881025);
                                } else {
                                    modifier3 = modifier4;
                                    i12 = i11;
                                    z4 = z6;
                                    borderStroke3 = borderStroke;
                                    i13 = i20;
                                }
                                if (i8 != 0) {
                                    borderStroke4 = borderStroke3;
                                    i14 = i13;
                                    mutableInteractionSource3 = null;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    borderStroke4 = borderStroke3;
                                    i14 = i13;
                                }
                                shape5 = shape4;
                                chipColors2 = chipColors4;
                                myVar6 = myVar7;
                                modifier2 = modifier3;
                                chipElevation4 = chipElevation2;
                                z5 = z4;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-252243183, i14, -1, "androidx.compose.material3.SuggestionChip (Chip.kt:746)");
                            }
                            int i21 = i14 << 6;
                            int i22 = ((i14 >> 6) & 14) | i6 | ((i14 << 3) & 112) | ((i14 >> 3) & 896) | (i21 & 7168) | (i21 & 3670016);
                            int i23 = i14 << 9;
                            int i24 = i22 | (234881024 & i23) | (i23 & 1879048192);
                            int i25 = i14 >> 21;
                            ChipColors chipColors5 = chipColors2;
                            my myVar8 = myVar3;
                            Modifier modifier5 = modifier2;
                            m1723ChipnkUnTEs(modifier5, iyVar2, z5, myVar8, TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, i12), chipColors2.m1713labelColorvNxB06k$material3(z5), myVar6, null, shape5, chipColors5, chipElevation4, borderStroke4, SuggestionChipDefaults.INSTANCE.m2458getHeightD9Ej5fM(), SuggestionChipPadding, mutableInteractionSource3, startRestartGroup, i24, (i25 & 112) | (i25 & 14) | 3456 | ((i14 >> 15) & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2 = startRestartGroup;
                            modifier2 = modifier5;
                            z3 = z5;
                            myVar5 = myVar6;
                            shape3 = shape5;
                            chipColors3 = chipColors5;
                            chipElevation3 = chipElevation4;
                            borderStroke2 = borderStroke4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z3 = z2;
                            myVar5 = myVar4;
                            composer2 = startRestartGroup;
                            shape3 = shape2;
                            chipColors3 = chipColors2;
                            chipElevation3 = chipElevation2;
                            borderStroke2 = borderStroke;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new gi(iyVar, myVar, modifier2, z3, myVar5, shape3, chipColors3, chipElevation3, borderStroke2, mutableInteractionSource2, i, i2, 0));
                            return;
                        }
                        return;
                    }
                    i8 = i7;
                    i9 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i9 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                myVar4 = myVar2;
                if ((196608 & i) != 0) {
                }
                if ((1572864 & i) != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i7 = i2 & Fields.RotationY;
                if (i7 == 0) {
                }
                i8 = i7;
                i9 = i3;
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i9 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            myVar4 = myVar2;
            if ((196608 & i) != 0) {
            }
            if ((1572864 & i) != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i7 = i2 & Fields.RotationY;
            if (i7 == 0) {
            }
            i8 = i7;
            i9 = i3;
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i9 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        myVar4 = myVar2;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i7 = i2 & Fields.RotationY;
        if (i7 == 0) {
        }
        i8 = i7;
        i9 = i3;
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedAssistChip(iy iyVar, my myVar, Modifier modifier, boolean z, my myVar2, my myVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2, int i3) {
        int i4;
        my myVar4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        my myVar5;
        int i7;
        ChipColors chipColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        my myVar6;
        ChipElevation chipElevation2;
        MutableInteractionSource mutableInteractionSource2;
        boolean z3;
        Composer composer2;
        Shape shape2;
        ChipColors chipColors3;
        Modifier modifier3;
        my myVar7;
        BorderStroke borderStroke2;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        int i14;
        Modifier modifier4;
        int i15;
        int i16;
        ChipElevation chipElevation3;
        int i17;
        MutableInteractionSource mutableInteractionSource3;
        ChipElevation chipElevation4;
        BorderStroke borderStroke3;
        my myVar8;
        my myVar9;
        Modifier modifier5;
        Shape shape4;
        int i18;
        int i19;
        Composer startRestartGroup = composer.startRestartGroup(2028863105);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            myVar4 = myVar;
        } else {
            myVar4 = myVar;
            if ((i & 48) == 0) {
                i4 |= startRestartGroup.changedInstance(myVar4) ? 32 : 16;
            }
        }
        int i20 = i3 & 4;
        if (i20 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    myVar5 = myVar2;
                    i4 |= startRestartGroup.changedInstance(myVar5) ? Fields.Clip : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i4 |= startRestartGroup.changedInstance(myVar3) ? Fields.RenderEffect : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape)) ? 1048576 : Fields.BlendMode;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & Fields.SpotShadowColor) == 0) {
                            chipColors2 = chipColors;
                            if (startRestartGroup.changed(chipColors2)) {
                                i19 = GroupFlagsKt.IsNodeFlag;
                                i4 |= i19;
                            }
                        } else {
                            chipColors2 = chipColors;
                        }
                        i19 = 4194304;
                        i4 |= i19;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i3 & Fields.RotationX) == 0 && startRestartGroup.changed(chipElevation)) {
                            i18 = GroupFlagsKt.IsRecompositionRequiredFlag;
                            i4 |= i18;
                        }
                        i18 = GroupFlagsKt.HasAuxSlotFlag;
                        i4 |= i18;
                    }
                    i8 = i3 & Fields.RotationY;
                    if (i8 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i9 = i8;
                        i4 |= startRestartGroup.changed(borderStroke) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i10 = i3 & Fields.RotationZ;
                        if (i10 != 0) {
                            i11 = i10;
                            i12 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i11 = i10;
                            i12 = i2 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                        } else {
                            i11 = i10;
                            i12 = i2;
                        }
                        i13 = i4;
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i13 & 1)) {
                            startRestartGroup.startDefaults();
                            int i21 = i12;
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                int i22 = (i3 & 64) != 0 ? i13 & (-3670017) : i13;
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    i22 &= -29360129;
                                }
                                if ((i3 & Fields.RotationX) != 0) {
                                    i22 &= -234881025;
                                }
                                myVar8 = myVar3;
                                shape4 = shape;
                                chipElevation4 = chipElevation;
                                borderStroke3 = borderStroke;
                                mutableInteractionSource3 = mutableInteractionSource;
                                i15 = 6;
                                modifier5 = modifier2;
                                i17 = i22;
                                i16 = i21;
                                myVar9 = myVar5;
                            } else {
                                Modifier modifier6 = i20 != 0 ? Modifier.Companion : modifier2;
                                boolean z4 = i5 == 0 ? z2 : true;
                                my myVar10 = i6 != 0 ? null : myVar5;
                                my myVar11 = i7 != 0 ? null : myVar3;
                                if ((i3 & 64) != 0) {
                                    i14 = i13 & (-3670017);
                                    shape3 = AssistChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                } else {
                                    shape3 = shape;
                                    i14 = i13;
                                }
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    chipColors2 = AssistChipDefaults.INSTANCE.elevatedAssistChipColors(startRestartGroup, 6);
                                    i14 &= -29360129;
                                }
                                ChipColors chipColors4 = chipColors2;
                                int i23 = i14;
                                if ((i3 & Fields.RotationX) != 0) {
                                    modifier4 = modifier6;
                                    i16 = i21;
                                    i15 = 6;
                                    chipElevation3 = AssistChipDefaults.INSTANCE.m1635elevatedAssistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                                    i17 = i23 & (-234881025);
                                } else {
                                    modifier4 = modifier6;
                                    i15 = 6;
                                    i16 = i21;
                                    chipElevation3 = chipElevation;
                                    i17 = i23;
                                }
                                BorderStroke borderStroke4 = i9 != 0 ? null : borderStroke;
                                if (i11 != 0) {
                                    chipElevation4 = chipElevation3;
                                    borderStroke3 = borderStroke4;
                                    z2 = z4;
                                    mutableInteractionSource3 = null;
                                    myVar9 = myVar10;
                                    chipColors2 = chipColors4;
                                    myVar8 = myVar11;
                                    shape4 = shape3;
                                    modifier5 = modifier4;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    chipElevation4 = chipElevation3;
                                    borderStroke3 = borderStroke4;
                                    myVar8 = myVar11;
                                    z2 = z4;
                                    myVar9 = myVar10;
                                    chipColors2 = chipColors4;
                                    modifier5 = modifier4;
                                    shape4 = shape3;
                                }
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2028863105, i17, i16, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:305)");
                            }
                            int i24 = i17 << 6;
                            int i25 = i17 >> 24;
                            ChipColors chipColors5 = chipColors2;
                            boolean z5 = z2;
                            m1723ChipnkUnTEs(modifier5, iyVar, z5, myVar4, TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, i15), chipColors2.m1713labelColorvNxB06k$material3(z2), myVar9, myVar8, shape4, chipColors5, chipElevation4, borderStroke3, AssistChipDefaults.INSTANCE.m1636getHeightD9Ej5fM(), AssistChipPadding, mutableInteractionSource3, startRestartGroup, ((i17 >> 6) & 14) | ((i17 << 3) & 112) | ((i17 >> 3) & 896) | (i24 & 7168) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24) | (i24 & 1879048192), (i25 & 112) | (i25 & 14) | 3456 | ((i16 << 12) & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2 = startRestartGroup;
                            modifier3 = modifier5;
                            z3 = z5;
                            myVar7 = myVar9;
                            myVar6 = myVar8;
                            shape2 = shape4;
                            chipColors3 = chipColors5;
                            chipElevation2 = chipElevation4;
                            borderStroke2 = borderStroke3;
                            mutableInteractionSource2 = mutableInteractionSource3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            myVar6 = myVar3;
                            chipElevation2 = chipElevation;
                            mutableInteractionSource2 = mutableInteractionSource;
                            z3 = z2;
                            composer2 = startRestartGroup;
                            shape2 = shape;
                            chipColors3 = chipColors2;
                            modifier3 = modifier2;
                            myVar7 = myVar5;
                            borderStroke2 = borderStroke;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new ei(iyVar, myVar, modifier3, z3, myVar7, myVar6, shape2, chipColors3, chipElevation2, borderStroke2, mutableInteractionSource2, i, i2, i3, 0));
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    i10 = i3 & Fields.RotationZ;
                    if (i10 != 0) {
                    }
                    i13 = i4;
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i13 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                myVar5 = myVar2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i8 = i3 & Fields.RotationY;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i3 & Fields.RotationZ;
                if (i10 != 0) {
                }
                i13 = i4;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i13 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            myVar5 = myVar2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i8 = i3 & Fields.RotationY;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3 & Fields.RotationZ;
            if (i10 != 0) {
            }
            i13 = i4;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i13 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        myVar5 = myVar2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i8 = i3 & Fields.RotationY;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & Fields.RotationZ;
        if (i10 != 0) {
        }
        i13 = i4;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i13 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssistChip(iy iyVar, my myVar, Modifier modifier, boolean z, my myVar2, my myVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2, int i3) {
        int i4;
        my myVar4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        my myVar5;
        int i7;
        ChipColors chipColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        my myVar6;
        ChipElevation chipElevation2;
        MutableInteractionSource mutableInteractionSource2;
        boolean z3;
        Composer composer2;
        Shape shape2;
        ChipColors chipColors3;
        Modifier modifier3;
        my myVar7;
        BorderStroke borderStroke2;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        int i12;
        Modifier modifier4;
        int i13;
        int i14;
        ChipElevation chipElevation3;
        boolean z4;
        BorderStroke borderStroke3;
        int i15;
        MutableInteractionSource mutableInteractionSource3;
        BorderStroke borderStroke4;
        int i16;
        my myVar8;
        ChipElevation chipElevation4;
        my myVar9;
        Modifier modifier5;
        Shape shape4;
        int i17;
        int i18;
        int i19;
        Composer startRestartGroup = composer.startRestartGroup(1192083339);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            myVar4 = myVar;
        } else {
            myVar4 = myVar;
            if ((i & 48) == 0) {
                i4 |= startRestartGroup.changedInstance(myVar4) ? 32 : 16;
            }
        }
        int i20 = i3 & 4;
        if (i20 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    myVar5 = myVar2;
                    i4 |= startRestartGroup.changedInstance(myVar5) ? Fields.Clip : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i4 |= startRestartGroup.changedInstance(myVar3) ? Fields.RenderEffect : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape)) ? 1048576 : Fields.BlendMode;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & Fields.SpotShadowColor) == 0) {
                            chipColors2 = chipColors;
                            if (startRestartGroup.changed(chipColors2)) {
                                i19 = GroupFlagsKt.IsNodeFlag;
                                i4 |= i19;
                            }
                        } else {
                            chipColors2 = chipColors;
                        }
                        i19 = 4194304;
                        i4 |= i19;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i3 & Fields.RotationX) == 0 && startRestartGroup.changed(chipElevation)) {
                            i18 = GroupFlagsKt.IsRecompositionRequiredFlag;
                            i4 |= i18;
                        }
                        i18 = GroupFlagsKt.HasAuxSlotFlag;
                        i4 |= i18;
                    }
                    if ((i & 805306368) == 0) {
                        if ((i3 & Fields.RotationY) == 0 && startRestartGroup.changed(borderStroke)) {
                            i17 = GroupFlagsKt.HasMovableContentFlag;
                            i4 |= i17;
                        }
                        i17 = GroupFlagsKt.IsMovableContentFlag;
                        i4 |= i17;
                    }
                    i8 = i3 & Fields.RotationZ;
                    if (i8 == 0) {
                        i9 = i8;
                        i10 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i9 = i8;
                        i10 = i2 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                    } else {
                        i9 = i8;
                        i10 = i2;
                    }
                    i11 = i4;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i11 & 1)) {
                        startRestartGroup.startDefaults();
                        int i21 = i10;
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            int i22 = (i3 & 64) != 0 ? i11 & (-3670017) : i11;
                            if ((i3 & Fields.SpotShadowColor) != 0) {
                                i22 &= -29360129;
                            }
                            if ((i3 & Fields.RotationX) != 0) {
                                i22 &= -234881025;
                            }
                            if ((i3 & Fields.RotationY) != 0) {
                                i22 &= -1879048193;
                            }
                            myVar8 = myVar3;
                            shape4 = shape;
                            chipElevation4 = chipElevation;
                            borderStroke4 = borderStroke;
                            mutableInteractionSource3 = mutableInteractionSource;
                            i16 = i22;
                            i13 = 6;
                            modifier5 = modifier2;
                            z4 = z2;
                            i14 = i21;
                            myVar9 = myVar5;
                        } else {
                            Modifier modifier6 = i20 != 0 ? Modifier.Companion : modifier2;
                            boolean z5 = i5 == 0 ? z2 : true;
                            my myVar10 = i6 != 0 ? null : myVar5;
                            my myVar11 = i7 != 0 ? null : myVar3;
                            if ((i3 & 64) != 0) {
                                i12 = i11 & (-3670017);
                                shape3 = AssistChipDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            } else {
                                shape3 = shape;
                                i12 = i11;
                            }
                            if ((i3 & Fields.SpotShadowColor) != 0) {
                                chipColors2 = AssistChipDefaults.INSTANCE.assistChipColors(startRestartGroup, 6);
                                i12 &= -29360129;
                            }
                            ChipColors chipColors4 = chipColors2;
                            int i23 = i12;
                            if ((i3 & Fields.RotationX) != 0) {
                                modifier4 = modifier6;
                                i14 = i21;
                                i13 = 6;
                                i23 &= -234881025;
                                chipElevation3 = AssistChipDefaults.INSTANCE.m1633assistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                            } else {
                                modifier4 = modifier6;
                                i13 = 6;
                                i14 = i21;
                                chipElevation3 = chipElevation;
                            }
                            if ((i3 & Fields.RotationY) != 0) {
                                z4 = z5;
                                borderStroke3 = AssistChipDefaults.INSTANCE.m1631assistChipBorderh1eTWw(z4, 0L, 0L, 0.0f, startRestartGroup, ((i23 >> 9) & 14) | 24576, 14);
                                i15 = i23 & (-1879048193);
                            } else {
                                z4 = z5;
                                borderStroke3 = borderStroke;
                                i15 = i23;
                            }
                            if (i9 != 0) {
                                borderStroke4 = borderStroke3;
                                i16 = i15;
                                chipElevation4 = chipElevation3;
                                mutableInteractionSource3 = null;
                                myVar9 = myVar10;
                                chipColors2 = chipColors4;
                                myVar8 = myVar11;
                                shape4 = shape3;
                                modifier5 = modifier4;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                borderStroke4 = borderStroke3;
                                i16 = i15;
                                myVar8 = myVar11;
                                chipElevation4 = chipElevation3;
                                myVar9 = myVar10;
                                chipColors2 = chipColors4;
                                modifier5 = modifier4;
                                shape4 = shape3;
                            }
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1192083339, i16, i14, "androidx.compose.material3.AssistChip (Chip.kt:146)");
                        }
                        int i24 = i16 << 6;
                        int i25 = ((i16 >> 6) & 14) | ((i16 << 3) & 112) | ((i16 >> 3) & 896) | (i24 & 7168) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24) | (i24 & 1879048192);
                        int i26 = i16 >> 24;
                        boolean z6 = z4;
                        ChipColors chipColors5 = chipColors2;
                        m1723ChipnkUnTEs(modifier5, iyVar, z6, myVar4, TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), startRestartGroup, i13), chipColors2.m1713labelColorvNxB06k$material3(z4), myVar9, myVar8, shape4, chipColors5, chipElevation4, borderStroke4, AssistChipDefaults.INSTANCE.m1636getHeightD9Ej5fM(), AssistChipPadding, mutableInteractionSource3, startRestartGroup, i25, (i26 & 112) | (i26 & 14) | 3456 | ((i14 << 12) & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2 = startRestartGroup;
                        modifier3 = modifier5;
                        z3 = z6;
                        myVar7 = myVar9;
                        myVar6 = myVar8;
                        shape2 = shape4;
                        chipColors3 = chipColors5;
                        chipElevation2 = chipElevation4;
                        borderStroke2 = borderStroke4;
                        mutableInteractionSource2 = mutableInteractionSource3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        myVar6 = myVar3;
                        chipElevation2 = chipElevation;
                        mutableInteractionSource2 = mutableInteractionSource;
                        z3 = z2;
                        composer2 = startRestartGroup;
                        shape2 = shape;
                        chipColors3 = chipColors2;
                        modifier3 = modifier2;
                        myVar7 = myVar5;
                        borderStroke2 = borderStroke;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new ei(iyVar, myVar, modifier3, z3, myVar7, myVar6, shape2, chipColors3, chipElevation2, borderStroke2, mutableInteractionSource2, i, i2, i3, 1));
                        return;
                    }
                    return;
                }
                myVar5 = myVar2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i8 = i3 & Fields.RotationZ;
                if (i8 == 0) {
                }
                i11 = i4;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i11 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            myVar5 = myVar2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i8 = i3 & Fields.RotationZ;
            if (i8 == 0) {
            }
            i11 = i4;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i11 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        myVar5 = myVar2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i8 = i3 & Fields.RotationZ;
        if (i8 == 0) {
        }
        i11 = i4;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i11 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
