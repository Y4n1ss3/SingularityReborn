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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IceSkatingKt {
    private static ImageVector _iceSkating;

    public static final ImageVector getIceSkating(Icons.Rounded rounded) {
        ImageVector imageVector = _iceSkating;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.IceSkating", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.87f, 17.0f);
        b.curveToRelative(-0.47f, 0.0f, -0.85f, 0.34f, -0.98f, 0.8f);
        b.curveTo(20.54f, 19.07f, 19.38f, 20.0f, 18.0f, 20.0f);
        kf0.x(b, -2.0f, -2.0f, 1.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.lineToRelative(0.0f, -0.88f);
        b.curveToRelative(0.0f, -2.1f, -1.55f, -3.53f, -3.03f, -3.88f);
        b.lineToRelative(-2.7f, -0.67f);
        b.curveTo(12.4f, 10.35f, 11.7f, 9.76f, 11.32f, 9.0f);
        b.horizontalLineTo(8.5f);
        b.curveTo(8.22f, 9.0f, 8.0f, 8.78f, 8.0f, 8.5f);
        b.reflectiveCurveTo(8.22f, 8.0f, 8.5f, 8.0f);
        kf0.A(b, 2.52f, 11.0f, 7.0f, 8.5f);
        b.curveTo(8.22f, 7.0f, 8.0f, 6.78f, 8.0f, 6.5f);
        b.curveTo(8.0f, 6.22f, 8.22f, 6.0f, 8.5f, 6.0f);
        b.horizontalLineTo(11.0f);
        b.verticalLineTo(5.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.horizontalLineTo(5.0f);
        b.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        b.verticalLineToRelative(11.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        k4.k(b, 1.0f, 2.0f, 3.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(15.0f);
        b.curveToRelative(2.33f, 0.0f, 4.29f, -1.6f, 4.84f, -3.75f);
        b.curveTo(23.01f, 17.62f, 22.52f, 17.0f, 21.87f, 17.0f);
        uo.q(b, 14.0f, 20.0f, 8.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(b, 6.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _iceSkating = build;
        build.getClass();
        return build;
    }
}
