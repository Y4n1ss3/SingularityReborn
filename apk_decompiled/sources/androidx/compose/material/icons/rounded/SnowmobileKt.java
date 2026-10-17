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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnowmobileKt {
    private static ImageVector _snowmobile;

    public static final ImageVector getSnowmobile(Icons.Rounded rounded) {
        ImageVector imageVector = _snowmobile;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Snowmobile", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.0f, 6.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(1.25f);
        b.lineToRelative(1.45f, 1.3f);
        b.lineTo(11.0f, 11.0f);
        b.lineToRelative(-9.12f, -0.96f);
        b.curveTo(0.88f, 9.93f, 0.0f, 10.72f, 0.0f, 11.73f);
        b.curveToRelative(0.0f, 0.75f, 0.49f, 1.41f, 1.21f, 1.63f);
        b.lineToRelative(3.33f, 1.0f);
        b.lineToRelative(-3.49f, 1.88f);
        b.curveTo(-0.77f, 17.22f, -0.07f, 20.0f, 2.0f, 20.0f);
        b.horizontalLineToRelative(6.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        kf0.B(b, 4.0f, 2.0f, 2.0f, -2.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(5.0f);
        b.curveToRelative(1.13f, 0.0f, 2.11f, -0.62f, 2.63f, -1.55f);
        b.curveToRelative(0.36f, -0.65f, -0.15f, -1.45f, -0.9f, -1.45f);
        b.curveToRelative(-0.34f, 0.0f, -0.68f, 0.16f, -0.84f, 0.47f);
        b.curveTo(21.72f, 17.78f, 21.38f, 18.0f, 21.0f, 18.0f);
        b.horizontalLineToRelative(-0.17f);
        b.lineToRelative(-2.2f, -2.2f);
        b.curveTo(20.58f, 15.37f, 22.0f, 14.4f, 22.0f, 13.0f);
        b.curveToRelative(0.0f, -0.89f, -7.72f, -7.75f, -7.72f, -7.75f);
        b.curveTo(14.1f, 5.09f, 13.87f, 5.0f, 13.62f, 5.0f);
        b.horizontalLineTo(12.0f);
        b.curveTo(11.45f, 5.0f, 11.0f, 5.45f, 11.0f, 6.0f);
        r6.g(b, 8.0f, 18.0f, 2.0f);
        b.lineToRelative(5.25f, -2.83f);
        b.lineTo(10.0f, 16.0f);
        b.curveTo(10.0f, 17.1f, 9.11f, 18.0f, 8.0f, 18.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _snowmobile = build;
        build.getClass();
        return build;
    }
}
