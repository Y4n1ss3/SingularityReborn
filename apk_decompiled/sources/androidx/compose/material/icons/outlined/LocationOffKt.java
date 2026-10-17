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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocationOffKt {
    private static ImageVector _locationOff;

    public static final ImageVector getLocationOff(Icons.Outlined outlined) {
        ImageVector imageVector = _locationOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LocationOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 4.0f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        b.curveToRelative(0.0f, 1.06f, -0.39f, 2.32f, -1.0f, 3.62f);
        b.lineToRelative(1.49f, 1.49f);
        b.curveTo(18.37f, 12.36f, 19.0f, 10.57f, 19.0f, 9.0f);
        b.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        b.curveToRelative(-1.84f, 0.0f, -3.5f, 0.71f, -4.75f, 1.86f);
        b.lineToRelative(1.43f, 1.43f);
        b.curveTo(9.56f, 4.5f, 10.72f, 4.0f, 12.0f, 4.0f);
        b.close();
        b.moveTo(12.0f, 6.5f);
        b.curveToRelative(-0.59f, 0.0f, -1.13f, 0.21f, -1.56f, 0.56f);
        b.lineToRelative(3.5f, 3.5f);
        b.curveToRelative(0.35f, -0.43f, 0.56f, -0.97f, 0.56f, -1.56f);
        b.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        k4.r(b, 3.41f, 2.86f, 2.0f, 4.27f);
        b.lineToRelative(3.18f, 3.18f);
        b.curveTo(5.07f, 7.95f, 5.0f, 8.47f, 5.0f, 9.0f);
        b.curveToRelative(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f);
        b.reflectiveCurveToRelative(1.67f, -1.85f, 3.38f, -4.35f);
        b.lineTo(18.73f, 21.0f);
        gy.B(b, 1.41f, -1.41f, 3.41f, 2.86f);
        b.moveTo(12.0f, 18.88f);
        b.curveToRelative(-2.01f, -2.58f, -4.8f, -6.74f, -4.98f, -9.59f);
        b.lineToRelative(6.92f, 6.92f);
        b.curveToRelative(-0.65f, 0.98f, -1.33f, 1.89f, -1.94f, 2.67f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _locationOff = build;
        build.getClass();
        return build;
    }
}
