package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ShortNavigationBarKt;
import androidx.compose.material3.tokens.NavigationBarHorizontalItemTokens;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.material3.tokens.NavigationBarVerticalItemTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Dp;
import defpackage.iy;
import defpackage.my;
import defpackage.sn0;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShortNavigationBarKt {
    private static final ProvidableCompositionLocal<ShortNavigationBarOverride> LocalShortNavigationBarOverride = CompositionLocalKt.compositionLocalOf$default(null, new sn0(2), 1, null);
    private static final float StartIconIndicatorHorizontalPadding;
    private static final float StartIconIndicatorVerticalPadding;
    private static final float StartIconToLabelPadding;
    private static final float TopIconIndicatorHorizontalPadding;
    private static final float TopIconIndicatorToLabelPadding;
    private static final float TopIconIndicatorVerticalPadding;
    private static final float TopIconItemVerticalPadding;

    static {
        NavigationBarVerticalItemTokens navigationBarVerticalItemTokens = NavigationBarVerticalItemTokens.INSTANCE;
        TopIconItemVerticalPadding = navigationBarVerticalItemTokens.m3439getContainerBetweenSpaceD9Ej5fM();
        TopIconIndicatorVerticalPadding = Dp.m7611constructorimpl(Dp.m7611constructorimpl(navigationBarVerticalItemTokens.m3437getActiveIndicatorHeightD9Ej5fM() - navigationBarVerticalItemTokens.m3440getIconSizeD9Ej5fM()) / 2.0f);
        TopIconIndicatorHorizontalPadding = Dp.m7611constructorimpl(Dp.m7611constructorimpl(navigationBarVerticalItemTokens.m3438getActiveIndicatorWidthD9Ej5fM() - navigationBarVerticalItemTokens.m3440getIconSizeD9Ej5fM()) / 2.0f);
        NavigationBarHorizontalItemTokens navigationBarHorizontalItemTokens = NavigationBarHorizontalItemTokens.INSTANCE;
        StartIconIndicatorVerticalPadding = Dp.m7611constructorimpl(Dp.m7611constructorimpl(navigationBarHorizontalItemTokens.m3428getActiveIndicatorHeightD9Ej5fM() - navigationBarHorizontalItemTokens.m3431getIconSizeD9Ej5fM()) / 2.0f);
        TopIconIndicatorToLabelPadding = Dp.m7611constructorimpl(4.0f);
        StartIconIndicatorHorizontalPadding = navigationBarHorizontalItemTokens.m3429getActiveIndicatorLeadingSpaceD9Ej5fM();
        StartIconToLabelPadding = NavigationBarTokens.INSTANCE.m3434getItemActiveIndicatorIconLabelSpaceD9Ej5fM();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00bd  */
    /* renamed from: ShortNavigationBar-kQ6Tpik, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2385ShortNavigationBarkQ6Tpik(Modifier modifier, long j, long j2, WindowInsets windowInsets, int i, final my myVar, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long j3;
        long j4;
        WindowInsets windowInsets2;
        int i5;
        my myVar2;
        Modifier modifier3;
        final long j5;
        final long j6;
        final WindowInsets windowInsets3;
        final int i6;
        ScopeUpdateScope endRestartGroup;
        int m2383getArrangementLnnQw40;
        long j7;
        WindowInsets windowInsets4;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(552087412);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i10 = 32;
                    i4 |= i10;
                }
            } else {
                j3 = j;
            }
            i10 = 16;
            i4 |= i10;
        } else {
            j3 = j;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i9 = Fields.RotationX;
                    i4 |= i9;
                }
            } else {
                j4 = j2;
            }
            i9 = Fields.SpotShadowColor;
            i4 |= i9;
        } else {
            j4 = j2;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                windowInsets2 = windowInsets;
                if (startRestartGroup.changed(windowInsets2)) {
                    i8 = Fields.CameraDistance;
                    i4 |= i8;
                }
            } else {
                windowInsets2 = windowInsets;
            }
            i8 = Fields.RotationZ;
            i4 |= i8;
        } else {
            windowInsets2 = windowInsets;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                i5 = i;
                if (startRestartGroup.changed(i5)) {
                    i7 = Fields.Clip;
                    i4 |= i7;
                }
            } else {
                i5 = i;
            }
            i7 = 8192;
            i4 |= i7;
        } else {
            i5 = i;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            myVar2 = myVar;
            i4 |= startRestartGroup.changedInstance(myVar2) ? Fields.RenderEffect : 65536;
            if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j5 = j3;
                j6 = j4;
                windowInsets3 = windowInsets2;
                i6 = i5;
            } else {
                startRestartGroup.startDefaults();
                if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i11 != 0 ? Modifier.Companion : modifier2;
                    if ((i3 & 2) != 0) {
                        j3 = ShortNavigationBarDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                        i4 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        j4 = ShortNavigationBarDefaults.INSTANCE.getContentColor(startRestartGroup, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                        windowInsets2 = ShortNavigationBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        modifier3 = modifier4;
                        m2383getArrangementLnnQw40 = ShortNavigationBarDefaults.INSTANCE.m2383getArrangementLnnQw40();
                        j7 = j4;
                        windowInsets4 = windowInsets2;
                        long j8 = j3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(552087412, i4, -1, "androidx.compose.material3.ShortNavigationBar (ShortNavigationBar.kt:101)");
                        }
                        ((ShortNavigationBarOverride) startRestartGroup.consume(LocalShortNavigationBarOverride)).ShortNavigationBar(new ShortNavigationBarOverrideScope(modifier3, j8, j7, windowInsets4, m2383getArrangementLnnQw40, myVar2, null), startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j5 = j8;
                        j6 = j7;
                        windowInsets3 = windowInsets4;
                        i6 = m2383getArrangementLnnQw40;
                    } else {
                        modifier3 = modifier4;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    modifier3 = modifier2;
                }
                j7 = j4;
                windowInsets4 = windowInsets2;
                m2383getArrangementLnnQw40 = i5;
                long j82 = j3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ((ShortNavigationBarOverride) startRestartGroup.consume(LocalShortNavigationBarOverride)).ShortNavigationBar(new ShortNavigationBarOverrideScope(modifier3, j82, j7, windowInsets4, m2383getArrangementLnnQw40, myVar2, null), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                j5 = j82;
                j6 = j7;
                windowInsets3 = windowInsets4;
                i6 = m2383getArrangementLnnQw40;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new my() { // from class: ip0
                    @Override // defpackage.my
                    public final Object invoke(Object obj, Object obj2) {
                        w01 ShortNavigationBar_kQ6Tpik$lambda$1;
                        int intValue = ((Integer) obj2).intValue();
                        ShortNavigationBar_kQ6Tpik$lambda$1 = ShortNavigationBarKt.ShortNavigationBar_kQ6Tpik$lambda$1(Modifier.this, j5, j6, windowInsets3, i6, myVar, i2, i3, (Composer) obj, intValue);
                        return ShortNavigationBar_kQ6Tpik$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        myVar2 = myVar;
        if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f4  */
    /* renamed from: ShortNavigationBarItem-6ZDA4I0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2386ShortNavigationBarItem6ZDA4I0(final boolean z, final iy iyVar, final my myVar, final my myVar2, Modifier modifier, boolean z2, int i, NavigationItemColors navigationItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        boolean z3;
        int i4;
        iy iyVar2;
        my myVar3;
        my myVar4;
        final Modifier modifier2;
        int i5;
        boolean z4;
        int i6;
        int i7;
        NavigationItemColors navigationItemColors2;
        int i8;
        int i9;
        int i10;
        Composer composer2;
        final boolean z5;
        final int i11;
        final NavigationItemColors navigationItemColors3;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        int i12;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier3;
        boolean z6;
        NavigationItemColors navigationItemColors4;
        MutableInteractionSource mutableInteractionSource4;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1164996656);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i2 & 6) == 0) {
                i4 = (startRestartGroup.changed(z3) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i2 & 48) == 0) {
                i4 |= startRestartGroup.changedInstance(iyVar2) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
            myVar3 = myVar;
        } else {
            myVar3 = myVar;
            if ((i2 & 384) == 0) {
                i4 |= startRestartGroup.changedInstance(myVar3) ? Fields.RotationX : Fields.SpotShadowColor;
            }
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
            myVar4 = myVar2;
        } else {
            myVar4 = myVar2;
            if ((i2 & 3072) == 0) {
                i4 |= startRestartGroup.changedInstance(myVar4) ? Fields.CameraDistance : Fields.RotationZ;
            }
        }
        int i14 = i3 & 16;
        if (i14 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? Fields.Clip : 8192;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
            } else if ((196608 & i2) == 0) {
                z4 = z2;
                i4 |= startRestartGroup.changed(z4) ? Fields.RenderEffect : 65536;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((1572864 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 1048576 : Fields.BlendMode;
                    if ((12582912 & i2) != 0) {
                        if ((i3 & Fields.SpotShadowColor) == 0) {
                            navigationItemColors2 = navigationItemColors;
                            if (startRestartGroup.changed(navigationItemColors2)) {
                                i13 = GroupFlagsKt.IsNodeFlag;
                                i4 |= i13;
                            }
                        } else {
                            navigationItemColors2 = navigationItemColors;
                        }
                        i13 = 4194304;
                        i4 |= i13;
                    } else {
                        navigationItemColors2 = navigationItemColors;
                    }
                    i8 = i3 & Fields.RotationX;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i9 = i8;
                        i4 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        i10 = i4;
                        if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i10 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i14 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                if (i5 != 0) {
                                    z4 = true;
                                }
                                if (i6 != 0) {
                                    i7 = NavigationItemIconPosition.Companion.m2205getTopxw1Ddg();
                                }
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    i12 = i10 & (-29360129);
                                    navigationItemColors2 = ShortNavigationBarItemDefaults.INSTANCE.colors(startRestartGroup, 6);
                                } else {
                                    i12 = i10;
                                }
                                mutableInteractionSource3 = i9 != 0 ? null : mutableInteractionSource;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    i12 = i10 & (-29360129);
                                    modifier3 = modifier2;
                                    z6 = z4;
                                    navigationItemColors4 = navigationItemColors2;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1164996656, i12, -1, "androidx.compose.material3.ShortNavigationBarItem (ShortNavigationBar.kt:219)");
                                    }
                                    if (mutableInteractionSource3 != null) {
                                        startRestartGroup.startReplaceGroup(1215858123);
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                    } else {
                                        startRestartGroup.startReplaceGroup(1424693900);
                                        startRestartGroup.endReplaceGroup();
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                    }
                                    boolean m2200equalsimpl0 = NavigationItemIconPosition.m2200equalsimpl0(i7, NavigationItemIconPosition.Companion.m2205getTopxw1Ddg());
                                    float f = !m2200equalsimpl0 ? TopIconIndicatorHorizontalPadding : StartIconIndicatorHorizontalPadding;
                                    float f2 = !m2200equalsimpl0 ? TopIconIndicatorVerticalPadding : StartIconIndicatorVerticalPadding;
                                    NavigationBarTokens navigationBarTokens = NavigationBarTokens.INSTANCE;
                                    int i15 = i12 >> 6;
                                    composer2 = startRestartGroup;
                                    int i16 = i7;
                                    NavigationItemKt.m2209NavigationItem8Df7sds(z3, iyVar2, myVar3, TypographyKt.getValue(navigationBarTokens.getLabelTextFont(), startRestartGroup, 6), ShapesKt.getValue(navigationBarTokens.getItemActiveIndicatorShape(), startRestartGroup, 6), NavigationBarVerticalItemTokens.INSTANCE.m3438getActiveIndicatorWidthD9Ej5fM(), f, f2, TopIconIndicatorToLabelPadding, StartIconToLabelPadding, TopIconItemVerticalPadding, navigationItemColors4, modifier3, z6, myVar4, i16, mutableInteractionSource4, composer2, (i12 & 14) | 906166272 | (i12 & 112) | (i12 & 896), 6 | ((i12 >> 18) & 112) | (i15 & 896) | (i15 & 7168) | ((i12 << 3) & 57344) | ((i12 >> 3) & 458752));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    navigationItemColors3 = navigationItemColors4;
                                    modifier2 = modifier3;
                                    z5 = z6;
                                    i11 = i16;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    i12 = i10;
                                }
                            }
                            modifier3 = modifier2;
                            z6 = z4;
                            navigationItemColors4 = navigationItemColors2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (mutableInteractionSource3 != null) {
                            }
                            boolean m2200equalsimpl02 = NavigationItemIconPosition.m2200equalsimpl0(i7, NavigationItemIconPosition.Companion.m2205getTopxw1Ddg());
                            float f3 = !m2200equalsimpl02 ? TopIconIndicatorHorizontalPadding : StartIconIndicatorHorizontalPadding;
                            float f22 = !m2200equalsimpl02 ? TopIconIndicatorVerticalPadding : StartIconIndicatorVerticalPadding;
                            NavigationBarTokens navigationBarTokens2 = NavigationBarTokens.INSTANCE;
                            int i152 = i12 >> 6;
                            composer2 = startRestartGroup;
                            int i162 = i7;
                            NavigationItemKt.m2209NavigationItem8Df7sds(z3, iyVar2, myVar3, TypographyKt.getValue(navigationBarTokens2.getLabelTextFont(), startRestartGroup, 6), ShapesKt.getValue(navigationBarTokens2.getItemActiveIndicatorShape(), startRestartGroup, 6), NavigationBarVerticalItemTokens.INSTANCE.m3438getActiveIndicatorWidthD9Ej5fM(), f3, f22, TopIconIndicatorToLabelPadding, StartIconToLabelPadding, TopIconItemVerticalPadding, navigationItemColors4, modifier3, z6, myVar4, i162, mutableInteractionSource4, composer2, (i12 & 14) | 906166272 | (i12 & 112) | (i12 & 896), 6 | ((i12 >> 18) & 112) | (i152 & 896) | (i152 & 7168) | ((i12 << 3) & 57344) | ((i12 >> 3) & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            mutableInteractionSource2 = mutableInteractionSource3;
                            navigationItemColors3 = navigationItemColors4;
                            modifier2 = modifier3;
                            z5 = z6;
                            i11 = i162;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            z5 = z4;
                            i11 = i7;
                            navigationItemColors3 = navigationItemColors2;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new my() { // from class: jp0
                                @Override // defpackage.my
                                public final Object invoke(Object obj, Object obj2) {
                                    w01 ShortNavigationBarItem_6ZDA4I0$lambda$3;
                                    int intValue = ((Integer) obj2).intValue();
                                    ShortNavigationBarItem_6ZDA4I0$lambda$3 = ShortNavigationBarKt.ShortNavigationBarItem_6ZDA4I0$lambda$3(z, iyVar, myVar, myVar2, modifier2, z5, i11, navigationItemColors3, mutableInteractionSource2, i2, i3, (Composer) obj, intValue);
                                    return ShortNavigationBarItem_6ZDA4I0$lambda$3;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    i10 = i4;
                    if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i10 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i7 = i;
                if ((12582912 & i2) != 0) {
                }
                i8 = i3 & Fields.RotationX;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i4;
                if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i10 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z2;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i;
            if ((12582912 & i2) != 0) {
            }
            i8 = i3 & Fields.RotationX;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i4;
            if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i10 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        z4 = z2;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i;
        if ((12582912 & i2) != 0) {
        }
        i8 = i3 & Fields.RotationX;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i4;
        if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i10 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ShortNavigationBarItem_6ZDA4I0$lambda$3(boolean z, iy iyVar, my myVar, my myVar2, Modifier modifier, boolean z2, int i, NavigationItemColors navigationItemColors, MutableInteractionSource mutableInteractionSource, int i2, int i3, Composer composer, int i4) {
        m2386ShortNavigationBarItem6ZDA4I0(z, iyVar, myVar, myVar2, modifier, z2, i, navigationItemColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ShortNavigationBar_kQ6Tpik$lambda$1(Modifier modifier, long j, long j2, WindowInsets windowInsets, int i, my myVar, int i2, int i3, Composer composer, int i4) {
        m2385ShortNavigationBarkQ6Tpik(modifier, j, j2, windowInsets, i, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateCenteredContentHorizontalPadding(int i, int i2) {
        if (i > 6) {
            return 0;
        }
        return y80.P((((100 - ((i + 3) * 10)) / 2.0f) / 100.0f) * i2);
    }

    public static final ProvidableCompositionLocal<ShortNavigationBarOverride> getLocalShortNavigationBarOverride() {
        return LocalShortNavigationBarOverride;
    }

    public static final float getStartIconIndicatorHorizontalPadding() {
        return StartIconIndicatorHorizontalPadding;
    }

    public static final float getStartIconIndicatorVerticalPadding() {
        return StartIconIndicatorVerticalPadding;
    }

    public static final float getStartIconToLabelPadding() {
        return StartIconToLabelPadding;
    }

    public static final float getTopIconIndicatorHorizontalPadding() {
        return TopIconIndicatorHorizontalPadding;
    }

    public static final float getTopIconIndicatorToLabelPadding() {
        return TopIconIndicatorToLabelPadding;
    }

    public static final float getTopIconIndicatorVerticalPadding() {
        return TopIconIndicatorVerticalPadding;
    }

    public static final float getTopIconItemVerticalPadding() {
        return TopIconItemVerticalPadding;
    }
}
