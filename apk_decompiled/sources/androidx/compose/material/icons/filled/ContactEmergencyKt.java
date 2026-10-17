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
import defpackage.af0;
import defpackage.fc;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContactEmergencyKt {
    private static ImageVector _contactEmergency;

    public static final ImageVector getContactEmergency(Icons.Filled filled) {
        ImageVector imageVector = _contactEmergency;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ContactEmergency", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(22.0f, 3.0f, 2.0f);
        d.curveTo(0.9f, 3.0f, 0.0f, 3.9f, 0.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(20.0f);
        d.curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        d.lineTo(24.0f, 5.0f);
        d.curveTo(24.0f, 3.9f, 23.1f, 3.0f, 22.0f, 3.0f);
        d.close();
        d.moveTo(9.0f, 8.0f);
        d.curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f);
        d.reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f);
        d.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        d.reflectiveCurveTo(7.35f, 8.0f, 9.0f, 8.0f);
        d.close();
        d.moveTo(2.08f, 19.0f);
        d.curveToRelative(1.38f, -2.39f, 3.96f, -4.0f, 6.92f, -4.0f);
        d.reflectiveCurveToRelative(5.54f, 1.61f, 6.92f, 4.0f);
        k4.w(d, 2.08f, 20.97f, 9.85f);
        d.lineToRelative(-0.75f, 1.3f);
        fc.u(d, -1.47f, -0.85f, 12.0f, -1.5f);
        d.verticalLineToRelative(-1.7f);
        d.lineToRelative(-1.47f, 0.85f);
        d.lineToRelative(-0.75f, -1.3f);
        d.lineTo(16.5f, 9.0f);
        d.lineToRelative(-1.47f, -0.85f);
        d.lineToRelative(0.75f, -1.3f);
        fc.u(d, 1.47f, 0.85f, 6.0f, 1.5f);
        d.verticalLineToRelative(1.7f);
        d.lineToRelative(1.47f, -0.85f);
        d.lineToRelative(0.75f, 1.3f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(d, 19.5f, 9.0f, 20.97f, 9.85f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactEmergency = build;
        build.getClass();
        return build;
    }
}
