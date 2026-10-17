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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AccessTimeKt {
    private static ImageVector _accessTime;

    public static final ImageVector getAccessTime(Icons.TwoTone twoTone) {
        ImageVector imageVector = _accessTime;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AccessTime", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 4.0f);
        b.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        b.reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(-3.58f, -8.0f, -8.0f, -8.0f);
        k4.r(b, 16.25f, 16.15f, 11.0f, 13.0f);
        fc.w(b, 11.0f, 7.0f, 1.5f, 5.25f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, 4.5f, 2.67f, -0.75f, 1.23f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(11.99f, 2.0f);
        b2.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b2.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        b2.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        b2.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
        b2.close();
        b2.moveTo(12.0f, 20.0f);
        b2.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        b2.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        b2.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        b2.reflectiveCurveToRelative(-3.58f, 8.0f, -8.0f, 8.0f);
        k4.r(b2, 12.5f, 7.0f, 11.0f, 7.0f);
        b2.verticalLineToRelative(6.0f);
        b2.lineToRelative(5.25f, 3.15f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b2, 0.75f, -1.23f, -4.5f, -2.67f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _accessTime = build;
        build.getClass();
        return build;
    }
}
