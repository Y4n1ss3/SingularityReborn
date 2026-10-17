package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.material3.internal.MappedInteractionSource;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.util.MathHelpersKt;
import defpackage.ec0;
import defpackage.g7;
import defpackage.iy;
import defpackage.j50;
import defpackage.jc0;
import defpackage.k4;
import defpackage.kf0;
import defpackage.ky;
import defpackage.my;
import defpackage.q10;
import defpackage.q50;
import defpackage.q6;
import defpackage.ru;
import defpackage.t6;
import defpackage.ub0;
import defpackage.w01;
import defpackage.wb0;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationItemKt {
    private static final String IconLayoutIdTag = "icon";
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalOffset = Dp.m7611constructorimpl(12.0f);
    private static final String LabelLayoutIdTag = "label";

    /* JADX WARN: Code restructure failed: missing block: B:162:0x02c7, code lost:
    
        if (defpackage.q10.b(r11.rememberedValue(), java.lang.Integer.valueOf(r3)) == false) goto L181;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x046d  */
    /* renamed from: AnimatedNavigationItem-DQd_Gtc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2206AnimatedNavigationItemDQd_Gtc(final boolean z, final iy iyVar, final my myVar, final Shape shape, final float f, final TextStyle textStyle, final TextStyle textStyle2, final float f2, final float f3, final float f4, final float f5, final float f6, final float f7, final float f8, final float f9, final NavigationItemColors navigationItemColors, final Modifier modifier, final boolean z2, final my myVar2, final int i, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        boolean z3;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        ComposeUiNode.Companion companion;
        State<Float> state;
        MutableIntState mutableIntState;
        boolean z4;
        ComposableLambda composableLambda;
        InteractionSource interactionSource;
        Composer startRestartGroup = composer.startRestartGroup(-1114086313);
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(iyVar) ? 32 : 16;
        }
        int i8 = i2 & 384;
        int i9 = Fields.SpotShadowColor;
        if (i8 == 0) {
            i5 |= startRestartGroup.changedInstance(myVar) ? 256 : 128;
        }
        int i10 = i2 & 3072;
        int i11 = Fields.RotationZ;
        if (i10 == 0) {
            i5 |= startRestartGroup.changed(shape) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= startRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
        }
        int i12 = i2 & 1572864;
        int i13 = Fields.BlendMode;
        if (i12 == 0) {
            i5 |= startRestartGroup.changed(textStyle2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
        }
        int i14 = i2 & 100663296;
        int i15 = GroupFlagsKt.HasAuxSlotFlag;
        if (i14 == 0) {
            i5 |= startRestartGroup.changed(f3) ? 67108864 : 33554432;
        }
        int i16 = i2 & 805306368;
        int i17 = GroupFlagsKt.IsMovableContentFlag;
        if (i16 == 0) {
            i5 |= startRestartGroup.changed(f4) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (startRestartGroup.changed(f5) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changed(f6) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if (startRestartGroup.changed(f7)) {
                i9 = 256;
            }
            i6 |= i9;
        }
        if ((i3 & 3072) == 0) {
            if (startRestartGroup.changed(f8)) {
                i11 = 2048;
            }
            i6 |= i11;
        }
        if ((i3 & 24576) == 0) {
            i6 |= startRestartGroup.changed(f9) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i6 |= startRestartGroup.changed(navigationItemColors) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i13 = 1048576;
            }
            i6 |= i13;
        }
        if ((i3 & 12582912) == 0) {
            i6 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            if (startRestartGroup.changedInstance(myVar2)) {
                i15 = 67108864;
            }
            i6 |= i15;
        }
        if ((i3 & 805306368) == 0) {
            if (startRestartGroup.changed(i)) {
                i17 = 536870912;
            }
            i6 |= i17;
        }
        int i18 = i6;
        if ((i4 & 6) == 0) {
            i7 = i4 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
        } else {
            i7 = i4;
        }
        if ((i5 & 306783379) == 306783378 && (i18 & 306783379) == 306783378) {
            if ((i7 & 3) == 2) {
                z3 = false;
                if (startRestartGroup.shouldExecute(z3, i5 & 1)) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1114086313, i5, i18, "androidx.compose.material3.AnimatedNavigationItem (NavigationItem.kt:343)");
                    }
                    final long m2195iconColorWaAFU9c = navigationItemColors.m2195iconColorWaAFU9c(z, z2);
                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(851124593, true, new my() { // from class: androidx.compose.material3.NavigationItemKt$AnimatedNavigationItem$styledIcon$1
                        public final void invoke(Composer composer3, int i19) {
                            if (!composer3.shouldExecute((i19 & 3) != 2, i19 & 1)) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(851124593, i19, -1, "androidx.compose.material3.AnimatedNavigationItem.<anonymous> (NavigationItem.kt:346)");
                            }
                            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(m2195iconColorWaAFU9c)), myVar, composer3, ProvidedValue.$stable);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // defpackage.my
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return w01.a;
                        }
                    }, startRestartGroup, 54);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    Composer.Companion companion2 = Composer.Companion;
                    if (rememberedValue == companion2.getEmpty()) {
                        rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    MutableIntState mutableIntState2 = (MutableIntState) rememberedValue;
                    int i19 = i5;
                    int i20 = 2;
                    mutableInteractionSource2 = mutableInteractionSource;
                    Modifier m791defaultMinSizeVpY3zN4 = SizeKt.m791defaultMinSizeVpY3zN4(SelectableKt.m1018selectableO2vRcR0(modifier, z, mutableInteractionSource, null, z2, Role.m6821boximpl(Role.Companion.m6835getTabo7Vup1c()), iyVar), ((Dp) startRestartGroup.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m7625unboximpl(), ((Dp) startRestartGroup.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m7625unboximpl());
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == companion2.getEmpty()) {
                        rememberedValue2 = new ub0(mutableIntState2, i20);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m791defaultMinSizeVpY3zN4, (ky) rememberedValue2);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), true);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, onSizeChanged);
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
                    my b = k4.b(companion3, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    if (m3878constructorimpl.getInserting()) {
                        companion = companion3;
                    } else {
                        companion = companion3;
                    }
                    k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    boolean m2200equalsimpl0 = NavigationItemIconPosition.m2200equalsimpl0(i, NavigationItemIconPosition.Companion.m2205getTopxw1Ddg());
                    State<Float> animateIndicatorProgressAsState = animateIndicatorProgressAsState(z, startRestartGroup, i19 & 14);
                    State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(m2200equalsimpl0 ? 0.0f : 1.0f, MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, startRestartGroup, 6), 0.0f, null, null, startRestartGroup, 0, 28);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == companion2.getEmpty()) {
                        rememberedValue3 = SnapshotStateKt.derivedStateOf(new ru(m2200equalsimpl0, textStyle, textStyle2, animateFloatAsState));
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    final State state2 = (State) rememberedValue3;
                    if (myVar2 != null) {
                        startRestartGroup.startReplaceGroup(680212713);
                        state = animateIndicatorProgressAsState;
                        mutableIntState = mutableIntState2;
                        composer2 = startRestartGroup;
                        z4 = true;
                        ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(22475789, true, new my() { // from class: androidx.compose.material3.NavigationItemKt$AnimatedNavigationItem$2$styledLabel$1
                            public final void invoke(Composer composer3, int i21) {
                                TextStyle AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$19;
                                if (!composer3.shouldExecute((i21 & 3) != 2, i21 & 1)) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(22475789, i21, -1, "androidx.compose.material3.AnimatedNavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:387)");
                                }
                                boolean z5 = z;
                                AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$19 = NavigationItemKt.AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$19(state2);
                                NavigationItemKt.StyledLabel(z5, AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$19, navigationItemColors, z2, myVar2, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // defpackage.my
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return w01.a;
                            }
                        }, composer2, 54);
                        composer2.endReplaceGroup();
                        composableLambda = rememberComposableLambda2;
                    } else {
                        state = animateIndicatorProgressAsState;
                        mutableIntState = mutableIntState2;
                        z4 = true;
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(680534989);
                        composer2.endReplaceGroup();
                        composableLambda = null;
                    }
                    if (m2200equalsimpl0) {
                        composer2.startReplaceGroup(680694081);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits((mutableIntState.getIntValue() - density.mo361roundToPx0680j_4(f)) / 2.0f) << 32) | (Float.floatToRawIntBits(density.mo367toPx0680j_4(IndicatorVerticalOffset)) & 4294967295L));
                        boolean changed = ((i7 & 14) == 4 ? z4 : false) | composer2.changed(m4508constructorimpl);
                        Object rememberedValue4 = composer2.rememberedValue();
                        if (changed || rememberedValue4 == companion2.getEmpty()) {
                            rememberedValue4 = new MappedInteractionSource(mutableInteractionSource2, m4508constructorimpl, null);
                            composer2.updateRememberedValue(rememberedValue4);
                        }
                        composer2.endReplaceGroup();
                        interactionSource = (MappedInteractionSource) rememberedValue4;
                    } else {
                        interactionSource = null;
                        composer2.startReplaceGroup(681416753);
                        composer2.endReplaceGroup();
                    }
                    InteractionSource interactionSource2 = interactionSource != null ? interactionSource : mutableInteractionSource2;
                    long m2191getSelectedIndicatorColor0d7_KjU = navigationItemColors.m2191getSelectedIndicatorColor0d7_KjU();
                    boolean changed2 = composer2.changed(state);
                    Object rememberedValue5 = composer2.rememberedValue();
                    if (changed2 || rememberedValue5 == companion2.getEmpty()) {
                        rememberedValue5 = new t6(state, 10);
                        composer2.updateRememberedValue(rememberedValue5);
                    }
                    iy iyVar2 = (iy) rememberedValue5;
                    boolean changed3 = composer2.changed(animateFloatAsState);
                    Object rememberedValue6 = composer2.rememberedValue();
                    if (changed3 || rememberedValue6 == companion2.getEmpty()) {
                        rememberedValue6 = new t6(animateFloatAsState, 11);
                        composer2.updateRememberedValue(rememberedValue6);
                    }
                    iy iyVar3 = (iy) rememberedValue6;
                    int i21 = i19 << 3;
                    int i22 = i18 << 3;
                    m2207AnimatedNavigationItemLayouthe0WsC4(interactionSource2, m2191getSelectedIndicatorColor0d7_KjU, shape, iyVar2, rememberComposableLambda, i, iyVar3, composableLambda, f2, f3, f4, f5, f6, f7, f8, f9, composer2, ((i19 >> 3) & 896) | 24576 | ((i18 >> 12) & 458752) | (234881024 & i21) | (i21 & 1879048192), ((i19 >> 27) & 14) | (i22 & 112) | (i22 & 896) | (i22 & 7168) | (57344 & i22) | (458752 & i22));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                    endRestartGroup.updateScope(new my() { // from class: fc0
                        @Override // defpackage.my
                        public final Object invoke(Object obj, Object obj2) {
                            w01 AnimatedNavigationItem_DQd_Gtc$lambda$27;
                            int intValue = ((Integer) obj2).intValue();
                            AnimatedNavigationItem_DQd_Gtc$lambda$27 = NavigationItemKt.AnimatedNavigationItem_DQd_Gtc$lambda$27(z, iyVar, myVar, shape, f, textStyle, textStyle2, f2, f3, f4, f5, f6, f7, f8, f9, navigationItemColors, modifier, z2, myVar2, i, mutableInteractionSource3, i2, i3, i4, (Composer) obj, intValue);
                            return AnimatedNavigationItem_DQd_Gtc$lambda$27;
                        }
                    });
                    return;
                }
                return;
            }
        }
        z3 = true;
        if (startRestartGroup.shouldExecute(z3, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0213, code lost:
    
        if (defpackage.q10.b(r8.rememberedValue(), java.lang.Integer.valueOf(r11)) == false) goto L147;
     */
    /* renamed from: AnimatedNavigationItemLayout-he0WsC4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m2207AnimatedNavigationItemLayouthe0WsC4(final InteractionSource interactionSource, final long j, final Shape shape, final iy iyVar, final my myVar, final int i, final iy iyVar2, final my myVar2, final float f, final float f2, final float f3, final float f4, final float f5, final float f6, final float f7, final float f8, Composer composer, final int i2, final int i3) {
        int i4;
        iy iyVar3;
        int i5;
        int i6;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(94433406);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(interactionSource) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        int i7 = i2 & 384;
        int i8 = Fields.SpotShadowColor;
        if (i7 == 0) {
            i4 |= startRestartGroup.changed(shape) ? 256 : 128;
        }
        int i9 = i2 & 3072;
        int i10 = Fields.RotationZ;
        if (i9 == 0) {
            iyVar3 = iyVar;
            i4 |= startRestartGroup.changedInstance(iyVar3) ? 2048 : 1024;
        } else {
            iyVar3 = iyVar;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(myVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 = 196608;
            i4 |= startRestartGroup.changed(i) ? 131072 : 65536;
        } else {
            i5 = 196608;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= startRestartGroup.changedInstance(iyVar2) ? 1048576 : Fields.BlendMode;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= startRestartGroup.changedInstance(myVar2) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= startRestartGroup.changed(f) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= startRestartGroup.changed(f2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (startRestartGroup.changed(f3) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changed(f4) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if (startRestartGroup.changed(f5)) {
                i8 = 256;
            }
            i6 |= i8;
        }
        if ((i3 & 3072) == 0) {
            if (startRestartGroup.changed(f6)) {
                i10 = 2048;
            }
            i6 |= i10;
        }
        if ((i3 & 24576) == 0) {
            i6 |= startRestartGroup.changed(f7) ? 16384 : 8192;
        }
        if ((i3 & i5) == 0) {
            i6 |= startRestartGroup.changed(f8) ? 131072 : 65536;
        }
        int i11 = i6;
        if (startRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (74899 & i11) == 74898) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(94433406, i4, i11, "androidx.compose.material3.AnimatedNavigationItemLayout (NavigationItem.kt:508)");
            }
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier badgeBounds = BadgeKt.badgeBounds(companion2);
            MeasurePolicy animatedMeasurePolicy = myVar2 != null ? new AnimatedMeasurePolicy(i, iyVar2, iyVar3, f, f2, f3, f4, f5, f7, f8, null) : new TopIconOrIconOnlyMeasurePolicy(false, iyVar, f6, f6, Dp.m7611constructorimpl(0.0f), Dp.m7611constructorimpl(0.0f), null);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, badgeBounds);
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
            my b = k4.b(companion3, m3878constructorimpl, animatedMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting()) {
                companion = companion2;
            } else {
                companion = companion2;
            }
            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
            int i12 = i4 >> 3;
            IndicatorRipple(interactionSource, shape, startRestartGroup, (i4 & 14) | (i12 & 112));
            int i13 = i4;
            Modifier.Companion companion4 = companion;
            m2208Indicator3JVO9M(j, shape, iyVar, startRestartGroup, i12 & 1022);
            Modifier layoutId = LayoutIdKt.layoutId(companion4, IconLayoutIdTag);
            Alignment.Companion companion5 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
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
            myVar.invoke(startRestartGroup, Integer.valueOf((i13 >> 12) & 14));
            startRestartGroup.endNode();
            if (myVar2 != null) {
                startRestartGroup.startReplaceGroup(-987944825);
                Modifier layoutId2 = LayoutIdKt.layoutId(companion4, LabelLayoutIdTag);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId2);
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
                kf0.f(myVar2, startRestartGroup, (i13 >> 21) & 14);
            } else {
                startRestartGroup.startReplaceGroup(-987864101);
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
            endRestartGroup.updateScope(new my() { // from class: ic0
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 AnimatedNavigationItemLayout_he0WsC4$lambda$35;
                    int intValue = ((Integer) obj2).intValue();
                    AnimatedNavigationItemLayout_he0WsC4$lambda$35 = NavigationItemKt.AnimatedNavigationItemLayout_he0WsC4$lambda$35(InteractionSource.this, j, shape, iyVar, myVar, i, iyVar2, myVar2, f, f2, f3, f4, f5, f6, f7, f8, i2, i3, (Composer) obj, intValue);
                    return AnimatedNavigationItemLayout_he0WsC4$lambda$35;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 AnimatedNavigationItemLayout_he0WsC4$lambda$35(InteractionSource interactionSource, long j, Shape shape, iy iyVar, my myVar, int i, iy iyVar2, my myVar2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i2, int i3, Composer composer, int i4) {
        m2207AnimatedNavigationItemLayouthe0WsC4(interactionSource, j, shape, iyVar, myVar, i, iyVar2, myVar2, f, f2, f3, f4, f5, f6, f7, f8, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 AnimatedNavigationItem_DQd_Gtc$lambda$15$lambda$14(MutableIntState mutableIntState, IntSize intSize) {
        mutableIntState.setIntValue((int) (intSize.m7786unboximpl() >> 32));
        return w01.a;
    }

    private static final float AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$16(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$18$lambda$17(boolean z, TextStyle textStyle, TextStyle textStyle2, State state) {
        return (!z || AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$16(state) >= 0.5f) ? textStyle2 : textStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$19(State<TextStyle> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$23$lambda$22(State state) {
        float floatValue = ((Number) state.getValue()).floatValue();
        if (floatValue < 0.0f) {
            return 0.0f;
        }
        return floatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$25$lambda$24(State state) {
        float AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$16 = AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$16(state);
        if (AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$16 < 0.0f) {
            return 0.0f;
        }
        return AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 AnimatedNavigationItem_DQd_Gtc$lambda$27(boolean z, iy iyVar, my myVar, Shape shape, float f, TextStyle textStyle, TextStyle textStyle2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, NavigationItemColors navigationItemColors, Modifier modifier, boolean z2, my myVar2, int i, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        m2206AnimatedNavigationItemDQd_Gtc(z, iyVar, myVar, shape, f, textStyle, textStyle2, f2, f3, f4, f5, f6, f7, f8, f9, navigationItemColors, modifier, z2, myVar2, i, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4));
        return w01.a;
    }

    /* renamed from: Indicator-3J-VO9M, reason: not valid java name */
    private static final void m2208Indicator3JVO9M(long j, Shape shape, iy iyVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-273382589);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar) ? 256 : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-273382589, i2, -1, "androidx.compose.material3.Indicator (NavigationItem.kt:1114)");
            }
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, IndicatorLayoutIdTag);
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new g7(5, iyVar);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            BoxKt.Box(BackgroundKt.m226backgroundbw27NRU(GraphicsLayerModifierKt.graphicsLayer(layoutId, (ky) rememberedValue), j, shape), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q50(j, shape, iyVar, i, 1));
        }
    }

    private static final void IndicatorRipple(InteractionSource interactionSource, Shape shape, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-629069867);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(interactionSource) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-629069867, i2, -1, "androidx.compose.material3.IndicatorRipple (NavigationItem.kt:1101)");
            }
            BoxKt.Box(IndicationKt.indication(ClipKt.clip(LayoutIdKt.layoutId(Modifier.Companion, IndicatorRippleLayoutIdTag), shape), interactionSource, RippleKt.m2297rippleH2RKhps$default(false, 0.0f, 0L, 7, null)), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(interactionSource, shape, i, 25));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IndicatorRipple$lambda$42(InteractionSource interactionSource, Shape shape, int i, Composer composer, int i2) {
        IndicatorRipple(interactionSource, shape, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Indicator_3J_VO9M$lambda$44$lambda$43(iy iyVar, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(((Number) iyVar.invoke()).floatValue());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Indicator_3J_VO9M$lambda$45(long j, Shape shape, iy iyVar, int i, Composer composer, int i2) {
        m2208Indicator3JVO9M(j, shape, iyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* renamed from: NavigationItem-8Df7sds, reason: not valid java name */
    public static final void m2209NavigationItem8Df7sds(boolean z, final iy iyVar, final my myVar, final TextStyle textStyle, final Shape shape, final float f, final float f2, final float f3, final float f4, final float f5, final float f6, final NavigationItemColors navigationItemColors, final Modifier modifier, final boolean z2, final my myVar2, final int i, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        int i4;
        iy iyVar2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        int i6;
        int i7;
        ComposableLambda composableLambda;
        boolean z3;
        InteractionSource interactionSource;
        final boolean z4 = z;
        Composer startRestartGroup = composer.startRestartGroup(2075155418);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(z4) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            iyVar2 = iyVar;
            i4 |= startRestartGroup.changedInstance(iyVar2) ? 32 : 16;
        } else {
            iyVar2 = iyVar;
        }
        int i8 = i2 & 384;
        int i9 = Fields.SpotShadowColor;
        if (i8 == 0) {
            i4 |= startRestartGroup.changedInstance(myVar) ? 256 : 128;
        }
        int i10 = i2 & 3072;
        int i11 = Fields.RotationZ;
        if (i10 == 0) {
            i4 |= startRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= startRestartGroup.changed(f) ? 131072 : 65536;
        }
        int i12 = i2 & 1572864;
        int i13 = Fields.BlendMode;
        if (i12 == 0) {
            i4 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= startRestartGroup.changed(f3) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= startRestartGroup.changed(f4) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= startRestartGroup.changed(f5) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (startRestartGroup.changed(f6) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(navigationItemColors) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i9 = 256;
            }
            i5 |= i9;
        }
        if ((i3 & 3072) == 0) {
            if (startRestartGroup.changed(z2)) {
                i11 = 2048;
            }
            i5 |= i11;
        }
        if ((i3 & 24576) == 0) {
            i5 |= startRestartGroup.changedInstance(myVar2) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= startRestartGroup.changed(i) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            if (startRestartGroup.changed(mutableInteractionSource)) {
                i13 = 1048576;
            }
            i5 |= i13;
        }
        int i14 = i5;
        if (startRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (599187 & i14) == 599186) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2075155418, i4, i14, "androidx.compose.material3.NavigationItem (NavigationItem.kt:245)");
            }
            final long m2195iconColorWaAFU9c = navigationItemColors.m2195iconColorWaAFU9c(z4, z2);
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1119868672, true, new my() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$styledIcon$1
                public final void invoke(Composer composer3, int i15) {
                    if (!composer3.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1119868672, i15, -1, "androidx.compose.material3.NavigationItem.<anonymous> (NavigationItem.kt:248)");
                    }
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(m2195iconColorWaAFU9c)), myVar, composer3, ProvidedValue.$stable);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return w01.a;
                }
            }, startRestartGroup, 54);
            if (myVar2 == null) {
                startRestartGroup.startReplaceGroup(-803302356);
                startRestartGroup.endReplaceGroup();
                i6 = i14;
                i7 = i4;
                composableLambda = null;
            } else {
                startRestartGroup.startReplaceGroup(-803266737);
                i6 = i14;
                i7 = i4;
                ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1062206119, true, new my() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$styledLabel$1
                    public final void invoke(Composer composer3, int i15) {
                        if (!composer3.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1062206119, i15, -1, "androidx.compose.material3.NavigationItem.<anonymous> (NavigationItem.kt:254)");
                        }
                        NavigationItemKt.StyledLabel(z4, textStyle, navigationItemColors, z2, myVar2, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // defpackage.my
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return w01.a;
                    }
                }, startRestartGroup, 54);
                startRestartGroup.endReplaceGroup();
                composableLambda = rememberComposableLambda2;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableIntState mutableIntState = (MutableIntState) rememberedValue;
            z4 = z;
            mutableInteractionSource2 = mutableInteractionSource;
            Modifier m791defaultMinSizeVpY3zN4 = SizeKt.m791defaultMinSizeVpY3zN4(SelectableKt.m1018selectableO2vRcR0(modifier, z4, mutableInteractionSource2, null, z2, Role.m6821boximpl(Role.Companion.m6835getTabo7Vup1c()), iyVar2), ((Dp) startRestartGroup.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m7625unboximpl(), ((Dp) startRestartGroup.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m7625unboximpl());
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                z3 = true;
                rememberedValue2 = new ub0(mutableIntState, 1 == true ? 1 : 0);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            } else {
                z3 = true;
            }
            Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m791defaultMinSizeVpY3zN4, (ky) rememberedValue2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), z3);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, onSizeChanged);
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
            my b = k4.b(companion2, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            State<Float> animateIndicatorProgressAsState = animateIndicatorProgressAsState(z4, startRestartGroup, i7 & 14);
            if (NavigationItemIconPosition.m2200equalsimpl0(i, NavigationItemIconPosition.Companion.m2205getTopxw1Ddg())) {
                startRestartGroup.startReplaceGroup(484755993);
                Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(density.mo367toPx0680j_4(IndicatorVerticalOffset)) & 4294967295L) | (Float.floatToRawIntBits((mutableIntState.getIntValue() - density.mo361roundToPx0680j_4(f)) / 2.0f) << 32));
                boolean changed = ((i6 & 3670016) == 1048576) | startRestartGroup.changed(m4508constructorimpl);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new MappedInteractionSource(mutableInteractionSource2, m4508constructorimpl, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                interactionSource = (MappedInteractionSource) rememberedValue3;
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(485471938);
                startRestartGroup.endReplaceGroup();
                interactionSource = null;
            }
            if (interactionSource == null) {
                interactionSource = mutableInteractionSource2;
            }
            long m2191getSelectedIndicatorColor0d7_KjU = navigationItemColors.m2191getSelectedIndicatorColor0d7_KjU();
            boolean changed2 = startRestartGroup.changed(animateIndicatorProgressAsState);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new t6(animateIndicatorProgressAsState, 12);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            int i15 = i7 << 3;
            int i16 = ((i7 >> 6) & 896) | 3072 | ((i6 >> 3) & 57344) | (29360128 & i15) | (234881024 & i15) | (i15 & 1879048192);
            int i17 = ((i7 >> 27) & 14) | ((i6 << 3) & 112);
            composer2 = startRestartGroup;
            m2210NavigationItemLayoutKmRXDg(interactionSource, m2191getSelectedIndicatorColor0d7_KjU, shape, rememberComposableLambda, i, composableLambda, (iy) rememberedValue4, f2, f3, f4, f5, f6, composer2, i16, i17);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
            endRestartGroup.updateScope(new my() { // from class: hc0
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 NavigationItem_8Df7sds$lambda$10;
                    int intValue = ((Integer) obj2).intValue();
                    NavigationItem_8Df7sds$lambda$10 = NavigationItemKt.NavigationItem_8Df7sds$lambda$10(z4, iyVar, myVar, textStyle, shape, f, f2, f3, f4, f5, f6, navigationItemColors, modifier, z2, myVar2, i, mutableInteractionSource3, i2, i3, (Composer) obj, intValue);
                    return NavigationItem_8Df7sds$lambda$10;
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ac, code lost:
    
        if (defpackage.q10.b(r2.rememberedValue(), java.lang.Integer.valueOf(r7)) == false) goto L126;
     */
    /* renamed from: NavigationItemLayout-KmRX-Dg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m2210NavigationItemLayoutKmRXDg(final InteractionSource interactionSource, final long j, final Shape shape, final my myVar, final int i, final my myVar2, final iy iyVar, final float f, final float f2, final float f3, final float f4, final float f5, Composer composer, final int i2, final int i3) {
        int i4;
        iy iyVar2;
        int i5;
        MeasurePolicy topIconOrIconOnlyMeasurePolicy;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1473868071);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(interactionSource) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(shape) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(myVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changed(i) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= startRestartGroup.changedInstance(myVar2) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i2) == 0) {
            iyVar2 = iyVar;
            i4 |= startRestartGroup.changedInstance(iyVar2) ? 1048576 : Fields.BlendMode;
        } else {
            iyVar2 = iyVar;
        }
        if ((12582912 & i2) == 0) {
            i4 |= startRestartGroup.changed(f) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= startRestartGroup.changed(f3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (startRestartGroup.changed(f4) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(f5) ? 32 : 16;
        }
        int i7 = i5;
        if (startRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i7 & 19) == 18) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1473868071, i4, i7, "androidx.compose.material3.NavigationItemLayout (NavigationItem.kt:453)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier badgeBounds = BadgeKt.badgeBounds(companion);
            if (myVar2 == null || NavigationItemIconPosition.m2200equalsimpl0(i, NavigationItemIconPosition.Companion.m2205getTopxw1Ddg())) {
                topIconOrIconOnlyMeasurePolicy = new TopIconOrIconOnlyMeasurePolicy(myVar2 != null, iyVar, f, f2, f3, f5, null);
            } else {
                topIconOrIconOnlyMeasurePolicy = new StartIconMeasurePolicy(iyVar2, f, f2, f4, null);
            }
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, badgeBounds);
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
            my b = k4.b(companion2, m3878constructorimpl, topIconOrIconOnlyMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting()) {
                i6 = i4;
            } else {
                i6 = i4;
            }
            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
            int i8 = i6 >> 3;
            IndicatorRipple(interactionSource, shape, startRestartGroup, (i6 & 14) | (i8 & 112));
            m2208Indicator3JVO9M(j, shape, iyVar, startRestartGroup, (i8 & 126) | ((i6 >> 12) & 896));
            Modifier layoutId = LayoutIdKt.layoutId(companion, IconLayoutIdTag);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
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
            myVar.invoke(startRestartGroup, Integer.valueOf((i6 >> 9) & 14));
            startRestartGroup.endNode();
            if (myVar2 != null) {
                startRestartGroup.startReplaceGroup(-2087200706);
                Modifier layoutId2 = LayoutIdKt.layoutId(companion, LabelLayoutIdTag);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId2);
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
                kf0.f(myVar2, startRestartGroup, (i6 >> 15) & 14);
            } else {
                startRestartGroup.startReplaceGroup(-2087119982);
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
            endRestartGroup.updateScope(new my() { // from class: kc0
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 NavigationItemLayout_KmRX_Dg$lambda$31;
                    int intValue = ((Integer) obj2).intValue();
                    NavigationItemLayout_KmRX_Dg$lambda$31 = NavigationItemKt.NavigationItemLayout_KmRX_Dg$lambda$31(InteractionSource.this, j, shape, myVar, i, myVar2, iyVar, f, f2, f3, f4, f5, i2, i3, (Composer) obj, intValue);
                    return NavigationItemLayout_KmRX_Dg$lambda$31;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 NavigationItemLayout_KmRX_Dg$lambda$31(InteractionSource interactionSource, long j, Shape shape, my myVar, int i, my myVar2, iy iyVar, float f, float f2, float f3, float f4, float f5, int i2, int i3, Composer composer, int i4) {
        m2210NavigationItemLayoutKmRXDg(interactionSource, j, shape, myVar, i, myVar2, iyVar, f, f2, f3, f4, f5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 NavigationItem_8Df7sds$lambda$10(boolean z, iy iyVar, my myVar, TextStyle textStyle, Shape shape, float f, float f2, float f3, float f4, float f5, float f6, NavigationItemColors navigationItemColors, Modifier modifier, boolean z2, my myVar2, int i, MutableInteractionSource mutableInteractionSource, int i2, int i3, Composer composer, int i4) {
        m2209NavigationItem8Df7sds(z, iyVar, myVar, textStyle, shape, f, f2, f3, f4, f5, f6, navigationItemColors, modifier, z2, myVar2, i, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 NavigationItem_8Df7sds$lambda$4$lambda$3(MutableIntState mutableIntState, IntSize intSize) {
        mutableIntState.setIntValue((int) (intSize.m7786unboximpl() >> 32));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float NavigationItem_8Df7sds$lambda$9$lambda$8$lambda$7(State state) {
        float floatValue = ((Number) state.getValue()).floatValue();
        if (floatValue < 0.0f) {
            return 0.0f;
        }
        return floatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void StyledLabel(final boolean z, TextStyle textStyle, final NavigationItemColors navigationItemColors, final boolean z2, my myVar, Composer composer, final int i) {
        int i2;
        TextStyle textStyle2;
        final my myVar2;
        Composer startRestartGroup = composer.startRestartGroup(-2136267443);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(navigationItemColors) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.Clip : 8192;
        }
        if (startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2136267443, i2, -1, "androidx.compose.material3.StyledLabel (NavigationItem.kt:1083)");
            }
            textStyle2 = textStyle;
            ProvideContentColorTextStyleKt.m2902ProvideContentColorTextStyle3JVO9M(navigationItemColors.m2196textColorWaAFU9c(z, z2), textStyle2, myVar, startRestartGroup, (i2 & 112) | ((i2 >> 6) & 896));
            myVar2 = myVar;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            textStyle2 = textStyle;
            myVar2 = myVar;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final TextStyle textStyle3 = textStyle2;
            endRestartGroup.updateScope(new my() { // from class: gc0
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 StyledLabel$lambda$41;
                    int intValue = ((Integer) obj2).intValue();
                    StyledLabel$lambda$41 = NavigationItemKt.StyledLabel$lambda$41(z, textStyle3, navigationItemColors, z2, myVar2, i, (Composer) obj, intValue);
                    return StyledLabel$lambda$41;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 StyledLabel$lambda$41(boolean z, TextStyle textStyle, NavigationItemColors navigationItemColors, boolean z2, my myVar, int i, Composer composer, int i2) {
        StyledLabel(z, textStyle, navigationItemColors, z2, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    private static final State<Float> animateIndicatorProgressAsState(boolean z, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1105658511, i, -1, "androidx.compose.material3.animateIndicatorProgressAsState (NavigationItem.kt:1094)");
        }
        State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composer, 6), 0.0f, null, null, composer, 0, 28);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateFloatAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeAnimatedLabelAndIcon-2QYhCQ8, reason: not valid java name */
    public static final MeasureResult m2215placeAnimatedLabelAndIcon2QYhCQ8(MeasureScope measureScope, int i, iy iyVar, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, int i2, long j, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        final float floatValue = ((Number) iyVar.invoke()).floatValue();
        boolean m2200equalsimpl0 = NavigationItemIconPosition.m2200equalsimpl0(i, NavigationItemIconPosition.Companion.m2205getTopxw1Ddg());
        float f8 = f7 * 2.0f;
        float m7581constrainWidthK40F9xA = ((ConstraintsKt.m7581constrainWidthK40F9xA(j, measureScope.mo361roundToPx0680j_4(f7) + placeable3.getWidth()) - r8) * floatValue) + ConstraintsKt.m7581constrainWidthK40F9xA(j, Math.max(placeable.getWidth(), measureScope.mo361roundToPx0680j_4(Dp.m7611constructorimpl(f8)) + i2));
        int lerp = MathHelpersKt.lerp(ConstraintsKt.m7580constrainHeightK40F9xA(j, y80.P(measureScope.mo367toPx0680j_4(f) + placeable3.getHeight() + placeable.getHeight())), ConstraintsKt.m7580constrainHeightK40F9xA(j, placeable3.getHeight()), floatValue);
        final int mo361roundToPx0680j_4 = measureScope.mo361roundToPx0680j_4(f7);
        int lerp2 = (floatValue == 0.0f || floatValue == 1.0f) ? MathHelpersKt.lerp(y80.P((m7581constrainWidthK40F9xA - placeable4.getWidth()) / 2.0f), y80.P(((mo361roundToPx0680j_4 + m7581constrainWidthK40F9xA) - placeable4.getWidth()) / 2.0f), floatValue) : measureScope.mo361roundToPx0680j_4(f7);
        int mo361roundToPx0680j_42 = measureScope.mo361roundToPx0680j_4(f3) + mo361roundToPx0680j_4;
        int mo361roundToPx0680j_43 = measureScope.mo361roundToPx0680j_4(f4) + mo361roundToPx0680j_4;
        int mo361roundToPx0680j_44 = measureScope.mo361roundToPx0680j_4(f2);
        int mo361roundToPx0680j_45 = measureScope.mo361roundToPx0680j_4(f5);
        final int lerp3 = MathHelpersKt.lerp(mo361roundToPx0680j_42, mo361roundToPx0680j_43, floatValue);
        final int lerp4 = MathHelpersKt.lerp(mo361roundToPx0680j_44, mo361roundToPx0680j_45, floatValue);
        int p = j50.p(measureScope.mo361roundToPx0680j_4(Dp.m7611constructorimpl(Dp.m7611constructorimpl(f8) + Dp.m7611constructorimpl(f3 * 2.0f))) + placeable2.getWidth(), 2, placeable);
        int mo361roundToPx0680j_46 = measureScope.mo361roundToPx0680j_4(Dp.m7611constructorimpl(f + f)) + placeable2.getHeight() + lerp4;
        float mo361roundToPx0680j_47 = (measureScope.mo361roundToPx0680j_4(f6) + (placeable2.getWidth() + lerp3)) - ((!m2200equalsimpl0 || floatValue <= 0.0f) ? (1.0f - floatValue) * measureScope.mo361roundToPx0680j_4(f7) : 0.0f);
        int c = j50.c(lerp, 2, placeable);
        Number valueOf = floatValue < 0.5f ? Integer.valueOf(p) : Float.valueOf(mo361roundToPx0680j_47 * floatValue);
        if (floatValue >= 0.5f) {
            mo361roundToPx0680j_46 = c;
        }
        int P = y80.P(m7581constrainWidthK40F9xA);
        final int i3 = mo361roundToPx0680j_46;
        final int i4 = lerp2;
        final Number number = valueOf;
        return MeasureScope.layout$default(measureScope, P, lerp, null, new ky() { // from class: lc0
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 placeAnimatedLabelAndIcon_2QYhCQ8$lambda$40;
                placeAnimatedLabelAndIcon_2QYhCQ8$lambda$40 = NavigationItemKt.placeAnimatedLabelAndIcon_2QYhCQ8$lambda$40(Placeable.this, i4, placeable2, lerp3, lerp4, placeable, number, i3, placeable3, mo361roundToPx0680j_4, floatValue, (Placeable.PlacementScope) obj);
                return placeAnimatedLabelAndIcon_2QYhCQ8$lambda$40;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 placeAnimatedLabelAndIcon_2QYhCQ8$lambda$40(Placeable placeable, int i, Placeable placeable2, int i2, int i3, Placeable placeable3, Object obj, int i4, Placeable placeable4, int i5, float f, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable, i, 0, 0.0f, (ky) null, 12, (Object) null);
        Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable2, i2, i3, 0.0f, (ky) null, 12, (Object) null);
        Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable3, ((Number) obj).intValue(), i4, 0.0f, new jc0(f, 0), 4, (Object) null);
        Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable4, i5, 0, 0.0f, (ky) null, 12, (Object) null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 placeAnimatedLabelAndIcon_2QYhCQ8$lambda$40$lambda$39(float f, GraphicsLayerScope graphicsLayerScope) {
        float f2 = f - 0.5f;
        graphicsLayerScope.setAlpha(4.0f * f2 * f2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m2216placeIconX9ElhV4(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, long j) {
        int m7581constrainWidthK40F9xA = ConstraintsKt.m7581constrainWidthK40F9xA(j, placeable2.getWidth());
        int m7580constrainHeightK40F9xA = ConstraintsKt.m7580constrainHeightK40F9xA(j, placeable2.getHeight());
        return MeasureScope.layout$default(measureScope, m7581constrainWidthK40F9xA, m7580constrainHeightK40F9xA, null, new wb0(placeable3, j50.p(m7581constrainWidthK40F9xA, 2, placeable3), j50.c(m7580constrainHeightK40F9xA, 2, placeable3), placeable, j50.p(m7581constrainWidthK40F9xA, 2, placeable), j50.c(m7580constrainHeightK40F9xA, 2, placeable), placeable2, j50.p(m7581constrainWidthK40F9xA, 2, placeable2), j50.c(m7580constrainHeightK40F9xA, 2, placeable2)), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 placeIcon_X9ElhV4$lambda$36(Placeable placeable, int i, int i2, Placeable placeable2, int i3, int i4, Placeable placeable3, int i5, int i6, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i, i2, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i3, i4, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i5, i6, 0.0f, 4, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndStartIcon-nru01g4, reason: not valid java name */
    public static final MeasureResult m2217placeLabelAndStartIconnru01g4(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j, float f) {
        int m7581constrainWidthK40F9xA = ConstraintsKt.m7581constrainWidthK40F9xA(j, placeable3.getWidth());
        int m7580constrainHeightK40F9xA = ConstraintsKt.m7580constrainHeightK40F9xA(j, placeable3.getHeight());
        int p = j50.p(m7581constrainWidthK40F9xA, 2, placeable4);
        int c = j50.c(m7580constrainHeightK40F9xA, 2, placeable4);
        int c2 = j50.c(m7580constrainHeightK40F9xA, 2, placeable2);
        int c3 = j50.c(m7580constrainHeightK40F9xA, 2, placeable);
        int width = (m7581constrainWidthK40F9xA - (placeable.getWidth() + (measureScope.mo361roundToPx0680j_4(f) + placeable2.getWidth()))) / 2;
        return MeasureScope.layout$default(measureScope, m7581constrainWidthK40F9xA, m7580constrainHeightK40F9xA, null, new ec0(placeable4, p, c, placeable, measureScope.mo361roundToPx0680j_4(f) + placeable2.getWidth() + width, c3, placeable2, width, c2, placeable3, j50.p(m7581constrainWidthK40F9xA, 2, placeable3), j50.c(m7580constrainHeightK40F9xA, 2, placeable3), 1), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 placeLabelAndStartIcon_nru01g4$lambda$38(Placeable placeable, int i, int i2, Placeable placeable2, int i3, int i4, Placeable placeable3, int i5, int i6, Placeable placeable4, int i7, int i8, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i, i2, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i3, i4, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i5, i6, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i7, i8, 0.0f, 4, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndTopIcon-qoqLrGI, reason: not valid java name */
    public static final MeasureResult m2218placeLabelAndTopIconqoqLrGI(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j, float f, float f2, float f3) {
        int m7581constrainWidthK40F9xA = ConstraintsKt.m7581constrainWidthK40F9xA(j, Math.max(placeable.getWidth(), placeable3.getWidth()));
        int m7580constrainHeightK40F9xA = ConstraintsKt.m7580constrainHeightK40F9xA(j, y80.P((measureScope.mo367toPx0680j_4(f3) * 2.0f) + measureScope.mo367toPx0680j_4(f) + placeable3.getHeight() + placeable.getHeight()));
        int mo361roundToPx0680j_4 = measureScope.mo361roundToPx0680j_4(Dp.m7611constructorimpl(f3 + f2));
        int p = j50.p(m7581constrainWidthK40F9xA, 2, placeable2);
        int p2 = j50.p(m7581constrainWidthK40F9xA, 2, placeable4);
        int mo361roundToPx0680j_42 = mo361roundToPx0680j_4 - measureScope.mo361roundToPx0680j_4(f2);
        return MeasureScope.layout$default(measureScope, m7581constrainWidthK40F9xA, m7580constrainHeightK40F9xA, null, new ec0(placeable4, p2, mo361roundToPx0680j_42, placeable, j50.p(m7581constrainWidthK40F9xA, 2, placeable), measureScope.mo361roundToPx0680j_4(Dp.m7611constructorimpl(f + f2)) + placeable2.getHeight() + mo361roundToPx0680j_4, placeable2, p, mo361roundToPx0680j_4, placeable3, j50.p(m7581constrainWidthK40F9xA, 2, placeable3), mo361roundToPx0680j_42, 0), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 placeLabelAndTopIcon_qoqLrGI$lambda$37(Placeable placeable, int i, int i2, Placeable placeable2, int i3, int i4, Placeable placeable3, int i5, int i6, Placeable placeable4, int i7, int i8, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i, i2, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i3, i4, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i5, i6, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i7, i8, 0.0f, 4, null);
        return w01.a;
    }
}
