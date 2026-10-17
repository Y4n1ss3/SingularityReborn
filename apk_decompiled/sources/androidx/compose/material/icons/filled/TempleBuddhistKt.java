package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TempleBuddhistKt {
    private static ImageVector _templeBuddhist;

    public static final ImageVector getTempleBuddhist(Icons.Filled filled) {
        ImageVector imageVector = _templeBuddhist;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TempleBuddhist", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.0f, 9.02f);
        b.curveToRelative(0.0f, 1.09f, -0.89f, 1.98f, -1.98f, 1.98f);
        b.horizontalLineTo(4.98f);
        b.curveTo(3.89f, 11.0f, 3.0f, 10.11f, 3.0f, 9.02f);
        b.horizontalLineTo(1.0f);
        b.curveToRelative(0.0f, 1.86f, 1.28f, 3.4f, 3.0f, 3.84f);
        kf0.r(b, 22.0f, 6.0f, -3.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        kf0.z(b, 3.0f, 6.0f, -9.14f);
        b.curveToRelative(0.55f, -0.14f, 3.0f, -1.04f, 3.0f, -3.86f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 21.0f, 9.02f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = uf.c(6.0f, 8.86f, 10.0f, 12.0f, 8.86f);
        c.curveToRelative(0.55f, -0.14f, 3.0f, -1.04f, 3.0f, -3.86f);
        c.lineToRelative(-2.0f, 0.02f);
        c.curveTo(19.0f, 6.11f, 18.11f, 7.0f, 17.02f, 7.0f);
        c.horizontalLineTo(6.98f);
        c.curveTo(5.89f, 7.0f, 5.0f, 6.11f, 5.0f, 5.02f);
        c.horizontalLineTo(3.0f);
        c.curveTo(3.0f, 6.87f, 4.28f, 8.42f, 6.0f, 8.86f);
        c.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, c.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(k4.e(12.0f, 1.0f, -3.75f, 5.0f), 7.5f, 0.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _templeBuddhist = build;
        build.getClass();
        return build;
    }
}
