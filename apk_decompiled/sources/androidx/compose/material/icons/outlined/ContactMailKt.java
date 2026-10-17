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
import defpackage.af0;
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContactMailKt {
    private static ImageVector _contactMail;

    public static final ImageVector getContactMail(Icons.Outlined outlined) {
        ImageVector imageVector = _contactMail;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ContactMail", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(22.0f, 3.0f, 2.0f, 3.0f);
        i.curveTo(0.9f, 3.0f, 0.0f, 3.9f, 0.0f, 5.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(20.0f);
        i.curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        i.lineTo(24.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(i, 22.0f, 19.0f, 2.0f, 19.0f);
        r6.m(i, 2.0f, 5.0f, 20.0f, 14.0f);
        k4.C(i, 21.0f, 6.0f, -7.0f, 5.0f);
        gy.n(i, 7.0f, 21.0f, 6.0f);
        i.moveTo(20.0f, 8.0f);
        i.lineToRelative(-2.5f, 1.75f);
        i.lineTo(15.0f, 8.0f);
        i.lineTo(15.0f, 7.0f);
        i.lineToRelative(2.5f, 1.75f);
        bv.r(i, 20.0f, 7.0f, 1.0f);
        i.moveTo(9.0f, 12.0f);
        i.curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f);
        i.reflectiveCurveToRelative(-1.35f, -3.0f, -3.0f, -3.0f);
        i.reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f);
        i.reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f);
        i.close();
        i.moveTo(9.0f, 8.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        i.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        i.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        i.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        i.close();
        i.moveTo(15.0f, 16.59f);
        i.curveToRelative(0.0f, -2.5f, -3.97f, -3.58f, -6.0f, -3.58f);
        i.reflectiveCurveToRelative(-6.0f, 1.08f, -6.0f, 3.58f);
        r6.m(i, 3.0f, 18.0f, 12.0f, -1.41f);
        i.moveTo(5.48f, 16.0f);
        i.curveToRelative(0.74f, -0.5f, 2.22f, -1.0f, 3.52f, -1.0f);
        i.reflectiveCurveToRelative(2.77f, 0.49f, 3.52f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 5.48f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactMail = build;
        build.getClass();
        return build;
    }
}
