package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.NavigationRailKt;
import androidx.compose.material3.internal.MappedInteractionSource;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.NavigationRailBaselineItemTokens;
import androidx.compose.material3.tokens.NavigationRailCollapsedTokens;
import androidx.compose.material3.tokens.NavigationRailVerticalItemTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
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
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
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
import defpackage.w01;
import defpackage.wb0;
import defpackage.y80;
import defpackage.yd;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationRailKt {
    private static final String IconLayoutIdTag = "icon";
    private static final float IndicatorHorizontalPadding;
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalPaddingNoLabel;
    private static final float IndicatorVerticalPaddingWithLabel;
    private static final String LabelLayoutIdTag = "label";
    private static final ProvidableCompositionLocal<NavigationRailOverride> LocalNavigationRailOverride;
    private static final float NavigationRailItemHeight;
    private static final float NavigationRailItemVerticalPadding;
    private static final float NavigationRailVerticalPadding = Dp.m7611constructorimpl(4.0f);
    private static final float NavigationRailHeaderPadding = Dp.m7611constructorimpl(8.0f);
    private static final float NavigationRailItemWidth = NavigationRailCollapsedTokens.INSTANCE.m3457getNarrowContainerWidthD9Ej5fM();

    static {
        NavigationRailVerticalItemTokens navigationRailVerticalItemTokens = NavigationRailVerticalItemTokens.INSTANCE;
        NavigationRailItemHeight = navigationRailVerticalItemTokens.m3470getActiveIndicatorWidthD9Ej5fM();
        NavigationRailItemVerticalPadding = Dp.m7611constructorimpl(4.0f);
        float m3470getActiveIndicatorWidthD9Ej5fM = navigationRailVerticalItemTokens.m3470getActiveIndicatorWidthD9Ej5fM();
        NavigationRailBaselineItemTokens navigationRailBaselineItemTokens = NavigationRailBaselineItemTokens.INSTANCE;
        IndicatorHorizontalPadding = Dp.m7611constructorimpl(Dp.m7611constructorimpl(m3470getActiveIndicatorWidthD9Ej5fM - navigationRailBaselineItemTokens.m3453getIconSizeD9Ej5fM()) / 2.0f);
        IndicatorVerticalPaddingWithLabel = Dp.m7611constructorimpl(Dp.m7611constructorimpl(navigationRailVerticalItemTokens.m3469getActiveIndicatorHeightD9Ej5fM() - navigationRailBaselineItemTokens.m3453getIconSizeD9Ej5fM()) / 2.0f);
        IndicatorVerticalPaddingNoLabel = Dp.m7611constructorimpl(Dp.m7611constructorimpl(navigationRailVerticalItemTokens.m3470getActiveIndicatorWidthD9Ej5fM() - navigationRailBaselineItemTokens.m3453getIconSizeD9Ej5fM()) / 2.0f);
        LocalNavigationRailOverride = CompositionLocalKt.compositionLocalOf$default(null, new ms(18), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0093  */
    /* renamed from: NavigationRail-qi6gXK8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2233NavigationRailqi6gXK8(Modifier modifier, long j, long j2, ny nyVar, WindowInsets windowInsets, final ny nyVar2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        ny nyVar3;
        WindowInsets windowInsets2;
        ny nyVar4;
        Modifier modifier3;
        final long j5;
        final long j6;
        final ny nyVar5;
        final WindowInsets windowInsets3;
        ScopeUpdateScope endRestartGroup;
        WindowInsets windowInsets4;
        long j7;
        long j8;
        ny nyVar6;
        int i4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(331386280);
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
            nyVar3 = nyVar;
            i3 |= startRestartGroup.changedInstance(nyVar3) ? Fields.CameraDistance : Fields.RotationZ;
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
                nyVar4 = nyVar2;
                i3 |= startRestartGroup.changedInstance(nyVar4) ? Fields.RenderEffect : 65536;
                if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i7 != 0 ? Modifier.Companion : modifier2;
                        if ((i2 & 2) != 0) {
                            j3 = NavigationRailDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            j4 = ColorSchemeKt.m1797contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                        }
                        if (i8 != 0) {
                            nyVar3 = null;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            modifier3 = modifier4;
                            windowInsets4 = NavigationRailDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                            j7 = j3;
                            j8 = j4;
                            nyVar6 = nyVar3;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(331386280, i3, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:126)");
                            }
                            ((NavigationRailOverride) startRestartGroup.consume(LocalNavigationRailOverride)).NavigationRail(new NavigationRailOverrideScope(modifier3, j7, j8, nyVar6, windowInsets4, nyVar4, null), startRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            j5 = j7;
                            j6 = j8;
                            nyVar5 = nyVar6;
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
                    nyVar6 = nyVar3;
                    windowInsets4 = windowInsets2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ((NavigationRailOverride) startRestartGroup.consume(LocalNavigationRailOverride)).NavigationRail(new NavigationRailOverrideScope(modifier3, j7, j8, nyVar6, windowInsets4, nyVar4, null), startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    j5 = j7;
                    j6 = j8;
                    nyVar5 = nyVar6;
                    windowInsets3 = windowInsets4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    j5 = j3;
                    j6 = j4;
                    nyVar5 = nyVar3;
                    windowInsets3 = windowInsets2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier5 = modifier3;
                    endRestartGroup.updateScope(new my() { // from class: mc0
                        @Override // defpackage.my
                        public final Object invoke(Object obj, Object obj2) {
                            w01 NavigationRail_qi6gXK8$lambda$1;
                            int intValue = ((Integer) obj2).intValue();
                            NavigationRail_qi6gXK8$lambda$1 = NavigationRailKt.NavigationRail_qi6gXK8$lambda$1(Modifier.this, j5, j6, nyVar5, windowInsets3, nyVar2, i, i2, (Composer) obj, intValue);
                            return NavigationRail_qi6gXK8$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            nyVar4 = nyVar2;
            if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        nyVar3 = nyVar;
        if ((i & 24576) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        nyVar4 = nyVar2;
        if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0287, code lost:
    
        if (defpackage.q10.b(r0.rememberedValue(), java.lang.Integer.valueOf(r7)) == false) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavigationRailItem(final boolean z, iy iyVar, my myVar, Modifier modifier, boolean z2, my myVar2, boolean z3, NavigationRailItemColors navigationRailItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        iy iyVar2;
        my myVar3;
        Modifier modifier2;
        int i4;
        boolean z4;
        int i5;
        my myVar4;
        int i6;
        boolean z5;
        char c;
        int i7;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        boolean z6;
        Composer composer2;
        boolean z7;
        my myVar5;
        NavigationRailItemColors navigationRailItemColors2;
        ScopeUpdateScope endRestartGroup;
        NavigationRailItemColors navigationRailItemColors3;
        MutableInteractionSource mutableInteractionSource3;
        NavigationRailItemColors navigationRailItemColors4;
        boolean z8;
        boolean z9;
        my myVar6;
        MutableInteractionSource mutableInteractionSource4;
        my myVar7;
        ComposableLambda composableLambda;
        Composer m3878constructorimpl;
        NavigationRailItemColors navigationRailItemColors5;
        boolean changed;
        Object rememberedValue;
        final Shape value;
        boolean changed2;
        Object rememberedValue2;
        boolean changed3;
        Object rememberedValue3;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1620317701);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(iyVar2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            myVar3 = myVar;
        } else {
            myVar3 = myVar;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(myVar3) ? Fields.RotationX : Fields.SpotShadowColor;
            }
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? Fields.Clip : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    myVar4 = myVar2;
                    i3 |= startRestartGroup.changedInstance(myVar4) ? Fields.RenderEffect : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        z5 = z3;
                    } else {
                        z5 = z3;
                        if ((i & 1572864) == 0) {
                            c = ' ';
                            i3 |= startRestartGroup.changed(z5) ? 1048576 : Fields.BlendMode;
                            if ((i & 12582912) == 0) {
                                if ((i2 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(navigationRailItemColors)) {
                                    i9 = GroupFlagsKt.IsNodeFlag;
                                    i3 |= i9;
                                }
                                i9 = 4194304;
                                i3 |= i9;
                            }
                            i7 = i2 & Fields.RotationX;
                            if (i7 != 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i8 = i7;
                                i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                                if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                                    startRestartGroup.skipToGroupEnd();
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    z6 = z4;
                                    composer2 = startRestartGroup;
                                    z7 = z5;
                                    myVar5 = myVar4;
                                    navigationRailItemColors2 = navigationRailItemColors;
                                } else {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i10 != 0) {
                                            modifier2 = Modifier.Companion;
                                        }
                                        if (i4 != 0) {
                                            z4 = true;
                                        }
                                        if (i5 != 0) {
                                            myVar4 = null;
                                        }
                                        if (i6 != 0) {
                                            z5 = true;
                                        }
                                        if ((i2 & Fields.SpotShadowColor) != 0) {
                                            navigationRailItemColors3 = NavigationRailItemDefaults.INSTANCE.colors(startRestartGroup, 6);
                                            i3 &= -29360129;
                                        } else {
                                            navigationRailItemColors3 = navigationRailItemColors;
                                        }
                                        if (i8 != 0) {
                                            navigationRailItemColors4 = navigationRailItemColors3;
                                            z8 = z4;
                                            z9 = z5;
                                            myVar6 = myVar4;
                                            mutableInteractionSource3 = null;
                                            int i11 = i3;
                                            Modifier modifier3 = modifier2;
                                            startRestartGroup.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1620317701, i11, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:209)");
                                            }
                                            if (mutableInteractionSource3 != null) {
                                                startRestartGroup.startReplaceGroup(253288608);
                                                Object rememberedValue4 = startRestartGroup.rememberedValue();
                                                if (rememberedValue4 == Composer.Companion.getEmpty()) {
                                                    rememberedValue4 = InteractionSourceKt.MutableInteractionSource();
                                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                mutableInteractionSource4 = (MutableInteractionSource) rememberedValue4;
                                            } else {
                                                startRestartGroup.startReplaceGroup(1947832599);
                                                startRestartGroup.endReplaceGroup();
                                                mutableInteractionSource4 = mutableInteractionSource3;
                                            }
                                            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.DefaultEffects;
                                            final FiniteAnimationSpec value2 = MotionSchemeKt.value(motionSchemeKeyTokens, startRestartGroup, 6);
                                            boolean z10 = z9;
                                            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(206057749, true, new NavigationRailKt$NavigationRailItem$styledIcon$1(navigationRailItemColors4, z, z8, value2, myVar6, z9, myVar3), startRestartGroup, 54);
                                            if (myVar6 != null) {
                                                startRestartGroup.startReplaceGroup(254215848);
                                                startRestartGroup.endReplaceGroup();
                                                myVar7 = myVar6;
                                                composableLambda = null;
                                            } else {
                                                startRestartGroup.startReplaceGroup(254215849);
                                                final NavigationRailItemColors navigationRailItemColors6 = navigationRailItemColors4;
                                                final boolean z11 = z8;
                                                final my myVar8 = myVar6;
                                                myVar7 = myVar8;
                                                ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-2056532825, true, new my() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                                    private static final long invoke$lambda$0(State<Color> state) {
                                                        return state.getValue().m4771unboximpl();
                                                    }

                                                    public final void invoke(Composer composer3, int i12) {
                                                        if (!composer3.shouldExecute((i12 & 3) != 2, i12 & 1)) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-2056532825, i12, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:231)");
                                                        }
                                                        ProvideContentColorTextStyleKt.m2902ProvideContentColorTextStyle3JVO9M(invoke$lambda$0(SingleValueAnimationKt.m100animateColorAsStateeuL9pac(NavigationRailItemColors.this.m2230textColorWaAFU9c$material3(z, z11), value2, null, null, composer3, 0, 12)), TypographyKt.getValue(NavigationRailVerticalItemTokens.INSTANCE.getLabelTextFont(), composer3, 6), myVar8, composer3, 0);
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
                                            boolean z12 = z8;
                                            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                            Modifier m814widthInVpY3zN4$default = SizeKt.m814widthInVpY3zN4$default(SizeKt.m792defaultMinSizeVpY3zN4$default(SelectableKt.m1018selectableO2vRcR0(modifier3, z, mutableInteractionSource5, null, z12, Role.m6821boximpl(Role.Companion.m6835getTabo7Vup1c()), iyVar2), 0.0f, NavigationRailItemHeight, 1, null), NavigationRailItemWidth, 0.0f, 2, null);
                                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), true);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m814widthInVpY3zN4$default);
                                            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                                            iy constructor = companion.getConstructor();
                                            if (startRestartGroup.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            startRestartGroup.startReusableNode();
                                            if (startRestartGroup.getInserting()) {
                                                startRestartGroup.useNode();
                                            } else {
                                                startRestartGroup.createNode(constructor);
                                            }
                                            m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
                                            my b = k4.b(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                            if (m3878constructorimpl.getInserting()) {
                                                navigationRailItemColors5 = navigationRailItemColors4;
                                            } else {
                                                navigationRailItemColors5 = navigationRailItemColors4;
                                            }
                                            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            float f = !z ? 1.0f : 0.0f;
                                            FiniteAnimationSpec value3 = MotionSchemeKt.value(motionSchemeKeyTokens, startRestartGroup, 6);
                                            NavigationRailItemColors navigationRailItemColors7 = navigationRailItemColors5;
                                            State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, value3, 0.0f, null, null, startRestartGroup, 0, 28);
                                            State<Float> animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(!z ? 1.0f : 0.0f, MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6), 0.0f, null, null, startRestartGroup, 0, 28);
                                            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                            long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits((density.mo361roundToPx0680j_4(r4) - density.mo361roundToPx0680j_4(NavigationRailVerticalItemTokens.INSTANCE.m3470getActiveIndicatorWidthD9Ej5fM())) / 2.0f) << c) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
                                            changed = startRestartGroup.changed(mutableInteractionSource5) | startRestartGroup.changed(m4508constructorimpl);
                                            rememberedValue = startRestartGroup.rememberedValue();
                                            if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                                                rememberedValue = new MappedInteractionSource(mutableInteractionSource5, m4508constructorimpl, null);
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            final MappedInteractionSource mappedInteractionSource = (MappedInteractionSource) rememberedValue;
                                            if (myVar7 == null) {
                                                startRestartGroup.startReplaceGroup(-1825624334);
                                                value = ShapesKt.getValue(NavigationRailBaselineItemTokens.INSTANCE.getActiveIndicatorShape(), startRestartGroup, 6);
                                                startRestartGroup.endReplaceGroup();
                                            } else {
                                                startRestartGroup.startReplaceGroup(-1825528978);
                                                value = ShapesKt.getValue(ShapeKeyTokens.CornerFull, startRestartGroup, 6);
                                                startRestartGroup.endReplaceGroup();
                                            }
                                            ComposableLambda rememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(455696046, true, new my() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$1$indicatorRipple$1
                                                public final void invoke(Composer composer3, int i12) {
                                                    if (!composer3.shouldExecute((i12 & 3) != 2, i12 & 1)) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(455696046, i12, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:298)");
                                                    }
                                                    BoxKt.Box(IndicationKt.indication(ClipKt.clip(LayoutIdKt.layoutId(Modifier.Companion, "indicatorRipple"), Shape.this), mappedInteractionSource, RippleKt.m2297rippleH2RKhps$default(false, 0.0f, 0L, 7, null)), composer3, 0);
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
                                            ComposableLambda rememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(2137606782, true, new NavigationRailKt$NavigationRailItem$1$indicator$1(animateFloatAsState, navigationRailItemColors7, value), startRestartGroup, 54);
                                            changed2 = startRestartGroup.changed(animateFloatAsState);
                                            rememberedValue2 = startRestartGroup.rememberedValue();
                                            if (!changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                                rememberedValue2 = new t6(animateFloatAsState, 13);
                                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                            }
                                            iy iyVar3 = (iy) rememberedValue2;
                                            changed3 = startRestartGroup.changed(animateFloatAsState2);
                                            rememberedValue3 = startRestartGroup.rememberedValue();
                                            if (!changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                                                rememberedValue3 = new t6(animateFloatAsState2, 14);
                                                startRestartGroup.updateRememberedValue(rememberedValue3);
                                            }
                                            NavigationRailItemLayout(rememberComposableLambda3, rememberComposableLambda4, rememberComposableLambda, composableLambda, z10, iyVar3, (iy) rememberedValue3, startRestartGroup, (57344 & (i11 >> 6)) | 438);
                                            startRestartGroup.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            navigationRailItemColors2 = navigationRailItemColors7;
                                            composer2 = startRestartGroup;
                                            z7 = z10;
                                            z6 = z12;
                                            modifier2 = modifier3;
                                            mutableInteractionSource2 = mutableInteractionSource3;
                                            myVar5 = myVar7;
                                        } else {
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            navigationRailItemColors4 = navigationRailItemColors3;
                                        }
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i2 & Fields.SpotShadowColor) != 0) {
                                            i3 &= -29360129;
                                        }
                                        navigationRailItemColors4 = navigationRailItemColors;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                    }
                                    z8 = z4;
                                    z9 = z5;
                                    myVar6 = myVar4;
                                    int i112 = i3;
                                    Modifier modifier32 = modifier2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (mutableInteractionSource3 != null) {
                                    }
                                    MotionSchemeKeyTokens motionSchemeKeyTokens2 = MotionSchemeKeyTokens.DefaultEffects;
                                    final FiniteAnimationSpec<Color> value22 = MotionSchemeKt.value(motionSchemeKeyTokens2, startRestartGroup, 6);
                                    boolean z102 = z9;
                                    ComposableLambda rememberComposableLambda5 = ComposableLambdaKt.rememberComposableLambda(206057749, true, new NavigationRailKt$NavigationRailItem$styledIcon$1(navigationRailItemColors4, z, z8, value22, myVar6, z9, myVar3), startRestartGroup, 54);
                                    if (myVar6 != null) {
                                    }
                                    boolean z122 = z8;
                                    MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource4;
                                    Modifier m814widthInVpY3zN4$default2 = SizeKt.m814widthInVpY3zN4$default(SizeKt.m792defaultMinSizeVpY3zN4$default(SelectableKt.m1018selectableO2vRcR0(modifier32, z, mutableInteractionSource52, null, z122, Role.m6821boximpl(Role.Companion.m6835getTabo7Vup1c()), iyVar2), 0.0f, NavigationRailItemHeight, 1, null), NavigationRailItemWidth, 0.0f, 2, null);
                                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), true);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m814widthInVpY3zN4$default2);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                                    iy constructor2 = companion2.getConstructor();
                                    if (startRestartGroup.getApplier() == null) {
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                    }
                                    m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
                                    my b2 = k4.b(companion2, m3878constructorimpl, maybeCachedBoxMeasurePolicy2, m3878constructorimpl, currentCompositionLocalMap2);
                                    if (m3878constructorimpl.getInserting()) {
                                    }
                                    k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl, currentCompositeKeyHash2);
                                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier2, companion2.getSetModifier());
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    if (!z) {
                                    }
                                    FiniteAnimationSpec value32 = MotionSchemeKt.value(motionSchemeKeyTokens2, startRestartGroup, 6);
                                    NavigationRailItemColors navigationRailItemColors72 = navigationRailItemColors5;
                                    State<Float> animateFloatAsState3 = AnimateAsStateKt.animateFloatAsState(f, value32, 0.0f, null, null, startRestartGroup, 0, 28);
                                    State<Float> animateFloatAsState22 = AnimateAsStateKt.animateFloatAsState(!z ? 1.0f : 0.0f, MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6), 0.0f, null, null, startRestartGroup, 0, 28);
                                    Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                    long m4508constructorimpl2 = Offset.m4508constructorimpl((Float.floatToRawIntBits((density2.mo361roundToPx0680j_4(r4) - density2.mo361roundToPx0680j_4(NavigationRailVerticalItemTokens.INSTANCE.m3470getActiveIndicatorWidthD9Ej5fM())) / 2.0f) << c) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
                                    changed = startRestartGroup.changed(mutableInteractionSource52) | startRestartGroup.changed(m4508constructorimpl2);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed) {
                                    }
                                    rememberedValue = new MappedInteractionSource(mutableInteractionSource52, m4508constructorimpl2, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                    final MappedInteractionSource mappedInteractionSource2 = (MappedInteractionSource) rememberedValue;
                                    if (myVar7 == null) {
                                    }
                                    ComposableLambda rememberComposableLambda32 = ComposableLambdaKt.rememberComposableLambda(455696046, true, new my() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$1$indicatorRipple$1
                                        public final void invoke(Composer composer3, int i12) {
                                            if (!composer3.shouldExecute((i12 & 3) != 2, i12 & 1)) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(455696046, i12, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:298)");
                                            }
                                            BoxKt.Box(IndicationKt.indication(ClipKt.clip(LayoutIdKt.layoutId(Modifier.Companion, "indicatorRipple"), Shape.this), mappedInteractionSource2, RippleKt.m2297rippleH2RKhps$default(false, 0.0f, 0L, 7, null)), composer3, 0);
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
                                    ComposableLambda rememberComposableLambda42 = ComposableLambdaKt.rememberComposableLambda(2137606782, true, new NavigationRailKt$NavigationRailItem$1$indicator$1(animateFloatAsState3, navigationRailItemColors72, value), startRestartGroup, 54);
                                    changed2 = startRestartGroup.changed(animateFloatAsState3);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (!changed2) {
                                    }
                                    rememberedValue2 = new t6(animateFloatAsState3, 13);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                    iy iyVar32 = (iy) rememberedValue2;
                                    changed3 = startRestartGroup.changed(animateFloatAsState22);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (!changed3) {
                                    }
                                    rememberedValue3 = new t6(animateFloatAsState22, 14);
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                    NavigationRailItemLayout(rememberComposableLambda32, rememberComposableLambda42, rememberComposableLambda5, composableLambda, z102, iyVar32, (iy) rememberedValue3, startRestartGroup, (57344 & (i112 >> 6)) | 438);
                                    startRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    navigationRailItemColors2 = navigationRailItemColors72;
                                    composer2 = startRestartGroup;
                                    z7 = z102;
                                    z6 = z122;
                                    modifier2 = modifier32;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    myVar5 = myVar7;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.updateScope(new yd(z, iyVar, myVar, modifier2, z6, myVar5, z7, navigationRailItemColors2, mutableInteractionSource2, i, i2));
                                    return;
                                }
                                return;
                            }
                            i8 = i7;
                            if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                    }
                    c = ' ';
                    if ((i & 12582912) == 0) {
                    }
                    i7 = i2 & Fields.RotationX;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                myVar4 = myVar2;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                c = ' ';
                if ((i & 12582912) == 0) {
                }
                i7 = i2 & Fields.RotationX;
                if (i7 != 0) {
                }
                i8 = i7;
                if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z4 = z2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            myVar4 = myVar2;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            c = ' ';
            if ((i & 12582912) == 0) {
            }
            i7 = i2 & Fields.RotationX;
            if (i7 != 0) {
            }
            i8 = i7;
            if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
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
        myVar4 = myVar2;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        c = ' ';
        if ((i & 12582912) == 0) {
        }
        i7 = i2 & Fields.RotationX;
        if (i7 != 0) {
        }
        i8 = i7;
        if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float NavigationRailItem$lambda$10$lambda$7$lambda$6(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float NavigationRailItem$lambda$10$lambda$9$lambda$8(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 NavigationRailItem$lambda$11(boolean z, iy iyVar, my myVar, Modifier modifier, boolean z2, my myVar2, boolean z3, NavigationRailItemColors navigationRailItemColors, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        NavigationRailItem(z, iyVar, myVar, modifier, z2, myVar2, z3, navigationRailItemColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x012f, code lost:
    
        if (defpackage.q10.b(r8.rememberedValue(), java.lang.Integer.valueOf(r12)) == false) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void NavigationRailItemLayout(my myVar, my myVar2, my myVar3, final my myVar4, final boolean z, iy iyVar, final iy iyVar2, Composer composer, int i) {
        int i2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-759267492);
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
                ComposerKt.traceEventStart(-759267492, i2, -1, "androidx.compose.material3.NavigationRailItemLayout (NavigationRail.kt:557)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier badgeBounds = BadgeKt.badgeBounds(companion);
            int i4 = 57344 & i2;
            boolean z2 = ((i2 & 7168) == 2048) | ((3670016 & i2) == 1048576) | (i4 == 16384);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItemLayout$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        float f;
                        Measurable measurable;
                        Placeable placeable;
                        MeasureResult m2237placeLabelAndIconzUg2_y0;
                        MeasureResult m2236placeIconX9ElhV4;
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
                                f = NavigationRailKt.IndicatorHorizontalPadding;
                                int mo361roundToPx0680j_4 = measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl(f * 2.0f)) + width;
                                int P = y80.P(mo361roundToPx0680j_4 * f2);
                                int mo361roundToPx0680j_42 = measureScope2.mo361roundToPx0680j_4(Dp.m7611constructorimpl((myVar4 == null ? NavigationRailKt.IndicatorVerticalPaddingNoLabel : NavigationRailKt.IndicatorVerticalPaddingWithLabel) * 2.0f)) + mo6234measureBRTryo0.getHeight();
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
                                            m2236placeIconX9ElhV4 = NavigationRailKt.m2236placeIconX9ElhV4(measureScope2, mo6234measureBRTryo0, mo6234measureBRTryo02, mo6234measureBRTryo03, j);
                                            return m2236placeIconX9ElhV4;
                                        }
                                        placeable.getClass();
                                        m2237placeLabelAndIconzUg2_y0 = NavigationRailKt.m2237placeLabelAndIconzUg2_y0(measureScope, placeable, mo6234measureBRTryo0, mo6234measureBRTryo02, mo6234measureBRTryo03, j, z, f2);
                                        return m2237placeLabelAndIconzUg2_y0;
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
                startRestartGroup.startReplaceGroup(773116085);
                Modifier layoutId2 = LayoutIdKt.layoutId(companion, LabelLayoutIdTag);
                boolean z3 = ((i3 & 458752) == 131072) | (i4 == 16384);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new qb0(1, z, iyVar);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(layoutId2, (ky) rememberedValue2);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
                startRestartGroup.startReplaceGroup(773387087);
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
            endRestartGroup.updateScope(new rb0(myVar, myVar2, myVar3, myVar4, z, iyVar, iyVar2, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 NavigationRailItemLayout$lambda$17$lambda$15$lambda$14(boolean z, iy iyVar, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(z ? 1.0f : ((Number) iyVar.invoke()).floatValue());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 NavigationRailItemLayout$lambda$18(my myVar, my myVar2, my myVar3, my myVar4, boolean z, iy iyVar, iy iyVar2, int i, Composer composer, int i2) {
        NavigationRailItemLayout(myVar, myVar2, myVar3, myVar4, z, iyVar, iyVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 NavigationRail_qi6gXK8$lambda$1(Modifier modifier, long j, long j2, ny nyVar, WindowInsets windowInsets, ny nyVar2, int i, int i2, Composer composer, int i3) {
        m2233NavigationRailqi6gXK8(modifier, j, j2, nyVar, windowInsets, nyVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    public static final ProvidableCompositionLocal<NavigationRailOverride> getLocalNavigationRailOverride() {
        return LocalNavigationRailOverride;
    }

    public static final float getNavigationRailItemHeight() {
        return NavigationRailItemHeight;
    }

    public static final float getNavigationRailItemVerticalPadding() {
        return NavigationRailItemVerticalPadding;
    }

    public static final float getNavigationRailItemWidth() {
        return NavigationRailItemWidth;
    }

    public static final float getNavigationRailVerticalPadding() {
        return NavigationRailVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m2236placeIconX9ElhV4(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, long j) {
        int m7581constrainWidthK40F9xA = ConstraintsKt.m7581constrainWidthK40F9xA(j, Math.max(placeable.getWidth(), Math.max(placeable2.getWidth(), placeable3 != null ? placeable3.getWidth() : 0)));
        int m7580constrainHeightK40F9xA = ConstraintsKt.m7580constrainHeightK40F9xA(j, measureScope.mo361roundToPx0680j_4(NavigationRailItemHeight));
        return MeasureScope.layout$default(measureScope, m7581constrainWidthK40F9xA, m7580constrainHeightK40F9xA, null, new wb0(placeable3, placeable, j50.p(m7581constrainWidthK40F9xA, 2, placeable), j50.c(m7580constrainHeightK40F9xA, 2, placeable), placeable2, j50.p(m7581constrainWidthK40F9xA, 2, placeable2), j50.c(m7580constrainHeightK40F9xA, 2, placeable2), m7581constrainWidthK40F9xA, m7580constrainHeightK40F9xA, 2), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 placeIcon_X9ElhV4$lambda$20(Placeable placeable, Placeable placeable2, int i, int i2, Placeable placeable3, int i3, int i4, int i5, int i6, Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, j50.p(i5, 2, placeable), j50.c(i6, 2, placeable), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i, i2, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i3, i4, 0.0f, 4, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-zUg2_y0, reason: not valid java name */
    public static final MeasureResult m2237placeLabelAndIconzUg2_y0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j, boolean z, float f) {
        float height = placeable2.getHeight();
        float f2 = IndicatorVerticalPaddingWithLabel;
        float mo367toPx0680j_4 = measureScope.mo367toPx0680j_4(f2) + height;
        float f3 = NavigationRailItemVerticalPadding;
        float mo367toPx0680j_42 = measureScope.mo367toPx0680j_4(f3) + mo367toPx0680j_4 + placeable.getHeight();
        float m7565getMinHeightimpl = (Constraints.m7565getMinHeightimpl(j) - mo367toPx0680j_42) / 2.0f;
        float mo367toPx0680j_43 = measureScope.mo367toPx0680j_4(f2);
        float f4 = m7565getMinHeightimpl < mo367toPx0680j_43 ? mo367toPx0680j_43 : m7565getMinHeightimpl;
        float f5 = (f4 * 2.0f) + mo367toPx0680j_42;
        float height2 = (1.0f - f) * ((z ? f4 : (f5 - placeable2.getHeight()) / 2.0f) - f4);
        float mo367toPx0680j_44 = measureScope.mo367toPx0680j_4(f3) + measureScope.mo367toPx0680j_4(f2) + placeable2.getHeight() + f4;
        int m7581constrainWidthK40F9xA = ConstraintsKt.m7581constrainWidthK40F9xA(j, Math.max(placeable2.getWidth(), Math.max(placeable.getWidth(), placeable4 != null ? placeable4.getWidth() : 0)));
        return MeasureScope.layout$default(measureScope, m7581constrainWidthK40F9xA, y80.P(f5), null, new sb0(placeable4, z, f, placeable, j50.p(m7581constrainWidthK40F9xA, 2, placeable), mo367toPx0680j_44, height2, placeable2, j50.p(m7581constrainWidthK40F9xA, 2, placeable2), f4, placeable3, j50.p(m7581constrainWidthK40F9xA, 2, placeable3), f4 - measureScope.mo367toPx0680j_4(f2), m7581constrainWidthK40F9xA, measureScope, 1), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 placeLabelAndIcon_zUg2_y0$lambda$22(Placeable placeable, boolean z, float f, Placeable placeable2, int i, float f2, float f3, Placeable placeable3, int i2, float f4, Placeable placeable4, int i3, float f5, int i4, MeasureScope measureScope, Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, j50.p(i4, 2, placeable), y80.P((f4 - measureScope.mo367toPx0680j_4(IndicatorVerticalPaddingWithLabel)) + f3), 0.0f, 4, null);
        }
        if (z || f != 0.0f) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i, y80.P(f2 + f3), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i2, y80.P(f4 + f3), 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i3, y80.P(f5 + f3), 0.0f, 4, null);
        return w01.a;
    }
}
