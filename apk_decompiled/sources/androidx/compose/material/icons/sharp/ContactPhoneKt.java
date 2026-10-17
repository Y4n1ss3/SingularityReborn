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
import defpackage.bv;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContactPhoneKt {
    private static ImageVector _contactPhone;

    public static final ImageVector getContactPhone(Icons.Sharp sharp) {
        ImageVector imageVector = _contactPhone;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ContactPhone", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(23.99f, 3.0f, 0.0f, 3.0f, 18.0f);
        uo.w(s, 24.0f, -0.01f, -18.0f);
        s.moveTo(8.0f, 6.0f);
        s.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        s.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        s.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        s.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        k4.r(s, 14.0f, 18.0f, 2.0f, 18.0f);
        s.verticalLineToRelative(-1.0f);
        s.curveToRelative(0.0f, -2.0f, 4.0f, -3.1f, 6.0f, -3.1f);
        s.reflectiveCurveToRelative(6.0f, 1.1f, 6.0f, 3.1f);
        bv.m(s, 1.0f, 17.85f, 14.0f, 1.64f);
        s.lineTo(21.0f, 16.0f);
        s.lineToRelative(-1.99f, 1.99f);
        s.curveToRelative(-1.31f, -0.98f, -2.28f, -2.38f, -2.73f, -3.99f);
        s.curveToRelative(-0.18f, -0.64f, -0.28f, -1.31f, -0.28f, -2.0f);
        s.reflectiveCurveToRelative(0.1f, -1.36f, 0.28f, -2.0f);
        s.curveToRelative(0.45f, -1.62f, 1.42f, -3.01f, 2.73f, -3.99f);
        s.lineTo(21.0f, 8.0f);
        s.lineToRelative(-1.51f, 2.0f);
        s.horizontalLineToRelative(-1.64f);
        s.curveToRelative(-0.22f, 0.63f, -0.35f, 1.3f, -0.35f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(s, 0.13f, 1.37f, 0.35f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactPhone = build;
        build.getClass();
        return build;
    }
}
