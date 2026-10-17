package androidx.compose.material.icons.rounded;

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
public final class IcecreamKt {
    private static ImageVector _icecream;

    public static final ImageVector getIcecream(Icons.Rounded rounded) {
        ImageVector imageVector = _icecream;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Icecream", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.38f, 6.24f);
        b.curveTo(17.79f, 3.24f, 15.14f, 1.0f, 12.0f, 1.0f);
        b.reflectiveCurveTo(6.21f, 3.24f, 5.62f, 6.24f);
        b.curveTo(4.08f, 6.81f, 3.0f, 8.29f, 3.0f, 10.0f);
        b.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        b.curveToRelative(0.12f, 0.0f, 0.23f, -0.02f, 0.34f, -0.02f);
        b.lineToRelative(3.83f, 7.31f);
        b.curveToRelative(0.38f, 0.72f, 1.41f, 0.71f, 1.78f, -0.01f);
        b.lineToRelative(3.73f, -7.31f);
        b.curveTo(16.79f, 13.98f, 16.89f, 14.0f, 17.0f, 14.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b.curveTo(21.0f, 8.29f, 19.92f, 6.81f, 18.38f, 6.24f);
        k4.x(b, 12.05f, 18.63f, -2.73f, -5.21f);
        b.curveTo(10.15f, 13.79f, 11.06f, 14.0f, 12.0f, 14.0f);
        b.curveToRelative(0.95f, 0.0f, 1.88f, -0.21f, 2.72f, -0.6f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 12.05f, 18.63f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _icecream = build;
        build.getClass();
        return build;
    }
}
