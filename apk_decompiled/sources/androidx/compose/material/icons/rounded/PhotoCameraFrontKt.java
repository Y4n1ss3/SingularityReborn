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
import defpackage.fc;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhotoCameraFrontKt {
    private static ImageVector _photoCameraFront;

    public static final ImageVector getPhotoCameraFront(Icons.Rounded rounded) {
        ImageVector imageVector = _photoCameraFront;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PhotoCameraFront", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(20.0f, 5.0f, -3.17f, -1.24f, -1.35f);
        i.curveTo(15.22f, 3.24f, 14.68f, 3.0f, 14.12f, 3.0f);
        i.horizontalLineTo(9.88f);
        i.curveTo(9.32f, 3.0f, 8.78f, 3.24f, 8.41f, 3.65f);
        i.lineTo(7.17f, 5.0f);
        i.horizontalLineTo(4.0f);
        i.curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.verticalLineTo(7.0f);
        i.curveTo(22.0f, 5.9f, 21.1f, 5.0f, 20.0f, 5.0f);
        i.close();
        i.moveTo(12.0f, 9.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        i.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        i.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        i.curveTo(10.0f, 9.9f, 10.9f, 9.0f, 12.0f, 9.0f);
        uo.q(i, 16.0f, 17.0f, 8.0f, -0.57f);
        i.curveToRelative(0.0f, -0.81f, 0.48f, -1.53f, 1.22f, -1.85f);
        i.curveTo(10.07f, 14.21f, 11.01f, 14.0f, 12.0f, 14.0f);
        i.reflectiveCurveToRelative(1.93f, 0.21f, 2.78f, 0.58f);
        i.curveTo(15.52f, 14.9f, 16.0f, 15.62f, 16.0f, 16.43f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(i, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _photoCameraFront = build;
        build.getClass();
        return build;
    }
}
