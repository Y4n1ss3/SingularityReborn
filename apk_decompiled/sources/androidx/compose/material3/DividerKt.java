package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.er;
import defpackage.ky;
import defpackage.w01;
import defpackage.wr;
import defpackage.xr;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DividerKt {
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    @er
    /* renamed from: Divider-9IZ8Weo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1933Divider9IZ8Weo(Modifier modifier, float f, long j, Composer composer, int i, int i2) {
        int i3;
        long j2;
        Modifier modifier2;
        float f2;
        long j3;
        float f3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(1562471785);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j2 = j;
                if (startRestartGroup.changed(j2)) {
                    i4 = Fields.RotationX;
                    i3 |= i4;
                }
            } else {
                j2 = j;
            }
            i4 = Fields.SpotShadowColor;
            i3 |= i4;
        } else {
            j2 = j;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                modifier2 = i5 != 0 ? Modifier.Companion : modifier;
                f2 = i6 != 0 ? DividerDefaults.INSTANCE.m1932getThicknessD9Ej5fM() : f;
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    j3 = DividerDefaults.INSTANCE.getColor(startRestartGroup, 6);
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1562471785, i3, -1, "androidx.compose.material3.Divider (Divider.kt:99)");
                    }
                    if (Dp.m7616equalsimpl0(f2, Dp.Companion.m7629getHairlineD9Ej5fM())) {
                        startRestartGroup.startReplaceGroup(-1258183496);
                        startRestartGroup.endReplaceGroup();
                        f3 = f2;
                    } else {
                        startRestartGroup.startReplaceGroup(-1258250053);
                        f3 = Dp.m7611constructorimpl(1.0f / ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
                        startRestartGroup.endReplaceGroup();
                    }
                    BoxKt.Box(BackgroundKt.m227backgroundbw27NRU$default(SizeKt.m793height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), f3), j3, null, 2, null), startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                modifier2 = modifier;
                f2 = f;
            }
            j3 = j2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            if (Dp.m7616equalsimpl0(f2, Dp.Companion.m7629getHairlineD9Ej5fM())) {
            }
            BoxKt.Box(BackgroundKt.m227backgroundbw27NRU$default(SizeKt.m793height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), f3), j3, null, 2, null), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            f2 = f;
            j3 = j2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new wr(modifier2, f2, j3, i, i2, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Divider_9IZ8Weo$lambda$6(Modifier modifier, float f, long j, int i, int i2, Composer composer, int i3) {
        m1933Divider9IZ8Weo(modifier, f, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005d  */
    /* renamed from: HorizontalDivider-9IZ8Weo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1934HorizontalDivider9IZ8Weo(Modifier modifier, float f, long j, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        long j2;
        Modifier modifier3;
        float f3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(75144485);
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
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 32 : 16;
            if ((i & 384) != 0) {
                j2 = j;
                i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j2)) ? 256 : Fields.SpotShadowColor;
            } else {
                j2 = j;
            }
            int i6 = 1;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                f3 = f2;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
                    f3 = i5 != 0 ? DividerDefaults.INSTANCE.m1932getThicknessD9Ej5fM() : f2;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        j2 = DividerDefaults.INSTANCE.getColor(startRestartGroup, 6);
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                    f3 = f2;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(75144485, i3, -1, "androidx.compose.material3.HorizontalDivider (Divider.kt:53)");
                }
                Modifier m793height3ABfNKs = SizeKt.m793height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), f3);
                boolean z = ((((i3 & 896) ^ 384) > 256 && startRestartGroup.changed(j2)) || (i3 & 384) == 256) | ((i3 & 112) == 32);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new xr(f3, j2, i6);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                CanvasKt.Canvas(m793height3ABfNKs, (ky) rememberedValue, startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new wr(modifier3, f3, j2, i, i2, 2));
                return;
            }
            return;
        }
        f2 = f;
        if ((i & 384) != 0) {
        }
        int i62 = 1;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 HorizontalDivider_9IZ8Weo$lambda$1$lambda$0(float f, long j, DrawScope drawScope) {
        float mo367toPx0680j_4 = drawScope.mo367toPx0680j_4(f);
        float mo367toPx0680j_42 = drawScope.mo367toPx0680j_4(f) / 2.0f;
        long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(mo367toPx0680j_42) & 4294967295L));
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32));
        float mo367toPx0680j_43 = drawScope.mo367toPx0680j_4(f) / 2.0f;
        DrawScope.m5321drawLineNGM6Ib0$default(drawScope, j, m4508constructorimpl, Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(mo367toPx0680j_43) & 4294967295L)), mo367toPx0680j_4, 0, null, 0.0f, null, 0, 496, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 HorizontalDivider_9IZ8Weo$lambda$2(Modifier modifier, float f, long j, int i, int i2, Composer composer, int i3) {
        m1934HorizontalDivider9IZ8Weo(modifier, f, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005d  */
    /* renamed from: VerticalDivider-9IZ8Weo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1935VerticalDivider9IZ8Weo(Modifier modifier, float f, long j, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        long j2;
        Modifier modifier3;
        float f3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1534852205);
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
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 32 : 16;
            if ((i & 384) != 0) {
                j2 = j;
                i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j2)) ? 256 : Fields.SpotShadowColor;
            } else {
                j2 = j;
            }
            int i6 = 0;
            boolean z = true;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                f3 = f2;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
                    f3 = i5 != 0 ? DividerDefaults.INSTANCE.m1932getThicknessD9Ej5fM() : f2;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        j2 = DividerDefaults.INSTANCE.getColor(startRestartGroup, 6);
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                    f3 = f2;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1534852205, i3, -1, "androidx.compose.material3.VerticalDivider (Divider.kt:81)");
                }
                Modifier m812width3ABfNKs = SizeKt.m812width3ABfNKs(SizeKt.fillMaxHeight$default(modifier3, 0.0f, 1, null), f3);
                boolean z2 = (i3 & 112) == 32;
                if ((((i3 & 896) ^ 384) <= 256 || !startRestartGroup.changed(j2)) && (i3 & 384) != 256) {
                    z = false;
                }
                boolean z3 = z2 | z;
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new xr(f3, j2, i6);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                CanvasKt.Canvas(m812width3ABfNKs, (ky) rememberedValue, startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new wr(modifier3, f3, j2, i, i2, 1));
                return;
            }
            return;
        }
        f2 = f;
        if ((i & 384) != 0) {
        }
        int i62 = 0;
        boolean z4 = true;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 VerticalDivider_9IZ8Weo$lambda$4$lambda$3(float f, long j, DrawScope drawScope) {
        float mo367toPx0680j_4 = drawScope.mo367toPx0680j_4(f);
        long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(drawScope.mo367toPx0680j_4(f) / 2.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        float mo367toPx0680j_42 = drawScope.mo367toPx0680j_4(f) / 2.0f;
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L));
        DrawScope.m5321drawLineNGM6Ib0$default(drawScope, j, m4508constructorimpl, Offset.m4508constructorimpl((Float.floatToRawIntBits(mo367toPx0680j_42) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L)), mo367toPx0680j_4, 0, null, 0.0f, null, 0, 496, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 VerticalDivider_9IZ8Weo$lambda$5(Modifier modifier, float f, long j, int i, int i2, Composer composer, int i3) {
        m1935VerticalDivider9IZ8Weo(modifier, f, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }
}
