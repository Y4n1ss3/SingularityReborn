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
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FireExtinguisherKt {
    private static ImageVector _fireExtinguisher;

    public static final ImageVector getFireExtinguisher(Icons.Rounded rounded) {
        ImageVector imageVector = _fireExtinguisher;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FireExtinguisher", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(7.0f, 19.0f, 10.0f, 1.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.horizontalLineTo(9.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        k4.D(b, 19.0f, 7.0f, 18.0f, 10.0f);
        gy.s(b, -5.0f, 7.0f, 18.0f);
        b.moveTo(17.0f, 4.23f);
        b.verticalLineToRelative(3.54f);
        b.curveToRelative(0.0f, 0.63f, -0.58f, 1.11f, -1.21f, 0.98f);
        b.lineToRelative(-1.94f, -0.41f);
        b.curveToRelative(0.0f, 0.02f, 0.0f, 0.01f, -0.01f, 0.03f);
        b.curveToRelative(1.54f, 0.62f, 2.71f, 1.98f, 3.06f, 3.63f);
        b.horizontalLineTo(7.1f);
        b.curveToRelative(0.34f, -1.66f, 1.52f, -3.02f, 3.07f, -3.64f);
        b.curveToRelative(-0.33f, -0.26f, -0.6f, -0.58f, -0.8f, -0.95f);
        b.lineTo(5.49f, 6.6f);
        b.curveTo(5.2f, 6.54f, 5.0f, 6.29f, 5.0f, 6.0f);
        b.verticalLineToRelative(0.0f);
        b.curveToRelative(0.0f, -0.29f, 0.2f, -0.54f, 0.49f, -0.6f);
        b.lineToRelative(3.88f, -0.81f);
        b.curveTo(9.87f, 3.65f, 10.86f, 3.0f, 12.0f, 3.0f);
        b.curveToRelative(0.7f, 0.0f, 1.34f, 0.25f, 1.85f, 0.66f);
        b.lineToRelative(1.94f, -0.41f);
        b.curveTo(16.42f, 3.12f, 17.0f, 3.6f, 17.0f, 4.23f);
        b.close();
        b.moveTo(13.0f, 6.0f);
        b.curveToRelative(-0.03f, -0.59f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 13.0f, 6.55f, 13.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fireExtinguisher = build;
        build.getClass();
        return build;
    }
}
