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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnergySavingsLeafKt {
    private static ImageVector _energySavingsLeaf;

    public static final ImageVector getEnergySavingsLeaf(Icons.Outlined outlined) {
        ImageVector imageVector = _energySavingsLeaf;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.EnergySavingsLeaf", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 3.0f);
        b.curveTo(12.0f, 3.0f, 12.0f, 3.0f, 12.0f, 3.0f);
        b.curveToRelative(-4.8f, 0.0f, -9.0f, 3.86f, -9.0f, 9.0f);
        b.curveToRelative(0.0f, 2.12f, 0.74f, 4.07f, 1.97f, 5.61f);
        b.lineTo(3.0f, 19.59f);
        b.lineTo(4.41f, 21.0f);
        b.lineToRelative(1.97f, -1.97f);
        b.curveTo(7.93f, 20.26f, 9.88f, 21.0f, 12.0f, 21.0f);
        b.curveToRelative(2.3f, 0.0f, 4.61f, -0.88f, 6.36f, -2.64f);
        b.curveTo(20.12f, 16.61f, 21.0f, 14.3f, 21.0f, 12.0f);
        gy.B(b, 0.0f, -9.0f, 12.0f, 3.0f);
        b.moveTo(19.0f, 12.0f);
        b.curveToRelative(0.0f, 1.87f, -0.73f, 3.63f, -2.05f, 4.95f);
        b.curveTo(15.63f, 18.27f, 13.87f, 19.0f, 12.0f, 19.0f);
        b.curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
        b.curveToRelative(0.0f, -1.9f, 0.74f, -3.68f, 2.1f, -4.99f);
        b.curveTo(8.42f, 5.71f, 10.16f, 5.0f, 12.0f, 5.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 7.0f, 0.0f, 19.0f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(8.46f, 12.63f, 4.05f, 0.4f);
        e.lineToRelative(-2.44f, 3.33f);
        e.curveToRelative(-0.11f, 0.16f, -0.1f, 0.38f, 0.04f, 0.52f);
        e.curveToRelative(0.15f, 0.15f, 0.4f, 0.16f, 0.56f, 0.01f);
        e.lineToRelative(5.16f, -4.63f);
        e.curveToRelative(0.33f, -0.3f, 0.15f, -0.85f, -0.3f, -0.89f);
        e.lineToRelative(-4.05f, -0.4f);
        e.lineToRelative(2.44f, -3.33f);
        e.curveToRelative(0.11f, -0.16f, 0.1f, -0.38f, -0.04f, -0.52f);
        e.curveToRelative(-0.15f, -0.15f, -0.4f, -0.16f, -0.56f, -0.01f);
        e.lineToRelative(-5.16f, 4.63f);
        e.curveTo(7.84f, 12.04f, 8.02f, 12.59f, 8.46f, 12.63f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _energySavingsLeaf = build;
        build.getClass();
        return build;
    }
}
