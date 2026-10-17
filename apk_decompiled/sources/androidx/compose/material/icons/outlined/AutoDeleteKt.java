package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AutoDeleteKt {
    private static ImageVector _autoDelete;

    public static final ImageVector getAutoDelete(Icons.Outlined outlined) {
        ImageVector imageVector = _autoDelete;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AutoDelete", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(15.0f, 2.0f, -3.5f, 0.0f);
        e.lineToRelative(-1.0f, -1.0f);
        e.lineToRelative(-5.0f, 0.0f);
        e.lineToRelative(-1.0f, 1.0f);
        e.lineToRelative(-3.5f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 0.0f, 2.0f, 14.0f, 0.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.0f, 9.0f);
        b.curveToRelative(-0.7f, 0.0f, -1.37f, 0.1f, -2.0f, 0.29f);
        r6.v(b, 5.0f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(5.68f);
        b.curveToRelative(1.12f, 2.36f, 3.53f, 4.0f, 6.32f, 4.0f);
        b.curveToRelative(3.87f, 0.0f, 7.0f, -3.13f, 7.0f, -7.0f);
        b.curveTo(23.0f, 12.13f, 19.87f, 9.0f, 16.0f, 9.0f);
        b.close();
        b.moveTo(9.0f, 16.0f);
        b.curveToRelative(0.0f, 0.34f, 0.03f, 0.67f, 0.08f, 1.0f);
        kf0.o(b, 4.0f, 7.0f, 8.0f, 3.26f);
        b.curveTo(10.19f, 11.53f, 9.0f, 13.62f, 9.0f, 16.0f);
        b.close();
        b.moveTo(16.0f, 21.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        b.reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f);
        b.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 18.76f, 21.0f, 16.0f, 21.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(16.5f, 12.0f, -1.5f, 0.0f);
        e2.lineToRelative(0.0f, 5.0f);
        e2.lineToRelative(3.6f, 2.1f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e2, 0.8f, -1.2f, -2.9f, -1.7f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoDelete = build;
        build.getClass();
        return build;
    }
}
