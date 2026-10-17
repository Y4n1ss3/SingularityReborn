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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OtherHousesKt {
    private static ImageVector _otherHouses;

    public static final ImageVector getOtherHouses(Icons.Rounded rounded) {
        ImageVector imageVector = _otherHouses;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.OtherHouses", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(1.61f, 12.19f);
        b.curveToRelative(0.34f, 0.44f, 0.96f, 0.52f, 1.4f, 0.19f);
        b.lineTo(4.0f, 11.62f);
        b.verticalLineTo(20.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(14.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-8.38f);
        b.lineToRelative(0.99f, 0.76f);
        b.curveToRelative(0.44f, 0.34f, 1.07f, 0.25f, 1.4f, -0.19f);
        b.curveToRelative(0.34f, -0.44f, 0.25f, -1.07f, -0.19f, -1.4f);
        b.lineToRelative(-9.6f, -7.33f);
        b.curveToRelative(-0.36f, -0.27f, -0.86f, -0.27f, -1.21f, 0.0f);
        b.lineToRelative(-9.6f, 7.33f);
        b.curveTo(1.36f, 11.13f, 1.27f, 11.76f, 1.61f, 12.19f);
        b.close();
        b.moveTo(8.0f, 15.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b.curveTo(9.0f, 14.55f, 8.55f, 15.0f, 8.0f, 15.0f);
        b.close();
        b.moveTo(12.0f, 15.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b.curveTo(13.0f, 14.55f, 12.55f, 15.0f, 12.0f, 15.0f);
        b.close();
        b.moveTo(16.0f, 15.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b.curveTo(17.0f, 14.55f, 16.55f, 15.0f, 16.0f, 15.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _otherHouses = build;
        build.getClass();
        return build;
    }
}
