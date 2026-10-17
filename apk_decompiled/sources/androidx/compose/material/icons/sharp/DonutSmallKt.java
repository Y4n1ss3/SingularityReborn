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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DonutSmallKt {
    private static ImageVector _donutSmall;

    public static final ImageVector getDonutSmall(Icons.Sharp sharp) {
        ImageVector imageVector = _donutSmall;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DonutSmall", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.0f, 9.18f);
        b.curveToRelative(0.85f, 0.3f, 1.51f, 0.97f, 1.82f, 1.82f);
        b.horizontalLineToRelative(7.13f);
        b.curveToRelative(-0.47f, -4.72f, -4.23f, -8.48f, -8.95f, -8.95f);
        r6.l(b, 7.13f, 11.0f, 14.82f);
        b.curveTo(9.84f, 14.4f, 9.0f, 13.3f, 9.0f, 12.0f);
        b.curveToRelative(0.0f, -1.3f, 0.84f, -2.4f, 2.0f, -2.82f);
        b.lineTo(11.0f, 2.05f);
        b.curveToRelative(-5.05f, 0.5f, -9.0f, 4.76f, -9.0f, 9.95f);
        b.curveToRelative(0.0f, 5.19f, 3.95f, 9.45f, 9.0f, 9.95f);
        r6.l(b, -7.13f, 14.82f, 13.0f);
        b.curveToRelative(-0.3f, 0.85f, -0.97f, 1.51f, -1.82f, 1.82f);
        b.verticalLineToRelative(7.13f);
        b.curveToRelative(4.72f, -0.47f, 8.48f, -4.23f, 8.95f, -8.95f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(b, -7.13f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _donutSmall = build;
        build.getClass();
        return build;
    }
}
