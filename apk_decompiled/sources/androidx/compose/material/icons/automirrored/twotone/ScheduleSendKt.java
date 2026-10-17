package androidx.compose.material.icons.automirrored.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScheduleSendKt {
    private static ImageVector _scheduleSend;

    public static final ImageVector getScheduleSend(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector imageVector = _scheduleSend;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.ScheduleSend", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(5.0f, 10.5f, 6.0f, 1.5f);
        e.lineToRelative(-6.0f, 1.5f);
        e.verticalLineToRelative(3.49f);
        e.lineToRelative(5.39f, -2.27f);
        e.curveToRelative(0.6f, -1.73f, 1.86f, -3.16f, 3.48f, -3.97f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.l(e, 5.0f, 7.01f, 10.5f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder j = kf0.j(11.0f, 12.0f, -6.0f, -1.5f, 7.01f);
        j.lineToRelative(8.87f, 3.74f);
        j.curveToRelative(0.94f, -0.47f, 2.0f, -0.75f, 3.13f, -0.75f);
        j.curveToRelative(0.1f, 0.0f, 0.19f, 0.01f, 0.28f, 0.01f);
        j.lineTo(3.0f, 4.0f);
        j.verticalLineToRelative(16.0f);
        j.lineToRelative(7.0f, -2.95f);
        j.curveToRelative(0.0f, -0.02f, 0.0f, -0.03f, 0.0f, -0.05f);
        j.curveToRelative(0.0f, -0.8f, 0.14f, -1.56f, 0.39f, -2.28f);
        j.lineTo(5.0f, 16.99f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.k(j, 13.5f, 11.0f, 12.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.0f, 12.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        b.reflectiveCurveTo(19.76f, 12.0f, 17.0f, 12.0f);
        k4.x(b, 18.65f, 19.35f, -2.15f, -2.15f);
        kf0.r(b, 14.0f, 1.0f, 2.79f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 1.85f, 1.85f, 18.65f, 19.35f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _scheduleSend = build;
        build.getClass();
        return build;
    }
}
