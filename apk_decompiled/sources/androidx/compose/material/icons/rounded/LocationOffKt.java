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
public final class LocationOffKt {
    private static ImageVector _locationOff;

    public static final ImageVector getLocationOff(Icons.Rounded rounded) {
        ImageVector imageVector = _locationOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocationOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(2.71f, 3.56f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(2.47f, 2.47f);
        b.curveTo(5.07f, 7.95f, 5.0f, 8.47f, 5.0f, 9.0f);
        b.curveToRelative(0.0f, 4.17f, 4.42f, 9.92f, 6.23f, 12.11f);
        b.curveToRelative(0.4f, 0.48f, 1.13f, 0.48f, 1.53f, 0.0f);
        b.curveToRelative(0.65f, -0.78f, 1.62f, -2.01f, 2.61f, -3.46f);
        b.lineToRelative(2.65f, 2.65f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.lineTo(4.12f, 3.56f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.close();
        b.moveTo(12.0f, 2.0f);
        b.curveToRelative(-1.84f, 0.0f, -3.5f, 0.71f, -4.75f, 1.86f);
        b.lineToRelative(3.19f, 3.19f);
        b.curveToRelative(0.43f, -0.34f, 0.97f, -0.55f, 1.56f, -0.55f);
        b.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        b.curveToRelative(0.0f, 0.59f, -0.21f, 1.13f, -0.56f, 1.56f);
        b.lineToRelative(3.55f, 3.55f);
        b.curveTo(18.37f, 12.36f, 19.0f, 10.57f, 19.0f, 9.0f);
        b.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _locationOff = build;
        build.getClass();
        return build;
    }
}
