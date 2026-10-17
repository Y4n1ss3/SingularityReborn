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
import defpackage.af0;
import defpackage.c21;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DirectionsRailwayFilledKt {
    private static ImageVector _directionsRailwayFilled;

    public static final ImageVector getDirectionsRailwayFilled(Icons.Outlined outlined) {
        ImageVector imageVector = _directionsRailwayFilled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DirectionsRailwayFilled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(8.0f, 2.0f, 4.0f, 2.5f, 4.0f, 6.0f);
        b.verticalLineToRelative(9.5f);
        b.curveTo(4.0f, 17.43f, 5.57f, 19.0f, 7.5f, 19.0f);
        af0.m(b, 6.0f, 20.0f, 1.0f, 12.0f);
        b.verticalLineToRelative(-1.0f);
        b.lineToRelative(-1.5f, -1.0f);
        b.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        b.verticalLineTo(6.0f);
        b.curveTo(20.0f, 2.5f, 16.42f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(12.0f, 4.0f);
        b.curveToRelative(3.71f, 0.0f, 5.13f, 0.46f, 5.67f, 1.0f);
        b.horizontalLineTo(6.43f);
        b.curveTo(7.03f, 4.48f, 8.48f, 4.0f, 12.0f, 4.0f);
        b.close();
        b.moveTo(18.0f, 15.5f);
        b.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        b.horizontalLineToRelative(-9.0f);
        b.curveTo(6.67f, 17.0f, 6.0f, 16.33f, 6.0f, 15.5f);
        c21.c(b, 12.0f, 12.0f, 15.5f);
        uo.p(b, 18.0f, 10.0f, 6.0f, 7.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(b, 12.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = af0.b(12.0f, 14.5f, -1.5f, 0.0f);
        b2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        b2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsRailwayFilled = build;
        build.getClass();
        return build;
    }
}
