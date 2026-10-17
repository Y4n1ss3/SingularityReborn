package androidx.compose.material3;

import androidx.compose.animation.core.SnapSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import defpackage.d00;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwitchKt {
    private static final SnapSpec<Float> SnapSpec;
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDiameter;
    private static final float ThumbPadding;
    private static final float UncheckedThumbDiameter;

    static {
        SwitchTokens switchTokens = SwitchTokens.INSTANCE;
        float m3691getSelectedHandleWidthD9Ej5fM = switchTokens.m3691getSelectedHandleWidthD9Ej5fM();
        ThumbDiameter = m3691getSelectedHandleWidthD9Ej5fM;
        UncheckedThumbDiameter = switchTokens.m3698getUnselectedHandleWidthD9Ej5fM();
        SwitchWidth = switchTokens.m3696getTrackWidthD9Ej5fM();
        float m3694getTrackHeightD9Ej5fM = switchTokens.m3694getTrackHeightD9Ej5fM();
        SwitchHeight = m3694getTrackHeightD9Ej5fM;
        ThumbPadding = Dp.m7611constructorimpl(Dp.m7611constructorimpl(m3694getTrackHeightD9Ej5fM - m3691getSelectedHandleWidthD9Ej5fM) / 2.0f);
        SnapSpec = new SnapSpec<>(0, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Switch(boolean z, ky kyVar, Modifier modifier, my myVar, boolean z2, SwitchColors switchColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        boolean z3;
        int i3;
        Modifier modifier2;
        int i4;
        my myVar2;
        int i5;
        boolean z4;
        SwitchColors switchColors2;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        Modifier modifier3;
        my myVar3;
        boolean z5;
        SwitchColors switchColors3;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        boolean z6;
        SwitchColors switchColors4;
        MutableInteractionSource mutableInteractionSource4;
        my myVar4;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource5;
        boolean z7;
        boolean z8;
        Modifier modifier5;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-263339167);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else if ((i & 6) == 0) {
            z3 = z;
            i3 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                myVar2 = myVar;
                i3 |= startRestartGroup.changedInstance(myVar2) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    z4 = z2;
                    i3 |= startRestartGroup.changed(z4) ? Fields.Clip : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            switchColors2 = switchColors;
                            if (startRestartGroup.changed(switchColors2)) {
                                i8 = Fields.RenderEffect;
                                i3 |= i8;
                            }
                        } else {
                            switchColors2 = switchColors;
                        }
                        i8 = 65536;
                        i3 |= i8;
                    } else {
                        switchColors2 = switchColors;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : Fields.BlendMode;
                        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier6 = i9 != 0 ? Modifier.Companion : modifier2;
                                if (i4 != 0) {
                                    myVar2 = null;
                                }
                                if (i5 != 0) {
                                    z4 = true;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    switchColors2 = SwitchDefaults.INSTANCE.colors(startRestartGroup, 6);
                                }
                                if (i6 != 0) {
                                    i7 = i3;
                                    z6 = z4;
                                    switchColors4 = switchColors2;
                                    mutableInteractionSource4 = null;
                                } else {
                                    i7 = i3;
                                    z6 = z4;
                                    switchColors4 = switchColors2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                }
                                myVar4 = myVar2;
                                modifier4 = modifier6;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                i7 = i3;
                                z6 = z4;
                                switchColors4 = switchColors2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                myVar4 = myVar2;
                                modifier4 = modifier2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-263339167, i7, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                            }
                            if (mutableInteractionSource4 == null) {
                                startRestartGroup.startReplaceGroup(1768604058);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceGroup();
                                mutableInteractionSource5 = (MutableInteractionSource) rememberedValue;
                            } else {
                                startRestartGroup.startReplaceGroup(334145757);
                                startRestartGroup.endReplaceGroup();
                                mutableInteractionSource5 = mutableInteractionSource4;
                            }
                            if (kyVar != null) {
                                z7 = z6;
                                z8 = false;
                                modifier5 = ToggleableKt.m1025toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion), z3, mutableInteractionSource5, null, z7, Role.m6821boximpl(Role.Companion.m6834getSwitcho7Vup1c()), kyVar);
                            } else {
                                z7 = z6;
                                z8 = false;
                                modifier5 = Modifier.Companion;
                            }
                            int i10 = i7 << 3;
                            int i11 = i7 >> 6;
                            composer2 = startRestartGroup;
                            Modifier modifier7 = modifier4;
                            SwitchImpl(SizeKt.m801requiredSizeVpY3zN4(SizeKt.wrapContentSize$default(modifier4.then(modifier5), Alignment.Companion.getCenter(), z8, 2, null), SwitchWidth, SwitchHeight), z, z7, switchColors4, myVar4, mutableInteractionSource5, ShapesKt.getValue(SwitchTokens.INSTANCE.getHandleShape(), startRestartGroup, 6), composer2, (i10 & 112) | (i11 & 896) | (i11 & 7168) | (i10 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier7;
                            z5 = z7;
                            switchColors3 = switchColors4;
                            myVar3 = myVar4;
                            mutableInteractionSource3 = mutableInteractionSource4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            myVar3 = myVar2;
                            z5 = z4;
                            switchColors3 = switchColors2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new d00(z, kyVar, modifier3, myVar3, z5, switchColors3, mutableInteractionSource3, i, i2));
                            return;
                        }
                        return;
                    }
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z4 = z2;
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            myVar2 = myVar;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z4 = z2;
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        myVar2 = myVar;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z4 = z2;
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Switch$lambda$1(boolean z, ky kyVar, Modifier modifier, my myVar, boolean z2, SwitchColors switchColors, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        Switch(z, kyVar, modifier, myVar, z2, switchColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0122, code lost:
    
        if (defpackage.q10.b(r1.rememberedValue(), java.lang.Integer.valueOf(r12)) == false) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SwitchImpl(final Modifier modifier, final boolean z, final boolean z2, final SwitchColors switchColors, final my myVar, final InteractionSource interactionSource, Shape shape, Composer composer, final int i) {
        int i2;
        Alignment.Companion companion;
        final Shape shape2 = shape;
        Composer startRestartGroup = composer.startRestartGroup(-670917213);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(switchColors) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(interactionSource) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(shape2) ? 1048576 : Fields.BlendMode;
        }
        if (startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-670917213, i2, -1, "androidx.compose.material3.SwitchImpl (Switch.kt:143)");
            }
            long m2493trackColorWaAFU9c$material3 = switchColors.m2493trackColorWaAFU9c$material3(z2, z);
            long m2492thumbColorWaAFU9c$material3 = switchColors.m2492thumbColorWaAFU9c$material3(z2, z);
            SwitchTokens switchTokens = SwitchTokens.INSTANCE;
            Shape value = ShapesKt.getValue(switchTokens.getTrackShape(), startRestartGroup, 6);
            Modifier m226backgroundbw27NRU = BackgroundKt.m226backgroundbw27NRU(BorderKt.m238borderxT4_qwU(modifier, switchTokens.m3695getTrackOutlineWidthD9Ej5fM(), switchColors.m2473borderColorWaAFU9c$material3(z2, z), value), m2493trackColorWaAFU9c$material3, value);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m226backgroundbw27NRU);
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
                companion = companion2;
            } else {
                companion = companion2;
            }
            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
            shape2 = shape;
            Modifier m226backgroundbw27NRU2 = BackgroundKt.m226backgroundbw27NRU(IndicationKt.indication(BoxScopeInstance.INSTANCE.align(Modifier.Companion, companion.getCenterStart()).then(new ThumbElement(interactionSource, z, MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6))), interactionSource, RippleKt.m2297rippleH2RKhps$default(false, Dp.m7611constructorimpl(switchTokens.m3693getStateLayerSizeD9Ej5fM() / 2.0f), 0L, 4, null)), m2492thumbColorWaAFU9c$material3, shape2);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m226backgroundbw27NRU2);
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
            my b2 = k4.b(companion3, m3878constructorimpl2, maybeCachedBoxMeasurePolicy2, m3878constructorimpl2, currentCompositionLocalMap2);
            if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
            }
            Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion3.getSetModifier());
            if (myVar != null) {
                startRestartGroup.startReplaceGroup(1235836927);
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(switchColors.m2491iconColorWaAFU9c$material3(z2, z))), myVar, startRestartGroup, ProvidedValue.$stable | ((i2 >> 9) & 112));
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1236071411);
                startRestartGroup.endReplaceGroup();
            }
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
            endRestartGroup.updateScope(new my() { // from class: xs0
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 SwitchImpl$lambda$4;
                    int intValue = ((Integer) obj2).intValue();
                    SwitchImpl$lambda$4 = SwitchKt.SwitchImpl$lambda$4(Modifier.this, z, z2, switchColors, myVar, interactionSource, shape2, i, (Composer) obj, intValue);
                    return SwitchImpl$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SwitchImpl$lambda$4(Modifier modifier, boolean z, boolean z2, SwitchColors switchColors, my myVar, InteractionSource interactionSource, Shape shape, int i, Composer composer, int i2) {
        SwitchImpl(modifier, z, z2, switchColors, myVar, interactionSource, shape, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getUncheckedThumbDiameter() {
        return UncheckedThumbDiameter;
    }
}
