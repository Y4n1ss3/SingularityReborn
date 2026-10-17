package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SpeakerKt {
    private static ImageVector _speaker;

    public static final ImageVector getSpeaker(Icons.TwoTone twoTone) {
        ImageVector imageVector = _speaker;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Speaker", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(7.0f, 4.0f, 16.0f, 10.0f);
        r6.C(m, 17.0f, 4.0f, 7.0f, 4.0f);
        m.moveTo(12.0f, 5.0f);
        m.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        m.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        m.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        m.reflectiveCurveToRelative(0.89f, -2.0f, 2.0f, -2.0f);
        m.close();
        m.moveTo(12.0f, 19.0f);
        m.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        m.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        m.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(m, -1.79f, 4.0f, -4.0f, 4.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.0f, 2.0f, 7.0f, 2.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(16.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 1.99f, 2.0f, 1.99f);
        i.lineTo(17.0f, 22.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(19.0f, 4.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(i, 7.0f, 20.0f, 7.0f, 4.0f);
        j50.o(i, 10.0f, 16.0f, 7.0f, 20.0f);
        i.moveTo(12.0f, 9.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        i.curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.reflectiveCurveToRelative(0.89f, 2.0f, 2.0f, 2.0f);
        i.close();
        i.moveTo(12.0f, 11.0f);
        i.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        i.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        i.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        i.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        i.close();
        i.moveTo(12.0f, 17.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        i.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        i.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -0.9f, 2.0f, -2.0f, 2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _speaker = build;
        build.getClass();
        return build;
    }
}
