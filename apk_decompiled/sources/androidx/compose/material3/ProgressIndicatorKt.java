package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.material3.tokens.CircularProgressIndicatorTokens;
import androidx.compose.material3.tokens.LinearProgressIndicatorTokens;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.er;
import defpackage.g7;
import defpackage.iy;
import defpackage.je0;
import defpackage.kf0;
import defpackage.ky;
import defpackage.my;
import defpackage.r70;
import defpackage.sg0;
import defpackage.ti;
import defpackage.uq;
import defpackage.w01;
import defpackage.wr;
import defpackage.yg0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ProgressIndicatorKt {
    public static final float CircularAdditionalRotationDegreesTarget = 360.0f;
    public static final int CircularAnimationAdditionalRotationDelay = 1500;
    public static final int CircularAnimationAdditionalRotationDuration = 300;
    public static final int CircularAnimationProgressDuration = 6000;
    public static final float CircularGlobalRotationDegreesTarget = 1080.0f;
    public static final float CircularIndeterminateMaxProgress = 0.87f;
    public static final float CircularIndeterminateMinProgress = 0.1f;
    private static final CubicBezierEasing CircularProgressEasing;
    public static final int FirstLineHeadDelay = 0;
    public static final int FirstLineHeadDuration = 1000;
    public static final int FirstLineTailDelay = 250;
    public static final int FirstLineTailDuration = 1000;
    public static final int LinearAnimationDuration = 1750;
    private static final CubicBezierEasing LinearIndeterminateProgressEasing;
    public static final int SecondLineHeadDelay = 650;
    public static final int SecondLineHeadDuration = 850;
    public static final int SecondLineTailDelay = 900;
    public static final int SecondLineTailDuration = 850;
    private static final float LinearIndicatorWidth = Dp.m7611constructorimpl(240.0f);
    private static final float LinearIndicatorHeight = LinearProgressIndicatorTokens.INSTANCE.m3391getHeightD9Ej5fM();
    private static final float StopIndicatorTrailingSpace = Dp.m7611constructorimpl(6.0f);
    private static final float CircularIndicatorDiameter = CircularProgressIndicatorTokens.INSTANCE.m3100getSizeD9Ej5fM();

    static {
        MotionTokens motionTokens = MotionTokens.INSTANCE;
        LinearIndeterminateProgressEasing = motionTokens.getEasingEmphasizedAccelerateCubicBezier();
        CircularProgressEasing = motionTokens.getEasingStandardCubicBezier();
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: CircularProgressIndicator-4lLiAd8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2262CircularProgressIndicator4lLiAd8(Modifier modifier, long j, float f, long j2, int i, float f2, Composer composer, int i2, int i3) {
        Modifier modifier2;
        int i4;
        long j3;
        float f3;
        long j4;
        int i5;
        int i6;
        int i7;
        float f4;
        Composer composer2;
        Modifier modifier3;
        long j5;
        float f5;
        float f6;
        int i8;
        long j6;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        long j7;
        final float m2257getCircularIndicatorTrackGapSizeD9Ej5fM;
        final int i9;
        final long j8;
        final long j9;
        final float f7;
        Composer startRestartGroup = composer.startRestartGroup(333154241);
        int i10 = i3 & 1;
        if (i10 != 0) {
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
            j3 = j;
            i4 |= ((i3 & 2) == 0 && startRestartGroup.changed(j3)) ? 32 : 16;
        } else {
            j3 = j;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            f3 = f;
            i4 |= startRestartGroup.changed(f3) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i2 & 3072) != 0) {
                j4 = j2;
                i4 |= ((i3 & 8) == 0 && startRestartGroup.changed(j4)) ? Fields.CameraDistance : Fields.RotationZ;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? Fields.Clip : 8192;
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                    f4 = f2;
                } else {
                    f4 = f2;
                    if ((i2 & 196608) == 0) {
                        i4 |= startRestartGroup.changed(f4) ? Fields.RenderEffect : 65536;
                    }
                }
                if (startRestartGroup.shouldExecute((i4 & 74899) != 74898, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        modifier4 = i10 != 0 ? Modifier.Companion : modifier2;
                        if ((i3 & 2) != 0) {
                            j3 = ProgressIndicatorDefaults.INSTANCE.getCircularColor(startRestartGroup, 6);
                            i4 &= -113;
                        }
                        if (i11 != 0) {
                            f3 = ProgressIndicatorDefaults.INSTANCE.m2258getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 8) != 0) {
                            j7 = ProgressIndicatorDefaults.INSTANCE.getCircularIndeterminateTrackColor(startRestartGroup, 6);
                            i4 &= -7169;
                        } else {
                            j7 = j4;
                        }
                        if (i5 != 0) {
                            i6 = ProgressIndicatorDefaults.INSTANCE.m2256getCircularIndeterminateStrokeCapKaPHkGw();
                        }
                        m2257getCircularIndicatorTrackGapSizeD9Ej5fM = i7 != 0 ? ProgressIndicatorDefaults.INSTANCE.m2257getCircularIndicatorTrackGapSizeD9Ej5fM() : f4;
                        i9 = i6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        modifier4 = modifier2;
                        m2257getCircularIndicatorTrackGapSizeD9Ej5fM = f4;
                        i9 = i6;
                        j7 = j4;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(333154241, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:630)");
                    }
                    final Stroke stroke = new Stroke(((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo367toPx0680j_4(f3), 0.0f, i9, 0, null, 26, null);
                    InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1);
                    InfiniteRepeatableSpec<Float> circularIndeterminateGlobalRotationAnimationSpec = getCircularIndeterminateGlobalRotationAnimationSpec();
                    int i12 = InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9);
                    final State<Float> animateFloat = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1080.0f, circularIndeterminateGlobalRotationAnimationSpec, null, startRestartGroup, i12, 8);
                    final State<Float> animateFloat2 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 360.0f, getCircularIndeterminateRotationAnimationSpec(), null, startRestartGroup, i12, 8);
                    final State<Float> animateFloat3 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.1f, 0.87f, getCircularIndeterminateProgressAnimationSpec(), null, startRestartGroup, i12, 8);
                    Modifier m807size3ABfNKs = SizeKt.m807size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier4), CircularIndicatorDiameter);
                    Modifier modifier5 = modifier4;
                    boolean changed = ((i4 & 57344) == 16384) | startRestartGroup.changed(animateFloat3) | ((458752 & i4) == 131072) | ((i4 & 896) == 256) | startRestartGroup.changed(animateFloat) | startRestartGroup.changed(animateFloat2) | ((((i4 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(j7)) || (i4 & 3072) == 2048) | startRestartGroup.changedInstance(stroke) | ((((i4 & 112) ^ 48) > 32 && startRestartGroup.changed(j3)) || (i4 & 48) == 32);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        j8 = j7;
                        j9 = j3;
                        f7 = f3;
                        rememberedValue = new ky() { // from class: bh0
                            @Override // defpackage.ky
                            public final Object invoke(Object obj) {
                                w01 CircularProgressIndicator_4lLiAd8$lambda$34$lambda$33;
                                CircularProgressIndicator_4lLiAd8$lambda$34$lambda$33 = ProgressIndicatorKt.CircularProgressIndicator_4lLiAd8$lambda$34$lambda$33(State.this, i9, m2257getCircularIndicatorTrackGapSizeD9Ej5fM, f7, animateFloat, animateFloat2, j8, stroke, j9, (DrawScope) obj);
                                return CircularProgressIndicator_4lLiAd8$lambda$34$lambda$33;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    } else {
                        j8 = j7;
                        j9 = j3;
                        f7 = f3;
                    }
                    CanvasKt.Canvas(m807size3ABfNKs, (ky) rememberedValue, startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    composer2 = startRestartGroup;
                    i8 = i9;
                    f5 = m2257getCircularIndicatorTrackGapSizeD9Ej5fM;
                    f6 = f7;
                    j6 = j8;
                    j5 = j9;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    j5 = j3;
                    f5 = f4;
                    f6 = f3;
                    i8 = i6;
                    j6 = j4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new yg0(modifier3, j5, f6, j6, i8, f5, i2, i3));
                    return;
                }
                return;
            }
            i6 = i;
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 74899) != 74898, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f3 = f;
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i;
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 74899) != 74898, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x005a  */
    @er
    /* renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2264CircularProgressIndicatorDUhRLBM(final iy iyVar, Modifier modifier, long j, float f, long j2, int i, Composer composer, final int i2, final int i3) {
        iy iyVar2;
        int i4;
        Modifier modifier2;
        long j3;
        int i5;
        float f2;
        long j4;
        int i6;
        int i7;
        Composer composer2;
        final Modifier modifier3;
        final long j5;
        final float f3;
        final long j6;
        final int i8;
        ScopeUpdateScope endRestartGroup;
        long j7;
        int i9;
        Modifier modifier4;
        long j8;
        float f4;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-761680467);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i2 & 6) == 0) {
                i4 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i12 = Fields.RotationX;
                        i4 |= i12;
                    }
                } else {
                    j3 = j;
                }
                i12 = Fields.SpotShadowColor;
                i4 |= i12;
            } else {
                j3 = j;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        j4 = j2;
                        if (startRestartGroup.changed(j4)) {
                            i11 = Fields.Clip;
                            i4 |= i11;
                        }
                    } else {
                        j4 = j2;
                    }
                    i11 = 8192;
                    i4 |= i11;
                } else {
                    j4 = j2;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? Fields.RenderEffect : 65536;
                    if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        j5 = j3;
                        f3 = f2;
                        j6 = j4;
                        i8 = i7;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i13 != 0 ? Modifier.Companion : modifier2;
                            if ((i3 & 4) != 0) {
                                j3 = ProgressIndicatorDefaults.INSTANCE.getCircularColor(startRestartGroup, 6);
                                i4 &= -897;
                            }
                            if (i5 != 0) {
                                f2 = ProgressIndicatorDefaults.INSTANCE.m2258getCircularStrokeWidthD9Ej5fM();
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                j4 = ProgressIndicatorDefaults.INSTANCE.getCircularDeterminateTrackColor(startRestartGroup, 6);
                            }
                            if (i6 != 0) {
                                i9 = ProgressIndicatorDefaults.INSTANCE.m2255getCircularDeterminateStrokeCapKaPHkGw();
                                f4 = f2;
                                j7 = j4;
                                modifier4 = modifier5;
                                j8 = j3;
                            } else {
                                j7 = j4;
                                i9 = i7;
                                modifier4 = modifier5;
                                j8 = j3;
                                f4 = f2;
                            }
                            i10 = -761680467;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            j7 = j4;
                            i9 = i7;
                            i10 = -761680467;
                            modifier4 = modifier2;
                            j8 = j3;
                            f4 = f2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(i10, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:480)");
                        }
                        composer2 = startRestartGroup;
                        m2265CircularProgressIndicatorIyT6zlY(iyVar2, modifier4, j8, f4, j7, i9, ProgressIndicatorDefaults.INSTANCE.m2257getCircularIndicatorTrackGapSizeD9Ej5fM(), composer2, (i4 & 14) | 1572864 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (i4 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        j5 = j8;
                        f3 = f4;
                        j6 = j7;
                        i8 = i9;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new my() { // from class: tg0
                            @Override // defpackage.my
                            public final Object invoke(Object obj, Object obj2) {
                                w01 CircularProgressIndicator_DUhRLBM$lambda$20;
                                int intValue = ((Integer) obj2).intValue();
                                CircularProgressIndicator_DUhRLBM$lambda$20 = ProgressIndicatorKt.CircularProgressIndicator_DUhRLBM$lambda$20(iy.this, modifier3, j5, f3, j6, i8, i2, i3, (Composer) obj, intValue);
                                return CircularProgressIndicator_DUhRLBM$lambda$20;
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i;
                if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f2 = f;
            if ((i2 & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        f2 = f;
        if ((i2 & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* renamed from: CircularProgressIndicator-IyT6zlY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2265CircularProgressIndicatorIyT6zlY(final iy iyVar, Modifier modifier, long j, float f, long j2, int i, float f2, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long j3;
        int i5;
        float f3;
        long j4;
        int i6;
        int i7;
        int i8;
        float f4;
        final long j5;
        final float f5;
        final float f6;
        final int i9;
        ScopeUpdateScope endRestartGroup;
        long j6;
        boolean z;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        boolean changed2;
        Object rememberedValue3;
        final long j7;
        final long j8;
        final float f7;
        Composer startRestartGroup = composer.startRestartGroup(-1798883595);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                j3 = j;
                i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(j3)) ? Fields.RotationX : Fields.SpotShadowColor;
            } else {
                j3 = j;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                f3 = f;
                i4 |= startRestartGroup.changed(f3) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i2 & 24576) == 0) {
                    j4 = j2;
                    i4 |= ((i3 & 16) == 0 && startRestartGroup.changed(j4)) ? Fields.Clip : 8192;
                } else {
                    j4 = j2;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                    i7 = i;
                } else {
                    i7 = i;
                    if ((i2 & 196608) == 0) {
                        i4 |= startRestartGroup.changed(i7) ? Fields.RenderEffect : 65536;
                    }
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i4 |= 1572864;
                    f4 = f2;
                } else {
                    f4 = f2;
                    if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(f4) ? 1048576 : Fields.BlendMode;
                    }
                }
                if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    int i11 = 6;
                    if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i10 != 0) {
                            modifier2 = Modifier.Companion;
                        }
                        if ((i3 & 4) != 0) {
                            j3 = ProgressIndicatorDefaults.INSTANCE.getCircularColor(startRestartGroup, 6);
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            f3 = ProgressIndicatorDefaults.INSTANCE.m2258getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 16) != 0) {
                            j6 = ProgressIndicatorDefaults.INSTANCE.getCircularDeterminateTrackColor(startRestartGroup, 6);
                            i4 &= -57345;
                        } else {
                            j6 = j4;
                        }
                        if (i6 != 0) {
                            i7 = ProgressIndicatorDefaults.INSTANCE.m2255getCircularDeterminateStrokeCapKaPHkGw();
                        }
                        if (i8 != 0) {
                            f6 = ProgressIndicatorDefaults.INSTANCE.m2257getCircularIndicatorTrackGapSizeD9Ej5fM();
                            i9 = i7;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1798883595, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:526)");
                            }
                            z = (i4 & 14) != 4;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new uq(i11, iyVar);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            final iy iyVar2 = (iy) rememberedValue;
                            final Stroke stroke = new Stroke(((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo367toPx0680j_4(f3), 0.0f, i9, 0, null, 26, null);
                            changed = startRestartGroup.changed(iyVar2);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                                rememberedValue2 = new g7(7, iyVar2);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            Modifier m807size3ABfNKs = SizeKt.m807size3ABfNKs(SemanticsModifierKt.semantics(modifier2, true, (ky) rememberedValue2), CircularIndicatorDiameter);
                            changed2 = ((458752 & i4) != 131072) | startRestartGroup.changed(iyVar2) | ((3670016 & i4) != 1048576) | ((i4 & 7168) != 2048) | ((((57344 & i4) ^ 24576) <= 16384 && startRestartGroup.changed(j6)) || (i4 & 24576) == 16384) | startRestartGroup.changedInstance(stroke) | ((((i4 & 896) ^ 384) <= 256 && startRestartGroup.changed(j3)) || (i4 & 384) == 256);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                                j7 = j6;
                                j8 = j3;
                                f7 = f3;
                                rememberedValue3 = new ky() { // from class: zg0
                                    @Override // defpackage.ky
                                    public final Object invoke(Object obj) {
                                        w01 CircularProgressIndicator_IyT6zlY$lambda$28$lambda$27;
                                        CircularProgressIndicator_IyT6zlY$lambda$28$lambda$27 = ProgressIndicatorKt.CircularProgressIndicator_IyT6zlY$lambda$28$lambda$27(iy.this, i9, f6, f7, j7, stroke, j8, (DrawScope) obj);
                                        return CircularProgressIndicator_IyT6zlY$lambda$28$lambda$27;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            } else {
                                j7 = j6;
                                j8 = j3;
                                f7 = f3;
                            }
                            CanvasKt.Canvas(m807size3ABfNKs, (ky) rememberedValue3, startRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f5 = f7;
                            j4 = j7;
                            j5 = j8;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        j6 = j4;
                    }
                    f6 = f4;
                    i9 = i7;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if ((i4 & 14) != 4) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = new uq(i11, iyVar);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    final iy iyVar22 = (iy) rememberedValue;
                    final Stroke stroke2 = new Stroke(((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo367toPx0680j_4(f3), 0.0f, i9, 0, null, 26, null);
                    changed = startRestartGroup.changed(iyVar22);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = new g7(7, iyVar22);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    Modifier m807size3ABfNKs2 = SizeKt.m807size3ABfNKs(SemanticsModifierKt.semantics(modifier2, true, (ky) rememberedValue2), CircularIndicatorDiameter);
                    changed2 = ((458752 & i4) != 131072) | startRestartGroup.changed(iyVar22) | ((3670016 & i4) != 1048576) | ((i4 & 7168) != 2048) | ((((57344 & i4) ^ 24576) <= 16384 && startRestartGroup.changed(j6)) || (i4 & 24576) == 16384) | startRestartGroup.changedInstance(stroke2) | ((((i4 & 896) ^ 384) <= 256 && startRestartGroup.changed(j3)) || (i4 & 384) == 256);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed2) {
                    }
                    j7 = j6;
                    j8 = j3;
                    f7 = f3;
                    rememberedValue3 = new ky() { // from class: zg0
                        @Override // defpackage.ky
                        public final Object invoke(Object obj) {
                            w01 CircularProgressIndicator_IyT6zlY$lambda$28$lambda$27;
                            CircularProgressIndicator_IyT6zlY$lambda$28$lambda$27 = ProgressIndicatorKt.CircularProgressIndicator_IyT6zlY$lambda$28$lambda$27(iy.this, i9, f6, f7, j7, stroke2, j8, (DrawScope) obj);
                            return CircularProgressIndicator_IyT6zlY$lambda$28$lambda$27;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    CanvasKt.Canvas(m807size3ABfNKs2, (ky) rememberedValue3, startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f5 = f7;
                    j4 = j7;
                    j5 = j8;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    j5 = j3;
                    f5 = f3;
                    f6 = f4;
                    i9 = i7;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier3 = modifier2;
                    final long j9 = j4;
                    final int i12 = i9;
                    final float f8 = f6;
                    endRestartGroup.updateScope(new my() { // from class: ah0
                        @Override // defpackage.my
                        public final Object invoke(Object obj, Object obj2) {
                            w01 CircularProgressIndicator_IyT6zlY$lambda$29;
                            int intValue = ((Integer) obj2).intValue();
                            CircularProgressIndicator_IyT6zlY$lambda$29 = ProgressIndicatorKt.CircularProgressIndicator_IyT6zlY$lambda$29(iy.this, modifier3, j5, f5, j9, i12, f8, i2, i3, (Composer) obj, intValue);
                            return CircularProgressIndicator_IyT6zlY$lambda$29;
                        }
                    });
                    return;
                }
                return;
            }
            f3 = f;
            if ((i2 & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        f3 = f;
        if ((i2 & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0078  */
    @er
    /* renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2266CircularProgressIndicatorLxG7B9w(Modifier modifier, long j, float f, long j2, int i, Composer composer, int i2, int i3) {
        Modifier modifier2;
        int i4;
        long j3;
        float f2;
        long j4;
        int i5;
        int i6;
        Composer composer2;
        Modifier modifier3;
        long j5;
        float f3;
        long j6;
        int i7;
        ScopeUpdateScope endRestartGroup;
        float f4;
        int i8;
        Modifier modifier4;
        long j7;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-115871647);
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
        int i12 = i3 & 4;
        if (i12 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            f2 = f;
            i4 |= startRestartGroup.changed(f2) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i9 = Fields.CameraDistance;
                        i4 |= i9;
                    }
                } else {
                    j4 = j2;
                }
                i9 = Fields.RotationZ;
                i4 |= i9;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? Fields.Clip : 8192;
                if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i11 != 0 ? Modifier.Companion : modifier2;
                        if ((i3 & 2) != 0) {
                            j3 = ProgressIndicatorDefaults.INSTANCE.getCircularColor(startRestartGroup, 6);
                            i4 &= -113;
                        }
                        if (i12 != 0) {
                            f2 = ProgressIndicatorDefaults.INSTANCE.m2258getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 8) != 0) {
                            j4 = ProgressIndicatorDefaults.INSTANCE.getCircularIndeterminateTrackColor(startRestartGroup, 6);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            i8 = ProgressIndicatorDefaults.INSTANCE.m2256getCircularIndeterminateStrokeCapKaPHkGw();
                            f4 = f2;
                            j7 = j4;
                            modifier4 = modifier5;
                            long j8 = j3;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-115871647, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:594)");
                            }
                            composer2 = startRestartGroup;
                            m2262CircularProgressIndicator4lLiAd8(modifier4, j8, f4, j7, i8, ProgressIndicatorDefaults.INSTANCE.m2257getCircularIndicatorTrackGapSizeD9Ej5fM(), composer2, (i4 & 14) | 196608 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            j5 = j8;
                            f3 = f4;
                            j6 = j7;
                            i7 = i8;
                        } else {
                            f4 = f2;
                            i8 = i6;
                            modifier4 = modifier5;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        f4 = f2;
                        i8 = i6;
                        modifier4 = modifier2;
                    }
                    j7 = j4;
                    long j82 = j3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    m2262CircularProgressIndicator4lLiAd8(modifier4, j82, f4, j7, i8, ProgressIndicatorDefaults.INSTANCE.m2257getCircularIndicatorTrackGapSizeD9Ej5fM(), composer2, (i4 & 14) | 196608 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                    j5 = j82;
                    f3 = f4;
                    j6 = j7;
                    i7 = i8;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    j5 = j3;
                    f3 = f2;
                    j6 = j4;
                    i7 = i6;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new sg0(modifier3, j5, f3, j6, i7, i2, i3));
                    return;
                }
                return;
            }
            i6 = i;
            if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f2 = f;
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i;
        if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005b  */
    @er
    /* renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2267CircularProgressIndicatorMBs18nI(final float f, Modifier modifier, long j, float f2, Composer composer, final int i, final int i2) {
        float f3;
        int i3;
        Modifier modifier2;
        long j2;
        int i4;
        float f4;
        final Modifier modifier3;
        final long j3;
        final float f5;
        ScopeUpdateScope endRestartGroup;
        float m2258getCircularStrokeWidthD9Ej5fM;
        long j4;
        Modifier modifier4;
        Composer startRestartGroup = composer.startRestartGroup(402841196);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            f3 = f;
        } else if ((i & 6) == 0) {
            f3 = f;
            i3 = (startRestartGroup.changed(f3) ? 4 : 2) | i;
        } else {
            f3 = f;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                j2 = j;
                i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j2)) ? Fields.RotationX : Fields.SpotShadowColor;
            } else {
                j2 = j;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? Fields.CameraDistance : Fields.RotationZ;
                if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i5 != 0 ? Modifier.Companion : modifier2;
                        if ((i2 & 4) != 0) {
                            j2 = ProgressIndicatorDefaults.INSTANCE.getCircularColor(startRestartGroup, 6);
                            i3 &= -897;
                        }
                        m2258getCircularStrokeWidthD9Ej5fM = i4 != 0 ? ProgressIndicatorDefaults.INSTANCE.m2258getCircularStrokeWidthD9Ej5fM() : f4;
                        j4 = j2;
                        modifier4 = modifier5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        modifier4 = modifier2;
                        m2258getCircularStrokeWidthD9Ej5fM = f4;
                        j4 = j2;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(402841196, i3, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:723)");
                    }
                    ProgressIndicatorDefaults progressIndicatorDefaults = ProgressIndicatorDefaults.INSTANCE;
                    float f6 = m2258getCircularStrokeWidthD9Ej5fM;
                    m2263CircularProgressIndicatorDUhRLBM(f3, modifier4, j4, f6, progressIndicatorDefaults.getCircularTrackColor(startRestartGroup, 6), progressIndicatorDefaults.m2255getCircularDeterminateStrokeCapKaPHkGw(), startRestartGroup, (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    j3 = j4;
                    f5 = f6;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    j3 = j2;
                    f5 = f4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new my() { // from class: ug0
                        @Override // defpackage.my
                        public final Object invoke(Object obj, Object obj2) {
                            w01 CircularProgressIndicator_MBs18nI$lambda$39;
                            int intValue = ((Integer) obj2).intValue();
                            CircularProgressIndicator_MBs18nI$lambda$39 = ProgressIndicatorKt.CircularProgressIndicator_MBs18nI$lambda$39(f, modifier3, j3, f5, i, i2, (Composer) obj, intValue);
                            return CircularProgressIndicator_MBs18nI$lambda$39;
                        }
                    });
                    return;
                }
                return;
            }
            f4 = f2;
            if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f4 = f2;
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0065  */
    @er
    /* renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2268CircularProgressIndicatoraMcp0Q(Modifier modifier, long j, float f, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        float f2;
        Modifier modifier3;
        long j3;
        float f3;
        ScopeUpdateScope endRestartGroup;
        float m2258getCircularStrokeWidthD9Ej5fM;
        long j4;
        Modifier modifier4;
        Composer startRestartGroup = composer.startRestartGroup(947193756);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            j2 = j;
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changed(j2)) ? 32 : 16;
        } else {
            j2 = j;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? Fields.RotationX : Fields.SpotShadowColor;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j3 = j2;
                f3 = f2;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i4 != 0 ? Modifier.Companion : modifier2;
                    if ((i2 & 2) != 0) {
                        j2 = ProgressIndicatorDefaults.INSTANCE.getCircularColor(startRestartGroup, 6);
                        i3 &= -113;
                    }
                    m2258getCircularStrokeWidthD9Ej5fM = i5 != 0 ? ProgressIndicatorDefaults.INSTANCE.m2258getCircularStrokeWidthD9Ej5fM() : f2;
                    j4 = j2;
                    modifier4 = modifier5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    m2258getCircularStrokeWidthD9Ej5fM = f2;
                    j4 = j2;
                    modifier4 = modifier2;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(947193756, i3, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:740)");
                }
                ProgressIndicatorDefaults progressIndicatorDefaults = ProgressIndicatorDefaults.INSTANCE;
                m2262CircularProgressIndicator4lLiAd8(modifier4, j4, m2258getCircularStrokeWidthD9Ej5fM, progressIndicatorDefaults.getCircularTrackColor(startRestartGroup, 6), progressIndicatorDefaults.m2256getCircularIndeterminateStrokeCapKaPHkGw(), 0.0f, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896), 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                j3 = j4;
                f3 = m2258getCircularStrokeWidthD9Ej5fM;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new wr(modifier3, j3, f3, i, i2));
                return;
            }
            return;
        }
        f2 = f;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CircularProgressIndicator_4lLiAd8$lambda$34$lambda$33(State state, int i, float f, float f2, State state2, State state3, long j, Stroke stroke, long j2, DrawScope drawScope) {
        float floatValue = ((Number) state.getValue()).floatValue() * 360.0f;
        if (!StrokeCap.m5131equalsimpl0(i, StrokeCap.Companion.m5135getButtKaPHkGw()) && Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L)) <= Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32))) {
            f = Dp.m7611constructorimpl(f + f2);
        }
        float mo363toDpu2uoSUM = (f / ((float) (drawScope.mo363toDpu2uoSUM(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32))) * 3.141592653589793d))) * 360.0f;
        float floatValue2 = ((Number) state3.getValue()).floatValue() + ((Number) state2.getValue()).floatValue();
        long mo5334getCenterF1C5BW0 = drawScope.mo5334getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5262rotateUv8p0NA(floatValue2, mo5334getCenterF1C5BW0);
            m2276drawCircularIndicator42QJj7c(drawScope, floatValue + Math.min(floatValue, mo363toDpu2uoSUM), (360.0f - floatValue) - (Math.min(floatValue, mo363toDpu2uoSUM) * 2.0f), j, stroke);
            m2278drawDeterminateCircularIndicator42QJj7c(drawScope, 0.0f, floatValue, j2, stroke);
            kf0.g(drawContext, mo5256getSizeNHjbRc);
            return w01.a;
        } catch (Throwable th) {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CircularProgressIndicator_4lLiAd8$lambda$35(Modifier modifier, long j, float f, long j2, int i, float f2, int i2, int i3, Composer composer, int i4) {
        m2262CircularProgressIndicator4lLiAd8(modifier, j, f, j2, i, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CircularProgressIndicator_DUhRLBM$lambda$20(iy iyVar, Modifier modifier, long j, float f, long j2, int i, int i2, int i3, Composer composer, int i4) {
        m2264CircularProgressIndicatorDUhRLBM(iyVar, modifier, j, f, j2, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CircularProgressIndicator_DUhRLBM$lambda$38(float f, Modifier modifier, long j, float f2, long j2, int i, int i2, int i3, Composer composer, int i4) {
        m2263CircularProgressIndicatorDUhRLBM(f, modifier, j, f2, j2, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_IyT6zlY$lambda$22$lambda$21(iy iyVar) {
        float floatValue = ((Number) iyVar.invoke()).floatValue();
        if (floatValue < 0.0f) {
            floatValue = 0.0f;
        }
        if (floatValue > 1.0f) {
            return 1.0f;
        }
        return floatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CircularProgressIndicator_IyT6zlY$lambda$26$lambda$25(iy iyVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Object invoke = iyVar.invoke();
        if (Float.isNaN(((Number) invoke).floatValue())) {
            invoke = null;
        }
        Float f = (Float) invoke;
        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(f != null ? f.floatValue() : 0.0f, new ti(0.0f, 1.0f), 0, 4, null));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CircularProgressIndicator_IyT6zlY$lambda$28$lambda$27(iy iyVar, int i, float f, float f2, long j, Stroke stroke, long j2, DrawScope drawScope) {
        float floatValue = ((Number) iyVar.invoke()).floatValue() * 360.0f;
        if (!StrokeCap.m5131equalsimpl0(i, StrokeCap.Companion.m5135getButtKaPHkGw()) && Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L)) <= Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32))) {
            f = Dp.m7611constructorimpl(f + f2);
        }
        float mo363toDpu2uoSUM = (f / ((float) (drawScope.mo363toDpu2uoSUM(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32))) * 3.141592653589793d))) * 360.0f;
        m2276drawCircularIndicator42QJj7c(drawScope, Math.min(floatValue, mo363toDpu2uoSUM) + 270.0f + floatValue, (360.0f - floatValue) - (Math.min(floatValue, mo363toDpu2uoSUM) * 2.0f), j, stroke);
        m2278drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, floatValue, j2, stroke);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CircularProgressIndicator_IyT6zlY$lambda$29(iy iyVar, Modifier modifier, long j, float f, long j2, int i, float f2, int i2, int i3, Composer composer, int i4) {
        m2265CircularProgressIndicatorIyT6zlY(iyVar, modifier, j, f, j2, i, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CircularProgressIndicator_LxG7B9w$lambda$30(Modifier modifier, long j, float f, long j2, int i, int i2, int i3, Composer composer, int i4) {
        m2266CircularProgressIndicatorLxG7B9w(modifier, j, f, j2, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CircularProgressIndicator_MBs18nI$lambda$39(float f, Modifier modifier, long j, float f2, int i, int i2, Composer composer, int i3) {
        m2267CircularProgressIndicatorMBs18nI(f, modifier, j, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CircularProgressIndicator_aM_cp0Q$lambda$40(Modifier modifier, long j, float f, int i, int i2, Composer composer, int i3) {
        m2268CircularProgressIndicatoraMcp0Q(modifier, j, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0080  */
    @er
    /* renamed from: LinearProgressIndicator-2cYBFYY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2269LinearProgressIndicator2cYBFYY(Modifier modifier, long j, long j2, int i, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long j3;
        long j4;
        int i5;
        final Modifier modifier3;
        final long j5;
        final long j6;
        final int i6;
        ScopeUpdateScope endRestartGroup;
        long j7;
        int i7;
        Modifier modifier4;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-476865359);
        int i9 = i3 & 1;
        if (i9 != 0) {
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
                    i8 = 32;
                    i4 |= i8;
                }
            } else {
                j3 = j;
            }
            i8 = 16;
            i4 |= i8;
        } else {
            j3 = j;
        }
        if ((i2 & 384) == 0) {
            j4 = j2;
            i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(j4)) ? Fields.RotationX : Fields.SpotShadowColor;
        } else {
            j4 = j2;
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 = i;
            i4 |= startRestartGroup.changed(i5) ? Fields.CameraDistance : Fields.RotationZ;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j5 = j3;
                j6 = j4;
                i6 = i5;
            } else {
                startRestartGroup.startDefaults();
                if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i9 != 0 ? Modifier.Companion : modifier2;
                    if ((i3 & 2) != 0) {
                        j3 = ProgressIndicatorDefaults.INSTANCE.getLinearColor(startRestartGroup, 6);
                        i4 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        j4 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(startRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i10 != 0) {
                        i7 = ProgressIndicatorDefaults.INSTANCE.m2260getLinearStrokeCapKaPHkGw();
                        j7 = j4;
                    } else {
                        j7 = j4;
                        i7 = i5;
                    }
                    modifier4 = modifier5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    j7 = j4;
                    i7 = i5;
                    modifier4 = modifier2;
                }
                long j8 = j3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-476865359, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:219)");
                }
                m2275LinearProgressIndicatorrIrjwxo(modifier4, j8, j7, i7, ProgressIndicatorDefaults.INSTANCE.m2259getLinearIndicatorTrackGapSizeD9Ej5fM(), startRestartGroup, (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                j5 = j8;
                j6 = j7;
                i6 = i7;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new my() { // from class: qg0
                    @Override // defpackage.my
                    public final Object invoke(Object obj, Object obj2) {
                        w01 LinearProgressIndicator_2cYBFYY$lambda$11;
                        int intValue = ((Integer) obj2).intValue();
                        LinearProgressIndicator_2cYBFYY$lambda$11 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$11(Modifier.this, j5, j6, i6, i2, i3, (Composer) obj, intValue);
                        return LinearProgressIndicator_2cYBFYY$lambda$11;
                    }
                });
                return;
            }
            return;
        }
        i5 = i;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* renamed from: LinearProgressIndicator-GJbTh5U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2270LinearProgressIndicatorGJbTh5U(final iy iyVar, Modifier modifier, long j, long j2, int i, float f, ky kyVar, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        final long j3;
        long j4;
        int i5;
        int i6;
        int i7;
        float f2;
        final float f3;
        Modifier modifier3;
        final int i8;
        final long j5;
        final ky kyVar2;
        ScopeUpdateScope endRestartGroup;
        ky kyVar3;
        final float f4;
        final int i9;
        final ky kyVar4;
        final long j6;
        final long j7;
        Composer startRestartGroup = composer.startRestartGroup(-339970038);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                j3 = j;
                i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(j3)) ? Fields.RotationX : Fields.SpotShadowColor;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                j4 = j2;
                i4 |= ((i3 & 8) == 0 && startRestartGroup.changed(j4)) ? Fields.CameraDistance : Fields.RotationZ;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? Fields.Clip : 8192;
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i2 & 196608) == 0) {
                        i4 |= startRestartGroup.changed(f2) ? Fields.RenderEffect : 65536;
                    }
                }
                if ((i2 & 1572864) == 0) {
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changedInstance(kyVar)) ? 1048576 : Fields.BlendMode;
                }
                boolean z = true;
                if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    int i11 = 6;
                    if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i10 != 0 ? Modifier.Companion : modifier2;
                        if ((i3 & 4) != 0) {
                            j3 = ProgressIndicatorDefaults.INSTANCE.getLinearColor(startRestartGroup, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            j4 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(startRestartGroup, 6);
                            i4 &= -7169;
                        }
                        final int m2260getLinearStrokeCapKaPHkGw = i5 != 0 ? ProgressIndicatorDefaults.INSTANCE.m2260getLinearStrokeCapKaPHkGw() : i6;
                        if (i7 != 0) {
                            f2 = ProgressIndicatorDefaults.INSTANCE.m2259getLinearIndicatorTrackGapSizeD9Ej5fM();
                        }
                        if ((i3 & 64) != 0) {
                            boolean z2 = ((((i4 & 896) ^ 384) > 256 && startRestartGroup.changed(j3)) || (i4 & 384) == 256) | ((i4 & 57344) == 16384);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new ky() { // from class: ng0
                                    @Override // defpackage.ky
                                    public final Object invoke(Object obj) {
                                        w01 LinearProgressIndicator_GJbTh5U$lambda$2$lambda$1;
                                        LinearProgressIndicator_GJbTh5U$lambda$2$lambda$1 = ProgressIndicatorKt.LinearProgressIndicator_GJbTh5U$lambda$2$lambda$1(j3, m2260getLinearStrokeCapKaPHkGw, (DrawScope) obj);
                                        return LinearProgressIndicator_GJbTh5U$lambda$2$lambda$1;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            kyVar3 = (ky) rememberedValue;
                            i4 &= -3670017;
                        } else {
                            kyVar3 = kyVar;
                        }
                        f4 = f2;
                        i9 = m2260getLinearStrokeCapKaPHkGw;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                        }
                        kyVar3 = kyVar;
                        f4 = f2;
                        modifier3 = modifier2;
                        i9 = i6;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-339970038, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:153)");
                    }
                    boolean z3 = (i4 & 14) == 4;
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z3 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new uq(5, iyVar);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    final iy iyVar2 = (iy) rememberedValue2;
                    Modifier then = modifier3.then(AccessibilityUtilKt.getIncreaseVerticalSemanticsBounds());
                    boolean changed = startRestartGroup.changed(iyVar2);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                        rememberedValue3 = new g7(i11, iyVar2);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    Modifier m809sizeVpY3zN4 = SizeKt.m809sizeVpY3zN4(SemanticsModifierKt.semantics(then, true, (ky) rememberedValue3), LinearIndicatorWidth, LinearIndicatorHeight);
                    boolean changed2 = ((i4 & 57344) == 16384) | ((458752 & i4) == 131072) | startRestartGroup.changed(iyVar2) | ((((i4 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(j4)) || (i4 & 3072) == 2048) | ((((i4 & 896) ^ 384) > 256 && startRestartGroup.changed(j3)) || (i4 & 384) == 256);
                    if ((((3670016 & i4) ^ 1572864) <= 1048576 || !startRestartGroup.changed(kyVar3)) && (i4 & 1572864) != 1048576) {
                        z = false;
                    }
                    boolean z4 = z | changed2;
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (z4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                        kyVar4 = kyVar3;
                        j6 = j3;
                        j7 = j4;
                        rememberedValue4 = new ky() { // from class: og0
                            @Override // defpackage.ky
                            public final Object invoke(Object obj) {
                                w01 LinearProgressIndicator_GJbTh5U$lambda$9$lambda$8;
                                LinearProgressIndicator_GJbTh5U$lambda$9$lambda$8 = ProgressIndicatorKt.LinearProgressIndicator_GJbTh5U$lambda$9$lambda$8(i9, f4, iyVar2, j7, j6, kyVar4, (DrawScope) obj);
                                return LinearProgressIndicator_GJbTh5U$lambda$9$lambda$8;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    } else {
                        kyVar4 = kyVar3;
                        j6 = j3;
                        j7 = j4;
                    }
                    CanvasKt.Canvas(m809sizeVpY3zN4, (ky) rememberedValue4, startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i8 = i9;
                    f3 = f4;
                    j4 = j7;
                    j5 = j6;
                    kyVar2 = kyVar4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    f3 = f2;
                    modifier3 = modifier2;
                    i8 = i6;
                    j5 = j3;
                    kyVar2 = kyVar;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    final long j8 = j4;
                    endRestartGroup.updateScope(new my() { // from class: pg0
                        @Override // defpackage.my
                        public final Object invoke(Object obj, Object obj2) {
                            w01 LinearProgressIndicator_GJbTh5U$lambda$10;
                            int intValue = ((Integer) obj2).intValue();
                            LinearProgressIndicator_GJbTh5U$lambda$10 = ProgressIndicatorKt.LinearProgressIndicator_GJbTh5U$lambda$10(iy.this, modifier4, j5, j8, i8, f3, kyVar2, i2, i3, (Composer) obj, intValue);
                            return LinearProgressIndicator_GJbTh5U$lambda$10;
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i;
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            boolean z5 = true;
            if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i;
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        boolean z52 = true;
        if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    @er
    /* renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ void m2271LinearProgressIndicatorRIQooxk(Modifier modifier, long j, long j2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        final Modifier modifier3;
        final long j5;
        final long j6;
        long j7;
        Modifier modifier4;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(585576195);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                j3 = j;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i4 = Fields.RotationX;
                    i3 |= i4;
                }
            } else {
                j4 = j2;
            }
            i4 = Fields.SpotShadowColor;
            i3 |= i4;
        } else {
            j4 = j2;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                Modifier modifier5 = i6 != 0 ? Modifier.Companion : modifier2;
                if ((i2 & 2) != 0) {
                    j3 = ProgressIndicatorDefaults.INSTANCE.getLinearColor(startRestartGroup, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    j4 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(startRestartGroup, 6);
                    i3 &= -897;
                }
                j7 = j4;
                modifier4 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                j7 = j4;
                modifier4 = modifier2;
            }
            long j8 = j3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(585576195, i3, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:391)");
            }
            m2275LinearProgressIndicatorrIrjwxo(modifier4, j8, j7, ProgressIndicatorDefaults.INSTANCE.m2260getLinearStrokeCapKaPHkGw(), 0.0f, startRestartGroup, (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            j5 = j8;
            j6 = j7;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            j5 = j3;
            j6 = j4;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: vg0
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 LinearProgressIndicator_RIQooxk$lambda$19;
                    int intValue = ((Integer) obj2).intValue();
                    LinearProgressIndicator_RIQooxk$lambda$19 = ProgressIndicatorKt.LinearProgressIndicator_RIQooxk$lambda$19(Modifier.this, j5, j6, i, i2, (Composer) obj, intValue);
                    return LinearProgressIndicator_RIQooxk$lambda$19;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0056  */
    @er
    /* renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2272LinearProgressIndicator_5eSRE(float f, Modifier modifier, long j, long j2, int i, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        long j3;
        long j4;
        int i5;
        int i6;
        Composer composer2;
        Modifier modifier3;
        long j5;
        long j6;
        int i7;
        ScopeUpdateScope endRestartGroup;
        int m2260getLinearStrokeCapKaPHkGw;
        boolean z;
        Object rememberedValue;
        Composer startRestartGroup = composer.startRestartGroup(905419617);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                j3 = j;
                i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(j3)) ? Fields.RotationX : Fields.SpotShadowColor;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                j4 = j2;
                i4 |= ((i3 & 8) == 0 && startRestartGroup.changed(j4)) ? Fields.CameraDistance : Fields.RotationZ;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? Fields.Clip : 8192;
                int i9 = 1;
                if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            modifier2 = Modifier.Companion;
                        }
                        if ((i3 & 4) != 0) {
                            j3 = ProgressIndicatorDefaults.INSTANCE.getLinearColor(startRestartGroup, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            j4 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(startRestartGroup, 6);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            m2260getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2260getLinearStrokeCapKaPHkGw();
                            long j7 = j4;
                            long j8 = j3;
                            Modifier modifier4 = modifier2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(905419617, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:359)");
                            }
                            z = (i4 & 14) == 4;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new r70(f, i9);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            composer2 = startRestartGroup;
                            m2270LinearProgressIndicatorGJbTh5U((iy) rememberedValue, modifier4, j8, j7, m2260getLinearStrokeCapKaPHkGw, 0.0f, null, composer2, i4 & 65520, 96);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            j5 = j8;
                            j6 = j7;
                            i7 = m2260getLinearStrokeCapKaPHkGw;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                    }
                    m2260getLinearStrokeCapKaPHkGw = i6;
                    long j72 = j4;
                    long j82 = j3;
                    Modifier modifier42 = modifier2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if ((i4 & 14) == 4) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = new r70(f, i9);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    composer2 = startRestartGroup;
                    m2270LinearProgressIndicatorGJbTh5U((iy) rememberedValue, modifier42, j82, j72, m2260getLinearStrokeCapKaPHkGw, 0.0f, null, composer2, i4 & 65520, 96);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                    j5 = j82;
                    j6 = j72;
                    i7 = m2260getLinearStrokeCapKaPHkGw;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    j5 = j3;
                    j6 = j4;
                    i7 = i6;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new sg0(f, modifier3, j5, j6, i7, i2, i3));
                    return;
                }
                return;
            }
            i6 = i;
            int i92 = 1;
            if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i;
        int i922 = 1;
        if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005a  */
    @er
    /* renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2274LinearProgressIndicatoreaDK9VM(final float f, Modifier modifier, long j, long j2, Composer composer, final int i, final int i2) {
        float f2;
        int i3;
        Modifier modifier2;
        long j3;
        long j4;
        final Modifier modifier3;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        long j7;
        long j8;
        Modifier modifier4;
        long j9;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-372717133);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(f2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i4 = Fields.RotationX;
                        i3 |= i4;
                    }
                } else {
                    j3 = j;
                }
                i4 = Fields.SpotShadowColor;
                i3 |= i4;
            } else {
                j3 = j;
            }
            if ((i & 3072) != 0) {
                j4 = j2;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j4)) ? Fields.CameraDistance : Fields.RotationZ;
            } else {
                j4 = j2;
            }
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j5 = j3;
                j6 = j4;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i5 != 0 ? Modifier.Companion : modifier2;
                    if ((i2 & 4) != 0) {
                        j7 = ProgressIndicatorDefaults.INSTANCE.getLinearColor(startRestartGroup, 6);
                        i3 &= -897;
                    } else {
                        j7 = j3;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        modifier4 = modifier5;
                        j9 = j7;
                        j8 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(startRestartGroup, 6);
                    } else {
                        j8 = j4;
                        modifier4 = modifier5;
                        j9 = j7;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    j8 = j4;
                    modifier4 = modifier2;
                    j9 = j3;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-372717133, i3, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:376)");
                }
                m2272LinearProgressIndicator_5eSRE(f2, modifier4, j9, j8, ProgressIndicatorDefaults.INSTANCE.m2260getLinearStrokeCapKaPHkGw(), startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                j5 = j9;
                j6 = j8;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new my() { // from class: wg0
                    @Override // defpackage.my
                    public final Object invoke(Object obj, Object obj2) {
                        w01 LinearProgressIndicator_eaDK9VM$lambda$18;
                        int intValue = ((Integer) obj2).intValue();
                        LinearProgressIndicator_eaDK9VM$lambda$18 = ProgressIndicatorKt.LinearProgressIndicator_eaDK9VM$lambda$18(f, modifier3, j5, j6, i, i2, (Composer) obj, intValue);
                        return LinearProgressIndicator_eaDK9VM$lambda$18;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b2  */
    /* renamed from: LinearProgressIndicator-rIrjwxo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2275LinearProgressIndicatorrIrjwxo(Modifier modifier, long j, long j2, int i, float f, Composer composer, int i2, int i3) {
        Modifier modifier2;
        int i4;
        long j3;
        long j4;
        int i5;
        int i6;
        float f2;
        Composer composer2;
        Modifier modifier3;
        long j5;
        long j6;
        int i7;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        final float m2259getLinearIndicatorTrackGapSizeD9Ej5fM;
        boolean changed;
        Object rememberedValue;
        final long j7;
        final long j8;
        Composer startRestartGroup = composer.startRestartGroup(567589233);
        int i8 = i3 & 1;
        if (i8 != 0) {
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
            j3 = j;
            i4 |= ((i3 & 2) == 0 && startRestartGroup.changed(j3)) ? 32 : 16;
        } else {
            j3 = j;
        }
        if ((i2 & 384) == 0) {
            j4 = j2;
            i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(j4)) ? Fields.RotationX : Fields.SpotShadowColor;
        } else {
            j4 = j2;
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 = i;
            i4 |= startRestartGroup.changed(i5) ? Fields.CameraDistance : Fields.RotationZ;
            i6 = i3 & 16;
            if (i6 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? Fields.Clip : 8192;
                if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        modifier4 = i8 != 0 ? Modifier.Companion : modifier2;
                        if ((i3 & 2) != 0) {
                            j3 = ProgressIndicatorDefaults.INSTANCE.getLinearColor(startRestartGroup, 6);
                            i4 &= -113;
                        }
                        if ((i3 & 4) != 0) {
                            j4 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(startRestartGroup, 6);
                            i4 &= -897;
                        }
                        if (i9 != 0) {
                            i5 = ProgressIndicatorDefaults.INSTANCE.m2260getLinearStrokeCapKaPHkGw();
                        }
                        if (i6 != 0) {
                            m2259getLinearIndicatorTrackGapSizeD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2259getLinearIndicatorTrackGapSizeD9Ej5fM();
                            final int i10 = i5;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(567589233, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:254)");
                            }
                            InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1);
                            InfiniteRepeatableSpec<Float> linearIndeterminateFirstLineHeadAnimationSpec = getLinearIndeterminateFirstLineHeadAnimationSpec();
                            int i11 = InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9);
                            final State<Float> animateFloat = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, linearIndeterminateFirstLineHeadAnimationSpec, null, startRestartGroup, i11, 8);
                            final State<Float> animateFloat2 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, getLinearIndeterminateFirstLineTailAnimationSpec(), null, startRestartGroup, i11, 8);
                            final State<Float> animateFloat3 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, getLinearIndeterminateSecondLineHeadAnimationSpec(), null, startRestartGroup, i11, 8);
                            final State<Float> animateFloat4 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, getLinearIndeterminateSecondLineTailAnimationSpec(), null, startRestartGroup, i11, 8);
                            composer2 = startRestartGroup;
                            Modifier m809sizeVpY3zN4 = SizeKt.m809sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(modifier4.then(AccessibilityUtilKt.getIncreaseVerticalSemanticsBounds())), LinearIndicatorWidth, LinearIndicatorHeight);
                            changed = ((57344 & i4) != 16384) | ((i4 & 7168) != 2048) | composer2.changed(animateFloat) | ((((i4 & 896) ^ 384) <= 256 && composer2.changed(j4)) || (i4 & 384) == 256) | composer2.changed(animateFloat2) | ((((i4 & 112) ^ 48) <= 32 && composer2.changed(j3)) || (i4 & 48) == 32) | composer2.changed(animateFloat3) | composer2.changed(animateFloat4);
                            rememberedValue = composer2.rememberedValue();
                            if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                                j7 = j3;
                                j8 = j4;
                                rememberedValue = new ky() { // from class: rg0
                                    @Override // defpackage.ky
                                    public final Object invoke(Object obj) {
                                        w01 LinearProgressIndicator_rIrjwxo$lambda$13$lambda$12;
                                        LinearProgressIndicator_rIrjwxo$lambda$13$lambda$12 = ProgressIndicatorKt.LinearProgressIndicator_rIrjwxo$lambda$13$lambda$12(i10, m2259getLinearIndicatorTrackGapSizeD9Ej5fM, animateFloat, j8, animateFloat2, j7, animateFloat3, animateFloat4, (DrawScope) obj);
                                        return LinearProgressIndicator_rIrjwxo$lambda$13$lambda$12;
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue);
                            } else {
                                j7 = j3;
                                j8 = j4;
                            }
                            CanvasKt.Canvas(m809sizeVpY3zN4, (ky) rememberedValue, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            i7 = i10;
                            f2 = m2259getLinearIndicatorTrackGapSizeD9Ej5fM;
                            j6 = j8;
                            j5 = j7;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        modifier4 = modifier2;
                    }
                    m2259getLinearIndicatorTrackGapSizeD9Ej5fM = f2;
                    final int i102 = i5;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    InfiniteTransition rememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1);
                    InfiniteRepeatableSpec<Float> linearIndeterminateFirstLineHeadAnimationSpec2 = getLinearIndeterminateFirstLineHeadAnimationSpec();
                    int i112 = InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9);
                    final State animateFloat5 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, 1.0f, linearIndeterminateFirstLineHeadAnimationSpec2, null, startRestartGroup, i112, 8);
                    final State animateFloat22 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, 1.0f, getLinearIndeterminateFirstLineTailAnimationSpec(), null, startRestartGroup, i112, 8);
                    final State animateFloat32 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, 1.0f, getLinearIndeterminateSecondLineHeadAnimationSpec(), null, startRestartGroup, i112, 8);
                    final State animateFloat42 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, 1.0f, getLinearIndeterminateSecondLineTailAnimationSpec(), null, startRestartGroup, i112, 8);
                    composer2 = startRestartGroup;
                    Modifier m809sizeVpY3zN42 = SizeKt.m809sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(modifier4.then(AccessibilityUtilKt.getIncreaseVerticalSemanticsBounds())), LinearIndicatorWidth, LinearIndicatorHeight);
                    if ((i4 & 7168) != 2048) {
                    }
                    changed = ((57344 & i4) != 16384) | ((i4 & 7168) != 2048) | composer2.changed(animateFloat5) | ((((i4 & 896) ^ 384) <= 256 && composer2.changed(j4)) || (i4 & 384) == 256) | composer2.changed(animateFloat22) | ((((i4 & 112) ^ 48) <= 32 && composer2.changed(j3)) || (i4 & 48) == 32) | composer2.changed(animateFloat32) | composer2.changed(animateFloat42);
                    rememberedValue = composer2.rememberedValue();
                    if (changed) {
                    }
                    j7 = j3;
                    j8 = j4;
                    rememberedValue = new ky() { // from class: rg0
                        @Override // defpackage.ky
                        public final Object invoke(Object obj) {
                            w01 LinearProgressIndicator_rIrjwxo$lambda$13$lambda$12;
                            LinearProgressIndicator_rIrjwxo$lambda$13$lambda$12 = ProgressIndicatorKt.LinearProgressIndicator_rIrjwxo$lambda$13$lambda$12(i102, m2259getLinearIndicatorTrackGapSizeD9Ej5fM, animateFloat5, j8, animateFloat22, j7, animateFloat32, animateFloat42, (DrawScope) obj);
                            return LinearProgressIndicator_rIrjwxo$lambda$13$lambda$12;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                    CanvasKt.Canvas(m809sizeVpY3zN42, (ky) rememberedValue, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                    i7 = i102;
                    f2 = m2259getLinearIndicatorTrackGapSizeD9Ej5fM;
                    j6 = j8;
                    j5 = j7;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    j5 = j3;
                    j6 = j4;
                    i7 = i5;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new sg0(modifier3, j5, j6, i7, f2, i2, i3));
                    return;
                }
                return;
            }
            f2 = f;
            if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        f2 = f;
        if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LinearProgressIndicator_2cYBFYY$lambda$11(Modifier modifier, long j, long j2, int i, int i2, int i3, Composer composer, int i4) {
        m2269LinearProgressIndicator2cYBFYY(modifier, j, j2, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LinearProgressIndicator_GJbTh5U$lambda$10(iy iyVar, Modifier modifier, long j, long j2, int i, float f, ky kyVar, int i2, int i3, Composer composer, int i4) {
        m2270LinearProgressIndicatorGJbTh5U(iyVar, modifier, j, j2, i, f, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LinearProgressIndicator_GJbTh5U$lambda$2$lambda$1(long j, int i, DrawScope drawScope) {
        ProgressIndicatorDefaults progressIndicatorDefaults = ProgressIndicatorDefaults.INSTANCE;
        progressIndicatorDefaults.m2254drawStopIndicatorEgI2THU(drawScope, progressIndicatorDefaults.m2261getLinearTrackStopIndicatorSizeD9Ej5fM(), j, i);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_GJbTh5U$lambda$4$lambda$3(iy iyVar) {
        float floatValue = ((Number) iyVar.invoke()).floatValue();
        if (floatValue < 0.0f) {
            floatValue = 0.0f;
        }
        if (floatValue > 1.0f) {
            return 1.0f;
        }
        return floatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LinearProgressIndicator_GJbTh5U$lambda$7$lambda$6(iy iyVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Object invoke = iyVar.invoke();
        if (Float.isNaN(((Number) invoke).floatValue())) {
            invoke = null;
        }
        Float f = (Float) invoke;
        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(f != null ? f.floatValue() : 0.0f, new ti(0.0f, 1.0f), 0, 4, null));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LinearProgressIndicator_GJbTh5U$lambda$9$lambda$8(int i, float f, iy iyVar, long j, long j2, ky kyVar, DrawScope drawScope) {
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L));
        if (!StrokeCap.m5131equalsimpl0(i, StrokeCap.Companion.m5135getButtKaPHkGw()) && Float.intBitsToFloat((int) (4294967295L & drawScope.mo5335getSizeNHjbRc())) <= Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32))) {
            f = Dp.m7611constructorimpl(drawScope.mo363toDpu2uoSUM(intBitsToFloat) + f);
        }
        float mo363toDpu2uoSUM = f / drawScope.mo363toDpu2uoSUM(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32)));
        float floatValue = ((Number) iyVar.invoke()).floatValue();
        float min = Math.min(floatValue, mo363toDpu2uoSUM) + floatValue;
        if (min <= 1.0f) {
            m2280drawLinearIndicatorqYKTg0g(drawScope, min, 1.0f, j, intBitsToFloat, i);
        }
        m2280drawLinearIndicatorqYKTg0g(drawScope, 0.0f, floatValue, j2, intBitsToFloat, i);
        kyVar.invoke(drawScope);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LinearProgressIndicator_RIQooxk$lambda$19(Modifier modifier, long j, long j2, int i, int i2, Composer composer, int i3) {
        m2271LinearProgressIndicatorRIQooxk(modifier, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LinearProgressIndicator__5eSR_E$lambda$0(iy iyVar, Modifier modifier, long j, long j2, int i, int i2, int i3, Composer composer, int i4) {
        m2273LinearProgressIndicator_5eSRE(iyVar, modifier, j, j2, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LinearProgressIndicator__5eSR_E$lambda$17(float f, Modifier modifier, long j, long j2, int i, int i2, int i3, Composer composer, int i4) {
        m2272LinearProgressIndicator_5eSRE(f, modifier, j, j2, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LinearProgressIndicator_eaDK9VM$lambda$18(float f, Modifier modifier, long j, long j2, int i, int i2, Composer composer, int i3) {
        m2274LinearProgressIndicatoreaDK9VM(f, modifier, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LinearProgressIndicator_rIrjwxo$lambda$13$lambda$12(int i, float f, State state, long j, State state2, long j2, State state3, State state4, DrawScope drawScope) {
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L));
        if (!StrokeCap.m5131equalsimpl0(i, StrokeCap.Companion.m5135getButtKaPHkGw()) && Float.intBitsToFloat((int) (4294967295L & drawScope.mo5335getSizeNHjbRc())) <= Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32))) {
            f = Dp.m7611constructorimpl(drawScope.mo363toDpu2uoSUM(intBitsToFloat) + f);
        }
        float mo363toDpu2uoSUM = f / drawScope.mo363toDpu2uoSUM(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32)));
        if (((Number) state.getValue()).floatValue() < 1.0f - mo363toDpu2uoSUM) {
            m2280drawLinearIndicatorqYKTg0g(drawScope, ((Number) state.getValue()).floatValue() > 0.0f ? ((Number) state.getValue()).floatValue() + mo363toDpu2uoSUM : 0.0f, 1.0f, j, intBitsToFloat, i);
        }
        if (((Number) state.getValue()).floatValue() - ((Number) state2.getValue()).floatValue() > 0.0f) {
            m2280drawLinearIndicatorqYKTg0g(drawScope, ((Number) state.getValue()).floatValue(), ((Number) state2.getValue()).floatValue(), j2, intBitsToFloat, i);
        }
        if (((Number) state2.getValue()).floatValue() > mo363toDpu2uoSUM) {
            m2280drawLinearIndicatorqYKTg0g(drawScope, ((Number) state3.getValue()).floatValue() > 0.0f ? ((Number) state3.getValue()).floatValue() + mo363toDpu2uoSUM : 0.0f, ((Number) state2.getValue()).floatValue() < 1.0f ? ((Number) state2.getValue()).floatValue() - mo363toDpu2uoSUM : 1.0f, j, intBitsToFloat, i);
        }
        if (((Number) state3.getValue()).floatValue() - ((Number) state4.getValue()).floatValue() > 0.0f) {
            m2280drawLinearIndicatorqYKTg0g(drawScope, ((Number) state3.getValue()).floatValue(), ((Number) state4.getValue()).floatValue(), j2, intBitsToFloat, i);
        }
        if (((Number) state4.getValue()).floatValue() > mo363toDpu2uoSUM) {
            m2280drawLinearIndicatorqYKTg0g(drawScope, 0.0f, ((Number) state4.getValue()).floatValue() < 1.0f ? ((Number) state4.getValue()).floatValue() - mo363toDpu2uoSUM : 1.0f, j, intBitsToFloat, i);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LinearProgressIndicator_rIrjwxo$lambda$14(Modifier modifier, long j, long j2, int i, float f, int i2, int i3, Composer composer, int i4) {
        m2275LinearProgressIndicatorrIrjwxo(modifier, j, j2, i, f, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _get_circularIndeterminateProgressAnimationSpec_$lambda$42(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(CircularAnimationProgressDuration);
        keyframesSpecConfig.using(keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(0.87f), 3000), CircularProgressEasing);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(0.1f), CircularAnimationProgressDuration);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _get_circularIndeterminateRotationAnimationSpec_$lambda$41(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(CircularAnimationProgressDuration);
        Float valueOf = Float.valueOf(90.0f);
        keyframesSpecConfig.using(keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) valueOf, 300), MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier());
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) valueOf, CircularAnimationAdditionalRotationDelay);
        Float valueOf2 = Float.valueOf(180.0f);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) valueOf2, 1800);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) valueOf2, 3000);
        Float valueOf3 = Float.valueOf(270.0f);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) valueOf3, 3300);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) valueOf3, 4500);
        Float valueOf4 = Float.valueOf(360.0f);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) valueOf4, 4800);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) valueOf4, CircularAnimationProgressDuration);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _get_linearIndeterminateFirstLineHeadAnimationSpec_$lambda$43(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(LinearAnimationDuration);
        keyframesSpecConfig.using(keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(0.0f), 0), LinearIndeterminateProgressEasing);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(1.0f), 1000);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _get_linearIndeterminateFirstLineTailAnimationSpec_$lambda$44(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(LinearAnimationDuration);
        keyframesSpecConfig.using(keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(0.0f), FirstLineTailDelay), LinearIndeterminateProgressEasing);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(1.0f), 1250);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _get_linearIndeterminateSecondLineHeadAnimationSpec_$lambda$45(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(LinearAnimationDuration);
        keyframesSpecConfig.using(keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(0.0f), SecondLineHeadDelay), LinearIndeterminateProgressEasing);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(1.0f), CircularAnimationAdditionalRotationDelay);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _get_linearIndeterminateSecondLineTailAnimationSpec_$lambda$46(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(LinearAnimationDuration);
        keyframesSpecConfig.using(keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(0.0f), SecondLineTailDelay), LinearIndeterminateProgressEasing);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(1.0f), LinearAnimationDuration);
        return w01.a;
    }

    /* renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m2276drawCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        float width = stroke.getWidth() / 2.0f;
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32)) - (2.0f * width);
        DrawScope.m5314drawArcyD3GUKo$default(drawScope, j, f, f2, false, Offset.m4508constructorimpl((Float.floatToRawIntBits(width) & 4294967295L) | (Float.floatToRawIntBits(width) << 32)), Size.m4576constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L)), 0.0f, stroke, null, 0, 832, null);
    }

    /* renamed from: drawCircularIndicatorTrack-bw27NRU, reason: not valid java name */
    private static final void m2277drawCircularIndicatorTrackbw27NRU(DrawScope drawScope, long j, Stroke stroke) {
        m2276drawCircularIndicator42QJj7c(drawScope, 0.0f, 360.0f, j, stroke);
    }

    /* renamed from: drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m2278drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        m2276drawCircularIndicator42QJj7c(drawScope, f, f2, j, stroke);
    }

    /* renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    private static final void m2279drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f, float f2, float f3, long j, Stroke stroke) {
        m2276drawCircularIndicator42QJj7c(drawScope, f + (StrokeCap.m5131equalsimpl0(stroke.m5404getCapKaPHkGw(), StrokeCap.Companion.m5135getButtKaPHkGw()) ? 0.0f : ((f2 / Dp.m7611constructorimpl(CircularIndicatorDiameter / 2.0f)) * 57.29578f) / 2.0f), Math.max(f3, 0.1f), j, stroke);
    }

    /* renamed from: drawLinearIndicator-qYKTg0g, reason: not valid java name */
    private static final void m2280drawLinearIndicatorqYKTg0g(DrawScope drawScope, float f, float f2, long j, float f3, int i) {
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L));
        float f4 = intBitsToFloat2 / 2.0f;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f5 = (z ? f : 1.0f - f2) * intBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * intBitsToFloat;
        if (StrokeCap.m5131equalsimpl0(i, StrokeCap.Companion.m5135getButtKaPHkGw()) || intBitsToFloat2 > intBitsToFloat) {
            DrawScope.m5321drawLineNGM6Ib0$default(drawScope, j, Offset.m4508constructorimpl((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L)), Offset.m4508constructorimpl((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L)), f3, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = intBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f5 > f8) {
            f5 = f8;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (f6 <= f8) {
            f8 = f6;
        }
        if (Math.abs(f2 - f) > 0.0f) {
            DrawScope.m5321drawLineNGM6Ib0$default(drawScope, j, Offset.m4508constructorimpl((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L)), Offset.m4508constructorimpl((Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L)), f3, i, null, 0.0f, null, 0, 480, null);
        }
    }

    public static final InfiniteRepeatableSpec<Float> getCircularIndeterminateGlobalRotationAnimationSpec() {
        return AnimationSpecKt.m138infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(CircularAnimationProgressDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
    }

    public static final InfiniteRepeatableSpec<Float> getCircularIndeterminateProgressAnimationSpec() {
        return AnimationSpecKt.m138infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new je0(5)), null, 0L, 6, null);
    }

    public static final InfiniteRepeatableSpec<Float> getCircularIndeterminateRotationAnimationSpec() {
        return AnimationSpecKt.m138infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new je0(6)), null, 0L, 6, null);
    }

    public static final float getCircularIndicatorDiameter() {
        return CircularIndicatorDiameter;
    }

    public static final CubicBezierEasing getCircularProgressEasing() {
        return CircularProgressEasing;
    }

    public static final InfiniteRepeatableSpec<Float> getLinearIndeterminateFirstLineHeadAnimationSpec() {
        return AnimationSpecKt.m138infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new je0(3)), null, 0L, 6, null);
    }

    public static final InfiniteRepeatableSpec<Float> getLinearIndeterminateFirstLineTailAnimationSpec() {
        return AnimationSpecKt.m138infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new je0(4)), null, 0L, 6, null);
    }

    public static final CubicBezierEasing getLinearIndeterminateProgressEasing() {
        return LinearIndeterminateProgressEasing;
    }

    public static final InfiniteRepeatableSpec<Float> getLinearIndeterminateSecondLineHeadAnimationSpec() {
        return AnimationSpecKt.m138infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new je0(7)), null, 0L, 6, null);
    }

    public static final InfiniteRepeatableSpec<Float> getLinearIndeterminateSecondLineTailAnimationSpec() {
        return AnimationSpecKt.m138infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new je0(8)), null, 0L, 6, null);
    }

    public static final float getLinearIndicatorHeight() {
        return LinearIndicatorHeight;
    }

    public static final float getLinearIndicatorWidth() {
        return LinearIndicatorWidth;
    }

    public static final float getStopIndicatorTrailingSpace() {
        return StopIndicatorTrailingSpace;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_DUhRLBM$lambda$37$lambda$36(float f) {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator__5eSR_E$lambda$16$lambda$15(float f) {
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x005a  */
    @er
    /* renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2273LinearProgressIndicator_5eSRE(final iy iyVar, Modifier modifier, long j, long j2, int i, Composer composer, final int i2, final int i3) {
        iy iyVar2;
        int i4;
        Modifier modifier2;
        long j3;
        long j4;
        int i5;
        int i6;
        Composer composer2;
        final Modifier modifier3;
        final long j5;
        final long j6;
        final int i7;
        ScopeUpdateScope endRestartGroup;
        long j7;
        long j8;
        int i8;
        Modifier modifier4;
        long j9;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1796992155);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i2 & 6) == 0) {
                i4 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i9 = Fields.RotationX;
                        i4 |= i9;
                    }
                } else {
                    j3 = j;
                }
                i9 = Fields.SpotShadowColor;
                i4 |= i9;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                j4 = j2;
                i4 |= ((i3 & 8) == 0 && startRestartGroup.changed(j4)) ? Fields.CameraDistance : Fields.RotationZ;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? Fields.Clip : 8192;
                if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        j8 = j4;
                        i8 = i6;
                        modifier4 = modifier2;
                        j9 = j3;
                    } else {
                        Modifier modifier5 = i10 != 0 ? Modifier.Companion : modifier2;
                        if ((i3 & 4) != 0) {
                            j7 = ProgressIndicatorDefaults.INSTANCE.getLinearColor(startRestartGroup, 6);
                            i4 &= -897;
                        } else {
                            j7 = j3;
                        }
                        if ((i3 & 8) != 0) {
                            j4 = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(startRestartGroup, 6);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            i8 = ProgressIndicatorDefaults.INSTANCE.m2260getLinearStrokeCapKaPHkGw();
                            j8 = j4;
                        } else {
                            j8 = j4;
                            i8 = i6;
                        }
                        modifier4 = modifier5;
                        j9 = j7;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1796992155, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:100)");
                    }
                    composer2 = startRestartGroup;
                    m2270LinearProgressIndicatorGJbTh5U(iyVar2, modifier4, j9, j8, i8, ProgressIndicatorDefaults.INSTANCE.m2259getLinearIndicatorTrackGapSizeD9Ej5fM(), null, composer2, (i4 & 14) | 196608 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344), 64);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    j5 = j9;
                    j6 = j8;
                    i7 = i8;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    j5 = j3;
                    j6 = j4;
                    i7 = i6;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new my() { // from class: xg0
                        @Override // defpackage.my
                        public final Object invoke(Object obj, Object obj2) {
                            w01 LinearProgressIndicator__5eSR_E$lambda$0;
                            int intValue = ((Integer) obj2).intValue();
                            LinearProgressIndicator__5eSR_E$lambda$0 = ProgressIndicatorKt.LinearProgressIndicator__5eSR_E$lambda$0(iy.this, modifier3, j5, j6, i7, i2, i3, (Composer) obj, intValue);
                            return LinearProgressIndicator__5eSR_E$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i;
            if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i;
        if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0061  */
    @er
    /* renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2263CircularProgressIndicatorDUhRLBM(float f, Modifier modifier, long j, float f2, long j2, int i, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        long j3;
        int i5;
        float f3;
        long j4;
        int i6;
        int i7;
        Composer composer2;
        int i8;
        Modifier modifier3;
        long j5;
        float f4;
        long j6;
        ScopeUpdateScope endRestartGroup;
        int m2255getCircularDeterminateStrokeCapKaPHkGw;
        boolean z;
        Object rememberedValue;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1472321743);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                j3 = j;
                i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(j3)) ? Fields.RotationX : Fields.SpotShadowColor;
            } else {
                j3 = j;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                f3 = f2;
                i4 |= startRestartGroup.changed(f3) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        j4 = j2;
                        if (startRestartGroup.changed(j4)) {
                            i9 = Fields.Clip;
                            i4 |= i9;
                        }
                    } else {
                        j4 = j2;
                    }
                    i9 = 8192;
                    i4 |= i9;
                } else {
                    j4 = j2;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                    i7 = i;
                } else {
                    i7 = i;
                    if ((i2 & 196608) == 0) {
                        i4 |= startRestartGroup.changed(i7) ? Fields.RenderEffect : 65536;
                    }
                }
                if (startRestartGroup.shouldExecute((i4 & 74899) != 74898, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i10 != 0) {
                            modifier2 = Modifier.Companion;
                        }
                        if ((i3 & 4) != 0) {
                            j3 = ProgressIndicatorDefaults.INSTANCE.getCircularColor(startRestartGroup, 6);
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            f3 = ProgressIndicatorDefaults.INSTANCE.m2258getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 16) != 0) {
                            j4 = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(startRestartGroup, 6);
                            i4 &= -57345;
                        }
                        if (i6 != 0) {
                            m2255getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2255getCircularDeterminateStrokeCapKaPHkGw();
                            long j7 = j4;
                            float f5 = f3;
                            long j8 = j3;
                            Modifier modifier4 = modifier2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1472321743, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:705)");
                            }
                            z = (i4 & 14) == 4;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new r70(f, 2);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            composer2 = startRestartGroup;
                            m2265CircularProgressIndicatorIyT6zlY((iy) rememberedValue, modifier4, j8, f5, j7, m2255getCircularDeterminateStrokeCapKaPHkGw, 0.0f, composer2, i4 & 524272, 64);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            j5 = j8;
                            f4 = f5;
                            j6 = j7;
                            i8 = m2255getCircularDeterminateStrokeCapKaPHkGw;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                    }
                    m2255getCircularDeterminateStrokeCapKaPHkGw = i7;
                    long j72 = j4;
                    float f52 = f3;
                    long j82 = j3;
                    Modifier modifier42 = modifier2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if ((i4 & 14) == 4) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = new r70(f, 2);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    composer2 = startRestartGroup;
                    m2265CircularProgressIndicatorIyT6zlY((iy) rememberedValue, modifier42, j82, f52, j72, m2255getCircularDeterminateStrokeCapKaPHkGw, 0.0f, composer2, i4 & 524272, 64);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                    j5 = j82;
                    f4 = f52;
                    j6 = j72;
                    i8 = m2255getCircularDeterminateStrokeCapKaPHkGw;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    i8 = i7;
                    modifier3 = modifier2;
                    j5 = j3;
                    f4 = f3;
                    j6 = j4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new yg0(f, modifier3, j5, f4, j6, i8, i2, i3));
                    return;
                }
                return;
            }
            f3 = f2;
            if ((i2 & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 74899) != 74898, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        f3 = f2;
        if ((i2 & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 74899) != 74898, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
