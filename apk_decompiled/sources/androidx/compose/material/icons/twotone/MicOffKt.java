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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MicOffKt {
    private static ImageVector _micOff;

    public static final ImageVector getMicOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _micOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MicOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 3.7f);
        b.curveToRelative(-0.66f, 0.0f, -1.2f, 0.54f, -1.2f, 1.2f);
        b.verticalLineToRelative(1.51f);
        b.lineToRelative(2.39f, 2.39f);
        b.lineToRelative(0.01f, -3.9f);
        b.curveToRelative(0.0f, -0.66f, -0.54f, -1.2f, -1.2f, -1.2f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(19.0f, 11.0f, -1.7f);
        a.curveToRelative(0.0f, 0.58f, -0.1f, 1.13f, -0.27f, 1.64f);
        a.lineToRelative(1.27f, 1.27f);
        a.curveToRelative(0.44f, -0.88f, 0.7f, -1.87f, 0.7f, -2.91f);
        k4.r(a, 4.41f, 2.86f, 3.0f, 4.27f);
        a.lineToRelative(6.0f, 6.0f);
        a.verticalLineTo(11.0f);
        a.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        a.curveToRelative(0.23f, 0.0f, 0.44f, -0.03f, 0.65f, -0.08f);
        a.lineToRelative(1.66f, 1.66f);
        a.curveToRelative(-0.71f, 0.33f, -1.5f, 0.52f, -2.31f, 0.52f);
        a.curveToRelative(-2.76f, 0.0f, -5.3f, -2.1f, -5.3f, -5.1f);
        a.horizontalLineTo(5.0f);
        a.curveToRelative(0.0f, 3.41f, 2.72f, 6.23f, 6.0f, 6.72f);
        kf0.r(a, 21.0f, 2.0f, -3.28f);
        a.curveToRelative(0.91f, -0.13f, 1.77f, -0.45f, 2.55f, -0.9f);
        a.lineToRelative(4.2f, 4.2f);
        gy.B(a, 1.41f, -1.41f, 4.41f, 2.86f);
        a.moveTo(10.8f, 4.9f);
        a.curveToRelative(0.0f, -0.66f, 0.54f, -1.2f, 1.2f, -1.2f);
        a.reflectiveCurveToRelative(1.2f, 0.54f, 1.2f, 1.2f);
        a.lineToRelative(-0.01f, 3.91f);
        a.lineTo(15.0f, 10.6f);
        a.verticalLineTo(5.0f);
        a.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        a.curveToRelative(-1.54f, 0.0f, -2.79f, 1.16f, -2.96f, 2.65f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.j(a, 1.76f, 1.76f, 4.9f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _micOff = build;
        build.getClass();
        return build;
    }
}
