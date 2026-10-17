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
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PlumbingKt {
    private static ImageVector _plumbing;

    public static final ImageVector getPlumbing(Icons.TwoTone twoTone) {
        ImageVector imageVector = _plumbing;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Plumbing", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.28f, 4.93f, -2.12f, -2.12f);
        e.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        e.lineTo(11.5f, 5.64f);
        e.lineToRelative(2.12f, 2.12f);
        e.lineToRelative(2.12f, -2.12f);
        e.lineToRelative(3.54f, 3.54f);
        e.curveTo(20.45f, 8.0f, 20.45f, 6.1f, 19.28f, 4.93f);
        e.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(5.49f, 13.77f);
        b.curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0.0f);
        b.lineToRelative(2.47f, -2.47f);
        b.lineTo(7.96f, 9.17f);
        b.lineToRelative(-2.47f, 2.47f);
        b.curveTo(4.9f, 12.23f, 4.9f, 13.18f, 5.49f, 13.77f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 5.49f, 13.77f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(15.04f, 7.76f, -0.71f, 0.71f);
        e2.lineToRelative(-0.71f, 0.71f);
        e2.lineToRelative(-3.18f, -3.18f);
        e2.curveTo(9.85f, 5.4f, 8.9f, 5.4f, 8.32f, 5.99f);
        e2.curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f);
        e2.lineToRelative(3.18f, 3.18f);
        e2.lineTo(10.79f, 12.0f);
        e2.lineToRelative(-6.36f, 6.36f);
        e2.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        e2.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        e2.lineTo(16.45f, 12.0f);
        e2.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        e2.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(e2, 15.04f, 7.76f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _plumbing = build;
        build.getClass();
        return build;
    }
}
