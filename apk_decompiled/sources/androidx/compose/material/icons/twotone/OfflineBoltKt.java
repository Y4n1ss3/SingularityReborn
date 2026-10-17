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
public final class OfflineBoltKt {
    private static ImageVector _offlineBolt;

    public static final ImageVector getOfflineBolt(Icons.TwoTone twoTone) {
        ImageVector imageVector = _offlineBolt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.OfflineBolt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 4.02f);
        b.curveTo(7.6f, 4.02f, 4.02f, 7.6f, 4.02f, 12.0f);
        b.reflectiveCurveTo(7.6f, 19.98f, 12.0f, 19.98f);
        b.reflectiveCurveToRelative(7.98f, -3.58f, 7.98f, -7.98f);
        b.reflectiveCurveTo(16.4f, 4.02f, 12.0f, 4.02f);
        af0.A(b, 11.39f, 19.0f, -5.5f, 8.25f);
        r6.A(b, 4.5f, -8.5f, 5.5f, 3.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 11.39f, 19.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 2.02f);
        b2.curveToRelative(-5.51f, 0.0f, -9.98f, 4.47f, -9.98f, 9.98f);
        b2.reflectiveCurveToRelative(4.47f, 9.98f, 9.98f, 9.98f);
        b2.reflectiveCurveToRelative(9.98f, -4.47f, 9.98f, -9.98f);
        b2.reflectiveCurveTo(17.51f, 2.02f, 12.0f, 2.02f);
        b2.close();
        b2.moveTo(12.0f, 19.98f);
        b2.curveToRelative(-4.4f, 0.0f, -7.98f, -3.58f, -7.98f, -7.98f);
        b2.reflectiveCurveTo(7.6f, 4.02f, 12.0f, 4.02f);
        b2.reflectiveCurveTo(19.98f, 7.6f, 19.98f, 12.0f);
        b2.reflectiveCurveTo(16.4f, 19.98f, 12.0f, 19.98f);
        k4.x(b2, 12.75f, 5.0f, -4.5f, 8.5f);
        b2.horizontalLineToRelative(3.14f);
        b2.lineTo(11.39f, 19.0f);
        b2.lineToRelative(4.36f, -8.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.d(b2, -3.0f, 12.75f, 5.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _offlineBolt = build;
        build.getClass();
        return build;
    }
}
