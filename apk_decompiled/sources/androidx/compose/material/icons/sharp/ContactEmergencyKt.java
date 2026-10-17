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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContactEmergencyKt {
    private static ImageVector _contactEmergency;

    public static final ImageVector getContactEmergency(Icons.Sharp sharp) {
        ImageVector imageVector = _contactEmergency;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ContactEmergency", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(23.99f, 3.0f, 0.0f, 18.0f, 23.99f);
        bv.t(i, 3.0f, 9.0f, 8.0f);
        i.curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f);
        i.reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f);
        i.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        i.reflectiveCurveTo(7.35f, 8.0f, 9.0f, 8.0f);
        i.close();
        i.moveTo(2.08f, 19.0f);
        i.curveToRelative(1.38f, -2.39f, 3.96f, -4.0f, 6.92f, -4.0f);
        i.reflectiveCurveToRelative(5.54f, 1.61f, 6.92f, 4.0f);
        k4.w(i, 2.08f, 20.97f, 9.85f);
        i.lineToRelative(-0.75f, 1.3f);
        fc.u(i, -1.47f, -0.85f, 12.0f, -1.5f);
        i.verticalLineToRelative(-1.7f);
        i.lineToRelative(-1.47f, 0.85f);
        i.lineToRelative(-0.75f, -1.3f);
        i.lineTo(16.5f, 9.0f);
        i.lineToRelative(-1.47f, -0.85f);
        i.lineToRelative(0.75f, -1.3f);
        fc.u(i, 1.47f, 0.85f, 6.0f, 1.5f);
        i.verticalLineToRelative(1.7f);
        i.lineToRelative(1.47f, -0.85f);
        i.lineToRelative(0.75f, 1.3f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 19.5f, 9.0f, 20.97f, 9.85f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactEmergency = build;
        build.getClass();
        return build;
    }
}
