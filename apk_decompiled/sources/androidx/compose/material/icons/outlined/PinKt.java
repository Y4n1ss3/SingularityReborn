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
import defpackage.c21;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PinKt {
    private static ImageVector _pin;

    public static final ImageVector getPin(Icons.Outlined outlined) {
        ImageVector imageVector = _pin;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Pin", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 4.0f, 4.0f);
        d.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        d.verticalLineToRelative(12.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(6.0f);
        d.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        c21.d(d, 20.0f, 18.0f, 4.0f, 6.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, 16.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(6.49f, 10.5f, 0.0f, 4.5f);
        e.lineToRelative(1.15f, 0.0f);
        e.lineToRelative(0.0f, -6.0f);
        e.lineToRelative(-0.87f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -1.76f, 1.27f, 0.58f, 0.89f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.47f, 10.05f);
        b.curveToRelative(0.5f, 0.0f, 0.81f, 0.32f, 0.81f, 0.72f);
        b.curveToRelative(0.0f, 0.37f, -0.14f, 0.64f, -0.54f, 1.06f);
        b.curveToRelative(-0.36f, 0.38f, -1.06f, 1.08f, -2.13f, 2.15f);
        uf.p(b, 15.0f, 3.89f, -0.99f, -2.37f);
        b.lineToRelative(-0.03f, -0.05f);
        b.curveToRelative(0.68f, -0.68f, 1.15f, -1.14f, 1.4f, -1.39f);
        b.curveToRelative(0.61f, -0.6f, 0.92f, -1.22f, 0.92f, -1.86f);
        b.curveToRelative(0.0f, -0.24f, -0.05f, -1.04f, -0.91f, -1.48f);
        b.curveTo(12.04f, 9.0f, 11.25f, 8.87f, 10.56f, 9.2f);
        b.curveToRelative(-0.82f, 0.39f, -0.99f, 1.13f, -1.0f, 1.15f);
        b.lineToRelative(1.01f, 0.42f);
        b.curveTo(10.67f, 10.44f, 10.95f, 10.05f, 11.47f, 10.05f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw4 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk84 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(16.99f, 13.94f);
        b2.curveToRelative(-0.83f, 0.0f, -0.99f, -0.76f, -1.02f, -0.86f);
        b2.lineToRelative(-1.03f, 0.41f);
        b2.curveToRelative(0.45f, 1.59f, 2.01f, 1.51f, 2.05f, 1.51f);
        b2.curveToRelative(1.2f, 0.0f, 1.68f, -0.72f, 1.76f, -0.85f);
        b2.curveToRelative(0.32f, -0.49f, 0.36f, -1.24f, -0.01f, -1.76f);
        b2.curveToRelative(-0.17f, -0.24f, -0.4f, -0.41f, -0.68f, -0.52f);
        b2.verticalLineTo(11.8f);
        b2.curveToRelative(0.2f, -0.1f, 0.37f, -0.26f, 0.52f, -0.48f);
        b2.curveToRelative(0.26f, -0.41f, 0.31f, -1.07f, -0.02f, -1.57f);
        b2.curveTo(18.48f, 9.64f, 18.03f, 9.0f, 16.94f, 9.0f);
        b2.curveToRelative(-1.26f, 0.0f, -1.74f, 0.9f, -1.85f, 1.24f);
        b2.lineToRelative(0.99f, 0.41f);
        b2.curveToRelative(0.11f, -0.32f, 0.35f, -0.64f, 0.85f, -0.64f);
        b2.curveToRelative(0.44f, 0.0f, 0.75f, 0.26f, 0.75f, 0.65f);
        b2.curveToRelative(0.0f, 0.58f, -0.55f, 0.72f, -0.88f, 0.72f);
        kf0.x(b2, -0.46f, 1.0f, 0.5f);
        b2.curveToRelative(0.56f, 0.0f, 1.04f, 0.24f, 1.04f, 0.79f);
        b2.curveTo(17.88f, 13.66f, 17.4f, 13.94f, 16.99f, 13.94f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw4, m5145getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pin = build;
        build.getClass();
        return build;
    }
}
