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
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocationOffKt {
    private static ImageVector _locationOff;

    public static final ImageVector getLocationOff(Icons.Sharp sharp) {
        ImageVector imageVector = _locationOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LocationOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(3.41f, 2.86f, 2.0f, 4.27f);
        i.lineToRelative(3.18f, 3.18f);
        i.curveTo(5.07f, 7.95f, 5.0f, 8.47f, 5.0f, 9.0f);
        i.curveToRelative(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f);
        i.reflectiveCurveToRelative(1.67f, -1.85f, 3.38f, -4.35f);
        i.lineTo(18.73f, 21.0f);
        gy.B(i, 1.41f, -1.41f, 3.41f, 2.86f);
        i.moveTo(12.0f, 2.0f);
        i.curveToRelative(-1.84f, 0.0f, -3.5f, 0.71f, -4.75f, 1.86f);
        i.lineToRelative(3.19f, 3.19f);
        i.curveToRelative(0.43f, -0.34f, 0.97f, -0.55f, 1.56f, -0.55f);
        i.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        i.curveToRelative(0.0f, 0.59f, -0.21f, 1.13f, -0.56f, 1.56f);
        i.lineToRelative(3.55f, 3.55f);
        i.curveTo(18.37f, 12.36f, 19.0f, 10.57f, 19.0f, 9.0f);
        i.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _locationOff = build;
        build.getClass();
        return build;
    }
}
