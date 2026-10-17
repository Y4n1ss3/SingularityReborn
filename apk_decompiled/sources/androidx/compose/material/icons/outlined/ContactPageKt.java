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
import defpackage.fc;
import defpackage.j50;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContactPageKt {
    private static ImageVector _contactPage;

    public static final ImageVector getContactPage(Icons.Outlined outlined) {
        ImageVector imageVector = _contactPage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ContactPage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder u = kp0.u(13.17f, 4.0f, 18.0f, 8.83f, 20.0f);
        fc.q(u, 6.0f, 4.0f, 13.17f);
        u.moveTo(14.0f, 2.0f);
        u.horizontalLineTo(6.0f);
        u.curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f);
        u.verticalLineToRelative(16.0f);
        u.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        u.horizontalLineToRelative(12.0f);
        u.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        u.verticalLineTo(8.0f);
        r6.C(u, 14.0f, 2.0f, 14.0f, 2.0f);
        u.moveTo(12.0f, 14.0f);
        u.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        u.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        u.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        u.curveTo(10.0f, 13.1f, 10.9f, 14.0f, 12.0f, 14.0f);
        u.close();
        u.moveTo(16.0f, 17.43f);
        u.curveToRelative(0.0f, -0.81f, -0.48f, -1.53f, -1.22f, -1.85f);
        u.curveTo(13.93f, 15.21f, 12.99f, 15.0f, 12.0f, 15.0f);
        u.curveToRelative(-0.99f, 0.0f, -1.93f, 0.21f, -2.78f, 0.58f);
        u.curveTo(8.48f, 15.9f, 8.0f, 16.62f, 8.0f, 17.43f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.r(u, 18.0f, 8.0f, 17.43f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactPage = build;
        build.getClass();
        return build;
    }
}
