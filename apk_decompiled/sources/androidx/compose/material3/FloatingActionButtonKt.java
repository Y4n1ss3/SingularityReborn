package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.ExtendedFabLargeTokens;
import androidx.compose.material3.tokens.ExtendedFabMediumTokens;
import androidx.compose.material3.tokens.ExtendedFabPrimaryTokens;
import androidx.compose.material3.tokens.ExtendedFabSmallTokens;
import androidx.compose.material3.tokens.FabBaselineTokens;
import androidx.compose.material3.tokens.FabLargeTokens;
import androidx.compose.material3.tokens.FabSmallTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import defpackage.fc;
import defpackage.fw;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.qo;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FloatingActionButtonKt {
    private static final float ExtendedFabEndIconPadding;
    private static final float ExtendedFabMinimumWidth;
    private static final float ExtendedFabStartIconPadding;
    private static final float ExtendedFabTextPadding;
    private static final float LargeExtendedFabIconPadding;
    private static final float LargeExtendedFabMinimumHeight;
    private static final float LargeExtendedFabMinimumWidth;
    private static final float LargeExtendedFabPaddingEnd;
    private static final float LargeExtendedFabPaddingStart;
    private static final TypographyKeyTokens LargeExtendedFabTextStyle;
    private static final float MediumExtendedFabIconPadding;
    private static final float MediumExtendedFabMinimumHeight;
    private static final float MediumExtendedFabMinimumWidth;
    private static final float MediumExtendedFabPaddingEnd;
    private static final float MediumExtendedFabPaddingStart;
    private static final TypographyKeyTokens MediumExtendedFabTextStyle;
    private static final float SmallExtendedFabIconPadding;
    private static final float SmallExtendedFabMinimumHeight;
    private static final float SmallExtendedFabMinimumWidth;
    private static final float SmallExtendedFabPaddingEnd;
    private static final float SmallExtendedFabPaddingStart;
    private static final TypographyKeyTokens SmallExtendedFabTextStyle;

    static {
        ExtendedFabSmallTokens extendedFabSmallTokens = ExtendedFabSmallTokens.INSTANCE;
        SmallExtendedFabMinimumWidth = extendedFabSmallTokens.m3280getContainerHeightD9Ej5fM();
        SmallExtendedFabMinimumHeight = extendedFabSmallTokens.m3280getContainerHeightD9Ej5fM();
        SmallExtendedFabPaddingStart = extendedFabSmallTokens.m3283getLeadingSpaceD9Ej5fM();
        SmallExtendedFabPaddingEnd = extendedFabSmallTokens.m3284getTrailingSpaceD9Ej5fM();
        SmallExtendedFabIconPadding = extendedFabSmallTokens.m3281getIconLabelSpaceD9Ej5fM();
        SmallExtendedFabTextStyle = TypographyKeyTokens.TitleMedium;
        ExtendedFabMediumTokens extendedFabMediumTokens = ExtendedFabMediumTokens.INSTANCE;
        MediumExtendedFabMinimumWidth = extendedFabMediumTokens.m3265getContainerHeightD9Ej5fM();
        MediumExtendedFabMinimumHeight = extendedFabMediumTokens.m3265getContainerHeightD9Ej5fM();
        MediumExtendedFabPaddingStart = extendedFabMediumTokens.m3268getLeadingSpaceD9Ej5fM();
        MediumExtendedFabPaddingEnd = extendedFabMediumTokens.m3269getTrailingSpaceD9Ej5fM();
        MediumExtendedFabIconPadding = Dp.m7611constructorimpl(12.0f);
        MediumExtendedFabTextStyle = TypographyKeyTokens.TitleLarge;
        ExtendedFabLargeTokens extendedFabLargeTokens = ExtendedFabLargeTokens.INSTANCE;
        LargeExtendedFabMinimumWidth = extendedFabLargeTokens.m3260getContainerHeightD9Ej5fM();
        LargeExtendedFabMinimumHeight = extendedFabLargeTokens.m3260getContainerHeightD9Ej5fM();
        LargeExtendedFabPaddingStart = extendedFabLargeTokens.m3263getLeadingSpaceD9Ej5fM();
        LargeExtendedFabPaddingEnd = extendedFabLargeTokens.m3264getTrailingSpaceD9Ej5fM();
        LargeExtendedFabIconPadding = Dp.m7611constructorimpl(16.0f);
        LargeExtendedFabTextStyle = TypographyKeyTokens.HeadlineSmall;
        ExtendedFabStartIconPadding = Dp.m7611constructorimpl(16.0f);
        ExtendedFabEndIconPadding = Dp.m7611constructorimpl(12.0f);
        ExtendedFabTextPadding = Dp.m7611constructorimpl(20.0f);
        ExtendedFabMinimumWidth = Dp.m7611constructorimpl(80.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: ExtendedFloatingActionButton-ElI5-7k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2006ExtendedFloatingActionButtonElI57k(final my myVar, final my myVar2, final iy iyVar, Modifier modifier, boolean z, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        iy iyVar2;
        Modifier modifier2;
        int i4;
        final boolean z2;
        Shape shape2;
        long j3;
        int i5;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i6;
        int i7;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        final long j4;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        final long j5;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        long j6;
        MutableInteractionSource mutableInteractionSource3;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-1161000600);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(iyVar2) ? Fields.RotationX : Fields.SpotShadowColor;
            }
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.Clip : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i10 = Fields.RenderEffect;
                            i3 |= i10;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i10 = 65536;
                    i3 |= i10;
                } else {
                    shape2 = shape;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i9 = 1048576;
                            i3 |= i9;
                        }
                    } else {
                        j3 = j;
                    }
                    i9 = Fields.BlendMode;
                    i3 |= i9;
                } else {
                    j3 = j;
                }
                if ((i & 12582912) == 0) {
                    i5 = 12582912;
                    i3 |= ((i2 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(j2)) ? GroupFlagsKt.IsNodeFlag : 4194304;
                } else {
                    i5 = 12582912;
                }
                if ((i & 100663296) == 0) {
                    if ((i2 & Fields.RotationX) == 0) {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                        if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                            i8 = GroupFlagsKt.IsRecompositionRequiredFlag;
                            i3 |= i8;
                        }
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    i8 = GroupFlagsKt.HasAuxSlotFlag;
                    i3 |= i8;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i6 = i2 & Fields.RotationY;
                if (i6 != 0) {
                    i3 |= 805306368;
                } else if ((805306368 & i) == 0) {
                    i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    i7 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i7 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        shape3 = shape2;
                        j4 = j3;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                        j5 = j2;
                        mutableInteractionSource2 = mutableInteractionSource;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = Modifier.Companion;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 32) != 0) {
                                shape2 = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(startRestartGroup, 6);
                                i7 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                j3 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                i7 &= -3670017;
                            }
                            if ((i2 & Fields.SpotShadowColor) != 0) {
                                j6 = ColorSchemeKt.m1797contentColorForek8zF_U(j3, startRestartGroup, (i7 >> 18) & 14);
                                i7 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i2 & Fields.RotationX) != 0) {
                                floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.m2000elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                                i7 &= -234881025;
                            }
                            if (i6 != 0) {
                                mutableInteractionSource3 = null;
                                long j7 = j3;
                                FloatingActionButtonElevation floatingActionButtonElevation4 = floatingActionButtonElevation2;
                                int i12 = i7;
                                Shape shape4 = shape2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1161000600, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:391)");
                                }
                                int i13 = i12 >> 6;
                                int i14 = i12 >> 9;
                                Modifier modifier4 = modifier2;
                                m2009FloatingActionButtonXz6DiA(iyVar2, modifier4, shape4, j7, j6, floatingActionButtonElevation4, mutableInteractionSource3, ComposableLambdaKt.rememberComposableLambda(632971498, true, new my() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$3
                                    public final void invoke(Composer composer2, int i15) {
                                        EnterTransition extendedFabExpandAnimation;
                                        ExitTransition extendedFabCollapseAnimation;
                                        if (!composer2.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(632971498, i15, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:401)");
                                        }
                                        Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(SizeKt.m811sizeInqDBjuR0$default(Modifier.Companion, z2 ? FloatingActionButtonKt.ExtendedFabMinimumWidth : FabBaselineTokens.INSTANCE.m3286getContainerWidthD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), z2 ? FloatingActionButtonKt.ExtendedFabStartIconPadding : Dp.m7611constructorimpl(0.0f), 0.0f, z2 ? FloatingActionButtonKt.ExtendedFabTextPadding : Dp.m7611constructorimpl(0.0f), 0.0f, 10, null);
                                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                                        Arrangement.Horizontal start = z2 ? Arrangement.INSTANCE.getStart() : Arrangement.INSTANCE.getCenter();
                                        my myVar3 = myVar2;
                                        boolean z4 = z2;
                                        my myVar4 = myVar;
                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 48);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m766paddingqDBjuR0$default);
                                        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                                        iy constructor = companion.getConstructor();
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
                                        my b = k4.b(companion, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                        }
                                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        myVar3.invoke(composer2, 0);
                                        extendedFabExpandAnimation = FloatingActionButtonKt.extendedFabExpandAnimation(composer2, 0);
                                        extendedFabCollapseAnimation = FloatingActionButtonKt.extendedFabCollapseAnimation(composer2, 0);
                                        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, z4, (Modifier) null, extendedFabExpandAnimation, extendedFabCollapseAnimation, (String) null, ComposableLambdaKt.rememberComposableLambda(-660008666, true, new FloatingActionButtonKt$ExtendedFloatingActionButton$3$1$1(myVar4), composer2, 54), composer2, 1572870, 18);
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
                                }, startRestartGroup, 54), startRestartGroup, (i13 & 112) | (i13 & 14) | i5 | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z3 = z2;
                                modifier3 = modifier4;
                                shape3 = shape4;
                                j4 = j7;
                                j5 = j6;
                                floatingActionButtonElevation3 = floatingActionButtonElevation4;
                                mutableInteractionSource2 = mutableInteractionSource3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i7 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i7 &= -3670017;
                            }
                            if ((i2 & Fields.SpotShadowColor) != 0) {
                                i7 &= -29360129;
                            }
                            if ((i2 & Fields.RotationX) != 0) {
                                i7 &= -234881025;
                            }
                            j6 = j2;
                        }
                        mutableInteractionSource3 = mutableInteractionSource;
                        long j72 = j3;
                        FloatingActionButtonElevation floatingActionButtonElevation42 = floatingActionButtonElevation2;
                        int i122 = i7;
                        Shape shape42 = shape2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i132 = i122 >> 6;
                        int i142 = i122 >> 9;
                        Modifier modifier42 = modifier2;
                        m2009FloatingActionButtonXz6DiA(iyVar2, modifier42, shape42, j72, j6, floatingActionButtonElevation42, mutableInteractionSource3, ComposableLambdaKt.rememberComposableLambda(632971498, true, new my() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$3
                            public final void invoke(Composer composer2, int i15) {
                                EnterTransition extendedFabExpandAnimation;
                                ExitTransition extendedFabCollapseAnimation;
                                if (!composer2.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(632971498, i15, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:401)");
                                }
                                Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(SizeKt.m811sizeInqDBjuR0$default(Modifier.Companion, z2 ? FloatingActionButtonKt.ExtendedFabMinimumWidth : FabBaselineTokens.INSTANCE.m3286getContainerWidthD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), z2 ? FloatingActionButtonKt.ExtendedFabStartIconPadding : Dp.m7611constructorimpl(0.0f), 0.0f, z2 ? FloatingActionButtonKt.ExtendedFabTextPadding : Dp.m7611constructorimpl(0.0f), 0.0f, 10, null);
                                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                                Arrangement.Horizontal start = z2 ? Arrangement.INSTANCE.getStart() : Arrangement.INSTANCE.getCenter();
                                my myVar3 = myVar2;
                                boolean z4 = z2;
                                my myVar4 = myVar;
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 48);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m766paddingqDBjuR0$default);
                                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                                iy constructor = companion.getConstructor();
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
                                my b = k4.b(companion, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                }
                                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                myVar3.invoke(composer2, 0);
                                extendedFabExpandAnimation = FloatingActionButtonKt.extendedFabExpandAnimation(composer2, 0);
                                extendedFabCollapseAnimation = FloatingActionButtonKt.extendedFabCollapseAnimation(composer2, 0);
                                AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, z4, (Modifier) null, extendedFabExpandAnimation, extendedFabCollapseAnimation, (String) null, ComposableLambdaKt.rememberComposableLambda(-660008666, true, new FloatingActionButtonKt$ExtendedFloatingActionButton$3$1$1(myVar4), composer2, 54), composer2, 1572870, 18);
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
                        }, startRestartGroup, 54), startRestartGroup, (i132 & 112) | (i132 & 14) | i5 | (i142 & 896) | (i142 & 7168) | (57344 & i142) | (458752 & i142) | (i142 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z3 = z2;
                        modifier3 = modifier42;
                        shape3 = shape42;
                        j4 = j72;
                        j5 = j6;
                        floatingActionButtonElevation3 = floatingActionButtonElevation42;
                        mutableInteractionSource2 = mutableInteractionSource3;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new my() { // from class: ew
                            @Override // defpackage.my
                            public final Object invoke(Object obj, Object obj2) {
                                w01 ExtendedFloatingActionButton_ElI5_7k$lambda$8;
                                int intValue = ((Integer) obj2).intValue();
                                ExtendedFloatingActionButton_ElI5_7k$lambda$8 = FloatingActionButtonKt.ExtendedFloatingActionButton_ElI5_7k$lambda$8(my.this, myVar2, iyVar, modifier3, z3, shape3, j4, j5, floatingActionButtonElevation3, mutableInteractionSource2, i, i2, (Composer) obj, intValue);
                                return ExtendedFloatingActionButton_ElI5_7k$lambda$8;
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i3;
                if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i7 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i6 = i2 & Fields.RotationY;
            if (i6 != 0) {
            }
            i7 = i3;
            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i7 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i6 = i2 & Fields.RotationY;
        if (i6 != 0) {
        }
        i7 = i3;
        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i7 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* renamed from: ExtendedFloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2007ExtendedFloatingActionButtonXz6DiA(iy iyVar, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, final ny nyVar, Composer composer, int i, int i2) {
        iy iyVar2;
        int i3;
        Shape shape2;
        long j3;
        long j4;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i4;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape3;
        Composer composer2;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        long j5;
        long j6;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        long j7;
        boolean z;
        Shape shape4;
        long j8;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource3;
        FloatingActionButtonElevation floatingActionButtonElevation4;
        int i5;
        long j9;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1039585610);
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
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i8 = Fields.RotationX;
                        i3 |= i8;
                    }
                } else {
                    shape2 = shape;
                }
                i8 = Fields.SpotShadowColor;
                i3 |= i8;
            } else {
                shape2 = shape;
            }
            if ((i & 3072) != 0) {
                j3 = j;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j3)) ? Fields.CameraDistance : Fields.RotationZ;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                j4 = j2;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? Fields.Clip : 8192;
            } else {
                j4 = j2;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                        i7 = Fields.RenderEffect;
                        i3 |= i7;
                    }
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i7 = 65536;
                i3 |= i7;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : Fields.BlendMode;
            }
            if ((i2 & Fields.SpotShadowColor) == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
            }
            if (startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
                mutableInteractionSource2 = mutableInteractionSource;
                shape3 = shape2;
                composer2 = startRestartGroup;
                floatingActionButtonElevation3 = floatingActionButtonElevation2;
                j5 = j3;
                j6 = j4;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i9 != 0 ? Modifier.Companion : modifier;
                    if ((i2 & 4) != 0) {
                        shape2 = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(startRestartGroup, 6);
                        i3 &= -897;
                    }
                    Shape shape5 = shape2;
                    if ((i2 & 8) != 0) {
                        j3 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                        i3 &= -7169;
                    }
                    int i10 = i3;
                    long j10 = j3;
                    if ((i2 & 16) != 0) {
                        long m1797contentColorForek8zF_U = ColorSchemeKt.m1797contentColorForek8zF_U(j10, startRestartGroup, (i10 >> 9) & 14);
                        i10 &= -57345;
                        j4 = m1797contentColorForek8zF_U;
                    }
                    int i11 = i10;
                    if ((i2 & 32) != 0) {
                        j7 = j10;
                        modifier3 = modifier5;
                        z = true;
                        floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.m2000elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                        i3 = i11 & (-458753);
                    } else {
                        modifier3 = modifier5;
                        j7 = j10;
                        z = true;
                        i3 = i11;
                    }
                    if (i4 != 0) {
                        shape4 = shape5;
                        j8 = j4;
                        modifier4 = modifier3;
                        mutableInteractionSource3 = null;
                    } else {
                        shape4 = shape5;
                        j8 = j4;
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    floatingActionButtonElevation4 = floatingActionButtonElevation2;
                    i5 = 12582912;
                    j9 = j7;
                    i6 = 1039585610;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    mutableInteractionSource3 = mutableInteractionSource;
                    z = true;
                    floatingActionButtonElevation4 = floatingActionButtonElevation2;
                    j8 = j4;
                    i5 = 12582912;
                    i6 = 1039585610;
                    modifier4 = modifier;
                    shape4 = shape2;
                    j9 = j3;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(i6, i3, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:320)");
                }
                m2009FloatingActionButtonXz6DiA(iyVar2, modifier4, shape4, j9, j8, floatingActionButtonElevation4, mutableInteractionSource3, ComposableLambdaKt.rememberComposableLambda(-1233936436, z, new my() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$1
                    public final void invoke(Composer composer3, int i12) {
                        float f;
                        float f2;
                        if (!composer3.shouldExecute((i12 & 3) != 2, i12 & 1)) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1233936436, i12, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:330)");
                        }
                        Modifier.Companion companion = Modifier.Companion;
                        f = FloatingActionButtonKt.ExtendedFabMinimumWidth;
                        Modifier m811sizeInqDBjuR0$default = SizeKt.m811sizeInqDBjuR0$default(companion, f, 0.0f, 0.0f, 0.0f, 14, null);
                        f2 = FloatingActionButtonKt.ExtendedFabTextPadding;
                        Modifier m764paddingVpY3zN4$default = PaddingKt.m764paddingVpY3zN4$default(m811sizeInqDBjuR0$default, f2, 0.0f, 2, null);
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        ny nyVar2 = ny.this;
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer3, 54);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m764paddingVpY3zN4$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        iy constructor = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3878constructorimpl = Updater.m3878constructorimpl(composer3);
                        my b = k4.b(companion2, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                        }
                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
                        nyVar2.invoke(RowScopeInstance.INSTANCE, composer3, 6);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // defpackage.my
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return w01.a;
                    }
                }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | i5 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2 = startRestartGroup;
                modifier2 = modifier4;
                shape3 = shape4;
                j5 = j9;
                j6 = j8;
                floatingActionButtonElevation3 = floatingActionButtonElevation4;
                mutableInteractionSource2 = mutableInteractionSource3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new fw(iyVar, modifier2, shape3, j5, j6, floatingActionButtonElevation3, mutableInteractionSource2, nyVar, i, i2, 3));
                return;
            }
            return;
        }
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        if ((i2 & Fields.SpotShadowColor) == 0) {
        }
        if (startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0207  */
    /* renamed from: ExtendedFloatingActionButton-qtIzBjc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m2008ExtendedFloatingActionButtonqtIzBjc(final my myVar, final my myVar2, final iy iyVar, final TextStyle textStyle, final float f, final float f2, final float f3, final float f4, final float f5, Modifier modifier, boolean z, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        float f6;
        int i6;
        int i7;
        int i8;
        int i9;
        long j3;
        int i10;
        Composer composer2;
        final Modifier modifier2;
        final boolean z2;
        final Shape shape2;
        final long j4;
        final long j5;
        final FloatingActionButtonElevation floatingActionButtonElevation2;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        boolean z3;
        Shape shape3;
        Modifier modifier3;
        int i11;
        Shape shape4;
        long j6;
        long j7;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        MutableInteractionSource mutableInteractionSource3;
        long j8;
        Shape shape5;
        long j9;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(193103278);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(myVar2) ? 32 : 16;
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= startRestartGroup.changedInstance(iyVar) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i3 & 8;
                int i13 = Fields.RotationZ;
                if (i5 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= startRestartGroup.changed(textStyle) ? 2048 : 1024;
                    int i14 = 8192;
                    if ((i3 & 16) == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i4 |= startRestartGroup.changed(f) ? 16384 : 8192;
                        if ((i3 & 32) != 0) {
                            i4 |= 196608;
                            f6 = f2;
                        } else {
                            f6 = f2;
                            if ((i & 196608) == 0) {
                                i4 |= startRestartGroup.changed(f6) ? 131072 : 65536;
                            }
                        }
                        if ((i3 & 64) != 0) {
                            i4 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(f3) ? 1048576 : Fields.BlendMode;
                        }
                        if ((i3 & Fields.SpotShadowColor) != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= startRestartGroup.changed(f4) ? GroupFlagsKt.IsNodeFlag : 4194304;
                            if ((i3 & Fields.RotationX) == 0) {
                                i4 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i4 |= startRestartGroup.changed(f5) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                                i6 = i3 & Fields.RotationY;
                                if (i6 != 0) {
                                    i4 |= 805306368;
                                } else if ((i & 805306368) == 0) {
                                    i4 |= startRestartGroup.changed(modifier) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                }
                                i7 = i3 & Fields.RotationZ;
                                if (i7 != 0) {
                                    i9 = i2 | 6;
                                    i8 = i7;
                                } else if ((i2 & 6) == 0) {
                                    i8 = i7;
                                    i9 = i2 | (startRestartGroup.changed(z) ? 4 : 2);
                                } else {
                                    i8 = i7;
                                    i9 = i2;
                                }
                                if ((i2 & 48) == 0) {
                                    if ((i3 & Fields.CameraDistance) == 0 && startRestartGroup.changed(shape)) {
                                        i12 = 32;
                                        i9 |= i12;
                                    }
                                    i12 = 16;
                                    i9 |= i12;
                                }
                                if ((i2 & 384) == 0) {
                                    i9 |= ((i3 & Fields.TransformOrigin) == 0 && startRestartGroup.changed(j)) ? Fields.RotationX : Fields.SpotShadowColor;
                                }
                                if ((i2 & 3072) == 0) {
                                    j3 = j2;
                                    if ((i3 & 8192) == 0 && startRestartGroup.changed(j3)) {
                                        i13 = 2048;
                                    }
                                    i9 |= i13;
                                } else {
                                    j3 = j2;
                                }
                                if ((i2 & 24576) == 0) {
                                    if ((i3 & Fields.Clip) == 0 && startRestartGroup.changed(floatingActionButtonElevation)) {
                                        i14 = 16384;
                                    }
                                    i9 |= i14;
                                }
                                i10 = i3 & Fields.CompositingStrategy;
                                if (i10 != 0) {
                                    i9 |= 196608;
                                } else if ((i2 & 196608) == 0) {
                                    i9 |= startRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
                                }
                                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 74899) != 74898, i4 & 1)) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        Modifier modifier4 = i6 != 0 ? Modifier.Companion : modifier;
                                        z3 = i8 != 0 ? true : z;
                                        if ((i3 & Fields.CameraDistance) != 0) {
                                            shape3 = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(startRestartGroup, 6);
                                            i9 &= -113;
                                        } else {
                                            shape3 = shape;
                                        }
                                        int i15 = i9;
                                        if ((i3 & Fields.TransformOrigin) != 0) {
                                            modifier3 = modifier4;
                                            i11 = i15 & (-897);
                                            shape4 = shape3;
                                            j6 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                        } else {
                                            modifier3 = modifier4;
                                            i11 = i15;
                                            shape4 = shape3;
                                            j6 = j;
                                        }
                                        if ((i3 & 8192) != 0) {
                                            j7 = ColorSchemeKt.m1797contentColorForek8zF_U(j6, startRestartGroup, (i11 >> 6) & 14);
                                            i11 &= -7169;
                                        } else {
                                            j7 = j2;
                                        }
                                        long j10 = j6;
                                        if ((i3 & Fields.Clip) != 0) {
                                            floatingActionButtonElevation3 = FloatingActionButtonDefaults.INSTANCE.m2000elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                                            composer2 = startRestartGroup;
                                            i11 &= -57345;
                                        } else {
                                            composer2 = startRestartGroup;
                                            floatingActionButtonElevation3 = floatingActionButtonElevation;
                                        }
                                        mutableInteractionSource3 = i10 != 0 ? null : mutableInteractionSource;
                                        j8 = j7;
                                        shape5 = shape4;
                                        j9 = j10;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & Fields.CameraDistance) != 0) {
                                            i9 &= -113;
                                        }
                                        int i16 = i9;
                                        if ((i3 & Fields.TransformOrigin) != 0) {
                                            i16 &= -897;
                                        }
                                        if ((i3 & 8192) != 0) {
                                            i16 &= -7169;
                                        }
                                        if ((i3 & Fields.Clip) != 0) {
                                            i16 &= -57345;
                                        }
                                        modifier3 = modifier;
                                        z3 = z;
                                        shape5 = shape;
                                        j9 = j;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        i11 = i16;
                                        composer2 = startRestartGroup;
                                        j8 = j3;
                                        floatingActionButtonElevation3 = floatingActionButtonElevation;
                                    }
                                    composer2.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(193103278, i4, i11, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:451)");
                                    }
                                    Dp.Companion companion = Dp.Companion;
                                    boolean z4 = z3;
                                    FloatingActionButtonElevation floatingActionButtonElevation4 = floatingActionButtonElevation3;
                                    int i17 = i4 >> 6;
                                    int i18 = i11 << 12;
                                    int i19 = (i17 & 112) | (i17 & 14) | 3456 | ((i4 >> 15) & 57344) | (458752 & i18) | (3670016 & i18) | (29360128 & i18) | (234881024 & i18) | (i18 & 1879048192);
                                    Modifier modifier5 = modifier3;
                                    m2010FloatingActionButtonlFWlFE(iyVar, textStyle, companion.m7631getUnspecifiedD9Ej5fM(), companion.m7631getUnspecifiedD9Ej5fM(), modifier5, shape5, j9, j8, floatingActionButtonElevation4, mutableInteractionSource3, ComposableLambdaKt.rememberComposableLambda(-827388388, true, new FloatingActionButtonKt$ExtendedFloatingActionButton$5(z4, f, f6, f3, f4, myVar2, f5, myVar), composer2, 54), composer2, i19, 6, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    floatingActionButtonElevation2 = floatingActionButtonElevation4;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    j5 = j8;
                                    shape2 = shape5;
                                    j4 = j9;
                                    z2 = z4;
                                    modifier2 = modifier5;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    modifier2 = modifier;
                                    z2 = z;
                                    shape2 = shape;
                                    j4 = j;
                                    j5 = j2;
                                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new my() { // from class: hw
                                        @Override // defpackage.my
                                        public final Object invoke(Object obj, Object obj2) {
                                            w01 ExtendedFloatingActionButton_qtIzBjc$lambda$9;
                                            int intValue = ((Integer) obj2).intValue();
                                            ExtendedFloatingActionButton_qtIzBjc$lambda$9 = FloatingActionButtonKt.ExtendedFloatingActionButton_qtIzBjc$lambda$9(my.this, myVar2, iyVar, textStyle, f, f2, f3, f4, f5, modifier2, z2, shape2, j4, j5, floatingActionButtonElevation2, mutableInteractionSource2, i, i2, i3, (Composer) obj, intValue);
                                            return ExtendedFloatingActionButton_qtIzBjc$lambda$9;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i6 = i3 & Fields.RotationY;
                            if (i6 != 0) {
                            }
                            i7 = i3 & Fields.RotationZ;
                            if (i7 != 0) {
                            }
                            if ((i2 & 48) == 0) {
                            }
                            if ((i2 & 384) == 0) {
                            }
                            if ((i2 & 3072) == 0) {
                            }
                            if ((i2 & 24576) == 0) {
                            }
                            i10 = i3 & Fields.CompositingStrategy;
                            if (i10 != 0) {
                            }
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 74899) != 74898, i4 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        if ((i3 & Fields.RotationX) == 0) {
                        }
                        i6 = i3 & Fields.RotationY;
                        if (i6 != 0) {
                        }
                        i7 = i3 & Fields.RotationZ;
                        if (i7 != 0) {
                        }
                        if ((i2 & 48) == 0) {
                        }
                        if ((i2 & 384) == 0) {
                        }
                        if ((i2 & 3072) == 0) {
                        }
                        if ((i2 & 24576) == 0) {
                        }
                        i10 = i3 & Fields.CompositingStrategy;
                        if (i10 != 0) {
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 74899) != 74898, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    if ((i3 & 32) != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if ((i3 & Fields.SpotShadowColor) != 0) {
                    }
                    if ((i3 & Fields.RotationX) == 0) {
                    }
                    i6 = i3 & Fields.RotationY;
                    if (i6 != 0) {
                    }
                    i7 = i3 & Fields.RotationZ;
                    if (i7 != 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    if ((i2 & 384) == 0) {
                    }
                    if ((i2 & 3072) == 0) {
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    i10 = i3 & Fields.CompositingStrategy;
                    if (i10 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 74899) != 74898, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                int i142 = 8192;
                if ((i3 & 16) == 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if ((i3 & Fields.SpotShadowColor) != 0) {
                }
                if ((i3 & Fields.RotationX) == 0) {
                }
                i6 = i3 & Fields.RotationY;
                if (i6 != 0) {
                }
                i7 = i3 & Fields.RotationZ;
                if (i7 != 0) {
                }
                if ((i2 & 48) == 0) {
                }
                if ((i2 & 384) == 0) {
                }
                if ((i2 & 3072) == 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                i10 = i3 & Fields.CompositingStrategy;
                if (i10 != 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 74899) != 74898, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i3 & 8;
            int i132 = Fields.RotationZ;
            if (i5 != 0) {
            }
            int i1422 = 8192;
            if ((i3 & 16) == 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & Fields.SpotShadowColor) != 0) {
            }
            if ((i3 & Fields.RotationX) == 0) {
            }
            i6 = i3 & Fields.RotationY;
            if (i6 != 0) {
            }
            i7 = i3 & Fields.RotationZ;
            if (i7 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & 384) == 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i10 = i3 & Fields.CompositingStrategy;
            if (i10 != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 74899) != 74898, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        i5 = i3 & 8;
        int i1322 = Fields.RotationZ;
        if (i5 != 0) {
        }
        int i14222 = 8192;
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & Fields.SpotShadowColor) != 0) {
        }
        if ((i3 & Fields.RotationX) == 0) {
        }
        i6 = i3 & Fields.RotationY;
        if (i6 != 0) {
        }
        i7 = i3 & Fields.RotationZ;
        if (i7 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & 384) == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i10 = i3 & Fields.CompositingStrategy;
        if (i10 != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 74899) != 74898, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ExtendedFloatingActionButton_ElI5_7k$lambda$8(my myVar, my myVar2, iy iyVar, Modifier modifier, boolean z, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        m2006ExtendedFloatingActionButtonElI57k(myVar, myVar2, iyVar, modifier, z, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ExtendedFloatingActionButton_X_z6DiA$lambda$7(iy iyVar, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, ny nyVar, int i, int i2, Composer composer, int i3) {
        m2007ExtendedFloatingActionButtonXz6DiA(iyVar, modifier, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ExtendedFloatingActionButton_qtIzBjc$lambda$9(my myVar, my myVar2, iy iyVar, TextStyle textStyle, float f, float f2, float f3, float f4, float f5, Modifier modifier, boolean z, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        m2008ExtendedFloatingActionButtonqtIzBjc(myVar, myVar2, iyVar, textStyle, f, f2, f3, f4, f5, modifier, z, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: FloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2009FloatingActionButtonXz6DiA(iy iyVar, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, my myVar, Composer composer, int i, int i2) {
        iy iyVar2;
        int i3;
        Modifier modifier2;
        Shape shape2;
        long j3;
        long j4;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        Shape shape3;
        Composer composer2;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        long j5;
        long j6;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        long j7;
        Modifier modifier4;
        int i5;
        long j8;
        Modifier modifier5;
        FloatingActionButtonElevation floatingActionButtonElevation4;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape5;
        long j9;
        long j10;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(748201188);
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
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i7 = Fields.RotationX;
                        i3 |= i7;
                    }
                } else {
                    shape2 = shape;
                }
                i7 = Fields.SpotShadowColor;
                i3 |= i7;
            } else {
                shape2 = shape;
            }
            if ((i & 3072) != 0) {
                j3 = j;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j3)) ? Fields.CameraDistance : Fields.RotationZ;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                j4 = j2;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? Fields.Clip : 8192;
            } else {
                j4 = j2;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                        i6 = Fields.RenderEffect;
                        i3 |= i6;
                    }
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i6 = 65536;
                i3 |= i6;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : Fields.BlendMode;
                if ((i2 & Fields.SpotShadowColor) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        shape3 = shape2;
                        composer2 = startRestartGroup;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                        j5 = j3;
                        j6 = j4;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier6 = i8 != 0 ? Modifier.Companion : modifier2;
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                                shape4 = FloatingActionButtonDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            } else {
                                shape4 = shape2;
                            }
                            if ((i2 & 8) != 0) {
                                j7 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                i3 &= -7169;
                            } else {
                                j7 = j3;
                            }
                            if ((i2 & 16) != 0) {
                                long m1797contentColorForek8zF_U = ColorSchemeKt.m1797contentColorForek8zF_U(j7, startRestartGroup, (i3 >> 9) & 14);
                                i3 &= -57345;
                                j4 = m1797contentColorForek8zF_U;
                            }
                            int i9 = i3;
                            if ((i2 & 32) != 0) {
                                j8 = j7;
                                modifier4 = modifier6;
                                i5 = 6;
                                floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.m2000elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                                i3 = i9 & (-458753);
                            } else {
                                modifier4 = modifier6;
                                i5 = 6;
                                j8 = j7;
                                i3 = i9;
                            }
                            if (i4 != 0) {
                                modifier5 = modifier4;
                                mutableInteractionSource4 = null;
                                floatingActionButtonElevation4 = floatingActionButtonElevation2;
                            } else {
                                modifier5 = modifier4;
                                floatingActionButtonElevation4 = floatingActionButtonElevation2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                            }
                            shape5 = shape4;
                            j9 = j8;
                            j10 = j4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i5 = 6;
                            modifier5 = modifier2;
                            shape5 = shape2;
                            floatingActionButtonElevation4 = floatingActionButtonElevation2;
                            j9 = j3;
                            j10 = j4;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(748201188, i3, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:118)");
                        }
                        TextStyle value = TypographyKt.getValue(ExtendedFabPrimaryTokens.INSTANCE.getLabelTextFont(), startRestartGroup, i5);
                        FabBaselineTokens fabBaselineTokens = FabBaselineTokens.INSTANCE;
                        int i10 = i3 << 9;
                        m2010FloatingActionButtonlFWlFE(iyVar2, value, fabBaselineTokens.m3286getContainerWidthD9Ej5fM(), fabBaselineTokens.m3285getContainerHeightD9Ej5fM(), modifier5, shape5, j9, j10, floatingActionButtonElevation4, mutableInteractionSource4, myVar, startRestartGroup, (i3 & 14) | 3456 | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10) | (i10 & 1879048192), (i3 >> 21) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2 = startRestartGroup;
                        modifier3 = modifier5;
                        shape3 = shape5;
                        j5 = j9;
                        j6 = j10;
                        floatingActionButtonElevation3 = floatingActionButtonElevation4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new fw(iyVar, modifier3, shape3, j5, j6, floatingActionButtonElevation3, mutableInteractionSource3, myVar, i, i2, 2));
                        return;
                    }
                    return;
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & Fields.SpotShadowColor) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & Fields.SpotShadowColor) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0304  */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* renamed from: FloatingActionButton-lF-WlFE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m2010FloatingActionButtonlFWlFE(final iy iyVar, final TextStyle textStyle, final float f, final float f2, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, final my myVar, Composer composer, final int i, final int i2, final int i3) {
        iy iyVar2;
        int i4;
        float f3;
        Modifier modifier2;
        Shape shape2;
        int i5;
        long j3;
        int i6;
        int i7;
        int i8;
        int i9;
        final FloatingActionButtonElevation floatingActionButtonElevation2;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        Composer composer2;
        final Shape shape3;
        final long j4;
        final long j5;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        long j6;
        int i10;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource3;
        long j7;
        boolean z;
        boolean z2;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape5;
        long j8;
        long j9;
        ?? r11;
        MutableInteractionSource mutableInteractionSource5;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(121669932);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 6) == 0) {
                i4 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i;
            } else {
                i4 = i;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(f) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
            f3 = f2;
        } else {
            f3 = f2;
            if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(f3) ? Fields.CameraDistance : Fields.RotationZ;
            }
        }
        int i13 = i3 & 16;
        if (i13 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? Fields.Clip : 8192;
            if ((196608 & i) != 0) {
                if ((i3 & 32) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i12 = Fields.RenderEffect;
                        i4 |= i12;
                    }
                } else {
                    shape2 = shape;
                }
                i12 = 65536;
                i4 |= i12;
            } else {
                shape2 = shape;
            }
            if ((1572864 & i) != 0) {
                i5 = i4 | (((i3 & 64) == 0 && startRestartGroup.changed(j)) ? 1048576 : Fields.BlendMode);
            } else {
                i5 = i4;
            }
            if ((i & 12582912) != 0) {
                j3 = j2;
                i5 |= ((i3 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(j3)) ? GroupFlagsKt.IsNodeFlag : 4194304;
            } else {
                j3 = j2;
            }
            if ((i & 100663296) == 0) {
                if ((i3 & Fields.RotationX) == 0 && startRestartGroup.changed(floatingActionButtonElevation)) {
                    i11 = GroupFlagsKt.IsRecompositionRequiredFlag;
                    i5 |= i11;
                }
                i11 = GroupFlagsKt.HasAuxSlotFlag;
                i5 |= i11;
            }
            i6 = i3 & Fields.RotationY;
            if (i6 == 0) {
                i5 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i7 = i6;
                i5 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                if ((i3 & Fields.RotationZ) != 0) {
                    i8 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i8 = i2 | (startRestartGroup.changedInstance(myVar) ? 4 : 2);
                } else {
                    i8 = i2;
                }
                i9 = i8;
                if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i9 & 3) != 2, i5 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i13 != 0 ? Modifier.Companion : modifier2;
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                            shape4 = FloatingActionButtonDefaults.INSTANCE.getShape(startRestartGroup, 6);
                        } else {
                            shape4 = shape2;
                        }
                        if ((i3 & 64) != 0) {
                            j6 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            i5 &= -3670017;
                        } else {
                            j6 = j;
                        }
                        if ((i3 & Fields.SpotShadowColor) != 0) {
                            j3 = ColorSchemeKt.m1797contentColorForek8zF_U(j6, startRestartGroup, (i5 >> 18) & 14);
                            i5 &= -29360129;
                        }
                        int i14 = i5;
                        if ((i3 & Fields.RotationX) != 0) {
                            j7 = j6;
                            i10 = i9;
                            modifier4 = modifier5;
                            mutableInteractionSource3 = null;
                            z = false;
                            z2 = true;
                            floatingActionButtonElevation3 = FloatingActionButtonDefaults.INSTANCE.m2000elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                            i5 = i14 & (-234881025);
                        } else {
                            i10 = i9;
                            modifier4 = modifier5;
                            mutableInteractionSource3 = null;
                            j7 = j6;
                            z = false;
                            z2 = true;
                            floatingActionButtonElevation3 = floatingActionButtonElevation;
                            i5 = i14;
                        }
                        modifier2 = modifier4;
                        mutableInteractionSource4 = i7 != 0 ? mutableInteractionSource3 : mutableInteractionSource;
                        shape5 = shape4;
                        j8 = j7;
                        j9 = j3;
                        r11 = z2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            i5 &= -3670017;
                        }
                        if ((i3 & Fields.SpotShadowColor) != 0) {
                            i5 &= -29360129;
                        }
                        if ((i3 & Fields.RotationX) != 0) {
                            i5 &= -234881025;
                        }
                        j8 = j;
                        i10 = i9;
                        mutableInteractionSource3 = null;
                        shape5 = shape2;
                        j9 = j3;
                        z = false;
                        r11 = 1;
                        floatingActionButtonElevation3 = floatingActionButtonElevation;
                        mutableInteractionSource4 = mutableInteractionSource;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(121669932, i5, i10, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:145)");
                    }
                    if (mutableInteractionSource4 == null) {
                        startRestartGroup.startReplaceGroup(-282833393);
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        mutableInteractionSource5 = (MutableInteractionSource) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(960707016);
                        startRestartGroup.endReplaceGroup();
                        mutableInteractionSource5 = mutableInteractionSource4;
                    }
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new qo(25);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    final float f4 = f3;
                    final long j10 = j9;
                    int i15 = i5 >> 6;
                    SurfaceKt.m2467Surfaceo_FOJdg(iyVar2, SemanticsModifierKt.semantics$default(modifier2, z, (ky) rememberedValue2, r11, mutableInteractionSource3), false, shape5, j8, j9, floatingActionButtonElevation3.m2003tonalElevationD9Ej5fM$material3(), floatingActionButtonElevation3.shadowElevation$material3(mutableInteractionSource5, startRestartGroup, (i5 >> 21) & 112).getValue().m7625unboximpl(), null, mutableInteractionSource5, ComposableLambdaKt.rememberComposableLambda(-1779603465, r11, new my() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3
                        public final void invoke(Composer composer3, int i16) {
                            if (!composer3.shouldExecute((i16 & 3) != 2, i16 & 1)) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1779603465, i16, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:158)");
                            }
                            long j11 = j10;
                            TextStyle textStyle2 = textStyle;
                            final float f5 = f;
                            final float f6 = f4;
                            final my myVar2 = myVar;
                            ProvideContentColorTextStyleKt.m2902ProvideContentColorTextStyle3JVO9M(j11, textStyle2, ComposableLambdaKt.rememberComposableLambda(-1767363041, true, new my() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3.1
                                public final void invoke(Composer composer4, int i17) {
                                    if (!composer4.shouldExecute((i17 & 3) != 2, i17 & 1)) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1767363041, i17, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:159)");
                                    }
                                    Modifier m791defaultMinSizeVpY3zN4 = SizeKt.m791defaultMinSizeVpY3zN4(Modifier.Companion, f5, f6);
                                    Alignment center = Alignment.Companion.getCenter();
                                    my myVar3 = myVar2;
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, m791defaultMinSizeVpY3zN4);
                                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                                    iy constructor = companion.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer m3878constructorimpl = Updater.m3878constructorimpl(composer4);
                                    my b = k4.b(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                    }
                                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    if (fc.l(myVar3, composer4, 0)) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.my
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return w01.a;
                                }
                            }, composer3, 54), composer3, 384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // defpackage.my
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return w01.a;
                        }
                    }, startRestartGroup, 54), startRestartGroup, (i5 & 14) | (i15 & 7168) | (57344 & i15) | (i15 & 458752), 6, 260);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    floatingActionButtonElevation2 = floatingActionButtonElevation3;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    modifier3 = modifier2;
                    composer2 = startRestartGroup;
                    shape3 = shape5;
                    j5 = j8;
                    j4 = j9;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    mutableInteractionSource2 = mutableInteractionSource;
                    modifier3 = modifier2;
                    composer2 = startRestartGroup;
                    shape3 = shape2;
                    j4 = j3;
                    j5 = j;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new my() { // from class: gw
                        @Override // defpackage.my
                        public final Object invoke(Object obj, Object obj2) {
                            w01 FloatingActionButton_lF_WlFE$lambda$4;
                            int intValue = ((Integer) obj2).intValue();
                            FloatingActionButton_lF_WlFE$lambda$4 = FloatingActionButtonKt.FloatingActionButton_lF_WlFE$lambda$4(iy.this, textStyle, f, f2, modifier3, shape3, j5, j4, floatingActionButtonElevation2, mutableInteractionSource2, myVar, i, i2, i3, (Composer) obj, intValue);
                            return FloatingActionButton_lF_WlFE$lambda$4;
                        }
                    });
                    return;
                }
                return;
            }
            i7 = i6;
            if ((i3 & Fields.RotationZ) != 0) {
            }
            i9 = i8;
            if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i9 & 3) != 2, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i6 = i3 & Fields.RotationY;
        if (i6 == 0) {
        }
        i7 = i6;
        if ((i3 & Fields.RotationZ) != 0) {
        }
        i9 = i8;
        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i9 & 3) != 2, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FloatingActionButton_X_z6DiA$lambda$0(iy iyVar, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, my myVar, int i, int i2, Composer composer, int i3) {
        m2009FloatingActionButtonXz6DiA(iyVar, modifier, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FloatingActionButton_lF_WlFE$lambda$3$lambda$2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6847setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m6828getButtono7Vup1c());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FloatingActionButton_lF_WlFE$lambda$4(iy iyVar, TextStyle textStyle, float f, float f2, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, my myVar, int i, int i2, int i3, Composer composer, int i4) {
        m2010FloatingActionButtonlFWlFE(iyVar, textStyle, f, f2, modifier, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: LargeFloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2011LargeFloatingActionButtonXz6DiA(iy iyVar, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, my myVar, Composer composer, int i, int i2) {
        iy iyVar2;
        int i3;
        Modifier modifier2;
        Shape shape2;
        long j3;
        long j4;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        Shape shape3;
        Composer composer2;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        long j5;
        long j6;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        int i5;
        long j7;
        long j8;
        long j9;
        int i6;
        FloatingActionButtonElevation floatingActionButtonElevation4;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape5;
        long j10;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1274576261);
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
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i8 = Fields.RotationX;
                        i3 |= i8;
                    }
                } else {
                    shape2 = shape;
                }
                i8 = Fields.SpotShadowColor;
                i3 |= i8;
            } else {
                shape2 = shape;
            }
            if ((i & 3072) != 0) {
                j3 = j;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j3)) ? Fields.CameraDistance : Fields.RotationZ;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                j4 = j2;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? Fields.Clip : 8192;
            } else {
                j4 = j2;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                        i7 = Fields.RenderEffect;
                        i3 |= i7;
                    }
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i7 = 65536;
                i3 |= i7;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : Fields.BlendMode;
                if ((i2 & Fields.SpotShadowColor) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        shape3 = shape2;
                        composer2 = startRestartGroup;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                        j5 = j3;
                        j6 = j4;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i9 != 0 ? Modifier.Companion : modifier2;
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                                shape4 = FloatingActionButtonDefaults.INSTANCE.getLargeShape(startRestartGroup, 6);
                            } else {
                                shape4 = shape2;
                            }
                            if ((i2 & 8) != 0) {
                                i5 = i3 & (-7169);
                                j7 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            } else {
                                i5 = i3;
                                j7 = j3;
                            }
                            if ((i2 & 16) != 0) {
                                long m1797contentColorForek8zF_U = ColorSchemeKt.m1797contentColorForek8zF_U(j7, startRestartGroup, (i5 >> 9) & 14);
                                i5 &= -57345;
                                j4 = m1797contentColorForek8zF_U;
                            }
                            int i10 = i5;
                            if ((i2 & 32) != 0) {
                                j8 = j7;
                                floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.m2000elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                                i3 = i10 & (-458753);
                            } else {
                                j8 = j7;
                                i3 = i10;
                            }
                            if (i4 != 0) {
                                modifier2 = modifier4;
                                shape5 = shape4;
                                j9 = j8;
                                i6 = 1274576261;
                                mutableInteractionSource4 = null;
                                floatingActionButtonElevation4 = floatingActionButtonElevation2;
                            } else {
                                modifier2 = modifier4;
                                j9 = j8;
                                i6 = 1274576261;
                                floatingActionButtonElevation4 = floatingActionButtonElevation2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                shape5 = shape4;
                            }
                            j10 = j4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            floatingActionButtonElevation4 = floatingActionButtonElevation2;
                            j9 = j3;
                            j10 = j4;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            i6 = 1274576261;
                            shape5 = shape2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(i6, i3, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:262)");
                        }
                        FabLargeTokens fabLargeTokens = FabLargeTokens.INSTANCE;
                        m2009FloatingActionButtonXz6DiA(iyVar2, SizeKt.m811sizeInqDBjuR0$default(modifier2, fabLargeTokens.m3289getContainerWidthD9Ej5fM(), fabLargeTokens.m3288getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), shape5, j9, j10, floatingActionButtonElevation4, mutableInteractionSource4, myVar, startRestartGroup, i3 & 33554318, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        composer2 = startRestartGroup;
                        shape3 = shape5;
                        j5 = j9;
                        j6 = j10;
                        floatingActionButtonElevation3 = floatingActionButtonElevation4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new fw(iyVar, modifier3, shape3, j5, j6, floatingActionButtonElevation3, mutableInteractionSource3, myVar, i, i2, 0));
                        return;
                    }
                    return;
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & Fields.SpotShadowColor) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & Fields.SpotShadowColor) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LargeFloatingActionButton_X_z6DiA$lambda$6(iy iyVar, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, my myVar, int i, int i2, Composer composer, int i3) {
        m2011LargeFloatingActionButtonXz6DiA(iyVar, modifier, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: SmallFloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2012SmallFloatingActionButtonXz6DiA(iy iyVar, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, my myVar, Composer composer, int i, int i2) {
        iy iyVar2;
        int i3;
        Modifier modifier2;
        Shape shape2;
        long j3;
        long j4;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        Shape shape3;
        Composer composer2;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        long j5;
        long j6;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        int i5;
        long j7;
        long j8;
        long j9;
        int i6;
        FloatingActionButtonElevation floatingActionButtonElevation4;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape5;
        long j10;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(26608441);
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
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i8 = Fields.RotationX;
                        i3 |= i8;
                    }
                } else {
                    shape2 = shape;
                }
                i8 = Fields.SpotShadowColor;
                i3 |= i8;
            } else {
                shape2 = shape;
            }
            if ((i & 3072) != 0) {
                j3 = j;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j3)) ? Fields.CameraDistance : Fields.RotationZ;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                j4 = j2;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? Fields.Clip : 8192;
            } else {
                j4 = j2;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                        i7 = Fields.RenderEffect;
                        i3 |= i7;
                    }
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i7 = 65536;
                i3 |= i7;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : Fields.BlendMode;
                if ((i2 & Fields.SpotShadowColor) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        shape3 = shape2;
                        composer2 = startRestartGroup;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                        j5 = j3;
                        j6 = j4;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i9 != 0 ? Modifier.Companion : modifier2;
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                                shape4 = FloatingActionButtonDefaults.INSTANCE.getSmallShape(startRestartGroup, 6);
                            } else {
                                shape4 = shape2;
                            }
                            if ((i2 & 8) != 0) {
                                i5 = i3 & (-7169);
                                j7 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            } else {
                                i5 = i3;
                                j7 = j3;
                            }
                            if ((i2 & 16) != 0) {
                                long m1797contentColorForek8zF_U = ColorSchemeKt.m1797contentColorForek8zF_U(j7, startRestartGroup, (i5 >> 9) & 14);
                                i5 &= -57345;
                                j4 = m1797contentColorForek8zF_U;
                            }
                            int i10 = i5;
                            if ((i2 & 32) != 0) {
                                j8 = j7;
                                floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.m2000elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                                i3 = i10 & (-458753);
                            } else {
                                j8 = j7;
                                i3 = i10;
                            }
                            if (i4 != 0) {
                                modifier2 = modifier4;
                                shape5 = shape4;
                                j9 = j8;
                                i6 = 26608441;
                                mutableInteractionSource4 = null;
                                floatingActionButtonElevation4 = floatingActionButtonElevation2;
                            } else {
                                modifier2 = modifier4;
                                j9 = j8;
                                i6 = 26608441;
                                floatingActionButtonElevation4 = floatingActionButtonElevation2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                shape5 = shape4;
                            }
                            j10 = j4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            floatingActionButtonElevation4 = floatingActionButtonElevation2;
                            j9 = j3;
                            j10 = j4;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            i6 = 26608441;
                            shape5 = shape2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(i6, i3, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:207)");
                        }
                        FabSmallTokens fabSmallTokens = FabSmallTokens.INSTANCE;
                        m2009FloatingActionButtonXz6DiA(iyVar2, SizeKt.m811sizeInqDBjuR0$default(modifier2, fabSmallTokens.m3315getContainerWidthD9Ej5fM(), fabSmallTokens.m3314getContainerHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), shape5, j9, j10, floatingActionButtonElevation4, mutableInteractionSource4, myVar, startRestartGroup, i3 & 33554318, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        composer2 = startRestartGroup;
                        shape3 = shape5;
                        j5 = j9;
                        j6 = j10;
                        floatingActionButtonElevation3 = floatingActionButtonElevation4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new fw(iyVar, modifier3, shape3, j5, j6, floatingActionButtonElevation3, mutableInteractionSource3, myVar, i, i2, 1));
                        return;
                    }
                    return;
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & Fields.SpotShadowColor) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & Fields.SpotShadowColor) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SmallFloatingActionButton_X_z6DiA$lambda$5(iy iyVar, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, my myVar, int i, int i2, Composer composer, int i3) {
        m2012SmallFloatingActionButtonXz6DiA(iyVar, modifier, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition extendedFabCollapseAnimation(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-56172201, i, -1, "androidx.compose.material3.extendedFabCollapseAnimation (FloatingActionButton.kt:795)");
        }
        ExitTransition plus = EnterExitTransitionKt.fadeOut$default(MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer, 6), 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composer, 6), Alignment.Companion.getStart(), false, null, 12, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return plus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition extendedFabExpandAnimation(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-719787506, i, -1, "androidx.compose.material3.extendedFabExpandAnimation (FloatingActionButton.kt:806)");
        }
        EnterTransition plus = EnterExitTransitionKt.fadeIn$default(MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6), 0.0f, 2, null).plus(EnterExitTransitionKt.expandHorizontally$default(MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer, 6), Alignment.Companion.getStart(), false, null, 12, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return plus;
    }
}
