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
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FastfoodKt {
    private static ImageVector _fastfood;

    public static final ImageVector getFastfood(Icons.TwoTone twoTone) {
        ImageVector imageVector = _fastfood;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Fastfood", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(1.0f, 21.98f);
        b.curveToRelative(0.0f, 0.56f, 0.45f, 1.01f, 1.01f, 1.01f);
        b.horizontalLineTo(15.0f);
        b.curveToRelative(0.56f, 0.0f, 1.01f, -0.45f, 1.01f, -1.01f);
        b.verticalLineTo(21.0f);
        b.horizontalLineTo(1.0f);
        b.verticalLineToRelative(0.98f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(8.5f, 10.99f);
        b2.curveToRelative(-1.42f, 0.0f, -3.77f, 0.46f, -4.88f, 2.01f);
        b2.horizontalLineToRelative(9.77f);
        b2.curveToRelative(-1.12f, -1.55f, -3.47f, -2.01f, -4.89f, -2.01f);
        b2.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b3 = uf.b(8.5f, 8.99f);
        b3.curveTo(4.75f, 8.99f, 1.0f, 11.0f, 1.0f, 15.0f);
        b3.horizontalLineToRelative(15.0f);
        b3.curveToRelative(0.0f, -4.0f, -3.75f, -6.01f, -7.5f, -6.01f);
        b3.close();
        b3.moveTo(3.62f, 13.0f);
        b3.curveToRelative(1.11f, -1.55f, 3.47f, -2.01f, 4.88f, -2.01f);
        b3.reflectiveCurveToRelative(3.77f, 0.46f, 4.88f, 2.01f);
        kp0.r(b3, 3.62f, 1.0f, 17.0f, 15.0f);
        kf0.n(b3, 2.0f, 1.0f, 18.0f, 5.0f);
        uf.p(b3, 1.0f, -2.0f, 4.0f, -5.0f);
        b3.lineToRelative(0.23f, 2.0f);
        r6.t(b3, 9.56f, -1.4f, 14.0f, 18.0f);
        b3.verticalLineToRelative(2.0f);
        b3.horizontalLineToRelative(1.72f);
        b3.curveToRelative(0.84f, 0.0f, 1.53f, -0.65f, 1.63f, -1.47f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.h(b3, 23.0f, 5.0f, -5.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fastfood = build;
        build.getClass();
        return build;
    }
}
