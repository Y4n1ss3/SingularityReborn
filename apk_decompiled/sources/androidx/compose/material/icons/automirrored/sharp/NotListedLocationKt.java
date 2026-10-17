package androidx.compose.material.icons.automirrored.sharp;

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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NotListedLocationKt {
    private static ImageVector _notListedLocation;

    public static final ImageVector getNotListedLocation(Icons.AutoMirrored.Sharp sharp) {
        ImageVector imageVector = _notListedLocation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Sharp.NotListedLocation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.01f, 16.0f);
        b.arcToRelative(0.99f, 0.99f, 0.0f, false, false, 1.0f, -1.0f);
        b.arcToRelative(0.99f, 0.99f, 0.0f, false, false, -1.0f, -1.0f);
        b.curveToRelative(-0.28f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f);
        b.curveToRelative(-0.2f, 0.19f, -0.3f, 0.43f, -0.3f, 0.7f);
        b.reflectiveCurveToRelative(0.1f, 0.51f, 0.29f, 0.71f);
        b.curveToRelative(0.2f, 0.2f, 0.44f, 0.3f, 0.72f, 0.3f);
        k4.r(b, 11.13f, 12.34f, 11.13f, 13.0f);
        b.horizontalLineToRelative(1.85f);
        b.verticalLineToRelative(-0.42f);
        b.curveToRelative(0.0f, -0.33f, 0.06f, -0.6f, 0.18f, -0.81f);
        b.curveToRelative(0.12f, -0.21f, 0.33f, -0.47f, 0.65f, -0.77f);
        b.curveToRelative(0.4f, -0.38f, 0.68f, -0.75f, 0.89f, -1.09f);
        b.curveToRelative(0.19f, -0.35f, 0.3f, -0.76f, 0.3f, -1.25f);
        b.reflectiveCurveToRelative(-0.13f, -0.94f, -0.39f, -1.35f);
        b.arcToRelative(2.57f, 2.57f, 0.0f, false, false, -1.05f, -0.96f);
        b.curveTo(13.11f, 6.12f, 12.58f, 6.0f, 12.0f, 6.0f);
        b.curveToRelative(-0.78f, 0.0f, -1.51f, 0.32f, -2.03f, 0.79f);
        b.curveTo(9.46f, 7.27f, 9.0f, 7.99f, 9.0f, 9.0f);
        b.horizontalLineToRelative(1.68f);
        b.curveToRelative(0.0f, -0.52f, 0.19f, -0.77f, 0.4f, -0.98f);
        b.curveToRelative(0.21f, -0.2f, 0.58f, -0.3f, 0.96f, -0.3f);
        b.curveToRelative(0.35f, 0.0f, 0.64f, 0.1f, 0.85f, 0.3f);
        b.curveToRelative(0.21f, 0.2f, 0.32f, 0.45f, 0.32f, 0.74f);
        b.curveToRelative(0.0f, 0.24f, -0.06f, 0.46f, -0.19f, 0.64f);
        b.curveToRelative(-0.13f, 0.19f, -0.33f, 0.41f, -0.61f, 0.66f);
        b.curveToRelative(-0.48f, 0.42f, -0.81f, 0.79f, -1.0f, 1.12f);
        b.curveToRelative(-0.19f, 0.33f, -0.28f, 0.71f, -0.28f, 1.16f);
        b.close();
        b.moveTo(12.0f, 2.0f);
        b.curveToRelative(4.2f, 0.0f, 8.0f, 3.22f, 8.0f, 8.2f);
        b.curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f);
        b.curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f);
        b.curveTo(4.0f, 5.22f, 7.8f, 2.0f, 12.0f, 2.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notListedLocation = build;
        build.getClass();
        return build;
    }
}
