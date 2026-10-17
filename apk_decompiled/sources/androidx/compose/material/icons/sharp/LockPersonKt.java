package androidx.compose.material.icons.sharp;

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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LockPersonKt {
    private static ImageVector _lockPerson;

    public static final ImageVector getLockPerson(Icons.Sharp sharp) {
        ImageVector imageVector = _lockPerson;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LockPerson", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.43f, 11.18f);
        b.curveToRelative(1.26f, -0.29f, 2.47f, -0.21f, 3.57f, 0.12f);
        uf.z(b, 8.0f, -3.0f, 6.22f);
        b.curveToRelative(0.0f, -2.61f, -1.91f, -4.94f, -4.51f, -5.19f);
        b.curveTo(9.51f, 0.74f, 7.0f, 3.08f, 7.0f, 6.0f);
        af0.B(b, 2.0f, 4.0f, 14.0f, 8.26f);
        b.curveToRelative(-1.01f, -1.45f, -1.5f, -3.3f, -1.15f, -5.27f);
        b.curveTo(11.6f, 14.0f, 13.74f, 11.79f, 16.43f, 11.18f);
        b.close();
        b.moveTo(8.9f, 6.0f);
        b.curveToRelative(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        b.reflectiveCurveToRelative(3.1f, 1.39f, 3.1f, 3.1f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.q(b, 2.0f, 8.9f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(18.0f, 13.0f);
        b2.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b2.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b2.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        b2.reflectiveCurveTo(20.76f, 13.0f, 18.0f, 13.0f);
        b2.close();
        b2.moveTo(18.0f, 15.0f);
        b2.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        b2.reflectiveCurveTo(18.83f, 18.0f, 18.0f, 18.0f);
        b2.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        b2.reflectiveCurveTo(17.17f, 15.0f, 18.0f, 15.0f);
        b2.close();
        b2.moveTo(18.0f, 21.0f);
        b2.curveToRelative(-1.03f, 0.0f, -1.94f, -0.52f, -2.48f, -1.32f);
        b2.curveTo(16.25f, 19.26f, 17.09f, 19.0f, 18.0f, 19.0f);
        b2.reflectiveCurveToRelative(1.75f, 0.26f, 2.48f, 0.68f);
        b2.curveTo(19.94f, 20.48f, 19.03f, 21.0f, 18.0f, 21.0f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lockPerson = build;
        build.getClass();
        return build;
    }
}
