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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EmergencyShareKt {
    private static ImageVector _emergencyShare;

    public static final ImageVector getEmergencyShare(Icons.Sharp sharp) {
        ImageVector imageVector = _emergencyShare;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.EmergencyShare", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 9.0f);
        b.curveToRelative(-3.15f, 0.0f, -6.0f, 2.41f, -6.0f, 6.15f);
        b.curveToRelative(0.0f, 2.49f, 2.0f, 5.44f, 6.0f, 8.85f);
        b.curveToRelative(4.0f, -3.41f, 6.0f, -6.36f, 6.0f, -8.85f);
        b.curveTo(18.0f, 11.41f, 15.15f, 9.0f, 12.0f, 9.0f);
        b.close();
        b.moveTo(12.0f, 16.5f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(12.83f, 16.5f, 12.0f, 16.5f);
        b.close();
        b.moveTo(12.0f, 4.0f);
        b.curveToRelative(1.93f, 0.0f, 3.68f, 0.78f, 4.95f, 2.05f);
        b.lineToRelative(-1.41f, 1.41f);
        b.curveTo(14.63f, 6.56f, 13.38f, 6.0f, 12.0f, 6.0f);
        b.reflectiveCurveTo(9.37f, 6.56f, 8.46f, 7.46f);
        b.lineTo(7.05f, 6.05f);
        b.curveTo(8.32f, 4.78f, 10.07f, 4.0f, 12.0f, 4.0f);
        k4.x(b, 19.78f, 3.23f, -1.41f, 1.41f);
        b.curveTo(16.74f, 3.01f, 14.49f, 2.0f, 12.01f, 2.0f);
        b.reflectiveCurveTo(7.27f, 3.01f, 5.64f, 4.63f);
        b.lineTo(4.22f, 3.22f);
        b.curveTo(6.22f, 1.23f, 8.97f, 0.0f, 12.01f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 17.79f, 1.23f, 19.78f, 3.23f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emergencyShare = build;
        build.getClass();
        return build;
    }
}
