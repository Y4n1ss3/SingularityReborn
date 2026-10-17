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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PianoOffKt {
    private static ImageVector _pianoOff;

    public static final ImageVector getPianoOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _pianoOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PianoOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = gy.c(8.25f, 19.0f, 5.0f, 7.83f);
        c.lineToRelative(2.0f, 2.0f);
        c.verticalLineToRelative(3.67f);
        c.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        uo.r(c, 0.25f, 19.0f, 9.75f, 19.0f);
        c.verticalLineToRelative(-4.5f);
        c.horizontalLineTo(10.0f);
        c.curveToRelative(0.46f, 0.0f, 0.82f, -0.31f, 0.94f, -0.73f);
        kp0.k(c, 3.31f, 3.31f, 19.0f, 9.75f);
        kp0.t(c, 13.0f, 10.17f, 5.0f, -2.0f);
        kf0.t(c, 3.17f, 13.0f, 10.17f);
        kp0.t(c, 19.0f, 16.17f, 5.0f, -2.0f);
        c.verticalLineToRelative(8.5f);
        c.curveToRelative(0.0f, 0.19f, -0.07f, 0.36f, -0.16f, 0.51f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(c, 19.0f, 16.17f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.19f, 21.19f, 2.81f, 2.81f);
        i.lineTo(1.39f, 4.22f);
        i.lineTo(3.0f, 5.83f);
        i.verticalLineTo(19.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(13.17f);
        gy.B(i, 1.61f, 1.61f, 21.19f, 21.19f);
        uo.p(i, 8.25f, 19.0f, 5.0f, 7.83f);
        i.lineToRelative(2.0f, 2.0f);
        i.verticalLineToRelative(3.67f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        uo.r(i, 0.25f, 19.0f, 9.75f, 19.0f);
        i.verticalLineToRelative(-4.5f);
        i.horizontalLineTo(10.0f);
        i.curveToRelative(0.46f, 0.0f, 0.82f, -0.31f, 0.94f, -0.73f);
        kp0.k(i, 3.31f, 3.31f, 19.0f, 9.75f);
        i.moveTo(11.0f, 8.17f);
        i.lineTo(5.83f, 3.0f);
        i.horizontalLineTo(19.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        k4.z(i, 13.17f, -2.0f, -2.0f, 5.0f);
        i.horizontalLineToRelative(-2.0f);
        i.verticalLineToRelative(8.5f);
        i.curveToRelative(0.0f, 0.19f, -0.07f, 0.36f, -0.16f, 0.51f);
        fc.t(i, 13.0f, 10.17f, 5.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(i, 8.17f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pianoOff = build;
        build.getClass();
        return build;
    }
}
