package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.internal.Icons;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import defpackage.ae;
import defpackage.my;
import defpackage.ny;
import defpackage.oi;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SegmentedButtonDefaults {
    public static final int $stable = 0;
    private static final float BorderWidth;
    private static final PaddingValues ContentPadding;
    public static final SegmentedButtonDefaults INSTANCE = new SegmentedButtonDefaults();
    private static final float IconSize;

    static {
        OutlinedSegmentedButtonTokens outlinedSegmentedButtonTokens = OutlinedSegmentedButtonTokens.INSTANCE;
        BorderWidth = outlinedSegmentedButtonTokens.m3491getOutlineWidthD9Ej5fM();
        IconSize = outlinedSegmentedButtonTokens.m3490getIconSizeD9Ej5fM();
        ContentPadding = ButtonDefaults.INSTANCE.getTextButtonContentPadding();
    }

    private SegmentedButtonDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ActiveIcon$lambda$1(SegmentedButtonDefaults segmentedButtonDefaults, int i, Composer composer, int i2) {
        segmentedButtonDefaults.ActiveIcon(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Icon$lambda$2(SegmentedButtonDefaults segmentedButtonDefaults, boolean z, my myVar, my myVar2, int i, int i2, Composer composer, int i3) {
        segmentedButtonDefaults.Icon(z, myVar, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* renamed from: borderStroke-l07J4OM$default, reason: not valid java name */
    public static /* synthetic */ BorderStroke m2352borderStrokel07J4OM$default(SegmentedButtonDefaults segmentedButtonDefaults, long j, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = BorderWidth;
        }
        return segmentedButtonDefaults.m2353borderStrokel07J4OM(j, f);
    }

    public final void ActiveIcon(Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1273041460);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1273041460, i2, -1, "androidx.compose.material3.SegmentedButtonDefaults.ActiveIcon (SegmentedButton.kt:614)");
            }
            IconKt.m2055Iconww6aTOc(Icons.Filled.INSTANCE.getCheck$material3(), (String) null, SizeKt.m807size3ABfNKs(Modifier.Companion, IconSize), 0L, startRestartGroup, 48, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new oi(this, i, 6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Icon(boolean z, my myVar, my myVar2, Composer composer, int i, int i2) {
        boolean z2;
        int i3;
        my myVar3;
        int i4;
        my myVar4;
        final my myVar5;
        my myVar6;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-657462570);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(z2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            myVar3 = myVar;
            i3 |= startRestartGroup.changedInstance(myVar3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                myVar4 = myVar2;
                i3 |= startRestartGroup.changedInstance(myVar4) ? Fields.RotationX : Fields.SpotShadowColor;
                if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    myVar5 = i5 != 0 ? ComposableSingletons$SegmentedButtonKt.INSTANCE.getLambda$1863131183$material3() : myVar3;
                    final my myVar7 = i4 != 0 ? null : myVar4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-657462570, i3, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon (SegmentedButton.kt:635)");
                    }
                    if (myVar7 == null) {
                        startRestartGroup.startReplaceGroup(-1416314439);
                        AnimatedVisibilityKt.AnimatedVisibility(z2, (Modifier) null, EnterExitTransitionKt.fadeIn$default(MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6), 0.0f, 2, null).plus(EnterExitTransitionKt.m48scaleInL8ZKhE(MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6), 0.0f, TransformOriginKt.TransformOrigin(0.0f, 1.0f))), ExitTransition.Companion.getNone(), (String) null, ComposableLambdaKt.rememberComposableLambda(2059591811, true, new ny() { // from class: androidx.compose.material3.SegmentedButtonDefaults$Icon$1
                            public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, int i6) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2059591811, i6, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon.<anonymous> (SegmentedButton.kt:649)");
                                }
                                my.this.invoke(composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // defpackage.ny
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                                return w01.a;
                            }
                        }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 196608, 18);
                        startRestartGroup = startRestartGroup;
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1415695803);
                        CrossfadeKt.Crossfade(Boolean.valueOf(z), (Modifier) null, (FiniteAnimationSpec<Float>) MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6), (String) null, ComposableLambdaKt.rememberComposableLambda(-1785818285, true, new ny() { // from class: androidx.compose.material3.SegmentedButtonDefaults$Icon$2
                            public final void invoke(boolean z3, Composer composer2, int i6) {
                                my myVar8;
                                if ((i6 & 6) == 0) {
                                    i6 |= composer2.changed(z3) ? 4 : 2;
                                }
                                if (!composer2.shouldExecute((i6 & 19) != 18, i6 & 1)) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1785818285, i6, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon.<anonymous> (SegmentedButton.kt:657)");
                                }
                                if (z3) {
                                    composer2.startReplaceGroup(1815547362);
                                    myVar8 = my.this;
                                } else {
                                    composer2.startReplaceGroup(1815548036);
                                    myVar8 = myVar7;
                                }
                                myVar8.invoke(composer2, 0);
                                composer2.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // defpackage.ny
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke(((Boolean) obj).booleanValue(), (Composer) obj2, ((Number) obj3).intValue());
                                return w01.a;
                            }
                        }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 24576, 10);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    myVar6 = myVar7;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    myVar5 = myVar3;
                    myVar6 = myVar4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new ae(this, z, myVar5, myVar6, i, i2));
                    return;
                }
                return;
            }
            myVar4 = myVar2;
            if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        myVar3 = myVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        myVar4 = myVar2;
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: borderStroke-l07J4OM, reason: not valid java name */
    public final BorderStroke m2353borderStrokel07J4OM(long j, float f) {
        return BorderStrokeKt.m253BorderStrokecXLIe8U(f, j);
    }

    public final SegmentedButtonColors colors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(679457321, i, -1, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:494)");
        }
        SegmentedButtonColors defaultSegmentedButtonColors$material3 = getDefaultSegmentedButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSegmentedButtonColors$material3;
    }

    /* renamed from: colors-XqyqHi0, reason: not valid java name */
    public final SegmentedButtonColors m2354colorsXqyqHi0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, Composer composer, int i, int i2, int i3) {
        long j13;
        long j14;
        long m4797getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        long m4797getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j2;
        long m4797getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j3;
        long m4797getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j4;
        long m4797getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
        long m4797getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j6;
        long m4797getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j7;
        long m4797getUnspecified0d7_KjU8 = (i3 & Fields.SpotShadowColor) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j8;
        long j15 = m4797getUnspecified0d7_KjU;
        long m4797getUnspecified0d7_KjU9 = (i3 & Fields.RotationX) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j9;
        long m4797getUnspecified0d7_KjU10 = (i3 & Fields.RotationY) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j10;
        long m4797getUnspecified0d7_KjU11 = (i3 & Fields.RotationZ) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j11;
        long m4797getUnspecified0d7_KjU12 = (i3 & Fields.CameraDistance) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j12;
        if (ComposerKt.isTraceInProgress()) {
            j13 = m4797getUnspecified0d7_KjU11;
            j14 = m4797getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(132526205, i, i2, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:530)");
        } else {
            j13 = m4797getUnspecified0d7_KjU11;
            j14 = m4797getUnspecified0d7_KjU2;
        }
        SegmentedButtonColors m2339copy2qZNXz8 = getDefaultSegmentedButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2339copy2qZNXz8(j15, j14, m4797getUnspecified0d7_KjU3, m4797getUnspecified0d7_KjU4, m4797getUnspecified0d7_KjU5, m4797getUnspecified0d7_KjU6, m4797getUnspecified0d7_KjU7, m4797getUnspecified0d7_KjU8, m4797getUnspecified0d7_KjU9, m4797getUnspecified0d7_KjU10, j13, m4797getUnspecified0d7_KjU12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2339copy2qZNXz8;
    }

    public final CornerBasedShape getBaseShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1264240381, i, -1, "androidx.compose.material3.SegmentedButtonDefaults.<get-baseShape> (SegmentedButton.kt:578)");
        }
        Shape value = ShapesKt.getValue(OutlinedSegmentedButtonTokens.INSTANCE.getShape(), composer, 6);
        value.getClass();
        CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cornerBasedShape;
    }

    /* renamed from: getBorderWidth-D9Ej5fM, reason: not valid java name */
    public final float m2355getBorderWidthD9Ej5fM() {
        return BorderWidth;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    public final SegmentedButtonColors getDefaultSegmentedButtonColors$material3(ColorScheme colorScheme) {
        SegmentedButtonColors defaultSegmentedButtonColorsCached$material3 = colorScheme.getDefaultSegmentedButtonColorsCached$material3();
        if (defaultSegmentedButtonColorsCached$material3 != null) {
            return defaultSegmentedButtonColorsCached$material3;
        }
        OutlinedSegmentedButtonTokens outlinedSegmentedButtonTokens = OutlinedSegmentedButtonTokens.INSTANCE;
        long fromToken = ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getSelectedContainerColor());
        long fromToken2 = ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getSelectedLabelTextColor());
        long fromToken3 = ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getOutlineColor());
        Color.Companion companion = Color.Companion;
        SegmentedButtonColors segmentedButtonColors = new SegmentedButtonColors(fromToken, fromToken2, fromToken3, companion.m4796getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getOutlineColor()), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getSelectedContainerColor()), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getDisabledLabelTextColor()), outlinedSegmentedButtonTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getOutlineColor()), outlinedSegmentedButtonTokens.getDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null), companion.m4796getTransparent0d7_KjU(), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getDisabledLabelTextColor()), outlinedSegmentedButtonTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getOutlineColor()), outlinedSegmentedButtonTokens.getDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultSegmentedButtonColorsCached$material3(segmentedButtonColors);
        return segmentedButtonColors;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2356getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final Shape itemShape(int i, int i2, CornerBasedShape cornerBasedShape, Composer composer, int i3, int i4) {
        if ((i4 & 4) != 0) {
            cornerBasedShape = getBaseShape(composer, (i3 >> 9) & 14);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-942072063, i3, -1, "androidx.compose.material3.SegmentedButtonDefaults.itemShape (SegmentedButton.kt:594)");
        }
        if (i2 == 1) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return cornerBasedShape;
        }
        Shape start$default = i == 0 ? ShapesKt.start$default(cornerBasedShape, null, 1, null) : i == i2 - 1 ? ShapesKt.end$default(cornerBasedShape, null, 1, null) : RectangleShapeKt.getRectangleShape();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return start$default;
    }
}
