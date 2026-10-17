package androidx.compose.material.icons.filled;

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
import defpackage.fc;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SmokingRoomsKt {
    private static ImageVector _smokingRooms;

    public static final ImageVector getSmokingRooms(Icons.Filled filled) {
        ImageVector imageVector = _smokingRooms;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SmokingRooms", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(2.0f, 16.0f, 15.0f, 3.0f);
        uo.l(b, 2.0f, 19.0f, 20.5f, 16.0f);
        kp0.x(b, 22.0f, 16.0f, 3.0f, -1.5f);
        k4.C(b, 18.0f, 16.0f, 1.5f, 3.0f);
        uo.l(b, 18.0f, 19.0f, 18.85f, 7.73f);
        b.curveToRelative(0.62f, -0.61f, 1.0f, -1.45f, 1.0f, -2.38f);
        b.curveTo(19.85f, 3.5f, 18.35f, 2.0f, 16.5f, 2.0f);
        b.verticalLineToRelative(1.5f);
        b.curveToRelative(1.02f, 0.0f, 1.85f, 0.83f, 1.85f, 1.85f);
        b.reflectiveCurveTo(17.52f, 7.2f, 16.5f, 7.2f);
        b.verticalLineToRelative(1.5f);
        b.curveToRelative(2.24f, 0.0f, 4.0f, 1.83f, 4.0f, 4.07f);
        b.lineTo(20.5f, 15.0f);
        b.lineTo(22.0f, 15.0f);
        b.verticalLineToRelative(-2.24f);
        b.curveToRelative(0.0f, -2.22f, -1.28f, -4.14f, -3.15f, -5.03f);
        k4.r(b, 16.03f, 10.2f, 14.5f, 10.2f);
        b.curveToRelative(-1.02f, 0.0f, -1.85f, -0.98f, -1.85f, -2.0f);
        b.reflectiveCurveToRelative(0.83f, -1.75f, 1.85f, -1.75f);
        b.verticalLineToRelative(-1.5f);
        b.curveToRelative(-1.85f, 0.0f, -3.35f, 1.5f, -3.35f, 3.35f);
        b.reflectiveCurveToRelative(1.5f, 3.35f, 3.35f, 3.35f);
        b.horizontalLineToRelative(1.53f);
        b.curveToRelative(1.05f, 0.0f, 1.97f, 0.74f, 1.97f, 2.05f);
        fc.w(b, 18.0f, 15.0f, 1.5f, -1.64f);
        b.curveToRelative(0.0f, -1.81f, -1.6f, -3.16f, -3.47f, -3.16f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _smokingRooms = build;
        build.getClass();
        return build;
    }
}
