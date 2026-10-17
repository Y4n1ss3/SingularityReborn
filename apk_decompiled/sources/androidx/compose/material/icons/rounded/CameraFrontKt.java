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
import defpackage.af0;
import defpackage.fc;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CameraFrontKt {
    private static ImageVector _cameraFront;

    public static final ImageVector getCameraFront(Icons.Rounded rounded) {
        ImageVector imageVector = _cameraFront;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CameraFront", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.0f, 0.0f, 7.0f, 0.0f);
        i.curveTo(5.9f, 0.0f, 5.0f, 0.9f, 5.0f, 2.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(10.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(19.0f, 2.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.close();
        i.moveTo(17.0f, 12.5f);
        i.curveToRelative(0.0f, -1.67f, -3.33f, -2.5f, -5.0f, -2.5f);
        i.reflectiveCurveToRelative(-5.0f, 0.83f, -5.0f, 2.5f);
        i.lineTo(7.0f, 3.0f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        i.horizontalLineToRelative(8.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        r6.l(i, 9.5f, 10.85f, 18.85f);
        i.curveToRelative(-0.31f, -0.31f, -0.85f, -0.09f, -0.85f, 0.36f);
        i.lineTo(10.0f, 20.0f);
        i.lineTo(6.0f, 20.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(4.0f);
        i.verticalLineToRelative(0.79f);
        i.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        i.lineToRelative(1.79f, -1.79f);
        i.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        fc.B(i, -1.79f, -1.79f, 18.0f, 20.0f);
        i.horizontalLineToRelative(-3.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(3.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        i.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        i.close();
        i.moveTo(12.0f, 8.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        i.reflectiveCurveToRelative(-1.99f, 0.9f, -1.99f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(i, 10.9f, 8.0f, 12.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cameraFront = build;
        build.getClass();
        return build;
    }
}
