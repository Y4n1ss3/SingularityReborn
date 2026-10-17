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
import defpackage.bv;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContactPhoneKt {
    private static ImageVector _contactPhone;

    public static final ImageVector getContactPhone(Icons.Rounded rounded) {
        ImageVector imageVector = _contactPhone;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ContactPhone", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        i.close();
        i.moveTo(8.0f, 6.0f);
        i.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        i.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        i.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        i.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        k4.r(i, 14.0f, 18.0f, 2.0f, 18.0f);
        i.verticalLineToRelative(-1.0f);
        i.curveToRelative(0.0f, -2.0f, 4.0f, -3.1f, 6.0f, -3.1f);
        i.reflectiveCurveToRelative(6.0f, 1.1f, 6.0f, 3.1f);
        bv.m(i, 1.0f, 17.85f, 14.0f, 1.39f);
        i.curveToRelative(0.16f, 0.0f, 0.3f, 0.07f, 0.4f, 0.2f);
        i.lineToRelative(1.1f, 1.45f);
        i.curveToRelative(0.15f, 0.2f, 0.13f, 0.48f, -0.05f, 0.65f);
        i.lineToRelative(-1.36f, 1.36f);
        i.curveToRelative(-0.18f, 0.18f, -0.48f, 0.2f, -0.67f, 0.04f);
        i.curveToRelative(-1.13f, -0.96f, -1.97f, -2.25f, -2.38f, -3.71f);
        i.curveToRelative(-0.18f, -0.63f, -0.28f, -1.3f, -0.28f, -1.99f);
        i.reflectiveCurveToRelative(0.1f, -1.36f, 0.28f, -2.0f);
        i.curveToRelative(0.41f, -1.47f, 1.25f, -2.75f, 2.38f, -3.71f);
        i.curveToRelative(0.2f, -0.17f, 0.49f, -0.14f, 0.67f, 0.04f);
        i.lineToRelative(1.36f, 1.36f);
        i.curveToRelative(0.18f, 0.18f, 0.2f, 0.46f, 0.05f, 0.65f);
        i.lineToRelative(-1.1f, 1.45f);
        i.curveToRelative(-0.09f, 0.13f, -0.24f, 0.2f, -0.4f, 0.2f);
        i.horizontalLineToRelative(-1.39f);
        i.curveToRelative(-0.22f, 0.63f, -0.35f, 1.3f, -0.35f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, 0.13f, 1.38f, 0.35f, 2.01f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactPhone = build;
        build.getClass();
        return build;
    }
}
