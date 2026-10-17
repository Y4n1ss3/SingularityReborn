package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.internal.MappedInteractionSource;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.material3.tokens.NavigationBarVerticalItemTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
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
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import defpackage.iy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.ky;
import defpackage.ms;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.qb0;
import defpackage.rb0;
import defpackage.sb0;
import defpackage.t6;
import defpackage.ub0;
import defpackage.w01;
import defpackage.wb0;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationBarKt {
    private static final String IconLayoutIdTag = "icon";
    private static final float IndicatorHorizontalPadding;
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalOffset;
    private static final float IndicatorVerticalPadding;
    private static final String LabelLayoutIdTag = "label";
    private static final ProvidableCompositionLocal<NavigationBarOverride> LocalNavigationBarOverride;
    private static final float NavigationBarItemToIconMinimumPadding;
    private static final float NavigationBarHeight = NavigationBarTokens.INSTANCE.m3436getTallContainerHeightD9Ej5fM();
    private static final float NavigationBarItemHorizontalPadding = Dp.m7611constructorimpl(8.0f);
    private static final float NavigationBarIndicatorToLabelPadding = Dp.m7611constructorimpl(4.0f);

    static {
        NavigationBarVerticalItemTokens navigationBarVerticalItemTokens = NavigationBarVerticalItemTokens.INSTANCE;
        IndicatorHorizontalPadding = Dp.m7611constructorimpl(Dp.m7611constructorimpl(navigationBarVerticalItemTokens.m3438getActiveIndicatorWidthD9Ej5fM() - navigationBarVerticalItemTokens.m3440getIconSizeD9Ej5fM()) / 2.0f);
        IndicatorVerticalPadding = Dp.m7611constructorimpl(Dp.m7611constructorimpl(navigationBarVerticalItemTokens.m3437getActiveIndicatorHeightD9Ej5fM() - navigationBarVerticalItemTokens.m3440getIconSizeD9Ej5fM()) / 2.0f);
        IndicatorVerticalOffset = Dp.m7611constructorimpl(12.0f);
        NavigationBarItemToIconMinimumPadding = Dp.m7611constructorimpl(44.0f);
        LocalNavigationBarOverride = CompositionLocalKt.compositionLocalOf$default(null, new ms(17), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0093  */
    /* renamed from: NavigationBar-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2169NavigationBarHsRjFd4(Modifier modifier, long j, long j2, float f, WindowInsets windowInsets, final ny nyVar, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        float f2;
        WindowInsets windowInsets2;
        ny nyVar2;
        Modifier modifier3;
        final long j5;
        final long j6;
        final float f3;
        final WindowInsets windowInsets3;
        ScopeUpdateScope endRestartGroup;
        WindowInsets windowInsets4;
        long j7;
        long j8;
        float f4;
        int i4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(1054099326);
        int i7 = i2 & 1;
        if (i7 != 0) {
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
            if ((i2 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                j3 = j;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i5 = Fields.RotationX;
                    i3 |= i5;
                }
            } else {
                j4 = j2;
            }
            i5 = Fields.SpotShadowColor;
            i3 |= i5;
        } else {
            j4 = j2;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? Fields.CameraDistance : Fields.RotationZ;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    windowInsets2 = windowInsets;
                    if (startRestartGroup.changed(windowInsets2)) {
                        i4 = Fields.Clip;
                        i3 |= i4;
                    }
                } else {
                    windowInsets2 = windowInsets;
                }
                i4 = 8192;
                i3 |= i4;
            } else {
                windowInsets2 = windowInsets;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                nyVar2 = nyVar;
                i3 |= startRestartGroup.changedInstance(nyVar2) ? Fields.RenderEffect : 65536;
                if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i7 != 0 ? Modifier.Companion : modifier2;
                        if ((i2 & 2) != 0) {
                            j3 = NavigationBarDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            j4 = ColorSchemeKt.m1796contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6), j3);
                            i3 &= -897;
                        }
                        if (i8 != 0) {
                            f2 = NavigationBarDefaults.INSTANCE.m2154getElevationD9Ej5fM();
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            modifier3 = modifier4;
                            windowInsets4 = NavigationBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                            j7 = j3;
                            j8 = j4;
                            f4 = f2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1054099326, i3, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:118)");
                            }
                            ((NavigationBarOverride) startRestartGroup.consume(LocalNavigationBarOverride)).NavigationBar(new NavigationBarOverrideScope(modifier3, j7, j8, f4, windowInsets4, nyVar2, null), startRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            j5 = j7;
                            j6 = j8;
                            f3 = f4;
                            windowInsets3 = windowInsets4;
                        } else {
                            modifier3 = modifier4;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        modifier3 = modifier2;
                    }
                    j7 = j3;
                    j8 = j4;
                    f4 = f2;
                    windowInsets4 = windowInsets2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ((NavigationBarOverride) startRestartGroup.consume(LocalNavigationBarOverride)).NavigationBar(new NavigationBarOverrideScope(modifier3, j7, j8, f4, windowInsets4, nyVar2, null), startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    j5 = j7;
                    j6 = j8;
                    f3 = f4;
                    windowInsets3 = windowInsets4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    j5 = j3;
                    j6 = j4;
                    f3 = f2;
                    windowInsets3 = windowInsets2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier5 = modifier3;
                    endRestartGroup.updateScope(new my() { // from class: tb0
                        @Override // defpackage.my
                        public final Object invoke(Object obj, Object obj2) {
                            w01 NavigationBar_HsRjFd4$lambda$1;
                            int intValue = ((Integer) obj2).intValue();
                            NavigationBar_HsRjFd4$lambda$1 = NavigationBarKt.NavigationBar_HsRjFd4$lambda$1(Modifier.this, j5, j6, f3, windowInsets3, nyVar, i, i2, (Composer) obj, intValue);
                            return NavigationBar_HsRjFd4$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            nyVar2 = nyVar;
            if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f2 = f;
        if ((i & 24576) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        nyVar2 = nyVar;
        if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x02ff, code lost:
    
        if (defpackage.q10.b(r1.rememberedValue(), java.lang.Integer.valueOf(r5)) == false) goto L173;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavigationBarItem(final RowScope rowScope, final boolean z, final iy iyVar, final my myVar, Modifier modifier, boolean z2, my myVar2, boolean z3, NavigationBarItemColors navigationBarItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        iy iyVar2;
        final Modifier modifier2;
        int i4;
        boolean z4;
        int i5;
        my myVar3;
        int i6;
        boolean z5;
        char c;
        int i7;
        int i8;
        int i9;
        final NavigationBarItemColors navigationBarItemColors2;
        Composer composer2;
        final boolean z6;
        final boolean z7;
        final my myVar4;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        NavigationBarItemColors navigationBarItemColors3;
        int i10;
        MutableInteractionSource mutableInteractionSource3;
        boolean z8;
        boolean z9;
        Modifier modifier3;
        my myVar5;
        int i11;
        NavigationBarItemColors navigationBarItemColors4;
        MutableInteractionSource mutableInteractionSource4;
        my myVar6;
        ComposableLambda composableLambda;
        int i12;
        MutableIntState mutableIntState;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(974293026);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(rowScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(iyVar2) ? Fields.RotationX : Fields.SpotShadowColor;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i14 = i2 & 8;
        if (i14 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.Clip : 8192;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? Fields.RenderEffect : 65536;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    myVar3 = myVar2;
                    i3 |= startRestartGroup.changedInstance(myVar3) ? 1048576 : Fields.BlendMode;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 12582912;
                        z5 = z3;
                    } else {
                        z5 = z3;
                        if ((i & 12582912) == 0) {
                            c = ' ';
                            i3 |= startRestartGroup.changed(z5) ? GroupFlagsKt.IsNodeFlag : 4194304;
                            if ((i & 100663296) == 0) {
                                if ((i2 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(navigationBarItemColors)) {
                                    i13 = GroupFlagsKt.IsRecompositionRequiredFlag;
                                    i3 |= i13;
                                }
                                i13 = GroupFlagsKt.HasAuxSlotFlag;
                                i3 |= i13;
                            }
                            i7 = i2 & Fields.RotationX;
                            if (i7 != 0) {
                                i3 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i8 = i7;
                                i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                i9 = i3;
                                if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i9 & 1)) {
                                    startRestartGroup.skipToGroupEnd();
                                    navigationBarItemColors2 = navigationBarItemColors;
                                    composer2 = startRestartGroup;
                                    z6 = z4;
                                    z7 = z5;
                                    myVar4 = myVar3;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                } else {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i14 != 0) {
                                            modifier2 = Modifier.Companion;
                                        }
                                        if (i4 != 0) {
                                            z4 = true;
                                        }
                                        if (i5 != 0) {
                                            myVar3 = null;
                                        }
                                        if (i6 != 0) {
                                            z5 = true;
                                        }
                                        if ((i2 & Fields.SpotShadowColor) != 0) {
                                            navigationBarItemColors3 = NavigationBarItemDefaults.INSTANCE.colors(startRestartGroup, 6);
                                            i10 = i9 & (-234881025);
                                        } else {
                                            navigationBarItemColors3 = navigationBarItemColors;
                                            i10 = i9;
                                        }
                                        if (i8 != 0) {
                                            z8 = z4;
                                            z9 = z5;
                                            mutableInteractionSource3 = null;
                                        } else {
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            z8 = z4;
                                            z9 = z5;
                                        }
                                        modifier3 = modifier2;
                                        myVar5 = myVar3;
                                        i11 = i10;
                                        navigationBarItemColors4 = navigationBarItemColors3;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i2 & Fields.SpotShadowColor) != 0) {
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            z8 = z4;
                                            z9 = z5;
                                            modifier3 = modifier2;
                                            myVar5 = myVar3;
                                            i11 = i9 & (-234881025);
                                            navigationBarItemColors4 = navigationBarItemColors;
                                        } else {
                                            navigationBarItemColors4 = navigationBarItemColors;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            z8 = z4;
                                            z9 = z5;
                                            modifier3 = modifier2;
                                            myVar5 = myVar3;
                                            i11 = i9;
                                        }
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(974293026, i11, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:205)");
                                    }
                                    if (mutableInteractionSource3 == null) {
                                        startRestartGroup.startReplaceGroup(-224963495);
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                    } else {
                                        startRestartGroup.startReplaceGroup(-7257538);
                                        startRestartGroup.endReplaceGroup();
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                    }
                                    MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.DefaultEffects;
                                    final FiniteAnimationSpec value = MotionSchemeKt.value(motionSchemeKeyTokens, startRestartGroup, 6);
                                    MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                    boolean z10 = z9;
                                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-876637252, true, new NavigationBarKt$NavigationBarItem$styledIcon$1(navigationBarItemColors4, z, z8, value, myVar5, z9, myVar), startRestartGroup, 54);
                                    if (myVar5 == null) {
                                        startRestartGroup.startReplaceGroup(-224036658);
                                        startRestartGroup.endReplaceGroup();
                                        myVar6 = myVar5;
                                        composableLambda = null;
                                    } else {
                                        startRestartGroup.startReplaceGroup(-224036657);
                                        final NavigationBarItemColors navigationBarItemColors5 = navigationBarItemColors4;
                                        final boolean z11 = z8;
                                        final my myVar7 = myVar5;
                                        myVar6 = myVar7;
                                        ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(802208206, true, new my() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1
                                            private static final long invoke$lambda$0(State<Color> state) {
                                                return state.getValue().m4771unboximpl();
                                            }

                                            public final void invoke(Composer composer3, int i15) {
                                                if (!composer3.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(802208206, i15, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:227)");
                                                }
                                                ProvideContentColorTextStyleKt.m2902ProvideContentColorTextStyle3JVO9M(invoke$lambda$0(SingleValueAnimationKt.m100animateColorAsStateeuL9pac(NavigationBarItemColors.this.m2166textColorWaAFU9c$material3(z, z11), value, null, null, composer3, 0, 12)), TypographyKt.getValue(NavigationBarTokens.INSTANCE.getLabelTextFont(), composer3, 6), myVar7, composer3, 0);
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
                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    Composer.Companion companion = Composer.Companion;
                                    if (rememberedValue2 == companion.getEmpty()) {
                                        rememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    MutableIntState mutableIntState2 = (MutableIntState) rememberedValue2;
                                    boolean z12 = z8;
                                    Modifier modifier4 = modifier3;
                                    ComposableLambda composableLambda2 = composableLambda;
                                    Modifier weight$default = RowScope.weight$default(rowScope, SizeKt.m792defaultMinSizeVpY3zN4$default(SelectableKt.m1018selectableO2vRcR0(modifier4, z, mutableInteractionSource5, null, z12, Role.m6821boximpl(Role.Companion.m6835getTabo7Vup1c()), iyVar2), 0.0f, NavigationBarHeight, 1, null), 1.0f, false, 2, null);
                                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == companion.getEmpty()) {
                                        i12 = 0;
                                        rememberedValue3 = new ub0(mutableIntState2, i12);
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    } else {
                                        i12 = 0;
                                    }
                                    Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(weight$default, (ky) rememberedValue3);
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), true);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i12);
                                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, onSizeChanged);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                                    NavigationBarItemColors navigationBarItemColors6 = navigationBarItemColors4;
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
                                    if (m3878constructorimpl.getInserting()) {
                                        mutableIntState = mutableIntState2;
                                    } else {
                                        mutableIntState = mutableIntState2;
                                    }
                                    k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    MutableIntState mutableIntState3 = mutableIntState;
                                    State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, MotionSchemeKt.value(motionSchemeKeyTokens, startRestartGroup, 6), 0.0f, null, null, startRestartGroup, 0, 28);
                                    State<Float> animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6), 0.0f, null, null, startRestartGroup, 0, 28);
                                    Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                    long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits((mutableIntState3.getIntValue() - density.mo361roundToPx0680j_4(NavigationBarVerticalItemTokens.INSTANCE.m3438getActiveIndicatorWidthD9Ej5fM())) / 2.0f) << c) | (4294967295L & Float.floatToRawIntBits(density.mo367toPx0680j_4(IndicatorVerticalOffset))));
                                    boolean changed = startRestartGroup.changed(mutableInteractionSource5) | startRestartGroup.changed(m4508constructorimpl);
                                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (changed || rememberedValue4 == companion.getEmpty()) {
                                        rememberedValue4 = new MappedInteractionSource(mutableInteractionSource5, m4508constructorimpl, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    final MappedInteractionSource mappedInteractionSource = (MappedInteractionSource) rememberedValue4;
                                    ComposableLambda rememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(-2082182507, true, new my() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$indicatorRipple$1
                                        public final void invoke(Composer composer3, int i15) {
                                            if (!composer3.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-2082182507, i15, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:289)");
                                            }
                                            BoxKt.Box(IndicationKt.indication(ClipKt.clip(LayoutIdKt.layoutId(Modifier.Companion, "indicatorRipple"), ShapesKt.getValue(NavigationBarTokens.INSTANCE.getItemActiveIndicatorShape(), composer3, 6)), MappedInteractionSource.this, RippleKt.m2297rippleH2RKhps$default(false, 0.0f, 0L, 7, null)), composer3, 0);
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
                                    ComposableLambda rememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(-799524251, true, new NavigationBarKt$NavigationBarItem$2$indicator$1(animateFloatAsState, navigationBarItemColors6), startRestartGroup, 54);
                                    boolean changed2 = startRestartGroup.changed(animateFloatAsState);
                                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (changed2 || rememberedValue5 == companion.getEmpty()) {
                                        rememberedValue5 = new t6(animateFloatAsState, 8);
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    }
                                    iy iyVar3 = (iy) rememberedValue5;
                                    boolean changed3 = startRestartGroup.changed(animateFloatAsState2);
                                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                                    int i15 = 9;
                                    if (changed3 || rememberedValue6 == companion.getEmpty()) {
                                        rememberedValue6 = new t6(animateFloatAsState2, i15);
                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                    }
                                    NavigationBarItemLayout(rememberComposableLambda3, rememberComposableLambda4, rememberComposableLambda, composableLambda2, z10, iyVar3, (iy) rememberedValue6, startRestartGroup, (57344 & (i11 >> 9)) | 438);
                                    startRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    navigationBarItemColors2 = navigationBarItemColors6;
                                    z7 = z10;
                                    composer2 = startRestartGroup;
                                    modifier2 = modifier4;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    myVar4 = myVar6;
                                    z6 = z12;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.updateScope(new my() { // from class: vb0
                                        @Override // defpackage.my
                                        public final Object invoke(Object obj, Object obj2) {
                                            w01 NavigationBarItem$lambda$16;
                                            int intValue = ((Integer) obj2).intValue();
                                            NavigationBarItem$lambda$16 = NavigationBarKt.NavigationBarItem$lambda$16(RowScope.this, z, iyVar, myVar, modifier2, z6, myVar4, z7, navigationBarItemColors2, mutableInteractionSource2, i, i2, (Composer) obj, intValue);
                                            return NavigationBarItem$lambda$16;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i8 = i7;
                            i9 = i3;
                            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i9 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                    }
                    c = ' ';
                    if ((i & 100663296) == 0) {
                    }
                    i7 = i2 & Fields.RotationX;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    i9 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i9 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                myVar3 = myVar2;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                c = ' ';
                if ((i & 100663296) == 0) {
                }
                i7 = i2 & Fields.RotationX;
                if (i7 != 0) {
                }
                i8 = i7;
                i9 = i3;
                if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i9 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z4 = z2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            myVar3 = myVar2;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            c = ' ';
            if ((i & 100663296) == 0) {
            }
            i7 = i2 & Fields.RotationX;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i3;
            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i9 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z4 = z2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        myVar3 = myVar2;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        c = ' ';
        if ((i & 100663296) == 0) {
        }
        i7 = i2 & Fields.RotationX;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i3;
        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float NavigationBarItem$lambda$15$lambda$12$lambda$11(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float NavigationBarItem$lambda$15$lambda$14$lambda$13(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 NavigationBarItem$lambda$16(RowScope rowScope, boolean z, iy iyVar, my myVar, Modifier modifier, boolean z2, my myVar2, boolean z3, NavigationBarItemColors navigationBarItemColors, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        NavigationBarItem(rowScope, z, iyVar, myVar, modifier, z2, myVar2, z3, navigationBarItemColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 NavigationBarItem$lambda$8$lambda$7(MutableIntState mutableIntState, IntSize intSize) {
        mutableIntState.setIntValue((int) (intSize.m7786unboximpl() >> 32));
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0135, code lost:
    
        if (defpackage.q10.b(r8.rememberedValue(), java.lang.Integer.valueOf(r12)) == false) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void NavigationBarItemLayout(my myVar, my myVar2, my myVar3, final my myVar4, final boolean z, iy iyVar, final iy iyVar2, Composer composer, int i) {
        int i2;
        int i3;
        ?? r12;
        Composer startRestartGroup = composer.startRestartGroup(-1019541078);
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
            i2 |= startRestartGroup.changedInstance(myVar4) ? 2048 : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(z) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar2) ? 1048576 : Fields.BlendMode;
        }
        if (startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1019541078, i2, -1, "androidx.compose.material3.NavigationBarItemLayout (NavigationBar.kt:553)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier badgeBounds = BadgeKt.badgeBounds(companion);
            int i4 = 57344 & i2;
            boolean z2 = (((i2 & 7168) == 2048) | ((3670016 & i2) == 1048576) ? 1 : 0) | (i4 == 16384);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItemLayout$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        float f;
                        Measurable measurable;
                        Placeable placeable;
                        MeasureResult m2173placeLabelAndIconzUg2_y0;
                        MeasureResult m2172placeIconX9ElhV4;
                        MeasureScope measureScope2 = measureScope;
                        float floatValue = ((Number) iy.this.invoke()).floatValue();
                        float f2 = floatValue < 0.0f ? 0.0f : floatValue;
                        long m7554copyZbe2FdA$default = Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        int size = list.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Measurable measurable2 = list.get(i5);
                            if (q10.b(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                                Placeable mo6234measureBRTryo0 = measurable2.mo6234measureBRTryo0(m7554copyZbe2FdA$default);
                                int width = mo6234measureBRTryo0.getWidth();
                                f = NavigationBarKt.IndicatorHorizontalPadding;
                                int mo361roundToPx0680j_4 = measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl(f * 2.0f)) + width;
                                int P = y80.P(mo361roundToPx0680j_4 * f2);
                                int mo361roundToPx0680j_42 = measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl(NavigationBarKt.getIndicatorVerticalPadding() * 2.0f)) + mo6234measureBRTryo0.getHeight();
                                int size2 = list.size();
                                int i6 = 0;
                                while (i6 < size2) {
                                    Measurable measurable3 = list.get(i6);
                                    if (q10.b(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                        Placeable mo6234measureBRTryo02 = measurable3.mo6234measureBRTryo0(Constraints.Companion.m7574fixedJhjzzOo(mo361roundToPx0680j_4, mo361roundToPx0680j_42));
                                        int size3 = list.size();
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= size3) {
                                                measurable = null;
                                                break;
                                            }
                                            measurable = list.get(i7);
                                            if (q10.b(LayoutIdKt.getLayoutId(measurable), "indicator")) {
                                                break;
                                            }
                                            i7++;
                                        }
                                        Measurable measurable4 = measurable;
                                        Placeable mo6234measureBRTryo03 = measurable4 != null ? measurable4.mo6234measureBRTryo0(Constraints.Companion.m7574fixedJhjzzOo(P, mo361roundToPx0680j_42)) : null;
                                        if (myVar4 != null) {
                                            int size4 = list.size();
                                            for (int i8 = 0; i8 < size4; i8++) {
                                                Measurable measurable5 = list.get(i8);
                                                if (q10.b(LayoutIdKt.getLayoutId(measurable5), "label")) {
                                                    placeable = measurable5.mo6234measureBRTryo0(m7554copyZbe2FdA$default);
                                                }
                                            }
                                            throw k4.m("Collection contains no element matching the predicate.");
                                        }
                                        placeable = null;
                                        if (myVar4 == null) {
                                            m2172placeIconX9ElhV4 = NavigationBarKt.m2172placeIconX9ElhV4(measureScope2, mo6234measureBRTryo0, mo6234measureBRTryo02, mo6234measureBRTryo03, j);
                                            return m2172placeIconX9ElhV4;
                                        }
                                        placeable.getClass();
                                        m2173placeLabelAndIconzUg2_y0 = NavigationBarKt.m2173placeLabelAndIconzUg2_y0(measureScope, placeable, mo6234measureBRTryo0, mo6234measureBRTryo02, mo6234measureBRTryo03, j, z, f2);
                                        return m2173placeLabelAndIconzUg2_y0;
                                    }
                                    i6++;
                                    measureScope2 = measureScope;
                                }
                                throw k4.m("Collection contains no element matching the predicate.");
                            }
                            i5++;
                            measureScope2 = measureScope;
                        }
                        throw k4.m("Collection contains no element matching the predicate.");
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
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
            my b = k4.b(companion2, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting()) {
                i3 = i2;
            } else {
                i3 = i2;
            }
            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
            myVar.invoke(startRestartGroup, Integer.valueOf(i3 & 14));
            myVar2.invoke(startRestartGroup, Integer.valueOf((i3 >> 3) & 14));
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
            myVar3.invoke(startRestartGroup, Integer.valueOf((i3 >> 6) & 14));
            startRestartGroup.endNode();
            if (myVar4 != null) {
                startRestartGroup.startReplaceGroup(-660471321);
                Modifier layoutId2 = LayoutIdKt.layoutId(companion, LabelLayoutIdTag);
                boolean z3 = (i4 == 16384) | ((i3 & 458752) == 131072);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    r12 = 0;
                    rememberedValue2 = new qb0(0 == true ? 1 : 0, z, iyVar);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                } else {
                    r12 = 0;
                }
                Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(layoutId2, (ky) rememberedValue2);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), r12);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, r12);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, graphicsLayer);
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
                kf0.f(myVar4, startRestartGroup, (i3 >> 9) & 14);
            } else {
                startRestartGroup.startReplaceGroup(-660200319);
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
            endRestartGroup.updateScope(new rb0(myVar, myVar2, myVar3, myVar4, z, iyVar, iyVar2, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 NavigationBarItemLayout$lambda$22$lambda$20$lambda$19(boolean z, iy iyVar, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(z ? 1.0f : ((Number) iyVar.invoke()).floatValue());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 NavigationBarItemLayout$lambda$23(my myVar, my myVar2, my myVar3, my myVar4, boolean z, iy iyVar, iy iyVar2, int i, Composer composer, int i2) {
        NavigationBarItemLayout(myVar, myVar2, myVar3, myVar4, z, iyVar, iyVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 NavigationBar_HsRjFd4$lambda$1(Modifier modifier, long j, long j2, float f, WindowInsets windowInsets, ny nyVar, int i, int i2, Composer composer, int i3) {
        m2169NavigationBarHsRjFd4(modifier, j, j2, f, windowInsets, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    public static final float getIndicatorVerticalPadding() {
        return IndicatorVerticalPadding;
    }

    public static final ProvidableCompositionLocal<NavigationBarOverride> getLocalNavigationBarOverride() {
        return LocalNavigationBarOverride;
    }

    public static final float getNavigationBarIndicatorToLabelPadding() {
        return NavigationBarIndicatorToLabelPadding;
    }

    public static final float getNavigationBarItemHorizontalPadding() {
        return NavigationBarItemHorizontalPadding;
    }

    public static final float getNavigationBarItemToIconMinimumPadding() {
        return NavigationBarItemToIconMinimumPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m2172placeIconX9ElhV4(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, long j) {
        int m7564getMaxWidthimpl;
        if (Constraints.m7564getMaxWidthimpl(j) == Integer.MAX_VALUE) {
            m7564getMaxWidthimpl = (measureScope.mo361roundToPx0680j_4(NavigationBarItemToIconMinimumPadding) * 2) + placeable.getWidth();
        } else {
            m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
        }
        int i = m7564getMaxWidthimpl;
        int m7580constrainHeightK40F9xA = ConstraintsKt.m7580constrainHeightK40F9xA(j, measureScope.mo361roundToPx0680j_4(NavigationBarHeight));
        return MeasureScope.layout$default(measureScope, i, m7580constrainHeightK40F9xA, null, new wb0(placeable3, placeable, j50.p(i, 2, placeable), j50.c(m7580constrainHeightK40F9xA, 2, placeable), placeable2, j50.p(i, 2, placeable2), j50.c(m7580constrainHeightK40F9xA, 2, placeable2), i, m7580constrainHeightK40F9xA, 0), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 placeIcon_X9ElhV4$lambda$25(Placeable placeable, Placeable placeable2, int i, int i2, Placeable placeable3, int i3, int i4, int i5, int i6, Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, j50.p(i5, 2, placeable), j50.c(i6, 2, placeable), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i, i2, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i3, i4, 0.0f, 4, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-zUg2_y0, reason: not valid java name */
    public static final MeasureResult m2173placeLabelAndIconzUg2_y0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j, boolean z, float f) {
        float height = placeable2.getHeight();
        float f2 = IndicatorVerticalPadding;
        float mo367toPx0680j_4 = measureScope.mo367toPx0680j_4(f2) + height;
        float f3 = NavigationBarIndicatorToLabelPadding;
        float mo367toPx0680j_42 = measureScope.mo367toPx0680j_4(f3) + mo367toPx0680j_4 + placeable.getHeight();
        float m7565getMinHeightimpl = (Constraints.m7565getMinHeightimpl(j) - mo367toPx0680j_42) / 2.0f;
        float mo367toPx0680j_43 = measureScope.mo367toPx0680j_4(f2);
        float f4 = m7565getMinHeightimpl < mo367toPx0680j_43 ? mo367toPx0680j_43 : m7565getMinHeightimpl;
        float f5 = (f4 * 2.0f) + mo367toPx0680j_42;
        float height2 = (1.0f - f) * ((z ? f4 : (f5 - placeable2.getHeight()) / 2.0f) - f4);
        float mo367toPx0680j_44 = measureScope.mo367toPx0680j_4(f3) + measureScope.mo367toPx0680j_4(f2) + placeable2.getHeight() + f4;
        int mo361roundToPx0680j_4 = Constraints.m7564getMaxWidthimpl(j) == Integer.MAX_VALUE ? (measureScope.mo361roundToPx0680j_4(NavigationBarItemToIconMinimumPadding) * 2) + placeable2.getWidth() : Constraints.m7564getMaxWidthimpl(j);
        return MeasureScope.layout$default(measureScope, mo361roundToPx0680j_4, y80.P(f5), null, new sb0(placeable4, z, f, placeable, j50.p(mo361roundToPx0680j_4, 2, placeable), mo367toPx0680j_44, height2, placeable2, j50.p(mo361roundToPx0680j_4, 2, placeable2), f4, placeable3, j50.p(mo361roundToPx0680j_4, 2, placeable3), f4 - measureScope.mo367toPx0680j_4(f2), mo361roundToPx0680j_4, measureScope, 0), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 placeLabelAndIcon_zUg2_y0$lambda$27(Placeable placeable, boolean z, float f, Placeable placeable2, int i, float f2, float f3, Placeable placeable3, int i2, float f4, Placeable placeable4, int i3, float f5, int i4, MeasureScope measureScope, Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, j50.p(i4, 2, placeable), y80.P((f4 - measureScope.mo361roundToPx0680j_4(IndicatorVerticalPadding)) + f3), 0.0f, 4, null);
        }
        if (z || f != 0.0f) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i, y80.P(f2 + f3), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i2, y80.P(f4 + f3), 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i3, y80.P(f5 + f3), 0.0f, 4, null);
        return w01.a;
    }
}
