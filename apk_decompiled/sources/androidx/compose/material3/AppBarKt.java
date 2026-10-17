package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.AppBarLargeFlexibleTokens;
import androidx.compose.material3.tokens.AppBarLargeTokens;
import androidx.compose.material3.tokens.AppBarMediumFlexibleTokens;
import androidx.compose.material3.tokens.AppBarMediumTokens;
import androidx.compose.material3.tokens.AppBarSmallTokens;
import androidx.compose.material3.tokens.AppBarTokens;
import androidx.compose.material3.tokens.BottomAppBarTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import defpackage.ac0;
import defpackage.b7;
import defpackage.c7;
import defpackage.d7;
import defpackage.er;
import defpackage.f7;
import defpackage.g7;
import defpackage.gi0;
import defpackage.h7;
import defpackage.hm;
import defpackage.iy;
import defpackage.k4;
import defpackage.k7;
import defpackage.kf0;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.p10;
import defpackage.q10;
import defpackage.v6;
import defpackage.vn;
import defpackage.w01;
import defpackage.w6;
import defpackage.x6;
import defpackage.y80;
import defpackage.z6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AppBarKt {
    private static final float BottomAppBarHorizontalPadding;
    private static final float BottomAppBarVerticalPadding;
    private static final float FABHorizontalPadding;
    private static final float FABVerticalPadding;
    private static final float LargeTitleBottomPadding;
    private static final ProvidableCompositionLocal<SingleRowTopAppBarOverride> LocalSingleRowTopAppBarOverride;
    private static final ProvidableCompositionLocal<TwoRowsTopAppBarOverride> LocalTwoRowsTopAppBarOverride;
    private static final float MediumTitleBottomPadding;
    private static final float TopAppBarHorizontalPadding;
    private static final float TopAppBarTitleInset;
    private static final CubicBezierEasing TopTitleAlphaEasing;

    static {
        float m7611constructorimpl = Dp.m7611constructorimpl(Dp.m7611constructorimpl(16.0f) - Dp.m7611constructorimpl(12.0f));
        BottomAppBarHorizontalPadding = m7611constructorimpl;
        float m7611constructorimpl2 = Dp.m7611constructorimpl(Dp.m7611constructorimpl(16.0f) - Dp.m7611constructorimpl(12.0f));
        BottomAppBarVerticalPadding = m7611constructorimpl2;
        FABHorizontalPadding = Dp.m7611constructorimpl(Dp.m7611constructorimpl(16.0f) - m7611constructorimpl);
        FABVerticalPadding = Dp.m7611constructorimpl(Dp.m7611constructorimpl(12.0f) - m7611constructorimpl2);
        LocalSingleRowTopAppBarOverride = CompositionLocalKt.compositionLocalOf$default(null, new defpackage.e1(3), 1, null);
        LocalTwoRowsTopAppBarOverride = CompositionLocalKt.compositionLocalOf$default(null, new defpackage.e1(4), 1, null);
        TopTitleAlphaEasing = new CubicBezierEasing(0.8f, 0.0f, 0.8f, 0.15f);
        MediumTitleBottomPadding = Dp.m7611constructorimpl(24.0f);
        LargeTitleBottomPadding = Dp.m7611constructorimpl(28.0f);
        float m7611constructorimpl3 = Dp.m7611constructorimpl(4.0f);
        TopAppBarHorizontalPadding = m7611constructorimpl3;
        TopAppBarTitleInset = Dp.m7611constructorimpl(Dp.m7611constructorimpl(16.0f) - m7611constructorimpl3);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00bc  */
    /* renamed from: BottomAppBar-1oL4kX8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1612BottomAppBar1oL4kX8(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, ny nyVar, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        float f2;
        int i4;
        PaddingValues paddingValues2;
        WindowInsets windowInsets2;
        Composer composer2;
        Modifier modifier3;
        long j5;
        long j6;
        float f3;
        PaddingValues paddingValues3;
        WindowInsets windowInsets3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        int i5;
        float f4;
        PaddingValues paddingValues4;
        WindowInsets windowInsets4;
        int i6;
        long j7;
        long j8;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(107726720);
        int i10 = i2 & 1;
        if (i10 != 0) {
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
                    i9 = 32;
                    i3 |= i9;
                }
            } else {
                j3 = j;
            }
            i9 = 16;
            i3 |= i9;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i8 = Fields.RotationX;
                    i3 |= i8;
                }
            } else {
                j4 = j2;
            }
            i8 = Fields.SpotShadowColor;
            i3 |= i8;
        } else {
            j4 = j2;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? Fields.CameraDistance : Fields.RotationZ;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? Fields.Clip : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        windowInsets2 = windowInsets;
                        if (startRestartGroup.changed(windowInsets2)) {
                            i7 = Fields.RenderEffect;
                            i3 |= i7;
                        }
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i7 = 65536;
                    i3 |= i7;
                } else {
                    windowInsets2 = windowInsets;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changedInstance(nyVar) ? 1048576 : Fields.BlendMode;
                    if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        j5 = j3;
                        j6 = j4;
                        f3 = f2;
                        paddingValues3 = paddingValues2;
                        windowInsets3 = windowInsets2;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i10 != 0 ? Modifier.Companion : modifier2;
                            if ((i2 & 2) != 0) {
                                j3 = BottomAppBarDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                j4 = ColorSchemeKt.m1797contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                            }
                            if (i11 != 0) {
                                f2 = BottomAppBarDefaults.INSTANCE.m1639getContainerElevationD9Ej5fM();
                            }
                            if (i4 != 0) {
                                paddingValues2 = BottomAppBarDefaults.INSTANCE.getContentPadding();
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                float f5 = f2;
                                modifier4 = modifier5;
                                i5 = 1572864;
                                f4 = f5;
                                windowInsets4 = BottomAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                j8 = j4;
                                paddingValues4 = paddingValues2;
                                i6 = 107726720;
                                j7 = j3;
                            } else {
                                float f6 = f2;
                                modifier4 = modifier5;
                                i5 = 1572864;
                                f4 = f6;
                                paddingValues4 = paddingValues2;
                                windowInsets4 = windowInsets2;
                                i6 = 107726720;
                                j7 = j3;
                                j8 = j4;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            paddingValues4 = paddingValues2;
                            windowInsets4 = windowInsets2;
                            i5 = 1572864;
                            i6 = 107726720;
                            j7 = j3;
                            j8 = j4;
                            f4 = f2;
                            modifier4 = modifier2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(i6, i3, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:1173)");
                        }
                        composer2 = startRestartGroup;
                        m1614BottomAppBare3WI5M(modifier4, j7, j8, f4, paddingValues4, windowInsets4, null, nyVar, composer2, i5 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (29360128 & (i3 << 3)), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        j5 = j7;
                        j6 = j8;
                        f3 = f4;
                        paddingValues3 = paddingValues4;
                        windowInsets3 = windowInsets4;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new ac0(modifier3, j5, j6, f3, paddingValues3, windowInsets3, nyVar, i, i2));
                        return;
                    }
                    return;
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            paddingValues2 = paddingValues;
            if ((196608 & i) == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f2 = f;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        if ((196608 & i) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00fa  */
    /* renamed from: BottomAppBar-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1613BottomAppBarSnr_uVM(ny nyVar, Modifier modifier, my myVar, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, Composer composer, int i, int i2) {
        ny nyVar2;
        int i3;
        Modifier modifier2;
        int i4;
        my myVar2;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        Composer composer2;
        Modifier modifier3;
        my myVar3;
        long j5;
        long j6;
        float f3;
        PaddingValues paddingValues2;
        WindowInsets windowInsets2;
        ScopeUpdateScope endRestartGroup;
        WindowInsets windowInsets3;
        PaddingValues paddingValues3;
        Modifier modifier4;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-2144093983);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            nyVar2 = nyVar;
        } else {
            nyVar2 = nyVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(nyVar2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                myVar2 = myVar;
                i3 |= startRestartGroup.changedInstance(myVar2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i9 = Fields.CameraDistance;
                            i3 |= i9;
                        }
                    } else {
                        j3 = j;
                    }
                    i9 = Fields.RotationZ;
                    i3 |= i9;
                } else {
                    j3 = j;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j4 = j2;
                        if (startRestartGroup.changed(j4)) {
                            i8 = Fields.Clip;
                            i3 |= i8;
                        }
                    } else {
                        j4 = j2;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    j4 = j2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? Fields.RenderEffect : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues) ? 1048576 : Fields.BlendMode;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i2 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(windowInsets)) {
                            i7 = GroupFlagsKt.IsNodeFlag;
                            i3 |= i7;
                        }
                        i7 = 4194304;
                        i3 |= i7;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        myVar3 = myVar2;
                        j5 = j3;
                        j6 = j4;
                        f3 = f2;
                        paddingValues2 = paddingValues;
                        windowInsets2 = windowInsets;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i10 != 0) {
                                modifier2 = Modifier.Companion;
                            }
                            if (i4 != 0) {
                                myVar2 = null;
                            }
                            if ((i2 & 8) != 0) {
                                j3 = BottomAppBarDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                j4 = ColorSchemeKt.m1797contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 9) & 14);
                                i3 &= -57345;
                            }
                            if (i5 != 0) {
                                f2 = BottomAppBarDefaults.INSTANCE.m1639getContainerElevationD9Ej5fM();
                            }
                            PaddingValues contentPadding = i6 != 0 ? BottomAppBarDefaults.INSTANCE.getContentPadding() : paddingValues;
                            if ((i2 & Fields.SpotShadowColor) != 0) {
                                i3 &= -29360129;
                                paddingValues3 = contentPadding;
                                modifier4 = modifier2;
                                windowInsets3 = BottomAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                long j7 = j3;
                                long j8 = j4;
                                float f4 = f2;
                                my myVar4 = myVar2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2144093983, i3, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:1044)");
                                }
                                composer2 = startRestartGroup;
                                m1615BottomAppBarqhFBPw4(nyVar2, modifier4, myVar4, j7, j8, f4, paddingValues3, windowInsets3, null, composer2, (i3 & 14) | 100663296 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                myVar3 = myVar4;
                                j5 = j7;
                                j6 = j8;
                                f3 = f4;
                                paddingValues2 = paddingValues3;
                                windowInsets2 = windowInsets3;
                            } else {
                                windowInsets3 = windowInsets;
                                paddingValues3 = contentPadding;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & Fields.SpotShadowColor) != 0) {
                                i3 &= -29360129;
                            }
                            paddingValues3 = paddingValues;
                            windowInsets3 = windowInsets;
                        }
                        modifier4 = modifier2;
                        long j72 = j3;
                        long j82 = j4;
                        float f42 = f2;
                        my myVar42 = myVar2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = startRestartGroup;
                        m1615BottomAppBarqhFBPw4(nyVar2, modifier4, myVar42, j72, j82, f42, paddingValues3, windowInsets3, null, composer2, (i3 & 14) | 100663296 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                        myVar3 = myVar42;
                        j5 = j72;
                        j6 = j82;
                        f3 = f42;
                        paddingValues2 = paddingValues3;
                        windowInsets2 = windowInsets3;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new f7(nyVar, modifier3, myVar3, j5, j6, f3, paddingValues2, windowInsets2, i, i2));
                        return;
                    }
                    return;
                }
                f2 = f;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            myVar2 = myVar;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        myVar2 = myVar;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00dd  */
    /* renamed from: BottomAppBar-e-3WI5M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1614BottomAppBare3WI5M(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, ny nyVar, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        float f2;
        int i4;
        PaddingValues paddingValues2;
        WindowInsets windowInsets2;
        int i5;
        Composer composer2;
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior2;
        Modifier modifier3;
        long j5;
        long j6;
        float f3;
        PaddingValues paddingValues3;
        WindowInsets windowInsets3;
        ScopeUpdateScope endRestartGroup;
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior3;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1562683362);
        int i9 = i2 & 1;
        if (i9 != 0) {
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
                    i8 = 32;
                    i3 |= i8;
                }
            } else {
                j3 = j;
            }
            i8 = 16;
            i3 |= i8;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i7 = Fields.RotationX;
                    i3 |= i7;
                }
            } else {
                j4 = j2;
            }
            i7 = Fields.SpotShadowColor;
            i3 |= i7;
        } else {
            j4 = j2;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? Fields.CameraDistance : Fields.RotationZ;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? Fields.Clip : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        windowInsets2 = windowInsets;
                        if (startRestartGroup.changed(windowInsets2)) {
                            i6 = Fields.RenderEffect;
                            i3 |= i6;
                        }
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i6 = 65536;
                    i3 |= i6;
                } else {
                    windowInsets2 = windowInsets;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changed(bottomAppBarScrollBehavior) ? 1048576 : Fields.BlendMode;
                }
                if ((i2 & Fields.SpotShadowColor) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
                        modifier3 = modifier2;
                        j5 = j3;
                        j6 = j4;
                        f3 = f2;
                        paddingValues3 = paddingValues2;
                        windowInsets3 = windowInsets2;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i9 != 0) {
                                modifier2 = Modifier.Companion;
                            }
                            if ((i2 & 2) != 0) {
                                j3 = BottomAppBarDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                j4 = ColorSchemeKt.m1797contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                            }
                            if (i10 != 0) {
                                f2 = BottomAppBarDefaults.INSTANCE.m1639getContainerElevationD9Ej5fM();
                            }
                            if (i4 != 0) {
                                paddingValues2 = BottomAppBarDefaults.INSTANCE.getContentPadding();
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                bottomAppBarScrollBehavior3 = null;
                                long j7 = j3;
                                long j8 = j4;
                                float f4 = f2;
                                PaddingValues paddingValues4 = paddingValues2;
                                WindowInsets windowInsets4 = windowInsets2;
                                Modifier modifier4 = modifier2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1562683362, i3, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:1226)");
                                }
                                int i11 = i3 << 6;
                                composer2 = startRestartGroup;
                                m1616BottomAppBarLayoutt5fmz9U(BottomAppBarTokens.INSTANCE.m3044getContainerHeightD9Ej5fM(), Arrangement.INSTANCE.getStart(), modifier4, j7, j8, f4, paddingValues4, windowInsets4, bottomAppBarScrollBehavior3, nyVar, composer2, (i11 & 896) | 54 | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11) | (234881024 & i11) | (i11 & 1879048192), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                j5 = j7;
                                j6 = j8;
                                f3 = f4;
                                paddingValues3 = paddingValues4;
                                windowInsets3 = windowInsets4;
                                bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                        }
                        bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior;
                        long j72 = j3;
                        long j82 = j4;
                        float f42 = f2;
                        PaddingValues paddingValues42 = paddingValues2;
                        WindowInsets windowInsets42 = windowInsets2;
                        Modifier modifier42 = modifier2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i112 = i3 << 6;
                        composer2 = startRestartGroup;
                        m1616BottomAppBarLayoutt5fmz9U(BottomAppBarTokens.INSTANCE.m3044getContainerHeightD9Ej5fM(), Arrangement.INSTANCE.getStart(), modifier42, j72, j82, f42, paddingValues42, windowInsets42, bottomAppBarScrollBehavior3, nyVar, composer2, (i112 & 896) | 54 | (i112 & 7168) | (57344 & i112) | (458752 & i112) | (3670016 & i112) | (29360128 & i112) | (234881024 & i112) | (i112 & 1879048192), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                        j5 = j72;
                        j6 = j82;
                        f3 = f42;
                        paddingValues3 = paddingValues42;
                        windowInsets3 = windowInsets42;
                        bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior3;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new f7(modifier3, j5, j6, f3, paddingValues3, windowInsets3, bottomAppBarScrollBehavior2, nyVar, i, i2));
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
            paddingValues2 = paddingValues;
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((i2 & Fields.SpotShadowColor) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f2 = f;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((i2 & Fields.SpotShadowColor) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* renamed from: BottomAppBar-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1615BottomAppBarqhFBPw4(final ny nyVar, Modifier modifier, my myVar, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, Composer composer, int i, int i2) {
        int i3;
        int i4;
        final my myVar2;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        int i7;
        int i8;
        Composer composer2;
        Modifier modifier2;
        my myVar3;
        long j5;
        long j6;
        float f3;
        PaddingValues paddingValues2;
        WindowInsets windowInsets2;
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        WindowInsets windowInsets3;
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior3;
        float f4;
        PaddingValues paddingValues3;
        WindowInsets windowInsets4;
        int i9;
        Modifier modifier3;
        long j7;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(272234465);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(nyVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                myVar2 = myVar;
                i3 |= startRestartGroup.changedInstance(myVar2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i13 = Fields.CameraDistance;
                            i3 |= i13;
                        }
                    } else {
                        j3 = j;
                    }
                    i13 = Fields.RotationZ;
                    i3 |= i13;
                } else {
                    j3 = j;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j4 = j2;
                        if (startRestartGroup.changed(j4)) {
                            i12 = Fields.Clip;
                            i3 |= i12;
                        }
                    } else {
                        j4 = j2;
                    }
                    i12 = 8192;
                    i3 |= i12;
                } else {
                    j4 = j2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? Fields.RenderEffect : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues) ? 1048576 : Fields.BlendMode;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i2 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(windowInsets)) {
                            i11 = GroupFlagsKt.IsNodeFlag;
                            i3 |= i11;
                        }
                        i11 = 4194304;
                        i3 |= i11;
                    }
                    i7 = i2 & Fields.RotationX;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i8 = i7;
                        i3 |= startRestartGroup.changed(bottomAppBarScrollBehavior) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier;
                                if (i4 != 0) {
                                    myVar2 = null;
                                }
                                if ((i2 & 8) != 0) {
                                    j3 = BottomAppBarDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    j4 = ColorSchemeKt.m1797contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 9) & 14);
                                    i3 &= -57345;
                                }
                                float m1639getContainerElevationD9Ej5fM = i5 != 0 ? BottomAppBarDefaults.INSTANCE.m1639getContainerElevationD9Ej5fM() : f2;
                                PaddingValues contentPadding = i6 != 0 ? BottomAppBarDefaults.INSTANCE.getContentPadding() : paddingValues;
                                if ((i2 & Fields.SpotShadowColor) != 0) {
                                    windowInsets3 = BottomAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    windowInsets3 = windowInsets;
                                }
                                bottomAppBarScrollBehavior3 = i8 == 0 ? bottomAppBarScrollBehavior : null;
                                f4 = m1639getContainerElevationD9Ej5fM;
                                paddingValues3 = contentPadding;
                                windowInsets4 = windowInsets3;
                                i9 = 272234465;
                                modifier3 = modifier4;
                                j7 = j3;
                                i10 = 12582912;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & Fields.SpotShadowColor) != 0) {
                                    i3 &= -29360129;
                                }
                                modifier3 = modifier;
                                paddingValues3 = paddingValues;
                                windowInsets4 = windowInsets;
                                bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior;
                                f4 = f2;
                                i10 = 12582912;
                                i9 = 272234465;
                                j7 = j3;
                            }
                            long j8 = j4;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i9, i3, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:1110)");
                            }
                            int i15 = i10 | ((i3 >> 3) & 14);
                            int i16 = i3 >> 6;
                            composer2 = startRestartGroup;
                            m1614BottomAppBare3WI5M(modifier3, j7, j8, f4, paddingValues3, windowInsets4, bottomAppBarScrollBehavior3, ComposableLambdaKt.rememberComposableLambda(-1943077286, true, new ny() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$2
                                public final void invoke(RowScope rowScope, Composer composer3, int i17) {
                                    int i18;
                                    float f5;
                                    float f6;
                                    if ((i17 & 6) == 0) {
                                        i18 = i17 | (composer3.changed(rowScope) ? 4 : 2);
                                    } else {
                                        i18 = i17;
                                    }
                                    if (!composer3.shouldExecute((i18 & 19) != 18, i18 & 1)) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1943077286, i18, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:1119)");
                                    }
                                    Modifier.Companion companion = Modifier.Companion;
                                    Modifier weight$default = RowScope.weight$default(rowScope, companion, 1.0f, false, 2, null);
                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                    Alignment.Companion companion2 = Alignment.Companion;
                                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                    ny nyVar2 = ny.this;
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer3, 54);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, weight$default);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                                    iy constructor = companion3.getConstructor();
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
                                    my b = k4.b(companion3, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                    }
                                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
                                    nyVar2.invoke(RowScopeInstance.INSTANCE, composer3, 6);
                                    composer3.endNode();
                                    if (myVar2 != null) {
                                        composer3.startReplaceGroup(1354051795);
                                        Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
                                        f5 = AppBarKt.FABVerticalPadding;
                                        f6 = AppBarKt.FABHorizontalPadding;
                                        Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(fillMaxHeight$default, 0.0f, f5, f6, 0.0f, 9, null);
                                        Alignment topStart = companion2.getTopStart();
                                        my myVar4 = myVar2;
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topStart, false);
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m766paddingqDBjuR0$default);
                                        iy constructor2 = companion3.getConstructor();
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
                                        my b2 = k4.b(companion3, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                                        if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                                        }
                                        Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion3.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        kf0.f(myVar4, composer3, 0);
                                    } else {
                                        composer3.startReplaceGroup(1354317992);
                                        composer3.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.ny
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                                    return w01.a;
                                }
                            }, startRestartGroup, 54), composer2, i15 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (i16 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            myVar3 = myVar2;
                            modifier2 = modifier3;
                            j5 = j7;
                            j6 = j8;
                            f3 = f4;
                            paddingValues2 = paddingValues3;
                            windowInsets2 = windowInsets4;
                            bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            myVar3 = myVar2;
                            j5 = j3;
                            j6 = j4;
                            f3 = f2;
                            paddingValues2 = paddingValues;
                            windowInsets2 = windowInsets;
                            bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new z6(nyVar, modifier2, myVar3, j5, j6, f3, paddingValues2, windowInsets2, bottomAppBarScrollBehavior2, i, i2));
                            return;
                        }
                        return;
                    }
                    i8 = i7;
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f2 = f;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i7 = i2 & Fields.RotationX;
                if (i7 == 0) {
                }
                i8 = i7;
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            myVar2 = myVar;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i7 = i2 & Fields.RotationX;
            if (i7 == 0) {
            }
            i8 = i7;
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        myVar2 = myVar;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i7 = i2 & Fields.RotationX;
        if (i7 == 0) {
        }
        i8 = i7;
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d7  */
    /* renamed from: BottomAppBarLayout-t5fmz9U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m1616BottomAppBarLayoutt5fmz9U(final float f, final Arrangement.Horizontal horizontal, Modifier modifier, final long j, final long j2, final float f2, final PaddingValues paddingValues, final WindowInsets windowInsets, final BottomAppBarScrollBehavior bottomAppBarScrollBehavior, final ny nyVar, Composer composer, final int i, final int i2) {
        int i3;
        final Arrangement.Horizontal horizontal2;
        long j3;
        long j4;
        float f3;
        final PaddingValues paddingValues2;
        WindowInsets windowInsets2;
        Composer composer2;
        final Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(-141162176);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            horizontal2 = horizontal;
        } else {
            horizontal2 = horizontal;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(horizontal2) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
                j3 = j;
            } else {
                j3 = j;
                if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changed(j3) ? Fields.CameraDistance : Fields.RotationZ;
                }
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
                j4 = j2;
            } else {
                j4 = j2;
                if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(j4) ? Fields.Clip : 8192;
                }
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
                f3 = f2;
            } else {
                f3 = f2;
                if ((i & 196608) == 0) {
                    i3 |= startRestartGroup.changed(f3) ? Fields.RenderEffect : 65536;
                }
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? 1048576 : Fields.BlendMode;
                if ((i2 & Fields.SpotShadowColor) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    windowInsets2 = windowInsets;
                    i3 |= startRestartGroup.changed(windowInsets2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    if ((i2 & Fields.RotationX) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changed(bottomAppBarScrollBehavior) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i2 & Fields.RotationY) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier2 = modifier;
                            } else {
                                Modifier modifier4 = i4 != 0 ? Modifier.Companion : modifier;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-141162176, i3, -1, "androidx.compose.material3.BottomAppBarLayout (AppBar.kt:1330)");
                                }
                                BottomAppBarScrollBehavior bottomAppBarScrollBehavior2 = !BottomAppBarLayout_t5fmz9U$lambda$17(rememberTouchExplorationService(startRestartGroup, 0)) ? bottomAppBarScrollBehavior : null;
                                if (bottomAppBarScrollBehavior2 == null || bottomAppBarScrollBehavior2.isPinned()) {
                                    startRestartGroup.startReplaceGroup(-587975934);
                                    startRestartGroup.endReplaceGroup();
                                    modifier3 = Modifier.Companion;
                                } else {
                                    startRestartGroup.startReplaceGroup(-588583503);
                                    Modifier.Companion companion = Modifier.Companion;
                                    Orientation orientation = Orientation.Vertical;
                                    boolean changed = startRestartGroup.changed(bottomAppBarScrollBehavior2);
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = new defpackage.h(bottomAppBarScrollBehavior2, 3);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    DraggableState rememberDraggableState = DraggableKt.rememberDraggableState((ky) rememberedValue, startRestartGroup, 0);
                                    boolean changed2 = startRestartGroup.changed(bottomAppBarScrollBehavior2);
                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                        rememberedValue2 = new AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1(bottomAppBarScrollBehavior2, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    modifier3 = DraggableKt.draggable$default(companion, rememberDraggableState, orientation, false, null, false, null, (ny) rememberedValue2, false, 188, null);
                                    startRestartGroup.endReplaceGroup();
                                }
                                int i5 = i3;
                                Shape value = ShapesKt.getValue(BottomAppBarTokens.INSTANCE.getContainerShape(), startRestartGroup, 6);
                                boolean changed3 = startRestartGroup.changed(bottomAppBarScrollBehavior2);
                                Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                                    rememberedValue3 = new x6(bottomAppBarScrollBehavior2, 0);
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                Modifier then = LayoutModifierKt.layout(modifier4, (ny) rememberedValue3).then(modifier3);
                                Modifier modifier5 = modifier4;
                                final WindowInsets windowInsets3 = windowInsets2;
                                int i6 = i5 >> 3;
                                composer2 = startRestartGroup;
                                SurfaceKt.m2464SurfaceT9BRK9s(then, value, j3, j4, f3, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1054101083, true, new my() { // from class: androidx.compose.material3.AppBarKt$BottomAppBarLayout$2
                                    public final void invoke(Composer composer3, int i7) {
                                        if (!composer3.shouldExecute((i7 & 3) != 2, i7 & 1)) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1054101083, i7, -1, "androidx.compose.material3.BottomAppBarLayout.<anonymous> (AppBar.kt:1380)");
                                        }
                                        Modifier padding = PaddingKt.padding(SizeKt.m793height3ABfNKs(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), WindowInsets.this), f), paddingValues2);
                                        Arrangement.Horizontal horizontal3 = horizontal2;
                                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                                        ny nyVar2 = nyVar;
                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal3, centerVertically, composer3, 48);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, padding);
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
                                }, startRestartGroup, 54), composer2, (i6 & 896) | 12582912 | (i6 & 7168) | (i6 & 57344), 96);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier5;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new my() { // from class: y6
                                    @Override // defpackage.my
                                    public final Object invoke(Object obj, Object obj2) {
                                        w01 BottomAppBarLayout_t5fmz9U$lambda$24;
                                        int intValue = ((Integer) obj2).intValue();
                                        BottomAppBarLayout_t5fmz9U$lambda$24 = AppBarKt.BottomAppBarLayout_t5fmz9U$lambda$24(f, horizontal, modifier2, j, j2, f2, paddingValues, windowInsets, bottomAppBarScrollBehavior, nyVar, i, i2, (Composer) obj, intValue);
                                        return BottomAppBarLayout_t5fmz9U$lambda$24;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    if ((i2 & Fields.RotationY) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                windowInsets2 = windowInsets;
                if ((i2 & Fields.RotationX) == 0) {
                }
                if ((i2 & Fields.RotationY) != 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            paddingValues2 = paddingValues;
            if ((i2 & Fields.SpotShadowColor) != 0) {
            }
            windowInsets2 = windowInsets;
            if ((i2 & Fields.RotationX) == 0) {
            }
            if ((i2 & Fields.RotationY) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        paddingValues2 = paddingValues;
        if ((i2 & Fields.SpotShadowColor) != 0) {
        }
        windowInsets2 = windowInsets;
        if ((i2 & Fields.RotationX) == 0) {
        }
        if ((i2 & Fields.RotationY) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final boolean BottomAppBarLayout_t5fmz9U$lambda$17(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BottomAppBarLayout_t5fmz9U$lambda$19$lambda$18(BottomAppBarScrollBehavior bottomAppBarScrollBehavior, float f) {
        BottomAppBarState state = bottomAppBarScrollBehavior.getState();
        state.setHeightOffset(state.getHeightOffset() - f);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult BottomAppBarLayout_t5fmz9U$lambda$23$lambda$22(BottomAppBarScrollBehavior bottomAppBarScrollBehavior, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        BottomAppBarState state;
        BottomAppBarState state2;
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(constraints.m7570unboximpl());
        if (bottomAppBarScrollBehavior != null && (state2 = bottomAppBarScrollBehavior.getState()) != null) {
            state2.setHeightOffsetLimit(-mo6234measureBRTryo0.getHeight());
        }
        float height = mo6234measureBRTryo0.getHeight() + ((bottomAppBarScrollBehavior == null || (state = bottomAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getHeightOffset());
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), y80.P(height >= 0.0f ? height : 0.0f), null, new h7(0, mo6234measureBRTryo0), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BottomAppBarLayout_t5fmz9U$lambda$23$lambda$22$lambda$21(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BottomAppBarLayout_t5fmz9U$lambda$24(float f, Arrangement.Horizontal horizontal, Modifier modifier, long j, long j2, float f2, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, ny nyVar, int i, int i2, Composer composer, int i3) {
        m1616BottomAppBarLayoutt5fmz9U(f, horizontal, modifier, j, j2, f2, paddingValues, windowInsets, bottomAppBarScrollBehavior, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    public static final BottomAppBarState BottomAppBarState(float f, float f2, float f3) {
        return new BottomAppBarStateImpl(f, f2, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BottomAppBar_1oL4kX8$lambda$14(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, ny nyVar, int i, int i2, Composer composer, int i3) {
        m1612BottomAppBar1oL4kX8(modifier, j, j2, f, paddingValues, windowInsets, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BottomAppBar_Snr_uVM$lambda$12(ny nyVar, Modifier modifier, my myVar, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, int i, int i2, Composer composer, int i3) {
        m1613BottomAppBarSnr_uVM(nyVar, modifier, myVar, j, j2, f, paddingValues, windowInsets, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BottomAppBar_e_3WI5M$lambda$15(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, ny nyVar, int i, int i2, Composer composer, int i3) {
        m1614BottomAppBare3WI5M(modifier, j, j2, f, paddingValues, windowInsets, bottomAppBarScrollBehavior, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BottomAppBar_qhFBPw4$lambda$13(ny nyVar, Modifier modifier, my myVar, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, int i, int i2, Composer composer, int i3) {
        m1615BottomAppBarqhFBPw4(nyVar, modifier, myVar, j, j2, f, paddingValues, windowInsets, bottomAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0065  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void CenterAlignedTopAppBar(my myVar, Modifier modifier, my myVar2, ny nyVar, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i, int i2) {
        my myVar3;
        int i3;
        Modifier modifier2;
        int i4;
        my myVar4;
        int i5;
        ny nyVar2;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Composer composer2;
        Modifier modifier3;
        my myVar5;
        ny nyVar3;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors3;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        ScopeUpdateScope endRestartGroup;
        TopAppBarColors topAppBarColors4;
        TopAppBarScrollBehavior topAppBarScrollBehavior4;
        ny nyVar4;
        WindowInsets windowInsets4;
        Modifier modifier4;
        my myVar6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(603182999);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            myVar3 = myVar;
        } else {
            myVar3 = myVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(myVar3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                myVar4 = myVar2;
                i3 |= startRestartGroup.changedInstance(myVar4) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    nyVar2 = nyVar;
                    i3 |= startRestartGroup.changedInstance(nyVar2) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            if (startRestartGroup.changed(windowInsets2)) {
                                i9 = Fields.Clip;
                                i3 |= i9;
                            }
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i9 = 8192;
                        i3 |= i9;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColors2 = topAppBarColors;
                            if (startRestartGroup.changed(topAppBarColors2)) {
                                i8 = Fields.RenderEffect;
                                i3 |= i8;
                            }
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i8 = 65536;
                        i3 |= i8;
                    } else {
                        topAppBarColors2 = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                        i3 |= startRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : Fields.BlendMode;
                        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i10 != 0 ? Modifier.Companion : modifier2;
                                if (i4 != 0) {
                                    myVar4 = ComposableSingletons$AppBarKt.INSTANCE.getLambda$1866429650$material3();
                                }
                                if (i5 != 0) {
                                    nyVar2 = ComposableSingletons$AppBarKt.INSTANCE.m1824getLambda$541682128$material3();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    topAppBarColors2 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                }
                                if (i6 != 0) {
                                    topAppBarScrollBehavior4 = null;
                                    windowInsets4 = windowInsets2;
                                    topAppBarColors4 = topAppBarColors2;
                                    myVar6 = myVar4;
                                    nyVar4 = nyVar2;
                                    modifier4 = modifier5;
                                } else {
                                    topAppBarColors4 = topAppBarColors2;
                                    topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                                    nyVar4 = nyVar2;
                                    windowInsets4 = windowInsets2;
                                    modifier4 = modifier5;
                                    myVar6 = myVar4;
                                }
                                i7 = 603182999;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                topAppBarColors4 = topAppBarColors2;
                                topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                                i7 = 603182999;
                                nyVar4 = nyVar2;
                                windowInsets4 = windowInsets2;
                                modifier4 = modifier2;
                                myVar6 = myVar4;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i7, i3, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:291)");
                            }
                            int i11 = (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                            int i12 = i3 << 3;
                            composer2 = startRestartGroup;
                            m1617CenterAlignedTopAppBarGHTll3U(myVar3, modifier4, myVar6, nyVar4, TopAppBarDefaults.INSTANCE.m2819getTopAppBarExpandedHeightD9Ej5fM(), windowInsets4, topAppBarColors4, topAppBarScrollBehavior4, composer2, i11 | (458752 & i12) | (3670016 & i12) | (i12 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            myVar5 = myVar6;
                            nyVar3 = nyVar4;
                            windowInsets3 = windowInsets4;
                            topAppBarColors3 = topAppBarColors4;
                            topAppBarScrollBehavior3 = topAppBarScrollBehavior4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            myVar5 = myVar4;
                            nyVar3 = nyVar2;
                            windowInsets3 = windowInsets2;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new v6(myVar, modifier3, myVar5, nyVar3, windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, i, i2, 0));
                            return;
                        }
                        return;
                    }
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                nyVar2 = nyVar;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            myVar4 = myVar2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            nyVar2 = nyVar;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        myVar4 = myVar2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        nyVar2 = nyVar;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CenterAlignedTopAppBar$lambda$2(my myVar, Modifier modifier, my myVar2, ny nyVar, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, Composer composer, int i3) {
        CenterAlignedTopAppBar(myVar, modifier, myVar2, nyVar, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00da  */
    /* renamed from: CenterAlignedTopAppBar-GHTll3U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1617CenterAlignedTopAppBarGHTll3U(my myVar, Modifier modifier, my myVar2, ny nyVar, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i, int i2) {
        my myVar3;
        int i3;
        Modifier modifier2;
        int i4;
        my myVar4;
        int i5;
        ny nyVar2;
        int i6;
        float f2;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i7;
        int i8;
        int i9;
        Composer composer2;
        Modifier modifier3;
        my myVar5;
        ny nyVar3;
        float f3;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors3;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        int i10;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Modifier modifier4;
        my myVar6;
        ny nyVar4;
        float f4;
        WindowInsets windowInsets4;
        TopAppBarColors topAppBarColors4;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-302230691);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            myVar3 = myVar;
        } else {
            myVar3 = myVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(myVar3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                myVar4 = myVar2;
                i3 |= startRestartGroup.changedInstance(myVar4) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    nyVar2 = nyVar;
                    i3 |= startRestartGroup.changedInstance(nyVar2) ? Fields.CameraDistance : Fields.RotationZ;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        f2 = f;
                        i3 |= startRestartGroup.changed(f2) ? Fields.Clip : 8192;
                        if ((196608 & i) == 0) {
                            if ((i2 & 32) == 0) {
                                windowInsets2 = windowInsets;
                                if (startRestartGroup.changed(windowInsets2)) {
                                    i12 = Fields.RenderEffect;
                                    i3 |= i12;
                                }
                            } else {
                                windowInsets2 = windowInsets;
                            }
                            i12 = 65536;
                            i3 |= i12;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                topAppBarColors2 = topAppBarColors;
                                if (startRestartGroup.changed(topAppBarColors2)) {
                                    i11 = 1048576;
                                    i3 |= i11;
                                }
                            } else {
                                topAppBarColors2 = topAppBarColors;
                            }
                            i11 = Fields.BlendMode;
                            i3 |= i11;
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i7 = i2 & Fields.SpotShadowColor;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i8 = i7;
                            i3 |= startRestartGroup.changed(topAppBarScrollBehavior) ? GroupFlagsKt.IsNodeFlag : 4194304;
                            i9 = i3;
                            if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier3 = modifier2;
                                myVar5 = myVar4;
                                nyVar3 = nyVar2;
                                f3 = f2;
                                windowInsets3 = windowInsets2;
                                topAppBarColors3 = topAppBarColors2;
                                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier5 = i13 != 0 ? Modifier.Companion : modifier2;
                                    if (i4 != 0) {
                                        myVar4 = ComposableSingletons$AppBarKt.INSTANCE.getLambda$575301698$material3();
                                    }
                                    if (i5 != 0) {
                                        nyVar2 = ComposableSingletons$AppBarKt.INSTANCE.m1825getLambda$643931612$material3();
                                    }
                                    if (i6 != 0) {
                                        f2 = TopAppBarDefaults.INSTANCE.m2819getTopAppBarExpandedHeightD9Ej5fM();
                                    }
                                    if ((i2 & 32) != 0) {
                                        i10 = i9 & (-458753);
                                        windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                    } else {
                                        i10 = i9;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i10 &= -3670017;
                                        topAppBarColors2 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                    }
                                    if (i8 != 0) {
                                        modifier4 = modifier5;
                                        topAppBarScrollBehavior3 = null;
                                    } else {
                                        topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                        modifier4 = modifier5;
                                    }
                                    myVar6 = myVar4;
                                    nyVar4 = nyVar2;
                                    f4 = f2;
                                    windowInsets4 = windowInsets2;
                                    topAppBarColors4 = topAppBarColors2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    int i14 = (i2 & 32) != 0 ? i9 & (-458753) : i9;
                                    if ((i2 & 64) != 0) {
                                        i14 &= -3670017;
                                    }
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                    modifier4 = modifier2;
                                    myVar6 = myVar4;
                                    nyVar4 = nyVar2;
                                    windowInsets4 = windowInsets2;
                                    topAppBarColors4 = topAppBarColors2;
                                    i10 = i14;
                                    f4 = f2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-302230691, i10, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:349)");
                                }
                                TextStyle value = TypographyKt.getValue(AppBarSmallTokens.INSTANCE.getTitleFont(), startRestartGroup, 6);
                                TextStyle textStyle = TextStyle.Companion.getDefault();
                                Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                                Dp.Companion companion = Dp.Companion;
                                int i15 = i10 << 12;
                                composer2 = startRestartGroup;
                                m1623SingleRowTopAppBarwn8IZOc(modifier4, myVar3, value, null, textStyle, centerHorizontally, myVar6, nyVar4, (Dp.m7616equalsimpl0(f4, companion.m7631getUnspecifiedD9Ej5fM()) || Dp.m7616equalsimpl0(f4, companion.m7630getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2819getTopAppBarExpandedHeightD9Ej5fM() : f4, windowInsets4, topAppBarColors4, topAppBarScrollBehavior3, composer2, ((i10 >> 3) & 14) | 224256 | ((i10 << 3) & 112) | (3670016 & i15) | (29360128 & i15) | (i15 & 1879048192), (i10 >> 18) & 126, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f3 = f4;
                                modifier3 = modifier4;
                                myVar5 = myVar6;
                                nyVar3 = nyVar4;
                                windowInsets3 = windowInsets4;
                                topAppBarColors3 = topAppBarColors4;
                                topAppBarScrollBehavior2 = topAppBarScrollBehavior3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new c7(myVar, modifier3, myVar5, nyVar3, f3, windowInsets3, topAppBarColors3, topAppBarScrollBehavior2, i, i2, 1));
                                return;
                            }
                            return;
                        }
                        i8 = i7;
                        i9 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    f2 = f;
                    if ((196608 & i) == 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i2 & Fields.SpotShadowColor;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    i9 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                nyVar2 = nyVar;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                f2 = f;
                if ((196608 & i) == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                i7 = i2 & Fields.SpotShadowColor;
                if (i7 != 0) {
                }
                i8 = i7;
                i9 = i3;
                if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            myVar4 = myVar2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            nyVar2 = nyVar;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            f2 = f;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & Fields.SpotShadowColor;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i3;
            if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        myVar4 = myVar2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        nyVar2 = nyVar;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        f2 = f;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & Fields.SpotShadowColor;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i3;
        if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CenterAlignedTopAppBar_GHTll3U$lambda$3(my myVar, Modifier modifier, my myVar2, ny nyVar, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, Composer composer, int i3) {
        m1617CenterAlignedTopAppBarGHTll3U(myVar, modifier, myVar2, nyVar, f, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: FlexibleBottomAppBar-wBhsO_E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1618FlexibleBottomAppBarwBhsO_E(Modifier modifier, long j, long j2, PaddingValues paddingValues, Arrangement.Horizontal horizontal, float f, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, ny nyVar, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        PaddingValues paddingValues2;
        int i4;
        Arrangement.Horizontal horizontal2;
        int i5;
        int i6;
        int i7;
        Composer composer2;
        WindowInsets windowInsets2;
        Modifier modifier3;
        long j5;
        long j6;
        PaddingValues paddingValues3;
        Arrangement.Horizontal horizontal3;
        float f2;
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        float m1640getFlexibleBottomAppBarHeightD9Ej5fM$material3;
        WindowInsets windowInsets3;
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior3;
        WindowInsets windowInsets4;
        long j7;
        long j8;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1717957447);
        int i10 = i2 & 1;
        if (i10 != 0) {
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
                    i9 = 32;
                    i3 |= i9;
                }
            } else {
                j3 = j;
            }
            i9 = 16;
            i3 |= i9;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i8 = Fields.RotationX;
                    i3 |= i8;
                }
            } else {
                j4 = j2;
            }
            i8 = Fields.SpotShadowColor;
            i3 |= i8;
        } else {
            j4 = j2;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            paddingValues2 = paddingValues;
            i3 |= startRestartGroup.changed(paddingValues2) ? Fields.CameraDistance : Fields.RotationZ;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                horizontal2 = horizontal;
                i3 |= startRestartGroup.changed(horizontal2) ? Fields.Clip : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= startRestartGroup.changed(f) ? Fields.RenderEffect : 65536;
                }
                if ((i & 1572864) == 0) {
                    i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(windowInsets)) ? 1048576 : Fields.BlendMode;
                }
                i6 = i2 & Fields.SpotShadowColor;
                if (i6 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i7 = i6;
                    i3 |= startRestartGroup.changed(bottomAppBarScrollBehavior) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    if ((i2 & Fields.RotationX) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i10 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                if ((i2 & 2) != 0) {
                                    j3 = BottomAppBarDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                    i3 &= -113;
                                }
                                if ((i2 & 4) != 0) {
                                    j4 = ColorSchemeKt.m1797contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                                    i3 &= -897;
                                }
                                if (i11 != 0) {
                                    paddingValues2 = BottomAppBarDefaults.INSTANCE.getFlexibleContentPadding$material3();
                                }
                                if (i4 != 0) {
                                    horizontal2 = BottomAppBarDefaults.INSTANCE.getFlexibleHorizontalArrangement$material3();
                                }
                                m1640getFlexibleBottomAppBarHeightD9Ej5fM$material3 = i5 != 0 ? BottomAppBarDefaults.INSTANCE.m1640getFlexibleBottomAppBarHeightD9Ej5fM$material3() : f;
                                if ((i2 & 64) != 0) {
                                    windowInsets3 = BottomAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    windowInsets3 = windowInsets;
                                }
                                if (i7 != 0) {
                                    windowInsets4 = windowInsets3;
                                    j7 = j3;
                                    j8 = j4;
                                    bottomAppBarScrollBehavior3 = null;
                                    PaddingValues paddingValues4 = paddingValues2;
                                    Arrangement.Horizontal horizontal4 = horizontal2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1717957447, i3, -1, "androidx.compose.material3.FlexibleBottomAppBar (AppBar.kt:1297)");
                                    }
                                    int i12 = i3 << 6;
                                    int i13 = ((i3 >> 9) & 112) | 196608 | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (3670016 & (i3 << 9));
                                    int i14 = i3 << 3;
                                    composer2 = startRestartGroup;
                                    Modifier modifier4 = modifier2;
                                    m1616BottomAppBarLayoutt5fmz9U(((Float.floatToRawIntBits(m1640getFlexibleBottomAppBarHeightD9Ej5fM$material3) & Integer.MAX_VALUE) < 2139095040 || Float.isNaN(m1640getFlexibleBottomAppBarHeightD9Ej5fM$material3) || Dp.m7610compareTo0680j_4(m1640getFlexibleBottomAppBarHeightD9Ej5fM$material3, Dp.m7611constructorimpl(0.0f)) <= 0) ? BottomAppBarDefaults.INSTANCE.m1640getFlexibleBottomAppBarHeightD9Ej5fM$material3() : m1640getFlexibleBottomAppBarHeightD9Ej5fM$material3, horizontal4, modifier4, j7, j8, AppBarTokens.INSTANCE.m3015getContainerElevationD9Ej5fM(), paddingValues4, windowInsets4, bottomAppBarScrollBehavior3, nyVar, composer2, i13 | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f2 = m1640getFlexibleBottomAppBarHeightD9Ej5fM$material3;
                                    horizontal3 = horizontal4;
                                    modifier3 = modifier4;
                                    j5 = j7;
                                    j6 = j8;
                                    paddingValues3 = paddingValues4;
                                    windowInsets2 = windowInsets4;
                                    bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior3;
                                } else {
                                    bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior;
                                    windowInsets4 = windowInsets3;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                }
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                m1640getFlexibleBottomAppBarHeightD9Ej5fM$material3 = f;
                                windowInsets4 = windowInsets;
                                bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior;
                            }
                            j7 = j3;
                            j8 = j4;
                            PaddingValues paddingValues42 = paddingValues2;
                            Arrangement.Horizontal horizontal42 = horizontal2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if ((Float.floatToRawIntBits(m1640getFlexibleBottomAppBarHeightD9Ej5fM$material3) & Integer.MAX_VALUE) < 2139095040) {
                            }
                            int i122 = i3 << 6;
                            int i132 = ((i3 >> 9) & 112) | 196608 | (i122 & 896) | (i122 & 7168) | (i122 & 57344) | (3670016 & (i3 << 9));
                            int i142 = i3 << 3;
                            composer2 = startRestartGroup;
                            Modifier modifier42 = modifier2;
                            m1616BottomAppBarLayoutt5fmz9U(((Float.floatToRawIntBits(m1640getFlexibleBottomAppBarHeightD9Ej5fM$material3) & Integer.MAX_VALUE) < 2139095040 || Float.isNaN(m1640getFlexibleBottomAppBarHeightD9Ej5fM$material3) || Dp.m7610compareTo0680j_4(m1640getFlexibleBottomAppBarHeightD9Ej5fM$material3, Dp.m7611constructorimpl(0.0f)) <= 0) ? BottomAppBarDefaults.INSTANCE.m1640getFlexibleBottomAppBarHeightD9Ej5fM$material3() : m1640getFlexibleBottomAppBarHeightD9Ej5fM$material3, horizontal42, modifier42, j7, j8, AppBarTokens.INSTANCE.m3015getContainerElevationD9Ej5fM(), paddingValues42, windowInsets4, bottomAppBarScrollBehavior3, nyVar, composer2, i132 | (29360128 & i142) | (234881024 & i142) | (i142 & 1879048192), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f2 = m1640getFlexibleBottomAppBarHeightD9Ej5fM$material3;
                            horizontal3 = horizontal42;
                            modifier3 = modifier42;
                            j5 = j7;
                            j6 = j8;
                            paddingValues3 = paddingValues42;
                            windowInsets2 = windowInsets4;
                            bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            windowInsets2 = windowInsets;
                            modifier3 = modifier2;
                            j5 = j3;
                            j6 = j4;
                            paddingValues3 = paddingValues2;
                            horizontal3 = horizontal2;
                            f2 = f;
                            bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new z6(modifier3, j5, j6, paddingValues3, horizontal3, f2, windowInsets2, bottomAppBarScrollBehavior2, nyVar, i, i2));
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i7 = i6;
                if ((i2 & Fields.RotationX) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            horizontal2 = horizontal;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i6 = i2 & Fields.SpotShadowColor;
            if (i6 != 0) {
            }
            i7 = i6;
            if ((i2 & Fields.RotationX) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        horizontal2 = horizontal;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i6 = i2 & Fields.SpotShadowColor;
        if (i6 != 0) {
        }
        i7 = i6;
        if ((i2 & Fields.RotationX) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FlexibleBottomAppBar_wBhsO_E$lambda$16(Modifier modifier, long j, long j2, PaddingValues paddingValues, Arrangement.Horizontal horizontal, float f, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, ny nyVar, int i, int i2, Composer composer, int i3) {
        m1618FlexibleBottomAppBarwBhsO_E(modifier, j, j2, paddingValues, horizontal, f, windowInsets, bottomAppBarScrollBehavior, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0338  */
    /* renamed from: LargeFlexibleTopAppBar-eXZ4JBQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1619LargeFlexibleTopAppBareXZ4JBQ(my myVar, Modifier modifier, my myVar2, my myVar3, ny nyVar, Alignment.Horizontal horizontal, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        my myVar4;
        int i6;
        my myVar5;
        int i7;
        ny nyVar2;
        int i8;
        int i9;
        float f3;
        int i10;
        int i11;
        int i12;
        Composer composer2;
        Alignment.Horizontal horizontal2;
        TopAppBarColors topAppBarColors2;
        float f4;
        Modifier modifier3;
        my myVar6;
        my myVar7;
        ny nyVar3;
        float f5;
        WindowInsets windowInsets2;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        float m2811getLargeAppBarCollapsedHeightD9Ej5fM;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors3;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        my myVar8;
        ny nyVar4;
        Alignment.Horizontal horizontal3;
        WindowInsets windowInsets4;
        TopAppBarColors topAppBarColors4;
        Modifier modifier4;
        float m2813getLargeFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(1104319839);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i16 = i3 & 2;
        if (i16 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                myVar4 = myVar2;
                i4 |= startRestartGroup.changedInstance(myVar4) ? Fields.RotationX : Fields.SpotShadowColor;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    myVar5 = myVar3;
                    i4 |= startRestartGroup.changedInstance(myVar5) ? Fields.CameraDistance : Fields.RotationZ;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        nyVar2 = nyVar;
                        i4 |= startRestartGroup.changedInstance(nyVar2) ? Fields.Clip : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i4 |= startRestartGroup.changed(horizontal) ? Fields.RenderEffect : 65536;
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(f) ? 1048576 : Fields.BlendMode;
                        }
                        if ((i & 12582912) == 0) {
                            if ((i3 & Fields.SpotShadowColor) == 0) {
                                f3 = f2;
                                if (startRestartGroup.changed(f3)) {
                                    i15 = GroupFlagsKt.IsNodeFlag;
                                    i4 |= i15;
                                }
                            } else {
                                f3 = f2;
                            }
                            i15 = 4194304;
                            i4 |= i15;
                        } else {
                            f3 = f2;
                        }
                        if ((i & 100663296) == 0) {
                            if ((i3 & Fields.RotationX) == 0 && startRestartGroup.changed(windowInsets)) {
                                i14 = GroupFlagsKt.IsRecompositionRequiredFlag;
                                i4 |= i14;
                            }
                            i14 = GroupFlagsKt.HasAuxSlotFlag;
                            i4 |= i14;
                        }
                        if ((i & 805306368) == 0) {
                            if ((i3 & Fields.RotationY) == 0 && startRestartGroup.changed(topAppBarColors)) {
                                i13 = GroupFlagsKt.HasMovableContentFlag;
                                i4 |= i13;
                            }
                            i13 = GroupFlagsKt.IsMovableContentFlag;
                            i4 |= i13;
                        }
                        i10 = i3 & Fields.RotationZ;
                        if (i10 != 0) {
                            i11 = i10;
                            i12 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i11 = i10;
                            i12 = i2 | (startRestartGroup.changed(topAppBarScrollBehavior) ? 4 : 2);
                        } else {
                            i11 = i10;
                            i12 = i2;
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i16 != 0 ? Modifier.Companion : modifier2;
                                if (i5 != 0) {
                                    myVar4 = null;
                                }
                                my m1828getLambda$780193532$material3 = i6 != 0 ? ComposableSingletons$AppBarKt.INSTANCE.m1828getLambda$780193532$material3() : myVar5;
                                ny m1818getLambda$1846660506$material3 = i7 != 0 ? ComposableSingletons$AppBarKt.INSTANCE.m1818getLambda$1846660506$material3() : nyVar2;
                                Alignment.Horizontal start = i8 != 0 ? Alignment.Companion.getStart() : horizontal;
                                m2811getLargeAppBarCollapsedHeightD9Ej5fM = i9 != 0 ? TopAppBarDefaults.INSTANCE.m2811getLargeAppBarCollapsedHeightD9Ej5fM() : f;
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    f3 = myVar4 != null ? TopAppBarDefaults.INSTANCE.m2813getLargeFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM() : TopAppBarDefaults.INSTANCE.m2814getLargeFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM();
                                    i4 &= -29360129;
                                }
                                if ((i3 & Fields.RotationX) != 0) {
                                    windowInsets3 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                    i4 &= -234881025;
                                } else {
                                    windowInsets3 = windowInsets;
                                }
                                if ((i3 & Fields.RotationY) != 0) {
                                    topAppBarColors3 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                    i4 &= -1879048193;
                                } else {
                                    topAppBarColors3 = topAppBarColors;
                                }
                                topAppBarScrollBehavior3 = i11 != 0 ? null : topAppBarScrollBehavior;
                                myVar8 = m1828getLambda$780193532$material3;
                                nyVar4 = m1818getLambda$1846660506$material3;
                                horizontal3 = start;
                                windowInsets4 = windowInsets3;
                                topAppBarColors4 = topAppBarColors3;
                                modifier4 = modifier5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    i4 &= -29360129;
                                }
                                if ((i3 & Fields.RotationX) != 0) {
                                    i4 &= -234881025;
                                }
                                if ((i3 & Fields.RotationY) != 0) {
                                    i4 &= -1879048193;
                                }
                                horizontal3 = horizontal;
                                windowInsets4 = windowInsets;
                                topAppBarColors4 = topAppBarColors;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                myVar8 = myVar5;
                                nyVar4 = nyVar2;
                                m2811getLargeAppBarCollapsedHeightD9Ej5fM = f;
                                modifier4 = modifier2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1104319839, i4, i12, "androidx.compose.material3.LargeFlexibleTopAppBar (AppBar.kt:858)");
                            }
                            AppBarLargeFlexibleTokens appBarLargeFlexibleTokens = AppBarLargeFlexibleTokens.INSTANCE;
                            TextStyle value = TypographyKt.getValue(appBarLargeFlexibleTokens.getTitleFont(), startRestartGroup, 6);
                            AppBarSmallTokens appBarSmallTokens = AppBarSmallTokens.INSTANCE;
                            TextStyle value2 = TypographyKt.getValue(appBarSmallTokens.getTitleFont(), startRestartGroup, 6);
                            float f6 = LargeTitleBottomPadding;
                            my m1826getLambda$661145402$material3 = myVar4 == null ? ComposableSingletons$AppBarKt.INSTANCE.m1826getLambda$661145402$material3() : myVar4;
                            TextStyle value3 = TypographyKt.getValue(appBarLargeFlexibleTokens.getSubtitleFont(), startRestartGroup, 6);
                            my m1811getLambda$1113422563$material3 = myVar4 == null ? ComposableSingletons$AppBarKt.INSTANCE.m1811getLambda$1113422563$material3() : myVar4;
                            TextStyle value4 = TypographyKt.getValue(appBarSmallTokens.getSubtitleFont(), startRestartGroup, 6);
                            Dp.Companion companion = Dp.Companion;
                            float m2811getLargeAppBarCollapsedHeightD9Ej5fM2 = (Dp.m7616equalsimpl0(m2811getLargeAppBarCollapsedHeightD9Ej5fM, companion.m7631getUnspecifiedD9Ej5fM()) || Dp.m7616equalsimpl0(m2811getLargeAppBarCollapsedHeightD9Ej5fM, companion.m7630getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2811getLargeAppBarCollapsedHeightD9Ej5fM() : m2811getLargeAppBarCollapsedHeightD9Ej5fM;
                            if (Dp.m7616equalsimpl0(f3, companion.m7631getUnspecifiedD9Ej5fM()) || Dp.m7616equalsimpl0(f3, companion.m7630getInfinityD9Ej5fM())) {
                                m2813getLargeFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM = myVar4 != null ? TopAppBarDefaults.INSTANCE.m2813getLargeFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM() : TopAppBarDefaults.INSTANCE.m2814getLargeFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM();
                            } else {
                                m2813getLargeFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM = f3;
                            }
                            int i17 = i4 >> 6;
                            int i18 = ((i4 >> 15) & 14) | (i17 & 112) | (i17 & 896);
                            int i19 = i4 >> 9;
                            composer2 = startRestartGroup;
                            m1628TwoRowsTopAppBarpJA5dT0(modifier4, myVar, value, f6, myVar, value2, m1826getLambda$661145402$material3, value3, m1811getLambda$1113422563$material3, value4, horizontal3, myVar8, nyVar4, m2811getLargeAppBarCollapsedHeightD9Ej5fM2, m2813getLargeFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM, windowInsets4, topAppBarColors4, topAppBarScrollBehavior3, composer2, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112) | ((i4 << 12) & 57344), i18 | (458752 & i19) | (i19 & 3670016) | ((i12 << 21) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f4 = f3;
                            myVar6 = myVar4;
                            f5 = m2811getLargeAppBarCollapsedHeightD9Ej5fM;
                            modifier3 = modifier4;
                            horizontal2 = horizontal3;
                            myVar7 = myVar8;
                            nyVar3 = nyVar4;
                            windowInsets2 = windowInsets4;
                            topAppBarColors2 = topAppBarColors4;
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            horizontal2 = horizontal;
                            topAppBarColors2 = topAppBarColors;
                            f4 = f3;
                            modifier3 = modifier2;
                            myVar6 = myVar4;
                            myVar7 = myVar5;
                            nyVar3 = nyVar2;
                            f5 = f;
                            windowInsets2 = windowInsets;
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new w6(myVar, modifier3, myVar6, myVar7, nyVar3, horizontal2, f5, f4, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, i, i2, i3, 0));
                            return;
                        }
                        return;
                    }
                    nyVar2 = nyVar;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    if ((i & 100663296) == 0) {
                    }
                    if ((i & 805306368) == 0) {
                    }
                    i10 = i3 & Fields.RotationZ;
                    if (i10 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                myVar5 = myVar3;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                nyVar2 = nyVar;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i10 = i3 & Fields.RotationZ;
                if (i10 != 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            myVar4 = myVar2;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            myVar5 = myVar3;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            nyVar2 = nyVar;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i10 = i3 & Fields.RotationZ;
            if (i10 != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        myVar4 = myVar2;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        myVar5 = myVar3;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        nyVar2 = nyVar;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i10 = i3 & Fields.RotationZ;
        if (i10 != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LargeFlexibleTopAppBar_eXZ4JBQ$lambda$10(my myVar, Modifier modifier, my myVar2, my myVar3, ny nyVar, Alignment.Horizontal horizontal, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3, Composer composer, int i4) {
        m1619LargeFlexibleTopAppBareXZ4JBQ(myVar, modifier, myVar2, myVar3, nyVar, horizontal, f, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0065  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LargeTopAppBar(my myVar, Modifier modifier, my myVar2, ny nyVar, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i, int i2) {
        my myVar3;
        int i3;
        Modifier modifier2;
        int i4;
        my myVar4;
        int i5;
        ny nyVar2;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Composer composer2;
        Modifier modifier3;
        my myVar5;
        ny nyVar3;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors3;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        ScopeUpdateScope endRestartGroup;
        TopAppBarColors topAppBarColors4;
        TopAppBarScrollBehavior topAppBarScrollBehavior4;
        int i7;
        ny nyVar4;
        Modifier modifier4;
        WindowInsets windowInsets4;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-330927229);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            myVar3 = myVar;
        } else {
            myVar3 = myVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(myVar3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                myVar4 = myVar2;
                i3 |= startRestartGroup.changedInstance(myVar4) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    nyVar2 = nyVar;
                    i3 |= startRestartGroup.changedInstance(nyVar2) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            if (startRestartGroup.changed(windowInsets2)) {
                                i9 = Fields.Clip;
                                i3 |= i9;
                            }
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i9 = 8192;
                        i3 |= i9;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColors2 = topAppBarColors;
                            if (startRestartGroup.changed(topAppBarColors2)) {
                                i8 = Fields.RenderEffect;
                                i3 |= i8;
                            }
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i8 = 65536;
                        i3 |= i8;
                    } else {
                        topAppBarColors2 = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                        i3 |= startRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : Fields.BlendMode;
                        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i10 != 0 ? Modifier.Companion : modifier2;
                                if (i4 != 0) {
                                    myVar4 = ComposableSingletons$AppBarKt.INSTANCE.m1827getLambda$699106370$material3();
                                }
                                if (i5 != 0) {
                                    nyVar2 = ComposableSingletons$AppBarKt.INSTANCE.getLambda$1702484764$material3();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    topAppBarColors2 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                }
                                if (i6 != 0) {
                                    topAppBarScrollBehavior4 = null;
                                    topAppBarColors4 = topAppBarColors2;
                                } else {
                                    topAppBarColors4 = topAppBarColors2;
                                    topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                                }
                                i7 = -330927229;
                                nyVar4 = nyVar2;
                                modifier4 = modifier5;
                                windowInsets4 = windowInsets2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                topAppBarColors4 = topAppBarColors2;
                                topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                                i7 = -330927229;
                                nyVar4 = nyVar2;
                                windowInsets4 = windowInsets2;
                                modifier4 = modifier2;
                            }
                            my myVar6 = myVar4;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i7, i3, -1, "androidx.compose.material3.LargeTopAppBar (AppBar.kt:696)");
                            }
                            TopAppBarDefaults topAppBarDefaults = TopAppBarDefaults.INSTANCE;
                            int i11 = i3 << 6;
                            composer2 = startRestartGroup;
                            m1620LargeTopAppBaroKE7A98(myVar3, modifier4, myVar6, nyVar4, topAppBarDefaults.m2811getLargeAppBarCollapsedHeightD9Ej5fM(), topAppBarDefaults.m2812getLargeAppBarExpandedHeightD9Ej5fM(), windowInsets4, topAppBarColors4, topAppBarScrollBehavior4, composer2, (3670016 & i11) | (i3 & 14) | 221184 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (29360128 & i11) | (i11 & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            myVar5 = myVar6;
                            nyVar3 = nyVar4;
                            windowInsets3 = windowInsets4;
                            topAppBarColors3 = topAppBarColors4;
                            topAppBarScrollBehavior3 = topAppBarScrollBehavior4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            myVar5 = myVar4;
                            nyVar3 = nyVar2;
                            windowInsets3 = windowInsets2;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new v6(myVar, modifier3, myVar5, nyVar3, windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, i, i2, 1));
                            return;
                        }
                        return;
                    }
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                nyVar2 = nyVar;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            myVar4 = myVar2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            nyVar2 = nyVar;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        myVar4 = myVar2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        nyVar2 = nyVar;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LargeTopAppBar$lambda$8(my myVar, Modifier modifier, my myVar2, ny nyVar, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, Composer composer, int i3) {
        LargeTopAppBar(myVar, modifier, myVar2, nyVar, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: LargeTopAppBar-oKE7A98, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1620LargeTopAppBaroKE7A98(my myVar, Modifier modifier, my myVar2, ny nyVar, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i, int i2) {
        my myVar3;
        int i3;
        Modifier modifier2;
        int i4;
        my myVar4;
        int i5;
        ny nyVar2;
        int i6;
        float f3;
        int i7;
        float f4;
        int i8;
        int i9;
        int i10;
        Composer composer2;
        WindowInsets windowInsets2;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier modifier3;
        my myVar5;
        ny nyVar3;
        float f5;
        float f6;
        TopAppBarColors topAppBarColors2;
        ScopeUpdateScope endRestartGroup;
        WindowInsets windowInsets3;
        int i11;
        TopAppBarColors topAppBarColors3;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        WindowInsets windowInsets4;
        TopAppBarColors topAppBarColors4;
        my myVar6;
        ny nyVar4;
        float f7;
        Modifier modifier4;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1406602045);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            myVar3 = myVar;
        } else {
            myVar3 = myVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(myVar3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                myVar4 = myVar2;
                i3 |= startRestartGroup.changedInstance(myVar4) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    nyVar2 = nyVar;
                    i3 |= startRestartGroup.changedInstance(nyVar2) ? Fields.CameraDistance : Fields.RotationZ;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        f3 = f;
                        i3 |= startRestartGroup.changed(f3) ? Fields.Clip : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else if ((196608 & i) == 0) {
                            f4 = f2;
                            i3 |= startRestartGroup.changed(f4) ? Fields.RenderEffect : 65536;
                            if ((i & 1572864) == 0) {
                                i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(windowInsets)) ? 1048576 : Fields.BlendMode;
                            }
                            if ((i & 12582912) == 0) {
                                if ((i2 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(topAppBarColors)) {
                                    i13 = GroupFlagsKt.IsNodeFlag;
                                    i3 |= i13;
                                }
                                i13 = 4194304;
                                i3 |= i13;
                            }
                            i8 = i2 & Fields.RotationX;
                            if (i8 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i9 = i8;
                                i3 |= startRestartGroup.changed(topAppBarScrollBehavior) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                                i10 = i3;
                                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i14 != 0) {
                                            modifier2 = Modifier.Companion;
                                        }
                                        if (i4 != 0) {
                                            myVar4 = ComposableSingletons$AppBarKt.INSTANCE.m1813getLambda$1230986050$material3();
                                        }
                                        if (i5 != 0) {
                                            nyVar2 = ComposableSingletons$AppBarKt.INSTANCE.getLambda$1921811868$material3();
                                        }
                                        if (i6 != 0) {
                                            f3 = TopAppBarDefaults.INSTANCE.m2811getLargeAppBarCollapsedHeightD9Ej5fM();
                                        }
                                        if (i7 != 0) {
                                            f4 = TopAppBarDefaults.INSTANCE.m2812getLargeAppBarExpandedHeightD9Ej5fM();
                                        }
                                        if ((i2 & 64) != 0) {
                                            windowInsets3 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                            i11 = i10 & (-3670017);
                                        } else {
                                            windowInsets3 = windowInsets;
                                            i11 = i10;
                                        }
                                        if ((i2 & Fields.SpotShadowColor) != 0) {
                                            topAppBarColors3 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                            i11 &= -29360129;
                                        } else {
                                            topAppBarColors3 = topAppBarColors;
                                        }
                                        if (i9 != 0) {
                                            windowInsets4 = windowInsets3;
                                            topAppBarColors4 = topAppBarColors3;
                                            myVar6 = myVar4;
                                            topAppBarScrollBehavior3 = null;
                                        } else {
                                            topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                            windowInsets4 = windowInsets3;
                                            topAppBarColors4 = topAppBarColors3;
                                            myVar6 = myVar4;
                                        }
                                        nyVar4 = nyVar2;
                                        f7 = f3;
                                        modifier4 = modifier2;
                                        i12 = i11;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        int i15 = (i2 & 64) != 0 ? i10 & (-3670017) : i10;
                                        if ((i2 & Fields.SpotShadowColor) != 0) {
                                            i15 &= -29360129;
                                        }
                                        Modifier modifier5 = modifier2;
                                        i12 = i15;
                                        f7 = f3;
                                        modifier4 = modifier5;
                                        windowInsets4 = windowInsets;
                                        topAppBarColors4 = topAppBarColors;
                                        topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                        myVar6 = myVar4;
                                        nyVar4 = nyVar2;
                                    }
                                    float f8 = f4;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1406602045, i12, -1, "androidx.compose.material3.LargeTopAppBar (AppBar.kt:763)");
                                    }
                                    TextStyle value = TypographyKt.getValue(AppBarLargeTokens.INSTANCE.getTitleFont(), startRestartGroup, 6);
                                    TextStyle value2 = TypographyKt.getValue(AppBarSmallTokens.INSTANCE.getTitleFont(), startRestartGroup, 6);
                                    float f9 = LargeTitleBottomPadding;
                                    TextStyle.Companion companion = TextStyle.Companion;
                                    TextStyle textStyle = companion.getDefault();
                                    TextStyle textStyle2 = companion.getDefault();
                                    Alignment.Horizontal start = Alignment.Companion.getStart();
                                    Dp.Companion companion2 = Dp.Companion;
                                    float m2811getLargeAppBarCollapsedHeightD9Ej5fM = (Dp.m7616equalsimpl0(f7, companion2.m7631getUnspecifiedD9Ej5fM()) || Dp.m7616equalsimpl0(f7, companion2.m7630getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2811getLargeAppBarCollapsedHeightD9Ej5fM() : f7;
                                    float m2812getLargeAppBarExpandedHeightD9Ej5fM = (Dp.m7616equalsimpl0(f8, companion2.m7631getUnspecifiedD9Ej5fM()) || Dp.m7616equalsimpl0(f8, companion2.m7630getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2812getLargeAppBarExpandedHeightD9Ej5fM() : f8;
                                    int i16 = i12 >> 3;
                                    composer2 = startRestartGroup;
                                    m1628TwoRowsTopAppBarpJA5dT0(modifier4, myVar3, value, f9, myVar, value2, null, textStyle, null, textStyle2, start, myVar6, nyVar4, m2811getLargeAppBarCollapsedHeightD9Ej5fM, m2812getLargeAppBarExpandedHeightD9Ej5fM, windowInsets4, topAppBarColors4, topAppBarScrollBehavior3, composer2, (i16 & 14) | 920128512 | ((i12 << 3) & 112) | ((i12 << 12) & 57344), 6 | (i16 & 112) | (i16 & 896) | (458752 & i16) | (3670016 & i16) | (29360128 & i16), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f5 = f7;
                                    f6 = f8;
                                    modifier3 = modifier4;
                                    myVar5 = myVar6;
                                    nyVar3 = nyVar4;
                                    windowInsets2 = windowInsets4;
                                    topAppBarColors2 = topAppBarColors4;
                                    topAppBarScrollBehavior2 = topAppBarScrollBehavior3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    windowInsets2 = windowInsets;
                                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                    modifier3 = modifier2;
                                    myVar5 = myVar4;
                                    nyVar3 = nyVar2;
                                    f5 = f3;
                                    f6 = f4;
                                    topAppBarColors2 = topAppBarColors;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new b7(myVar, modifier3, myVar5, nyVar3, f5, f6, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, i, i2, 1));
                                    return;
                                }
                                return;
                            }
                            i9 = i8;
                            i10 = i3;
                            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        f4 = f2;
                        if ((i & 1572864) == 0) {
                        }
                        if ((i & 12582912) == 0) {
                        }
                        i8 = i2 & Fields.RotationX;
                        if (i8 == 0) {
                        }
                        i9 = i8;
                        i10 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    f3 = f;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    f4 = f2;
                    if ((i & 1572864) == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i8 = i2 & Fields.RotationX;
                    if (i8 == 0) {
                    }
                    i9 = i8;
                    i10 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                nyVar2 = nyVar;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                f3 = f;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                f4 = f2;
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i2 & Fields.RotationX;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i3;
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            myVar4 = myVar2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            nyVar2 = nyVar;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            f3 = f;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            f4 = f2;
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i2 & Fields.RotationX;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3;
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        myVar4 = myVar2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        nyVar2 = nyVar;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        f3 = f;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        f4 = f2;
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i2 & Fields.RotationX;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3;
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LargeTopAppBar_oKE7A98$lambda$9(my myVar, Modifier modifier, my myVar2, ny nyVar, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, Composer composer, int i3) {
        m1620LargeTopAppBaroKE7A98(myVar, modifier, myVar2, nyVar, f, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0338  */
    /* renamed from: MediumFlexibleTopAppBar-eXZ4JBQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1621MediumFlexibleTopAppBareXZ4JBQ(my myVar, Modifier modifier, my myVar2, my myVar3, ny nyVar, Alignment.Horizontal horizontal, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        my myVar4;
        int i6;
        my myVar5;
        int i7;
        ny nyVar2;
        int i8;
        int i9;
        float f3;
        int i10;
        int i11;
        int i12;
        Composer composer2;
        Alignment.Horizontal horizontal2;
        TopAppBarColors topAppBarColors2;
        float f4;
        Modifier modifier3;
        my myVar6;
        my myVar7;
        ny nyVar3;
        float f5;
        WindowInsets windowInsets2;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        float m2815getMediumAppBarCollapsedHeightD9Ej5fM;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors3;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        my myVar8;
        ny nyVar4;
        Alignment.Horizontal horizontal3;
        WindowInsets windowInsets4;
        TopAppBarColors topAppBarColors4;
        Modifier modifier4;
        float m2817getMediumFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-1895470263);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i16 = i3 & 2;
        if (i16 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                myVar4 = myVar2;
                i4 |= startRestartGroup.changedInstance(myVar4) ? Fields.RotationX : Fields.SpotShadowColor;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    myVar5 = myVar3;
                    i4 |= startRestartGroup.changedInstance(myVar5) ? Fields.CameraDistance : Fields.RotationZ;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        nyVar2 = nyVar;
                        i4 |= startRestartGroup.changedInstance(nyVar2) ? Fields.Clip : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i4 |= startRestartGroup.changed(horizontal) ? Fields.RenderEffect : 65536;
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(f) ? 1048576 : Fields.BlendMode;
                        }
                        if ((i & 12582912) == 0) {
                            if ((i3 & Fields.SpotShadowColor) == 0) {
                                f3 = f2;
                                if (startRestartGroup.changed(f3)) {
                                    i15 = GroupFlagsKt.IsNodeFlag;
                                    i4 |= i15;
                                }
                            } else {
                                f3 = f2;
                            }
                            i15 = 4194304;
                            i4 |= i15;
                        } else {
                            f3 = f2;
                        }
                        if ((i & 100663296) == 0) {
                            if ((i3 & Fields.RotationX) == 0 && startRestartGroup.changed(windowInsets)) {
                                i14 = GroupFlagsKt.IsRecompositionRequiredFlag;
                                i4 |= i14;
                            }
                            i14 = GroupFlagsKt.HasAuxSlotFlag;
                            i4 |= i14;
                        }
                        if ((i & 805306368) == 0) {
                            if ((i3 & Fields.RotationY) == 0 && startRestartGroup.changed(topAppBarColors)) {
                                i13 = GroupFlagsKt.HasMovableContentFlag;
                                i4 |= i13;
                            }
                            i13 = GroupFlagsKt.IsMovableContentFlag;
                            i4 |= i13;
                        }
                        i10 = i3 & Fields.RotationZ;
                        if (i10 != 0) {
                            i11 = i10;
                            i12 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i11 = i10;
                            i12 = i2 | (startRestartGroup.changed(topAppBarScrollBehavior) ? 4 : 2);
                        } else {
                            i11 = i10;
                            i12 = i2;
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i16 != 0 ? Modifier.Companion : modifier2;
                                if (i5 != 0) {
                                    myVar4 = null;
                                }
                                my m1819getLambda$185842620$material3 = i6 != 0 ? ComposableSingletons$AppBarKt.INSTANCE.m1819getLambda$185842620$material3() : myVar5;
                                ny lambda$1113419554$material3 = i7 != 0 ? ComposableSingletons$AppBarKt.INSTANCE.getLambda$1113419554$material3() : nyVar2;
                                Alignment.Horizontal start = i8 != 0 ? Alignment.Companion.getStart() : horizontal;
                                m2815getMediumAppBarCollapsedHeightD9Ej5fM = i9 != 0 ? TopAppBarDefaults.INSTANCE.m2815getMediumAppBarCollapsedHeightD9Ej5fM() : f;
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    f3 = myVar4 != null ? TopAppBarDefaults.INSTANCE.m2817getMediumFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM() : TopAppBarDefaults.INSTANCE.m2818getMediumFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM();
                                    i4 &= -29360129;
                                }
                                if ((i3 & Fields.RotationX) != 0) {
                                    windowInsets3 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                    i4 &= -234881025;
                                } else {
                                    windowInsets3 = windowInsets;
                                }
                                if ((i3 & Fields.RotationY) != 0) {
                                    topAppBarColors3 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                    i4 &= -1879048193;
                                } else {
                                    topAppBarColors3 = topAppBarColors;
                                }
                                topAppBarScrollBehavior3 = i11 != 0 ? null : topAppBarScrollBehavior;
                                myVar8 = m1819getLambda$185842620$material3;
                                nyVar4 = lambda$1113419554$material3;
                                horizontal3 = start;
                                windowInsets4 = windowInsets3;
                                topAppBarColors4 = topAppBarColors3;
                                modifier4 = modifier5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    i4 &= -29360129;
                                }
                                if ((i3 & Fields.RotationX) != 0) {
                                    i4 &= -234881025;
                                }
                                if ((i3 & Fields.RotationY) != 0) {
                                    i4 &= -1879048193;
                                }
                                horizontal3 = horizontal;
                                windowInsets4 = windowInsets;
                                topAppBarColors4 = topAppBarColors;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                myVar8 = myVar5;
                                nyVar4 = nyVar2;
                                m2815getMediumAppBarCollapsedHeightD9Ej5fM = f;
                                modifier4 = modifier2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1895470263, i4, i12, "androidx.compose.material3.MediumFlexibleTopAppBar (AppBar.kt:613)");
                            }
                            AppBarMediumFlexibleTokens appBarMediumFlexibleTokens = AppBarMediumFlexibleTokens.INSTANCE;
                            TextStyle value = TypographyKt.getValue(appBarMediumFlexibleTokens.getTitleFont(), startRestartGroup, 6);
                            AppBarSmallTokens appBarSmallTokens = AppBarSmallTokens.INSTANCE;
                            TextStyle value2 = TypographyKt.getValue(appBarSmallTokens.getTitleFont(), startRestartGroup, 6);
                            float f6 = MediumTitleBottomPadding;
                            my m1829getLambda$790317886$material3 = myVar4 == null ? ComposableSingletons$AppBarKt.INSTANCE.m1829getLambda$790317886$material3() : myVar4;
                            TextStyle value3 = TypographyKt.getValue(appBarMediumFlexibleTokens.getSubtitleFont(), startRestartGroup, 6);
                            my m1820getLambda$1926007989$material3 = myVar4 == null ? ComposableSingletons$AppBarKt.INSTANCE.m1820getLambda$1926007989$material3() : myVar4;
                            TextStyle value4 = TypographyKt.getValue(appBarSmallTokens.getSubtitleFont(), startRestartGroup, 6);
                            Dp.Companion companion = Dp.Companion;
                            float m2815getMediumAppBarCollapsedHeightD9Ej5fM2 = (Dp.m7616equalsimpl0(m2815getMediumAppBarCollapsedHeightD9Ej5fM, companion.m7631getUnspecifiedD9Ej5fM()) || Dp.m7616equalsimpl0(m2815getMediumAppBarCollapsedHeightD9Ej5fM, companion.m7630getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2815getMediumAppBarCollapsedHeightD9Ej5fM() : m2815getMediumAppBarCollapsedHeightD9Ej5fM;
                            if (Dp.m7616equalsimpl0(f3, companion.m7631getUnspecifiedD9Ej5fM()) || Dp.m7616equalsimpl0(f3, companion.m7630getInfinityD9Ej5fM())) {
                                m2817getMediumFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM = myVar4 != null ? TopAppBarDefaults.INSTANCE.m2817getMediumFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM() : TopAppBarDefaults.INSTANCE.m2818getMediumFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM();
                            } else {
                                m2817getMediumFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM = f3;
                            }
                            int i17 = i4 >> 6;
                            int i18 = ((i4 >> 15) & 14) | (i17 & 112) | (i17 & 896);
                            int i19 = i4 >> 9;
                            composer2 = startRestartGroup;
                            m1628TwoRowsTopAppBarpJA5dT0(modifier4, myVar, value, f6, myVar, value2, m1829getLambda$790317886$material3, value3, m1820getLambda$1926007989$material3, value4, horizontal3, myVar8, nyVar4, m2815getMediumAppBarCollapsedHeightD9Ej5fM2, m2817getMediumFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM, windowInsets4, topAppBarColors4, topAppBarScrollBehavior3, composer2, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112) | ((i4 << 12) & 57344), i18 | (458752 & i19) | (i19 & 3670016) | ((i12 << 21) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f4 = f3;
                            myVar6 = myVar4;
                            f5 = m2815getMediumAppBarCollapsedHeightD9Ej5fM;
                            modifier3 = modifier4;
                            horizontal2 = horizontal3;
                            myVar7 = myVar8;
                            nyVar3 = nyVar4;
                            windowInsets2 = windowInsets4;
                            topAppBarColors2 = topAppBarColors4;
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            horizontal2 = horizontal;
                            topAppBarColors2 = topAppBarColors;
                            f4 = f3;
                            modifier3 = modifier2;
                            myVar6 = myVar4;
                            myVar7 = myVar5;
                            nyVar3 = nyVar2;
                            f5 = f;
                            windowInsets2 = windowInsets;
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new w6(myVar, modifier3, myVar6, myVar7, nyVar3, horizontal2, f5, f4, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, i, i2, i3, 1));
                            return;
                        }
                        return;
                    }
                    nyVar2 = nyVar;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    if ((i & 100663296) == 0) {
                    }
                    if ((i & 805306368) == 0) {
                    }
                    i10 = i3 & Fields.RotationZ;
                    if (i10 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                myVar5 = myVar3;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                nyVar2 = nyVar;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i10 = i3 & Fields.RotationZ;
                if (i10 != 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            myVar4 = myVar2;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            myVar5 = myVar3;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            nyVar2 = nyVar;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i10 = i3 & Fields.RotationZ;
            if (i10 != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        myVar4 = myVar2;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        myVar5 = myVar3;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        nyVar2 = nyVar;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i10 = i3 & Fields.RotationZ;
        if (i10 != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 MediumFlexibleTopAppBar_eXZ4JBQ$lambda$7(my myVar, Modifier modifier, my myVar2, my myVar3, ny nyVar, Alignment.Horizontal horizontal, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3, Composer composer, int i4) {
        m1621MediumFlexibleTopAppBareXZ4JBQ(myVar, modifier, myVar2, myVar3, nyVar, horizontal, f, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0065  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void MediumTopAppBar(my myVar, Modifier modifier, my myVar2, ny nyVar, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i, int i2) {
        my myVar3;
        int i3;
        Modifier modifier2;
        int i4;
        my myVar4;
        int i5;
        ny nyVar2;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Composer composer2;
        Modifier modifier3;
        my myVar5;
        ny nyVar3;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors3;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        ScopeUpdateScope endRestartGroup;
        TopAppBarColors topAppBarColors4;
        TopAppBarScrollBehavior topAppBarScrollBehavior4;
        int i7;
        ny nyVar4;
        Modifier modifier4;
        WindowInsets windowInsets4;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-319217319);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            myVar3 = myVar;
        } else {
            myVar3 = myVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(myVar3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                myVar4 = myVar2;
                i3 |= startRestartGroup.changedInstance(myVar4) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    nyVar2 = nyVar;
                    i3 |= startRestartGroup.changedInstance(nyVar2) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            if (startRestartGroup.changed(windowInsets2)) {
                                i9 = Fields.Clip;
                                i3 |= i9;
                            }
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i9 = 8192;
                        i3 |= i9;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColors2 = topAppBarColors;
                            if (startRestartGroup.changed(topAppBarColors2)) {
                                i8 = Fields.RenderEffect;
                                i3 |= i8;
                            }
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i8 = 65536;
                        i3 |= i8;
                    } else {
                        topAppBarColors2 = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                        i3 |= startRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : Fields.BlendMode;
                        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i10 != 0 ? Modifier.Companion : modifier2;
                                if (i4 != 0) {
                                    myVar4 = ComposableSingletons$AppBarKt.INSTANCE.getLambda$1152131198$material3();
                                }
                                if (i5 != 0) {
                                    nyVar2 = ComposableSingletons$AppBarKt.INSTANCE.m1817getLambda$1707954976$material3();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    topAppBarColors2 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                }
                                if (i6 != 0) {
                                    topAppBarScrollBehavior4 = null;
                                    topAppBarColors4 = topAppBarColors2;
                                } else {
                                    topAppBarColors4 = topAppBarColors2;
                                    topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                                }
                                i7 = -319217319;
                                nyVar4 = nyVar2;
                                modifier4 = modifier5;
                                windowInsets4 = windowInsets2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                topAppBarColors4 = topAppBarColors2;
                                topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                                i7 = -319217319;
                                nyVar4 = nyVar2;
                                windowInsets4 = windowInsets2;
                                modifier4 = modifier2;
                            }
                            my myVar6 = myVar4;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i7, i3, -1, "androidx.compose.material3.MediumTopAppBar (AppBar.kt:451)");
                            }
                            TopAppBarDefaults topAppBarDefaults = TopAppBarDefaults.INSTANCE;
                            int i11 = i3 << 6;
                            composer2 = startRestartGroup;
                            m1622MediumTopAppBaroKE7A98(myVar3, modifier4, myVar6, nyVar4, topAppBarDefaults.m2815getMediumAppBarCollapsedHeightD9Ej5fM(), topAppBarDefaults.m2816getMediumAppBarExpandedHeightD9Ej5fM(), windowInsets4, topAppBarColors4, topAppBarScrollBehavior4, composer2, (3670016 & i11) | (i3 & 14) | 221184 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (29360128 & i11) | (i11 & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            myVar5 = myVar6;
                            nyVar3 = nyVar4;
                            windowInsets3 = windowInsets4;
                            topAppBarColors3 = topAppBarColors4;
                            topAppBarScrollBehavior3 = topAppBarScrollBehavior4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            myVar5 = myVar4;
                            nyVar3 = nyVar2;
                            windowInsets3 = windowInsets2;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new v6(myVar, modifier3, myVar5, nyVar3, windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, i, i2, 3));
                            return;
                        }
                        return;
                    }
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                nyVar2 = nyVar;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            myVar4 = myVar2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            nyVar2 = nyVar;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        myVar4 = myVar2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        nyVar2 = nyVar;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 MediumTopAppBar$lambda$5(my myVar, Modifier modifier, my myVar2, ny nyVar, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, Composer composer, int i3) {
        MediumTopAppBar(myVar, modifier, myVar2, nyVar, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: MediumTopAppBar-oKE7A98, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1622MediumTopAppBaroKE7A98(my myVar, Modifier modifier, my myVar2, ny nyVar, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i, int i2) {
        my myVar3;
        int i3;
        Modifier modifier2;
        int i4;
        my myVar4;
        int i5;
        ny nyVar2;
        int i6;
        float f3;
        int i7;
        float f4;
        int i8;
        int i9;
        int i10;
        Composer composer2;
        WindowInsets windowInsets2;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier modifier3;
        my myVar5;
        ny nyVar3;
        float f5;
        float f6;
        TopAppBarColors topAppBarColors2;
        ScopeUpdateScope endRestartGroup;
        WindowInsets windowInsets3;
        int i11;
        TopAppBarColors topAppBarColors3;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        WindowInsets windowInsets4;
        TopAppBarColors topAppBarColors4;
        my myVar6;
        ny nyVar4;
        float f7;
        Modifier modifier4;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1378129383);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            myVar3 = myVar;
        } else {
            myVar3 = myVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(myVar3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                myVar4 = myVar2;
                i3 |= startRestartGroup.changedInstance(myVar4) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    nyVar2 = nyVar;
                    i3 |= startRestartGroup.changedInstance(nyVar2) ? Fields.CameraDistance : Fields.RotationZ;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        f3 = f;
                        i3 |= startRestartGroup.changed(f3) ? Fields.Clip : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else if ((196608 & i) == 0) {
                            f4 = f2;
                            i3 |= startRestartGroup.changed(f4) ? Fields.RenderEffect : 65536;
                            if ((i & 1572864) == 0) {
                                i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(windowInsets)) ? 1048576 : Fields.BlendMode;
                            }
                            if ((i & 12582912) == 0) {
                                if ((i2 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(topAppBarColors)) {
                                    i13 = GroupFlagsKt.IsNodeFlag;
                                    i3 |= i13;
                                }
                                i13 = 4194304;
                                i3 |= i13;
                            }
                            i8 = i2 & Fields.RotationX;
                            if (i8 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i9 = i8;
                                i3 |= startRestartGroup.changed(topAppBarScrollBehavior) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                                i10 = i3;
                                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i14 != 0) {
                                            modifier2 = Modifier.Companion;
                                        }
                                        if (i4 != 0) {
                                            myVar4 = ComposableSingletons$AppBarKt.INSTANCE.m1822getLambda$229000834$material3();
                                        }
                                        if (i5 != 0) {
                                            nyVar2 = ComposableSingletons$AppBarKt.INSTANCE.m1815getLambda$1276513184$material3();
                                        }
                                        if (i6 != 0) {
                                            f3 = TopAppBarDefaults.INSTANCE.m2815getMediumAppBarCollapsedHeightD9Ej5fM();
                                        }
                                        if (i7 != 0) {
                                            f4 = TopAppBarDefaults.INSTANCE.m2816getMediumAppBarExpandedHeightD9Ej5fM();
                                        }
                                        if ((i2 & 64) != 0) {
                                            windowInsets3 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                            i11 = i10 & (-3670017);
                                        } else {
                                            windowInsets3 = windowInsets;
                                            i11 = i10;
                                        }
                                        if ((i2 & Fields.SpotShadowColor) != 0) {
                                            topAppBarColors3 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                            i11 &= -29360129;
                                        } else {
                                            topAppBarColors3 = topAppBarColors;
                                        }
                                        if (i9 != 0) {
                                            windowInsets4 = windowInsets3;
                                            topAppBarColors4 = topAppBarColors3;
                                            myVar6 = myVar4;
                                            topAppBarScrollBehavior3 = null;
                                        } else {
                                            topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                            windowInsets4 = windowInsets3;
                                            topAppBarColors4 = topAppBarColors3;
                                            myVar6 = myVar4;
                                        }
                                        nyVar4 = nyVar2;
                                        f7 = f3;
                                        modifier4 = modifier2;
                                        i12 = i11;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        int i15 = (i2 & 64) != 0 ? i10 & (-3670017) : i10;
                                        if ((i2 & Fields.SpotShadowColor) != 0) {
                                            i15 &= -29360129;
                                        }
                                        Modifier modifier5 = modifier2;
                                        i12 = i15;
                                        f7 = f3;
                                        modifier4 = modifier5;
                                        windowInsets4 = windowInsets;
                                        topAppBarColors4 = topAppBarColors;
                                        topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                        myVar6 = myVar4;
                                        nyVar4 = nyVar2;
                                    }
                                    float f8 = f4;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1378129383, i12, -1, "androidx.compose.material3.MediumTopAppBar (AppBar.kt:518)");
                                    }
                                    TextStyle value = TypographyKt.getValue(AppBarMediumTokens.INSTANCE.getTitleFont(), startRestartGroup, 6);
                                    TextStyle value2 = TypographyKt.getValue(AppBarSmallTokens.INSTANCE.getTitleFont(), startRestartGroup, 6);
                                    float f9 = MediumTitleBottomPadding;
                                    TextStyle.Companion companion = TextStyle.Companion;
                                    TextStyle textStyle = companion.getDefault();
                                    TextStyle textStyle2 = companion.getDefault();
                                    Alignment.Horizontal start = Alignment.Companion.getStart();
                                    Dp.Companion companion2 = Dp.Companion;
                                    float m2815getMediumAppBarCollapsedHeightD9Ej5fM = (Dp.m7616equalsimpl0(f7, companion2.m7631getUnspecifiedD9Ej5fM()) || Dp.m7616equalsimpl0(f7, companion2.m7630getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2815getMediumAppBarCollapsedHeightD9Ej5fM() : f7;
                                    float m2816getMediumAppBarExpandedHeightD9Ej5fM = (Dp.m7616equalsimpl0(f8, companion2.m7631getUnspecifiedD9Ej5fM()) || Dp.m7616equalsimpl0(f8, companion2.m7630getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2816getMediumAppBarExpandedHeightD9Ej5fM() : f8;
                                    int i16 = i12 >> 3;
                                    composer2 = startRestartGroup;
                                    m1628TwoRowsTopAppBarpJA5dT0(modifier4, myVar3, value, f9, myVar, value2, null, textStyle, null, textStyle2, start, myVar6, nyVar4, m2815getMediumAppBarCollapsedHeightD9Ej5fM, m2816getMediumAppBarExpandedHeightD9Ej5fM, windowInsets4, topAppBarColors4, topAppBarScrollBehavior3, composer2, (i16 & 14) | 920128512 | ((i12 << 3) & 112) | ((i12 << 12) & 57344), 6 | (i16 & 112) | (i16 & 896) | (458752 & i16) | (3670016 & i16) | (29360128 & i16), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f5 = f7;
                                    f6 = f8;
                                    modifier3 = modifier4;
                                    myVar5 = myVar6;
                                    nyVar3 = nyVar4;
                                    windowInsets2 = windowInsets4;
                                    topAppBarColors2 = topAppBarColors4;
                                    topAppBarScrollBehavior2 = topAppBarScrollBehavior3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    windowInsets2 = windowInsets;
                                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                    modifier3 = modifier2;
                                    myVar5 = myVar4;
                                    nyVar3 = nyVar2;
                                    f5 = f3;
                                    f6 = f4;
                                    topAppBarColors2 = topAppBarColors;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new b7(myVar, modifier3, myVar5, nyVar3, f5, f6, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, i, i2, 0));
                                    return;
                                }
                                return;
                            }
                            i9 = i8;
                            i10 = i3;
                            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        f4 = f2;
                        if ((i & 1572864) == 0) {
                        }
                        if ((i & 12582912) == 0) {
                        }
                        i8 = i2 & Fields.RotationX;
                        if (i8 == 0) {
                        }
                        i9 = i8;
                        i10 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    f3 = f;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    f4 = f2;
                    if ((i & 1572864) == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i8 = i2 & Fields.RotationX;
                    if (i8 == 0) {
                    }
                    i9 = i8;
                    i10 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                nyVar2 = nyVar;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                f3 = f;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                f4 = f2;
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i2 & Fields.RotationX;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i3;
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            myVar4 = myVar2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            nyVar2 = nyVar;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            f3 = f;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            f4 = f2;
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i2 & Fields.RotationX;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3;
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        myVar4 = myVar2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        nyVar2 = nyVar;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        f3 = f;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        f4 = f2;
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i2 & Fields.RotationX;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3;
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i10 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 MediumTopAppBar_oKE7A98$lambda$6(my myVar, Modifier modifier, my myVar2, ny nyVar, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, Composer composer, int i3) {
        m1622MediumTopAppBaroKE7A98(myVar, modifier, myVar2, nyVar, f, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    /* renamed from: SingleRowTopAppBar-wn8IZOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m1623SingleRowTopAppBarwn8IZOc(Modifier modifier, final my myVar, final TextStyle textStyle, final my myVar2, final TextStyle textStyle2, final Alignment.Horizontal horizontal, final my myVar3, final ny nyVar, final float f, final WindowInsets windowInsets, final TopAppBarColors topAppBarColors, final TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        my myVar4;
        TextStyle textStyle3;
        my myVar5;
        TextStyle textStyle4;
        Alignment.Horizontal horizontal2;
        float f2;
        WindowInsets windowInsets2;
        int i5;
        int i6;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-2033800111);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            myVar4 = myVar;
            i4 |= startRestartGroup.changedInstance(myVar4) ? 32 : 16;
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                textStyle3 = textStyle;
                i4 |= startRestartGroup.changed(textStyle3) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    myVar5 = myVar2;
                    i4 |= startRestartGroup.changedInstance(myVar5) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i3 & 16) == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        textStyle4 = textStyle2;
                        i4 |= startRestartGroup.changed(textStyle4) ? Fields.Clip : 8192;
                        if ((i3 & 32) != 0) {
                            i4 |= 196608;
                        } else if ((i & 196608) == 0) {
                            horizontal2 = horizontal;
                            i4 |= startRestartGroup.changed(horizontal2) ? Fields.RenderEffect : 65536;
                            if ((i3 & 64) == 0) {
                                i4 |= 1572864;
                            } else if ((i & 1572864) == 0) {
                                i4 |= startRestartGroup.changedInstance(myVar3) ? 1048576 : Fields.BlendMode;
                            }
                            if ((i3 & Fields.SpotShadowColor) == 0) {
                                i4 |= 12582912;
                            } else if ((i & 12582912) == 0) {
                                i4 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                                if ((i3 & Fields.RotationX) != 0) {
                                    i4 |= 100663296;
                                } else if ((i & 100663296) == 0) {
                                    f2 = f;
                                    i4 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                                    if ((i3 & Fields.RotationY) == 0) {
                                        i4 |= 805306368;
                                    } else if ((i & 805306368) == 0) {
                                        windowInsets2 = windowInsets;
                                        i4 |= startRestartGroup.changed(windowInsets2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                        if ((i3 & Fields.RotationZ) != 0) {
                                            i5 = i2 | 6;
                                        } else if ((i2 & 6) == 0) {
                                            i5 = i2 | (startRestartGroup.changed(topAppBarColors) ? 4 : 2);
                                        } else {
                                            i5 = i2;
                                        }
                                        if ((i3 & Fields.CameraDistance) != 0) {
                                            i5 |= 48;
                                        } else if ((i2 & 48) == 0) {
                                            i5 |= startRestartGroup.changed(topAppBarScrollBehavior) ? 32 : 16;
                                        }
                                        i6 = i5;
                                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i6 & 19) != 18, i4 & 1)) {
                                            modifier3 = i7 != 0 ? Modifier.Companion : modifier2;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-2033800111, i4, i6, "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:2484)");
                                            }
                                            ((SingleRowTopAppBarOverride) startRestartGroup.consume(LocalSingleRowTopAppBarOverride)).SingleRowTopAppBar(new SingleRowTopAppBarOverrideScope(modifier3, myVar4, textStyle3, myVar5, textStyle4, horizontal2, myVar3, nyVar, f2, windowInsets2, topAppBarColors, topAppBarScrollBehavior, null), startRestartGroup, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            modifier3 = modifier2;
                                        }
                                        endRestartGroup = startRestartGroup.endRestartGroup();
                                        if (endRestartGroup != null) {
                                            final Modifier modifier4 = modifier3;
                                            endRestartGroup.updateScope(new my() { // from class: e7
                                                @Override // defpackage.my
                                                public final Object invoke(Object obj, Object obj2) {
                                                    w01 SingleRowTopAppBar_wn8IZOc$lambda$32;
                                                    int intValue = ((Integer) obj2).intValue();
                                                    SingleRowTopAppBar_wn8IZOc$lambda$32 = AppBarKt.SingleRowTopAppBar_wn8IZOc$lambda$32(Modifier.this, myVar, textStyle, myVar2, textStyle2, horizontal, myVar3, nyVar, f, windowInsets, topAppBarColors, topAppBarScrollBehavior, i, i2, i3, (Composer) obj, intValue);
                                                    return SingleRowTopAppBar_wn8IZOc$lambda$32;
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    windowInsets2 = windowInsets;
                                    if ((i3 & Fields.RotationZ) != 0) {
                                    }
                                    if ((i3 & Fields.CameraDistance) != 0) {
                                    }
                                    i6 = i5;
                                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i6 & 19) != 18, i4 & 1)) {
                                    }
                                    endRestartGroup = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup != null) {
                                    }
                                }
                                f2 = f;
                                if ((i3 & Fields.RotationY) == 0) {
                                }
                                windowInsets2 = windowInsets;
                                if ((i3 & Fields.RotationZ) != 0) {
                                }
                                if ((i3 & Fields.CameraDistance) != 0) {
                                }
                                i6 = i5;
                                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i6 & 19) != 18, i4 & 1)) {
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                            if ((i3 & Fields.RotationX) != 0) {
                            }
                            f2 = f;
                            if ((i3 & Fields.RotationY) == 0) {
                            }
                            windowInsets2 = windowInsets;
                            if ((i3 & Fields.RotationZ) != 0) {
                            }
                            if ((i3 & Fields.CameraDistance) != 0) {
                            }
                            i6 = i5;
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i6 & 19) != 18, i4 & 1)) {
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        horizontal2 = horizontal;
                        if ((i3 & 64) == 0) {
                        }
                        if ((i3 & Fields.SpotShadowColor) == 0) {
                        }
                        if ((i3 & Fields.RotationX) != 0) {
                        }
                        f2 = f;
                        if ((i3 & Fields.RotationY) == 0) {
                        }
                        windowInsets2 = windowInsets;
                        if ((i3 & Fields.RotationZ) != 0) {
                        }
                        if ((i3 & Fields.CameraDistance) != 0) {
                        }
                        i6 = i5;
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i6 & 19) != 18, i4 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    textStyle4 = textStyle2;
                    if ((i3 & 32) != 0) {
                    }
                    horizontal2 = horizontal;
                    if ((i3 & 64) == 0) {
                    }
                    if ((i3 & Fields.SpotShadowColor) == 0) {
                    }
                    if ((i3 & Fields.RotationX) != 0) {
                    }
                    f2 = f;
                    if ((i3 & Fields.RotationY) == 0) {
                    }
                    windowInsets2 = windowInsets;
                    if ((i3 & Fields.RotationZ) != 0) {
                    }
                    if ((i3 & Fields.CameraDistance) != 0) {
                    }
                    i6 = i5;
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i6 & 19) != 18, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                myVar5 = myVar2;
                if ((i3 & 16) == 0) {
                }
                textStyle4 = textStyle2;
                if ((i3 & 32) != 0) {
                }
                horizontal2 = horizontal;
                if ((i3 & 64) == 0) {
                }
                if ((i3 & Fields.SpotShadowColor) == 0) {
                }
                if ((i3 & Fields.RotationX) != 0) {
                }
                f2 = f;
                if ((i3 & Fields.RotationY) == 0) {
                }
                windowInsets2 = windowInsets;
                if ((i3 & Fields.RotationZ) != 0) {
                }
                if ((i3 & Fields.CameraDistance) != 0) {
                }
                i6 = i5;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i6 & 19) != 18, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textStyle3 = textStyle;
            if ((i3 & 8) != 0) {
            }
            myVar5 = myVar2;
            if ((i3 & 16) == 0) {
            }
            textStyle4 = textStyle2;
            if ((i3 & 32) != 0) {
            }
            horizontal2 = horizontal;
            if ((i3 & 64) == 0) {
            }
            if ((i3 & Fields.SpotShadowColor) == 0) {
            }
            if ((i3 & Fields.RotationX) != 0) {
            }
            f2 = f;
            if ((i3 & Fields.RotationY) == 0) {
            }
            windowInsets2 = windowInsets;
            if ((i3 & Fields.RotationZ) != 0) {
            }
            if ((i3 & Fields.CameraDistance) != 0) {
            }
            i6 = i5;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i6 & 19) != 18, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        myVar4 = myVar;
        if ((i3 & 4) == 0) {
        }
        textStyle3 = textStyle;
        if ((i3 & 8) != 0) {
        }
        myVar5 = myVar2;
        if ((i3 & 16) == 0) {
        }
        textStyle4 = textStyle2;
        if ((i3 & 32) != 0) {
        }
        horizontal2 = horizontal;
        if ((i3 & 64) == 0) {
        }
        if ((i3 & Fields.SpotShadowColor) == 0) {
        }
        if ((i3 & Fields.RotationX) != 0) {
        }
        f2 = f;
        if ((i3 & Fields.RotationY) == 0) {
        }
        windowInsets2 = windowInsets;
        if ((i3 & Fields.RotationZ) != 0) {
        }
        if ((i3 & Fields.CameraDistance) != 0) {
        }
        i6 = i5;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i6 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SingleRowTopAppBar_wn8IZOc$lambda$32(Modifier modifier, my myVar, TextStyle textStyle, my myVar2, TextStyle textStyle2, Alignment.Horizontal horizontal, my myVar3, ny nyVar, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3, Composer composer, int i4) {
        m1623SingleRowTopAppBarwn8IZOc(modifier, myVar, textStyle, myVar2, textStyle2, horizontal, myVar3, nyVar, f, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0065  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void TopAppBar(my myVar, Modifier modifier, my myVar2, ny nyVar, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i, int i2) {
        my myVar3;
        int i3;
        Modifier modifier2;
        int i4;
        my myVar4;
        int i5;
        ny nyVar2;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Composer composer2;
        Modifier modifier3;
        my myVar5;
        ny nyVar3;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors3;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        ScopeUpdateScope endRestartGroup;
        TopAppBarColors topAppBarColors4;
        TopAppBarScrollBehavior topAppBarScrollBehavior4;
        ny nyVar4;
        WindowInsets windowInsets4;
        Modifier modifier4;
        my myVar6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(1788762628);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            myVar3 = myVar;
        } else {
            myVar3 = myVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(myVar3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                myVar4 = myVar2;
                i3 |= startRestartGroup.changedInstance(myVar4) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    nyVar2 = nyVar;
                    i3 |= startRestartGroup.changedInstance(nyVar2) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            if (startRestartGroup.changed(windowInsets2)) {
                                i9 = Fields.Clip;
                                i3 |= i9;
                            }
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i9 = 8192;
                        i3 |= i9;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColors2 = topAppBarColors;
                            if (startRestartGroup.changed(topAppBarColors2)) {
                                i8 = Fields.RenderEffect;
                                i3 |= i8;
                            }
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i8 = 65536;
                        i3 |= i8;
                    } else {
                        topAppBarColors2 = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                        i3 |= startRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : Fields.BlendMode;
                        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i10 != 0 ? Modifier.Companion : modifier2;
                                if (i4 != 0) {
                                    myVar4 = ComposableSingletons$AppBarKt.INSTANCE.m1830getLambda$944449303$material3();
                                }
                                if (i5 != 0) {
                                    nyVar2 = ComposableSingletons$AppBarKt.INSTANCE.getLambda$917296843$material3();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    topAppBarColors2 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                }
                                if (i6 != 0) {
                                    topAppBarScrollBehavior4 = null;
                                    windowInsets4 = windowInsets2;
                                    topAppBarColors4 = topAppBarColors2;
                                    myVar6 = myVar4;
                                    nyVar4 = nyVar2;
                                    modifier4 = modifier5;
                                } else {
                                    topAppBarColors4 = topAppBarColors2;
                                    topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                                    nyVar4 = nyVar2;
                                    windowInsets4 = windowInsets2;
                                    modifier4 = modifier5;
                                    myVar6 = myVar4;
                                }
                                i7 = 1788762628;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                topAppBarColors4 = topAppBarColors2;
                                topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                                i7 = 1788762628;
                                nyVar4 = nyVar2;
                                windowInsets4 = windowInsets2;
                                modifier4 = modifier2;
                                myVar6 = myVar4;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i7, i3, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:168)");
                            }
                            int i11 = (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                            int i12 = i3 << 3;
                            composer2 = startRestartGroup;
                            m1624TopAppBarGHTll3U(myVar3, modifier4, myVar6, nyVar4, TopAppBarDefaults.INSTANCE.m2819getTopAppBarExpandedHeightD9Ej5fM(), windowInsets4, topAppBarColors4, topAppBarScrollBehavior4, composer2, i11 | (458752 & i12) | (3670016 & i12) | (i12 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            myVar5 = myVar6;
                            nyVar3 = nyVar4;
                            windowInsets3 = windowInsets4;
                            topAppBarColors3 = topAppBarColors4;
                            topAppBarScrollBehavior3 = topAppBarScrollBehavior4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            myVar5 = myVar4;
                            nyVar3 = nyVar2;
                            windowInsets3 = windowInsets2;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new v6(myVar, modifier3, myVar5, nyVar3, windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, i, i2, 2));
                            return;
                        }
                        return;
                    }
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                nyVar2 = nyVar;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            myVar4 = myVar2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            nyVar2 = nyVar;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        myVar4 = myVar2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        nyVar2 = nyVar;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TopAppBar$lambda$0(my myVar, Modifier modifier, my myVar2, ny nyVar, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, Composer composer, int i3) {
        TopAppBar(myVar, modifier, myVar2, nyVar, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00da  */
    /* renamed from: TopAppBar-GHTll3U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1624TopAppBarGHTll3U(my myVar, Modifier modifier, my myVar2, ny nyVar, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i, int i2) {
        my myVar3;
        int i3;
        Modifier modifier2;
        int i4;
        my myVar4;
        int i5;
        ny nyVar2;
        int i6;
        float f2;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i7;
        int i8;
        int i9;
        Composer composer2;
        Modifier modifier3;
        my myVar5;
        ny nyVar3;
        float f3;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors3;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        int i10;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Modifier modifier4;
        my myVar6;
        ny nyVar4;
        float f4;
        WindowInsets windowInsets4;
        TopAppBarColors topAppBarColors4;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1784421840);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            myVar3 = myVar;
        } else {
            myVar3 = myVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(myVar3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                myVar4 = myVar2;
                i3 |= startRestartGroup.changedInstance(myVar4) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    nyVar2 = nyVar;
                    i3 |= startRestartGroup.changedInstance(nyVar2) ? Fields.CameraDistance : Fields.RotationZ;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        f2 = f;
                        i3 |= startRestartGroup.changed(f2) ? Fields.Clip : 8192;
                        if ((196608 & i) == 0) {
                            if ((i2 & 32) == 0) {
                                windowInsets2 = windowInsets;
                                if (startRestartGroup.changed(windowInsets2)) {
                                    i12 = Fields.RenderEffect;
                                    i3 |= i12;
                                }
                            } else {
                                windowInsets2 = windowInsets;
                            }
                            i12 = 65536;
                            i3 |= i12;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                topAppBarColors2 = topAppBarColors;
                                if (startRestartGroup.changed(topAppBarColors2)) {
                                    i11 = 1048576;
                                    i3 |= i11;
                                }
                            } else {
                                topAppBarColors2 = topAppBarColors;
                            }
                            i11 = Fields.BlendMode;
                            i3 |= i11;
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i7 = i2 & Fields.SpotShadowColor;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i8 = i7;
                            i3 |= startRestartGroup.changed(topAppBarScrollBehavior) ? GroupFlagsKt.IsNodeFlag : 4194304;
                            i9 = i3;
                            if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier3 = modifier2;
                                myVar5 = myVar4;
                                nyVar3 = nyVar2;
                                f3 = f2;
                                windowInsets3 = windowInsets2;
                                topAppBarColors3 = topAppBarColors2;
                                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier5 = i13 != 0 ? Modifier.Companion : modifier2;
                                    if (i4 != 0) {
                                        myVar4 = ComposableSingletons$AppBarKt.INSTANCE.getLambda$657782987$material3();
                                    }
                                    if (i5 != 0) {
                                        nyVar2 = ComposableSingletons$AppBarKt.INSTANCE.m1814getLambda$1270442071$material3();
                                    }
                                    if (i6 != 0) {
                                        f2 = TopAppBarDefaults.INSTANCE.m2819getTopAppBarExpandedHeightD9Ej5fM();
                                    }
                                    if ((i2 & 32) != 0) {
                                        i10 = i9 & (-458753);
                                        windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                    } else {
                                        i10 = i9;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i10 &= -3670017;
                                        topAppBarColors2 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                    }
                                    if (i8 != 0) {
                                        modifier4 = modifier5;
                                        topAppBarScrollBehavior3 = null;
                                    } else {
                                        topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                        modifier4 = modifier5;
                                    }
                                    myVar6 = myVar4;
                                    nyVar4 = nyVar2;
                                    f4 = f2;
                                    windowInsets4 = windowInsets2;
                                    topAppBarColors4 = topAppBarColors2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    int i14 = (i2 & 32) != 0 ? i9 & (-458753) : i9;
                                    if ((i2 & 64) != 0) {
                                        i14 &= -3670017;
                                    }
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                    modifier4 = modifier2;
                                    myVar6 = myVar4;
                                    nyVar4 = nyVar2;
                                    windowInsets4 = windowInsets2;
                                    topAppBarColors4 = topAppBarColors2;
                                    i10 = i14;
                                    f4 = f2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1784421840, i10, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:225)");
                                }
                                TextStyle value = TypographyKt.getValue(AppBarSmallTokens.INSTANCE.getTitleFont(), startRestartGroup, 6);
                                TextStyle textStyle = TextStyle.Companion.getDefault();
                                Alignment.Horizontal start = Alignment.Companion.getStart();
                                Dp.Companion companion = Dp.Companion;
                                int i15 = i10 << 12;
                                composer2 = startRestartGroup;
                                m1623SingleRowTopAppBarwn8IZOc(modifier4, myVar3, value, null, textStyle, start, myVar6, nyVar4, (Dp.m7616equalsimpl0(f4, companion.m7631getUnspecifiedD9Ej5fM()) || Dp.m7616equalsimpl0(f4, companion.m7630getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2819getTopAppBarExpandedHeightD9Ej5fM() : f4, windowInsets4, topAppBarColors4, topAppBarScrollBehavior3, composer2, ((i10 >> 3) & 14) | 224256 | ((i10 << 3) & 112) | (3670016 & i15) | (29360128 & i15) | (i15 & 1879048192), (i10 >> 18) & 126, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f3 = f4;
                                modifier3 = modifier4;
                                myVar5 = myVar6;
                                nyVar3 = nyVar4;
                                windowInsets3 = windowInsets4;
                                topAppBarColors3 = topAppBarColors4;
                                topAppBarScrollBehavior2 = topAppBarScrollBehavior3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new c7(myVar, modifier3, myVar5, nyVar3, f3, windowInsets3, topAppBarColors3, topAppBarScrollBehavior2, i, i2, 0));
                                return;
                            }
                            return;
                        }
                        i8 = i7;
                        i9 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    f2 = f;
                    if ((196608 & i) == 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i2 & Fields.SpotShadowColor;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    i9 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                nyVar2 = nyVar;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                f2 = f;
                if ((196608 & i) == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                i7 = i2 & Fields.SpotShadowColor;
                if (i7 != 0) {
                }
                i8 = i7;
                i9 = i3;
                if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            myVar4 = myVar2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            nyVar2 = nyVar;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            f2 = f;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & Fields.SpotShadowColor;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i3;
            if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        myVar4 = myVar2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        nyVar2 = nyVar;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        f2 = f;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & Fields.SpotShadowColor;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i3;
        if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: TopAppBar-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1625TopAppBarcJHQLPU(final my myVar, final my myVar2, Modifier modifier, my myVar3, ny nyVar, Alignment.Horizontal horizontal, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        my myVar4;
        int i3;
        my myVar5;
        int i4;
        Modifier modifier2;
        int i5;
        my myVar6;
        int i6;
        ny nyVar2;
        int i7;
        Alignment.Horizontal horizontal2;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        final WindowInsets windowInsets2;
        final TopAppBarScrollBehavior topAppBarScrollBehavior2;
        final Modifier modifier3;
        final my myVar7;
        final ny nyVar3;
        final Alignment.Horizontal horizontal3;
        final float f2;
        final TopAppBarColors topAppBarColors2;
        ScopeUpdateScope endRestartGroup;
        float m2819getTopAppBarExpandedHeightD9Ej5fM;
        WindowInsets windowInsets3;
        int i12;
        TopAppBarColors topAppBarColors3;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        WindowInsets windowInsets4;
        my myVar8;
        TopAppBarColors topAppBarColors4;
        ny nyVar4;
        Alignment.Horizontal horizontal4;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(1954772493);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            myVar4 = myVar;
        } else {
            myVar4 = myVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(myVar4) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            myVar5 = myVar2;
            i3 |= startRestartGroup.changedInstance(myVar5) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    myVar6 = myVar3;
                    i3 |= startRestartGroup.changedInstance(myVar6) ? Fields.CameraDistance : Fields.RotationZ;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        nyVar2 = nyVar;
                        i3 |= startRestartGroup.changedInstance(nyVar2) ? Fields.Clip : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else if ((196608 & i) == 0) {
                            horizontal2 = horizontal;
                            i3 |= startRestartGroup.changed(horizontal2) ? Fields.RenderEffect : 65536;
                            i8 = i2 & 64;
                            if (i8 == 0) {
                                i3 |= 1572864;
                            } else if ((i & 1572864) == 0) {
                                i3 |= startRestartGroup.changed(f) ? 1048576 : Fields.BlendMode;
                            }
                            if ((i & 12582912) == 0) {
                                if ((i2 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(windowInsets)) {
                                    i14 = GroupFlagsKt.IsNodeFlag;
                                    i3 |= i14;
                                }
                                i14 = 4194304;
                                i3 |= i14;
                            }
                            if ((i & 100663296) == 0) {
                                if ((i2 & Fields.RotationX) == 0 && startRestartGroup.changed(topAppBarColors)) {
                                    i13 = GroupFlagsKt.IsRecompositionRequiredFlag;
                                    i3 |= i13;
                                }
                                i13 = GroupFlagsKt.HasAuxSlotFlag;
                                i3 |= i13;
                            }
                            i9 = i2 & Fields.RotationY;
                            if (i9 == 0) {
                                i3 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i10 = i9;
                                i3 |= startRestartGroup.changed(topAppBarScrollBehavior) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                i11 = i3;
                                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i11 & 1)) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i4 != 0) {
                                            modifier2 = Modifier.Companion;
                                        }
                                        if (i5 != 0) {
                                            myVar6 = ComposableSingletons$AppBarKt.INSTANCE.m1812getLambda$1168245838$material3();
                                        }
                                        if (i6 != 0) {
                                            nyVar2 = ComposableSingletons$AppBarKt.INSTANCE.m1816getLambda$1401945836$material3();
                                        }
                                        if (i7 != 0) {
                                            horizontal2 = Alignment.Companion.getStart();
                                        }
                                        m2819getTopAppBarExpandedHeightD9Ej5fM = i8 != 0 ? TopAppBarDefaults.INSTANCE.m2819getTopAppBarExpandedHeightD9Ej5fM() : f;
                                        if ((i2 & Fields.SpotShadowColor) != 0) {
                                            windowInsets3 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                            i12 = i11 & (-29360129);
                                        } else {
                                            windowInsets3 = windowInsets;
                                            i12 = i11;
                                        }
                                        if ((i2 & Fields.RotationX) != 0) {
                                            topAppBarColors3 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                            i12 &= -234881025;
                                        } else {
                                            topAppBarColors3 = topAppBarColors;
                                        }
                                        if (i10 != 0) {
                                            windowInsets4 = windowInsets3;
                                            myVar8 = myVar6;
                                            topAppBarColors4 = topAppBarColors3;
                                            nyVar4 = nyVar2;
                                            topAppBarScrollBehavior3 = null;
                                        } else {
                                            topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                            windowInsets4 = windowInsets3;
                                            myVar8 = myVar6;
                                            topAppBarColors4 = topAppBarColors3;
                                            nyVar4 = nyVar2;
                                        }
                                        horizontal4 = horizontal2;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        int i15 = (i2 & Fields.SpotShadowColor) != 0 ? i11 & (-29360129) : i11;
                                        if ((i2 & Fields.RotationX) != 0) {
                                            i15 &= -234881025;
                                        }
                                        windowInsets4 = windowInsets;
                                        topAppBarColors4 = topAppBarColors;
                                        topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                        i12 = i15;
                                        myVar8 = myVar6;
                                        nyVar4 = nyVar2;
                                        horizontal4 = horizontal2;
                                        m2819getTopAppBarExpandedHeightD9Ej5fM = f;
                                    }
                                    Modifier modifier4 = modifier2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1954772493, i12, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:383)");
                                    }
                                    AppBarSmallTokens appBarSmallTokens = AppBarSmallTokens.INSTANCE;
                                    TextStyle value = TypographyKt.getValue(appBarSmallTokens.getTitleFont(), startRestartGroup, 6);
                                    TextStyle value2 = TypographyKt.getValue(appBarSmallTokens.getSubtitleFont(), startRestartGroup, 6);
                                    Dp.Companion companion = Dp.Companion;
                                    int i16 = i12 << 6;
                                    int i17 = i12 << 9;
                                    composer2 = startRestartGroup;
                                    m1623SingleRowTopAppBarwn8IZOc(modifier4, myVar4, value, myVar5, value2, horizontal4, myVar8, nyVar4, (Dp.m7616equalsimpl0(m2819getTopAppBarExpandedHeightD9Ej5fM, companion.m7631getUnspecifiedD9Ej5fM()) || Dp.m7616equalsimpl0(m2819getTopAppBarExpandedHeightD9Ej5fM, companion.m7630getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2819getTopAppBarExpandedHeightD9Ej5fM() : m2819getTopAppBarExpandedHeightD9Ej5fM, windowInsets4, topAppBarColors4, topAppBarScrollBehavior3, composer2, ((i12 >> 6) & 14) | ((i12 << 3) & 112) | (i16 & 7168) | (458752 & i12) | (3670016 & i17) | (i17 & 29360128) | (i16 & 1879048192), (i12 >> 24) & 126, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f2 = m2819getTopAppBarExpandedHeightD9Ej5fM;
                                    modifier3 = modifier4;
                                    horizontal3 = horizontal4;
                                    myVar7 = myVar8;
                                    nyVar3 = nyVar4;
                                    windowInsets2 = windowInsets4;
                                    topAppBarColors2 = topAppBarColors4;
                                    topAppBarScrollBehavior2 = topAppBarScrollBehavior3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    windowInsets2 = windowInsets;
                                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                    modifier3 = modifier2;
                                    myVar7 = myVar6;
                                    nyVar3 = nyVar2;
                                    horizontal3 = horizontal2;
                                    f2 = f;
                                    topAppBarColors2 = topAppBarColors;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new my() { // from class: a7
                                        @Override // defpackage.my
                                        public final Object invoke(Object obj, Object obj2) {
                                            w01 TopAppBar_cJHQLPU$lambda$4;
                                            int intValue = ((Integer) obj2).intValue();
                                            TopAppBar_cJHQLPU$lambda$4 = AppBarKt.TopAppBar_cJHQLPU$lambda$4(my.this, myVar2, modifier3, myVar7, nyVar3, horizontal3, f2, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, i, i2, (Composer) obj, intValue);
                                            return TopAppBar_cJHQLPU$lambda$4;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i10 = i9;
                            i11 = i3;
                            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i11 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        horizontal2 = horizontal;
                        i8 = i2 & 64;
                        if (i8 == 0) {
                        }
                        if ((i & 12582912) == 0) {
                        }
                        if ((i & 100663296) == 0) {
                        }
                        i9 = i2 & Fields.RotationY;
                        if (i9 == 0) {
                        }
                        i10 = i9;
                        i11 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i11 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    nyVar2 = nyVar;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    horizontal2 = horizontal;
                    i8 = i2 & 64;
                    if (i8 == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    if ((i & 100663296) == 0) {
                    }
                    i9 = i2 & Fields.RotationY;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    i11 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i11 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                myVar6 = myVar3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                nyVar2 = nyVar;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                horizontal2 = horizontal;
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i9 = i2 & Fields.RotationY;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i3;
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i11 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            myVar6 = myVar3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            nyVar2 = nyVar;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            horizontal2 = horizontal;
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i9 = i2 & Fields.RotationY;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i3;
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i11 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        myVar5 = myVar2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        myVar6 = myVar3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        nyVar2 = nyVar;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        horizontal2 = horizontal;
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i9 = i2 & Fields.RotationY;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i3;
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i11 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TopAppBarLayout-lyUyIHI, reason: not valid java name */
    public static final void m1626TopAppBarLayoutlyUyIHI(final Modifier modifier, final FloatProducer floatProducer, final long j, final long j2, final long j3, final long j4, final my myVar, final TextStyle textStyle, final my myVar2, final TextStyle textStyle2, final iy iyVar, final Arrangement.Vertical vertical, Alignment.Horizontal horizontal, final int i, final boolean z, final my myVar3, final my myVar4, final float f, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Alignment.Horizontal horizontal2;
        Composer composer2;
        int i9;
        my myVar5;
        int i10;
        int i11;
        float f2;
        ComposeUiNode.Companion companion;
        Modifier modifier2;
        Modifier modifier3;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(126395868);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? startRestartGroup.changed(floatProducer) : startRestartGroup.changedInstance(floatProducer) ? 32 : 16;
        }
        int i13 = i2 & 384;
        int i14 = Fields.SpotShadowColor;
        if (i13 == 0) {
            i4 |= startRestartGroup.changed(j) ? Fields.RotationX : 128;
        }
        int i15 = i2 & 3072;
        int i16 = Fields.RotationZ;
        if (i15 == 0) {
            i5 = i4 | (startRestartGroup.changed(j2) ? Fields.CameraDistance : 1024);
        } else {
            i5 = i4;
        }
        int i17 = i2 & 24576;
        int i18 = Fields.Clip;
        if (i17 == 0) {
            i5 |= startRestartGroup.changed(j3) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= startRestartGroup.changed(j4) ? 131072 : 65536;
        }
        int i19 = i2 & 1572864;
        int i20 = Fields.BlendMode;
        if (i19 == 0) {
            i5 |= startRestartGroup.changedInstance(myVar) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i6 = 12582912;
            i5 |= startRestartGroup.changed(textStyle) ? GroupFlagsKt.IsNodeFlag : 4194304;
        } else {
            i6 = 12582912;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= startRestartGroup.changedInstance(myVar2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= startRestartGroup.changed(textStyle2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i3 & 6) == 0) {
            i7 = i3 | (startRestartGroup.changedInstance(iyVar) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= startRestartGroup.changed(vertical) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if (startRestartGroup.changed(horizontal)) {
                i14 = Fields.RotationX;
            }
            i7 |= i14;
        }
        if ((i3 & 3072) == 0) {
            i8 = i;
            if (startRestartGroup.changed(i8)) {
                i16 = Fields.CameraDistance;
            }
            i7 |= i16;
        } else {
            i8 = i;
        }
        if ((i3 & 24576) == 0) {
            if (!startRestartGroup.changed(z)) {
                i18 = 8192;
            }
            i7 |= i18;
        }
        if ((i3 & 196608) == 0) {
            i7 |= startRestartGroup.changedInstance(myVar3) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            if (startRestartGroup.changedInstance(myVar4)) {
                i20 = 1048576;
            }
            i7 |= i20;
        }
        if ((i3 & i6) == 0) {
            i7 |= startRestartGroup.changed(f) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        int i21 = i7;
        if (startRestartGroup.shouldExecute(((i5 & 306783379) == 306783378 && (4793491 & i21) == 4793490) ? false : true, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(126395868, i5, i21, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:2994)");
            }
            int i22 = i21 & 896;
            boolean z2 = ((i5 & 112) == 32 || ((i5 & 64) != 0 && startRestartGroup.changed(floatProducer))) | ((i21 & 112) == 32) | (i22 == 256) | ((i21 & 7168) == 2048) | ((29360128 & i21) == 8388608);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                i9 = i21;
                myVar5 = myVar3;
                i10 = i5;
                i11 = i22;
                TopAppBarMeasurePolicy topAppBarMeasurePolicy = new TopAppBarMeasurePolicy(floatProducer, vertical, horizontal, i8, f, null);
                horizontal2 = horizontal;
                startRestartGroup.updateRememberedValue(topAppBarMeasurePolicy);
                rememberedValue = topAppBarMeasurePolicy;
            } else {
                myVar5 = myVar3;
                i10 = i5;
                i9 = i21;
                i11 = i22;
                horizontal2 = horizontal;
            }
            TopAppBarMeasurePolicy topAppBarMeasurePolicy2 = (TopAppBarMeasurePolicy) rememberedValue;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
            Updater.m3886setimpl(m3878constructorimpl, topAppBarMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m3886setimpl(m3878constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            my setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(setCompositeKeyHash, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier layoutId = LayoutIdKt.layoutId(companion3, "navigationIcon");
            float f3 = TopAppBarHorizontalPadding;
            Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(layoutId, f3, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m766paddingqDBjuR0$default);
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
            my b = k4.b(companion2, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
            if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                k4.j(b, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
            }
            Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ProvidedValue<Color> provides = ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(j));
            int i23 = ProvidedValue.$stable;
            CompositionLocalKt.CompositionLocalProvider(provides, myVar5, startRestartGroup, ((i9 >> 12) & 112) | i23);
            startRestartGroup.endNode();
            if (myVar2 != null) {
                startRestartGroup.startReplaceGroup(-1360720648);
                Modifier m764paddingVpY3zN4$default = PaddingKt.m764paddingVpY3zN4$default(LayoutIdKt.layoutId(companion3, "title"), f3, 0.0f, 2, null);
                if (z) {
                    startRestartGroup.startReplaceGroup(510303260);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new defpackage.d1(22);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    modifier3 = SemanticsModifierKt.clearAndSetSemantics(companion3, (ky) rememberedValue2);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(510305197);
                    startRestartGroup.endReplaceGroup();
                    modifier3 = companion3;
                }
                Modifier then = m764paddingVpY3zN4$default.then(modifier3);
                boolean z3 = (i9 & 14) == 4;
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    i12 = 0;
                    rememberedValue3 = new g7(i12, iyVar);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                } else {
                    i12 = 0;
                }
                Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(then, (ky) rememberedValue3);
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), horizontal2, startRestartGroup, (i11 >> 3) & 112);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i12);
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
                my b2 = k4.b(companion2, m3878constructorimpl3, columnMeasurePolicy, m3878constructorimpl3, currentCompositionLocalMap3);
                if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    k4.j(b2, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
                }
                Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion2.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i24 = i10 >> 18;
                int i25 = i10 >> 12;
                ProvideContentColorTextStyleKt.m2902ProvideContentColorTextStyle3JVO9M(j2, textStyle, myVar, startRestartGroup, ((i10 >> 9) & 14) | (i24 & 112) | (i25 & 896));
                companion = companion2;
                composer2 = startRestartGroup;
                f2 = f3;
                ProvideContentColorTextStyleKt.m2902ProvideContentColorTextStyle3JVO9M(j3, textStyle2, myVar2, composer2, (i25 & 14) | ((i10 >> 24) & 112) | (i24 & 896));
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                f2 = f3;
                companion = companion2;
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(-1359701523);
                Modifier m764paddingVpY3zN4$default2 = PaddingKt.m764paddingVpY3zN4$default(LayoutIdKt.layoutId(companion3, "title"), f2, 0.0f, 2, null);
                if (z) {
                    composer2.startReplaceGroup(510338172);
                    Object rememberedValue4 = composer2.rememberedValue();
                    if (rememberedValue4 == Composer.Companion.getEmpty()) {
                        rememberedValue4 = new defpackage.d1(23);
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    modifier2 = SemanticsModifierKt.clearAndSetSemantics(companion3, (ky) rememberedValue4);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(510340109);
                    composer2.endReplaceGroup();
                    modifier2 = companion3;
                }
                Modifier then2 = m764paddingVpY3zN4$default2.then(modifier2);
                boolean z4 = (i9 & 14) == 4;
                Object rememberedValue5 = composer2.rememberedValue();
                if (z4 || rememberedValue5 == Composer.Companion.getEmpty()) {
                    rememberedValue5 = new g7(1, iyVar);
                    composer2.updateRememberedValue(rememberedValue5);
                }
                Modifier graphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(then2, (ky) rememberedValue5);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, graphicsLayer2);
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
                ProvideContentColorTextStyleKt.m2902ProvideContentColorTextStyle3JVO9M(j2, textStyle, myVar, composer2, ((i10 >> 9) & 14) | ((i10 >> 18) & 112) | ((i10 >> 12) & 896));
                composer2.endNode();
                composer2.endReplaceGroup();
            }
            Modifier m766paddingqDBjuR0$default2 = PaddingKt.m766paddingqDBjuR0$default(LayoutIdKt.layoutId(companion3, "actionIcons"), 0.0f, 0.0f, f2, 0.0f, 11, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer2, m766paddingqDBjuR0$default2);
            iy constructor5 = companion.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor5);
            } else {
                composer2.useNode();
            }
            Composer m3878constructorimpl5 = Updater.m3878constructorimpl(composer2);
            my b4 = k4.b(companion, m3878constructorimpl5, maybeCachedBoxMeasurePolicy3, m3878constructorimpl5, currentCompositionLocalMap5);
            if (m3878constructorimpl5.getInserting() || !q10.b(m3878constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                k4.j(b4, currentCompositeKeyHash5, m3878constructorimpl5, currentCompositeKeyHash5);
            }
            Updater.m3886setimpl(m3878constructorimpl5, materializeModifier5, companion.getSetModifier());
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(j4)), myVar4, composer2, ((i9 >> 15) & 112) | i23);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            horizontal2 = horizontal;
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final Alignment.Horizontal horizontal3 = horizontal2;
            endRestartGroup.updateScope(new my() { // from class: j7
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 TopAppBarLayout_lyUyIHI$lambda$53;
                    int intValue = ((Integer) obj2).intValue();
                    TopAppBarLayout_lyUyIHI$lambda$53 = AppBarKt.TopAppBarLayout_lyUyIHI$lambda$53(Modifier.this, floatProducer, j, j2, j3, j4, myVar, textStyle, myVar2, textStyle2, iyVar, vertical, horizontal3, i, z, myVar3, myVar4, f, i2, i3, (Composer) obj, intValue);
                    return TopAppBarLayout_lyUyIHI$lambda$53;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TopAppBarLayout_lyUyIHI$lambda$51$lambda$41$lambda$40(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TopAppBarLayout_lyUyIHI$lambda$51$lambda$43$lambda$42(iy iyVar, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(((Number) iyVar.invoke()).floatValue());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TopAppBarLayout_lyUyIHI$lambda$51$lambda$46$lambda$45(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TopAppBarLayout_lyUyIHI$lambda$51$lambda$48$lambda$47(iy iyVar, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(((Number) iyVar.invoke()).floatValue());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TopAppBarLayout_lyUyIHI$lambda$53(Modifier modifier, FloatProducer floatProducer, long j, long j2, long j3, long j4, my myVar, TextStyle textStyle, my myVar2, TextStyle textStyle2, iy iyVar, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i, boolean z, my myVar3, my myVar4, float f, int i2, int i3, Composer composer, int i4) {
        m1626TopAppBarLayoutlyUyIHI(modifier, floatProducer, j, j2, j3, j4, myVar, textStyle, myVar2, textStyle2, iyVar, vertical, horizontal, i, z, myVar3, myVar4, f, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TopAppBar_GHTll3U$lambda$1(my myVar, Modifier modifier, my myVar2, ny nyVar, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, Composer composer, int i3) {
        m1624TopAppBarGHTll3U(myVar, modifier, myVar2, nyVar, f, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TopAppBar_cJHQLPU$lambda$4(my myVar, my myVar2, Modifier modifier, my myVar3, ny nyVar, Alignment.Horizontal horizontal, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, Composer composer, int i3) {
        m1625TopAppBarcJHQLPU(myVar, myVar2, modifier, myVar3, nyVar, horizontal, f, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: TwoRowsTopAppBar-eXZ4JBQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1627TwoRowsTopAppBareXZ4JBQ(final ny nyVar, Modifier modifier, ny nyVar2, my myVar, ny nyVar3, Alignment.Horizontal horizontal, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        final ny nyVar4;
        int i6;
        my myVar2;
        int i7;
        ny nyVar5;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer composer2;
        Alignment.Horizontal horizontal2;
        float f3;
        TopAppBarColors topAppBarColors2;
        Modifier modifier3;
        ny nyVar6;
        my myVar3;
        ny nyVar7;
        float f4;
        WindowInsets windowInsets2;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        ScopeUpdateScope endRestartGroup;
        float m7631getUnspecifiedD9Ej5fM;
        float m7631getUnspecifiedD9Ej5fM2;
        WindowInsets windowInsets3;
        int i15;
        TopAppBarColors topAppBarColors3;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        TopAppBarColors topAppBarColors4;
        my myVar4;
        ny nyVar8;
        Alignment.Horizontal horizontal3;
        WindowInsets windowInsets4;
        Modifier modifier4;
        int i16;
        float m2817getMediumFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM;
        int i17;
        int i18;
        Composer startRestartGroup = composer.startRestartGroup(1672878784);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(nyVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i19 = i3 & 2;
        if (i19 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                nyVar4 = nyVar2;
                i4 |= startRestartGroup.changedInstance(nyVar4) ? Fields.RotationX : Fields.SpotShadowColor;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    myVar2 = myVar;
                    i4 |= startRestartGroup.changedInstance(myVar2) ? Fields.CameraDistance : Fields.RotationZ;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        nyVar5 = nyVar3;
                        i4 |= startRestartGroup.changedInstance(nyVar5) ? Fields.Clip : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i4 |= startRestartGroup.changed(horizontal) ? Fields.RenderEffect : 65536;
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(f) ? 1048576 : Fields.BlendMode;
                        }
                        i10 = i3 & Fields.SpotShadowColor;
                        if (i10 != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                        if ((i & 100663296) == 0) {
                            if ((i3 & Fields.RotationX) == 0 && startRestartGroup.changed(windowInsets)) {
                                i18 = GroupFlagsKt.IsRecompositionRequiredFlag;
                                i4 |= i18;
                            }
                            i18 = GroupFlagsKt.HasAuxSlotFlag;
                            i4 |= i18;
                        }
                        if ((i & 805306368) == 0) {
                            if ((i3 & Fields.RotationY) == 0 && startRestartGroup.changed(topAppBarColors)) {
                                i17 = GroupFlagsKt.HasMovableContentFlag;
                                i4 |= i17;
                            }
                            i17 = GroupFlagsKt.IsMovableContentFlag;
                            i4 |= i17;
                        }
                        i11 = i3 & Fields.RotationZ;
                        if (i11 != 0) {
                            i12 = i11;
                            i13 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i12 = i11;
                            i13 = i2 | (startRestartGroup.changed(topAppBarScrollBehavior) ? 4 : 2);
                        } else {
                            i12 = i11;
                            i13 = i2;
                        }
                        i14 = i4;
                        if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i19 != 0 ? Modifier.Companion : modifier2;
                                if (i5 != 0) {
                                    nyVar4 = null;
                                }
                                my lambda$1767216677$material3 = i6 != 0 ? ComposableSingletons$AppBarKt.INSTANCE.getLambda$1767216677$material3() : myVar2;
                                ny m1823getLambda$470693625$material3 = i7 != 0 ? ComposableSingletons$AppBarKt.INSTANCE.m1823getLambda$470693625$material3() : nyVar5;
                                Alignment.Horizontal start = i8 != 0 ? Alignment.Companion.getStart() : horizontal;
                                m7631getUnspecifiedD9Ej5fM = i9 != 0 ? Dp.Companion.m7631getUnspecifiedD9Ej5fM() : f;
                                m7631getUnspecifiedD9Ej5fM2 = i10 != 0 ? Dp.Companion.m7631getUnspecifiedD9Ej5fM() : f2;
                                if ((i3 & Fields.RotationX) != 0) {
                                    windowInsets3 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                    i15 = i14 & (-234881025);
                                } else {
                                    windowInsets3 = windowInsets;
                                    i15 = i14;
                                }
                                if ((i3 & Fields.RotationY) != 0) {
                                    topAppBarColors3 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                    i15 &= -1879048193;
                                } else {
                                    topAppBarColors3 = topAppBarColors;
                                }
                                if (i12 != 0) {
                                    topAppBarColors4 = topAppBarColors3;
                                    myVar4 = lambda$1767216677$material3;
                                    nyVar8 = m1823getLambda$470693625$material3;
                                    horizontal3 = start;
                                    windowInsets4 = windowInsets3;
                                    topAppBarScrollBehavior3 = null;
                                } else {
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                    topAppBarColors4 = topAppBarColors3;
                                    myVar4 = lambda$1767216677$material3;
                                    nyVar8 = m1823getLambda$470693625$material3;
                                    horizontal3 = start;
                                    windowInsets4 = windowInsets3;
                                }
                                modifier4 = modifier5;
                                i16 = i15;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                i16 = (i3 & Fields.RotationX) != 0 ? i14 & (-234881025) : i14;
                                if ((i3 & Fields.RotationY) != 0) {
                                    i16 &= -1879048193;
                                }
                                horizontal3 = horizontal;
                                m7631getUnspecifiedD9Ej5fM2 = f2;
                                windowInsets4 = windowInsets;
                                topAppBarColors4 = topAppBarColors;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                myVar4 = myVar2;
                                nyVar8 = nyVar5;
                                m7631getUnspecifiedD9Ej5fM = f;
                                modifier4 = modifier2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1672878784, i16, i13, "androidx.compose.material3.TwoRowsTopAppBar (AppBar.kt:962)");
                            }
                            AppBarMediumFlexibleTokens appBarMediumFlexibleTokens = AppBarMediumFlexibleTokens.INSTANCE;
                            TextStyle value = TypographyKt.getValue(appBarMediumFlexibleTokens.getTitleFont(), startRestartGroup, 6);
                            AppBarSmallTokens appBarSmallTokens = AppBarSmallTokens.INSTANCE;
                            TextStyle value2 = TypographyKt.getValue(appBarSmallTokens.getTitleFont(), startRestartGroup, 6);
                            float m7611constructorimpl = Dp.m7611constructorimpl(0.0f);
                            TextStyle value3 = TypographyKt.getValue(appBarMediumFlexibleTokens.getSubtitleFont(), startRestartGroup, 6);
                            TextStyle value4 = TypographyKt.getValue(appBarSmallTokens.getSubtitleFont(), startRestartGroup, 6);
                            Dp.Companion companion = Dp.Companion;
                            float m2815getMediumAppBarCollapsedHeightD9Ej5fM = (Dp.m7616equalsimpl0(m7631getUnspecifiedD9Ej5fM, companion.m7631getUnspecifiedD9Ej5fM()) || Dp.m7616equalsimpl0(m7631getUnspecifiedD9Ej5fM, companion.m7630getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2815getMediumAppBarCollapsedHeightD9Ej5fM() : m7631getUnspecifiedD9Ej5fM;
                            if (Dp.m7616equalsimpl0(m7631getUnspecifiedD9Ej5fM2, companion.m7631getUnspecifiedD9Ej5fM()) || Dp.m7616equalsimpl0(m7631getUnspecifiedD9Ej5fM2, companion.m7630getInfinityD9Ej5fM())) {
                                m2817getMediumFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM = nyVar4 != null ? TopAppBarDefaults.INSTANCE.m2817getMediumFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM() : TopAppBarDefaults.INSTANCE.m2818getMediumFlexibleAppBarWithoutSubtitleExpandedHeightD9Ej5fM();
                            } else {
                                m2817getMediumFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM = m7631getUnspecifiedD9Ej5fM2;
                            }
                            int i20 = ((i16 >> 3) & 14) | 102263856;
                            int i21 = i16 >> 6;
                            int i22 = ((i16 >> 15) & 14) | (i21 & 112) | (i21 & 896);
                            int i23 = i16 >> 9;
                            composer2 = startRestartGroup;
                            m1628TwoRowsTopAppBarpJA5dT0(modifier4, ComposableLambdaKt.rememberComposableLambda(-1674885936, true, new my() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$1
                                public final void invoke(Composer composer3, int i24) {
                                    if (!composer3.shouldExecute((i24 & 3) != 2, i24 & 1)) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1674885936, i24, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:964)");
                                    }
                                    ny.this.invoke(Boolean.TRUE, composer3, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.my
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return w01.a;
                                }
                            }, startRestartGroup, 54), value, m7611constructorimpl, ComposableLambdaKt.rememberComposableLambda(1295408045, true, new my() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$2
                                public final void invoke(Composer composer3, int i24) {
                                    if (!composer3.shouldExecute((i24 & 3) != 2, i24 & 1)) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1295408045, i24, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:968)");
                                    }
                                    ny.this.invoke(Boolean.FALSE, composer3, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.my
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return w01.a;
                                }
                            }, startRestartGroup, 54), value2, ComposableLambdaKt.rememberComposableLambda(1843948267, true, new my() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$3
                                public final void invoke(Composer composer3, int i24) {
                                    if (!composer3.shouldExecute((i24 & 3) != 2, i24 & 1)) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1843948267, i24, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:970)");
                                    }
                                    ny nyVar9 = ny.this;
                                    if (nyVar9 == null) {
                                        composer3.startReplaceGroup(431118634);
                                    } else {
                                        composer3.startReplaceGroup(-1787208265);
                                        nyVar9.invoke(Boolean.TRUE, composer3, 6);
                                    }
                                    composer3.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.my
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return w01.a;
                                }
                            }, startRestartGroup, 54), value3, ComposableLambdaKt.rememberComposableLambda(-1902478807, true, new my() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$4
                                public final void invoke(Composer composer3, int i24) {
                                    if (!composer3.shouldExecute((i24 & 3) != 2, i24 & 1)) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1902478807, i24, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:972)");
                                    }
                                    ny nyVar9 = ny.this;
                                    if (nyVar9 == null) {
                                        composer3.startReplaceGroup(-357689013);
                                    } else {
                                        composer3.startReplaceGroup(1373934966);
                                        nyVar9.invoke(Boolean.FALSE, composer3, 6);
                                    }
                                    composer3.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.my
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return w01.a;
                                }
                            }, startRestartGroup, 54), value4, horizontal3, myVar4, nyVar8, m2815getMediumAppBarCollapsedHeightD9Ej5fM, m2817getMediumFlexibleAppBarWithSubtitleExpandedHeightD9Ej5fM, windowInsets4, topAppBarColors4, topAppBarScrollBehavior3, composer2, i20, (i23 & 3670016) | i22 | (458752 & i23) | ((i13 << 21) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            nyVar6 = nyVar4;
                            f4 = m7631getUnspecifiedD9Ej5fM;
                            f3 = m7631getUnspecifiedD9Ej5fM2;
                            modifier3 = modifier4;
                            horizontal2 = horizontal3;
                            myVar3 = myVar4;
                            nyVar7 = nyVar8;
                            windowInsets2 = windowInsets4;
                            topAppBarColors2 = topAppBarColors4;
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            horizontal2 = horizontal;
                            f3 = f2;
                            topAppBarColors2 = topAppBarColors;
                            modifier3 = modifier2;
                            nyVar6 = nyVar4;
                            myVar3 = myVar2;
                            nyVar7 = nyVar5;
                            f4 = f;
                            windowInsets2 = windowInsets;
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new w6(nyVar, modifier3, nyVar6, myVar3, nyVar7, horizontal2, f4, f3, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, i, i2, i3));
                            return;
                        }
                        return;
                    }
                    nyVar5 = nyVar3;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    i10 = i3 & Fields.SpotShadowColor;
                    if (i10 != 0) {
                    }
                    if ((i & 100663296) == 0) {
                    }
                    if ((i & 805306368) == 0) {
                    }
                    i11 = i3 & Fields.RotationZ;
                    if (i11 != 0) {
                    }
                    i14 = i4;
                    if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                myVar2 = myVar;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                nyVar5 = nyVar3;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                i10 = i3 & Fields.SpotShadowColor;
                if (i10 != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i11 = i3 & Fields.RotationZ;
                if (i11 != 0) {
                }
                i14 = i4;
                if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            nyVar4 = nyVar2;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            myVar2 = myVar;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            nyVar5 = nyVar3;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & Fields.SpotShadowColor;
            if (i10 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i11 = i3 & Fields.RotationZ;
            if (i11 != 0) {
            }
            i14 = i4;
            if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        nyVar4 = nyVar2;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        myVar2 = myVar;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        nyVar5 = nyVar3;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & Fields.SpotShadowColor;
        if (i10 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i11 = i3 & Fields.RotationZ;
        if (i11 != 0) {
        }
        i14 = i4;
        if (startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i13 & 3) != 2, i14 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0206  */
    /* renamed from: TwoRowsTopAppBar-pJA5dT0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m1628TwoRowsTopAppBarpJA5dT0(Modifier modifier, final my myVar, final TextStyle textStyle, final float f, final my myVar2, final TextStyle textStyle2, final my myVar3, final TextStyle textStyle3, final my myVar4, final TextStyle textStyle4, final Alignment.Horizontal horizontal, final my myVar5, final ny nyVar, final float f2, final float f3, final WindowInsets windowInsets, final TopAppBarColors topAppBarColors, final TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        my myVar6;
        TextStyle textStyle5;
        int i5;
        float f4;
        my myVar7;
        TextStyle textStyle6;
        int i6;
        my myVar8;
        int i7;
        int i8;
        int i9;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1092180406);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            myVar6 = myVar;
        } else {
            myVar6 = myVar;
            if ((i & 48) == 0) {
                i4 |= startRestartGroup.changedInstance(myVar6) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            textStyle5 = textStyle;
            i4 |= startRestartGroup.changed(textStyle5) ? Fields.RotationX : Fields.SpotShadowColor;
            i5 = i3 & 8;
            int i11 = Fields.RotationZ;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                f4 = f;
                i4 |= startRestartGroup.changed(f4) ? 2048 : 1024;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    myVar7 = myVar2;
                    i4 |= startRestartGroup.changedInstance(myVar7) ? 16384 : 8192;
                    if ((i3 & 32) == 0) {
                        i4 |= 196608;
                        textStyle6 = textStyle2;
                    } else {
                        textStyle6 = textStyle2;
                        if ((i & 196608) == 0) {
                            i4 |= startRestartGroup.changed(textStyle6) ? 131072 : 65536;
                        }
                    }
                    i6 = i3 & 64;
                    int i12 = Fields.BlendMode;
                    if (i6 == 0) {
                        i4 |= 1572864;
                        myVar8 = myVar3;
                    } else {
                        myVar8 = myVar3;
                        if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changedInstance(myVar8) ? 1048576 : 524288;
                        }
                    }
                    if ((i3 & Fields.SpotShadowColor) == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(textStyle3) ? 8388608 : 4194304;
                        if ((i3 & Fields.RotationX) != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i4 |= startRestartGroup.changedInstance(myVar4) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                            if ((i3 & Fields.RotationY) == 0) {
                                i4 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i4 |= startRestartGroup.changed(textStyle4) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                if ((i3 & Fields.RotationZ) != 0) {
                                    i7 = i2 | 6;
                                } else if ((i2 & 6) == 0) {
                                    i7 = i2 | (startRestartGroup.changed(horizontal) ? 4 : 2);
                                } else {
                                    i7 = i2;
                                }
                                if ((i3 & Fields.CameraDistance) != 0) {
                                    i7 |= 48;
                                } else if ((i2 & 48) == 0) {
                                    i7 |= startRestartGroup.changedInstance(myVar5) ? 32 : 16;
                                }
                                int i13 = i7;
                                if ((i3 & Fields.TransformOrigin) != 0) {
                                    i13 |= 384;
                                } else if ((i2 & 384) == 0) {
                                    i13 |= startRestartGroup.changedInstance(nyVar) ? Fields.RotationX : Fields.SpotShadowColor;
                                    if ((i3 & 8192) == 0) {
                                        i13 |= 3072;
                                    } else if ((i2 & 3072) == 0) {
                                        if (startRestartGroup.changed(f2)) {
                                            i11 = 2048;
                                        }
                                        i13 |= i11;
                                        if ((i3 & Fields.Clip) != 0) {
                                            i13 |= 24576;
                                        } else if ((i2 & 24576) == 0) {
                                            i13 |= startRestartGroup.changed(f3) ? 16384 : 8192;
                                            if ((i3 & Fields.CompositingStrategy) == 0) {
                                                i8 = i13 | 196608;
                                            } else {
                                                int i14 = i13;
                                                if ((i2 & 196608) == 0) {
                                                    i8 = i14 | (startRestartGroup.changed(windowInsets) ? 131072 : 65536);
                                                } else {
                                                    i8 = i14;
                                                }
                                            }
                                            if ((i3 & 65536) == 0) {
                                                i8 |= 1572864;
                                            } else if ((i2 & 1572864) == 0) {
                                                if (startRestartGroup.changed(topAppBarColors)) {
                                                    i12 = 1048576;
                                                }
                                                i8 |= i12;
                                            }
                                            if ((i3 & Fields.RenderEffect) == 0) {
                                                i8 |= 12582912;
                                            } else if ((i2 & 12582912) == 0) {
                                                i8 |= startRestartGroup.changed(topAppBarScrollBehavior) ? 8388608 : 4194304;
                                            }
                                            i9 = i8;
                                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (4793491 & i9) != 4793490, i4 & 1)) {
                                                startRestartGroup.skipToGroupEnd();
                                                modifier3 = modifier2;
                                            } else {
                                                Modifier modifier4 = i10 != 0 ? Modifier.Companion : modifier2;
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1092180406, i4, i9, "androidx.compose.material3.TwoRowsTopAppBar (AppBar.kt:2700)");
                                                }
                                                ((TwoRowsTopAppBarOverride) startRestartGroup.consume(LocalTwoRowsTopAppBarOverride)).TwoRowsTopAppBar(new TwoRowsTopAppBarOverrideScope(modifier4, myVar6, textStyle5, f4, myVar7, textStyle6, myVar8, textStyle3, myVar4, textStyle4, horizontal, myVar5, nyVar, f2, f3, windowInsets, topAppBarColors, topAppBarScrollBehavior, null), startRestartGroup, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                modifier3 = modifier4;
                                            }
                                            endRestartGroup = startRestartGroup.endRestartGroup();
                                            if (endRestartGroup == null) {
                                                endRestartGroup.updateScope(new my() { // from class: i7
                                                    @Override // defpackage.my
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        w01 TwoRowsTopAppBar_pJA5dT0$lambda$35;
                                                        int intValue = ((Integer) obj2).intValue();
                                                        TwoRowsTopAppBar_pJA5dT0$lambda$35 = AppBarKt.TwoRowsTopAppBar_pJA5dT0$lambda$35(Modifier.this, myVar, textStyle, f, myVar2, textStyle2, myVar3, textStyle3, myVar4, textStyle4, horizontal, myVar5, nyVar, f2, f3, windowInsets, topAppBarColors, topAppBarScrollBehavior, i, i2, i3, (Composer) obj, intValue);
                                                        return TwoRowsTopAppBar_pJA5dT0$lambda$35;
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                        if ((i3 & Fields.CompositingStrategy) == 0) {
                                        }
                                        if ((i3 & 65536) == 0) {
                                        }
                                        if ((i3 & Fields.RenderEffect) == 0) {
                                        }
                                        i9 = i8;
                                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (4793491 & i9) != 4793490, i4 & 1)) {
                                        }
                                        endRestartGroup = startRestartGroup.endRestartGroup();
                                        if (endRestartGroup == null) {
                                        }
                                    }
                                    if ((i3 & Fields.Clip) != 0) {
                                    }
                                    if ((i3 & Fields.CompositingStrategy) == 0) {
                                    }
                                    if ((i3 & 65536) == 0) {
                                    }
                                    if ((i3 & Fields.RenderEffect) == 0) {
                                    }
                                    i9 = i8;
                                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (4793491 & i9) != 4793490, i4 & 1)) {
                                    }
                                    endRestartGroup = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup == null) {
                                    }
                                }
                                if ((i3 & 8192) == 0) {
                                }
                                if ((i3 & Fields.Clip) != 0) {
                                }
                                if ((i3 & Fields.CompositingStrategy) == 0) {
                                }
                                if ((i3 & 65536) == 0) {
                                }
                                if ((i3 & Fields.RenderEffect) == 0) {
                                }
                                i9 = i8;
                                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (4793491 & i9) != 4793490, i4 & 1)) {
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            if ((i3 & Fields.RotationZ) != 0) {
                            }
                            if ((i3 & Fields.CameraDistance) != 0) {
                            }
                            int i132 = i7;
                            if ((i3 & Fields.TransformOrigin) != 0) {
                            }
                            if ((i3 & 8192) == 0) {
                            }
                            if ((i3 & Fields.Clip) != 0) {
                            }
                            if ((i3 & Fields.CompositingStrategy) == 0) {
                            }
                            if ((i3 & 65536) == 0) {
                            }
                            if ((i3 & Fields.RenderEffect) == 0) {
                            }
                            i9 = i8;
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (4793491 & i9) != 4793490, i4 & 1)) {
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        if ((i3 & Fields.RotationY) == 0) {
                        }
                        if ((i3 & Fields.RotationZ) != 0) {
                        }
                        if ((i3 & Fields.CameraDistance) != 0) {
                        }
                        int i1322 = i7;
                        if ((i3 & Fields.TransformOrigin) != 0) {
                        }
                        if ((i3 & 8192) == 0) {
                        }
                        if ((i3 & Fields.Clip) != 0) {
                        }
                        if ((i3 & Fields.CompositingStrategy) == 0) {
                        }
                        if ((i3 & 65536) == 0) {
                        }
                        if ((i3 & Fields.RenderEffect) == 0) {
                        }
                        i9 = i8;
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (4793491 & i9) != 4793490, i4 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    if ((i3 & Fields.RotationX) != 0) {
                    }
                    if ((i3 & Fields.RotationY) == 0) {
                    }
                    if ((i3 & Fields.RotationZ) != 0) {
                    }
                    if ((i3 & Fields.CameraDistance) != 0) {
                    }
                    int i13222 = i7;
                    if ((i3 & Fields.TransformOrigin) != 0) {
                    }
                    if ((i3 & 8192) == 0) {
                    }
                    if ((i3 & Fields.Clip) != 0) {
                    }
                    if ((i3 & Fields.CompositingStrategy) == 0) {
                    }
                    if ((i3 & 65536) == 0) {
                    }
                    if ((i3 & Fields.RenderEffect) == 0) {
                    }
                    i9 = i8;
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (4793491 & i9) != 4793490, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                myVar7 = myVar2;
                if ((i3 & 32) == 0) {
                }
                i6 = i3 & 64;
                int i122 = Fields.BlendMode;
                if (i6 == 0) {
                }
                if ((i3 & Fields.SpotShadowColor) == 0) {
                }
                if ((i3 & Fields.RotationX) != 0) {
                }
                if ((i3 & Fields.RotationY) == 0) {
                }
                if ((i3 & Fields.RotationZ) != 0) {
                }
                if ((i3 & Fields.CameraDistance) != 0) {
                }
                int i132222 = i7;
                if ((i3 & Fields.TransformOrigin) != 0) {
                }
                if ((i3 & 8192) == 0) {
                }
                if ((i3 & Fields.Clip) != 0) {
                }
                if ((i3 & Fields.CompositingStrategy) == 0) {
                }
                if ((i3 & 65536) == 0) {
                }
                if ((i3 & Fields.RenderEffect) == 0) {
                }
                i9 = i8;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (4793491 & i9) != 4793490, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f4 = f;
            if ((i3 & 16) != 0) {
            }
            myVar7 = myVar2;
            if ((i3 & 32) == 0) {
            }
            i6 = i3 & 64;
            int i1222 = Fields.BlendMode;
            if (i6 == 0) {
            }
            if ((i3 & Fields.SpotShadowColor) == 0) {
            }
            if ((i3 & Fields.RotationX) != 0) {
            }
            if ((i3 & Fields.RotationY) == 0) {
            }
            if ((i3 & Fields.RotationZ) != 0) {
            }
            if ((i3 & Fields.CameraDistance) != 0) {
            }
            int i1322222 = i7;
            if ((i3 & Fields.TransformOrigin) != 0) {
            }
            if ((i3 & 8192) == 0) {
            }
            if ((i3 & Fields.Clip) != 0) {
            }
            if ((i3 & Fields.CompositingStrategy) == 0) {
            }
            if ((i3 & 65536) == 0) {
            }
            if ((i3 & Fields.RenderEffect) == 0) {
            }
            i9 = i8;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (4793491 & i9) != 4793490, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        textStyle5 = textStyle;
        i5 = i3 & 8;
        int i112 = Fields.RotationZ;
        if (i5 == 0) {
        }
        f4 = f;
        if ((i3 & 16) != 0) {
        }
        myVar7 = myVar2;
        if ((i3 & 32) == 0) {
        }
        i6 = i3 & 64;
        int i12222 = Fields.BlendMode;
        if (i6 == 0) {
        }
        if ((i3 & Fields.SpotShadowColor) == 0) {
        }
        if ((i3 & Fields.RotationX) != 0) {
        }
        if ((i3 & Fields.RotationY) == 0) {
        }
        if ((i3 & Fields.RotationZ) != 0) {
        }
        if ((i3 & Fields.CameraDistance) != 0) {
        }
        int i13222222 = i7;
        if ((i3 & Fields.TransformOrigin) != 0) {
        }
        if ((i3 & 8192) == 0) {
        }
        if ((i3 & Fields.Clip) != 0) {
        }
        if ((i3 & Fields.CompositingStrategy) == 0) {
        }
        if ((i3 & 65536) == 0) {
        }
        if ((i3 & Fields.RenderEffect) == 0) {
        }
        i9 = i8;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (4793491 & i9) != 4793490, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TwoRowsTopAppBar_eXZ4JBQ$lambda$11(ny nyVar, Modifier modifier, ny nyVar2, my myVar, ny nyVar3, Alignment.Horizontal horizontal, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3, Composer composer, int i4) {
        m1627TwoRowsTopAppBareXZ4JBQ(nyVar, modifier, nyVar2, myVar, nyVar3, horizontal, f, f2, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TwoRowsTopAppBar_pJA5dT0$lambda$35(Modifier modifier, my myVar, TextStyle textStyle, float f, my myVar2, TextStyle textStyle2, my myVar3, TextStyle textStyle3, my myVar4, TextStyle textStyle4, Alignment.Horizontal horizontal, my myVar5, ny nyVar, float f2, float f3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3, Composer composer, int i4) {
        m1628TwoRowsTopAppBarpJA5dT0(modifier, myVar, textStyle, f, myVar2, textStyle2, myVar3, textStyle3, myVar4, textStyle4, horizontal, myVar5, nyVar, f2, f3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier adjustHeightOffsetLimit(Modifier modifier, TopAppBarScrollBehavior topAppBarScrollBehavior) {
        TopAppBarState state;
        Modifier onSizeChanged;
        return (topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null || (onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifier, new d7(state, 0))) == null) ? modifier : onSizeChanged;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 adjustHeightOffsetLimit$lambda$38$lambda$37(TopAppBarState topAppBarState, IntSize intSize) {
        topAppBarState.setHeightOffsetLimit(-(((int) (intSize.m7786unboximpl() & 4294967295L)) - topAppBarState.getHeightOffset()));
        return w01.a;
    }

    public static final float getBottomAppBarVerticalPadding() {
        return BottomAppBarVerticalPadding;
    }

    public static final ProvidableCompositionLocal<SingleRowTopAppBarOverride> getLocalSingleRowTopAppBarOverride() {
        return LocalSingleRowTopAppBarOverride;
    }

    public static final ProvidableCompositionLocal<TwoRowsTopAppBarOverride> getLocalTwoRowsTopAppBarOverride() {
        return LocalTwoRowsTopAppBarOverride;
    }

    public static final CubicBezierEasing getTopTitleAlphaEasing() {
        return TopTitleAlphaEasing;
    }

    public static final BottomAppBarState rememberBottomAppBarState(float f, float f2, float f3, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = -3.4028235E38f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1420874240, i, -1, "androidx.compose.material3.rememberBottomAppBarState (AppBar.kt:2234)");
        }
        int i3 = 0;
        Object[] objArr = new Object[0];
        Saver<BottomAppBarState, ?> saver = BottomAppBarState.Companion.getSaver();
        boolean z = true;
        boolean z2 = ((((i & 14) ^ 6) > 4 && composer.changed(f)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(f2)) || (i & 48) == 32);
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(f3)) && (i & 384) != 256) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new k7(f, f2, f3, i3);
            composer.updateRememberedValue(rememberedValue);
        }
        BottomAppBarState bottomAppBarState = (BottomAppBarState) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) saver, (iy) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bottomAppBarState;
    }

    public static final TopAppBarState rememberTopAppBarState(float f, float f2, float f3, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = -3.4028235E38f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1801969826, i, -1, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:1857)");
        }
        Object[] objArr = new Object[0];
        Saver<TopAppBarState, ?> saver = TopAppBarState.Companion.getSaver();
        int i3 = 1;
        boolean z = ((((i & 896) ^ 384) > 256 && composer.changed(f3)) || (i & 384) == 256) | ((((i & 14) ^ 6) > 4 && composer.changed(f)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(f2)) || (i & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new k7(f, f2, f3, i3);
            composer.updateRememberedValue(rememberedValue);
        }
        TopAppBarState topAppBarState = (TopAppBarState) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) saver, (iy) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return topAppBarState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TopAppBarState rememberTopAppBarState$lambda$26$lambda$25(float f, float f2, float f3) {
        return new TopAppBarState(f, f2, f3);
    }

    private static final State<Boolean> rememberTouchExplorationService(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1660719518, i, -1, "androidx.compose.material3.rememberTouchExplorationService (AppBar.kt:3498)");
        }
        State<Boolean> rememberAccessibilityServiceState = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(true, false, false, composer, 438, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberAccessibilityServiceState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00aa, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(r3, r26, false, r6, r7, 2, null) == r14) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object settleAppBar(TopAppBarState topAppBarState, float f, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, hm hmVar) {
        AppBarKt$settleAppBar$1 appBarKt$settleAppBar$1;
        AppBarKt$settleAppBar$1 appBarKt$settleAppBar$12;
        int i;
        int i2;
        vn vnVar;
        gi0 gi0Var;
        AnimationSpec<Float> animationSpec2;
        AnimationSpec<Float> animationSpec3;
        AnimationState AnimationState$default;
        Float f2;
        d7 d7Var;
        gi0 gi0Var2;
        TopAppBarState topAppBarState2 = topAppBarState;
        if (hmVar instanceof AppBarKt$settleAppBar$1) {
            appBarKt$settleAppBar$1 = (AppBarKt$settleAppBar$1) hmVar;
            int i3 = appBarKt$settleAppBar$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                appBarKt$settleAppBar$1.label = i3 - Integer.MIN_VALUE;
                appBarKt$settleAppBar$12 = appBarKt$settleAppBar$1;
                Object obj = appBarKt$settleAppBar$12.result;
                i = appBarKt$settleAppBar$12.label;
                i2 = 1;
                vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    if (topAppBarState2.getCollapsedFraction() < 0.01f || topAppBarState2.getCollapsedFraction() == 1.0f) {
                        return Velocity.m7840boximpl(Velocity.Companion.m7860getZero9UxMQ8M());
                    }
                    gi0Var = new gi0();
                    gi0Var.d = f;
                    if (decayAnimationSpec == null || Math.abs(f) <= 1.0f) {
                        animationSpec2 = animationSpec;
                    } else {
                        gi0 gi0Var3 = new gi0();
                        AnimationState AnimationState$default2 = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                        defpackage.f1 f1Var = new defpackage.f1(gi0Var3, topAppBarState2, gi0Var, i2);
                        appBarKt$settleAppBar$12.L$0 = topAppBarState2;
                        animationSpec2 = animationSpec;
                        appBarKt$settleAppBar$12.L$1 = animationSpec2;
                        appBarKt$settleAppBar$12.L$2 = gi0Var;
                        appBarKt$settleAppBar$12.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        gi0Var2 = (gi0) appBarKt$settleAppBar$12.L$0;
                        p10.Q(obj);
                        gi0Var = gi0Var2;
                        return Velocity.m7840boximpl(VelocityKt.Velocity(0.0f, gi0Var.d));
                    }
                    gi0 gi0Var4 = (gi0) appBarKt$settleAppBar$12.L$2;
                    animationSpec2 = (AnimationSpec) appBarKt$settleAppBar$12.L$1;
                    TopAppBarState topAppBarState3 = (TopAppBarState) appBarKt$settleAppBar$12.L$0;
                    p10.Q(obj);
                    gi0Var = gi0Var4;
                    topAppBarState2 = topAppBarState3;
                }
                animationSpec3 = animationSpec2;
                if (animationSpec3 != null && topAppBarState2.getHeightOffset() < 0.0f && topAppBarState2.getHeightOffset() > topAppBarState2.getHeightOffsetLimit()) {
                    AnimationState$default = AnimationStateKt.AnimationState$default(topAppBarState2.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
                    f2 = new Float(topAppBarState2.getCollapsedFraction() >= 0.5f ? 0.0f : topAppBarState2.getHeightOffsetLimit());
                    d7Var = new d7(topAppBarState2, i2);
                    appBarKt$settleAppBar$12.L$0 = gi0Var;
                    appBarKt$settleAppBar$12.L$1 = null;
                    appBarKt$settleAppBar$12.L$2 = null;
                    appBarKt$settleAppBar$12.label = 2;
                    if (SuspendAnimationKt.animateTo$default(AnimationState$default, f2, animationSpec3, false, d7Var, appBarKt$settleAppBar$12, 4, null) != vnVar) {
                        gi0Var2 = gi0Var;
                        gi0Var = gi0Var2;
                    }
                    return vnVar;
                }
                return Velocity.m7840boximpl(VelocityKt.Velocity(0.0f, gi0Var.d));
            }
        }
        appBarKt$settleAppBar$1 = new AppBarKt$settleAppBar$1(hmVar);
        appBarKt$settleAppBar$12 = appBarKt$settleAppBar$1;
        Object obj2 = appBarKt$settleAppBar$12.result;
        i = appBarKt$settleAppBar$12.label;
        i2 = 1;
        vnVar = vn.d;
        if (i != 0) {
        }
        animationSpec3 = animationSpec2;
        if (animationSpec3 != null) {
            AnimationState$default = AnimationStateKt.AnimationState$default(topAppBarState2.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
            f2 = new Float(topAppBarState2.getCollapsedFraction() >= 0.5f ? 0.0f : topAppBarState2.getHeightOffsetLimit());
            d7Var = new d7(topAppBarState2, i2);
            appBarKt$settleAppBar$12.L$0 = gi0Var;
            appBarKt$settleAppBar$12.L$1 = null;
            appBarKt$settleAppBar$12.L$2 = null;
            appBarKt$settleAppBar$12.label = 2;
            if (SuspendAnimationKt.animateTo$default(AnimationState$default, f2, animationSpec3, false, d7Var, appBarKt$settleAppBar$12, 4, null) != vnVar) {
            }
            return vnVar;
        }
        return Velocity.m7840boximpl(VelocityKt.Velocity(0.0f, gi0Var.d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 settleAppBar$lambda$54(gi0 gi0Var, TopAppBarState topAppBarState, gi0 gi0Var2, AnimationScope animationScope) {
        float floatValue = ((Number) animationScope.getValue()).floatValue() - gi0Var.d;
        float heightOffset = topAppBarState.getHeightOffset();
        topAppBarState.setHeightOffset(heightOffset + floatValue);
        float abs = Math.abs(heightOffset - topAppBarState.getHeightOffset());
        gi0Var.d = ((Number) animationScope.getValue()).floatValue();
        gi0Var2.d = ((Number) animationScope.getVelocity()).floatValue();
        if (Math.abs(floatValue - abs) > 0.5f) {
            animationScope.cancelAnimation();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 settleAppBar$lambda$55(TopAppBarState topAppBarState, AnimationScope animationScope) {
        topAppBarState.setHeightOffset(((Number) animationScope.getValue()).floatValue());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(r4, r25, false, r6, r7, 2, null) == r13) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object settleAppBarBottom(BottomAppBarState bottomAppBarState, float f, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, hm hmVar) {
        AppBarKt$settleAppBarBottom$1 appBarKt$settleAppBarBottom$1;
        AppBarKt$settleAppBarBottom$1 appBarKt$settleAppBarBottom$12;
        int i;
        vn vnVar;
        gi0 gi0Var;
        AnimationSpec<Float> animationSpec2;
        AnimationSpec<Float> animationSpec3;
        AnimationState AnimationState$default;
        Float f2;
        defpackage.h hVar;
        gi0 gi0Var2;
        BottomAppBarState bottomAppBarState2 = bottomAppBarState;
        if (hmVar instanceof AppBarKt$settleAppBarBottom$1) {
            appBarKt$settleAppBarBottom$1 = (AppBarKt$settleAppBarBottom$1) hmVar;
            int i2 = appBarKt$settleAppBarBottom$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appBarKt$settleAppBarBottom$1.label = i2 - Integer.MIN_VALUE;
                appBarKt$settleAppBarBottom$12 = appBarKt$settleAppBarBottom$1;
                Object obj = appBarKt$settleAppBarBottom$12.result;
                i = appBarKt$settleAppBarBottom$12.label;
                int i3 = 2;
                vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    if (bottomAppBarState2.getCollapsedFraction() < 0.01f || bottomAppBarState2.getCollapsedFraction() == 1.0f) {
                        return Velocity.m7840boximpl(Velocity.Companion.m7860getZero9UxMQ8M());
                    }
                    gi0Var = new gi0();
                    gi0Var.d = f;
                    if (decayAnimationSpec == null || Math.abs(f) <= 1.0f) {
                        animationSpec2 = animationSpec;
                    } else {
                        gi0 gi0Var3 = new gi0();
                        AnimationState AnimationState$default2 = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                        defpackage.f1 f1Var = new defpackage.f1(gi0Var3, bottomAppBarState2, gi0Var, i3);
                        appBarKt$settleAppBarBottom$12.L$0 = bottomAppBarState2;
                        animationSpec2 = animationSpec;
                        appBarKt$settleAppBarBottom$12.L$1 = animationSpec2;
                        appBarKt$settleAppBarBottom$12.L$2 = gi0Var;
                        appBarKt$settleAppBarBottom$12.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        gi0Var2 = (gi0) appBarKt$settleAppBarBottom$12.L$0;
                        p10.Q(obj);
                        gi0Var = gi0Var2;
                        return Velocity.m7840boximpl(VelocityKt.Velocity(0.0f, gi0Var.d));
                    }
                    gi0 gi0Var4 = (gi0) appBarKt$settleAppBarBottom$12.L$2;
                    animationSpec2 = (AnimationSpec) appBarKt$settleAppBarBottom$12.L$1;
                    BottomAppBarState bottomAppBarState3 = (BottomAppBarState) appBarKt$settleAppBarBottom$12.L$0;
                    p10.Q(obj);
                    gi0Var = gi0Var4;
                    bottomAppBarState2 = bottomAppBarState3;
                }
                animationSpec3 = animationSpec2;
                if (animationSpec3 != null && bottomAppBarState2.getHeightOffset() < 0.0f && bottomAppBarState2.getHeightOffset() > bottomAppBarState2.getHeightOffsetLimit()) {
                    AnimationState$default = AnimationStateKt.AnimationState$default(bottomAppBarState2.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
                    f2 = new Float(bottomAppBarState2.getCollapsedFraction() >= 0.5f ? 0.0f : bottomAppBarState2.getHeightOffsetLimit());
                    hVar = new defpackage.h(bottomAppBarState2, 4);
                    appBarKt$settleAppBarBottom$12.L$0 = gi0Var;
                    appBarKt$settleAppBarBottom$12.L$1 = null;
                    appBarKt$settleAppBarBottom$12.L$2 = null;
                    appBarKt$settleAppBarBottom$12.label = 2;
                    if (SuspendAnimationKt.animateTo$default(AnimationState$default, f2, animationSpec3, false, hVar, appBarKt$settleAppBarBottom$12, 4, null) != vnVar) {
                        gi0Var2 = gi0Var;
                        gi0Var = gi0Var2;
                    }
                    return vnVar;
                }
                return Velocity.m7840boximpl(VelocityKt.Velocity(0.0f, gi0Var.d));
            }
        }
        appBarKt$settleAppBarBottom$1 = new AppBarKt$settleAppBarBottom$1(hmVar);
        appBarKt$settleAppBarBottom$12 = appBarKt$settleAppBarBottom$1;
        Object obj2 = appBarKt$settleAppBarBottom$12.result;
        i = appBarKt$settleAppBarBottom$12.label;
        int i32 = 2;
        vnVar = vn.d;
        if (i != 0) {
        }
        animationSpec3 = animationSpec2;
        if (animationSpec3 != null) {
            AnimationState$default = AnimationStateKt.AnimationState$default(bottomAppBarState2.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
            f2 = new Float(bottomAppBarState2.getCollapsedFraction() >= 0.5f ? 0.0f : bottomAppBarState2.getHeightOffsetLimit());
            hVar = new defpackage.h(bottomAppBarState2, 4);
            appBarKt$settleAppBarBottom$12.L$0 = gi0Var;
            appBarKt$settleAppBarBottom$12.L$1 = null;
            appBarKt$settleAppBarBottom$12.L$2 = null;
            appBarKt$settleAppBarBottom$12.label = 2;
            if (SuspendAnimationKt.animateTo$default(AnimationState$default, f2, animationSpec3, false, hVar, appBarKt$settleAppBarBottom$12, 4, null) != vnVar) {
            }
            return vnVar;
        }
        return Velocity.m7840boximpl(VelocityKt.Velocity(0.0f, gi0Var.d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 settleAppBarBottom$lambda$29(gi0 gi0Var, BottomAppBarState bottomAppBarState, gi0 gi0Var2, AnimationScope animationScope) {
        float floatValue = ((Number) animationScope.getValue()).floatValue() - gi0Var.d;
        float heightOffset = bottomAppBarState.getHeightOffset();
        bottomAppBarState.setHeightOffset(heightOffset + floatValue);
        float abs = Math.abs(heightOffset - bottomAppBarState.getHeightOffset());
        gi0Var.d = ((Number) animationScope.getValue()).floatValue();
        gi0Var2.d = ((Number) animationScope.getVelocity()).floatValue();
        if (Math.abs(floatValue - abs) > 0.5f) {
            animationScope.cancelAnimation();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 settleAppBarBottom$lambda$30(BottomAppBarState bottomAppBarState, AnimationScope animationScope) {
        bottomAppBarState.setHeightOffset(((Number) animationScope.getValue()).floatValue());
        return w01.a;
    }

    public static /* synthetic */ void getLocalSingleRowTopAppBarOverride$annotations() {
    }

    public static /* synthetic */ void getLocalTwoRowsTopAppBarOverride$annotations() {
    }
}
